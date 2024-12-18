package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import kotlin.Deprecated;

/* renamed from: X.6jf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147036jf {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final String A04;

    public C147036jf(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(userSession, 2);
        this.A01 = interfaceC11380iw;
        this.A03 = userSession;
        this.A04 = interfaceC11380iw.getModuleName();
        this.A02 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A01(Boolean bool, Integer num, String str) {
        C18920wW c18920wW = this.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "contact_import_upsell_impression");
        A00.AAP("module", this.A04);
        A00.AAP("view_module", str);
        A00.A8p("position", num);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, null);
        A00.A7v("is_partial_ci", bool);
        A00.Cht();
        this.A00 = true;
    }

    public final void A03(Integer num, String str, boolean z) {
        C18920wW c18920wW = this.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "contact_import_upsell_dismissed");
        A00.AAP("module", this.A04);
        A00.AAP("view_module", str);
        A00.A8p("position", num);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, null);
        A00.A7v("is_partial_ci", Boolean.valueOf(z));
        A00.Cht();
    }

    @Deprecated(message = "Use logContactImportUpsellImpression instead")
    public final void A00() {
        C18920wW c18920wW = this.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "inline_ci_upsell_impression");
        A00.AAP("module", this.A04);
        A00.Cht();
        this.A00 = true;
    }

    public final void A02(Boolean bool, Integer num, String str, String str2) {
        C18920wW c18920wW = this.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "contact_import_upsell_clicked");
        A00.AAP("module", this.A04);
        A00.AAP("view_module", str);
        A00.A8p("position", num);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        A00.A7v("is_partial_ci", bool);
        A00.Cht();
    }

    public final void A04(Integer num, String str, boolean z) {
        String str2;
        C18920wW c18920wW = this.A02;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "contacts_import_permissions_popup");
        switch (num.intValue()) {
            case 0:
                str2 = "step_view_loaded";
                break;
            case 1:
                str2 = "access_granted";
                break;
            case 2:
                str2 = "access_granted_from_system_settings";
                break;
            case 3:
                str2 = AbstractC58317Pt9.A00(663);
                break;
            case 4:
                str2 = "access_denied_from_system_settings";
                break;
            default:
                str2 = "access_denied_dont_ask";
                break;
        }
        A00.AAP("request_result", str2);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A00.AAP("module", this.A04);
        A00.A7v("is_partial_ci", Boolean.valueOf(z));
        A00.Cht();
    }
}
