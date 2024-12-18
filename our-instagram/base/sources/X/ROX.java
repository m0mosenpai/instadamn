package X;

/* loaded from: classes10.dex */
public final class ROX extends RO8 implements InterfaceC65421Tjs {
    public static final ROX zzb;
    public int zzd;
    public int zze;
    public int zzg;
    public String zzf = "";
    public String zzh = "";

    public static /* synthetic */ void A0A(ROX rox, int i) {
        rox.zzd |= 1;
        rox.zze = i;
    }

    public static /* synthetic */ void A0B(ROX rox, int i) {
        rox.zzg = i - 1;
        rox.zzd |= 4;
    }

    static {
        ROX rox = new ROX();
        zzb = rox;
        RO8.A09(rox, ROX.class);
    }

    public static ROM A00() {
        return (ROM) zzb.A0L();
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
                    return new ROM(null);
                }
                return new ROX();
            }
            return RO8.A07(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", T6Q.A00, "zzh"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void A0C(ROX rox, String str) {
        str.getClass();
        rox.zzd |= 2;
        rox.zzf = str;
    }
}
