package X;

/* loaded from: classes10.dex */
public final class ROR extends RO8 implements InterfaceC65421Tjs {
    public static final ROR zzb;
    public int zzd;
    public int zze;

    public static ROR A00() {
        return zzb;
    }

    static {
        ROR ror = new ROR();
        zzb = ror;
        RO8.A09(ror, ROR.class);
    }

    @Override // X.RO8
    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    AbstractC61515Roq abstractC61515Roq = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ROG(abstractC61515Roq);
                }
                return new ROR();
            }
            return RO8.A07(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", T6U.A00});
        }
        return (byte) 1;
    }
}
