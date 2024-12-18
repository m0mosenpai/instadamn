package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6i6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146086i6 {
    public Map A00 = AbstractC06930Yk.A0E();
    public final C1QT A01;

    public final void A00(EnumC39559HdV enumC39559HdV) {
        C14360o3.A0B(enumC39559HdV, 0);
        Number number = (Number) this.A00.get(enumC39559HdV);
        if (number != null) {
            this.A01.flowEndSuccess(number.longValue());
        }
        this.A00 = AbstractC06930Yk.A09(enumC39559HdV, this.A00);
    }

    public final void A01(EnumC39559HdV enumC39559HdV, String str) {
        C14360o3.A0B(enumC39559HdV, 0);
        Number number = (Number) this.A00.get(enumC39559HdV);
        if (number != null) {
            long longValue = number.longValue();
            C1QT c1qt = this.A01;
            if (str == null) {
                str = "Null error message";
            }
            c1qt.flowEndFail(longValue, str, null);
        }
        this.A00 = AbstractC06930Yk.A09(enumC39559HdV, this.A00);
    }

    public final void A02(EnumC39559HdV enumC39559HdV, String str, String str2, String str3) {
        Number number;
        C14360o3.A0B(enumC39559HdV, 0);
        C14360o3.A0B(str2, 2);
        if (this.A00.containsKey(enumC39559HdV) && (number = (Number) this.A00.get(enumC39559HdV)) != null) {
            this.A01.flowEndCancel(number.longValue(), CancelReason.USER_CANCELLED);
        }
        C1QT c1qt = this.A01;
        long generateNewFlowId = c1qt.generateNewFlowId(enumC39559HdV.A00);
        this.A00 = AbstractC06930Yk.A0C(this.A00, new C09530e4(enumC39559HdV, Long.valueOf(generateNewFlowId)));
        c1qt.flowStart(generateNewFlowId, new UserFlowConfig(str, false));
        c1qt.flowAnnotate(generateNewFlowId, "event_type", str2);
        c1qt.flowAnnotate(generateNewFlowId, "adgroup_id", str3);
    }

    public C146086i6(UserSession userSession) {
        this.A01 = C1QS.A00(userSession);
    }
}
