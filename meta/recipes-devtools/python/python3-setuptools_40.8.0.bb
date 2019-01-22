require python-setuptools.inc
inherit setuptools3

SRC_URI += "\
            file://0001-Add-exclude-source-files-to-install.patch \
           "

do_install_append() {
    mv ${D}${bindir}/easy_install ${D}${bindir}/easy3_install
}
