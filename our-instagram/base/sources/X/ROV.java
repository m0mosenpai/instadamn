package X;

/* loaded from: classes10.dex */
public final class ROV extends RO8 implements InterfaceC65421Tjs {
    public static final ROV zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public int zzg;

    public static /* synthetic */ void A0A(ROV rov, int i) {
        rov.zzg = i - 1;
        rov.zzd |= 1;
    }

    static {
        ROV rov = new ROV();
        zzb = rov;
        RO8.A09(rov, ROV.class);
    }

    public static ROJ A00() {
        return (ROJ) zzb.A0L();
    }

    @Override // X.RO8
    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    AbstractC61508Roj abstractC61508Roj = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ROJ(abstractC61508Roj);
                }
                return new ROV();
            }
            return RO8.A07(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", T6P.A00, ROS.class});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void A0B(ROV rov, ROS ros) {
        ros.getClass();
        rov.zzf = ros;
        rov.zze = 2;
    }
}
