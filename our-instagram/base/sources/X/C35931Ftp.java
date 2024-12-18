package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import org.json.JSONObject;

/* renamed from: X.Ftp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35931Ftp implements InterfaceC37148GYj {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final String A02;

    public C35931Ftp(AbstractC59962oe abstractC59962oe, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = abstractC59962oe;
        this.A02 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.InterfaceC37148GYj
    public final void Csx() {
        String str;
        AbstractC59962oe abstractC59962oe = this.A00;
        Context requireContext = abstractC59962oe.requireContext();
        C08790ch A00 = AbstractC018607g.A00(abstractC59962oe.requireActivity());
        UserSession userSession = this.A01;
        String str2 = this.A02;
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("link_flow_source", "instagram");
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        switch (str2.hashCode()) {
            case -2026751916:
                if (str2.equals(AbstractC111324zv.A00(467))) {
                    str = "IG_CLAIM_LOCATION";
                    break;
                }
                str = "UNKNOWN_LINK_DO_NOT_USE";
                break;
            case -864092448:
                if (str2.equals("ig_cross_posting_settings")) {
                    str = "IG_SETTINGS_SHARE_TO_FB";
                    break;
                }
                str = "UNKNOWN_LINK_DO_NOT_USE";
                break;
            case 229373044:
                if (str2.equals("edit_profile")) {
                    str = "IG_EDIT_PROFILE";
                    break;
                }
                str = "UNKNOWN_LINK_DO_NOT_USE";
                break;
            case 407391086:
                if (str2.equals("share_table")) {
                    str = "IG_SHARE_TO_FB";
                    break;
                }
                str = "UNKNOWN_LINK_DO_NOT_USE";
                break;
            case 1383187472:
                if (str2.equals("personal_to_business_conversion")) {
                    str = "IG_PERSONAL_TO_BUSINESS_CONVERSION";
                    break;
                }
                str = "UNKNOWN_LINK_DO_NOT_USE";
                break;
            case 1985941072:
                if (str2.equals("setting")) {
                    str = "IG_SETTINGS_BUSINESS_TAB";
                    break;
                }
                str = "UNKNOWN_LINK_DO_NOT_USE";
                break;
            default:
                str = "UNKNOWN_LINK_DO_NOT_USE";
                break;
        }
        A0q2.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC167007dF.A0h(str));
        A0q2.put("flow", "pro2pro_framework_page_linking_flow");
        A0q2.put("custom_parameters", A0q);
        AbstractC192798gL A05 = C192108fB.A05(userSession, "com.bloks.www.pro_to_pro.framework.async.controller.entry", AbstractC167017dG.A0r("server_params", A0q2.toString()));
        C32392EOt.A00(A05, this, 2);
        C1GJ.A00(requireContext, A00, A05);
    }

    @Override // X.InterfaceC37148GYj
    public final void Dgx(int i, int i2, Intent intent) {
        Bundle extras;
        AbstractC59962oe abstractC59962oe;
        if ((i != 32779 && i != 1122563) || i2 != -1 || intent == null || (extras = intent.getExtras()) == null) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putBoolean(AbstractC111324zv.A00(553), true);
            A0b.putInt(AbstractC111324zv.A00(554), -1);
            abstractC59962oe = this.A00;
            AbstractC31174DnI.A0I(abstractC59962oe).A0y("page_linking_request", A0b);
        } else {
            abstractC59962oe = this.A00;
            AbstractC31174DnI.A0I(abstractC59962oe).A0y("page_linking_request", extras);
        }
        AbstractC25226BEj.A1P(abstractC59962oe);
    }
}
