package X;

/* loaded from: classes10.dex */
public final class ROW extends RO8 implements InterfaceC65421Tjs {
    public static final ROW zzb;
    public int zzd;
    public int zzf;
    public InterfaceC65693TsF zze = RO8.A06();
    public String zzg = "";

    public static /* synthetic */ void A0A(ROW row, int i) {
        row.zzd |= 1;
        row.zzf = i;
    }

    static {
        ROW row = new ROW();
        zzb = row;
        RO8.A09(row, ROW.class);
    }

    public static RON A00() {
        return (RON) zzb.A0L();
    }

    public static /* synthetic */ void A0B(ROW row, Iterable iterable) {
        InterfaceC65693TsF interfaceC65693TsF = row.zze;
        if (!interfaceC65693TsF.FG0()) {
            interfaceC65693TsF = RO8.A05(interfaceC65693TsF);
            row.zze = interfaceC65693TsF;
        }
        AbstractC64251T6a.A0H(iterable, interfaceC65693TsF);
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
                    return new RON(null);
                }
                return new ROW();
            }
            return RO8.A07(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void A0C(ROW row, String str) {
        str.getClass();
        row.zzd |= 2;
        row.zzg = str;
    }
}
