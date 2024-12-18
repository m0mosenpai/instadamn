package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.GFu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36699GFu implements C08V {
    public static final C36699GFu A00 = new Object();

    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        EnumC33445EqI A002;
        String str2;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, MSV.A00(10));
        C102884kP c102884kP = (C102884kP) A03;
        List list = c6fw.A00;
        C1338462s c1338462s = (C1338462s) list.get(1);
        if (list.size() >= 4) {
            str = AbstractC31180DnO.A0l(list);
        } else {
            str = null;
        }
        String str3 = "";
        String A0E = c102884kP.A0E();
        if (A0E != null) {
            str3 = A0E;
        }
        if (AbstractC001900j.A0T(str3)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str3);
        String string = jSONObject.getString("headers");
        String string2 = jSONObject.getString("registration_response");
        C09Y c09y = C023409i.A0A;
        C07270a1 A032 = c09y.A03(A00);
        C14360o3.A0A(string);
        try {
            Object A09 = new Gson().A09(string, new C60850RVx().type);
            C14360o3.A07(A09);
            Map map = (Map) A09;
            HashMap A1G = AbstractC166987dD.A1G();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                Object key = A1K.getKey();
                List asList = Arrays.asList((String) A1K.getValue());
                C14360o3.A07(asList);
                A1G.put(key, asList);
            }
            new C1JO(A032).FA4(new java.net.URI("https://i.instagram.com/api/v1/bloks/apps/com.bloks.www.bloks.caa.reg.tos.async/"), A1G);
            C24431Hm A003 = C24431Hm.A00(A032);
            C14360o3.A07(A003);
            Iterator A152 = AbstractC166997dE.A15(map);
            while (true) {
                if (A152.hasNext()) {
                    Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                    String A17 = AbstractC31172DnG.A17(A1K2);
                    String str4 = (String) A1K2.getValue();
                    if (A17 != null && A17.equalsIgnoreCase("X-IG-Set-WWW-Claim")) {
                        if (str4.length() > 0) {
                            A003.A02(str4);
                            A003.A00 = "contextChange3";
                        } else {
                            str2 = "contextChange3_empty";
                        }
                    }
                } else {
                    str2 = "contextChange3_missing";
                    break;
                }
            }
            A003.A01 = str2;
        } catch (C90063zm e) {
            C24431Hm A004 = C24431Hm.A00(A032);
            C14360o3.A07(A004);
            A004.A01 = "contextChange3_exception";
            C0K8.A0F("BKBloksActionCaaHandleLoginResponseForContextChangeImpl", "Exception parsing JSON", e);
        }
        try {
            EDQ parseFromJson = C34837FWu.parseFromJson(C16V.A00(string2));
            User user = parseFromJson.A01;
            C14360o3.A07(user);
            if (str == null) {
                A002 = EnumC33445EqI.A05;
            } else {
                A002 = AbstractC34347FCp.A00(str);
            }
            if (A002 == null) {
                A002 = EnumC33445EqI.A05;
            }
            new C33085Eii(C6BQ.A01(c6fq), c6fq, A032, new RegFlowExtras(), A002).A02(parseFromJson);
            if (c1338462s != null) {
                C6FG c6fg = c6fq.A03;
                C14360o3.A0C(c6fg, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
                Bundle A092 = AbstractC31176DnK.A09(user.getId());
                A092.putBoolean("IS_SIGN_UP_FLOW", true);
                UserSession A06 = c09y.A06(A092);
                Fragment fragment = ((C62862tP) c6fg.A02).A02;
                fragment.getClass();
                C14360o3.A0C(fragment, "null cannot be cast to non-null type com.instagram.base.fragment.IgDialogFragmentCompat");
                C62862tP A033 = C62862tP.A03(fragment, A06, null);
                C66246U5q A005 = C66246U5q.A00(c1338462s);
                Context context = c6fg.A00;
                C6FW c6fw2 = C6FW.A01;
                C16920sk c16920sk = C16920sk.A00;
                C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                return C6FP.A02(context, A005, A033, c6fw2, c16920sk);
            }
        } catch (JSONException unused) {
        }
        return null;
    }
}
