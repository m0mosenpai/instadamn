package X;

/* loaded from: classes10.dex */
public final class ROT extends RO8 implements InterfaceC65421Tjs {
    public static final ROT zzb;
    public int zzd;
    public boolean zze;
    public boolean zzf;

    public static /* synthetic */ void A0A(ROT rot) {
        rot.zzd |= 2;
        rot.zzf = false;
    }

    static {
        ROT rot = new ROT();
        zzb = rot;
        RO8.A09(rot, ROT.class);
    }

    public static ROH A00() {
        return (ROH) zzb.A0L();
    }

    @Override // X.RO8
    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    AbstractC61511Rom abstractC61511Rom = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ROH(abstractC61511Rom);
                }
                return new ROT();
            }
            return RO8.A07(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
