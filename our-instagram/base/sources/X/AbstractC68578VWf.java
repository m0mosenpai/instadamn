package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VWf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68578VWf {
    public static void A00(UserSession userSession, Integer num, String str, String str2, String str3, List list) {
        if (list == null) {
            list = new ArrayList();
        }
        String A00 = AbstractC68581VWi.A00(num);
        long A06 = AbstractC31177DnL.A06();
        String A0j = AbstractC167017dG.A0j();
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            A0S.A0r("input");
            A0S.A0d();
            A0S.A0S(AbstractC111324zv.A00(2578), str);
            A0S.A0S("survey_id", str2);
            A0S.A0S("impression_event", A00);
            A0S.A0S("session_blob", str3);
            Iterator A0q = AbstractC37301Gc2.A0q(A0S, "context", list);
            while (A0q.hasNext()) {
                VgG vgG = (VgG) A0q.next();
                if (vgG != null) {
                    A0S.A0d();
                    String str4 = vgG.A00;
                    if (str4 != null) {
                        A0S.A0S(AbstractC111324zv.A00(846), str4);
                    }
                    String str5 = vgG.A01;
                    if (str5 != null) {
                        A0S.A0S(AbstractC111324zv.A00(847), str5);
                    }
                    A0S.A0a();
                }
            }
            A0S.A0Z();
            A0S.A0R("device_time", A06);
            A0S.A0S("client_mutation_id", A0j);
            A0S.A0S("actor_id", "0");
            A0S.A0a();
            C907642p c907642p = new C907642p(OP9.class, "StructuredSurveyEventLoggingMutation", AbstractC167017dG.A0l(A0S, stringWriter), false);
            C66081TzI c66081TzI = new C66081TzI(num, 39);
            C14360o3.A0B(userSession, 0);
            C907542o c907542o = new C907542o(userSession);
            c907542o.A09(c907642p);
            Integer num2 = C05F.A00;
            c907542o.A08 = "ads_viewer_context_policy";
            C1ON A07 = c907542o.A07(num2);
            A07.A00 = c66081TzI;
            C1GJ.A06(A07, 224, 4, false, false);
        } catch (IOException e) {
            C0K8.A0G("RapidFeedbackAnalyticsUtil", AbstractC111324zv.A00(629), e);
        }
    }
}
