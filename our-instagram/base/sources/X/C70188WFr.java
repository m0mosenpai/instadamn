package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.WFr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70188WFr {
    public static final C70188WFr A00 = new Object();

    public static final void A02(C1P1 c1p1, UserSession userSession, String str) {
        C907642p c907642p = new C907642p(C69954VyU.class, "StructuredSurveyQuery", AbstractC13670mt.A06("{\"%s\":\"%s\"}", "0", str), true);
        C907542o c907542o = new C907542o(userSession);
        c907542o.A09(c907642p);
        Integer num = C05F.A00;
        c907542o.A08 = "ads_viewer_context_policy";
        C1ON A07 = c907542o.A07(num);
        A07.A00 = c1p1;
        C1GJ.A06(A07, 221, 3, false, false);
    }

    public static final void A00(Activity activity, UserSession userSession, C69127ViI c69127ViI, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String A002;
        Bundle A003;
        if (c69127ViI != null && str2 != null && str3 != null) {
            try {
                String A004 = AbstractC69952VyS.A00(c69127ViI);
                if (C1VN.A00 != null) {
                    if (z) {
                        A002 = AbstractC111324zv.A00(5152);
                        C14360o3.A0A(A004);
                        AbstractC37302Gc3.A1U(str6, A004);
                        A003 = AbstractC61636Rr0.A00(new C09530e4("ARG_INTEGRATION_POINT_ID", str), new C09530e4("ARG_SURVEY_ID", str2), new C09530e4("ARG_SESSION_BLOB", str3), new C09530e4("ARG_OUTRO_TOAST_TEXT", str6), new C09530e4("ARG_SERIALIZED_MODEL_DATA", A004));
                    } else {
                        A002 = AbstractC111324zv.A00(5151);
                        C14360o3.A0A(A004);
                        AbstractC25233BEq.A0x(3, str4, str5, str6);
                        C14360o3.A0B(A004, 6);
                        A003 = AbstractC61636Rr0.A00(new C09530e4("ARG_SERIALIZED_MODEL_DATA", A004), new C09530e4("ARG_TOAST_TEXT", str4), new C09530e4("ARG_INTRO_TOAST_BUTTON", str5), new C09530e4("ARG_OUTRO_TOAST_TEXT", str6), new C09530e4("ARG_INTEGRATION_POINT_ID", str), new C09530e4("ARG_SURVEY_ID", str2), new C09530e4("ARG_SESSION_BLOB", str3));
                    }
                    AbstractC25228BEl.A1G(activity, A003, userSession, TransparentModalActivity.class, A002);
                    return;
                }
                return;
            } catch (IOException unused) {
                return;
            }
        }
        C9GR.A0F(activity.getApplicationContext(), "rapid_feedback_survey_error", 2131964551);
    }

    public static final void A01(Activity activity, UserSession userSession, V42 v42, String str, boolean z) {
        String A0p;
        String A0p2;
        String str2;
        C69129ViK c69129ViK = v42.A00;
        if (c69129ViK != null) {
            String A0p3 = AbstractC166997dE.A0p(activity, 2131974782);
            C69130ViL c69130ViL = c69129ViK.A01;
            C69127ViI c69127ViI = null;
            if (c69130ViL == null || (A0p = c69130ViL.A01) == null || A0p.length() == 0) {
                A0p = AbstractC166997dE.A0p(activity, 2131974783);
            }
            C69130ViL c69130ViL2 = c69129ViK.A01;
            if (c69130ViL2 == null || (A0p2 = c69130ViL2.A02) == null || A0p2.length() == 0) {
                A0p2 = AbstractC166997dE.A0p(activity, 2131974784);
            }
            C69009Vfl c69009Vfl = c69129ViK.A00;
            if (c69009Vfl != null) {
                str2 = c69009Vfl.A01;
                c69127ViI = c69009Vfl.A00;
            } else {
                str2 = null;
            }
            A00(activity, userSession, c69127ViI, str, str2, c69129ViK.A02, A0p, A0p3, A0p2, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.VgI] */
    public static final void A03(C1P1 c1p1, UserSession userSession, String str, Map map) {
        ArrayList arrayList;
        String A06;
        try {
            if (Systrace.A0E(1L)) {
                C0fO.A01("fetchSurvey", -4234951);
            }
            if (map == null) {
                map = new HashMap();
            }
            if (map.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry entry = (Map.Entry) A15.next();
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    ?? obj = new Object();
                    obj.A00 = str2;
                    obj.A01 = str3;
                    arrayList.add(obj);
                }
            }
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0S = AbstractC167007dF.A0S(stringWriter);
                A0S.A0S("0", str);
                if (arrayList != null) {
                    C16V.A03(A0S, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        VgI vgI = (VgI) it.next();
                        if (vgI != null) {
                            A0S.A0d();
                            String str4 = vgI.A00;
                            if (str4 != null) {
                                A0S.A0S(AbstractC111324zv.A00(846), str4);
                            }
                            String str5 = vgI.A01;
                            if (str5 != null) {
                                A0S.A0S(AbstractC111324zv.A00(847), str5);
                            }
                            A0S.A0a();
                        }
                    }
                    A0S.A0Z();
                }
                A06 = AbstractC167017dG.A0l(A0S, stringWriter);
            } catch (IOException e) {
                C0K8.A0G("RapidFeedbackApiUtil", "Error serializing to JSON; use simple integration id as input", e);
                A06 = AbstractC13670mt.A06("{\"%s\":\"%s\"}", "0", str);
            }
            C907642p c907642p = new C907642p(C69955VyV.class, "SurveyIntegrationPointQuery", A06, true);
            C907542o c907542o = new C907542o(userSession);
            c907542o.A09(c907642p);
            Integer num = C05F.A00;
            c907542o.A08 = "ads_viewer_context_policy";
            C1ON A07 = c907542o.A07(num);
            A07.A00 = c1p1;
            C1GJ.A06(A07, 220, 3, false, false);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1934863485);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(2127855927);
            }
            throw th;
        }
    }

    public final void A04(Activity activity, UserSession userSession, V41 v41, String str, boolean z) {
        A00(activity, userSession, v41.A00, AbstractC111324zv.A00(3465), str, "", activity.getString(2131974783), activity.getString(2131974782), activity.getString(2131974784), z);
    }
}
