package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;

/* renamed from: X.Mdl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50854Mdl extends C9U7 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.C9U7
    public final AbstractC52922bZ A02(C152406tQ c152406tQ, Class cls, String str) {
        OLJ olj;
        O87 o87;
        boolean A1b = AbstractC25233BEq.A1b(str, cls, c152406tQ);
        String str2 = (String) c152406tQ.A00("formID");
        if (str2 != null) {
            olj = OVX.A01.A00(str2);
        } else {
            olj = null;
        }
        LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) c152406tQ.A00("arg_profile_content_info");
        String str3 = (String) c152406tQ.A00("arg_form_page_type");
        if (olj != null) {
            UserSession userSession = this.A01;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            String A0h = AbstractC50522MSa.A0h(c152406tQ, "adID");
            String A0h2 = AbstractC50522MSa.A0h(c152406tQ, "trackingToken");
            String A0h3 = AbstractC50522MSa.A0h(c152406tQ, "ad_creation_source");
            if (A0h3 == null) {
                A0h3 = "UNKNOWN";
            }
            String A0h4 = AbstractC50522MSa.A0h(c152406tQ, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (A0h4 == null) {
                A0h4 = C2Fb.A49.toString();
            }
            P4V p4v = new P4V(interfaceC11380iw, userSession, A0h, A0h2, str2, A0h3, A0h4, (String) c152406tQ.A00("advertiser_fbidv2"), this.A02, C55226Oet.A08(olj), olj.A02(), AbstractC167007dF.A1W(olj.A00.A00), AbstractC166997dE.A1Z(c152406tQ.A00("is_form_extension"), A1b));
            String A0h5 = AbstractC50522MSa.A0h(c152406tQ, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (A0h5 == null) {
                A0h5 = C2Fb.A49.toString();
            }
            o87 = new O87(p4v, A0h5);
        } else {
            o87 = null;
        }
        return new C50996Mg3(this.A01, o87, leadGenProfileContentInfo, str3);
    }

    public C50854Mdl(Bundle bundle, InterfaceC08430c6 interfaceC08430c6, InterfaceC11380iw interfaceC11380iw) {
        super(bundle, interfaceC08430c6);
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC31171DnF.A0G(bundle);
        this.A02 = C55226Oet.A03(bundle);
    }
}
