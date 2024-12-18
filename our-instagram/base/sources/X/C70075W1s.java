package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.W1s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70075W1s {
    public final UserSession A00;
    public final InterfaceC09390do A01;

    public C70075W1s(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A01(new X31(this, 3));
    }

    public static final void A00(C70075W1s c70075W1s, String str, String str2, String str3, String str4, String str5) {
        C18920wW c18920wW = (C18920wW) c70075W1s.A01.getValue();
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ipi_cache_event");
        A00.AAP("event", str);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A00.AAP("flow_id", str4);
        A00.AAP("error_identifier", str5);
        A00.Cht();
    }
}
