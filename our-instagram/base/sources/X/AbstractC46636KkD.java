package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.KkD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46636KkD {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        C19L A00;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        Object A002 = c6fw.A00();
        C14360o3.A0C(A002, "null cannot be cast to non-null type kotlin.String");
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 3);
        String A0y = AbstractC43593JPy.A0y(c6fw, 4);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        L3E l3e = new L3E(((C6FG) A01).A00, A0B, (String) A002, A0y);
        C14360o3.A0B(str, 1);
        C47742L6h c47742L6h = new C47742L6h(c6fq, A0I);
        Fragment A022 = C6BQ.A02(c6fq);
        if (A022 != null) {
            if (A022 instanceof C07X) {
                A00 = AbstractC25235BEs.A0S(A022);
            } else {
                A00 = AbstractC24771Iv.A00();
            }
            if (A00 != null) {
                AbstractC166987dD.A1Z(new MC9(l3e, c47742L6h, str, (InterfaceC23621Ds) null, 14), A00);
                return C0eB.A00;
            }
        }
        c47742L6h.A00();
        return C0eB.A00;
    }
}
