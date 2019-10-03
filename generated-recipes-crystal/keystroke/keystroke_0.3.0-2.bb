# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Capture keyboard input from the local computer and publish it to ROS"
AUTHOR = "Dan Rose <dan@digilabs.io>"
ROS_AUTHOR = "Rover Robotics <info@roverrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=19a28aa894d84513b15cf3f44c437682"

ROS_CN = "keystroke"
ROS_BPN = "keystroke"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    launch \
    launch-ros \
    rclpy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/RoverRobotics/ros2-keystroke-release/archive/release/crystal/keystroke/0.3.0-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "01a3288a33d62084b34bd75b8c6ff376"
SRC_URI[sha256sum] = "7f8f328829b31d38c84025fc2e56eaa55c6e194ee25bcb9b8487fcc67fd19cc1"
S = "${WORKDIR}/ros2-keystroke-release-release-crystal-keystroke-0.3.0-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('keystroke', d)}"
ROS_BUILD_TYPE = "ament_python"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('keystroke', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/keystroke/keystroke_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/keystroke/keystroke-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/keystroke/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/keystroke/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
