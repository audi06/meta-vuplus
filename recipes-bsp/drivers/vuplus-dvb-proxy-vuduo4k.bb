require vuplus-dvb-proxy.inc

SRCDATE = "20191218"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s ${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "537f9e98601a79cd55cd7d3808c0ac3e"
SRC_URI[sha256sum] = "4b4dc800f0b730c4c15da9889215c6bc1172e3dbce9209c9d2c4ad1a04bd3e63"

COMPATIBLE_MACHINE = "^(vuduo4k)$"
