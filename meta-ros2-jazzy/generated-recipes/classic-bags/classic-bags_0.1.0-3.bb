# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "A ROS 2 interface in the style of ROS 1 for reading and writing bag files"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD 3-clause"
LICENSE = "BSD-3-clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=79773b05553c027a06a89128fefb052f"

ROS_CN = "classic_bags"
ROS_BPN = "classic_bags"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    rclcpp \
    rclpy \
    rosbag2-cpp \
    rosbag2-py \
    rosbag2-storage \
    rosidl-runtime-py \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
    rclcpp \
    rclpy \
    rosbag2-cpp \
    rosbag2-py \
    rosbag2-storage \
    rosidl-runtime-py \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    rclcpp \
    rclpy \
    rosbag2-cpp \
    rosbag2-py \
    rosbag2-storage \
    rosidl-runtime-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    std-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/classic_bags-release/archive/release/jazzy/classic_bags/0.1.0-3.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/classic_bags"
SRC_URI = "git://github.com/ros2-gbp/classic_bags-release;${ROS_BRANCH};protocol=https"
SRCREV = "ca3d3002a3a85a41e18d51b759baf92321df1d41"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}