package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.KkF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46638KkF {
    public static final C0eB A00(C6FQ c6fq, C6FW c6fw) {
        C19L A00;
        String str;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        String A0y = AbstractC43593JPy.A0y(c6fw, 3);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        L3E l3e = new L3E(((C6FG) A01).A00, A0B, (String) A02, A0y);
        C47742L6h c47742L6h = new C47742L6h(c6fq, A0H);
        C47798L9g c47798L9g = l3e.A02;
        if (c47798L9g == null) {
            str = "logger";
        } else {
            c47798L9g.A00("client_start_check_feo2_availability");
            SYR syr = l3e.A00;
            if (syr == null) {
                str = "feO2ApiLevel";
            } else {
                if (syr.A00() >= 1) {
                    c47798L9g.A00("client_check_is_feo2_available");
                    Fragment A022 = C6BQ.A02(c6fq);
                    if (A022 != null) {
                        if (A022 instanceof C07X) {
                            A00 = AbstractC25235BEs.A0S(A022);
                        } else {
                            A00 = AbstractC24771Iv.A00();
                        }
                        if (A00 != null) {
                            AbstractC166987dD.A1Z(new MCK(c47742L6h, l3e, (InterfaceC23621Ds) null, 15), A00);
                            return C0eB.A00;
                        }
                    }
                } else {
                    c47798L9g.A00("client_check_is_feo2_unavailable");
                }
                c47742L6h.A00();
                return C0eB.A00;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
