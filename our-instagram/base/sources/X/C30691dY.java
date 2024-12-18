package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1dY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30691dY implements InterfaceC29301b7 {
    public static final C0KV A03 = C30701dZ.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C50160MDn(this, 32));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        String str;
        C30671dW c30671dW = (C30671dW) c1ow;
        C14360o3.A0B(c30671dW, 0);
        C14360o3.A0B(mnp, 1);
        String str2 = c30671dW.A02;
        if (!C14360o3.A0K(str2, "questions") && !C14360o3.A0K(str2, "daily_prompt")) {
            str = c30671dW.A03;
        } else {
            str = c30671dW.A04;
        }
        if (str != null && LCX.A01(mnp, c30671dW, this.A01)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        DirectThreadKey directThreadKey;
        String str2;
        C44996Jvm A00;
        JSONObject jSONObject;
        AbstractC47211Ktk abstractC47211Ktk;
        AnonymousClass442 anonymousClass442;
        C30671dW c30671dW = (C30671dW) c1ow;
        C14360o3.A0B(c30671dW, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        String str3 = c30671dW.A03;
        String str4 = c30671dW.A04;
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey2 = c30671dW.A01;
        if (directThreadKey2 != null) {
            if (AbstractC159387Cy.A00(userSession, c30671dW, directThreadKey2).A00()) {
                C47779L8e c47779L8e = (C47779L8e) this.A02.getValue();
                AnonymousClass442 anonymousClass4422 = c30671dW.A00;
                if (anonymousClass4422 != null) {
                    String str5 = anonymousClass4422.A0T;
                    String str6 = "";
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str7 = anonymousClass4422.A0R;
                    if (str7 == null) {
                        str7 = "";
                    }
                    C2EY c2ey = C2EY.A0z;
                    String str8 = anonymousClass4422.A0U;
                    String obj = EnumC46202Kce.PERMANENT_MEDIA_VIEWER.toString();
                    Boolean valueOf = Boolean.valueOf(anonymousClass4422.A05());
                    String str9 = c30671dW.A03;
                    if (str9 != null) {
                        str6 = str9;
                    }
                    anonymousClass442 = new AnonymousClass442(null, null, null, null, null, null, null, null, null, null, null, null, c2ey, null, null, null, valueOf, str7, str6, str5, obj, str8, null, null, null, 0L);
                } else {
                    anonymousClass442 = null;
                }
                JTa jTa = ((C1OW) c30671dW).A02;
                DirectThreadKey directThreadKey3 = (DirectThreadKey) c30671dW.C7R().get(0);
                String str10 = c30671dW.A05;
                if (str10 != null) {
                    C29271b4 c29271b4 = new C29271b4(anonymousClass442, jTa, null, directThreadKey3, C2EY.A0z, ((AbstractC29011ae) c30671dW).A02, Long.valueOf(((AbstractC29011ae) c30671dW).A00), str10);
                    new C19260xA();
                    c47779L8e.A01(null, interfaceC37261GbE, c29271b4);
                    return;
                }
            } else {
                String str11 = c30671dW.A02;
                if (C14360o3.A0K(str11, "questions")) {
                    directThreadKey = c30671dW.A01;
                    if (directThreadKey != null) {
                        if (str4 != null) {
                            str2 = c30671dW.A05;
                            if (str2 != null) {
                                A00 = AbstractC46912Kot.A00(((C1OW) c30671dW).A02);
                                jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("response_id", str4);
                                } catch (JSONException unused) {
                                    C0w9.A03("DirectMessageApi", "Error accessing response id or embedded type for this prompt response");
                                }
                                abstractC47211Ktk = AbstractC47211Ktk.A0E;
                                C25621Ms A002 = LLX.A00(userSession, abstractC47211Ktk, A00, directThreadKey, jSONObject);
                                A002.A9s("text", str2);
                                A002.A0S(C40781ul.class, C55702hA.class);
                                C1ON A0N = A002.A0N();
                                C14360o3.A0A(A0N);
                                A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                                C1GJ.A03(A0N);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } else {
                    boolean A0K = C14360o3.A0K(str11, "daily_prompt");
                    directThreadKey = c30671dW.A01;
                    if (directThreadKey != null) {
                        if (A0K) {
                            if (str4 != null) {
                                str2 = c30671dW.A05;
                                if (str2 != null) {
                                    A00 = AbstractC46912Kot.A00(((C1OW) c30671dW).A02);
                                    jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("response_id", str4);
                                    } catch (JSONException unused2) {
                                        C0w9.A03("DirectMessageApi", "Error accessing response id or embedded type for this prompt response");
                                    }
                                    abstractC47211Ktk = AbstractC47211Ktk.A06;
                                    C25621Ms A0022 = LLX.A00(userSession, abstractC47211Ktk, A00, directThreadKey, jSONObject);
                                    A0022.A9s("text", str2);
                                    A0022.A0S(C40781ul.class, C55702hA.class);
                                    C1ON A0N2 = A0022.A0N();
                                    C14360o3.A0A(A0N2);
                                    A0N2.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                                    C1GJ.A03(A0N2);
                                    return;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else if (str3 != null) {
                            str2 = c30671dW.A05;
                            if (str2 != null) {
                                A00 = AbstractC46912Kot.A00(((C1OW) c30671dW).A02);
                                jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("media_id", str3);
                                } catch (JSONException unused3) {
                                    C0w9.A03("DirectMessageApi", "Error accessing media id for this prompt response");
                                }
                                abstractC47211Ktk = AbstractC47211Ktk.A0L;
                                C25621Ms A00222 = LLX.A00(userSession, abstractC47211Ktk, A00, directThreadKey, jSONObject);
                                A00222.A9s("text", str2);
                                A00222.A0S(C40781ul.class, C55702hA.class);
                                C1ON A0N22 = A00222.A0N();
                                C14360o3.A0A(A0N22);
                                A0N22.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
                                C1GJ.A03(A0N22);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            str = "textResponse";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "key";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C30691dY(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
