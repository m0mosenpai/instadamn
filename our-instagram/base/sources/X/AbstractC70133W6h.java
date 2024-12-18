package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.W6h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70133W6h {
    public static final AbstractC192798gL A01(BaseFragmentActivity baseFragmentActivity, UserSession userSession, Integer num, String str, String str2, String str3) {
        int i;
        AbstractC167007dF.A1K(baseFragmentActivity, userSession);
        switch (num.intValue()) {
            case 0:
                i = 2928;
                break;
            case 1:
                i = 259;
                break;
            default:
                i = 344;
                break;
        }
        String A00 = AbstractC111324zv.A00(i);
        LinkedHashMap A02 = A02(str3);
        List<C09530e4> A1Q = AbstractC16960so.A1Q(AbstractC167007dF.A1b(VEA.A08, "unknown", AbstractC167007dF.A0o(VEA.A04, 0), new C09530e4(VEA.A03, "")));
        JSONObject jSONObject = new JSONObject();
        for (C09530e4 c09530e4 : A1Q) {
            jSONObject.put(((VEA) c09530e4.A00).A00, c09530e4.A01);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC166997dE.A1R(VEA.A09, str, arrayList);
        AbstractC166997dE.A1R(VEA.A0B, A00, arrayList);
        AbstractC166997dE.A1R(VEA.A0C, str2, arrayList);
        AbstractC166997dE.A1R(VEA.A0G, 4, arrayList);
        AbstractC166997dE.A1R(VEA.A07, "promote_prevalidation_cal_fallback", arrayList);
        AbstractC166997dE.A1R(VEA.A0E, "promote_unknown_exception", arrayList);
        VEA vea = VEA.A0A;
        JSONObject jSONObject2 = new JSONObject();
        Iterator A0l = AbstractC167007dF.A0l(A02);
        while (A0l.hasNext()) {
            String str4 = (String) A0l.next();
            jSONObject2.put(str4, A02.get(str4));
        }
        AbstractC166997dE.A1R(vea, jSONObject2, arrayList);
        AbstractC166997dE.A1R(VEA.A05, jSONObject, arrayList);
        JSONObject jSONObject3 = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C09530e4 c09530e42 = (C09530e4) it.next();
            jSONObject3.put(((VEA) c09530e42.A00).A00, c09530e42.A01);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("server_params", jSONObject3);
        AbstractC192798gL A05 = C192108fB.A05(userSession, "com.bloks.www.ig_promote.linking.async_flow_controller", AbstractC167017dG.A0r("params", AbstractC166987dD.A19(jSONObject4)));
        A05.A00(new C32393EOu(2, baseFragmentActivity, num, userSession));
        return A05;
    }

    public static final AbstractC192798gL A00(BaseFragmentActivity baseFragmentActivity, UserSession userSession, Integer num, String str) {
        int i;
        C14360o3.A0B(userSession, 1);
        switch (num.intValue()) {
            case 1:
                i = 259;
                break;
            case 2:
                i = 344;
                break;
            case 3:
                i = 1182;
                break;
            default:
                i = 501;
                break;
        }
        String A00 = AbstractC111324zv.A00(i);
        LinkedHashMap A02 = A02(null);
        ArrayList arrayList = new ArrayList();
        AbstractC166997dE.A1R(VEA.A09, "fulcrum_nexus", arrayList);
        AbstractC166997dE.A1R(VEA.A0B, A00, arrayList);
        AbstractC166997dE.A1R(VEA.A0C, str, arrayList);
        AbstractC166997dE.A1R(VEA.A0G, 4, arrayList);
        VEA vea = VEA.A0A;
        JSONObject jSONObject = new JSONObject();
        Iterator A0l = AbstractC167007dF.A0l(A02);
        while (A0l.hasNext()) {
            String str2 = (String) A0l.next();
            jSONObject.put(str2, A02.get(str2));
        }
        AbstractC166997dE.A1R(vea, jSONObject, arrayList);
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C09530e4 c09530e4 = (C09530e4) it.next();
            jSONObject2.put(((VEA) c09530e4.A00).A00, c09530e4.A01);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("server_params", jSONObject2);
        AbstractC192798gL A022 = C192108fB.A02(null, userSession, "com.bloks.www.ig_promote.linking.async_flow_controller", AbstractC167017dG.A0r("params", AbstractC166987dD.A19(jSONObject3)));
        A022.A00(new C32393EOu(2, baseFragmentActivity, num, userSession));
        return A022;
    }

    public static final LinkedHashMap A02(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = C67908V1x.A00.A00;
        if (j != 0) {
            int i = (int) (j >>> 32);
            if (Integer.valueOf(i) != null) {
                linkedHashMap.put("boost_in_app_qpl_instance_id", String.valueOf(i));
            }
        }
        if (str != null) {
            linkedHashMap.put("selected_audio_spec", str);
        }
        return linkedHashMap;
    }
}
