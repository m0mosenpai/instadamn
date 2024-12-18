package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.NNw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52576NNw extends AbstractC52561NNh implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "LeadAdsThankYouScreenFragment";
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.AbstractC52561NNh, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C14360o3.A0B(view, 0);
        C55137Oc5.A00(this);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A00;
        UserSession A00 = AbstractC51040Mgq.A00(interfaceC09390do);
        C57112jm c57112jm = this.A03;
        if (c57112jm != null) {
            ILM ilm = new ILM(A00, c57112jm, this);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                i = bundle2.getInt("thank_you_page_index");
            } else {
                i = 0;
            }
            ilm.A00(view, OUA.A05.A00(this.mArguments, EnumC53273NhB.A0C, AbstractC51040Mgq.A00(interfaceC09390do).token, i + AbstractC50523MSb.A01(this)));
            IgTextView igTextView = this.A01;
            if (igTextView != null) {
                AbstractC77703du.A05(igTextView, EnumC77673dr.A0T);
            }
            IgTextView igTextView2 = ((AbstractC52561NNh) this).A00;
            if (igTextView2 != null) {
                AbstractC77703du.A05(igTextView2, EnumC77673dr.A02);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A04;
            if (igdsBottomButtonLayout != null) {
                AbstractC77703du.A05(igdsBottomButtonLayout, EnumC77673dr.A09);
                return;
            }
            return;
        }
        C14360o3.A0F("viewpointManager");
        throw C00O.createAndThrow();
    }

    public C52576NNw() {
        C57554PgS A01 = C57554PgS.A01(this, 24);
        InterfaceC09390do A00 = C57554PgS.A00(C57554PgS.A01(this, 21), EnumC09460dv.A02, 22);
        this.A00 = AbstractC25225BEi.A0a(C57554PgS.A01(A00, 23), A01, C57534Pg8.A00(A00, null, 10), AbstractC25225BEi.A1D(NOX.class));
    }
}
