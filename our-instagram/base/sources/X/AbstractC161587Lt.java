package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7Lt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC161587Lt {
    public static final void A02(UserSession userSession, DirectThreadKey directThreadKey, String str, List list) {
        if ((A06(list) && C18U.A06(C06090Tz.A05, userSession, 36318861935450801L)) || (!A06(list) && C18U.A06(C06090Tz.A05, userSession, 36318801801910771L))) {
            A01(userSession, AbstractC47132Ef.A00(userSession), directThreadKey, str, list, true, true);
        }
    }

    public static final void A03(final UserSession userSession, final String str, final List list) {
        C14360o3.A0B(list, 1);
        if (C18U.A06(C06090Tz.A05, userSession, 36327018073241853L)) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9j9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1155983366, 4, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC161587Lt.A04(userSession, str, list);
                }
            });
        } else {
            A04(userSession, str, list);
        }
    }

    public static final void A04(UserSession userSession, String str, List list) {
        if (A06(list) && str != null) {
            A01(userSession, AbstractC47132Ef.A00(userSession), C7P4.A00(new C83693oE(str)), str, list, false, true);
        }
    }

    public static final boolean A06(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C83403nh) it.next()).A1S()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.42m, X.Juj] */
    public static final C44931Juj A00(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((CTY) it.next()).A00);
            }
            jSONObject.put("args", jSONArray);
        } catch (JSONException unused) {
        }
        return new AbstractC907342m(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0100 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.session.UserSession r14, X.C47142Eg r15, com.instagram.model.direct.DirectThreadKey r16, java.lang.String r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC161587Lt.A01(com.instagram.common.session.UserSession, X.2Eg, com.instagram.model.direct.DirectThreadKey, java.lang.String, java.util.List, boolean, boolean):void");
    }

    public static final void A05(C83403nh c83403nh, List list, List list2, List list3, int i) {
        String A0h = c83403nh.A0h();
        if (A0h != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("message_id", A0h);
                } catch (JSONException unused) {
                }
                try {
                    jSONObject.put("server_content_ref", new JSONObject(c83403nh.A1o));
                } catch (JSONException unused2) {
                }
                list2.add(new CTY(jSONObject));
                list.add(c83403nh);
                if (list2.size() == i) {
                    list3.add(new C09530e4(A00(list2), ImmutableList.copyOf((Collection) list)));
                    list2.clear();
                    list.clear();
                }
                c83403nh.A2K = true;
            } catch (JSONException e) {
                C0K8.A0F("ReceiverFetchRequestHelper", "json exception when parsing receiverFetchParams", e);
            }
        }
    }
}
