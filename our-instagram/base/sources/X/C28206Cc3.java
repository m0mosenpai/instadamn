package X;

import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Cc3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28206Cc3 {
    public final Context A00;
    public final UserSession A01;

    public C28206Cc3(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void A01(InterfaceC83733oI interfaceC83733oI, User user, long j) {
        C14360o3.A0B(user, 0);
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A01;
        if (c08730cb.A01(userSession).A1u() && !A00(this)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A0v;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (j > AbstractC166987dD.A0N(interfaceC16530ry.CES(A00, c0yrArr[528]))) {
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                A002.A0v.Egi(A002, Long.valueOf(j), c0yrArr[528]);
                String fbidV2 = user.A03.getFbidV2();
                if (fbidV2 != null) {
                    C30172DRc c30172DRc = new C30172DRc(46, user, interfaceC83733oI, this);
                    C40701ud A01 = AbstractC40691uc.A01(userSession);
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    A0b.A04("consumer_fbid", fbidV2);
                    C1Dk ensureCacheWrite = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "DetectedOutcomesNuxQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59384Qdh.class, false, null, 0, null, "xfb_should_show_ig_detected_outcomes_nux", AbstractC166987dD.A1E()).setMaxToleratedCacheAgeMs(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT).setFreshCacheAgeMs(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT).setEnsureCacheWrite(false);
                    A01.ATV(C28908CpH.A00, new C28911CpL(c30172DRc, 5), ensureCacheWrite);
                }
            }
        }
    }

    public static final boolean A00(C28206Cc3 c28206Cc3) {
        C23031Ai A00 = AbstractC23021Ah.A00(c28206Cc3.A01);
        return AbstractC167017dG.A1b(A00, A00.A35, C23031Ai.A8c, 526);
    }
}
