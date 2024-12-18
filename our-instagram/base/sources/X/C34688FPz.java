package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.FPz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34688FPz {
    public boolean A01;
    public String A00 = "";
    public boolean A03 = true;
    public boolean A02 = true;

    public final void A00(InterfaceC37146GYh interfaceC37146GYh, UserSession userSession, C1GL c1gl, String str) {
        AbstractC167017dG.A1Q(userSession, str);
        this.A02 = false;
        C35927Ftl c35927Ftl = new C35927Ftl(interfaceC37146GYh, this);
        String str2 = this.A00;
        C14360o3.A0B(str2, 4);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("business/discovery/suggest_business/");
        A0M.A0R(ECM.class, FTN.class);
        A0M.A9s(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        C1ON A0T = AbstractC31172DnG.A0T(A0M, "seen_ids", str2);
        C32548EUy.A01(A0T, c35927Ftl, 33);
        c1gl.schedule(A0T);
    }
}
