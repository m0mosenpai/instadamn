package X;

/* loaded from: classes10.dex */
public final class ROZ extends RO8 implements InterfaceC65421Tjs {
    public static final ROZ zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public ROU zzg;
    public ROT zzh;

    public static /* synthetic */ void A0A(ROY roy, ROZ roz) {
        roz.zzf = roy;
        roz.zze = 2;
    }

    public static /* synthetic */ void A0B(ROV rov, ROZ roz) {
        roz.zzf = rov;
        roz.zze = 3;
    }

    public static /* synthetic */ void A0C(C60720ROa c60720ROa, ROZ roz) {
        roz.zzf = c60720ROa;
        roz.zze = 5;
    }

    public static /* synthetic */ void A0D(ROU rou, ROZ roz) {
        roz.zzg = rou;
        roz.zzd |= 1;
    }

    public static /* synthetic */ void A0F(ROZ roz, ROR ror) {
        roz.zzf = ror;
        roz.zze = 4;
    }

    static {
        ROZ roz = new ROZ();
        zzb = roz;
        RO8.A09(roz, ROZ.class);
    }

    public static ROP A00() {
        return (ROP) zzb.A0L();
    }

    @Override // X.RO8
    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    AbstractC61513Roo abstractC61513Roo = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new ROP(abstractC61513Roo);
                }
                return new ROZ();
            }
            return RO8.A07(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", ROY.class, ROV.class, ROR.class, C60720ROa.class, "zzh"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void A0E(ROT rot, ROZ roz) {
        rot.getClass();
        roz.zzh = rot;
        roz.zzd |= 2;
    }
}
