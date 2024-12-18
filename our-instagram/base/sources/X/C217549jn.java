package X;

import android.content.Context;
import com.facebook.odin.model.OdinContext;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.9jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217549jn extends AbstractC18280vF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC73623Ro A01;
    public final /* synthetic */ OdinContext A02;
    public final /* synthetic */ UserSession A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C217549jn(Context context, InterfaceC73623Ro interfaceC73623Ro, OdinContext odinContext, UserSession userSession) {
        super("ig_story_predict_and_cache", 1109658103, 5, false, false);
        this.A02 = odinContext;
        this.A01 = interfaceC73623Ro;
        this.A03 = userSession;
        this.A00 = context;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        OdinContext odinContext = this.A02;
        InterfaceC73623Ro interfaceC73623Ro = this.A01;
        UserSession userSession = this.A03;
        Context context = this.A00;
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A07(c03250Di);
        C4QF c4qf = (C4QF) C4QD.A00(userSession).A02.getValue();
        C3RT c3rt = new C3RT(userSession);
        InterfaceC10260gi interfaceC10260gi = c3rt.A00;
        if (interfaceC10260gi != null && interfaceC10260gi.BP2(36599228806991331L) > 0) {
            long A00 = c4qf.A00("last_prediction_time", -1L);
            long now = c03250Di.now() - A00;
            interfaceC10260gi.BP2(36599228807056868L);
            if (A00 == -1 || now > interfaceC10260gi.BP2(36599228807056868L) * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                C3SN E59 = C3RV.A00(context, c3rt, userSession).E59(interfaceC73623Ro, odinContext);
                if (E59.A02) {
                    Number number = (Number) E59.A00;
                    number.doubleValue();
                    c4qf.A04("prediction_score", (float) number.doubleValue());
                    c4qf.A05("last_prediction_time", System.currentTimeMillis());
                }
            }
        }
    }
}
