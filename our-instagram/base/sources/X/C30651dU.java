package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectThreadKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1dU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30651dU implements InterfaceC29301b7 {
    public static final C0KV A02 = C30661dV.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C206819Dm(this, 7));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.L3X, java.lang.Object] */
    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        String str2;
        C30631dS c30631dS = (C30631dS) c1ow;
        C14360o3.A0B(c30631dS, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        Object obj = c30631dS.C7R().get(0);
        C14360o3.A07(obj);
        String str3 = c30631dS.A06;
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, c30631dS, (DirectThreadKey) obj) && str3 != null && c19260xA != null) {
            C22845A5o c22845A5o = (C22845A5o) this.A01.getValue();
            String str4 = c30631dS.A02;
            if (str4 != null) {
                DirectPendingLayeredXma directPendingLayeredXma = c30631dS.A00;
                if (directPendingLayeredXma == null || (str2 = directPendingLayeredXma.A03) == null) {
                    str2 = "";
                }
                String str5 = c30631dS.A04;
                String str6 = c30631dS.A03;
                ?? obj2 = new Object();
                obj2.A00 = str4;
                obj2.A03 = str2;
                obj2.A02 = str5;
                obj2.A04 = str3;
                obj2.A01 = str6;
                AbstractC46926Kp7.A00(c22845A5o.A00).A02(EnumC46252KdU.COMMENT, EnumC46251KdT.SHARE, interfaceC37261GbE, c30631dS, obj2, null);
                C162337Ov.A0U(c19260xA);
                return;
            }
        } else {
            DirectThreadKey directThreadKey = c30631dS.A01;
            if (directThreadKey != null) {
                String str7 = c30631dS.A02;
                if (str7 != null) {
                    String str8 = c30631dS.A05;
                    String A06 = c30631dS.A06();
                    String str9 = ((C1OW) c30631dS).A05;
                    JTa jTa = ((C1OW) c30631dS).A02;
                    boolean z = jTa.A0A;
                    boolean z2 = c30631dS.A07;
                    String str10 = jTa.A04;
                    L1W l1w = jTa.A00;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("fbid", str7);
                        jSONObject.put("is_post_reply", z2);
                    } catch (JSONException unused) {
                        C0w9.A03("DirectMessageApi", "Error accessing comment id for post");
                    }
                    C25621Ms c25621Ms = new C25621Ms(userSession);
                    c25621Ms.A05();
                    c25621Ms.A0B("direct_v2/threads/broadcast/generic_share/");
                    c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
                    c25621Ms.A9s("client_context", A06);
                    c25621Ms.A9s("mutation_token", str9);
                    c25621Ms.A0H("text", str8);
                    c25621Ms.A0S(C40781ul.class, C55702hA.class);
                    LLX.A06(c25621Ms, AbstractC47211Ktk.A0Q, jSONObject);
                    if (str10 != null) {
                        LLX.A05(c25621Ms, l1w, A06, str9, str10, null, false, false, false);
                    }
                    if (z) {
                        c25621Ms.A9s("send_silently", "true");
                    }
                    LLX.A0A(c25621Ms, directThreadKey);
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                    C1GJ.A03(A0N);
                    return;
                }
            } else {
                str = "threadKey";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        str = "commentId";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C30651dU(UserSession userSession) {
        this.A00 = userSession;
    }
}
