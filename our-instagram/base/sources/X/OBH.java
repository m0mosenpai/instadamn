package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OBH {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public OBH(Fragment fragment, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = fragment;
        this.A01 = userSession;
        C57542PgG c57542PgG = new C57542PgG(this, 0);
        InterfaceC09390do A01 = C57540PgE.A01(new C57540PgE(fragment, 47), EnumC09460dv.A02, 48);
        C60842q8 A0a = AbstractC25225BEi.A0a(new C57540PgE(A01, 49), c57542PgG, C57532Pg6.A00(null, A01, 47), AbstractC25225BEi.A1D(C50907Mec.class));
        this.A02 = A0a;
        JQ0.A11(fragment, C57167PZl.A01(this, null, 14), ((C50907Mec) A0a.getValue()).A02);
    }
}
