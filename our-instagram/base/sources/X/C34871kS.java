package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.EditText;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;

/* renamed from: X.1kS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34871kS implements InterfaceC29301b7 {
    public static final C0KV A01 = C34881kT.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        Long BTC;
        C34851kQ c34851kQ = (C34851kQ) c1ow;
        C14360o3.A0B(c34851kQ, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        if (c34851kQ.A03().A00()) {
            UserSession userSession = this.A00;
            C47977LIp A00 = AbstractC46925Kp6.A00(userSession);
            DirectThreadKey C7Q = c34851kQ.C7Q();
            AbstractC60877RXa A0I = EditText.DEFAULT_INSTANCE.A0I();
            String str2 = c34851kQ.A04;
            if (str2 != null) {
                A0I.A04();
                EditText editText = (EditText) A0I.A00;
                editText.bitField0_ |= 1;
                editText.newContent_ = str2;
                int i = c34851kQ.A00;
                A0I.A04();
                EditText editText2 = (EditText) A0I.A00;
                editText2.bitField0_ |= 2;
                editText2.editCount_ = i;
                C45385K6s c45385K6s = (C45385K6s) SupplementMessagePayload.DEFAULT_INSTANCE.A0I();
                c45385K6s.A07(c34851kQ.A04());
                C45370K6d c45370K6d = (C45370K6d) SupplementMessageContent.DEFAULT_INSTANCE.A0I();
                c45370K6d.A04();
                SupplementMessageContent supplementMessageContent = (SupplementMessageContent) c45370K6d.A00;
                RYn A02 = A0I.A02();
                A02.getClass();
                supplementMessageContent.supplementMessageContent_ = A02;
                supplementMessageContent.supplementMessageContentCase_ = 3;
                c45385K6s.A06(c45370K6d);
                User A022 = AnonymousClass189.A00(userSession).A02(userSession.userId);
                if (A022 != null && (BTC = A022.BTC()) != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    StringBuilder sb = new StringBuilder();
                    sb.append(BTC);
                    sb.append(':');
                    sb.append(currentTimeMillis);
                    c45385K6s.A09(sb.toString());
                }
                String str3 = c34851kQ.A05;
                if (str3 != null) {
                    c45385K6s.A08(String.valueOf(C4H6.A00(str3)));
                    C45383K6q c45383K6q = (C45383K6q) TransportPayload.DEFAULT_INSTANCE.A0I();
                    c45383K6q.A07(c45385K6s);
                    if (c34851kQ.A03() == EnumC159397Cz.A05) {
                        c45383K6q.A08(true);
                    }
                    RYn A023 = c45383K6q.A02();
                    C14360o3.A07(A023);
                    A00.A03((TransportPayload) A023, interfaceC37261GbE, c34851kQ, C7Q, 0, true, false);
                    C162337Ov.A0U(c19260xA);
                    return;
                }
                str = "messageId";
            }
            str = "editedText";
        } else {
            UserSession userSession2 = this.A00;
            DirectThreadKey C7Q2 = c34851kQ.C7Q();
            String str4 = c34851kQ.A05;
            if (str4 != null) {
                String A04 = c34851kQ.A04();
                String str5 = c34851kQ.A04;
                if (str5 != null) {
                    C25621Ms c25621Ms = new C25621Ms(userSession2);
                    c25621Ms.A05();
                    c25621Ms.A0B(AbstractC13670mt.A06("direct_v2/threads/%s/items/%s/edit/", C7Q2.A00, str4));
                    c25621Ms.A0S(C40781ul.class, C55702hA.class);
                    c25621Ms.A9s("original_message_client_context", A04);
                    c25621Ms.A9s("body", str5);
                    C1ON A0N = c25621Ms.A0N();
                    A0N.A00 = AbstractC46987Kq6.A00(userSession2, interfaceC37261GbE);
                    C1GJ.A03(A0N);
                    return;
                }
                str = "editedText";
            }
            str = "messageId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C34871kS(UserSession userSession) {
        this.A00 = userSession;
    }
}
