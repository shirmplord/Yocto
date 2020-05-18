# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=0636e73ff0215e8d672dc4c32c317bb3"

SRC_URI = "git://github.com/10sr/ctris;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "4bb7092f66b147fd366c85ea0de2f88ee332f024"

S = "${WORKDIR}/git"

RDEPENDS_${PN}+="ncurses"
DEPENDS+="ncurses"
TARGET_CC_ARCH+="${LDFLAGS}"
EXTRA_OEMAKE+="-e"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_install () {
	install -d ${D}${bindir}
	install -m 0755 ctris ${D}${bindir}
}

