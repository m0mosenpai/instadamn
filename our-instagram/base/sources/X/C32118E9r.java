package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.E9r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32118E9r extends AbstractC32319ELj {
    public static final String __redex_internal_original_name = "CreatePasswordNuxFragment";
    public UserSession A00;

    @Override // X.AbstractC32319ELj, X.InterfaceC11380iw
    public final String getModuleName() {
        return "create_password_nux";
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        C35031Fc4.A00.A02(this.A00, "nux_create_password");
        if (this.A05) {
            UserSession userSession = this.A00;
            String A0J = AbstractC13880nE.A0J(this.A03);
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0B("accounts/change_password/");
            A0M.A9s("enc_new_password", AbstractC31176DnK.A0p(userSession, A0J));
            AbstractC31176DnK.A1P(A0M, "is_in_nux", "true");
            C32539EUp.A00(this, AbstractC31172DnG.A0U(A0M, true), 27);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A02(this.A00, "nux_create_password");
        return true;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1313301853);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-1408506429, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UserSession userSession = this.A00;
        AbstractC167017dG.A1N(userSession, "nux_create_password");
        C35203Ffv.A01(userSession, "nux_create_password");
    }
}
