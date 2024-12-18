package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AlB implements C5NL {
    public static final EnumC209229Ne A01;
    public static final int[] A02;
    public static final int[] A03;
    public final C189138Ze A00;

    static {
        Object obj = A4H.A01.get(0);
        C14360o3.A07(obj);
        EnumC209229Ne enumC209229Ne = (EnumC209229Ne) obj;
        A01 = enumC209229Ne;
        A02 = AbstractC209259Nh.A02(enumC209229Ne);
        Object obj2 = A4H.A02.get(0);
        C14360o3.A07(obj2);
        A03 = AbstractC209259Nh.A02((EnumC209229Ne) obj2);
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A02;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C189138Ze c189138Ze = this.A00;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.reels.fundraiser.model.FundraiserStickerModel");
                if (C14360o3.A0K(c189138Ze, ((AlB) obj).A00)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public AlB(C189138Ze c189138Ze) {
        this.A00 = c189138Ze;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG A0V = AbstractC167007dF.A0V();
        AbstractC166987dD.A1V(C148276lx.A0q, A0V);
        return A0V;
    }
}
