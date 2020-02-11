# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Extensions for slime to assist in working with ROS packages"
AUTHOR = "Gayane Kazhoyan <kazhoyan@cs.uni-bremen.de>"
ROS_AUTHOR = "Bhaskara Marthi"
HOMEPAGE = "https://github.com/code-iai/ros_emacs_utils"
SECTION = "devel"
LICENSE = "public_domain"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=c60c465e235b13ecfc23607d3b1b9e2f"

ROS_CN = "ros_emacs_utils"
ROS_BPN = "slime_ros"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_sbcl} \
    rosemacs \
    roslisp \
    slime-wrapper \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_sbcl} \
    rosemacs \
    roslisp \
    slime-wrapper \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/melodic/slime_ros/0.4.13-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/slime_ros"
SRC_URI = "git://github.com/code-iai-release/ros_emacs_utils-release;${ROS_BRANCH};protocol=https"
SRCREV = "29afe280ae99d36c84bea3b572a9a98a0f472588"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
