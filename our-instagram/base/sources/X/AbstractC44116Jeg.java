package X;

/* renamed from: X.Jeg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44116Jeg {
    public static final EnumC43799JYm A00(C4I3 c4i3) {
        C14360o3.A0B(c4i3, 0);
        for (EnumC43799JYm enumC43799JYm : EnumC43799JYm.values()) {
            if (enumC43799JYm.A01 == c4i3) {
                return enumC43799JYm;
            }
        }
        return EnumC43799JYm.A05;
    }

    public static void A01(JR2 jr2) {
        C43626JRj A0q = jr2.A0q();
        A0q.A0E.A0B = AbstractC46766KmN.A00(jr2.A0p(), A00(JR2.A04(jr2)), jr2.A0g, jr2.A0t());
        C43626JRj.A03(A0q);
    }
}
