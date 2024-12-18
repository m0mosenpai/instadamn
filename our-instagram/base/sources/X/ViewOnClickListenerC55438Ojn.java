package X;

import android.view.View;
import com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Ojn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55438Ojn implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C51464MoB A01;
    public final /* synthetic */ InterfaceC172717mh A02;
    public final /* synthetic */ IgdsButton A03;
    public final /* synthetic */ P4V A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public ViewOnClickListenerC55438Ojn(C51464MoB c51464MoB, InterfaceC172717mh interfaceC172717mh, IgdsButton igdsButton, P4V p4v, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A03 = igdsButton;
        this.A04 = p4v;
        this.A01 = c51464MoB;
        this.A06 = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A05 = str5;
        this.A00 = i;
        this.A07 = str6;
        this.A02 = interfaceC172717mh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1795480442);
        IgdsButton igdsButton = this.A03;
        igdsButton.setClickable(false);
        P4V p4v = this.A04;
        P4V.A00(p4v, "lead_ads_iab_form_extension_banner", "iab_form_extension_cta_button_click", "click").Cht();
        C51464MoB c51464MoB = this.A01;
        IGLeadFormExtensionModel iGLeadFormExtensionModel = c51464MoB.A01;
        String str = iGLeadFormExtensionModel.A09;
        if (str == null) {
            str = "";
        }
        UserSession userSession = c51464MoB.A02;
        C14360o3.A0B(str, 1);
        String str2 = iGLeadFormExtensionModel.A0B;
        String str3 = this.A06;
        String str4 = this.A09;
        String str5 = this.A08;
        String str6 = this.A0A;
        String str7 = this.A05;
        int i = this.A00;
        OZD.A01(new C54689ODp(userSession, str, str2, str3, AbstractC16960so.A1M(AbstractC25225BEi.A16(new P4R(c51464MoB, this.A02, igdsButton, p4v, str4, str3, str5, str6, str7, this.A07, i))), false));
        C0f9.A0C(655001199, A05);
    }
}
