package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.MoB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51464MoB extends AbstractC58880QEq implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "IGLeadFormExtensionController";
    public boolean A00;
    public final IGLeadFormExtensionModel A01;
    public final UserSession A02;

    @Override // X.AbstractC58880QEq
    public final void A03(View view, InterfaceC172717mh interfaceC172717mh) {
        IGLeadFormExtensionModel iGLeadFormExtensionModel = this.A01;
        String str = iGLeadFormExtensionModel.A03;
        String str2 = iGLeadFormExtensionModel.A0B;
        String str3 = iGLeadFormExtensionModel.A09;
        String str4 = iGLeadFormExtensionModel.A08;
        if (str4 == null) {
            str4 = C2Fb.A49.toString();
        }
        String str5 = iGLeadFormExtensionModel.A02;
        if (str5 == null) {
            str5 = "UNKNOWN";
        }
        P4V p4v = new P4V(this, this.A02, str, str2, str3, str5, str4, iGLeadFormExtensionModel.A04, null, false, false, false, true);
        boolean z = iGLeadFormExtensionModel.A0C;
        this.A00 = z;
        if (z) {
            ((AbstractC58880QEq) this).A02 = true;
            A02();
            return;
        }
        P4V.A00(p4v, "lead_ads_iab_form_extension_banner", "iab_form_extension_banner_impression", "impression").Cht();
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) view.findViewById(R.id.profile_pic);
        ImageUrl imageUrl = iGLeadFormExtensionModel.A01;
        if (imageUrl != null) {
            gradientSpinnerAvatarView.A0F(null, this, imageUrl);
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        }
        AbstractC166987dD.A0e(view, R.id.primary_text).setText(iGLeadFormExtensionModel.A05);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.secondary_text);
        int i = iGLeadFormExtensionModel.A00;
        if (i == 0) {
            C14360o3.A0A(A0e);
            A0e.setVisibility(8);
        } else {
            Integer valueOf = Integer.valueOf(i);
            Resources resources = view.getResources();
            C14360o3.A07(resources);
            MSZ.A11(resources, A0e, C84963qk.A03(resources, valueOf), 2131964993);
        }
        IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.action_button);
        String str6 = iGLeadFormExtensionModel.A06;
        igdsButton.setText(str6);
        C0fQ.A00(new ViewOnClickListenerC55438Ojn(this, interfaceC172717mh, igdsButton, p4v, str, str3, str4, str2, str5, str6, i), igdsButton);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public C51464MoB(IGLeadFormExtensionModel iGLeadFormExtensionModel, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = iGLeadFormExtensionModel;
    }

    @Override // X.AbstractC58880QEq
    public final int A00() {
        return R.layout.ig_lead_form_extension_view;
    }

    @Override // X.AbstractC58880QEq
    public final int A01() {
        return R.id.lead_form_extension_footer_stub;
    }
}
