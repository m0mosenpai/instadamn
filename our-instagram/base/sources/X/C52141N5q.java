package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.N5q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52141N5q extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ConfirmationFragment";
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131956587);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = AbstractC166997dE.A0N(this).getString(2131961124);
        AbstractC31176DnK.A1B(new ViewOnClickListenerC55467OkM(this, 53), A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "brandedcontent_violation_confirmation";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25226BEj.A1P(this);
        AbstractC25226BEj.A1P(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-773200442);
        super.onCreate(bundle);
        this.A04 = requireArguments().getString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_TITLE");
        this.A02 = requireArguments().getString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_MESSAGE");
        this.A00 = requireArguments().getString("ConfirmationFragment.ARGUMENT_KEY_MEDIA_ID");
        this.A03 = requireArguments().getString("ConfirmationFragment.ARGUMENT_KEY_NOTIF_SOURCE", "");
        this.A01 = requireArguments().getString("ConfirmationFragment.ARGUMENT_KEY_MEDIA_TYPE", "");
        C0f9.A09(1886571054, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1222965749);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.confirmation_fragment, viewGroup, false);
        AbstractC166987dD.A0e(inflate, R.id.title).setText(this.A04);
        AbstractC166987dD.A0e(inflate, R.id.message).setText(this.A02);
        UserSession A0r = AbstractC166987dD.A0r(this.A05);
        Integer num = C05F.A0o;
        String str2 = this.A03;
        if (str2 == null) {
            str = "notifSource";
        } else {
            C09530e4 A1L = AbstractC166987dD.A1L("notif_source", str2);
            String str3 = this.A01;
            if (str3 == null) {
                str = "mediaType";
            } else {
                LL0.A03(this, A0r, num, null, null, null, null, this.A00, null, AbstractC25233BEq.A0p("media_type", str3, A1L));
                C0f9.A09(837303151, A02);
                return inflate;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
