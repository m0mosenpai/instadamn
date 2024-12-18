package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: X.GhA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37615GhA {
    public String A00;
    public String A01;
    public String A02;
    public final UserSession A03;
    public final C37540Gfw A04;

    public C37615GhA(UserSession userSession, C37540Gfw c37540Gfw) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = c37540Gfw;
    }

    public static final C1ON A00(C37615GhA c37615GhA) {
        JSONArray jSONArray = new JSONArray();
        String str = c37615GhA.A01;
        if (str != null) {
            Iterator it = AbstractC001900j.A0Q(str, new char[]{','}, 0).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        }
        String A19 = AbstractC166987dD.A19(jSONArray);
        c37615GhA.A01 = null;
        C1ON A03 = AbstractC37797GkC.A03(null, c37615GhA.A03, A19);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgResponse, com.instagram.api.response.IgResponse>");
        return A03;
    }

    public static final C1ON A01(C37615GhA c37615GhA, String str) {
        String str2 = c37615GhA.A00;
        if (str2 == null && c37615GhA.A02 == null && c37615GhA.A01 == null) {
            return null;
        }
        if (c37615GhA.A01 != null) {
            return A00(c37615GhA);
        }
        C1ON A04 = AbstractC37797GkC.A04(c37615GhA.A03, str2, c37615GhA.A02, str);
        C14360o3.A0C(A04, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgResponse, com.instagram.api.response.IgResponse>");
        c37615GhA.A00 = null;
        c37615GhA.A02 = null;
        return A04;
    }

    public static final Object A02(C37615GhA c37615GhA, InterfaceC23621Ds interfaceC23621Ds, InterfaceC19390xP interfaceC19390xP) {
        if (interfaceC19390xP != null) {
            Object A01 = AbstractC18560vj.A01(interfaceC23621Ds, JX4.A03(new D4r(c37615GhA, null, 23), JX4.A04(new C57153PYx(c37615GhA, null, 23), JX4.A02(new C43203J8a(c37615GhA, 5), interfaceC19390xP))));
            if (A01 == C1JX.A02) {
                return A01;
            }
        }
        return C0eB.A00;
    }
}
