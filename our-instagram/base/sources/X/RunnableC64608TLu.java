package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.TLu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64608TLu implements Runnable {
    public final /* synthetic */ C2052096l A00;

    public RunnableC64608TLu(C2052096l c2052096l) {
        this.A00 = c2052096l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2052096l c2052096l = this.A00;
        if (c2052096l.A02 != null && C2052096l.A00(c2052096l)) {
            Context context = c2052096l.A04;
            String string = context.getResources().getString(2131973333);
            UserSession userSession = c2052096l.A05;
            C116155Nu c116155Nu = new C116155Nu(new C50B(0, 0), null, false, false, true, null, string, "webview", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, "session_level_survey", "session_level_survey", userSession.userId, null, null, null, null);
            Intent A0C = AbstractC58318PtA.A0C();
            A0C.addCategory("android.intent.category.BROWSABLE");
            String str = c2052096l.A02;
            if (str != null) {
                A0C.setData(AbstractC08820cl.A03(str));
                C04750Mt A0R = MSZ.A0R(context, A0C);
                ArrayList A17 = AbstractC25225BEi.A17(4);
                List asList = Arrays.asList("https");
                if (!asList.isEmpty()) {
                    A17.add(new R7S(asList));
                    A17.add(new R7R(Arrays.asList("/survey/")));
                    AbstractC08800ci A00 = S1J.A00(A17);
                    ((C08150bd) A0R).A01 = ((C08150bd) A0R).A01 | 1 | 4;
                    A0R.A07(A00);
                    A0R.A08 = new C1QF(MSV.A00(792)).A00;
                    PendingIntent A01 = A0R.A01(context, 19602, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                    String str2 = userSession.userId;
                    String str3 = c116155Nu.A0X;
                    C14360o3.A07(str3);
                    C14360o3.A0B(str2, 0);
                    XN9 A04 = AbstractC55212OeW.A04(context, c116155Nu, userSession, "session_level_survey", AnonymousClass001.A0T(str2, str3, '_'));
                    A04.A0C = A01;
                    Notification A03 = A04.A03();
                    ArrayList A10 = AbstractC31174DnI.A10(A03);
                    A10.add("session_level_survey");
                    C1X8.A00().A02(new C47690L3x(A03, c116155Nu, A10), userSession, null, "session_level_survey_notification", 0);
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    long currentTimeMillis = System.currentTimeMillis();
                    InterfaceC19610xo ARD = A002.A01.ARD();
                    ARD.E7G("last_session_survey_notification_seen_timestamp_ms", currentTimeMillis);
                    ARD.apply();
                    c2052096l.A03 = true;
                    return;
                }
                throw AbstractC166987dD.A12("Cannot set 0 schemes");
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
