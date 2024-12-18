package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;

/* renamed from: X.FbS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34995FbS {
    public static final C34995FbS A00 = new Object();

    public final C72743Nv A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, HashMap hashMap) {
        AbstractC167017dG.A1N(fragmentActivity, userSession);
        C006802i.A0p.markerStart(790826917, 0);
        C006802i c006802i = C006802i.A0p;
        c006802i.markerAnnotate(790826917, AbstractC50532MSl.A00(), 0);
        c006802i.markerAnnotate(790826917, "analytics_module", interfaceC11380iw.getModuleName());
        c006802i.markerAnnotate(790826917, "location", str);
        c006802i.markerAnnotate(790826917, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        c006802i.markerAnnotate(790826917, "nua_action", str3);
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(372), hashMap);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(fragmentActivity, A0C, 2131965132);
        A0C.A03 = C32375EOb.A00;
        A0C.A0l = C18U.A06(C06090Tz.A05, userSession, 2342158400810388657L);
        return W6d.A02(A0C, A01);
    }
}
