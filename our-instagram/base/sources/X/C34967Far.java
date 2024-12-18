package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Far, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34967Far {
    public final UserSession A00;
    public final InterfaceC11380iw A01;
    public final C1QE A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public static C19280xC A00(C34967Far c34967Far, Integer num) {
        String str;
        C1QE c1qe = c34967Far.A02;
        C19280xC A00 = C19280xC.A00(c34967Far.A01, "ig_live_reshare_waterfall");
        C1QH.A02(A00, c1qe);
        switch (num.intValue()) {
            case 0:
                str = "reshare_list_opened";
                break;
            case 1:
                str = "candidate_selected";
                break;
            case 2:
                str = "candidate_deselected";
                break;
            default:
                str = "reshare_sent";
                break;
        }
        A00.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A00.A0C("a_pk", c34967Far.A04);
        A00.A0C(TraceFieldType.BroadcastId, c34967Far.A03);
        A00.A0C("m_pk", c34967Far.A08);
        A00.A0C(CacheBehaviorLogger.SOURCE, c34967Far.A07);
        A00.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c34967Far.A06);
        A00.A0C("live_module", c34967Far.A05);
        return A00;
    }

    public C34967Far(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = userSession;
        this.A01 = interfaceC11380iw;
        C1QE A00 = C1QE.A00(interfaceC11380iw, getClass().getName());
        this.A02 = A00;
        A00.A08();
        this.A03 = str;
        this.A08 = str2;
        this.A04 = str3;
        this.A05 = str6;
        this.A07 = str4;
        this.A06 = str5;
    }
}
