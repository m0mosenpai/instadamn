package X;

/* renamed from: X.AAh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22963AAh {
    public final Integer A00(EnumC209589Ot enumC209589Ot, AbstractC172157lk abstractC172157lk) {
        C14360o3.A0B(abstractC172157lk, 0);
        if (enumC209589Ot == null) {
            enumC209589Ot = EnumC209589Ot.A05;
        }
        int ordinal = enumC209589Ot.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                if (abstractC172157lk instanceof C171737l3) {
                    return C05F.A01;
                }
                return C05F.A00;
            }
            throw B4Z.A00();
        }
        if (abstractC172157lk instanceof C172147lj) {
            int ordinal2 = ((C172147lj) abstractC172157lk).A00.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    return C05F.A0j;
                }
                throw B4Z.A00();
            }
        } else {
            if (abstractC172157lk instanceof C171737l3) {
                return C05F.A0u;
            }
            if (abstractC172157lk instanceof C171757l5) {
                return C05F.A15;
            }
        }
        return C05F.A0Y;
    }
}
