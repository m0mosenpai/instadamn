package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.leadads.repository.LeadFormRepository;

/* loaded from: classes9.dex */
public final class NOb extends AbstractC50967Mfa {
    public final C152406tQ A00;
    public final P4V A01;
    public final LeadFormRepository A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final UserSession A07;

    public NOb(C152406tQ c152406tQ, UserSession userSession, P4V p4v, LeadFormRepository leadFormRepository) {
        AbstractC167017dG.A1Q(userSession, p4v);
        this.A07 = userSession;
        this.A00 = c152406tQ;
        this.A01 = p4v;
        this.A02 = leadFormRepository;
        Object A00 = c152406tQ.A00("adID");
        if (A00 != null) {
            this.A03 = (String) A00;
            String A0h = AbstractC50522MSa.A0h(c152406tQ, "trackingToken");
            this.A06 = A0h == null ? "" : A0h;
            this.A04 = AbstractC50522MSa.A0h(c152406tQ, "dynamicItemID");
            this.A05 = AbstractC50522MSa.A0h(c152406tQ, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
