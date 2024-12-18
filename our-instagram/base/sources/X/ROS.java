package X;

/* loaded from: classes10.dex */
public final class ROS extends RO8 implements InterfaceC65421Tjs {
    public static final ROS zzb;
    public int zzd;
    public int zze;

    public static /* synthetic */ void A0A(ROS ros) {
        ros.zze = 9;
        ros.zzd |= 1;
    }

    static {
        ROS ros = new ROS();
        zzb = ros;
        RO8.A09(ros, ROS.class);
    }

    public static ROI A00() {
        return (ROI) zzb.A0L();
    }

    @Override // X.RO8
    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ROI(null);
                }
                return new ROS();
            }
            return RO8.A07(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", T6T.A00});
        }
        return (byte) 1;
    }
}
