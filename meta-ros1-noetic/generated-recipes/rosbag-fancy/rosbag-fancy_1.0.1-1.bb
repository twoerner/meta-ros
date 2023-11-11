# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "rosbag with terminal UI"
AUTHOR = "Max Schwarz <max.schwarz@uni-bonn.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=75730354549103aaba72b66caf53717b"

ROS_CN = "rosbag_fancy"
ROS_BPN = "rosbag_fancy"

ROS_BUILD_DEPENDS = " \
    boost \
    bzip2 \
    ncurses \
    rosbag-fancy-msgs \
    rosbag-storage \
    roscpp \
    rosfmt \
    roslz4 \
    std-srvs \
    tf2-ros \
    topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    bzip2 \
    ncurses \
    rosbag-fancy-msgs \
    rosbag-storage \
    roscpp \
    rosfmt \
    roslz4 \
    std-srvs \
    tf2-ros \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    bzip2 \
    ncurses \
    rosbag-fancy-msgs \
    rosbag-storage \
    roscpp \
    rosfmt \
    roslz4 \
    std-srvs \
    tf2-ros \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/xqms/rosbag_fancy-release/archive/release/noetic/rosbag_fancy/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rosbag_fancy"
SRC_URI = "git://github.com/xqms/rosbag_fancy-release;${ROS_BRANCH};protocol=https"
SRCREV = "f9d9a89548e37886aaf5fd97dc72b5032515b863"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}