package X;

/* loaded from: classes10.dex */
public final class ROY extends RO8 implements InterfaceC65421Tjs {
    public static final ROY zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public int zzg;
    public ROX zzh;

    public static /* synthetic */ void A0B(ROY roy, int i) {
        roy.zzg = i - 1;
        roy.zzd |= 1;
    }

    static {
        ROY roy = new ROY();
        zzb = roy;
        RO8.A09(roy, ROY.class);
    }

    public static ROL A00() {
        return (ROL) zzb.A0L();
    }

    public static ROY A0A(C63270SgU c63270SgU, byte[] bArr) {
        return (ROY) RO8.A01(c63270SgU, zzb, bArr);
    }

    @Override // X.RO8
    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    AbstractC61507Roi abstractC61507Roi = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ROL(abstractC61507Roi);
                }
                return new ROY();
            }
            return RO8.A07(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", T6P.A00, "zzh", ROS.class});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void A0C(ROY roy, ROX rox) {
        rox.getClass();
        roy.zzh = rox;
        roy.zzd |= 2;
    }

    public static /* synthetic */ void A0D(ROY roy, ROS ros) {
        ros.getClass();
        roy.zzf = ros;
        roy.zze = 4;
    }
}
