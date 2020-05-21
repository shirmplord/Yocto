SUMMARY = "MUSB"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

INITSCRIPT_NAME = "musb"
INITSCRIPT_PARAMS = "defaults"
INITSCRIPT_PACKAGES = " musb"

SRC_URI = "	file:///home/student/work/material/musb.sh \
		file:///home/student/work/material/fat.fs \
		"
inherit autotools update-rc.d

S = "${WORKDIR}"

do_compile () {
	:
}

do_install () {
	install -d ${D}${sysconfdir}
	install -d ${D}${sysconfdir}/init.d/
	install -m 0755 ${S}/fat.fs ${D}${sysconfdir}
	install -m 0755 ${S}/${INITSCRIPT_NAME}.sh ${D}${sysconfdir}/init.d/${INITSCRIPT_NAME}
}

