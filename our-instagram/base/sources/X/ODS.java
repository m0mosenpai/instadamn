package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ODS {
    public AnonymousClass195 A00;
    public final View A01;
    public final Fragment A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public ODS(View view, Fragment fragment, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 3);
        this.A02 = fragment;
        this.A01 = view;
        C43210J8h c43210J8h = new C43210J8h(39, this, enumC142806cg, userSession);
        InterfaceC09390do A01 = C57547PgL.A01(new C57547PgL(fragment, 26), EnumC09460dv.A02, 27);
        this.A04 = AbstractC25225BEi.A0a(new C57547PgL(A01, 28), c43210J8h, C57532Pg6.A00(null, A01, 32), AbstractC25225BEi.A1D(C50925Meu.class));
        InterfaceC09390do A00 = C1XM.A00(C57532Pg6.A00(enumC142806cg, this, 31));
        this.A03 = A00;
        ViewOnLayoutChangeListenerC55476OkV.A00(AbstractC166987dD.A0d(A00), 9, this);
        this.A00 = AbstractC50522MSa.A0s(fragment, C57167PZl.A01(this, null, 13), ((C50925Meu) this.A04.getValue()).A03);
    }
}
