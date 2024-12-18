package X;

import java.util.ArrayList;

/* renamed from: X.El0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33212El0 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacTextMessageControlsFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131975993);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public static final void A00(C33212El0 c33212El0) {
        ArrayList A1E = AbstractC166987dD.A1E();
        boolean z = c33212El0.requireArguments().getBoolean("is_two_factor_enabled");
        C36731GHa A02 = C36731GHa.A02(new C35735FqI(c33212El0, z, c33212El0.requireArguments().getBoolean("is_totp_two_factor_enabled")), 2131975959, z);
        int A0E = AbstractC167017dG.A0E(c33212El0.requireContext());
        A02.A05 = A0E;
        A02.A00 = A0E;
        if (z) {
            String A0R = AnonymousClass001.A0R("****", AbstractC35235FgT.A00(AbstractC31180DnO.A0a(c33212El0.requireArguments())));
            C14360o3.A07(A0R);
            A02.A0A = AbstractC31174DnI.A0w(c33212El0, A0R, 2131975958);
        } else {
            A02.A02 = 2131975960;
        }
        A1E.add(A02);
        A1E.add(new C35200Ffs(new ViewOnClickListenerC35667Fp2(c33212El0, 3), (String) null, 2131975994, 2131975992));
        c33212El0.setItems(A1E);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1335991584);
        super.onResume();
        A00(this);
        C0f9.A09(970230223, A02);
    }
}
