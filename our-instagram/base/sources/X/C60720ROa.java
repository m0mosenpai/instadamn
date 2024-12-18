package X;

import java.util.Iterator;

/* renamed from: X.ROa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60720ROa extends RO8 implements InterfaceC65421Tjs {
    public static final InterfaceC65262Tgs zzb = new T6V();
    public static final C60720ROa zzd;
    public int zze;
    public int zzg;
    public ROX zzj;
    public boolean zzk;
    public boolean zzl;
    public String zzf = "";
    public InterfaceC65664Tqu zzh = RO8.A04();
    public InterfaceC65693TsF zzi = RO8.A06();

    public static /* synthetic */ void A0C(C60720ROa c60720ROa) {
        c60720ROa.zze |= 16;
        c60720ROa.zzl = false;
    }

    public static /* synthetic */ void A0D(C60720ROa c60720ROa, int i) {
        c60720ROa.zzg = i - 1;
        c60720ROa.zze |= 2;
    }

    public static /* synthetic */ void A0G(C60720ROa c60720ROa, boolean z) {
        c60720ROa.zze |= 8;
        c60720ROa.zzk = z;
    }

    static {
        C60720ROa c60720ROa = new C60720ROa();
        zzd = c60720ROa;
        RO8.A09(c60720ROa, C60720ROa.class);
    }

    public static ROO A00() {
        return (ROO) zzd.A0L();
    }

    public static C60720ROa A0A(C63270SgU c63270SgU, byte[] bArr) {
        return (C60720ROa) RO8.A01(c63270SgU, zzd, bArr);
    }

    public static /* synthetic */ void A0F(C60720ROa c60720ROa, Iterable iterable) {
        InterfaceC65664Tqu interfaceC65664Tqu = c60720ROa.zzh;
        if (!interfaceC65664Tqu.FG0()) {
            int size = interfaceC65664Tqu.size();
            int i = size + size;
            if (size == 0) {
                i = 10;
            }
            c60720ROa.zzh = interfaceC65664Tqu.FG7(i);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c60720ROa.zzh.FGX(((EnumC61081Rev) it.next()).A00());
        }
    }

    @Override // X.RO8
    public final Object A0N(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    T6V t6v = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new ROO(t6v);
                }
                return new C60720ROa();
            }
            return RO8.A07(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", T6S.A00, "zzh", T6R.A00, "zzi", ROW.class, "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public static /* synthetic */ void A0B(ROX rox, C60720ROa c60720ROa) {
        rox.getClass();
        c60720ROa.zzj = rox;
        c60720ROa.zze |= 4;
    }

    public static /* synthetic */ void A0E(C60720ROa c60720ROa, ROW row) {
        row.getClass();
        InterfaceC65693TsF interfaceC65693TsF = c60720ROa.zzi;
        if (!interfaceC65693TsF.FG0()) {
            interfaceC65693TsF = RO8.A05(interfaceC65693TsF);
            c60720ROa.zzi = interfaceC65693TsF;
        }
        interfaceC65693TsF.add(row);
    }
}
