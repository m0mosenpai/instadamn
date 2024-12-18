package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.EIr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32257EIr extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FxISUpsellFragment";
    public ViewStub A00;
    public AbstractC18680vv A01;
    public C31819Dyd A02;
    public String A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "IS Upsell";
    }

    public static void A00(C32257EIr c32257EIr) {
        UserSession userSession = (UserSession) c32257EIr.A01;
        String str = c32257EIr.A03;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, str);
        C35241Fga.A03(userSession, "cp_upsell_screen_confirm", str, null);
        c32257EIr.A02.A0C = A1R;
        AbstractC34209F7h.A00().A00(c32257EIr.getContext(), AbstractC31174DnI.A0H(c32257EIr), false, false);
        AbstractC18680vv abstractC18680vv = c32257EIr.A01;
        ImmutableList immutableList = c32257EIr.A02.A00;
        immutableList.getClass();
        C32539EUp c32539EUp = new C32539EUp(c32257EIr, 22);
        C14360o3.A0B(abstractC18680vv, 0);
        C2JM A0b = AbstractC25225BEi.A0b();
        String A0n = AbstractC166997dE.A0n();
        A0b.A04("client_mutation_id", A0n);
        boolean A1W = AbstractC167007dF.A1W(A0n);
        A0b.A05("accounts_to_sync", immutableList);
        C18C.A0E(A1W);
        C1ON A0H = AbstractC31178DnM.A0H(new C907442n(A0b, E5Q.class, "IGFxImSyncResourcesMutation", A1R), abstractC18680vv);
        A0H.A00 = c32539EUp;
        C1GJ.A03(A0H);
    }

    public static void A01(C32257EIr c32257EIr, int i) {
        AbstractC34209F7h.A00().A01(AbstractC31174DnI.A0H(c32257EIr));
        InterfaceC37264GbH A00 = AbstractC34275F9v.A00(c32257EIr);
        if (A00 != null) {
            A00.CnE(i);
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1325526787);
        super.onCreate(bundle);
        this.A02 = (C31819Dyd) AbstractC31175DnJ.A0A(this).A00(C31819Dyd.class);
        String string = requireArguments().getString("ONBOARDING_STEP");
        String str = "ig_nux";
        if (string != null && !string.equals("ig_nux")) {
            str = "ig_nux_after_linking_upsell";
        }
        this.A03 = str;
        this.A01 = AbstractC31176DnK.A0R(this);
        C0f9.A09(-751664230, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(24880269);
        AbstractC34209F7h.A00().A00(getContext(), AbstractC31174DnI.A0H(this), false, false);
        View inflate = layoutInflater.inflate(R.layout.fx_is_upsell_screen_layout, viewGroup, false);
        this.A00 = AbstractC31173DnH.A0G(inflate, R.id.fx_is_upsell_screen_stub);
        AbstractC18680vv abstractC18680vv = this.A01;
        C32539EUp c32539EUp = new C32539EUp(this, 21);
        C14360o3.A0B(abstractC18680vv, 0);
        C1ON A0H = AbstractC31178DnM.A0H(new C907442n(AbstractC25225BEi.A0b(), E5M.class, "IGFXIMNUXConfigQuery", false), abstractC18680vv);
        A0H.A00 = c32539EUp;
        C1GJ.A03(A0H);
        C0f9.A09(-1828692707, A02);
        return inflate;
    }
}
