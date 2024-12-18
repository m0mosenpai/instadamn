package X;

/* loaded from: classes10.dex */
public final class ROU extends RO8 implements InterfaceC65421Tjs {
    public static final ROU zzb;
    public int zzd;
    public String zze = "";
    public String zzf = "";

    static {
        ROU rou = new ROU();
        zzb = rou;
        RO8.A09(rou, ROU.class);
    }

    public static ROK A00() {
        return (ROK) zzb.A0L();
    }

    @Override // X.RO8
    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    AbstractC61510Rol abstractC61510Rol = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ROK(abstractC61510Rol);
                }
                return new ROU();
            }
            return RO8.A07(zzb, AbstractC43591JPw.A00(502), new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void A0A(ROU rou, String str) {
        str.getClass();
        rou.zzd |= 1;
        rou.zze = str;
    }

    public static /* synthetic */ void A0B(ROU rou, String str) {
        str.getClass();
        rou.zzd |= 2;
        rou.zzf = str;
    }
}
