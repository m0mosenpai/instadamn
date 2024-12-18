package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.realtimeclient.RealtimeConstants;

/* loaded from: classes9.dex */
public final class P4R implements InterfaceC58051Poc {
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

    public P4R(C51464MoB c51464MoB, InterfaceC172717mh interfaceC172717mh, IgdsButton igdsButton, P4V p4v, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.A04 = p4v;
        this.A01 = c51464MoB;
        this.A09 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A05 = str5;
        this.A00 = i;
        this.A07 = str6;
        this.A02 = interfaceC172717mh;
        this.A03 = igdsButton;
    }

    @Override // X.InterfaceC58051Poc
    public final void Dpx(OLJ olj, boolean z) {
        P4V.A00(this.A04, "lead_ads_iab_form_extension_banner", "iab_form_extension_lead_ads_content_fetch", "success").Cht();
        Bundle A0b = AbstractC166987dD.A0b();
        C51464MoB c51464MoB = this.A01;
        IGLeadFormExtensionModel iGLeadFormExtensionModel = c51464MoB.A01;
        A0b.putString("mediaID", iGLeadFormExtensionModel.A0A);
        String str = iGLeadFormExtensionModel.A04;
        if (str == null) {
            str = "";
        }
        A0b.putString("advertiser_fbidv2", str);
        A0b.putString("formID", this.A09);
        A0b.putString("adID", this.A06);
        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A08);
        A0b.putString("trackingToken", this.A0A);
        A0b.putString("dynamicItemID", iGLeadFormExtensionModel.A07);
        A0b.putBoolean("submitted", c51464MoB.A00);
        AbstractC31173DnH.A1C(A0b, c51464MoB.A02);
        A0b.putString("ad_creation_source", this.A05);
        A0b.putInt("advertiserFollowerCount", this.A00);
        A0b.putString("cta_label", this.A07);
        InterfaceC172717mh interfaceC172717mh = this.A02;
        AbstractC10360h2 parentFragmentManager = interfaceC172717mh.getParentFragmentManager();
        N43 n43 = new N43();
        n43.setArguments(A0b);
        n43.A0B(parentFragmentManager, "ig_lead_form_extension_controller");
        FragmentActivity activity = interfaceC172717mh.getActivity();
        if (activity != null) {
            parentFragmentManager.A0u(new C55553Oln(0, this.A03, c51464MoB), activity, "request_key");
        }
    }

    @Override // X.InterfaceC58051Poc
    public final void onFailure() {
        P4V.A00(this.A04, "lead_ads_iab_form_extension_banner", "iab_form_extension_lead_ads_content_fetch", RealtimeConstants.SEND_FAIL).Cht();
    }
}
