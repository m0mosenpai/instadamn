package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.ElS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33233ElS extends AbstractC33235ElU implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "NotificationOptionsRedesignFragment";
    public UserSession A00;
    public C35033Fc6 A01;
    public boolean A02;
    public final FHV A03 = new FHV(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "notifications";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC33235ElU.A08(this, interfaceC56362iU, 2131968849);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1300027173);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A02 = Boolean.TRUE.equals(AbstractC31174DnI.A0n(requireArguments, "only_show_push"));
        this.A01 = new C35033Fc6(this.A00, this);
        C0f9.A09(-1498048344, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-927070838);
        super.onResume();
        new FRN(this, this.A00, this.A01, this.A02).A00(this.A03);
        C0f9.A09(-563196915, A02);
    }
}
