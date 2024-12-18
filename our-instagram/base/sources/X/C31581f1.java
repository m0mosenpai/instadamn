package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.DeleteMessagePayload;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1f1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31581f1 implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1f2
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1062069048);
            int A032 = C0f9.A03(-605126796);
            C31581f1 c31581f1 = new C31581f1(userSession);
            C0f9.A0A(391421963, A032);
            C0f9.A0A(580409826, A03);
            return c31581f1;
        }
    };
    public final UserSession A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C31561ez c31561ez = (C31561ez) c1ow;
        if (c31561ez.A00.A00()) {
            XlG xlG = (XlG) this.A01.getValue();
            C14360o3.A0B(interfaceC37261GbE, 1);
            C47977LIp A00 = AbstractC46925Kp6.A00(xlG.A00);
            DirectThreadKey directThreadKey = c31561ez.A01;
            C14360o3.A07(directThreadKey);
            C45383K6q c45383K6q = (C45383K6q) TransportPayload.DEFAULT_INSTANCE.A0I();
            K6H k6h = (K6H) DeleteMessagePayload.DEFAULT_INSTANCE.A0I();
            String str = c31561ez.A02;
            if (str != null) {
                k6h.A04();
                DeleteMessagePayload deleteMessagePayload = (DeleteMessagePayload) k6h.A00;
                deleteMessagePayload.bitField0_ |= 1;
                deleteMessagePayload.messageOtid_ = str;
                c45383K6q.A06(k6h);
                if (c31561ez.A00 == EnumC159397Cz.A05) {
                    c45383K6q.A08(true);
                }
                RYn A022 = c45383K6q.A02();
                C14360o3.A07(A022);
                A00.A03((TransportPayload) A022, interfaceC37261GbE, c31561ez, directThreadKey, 0, true, true);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey2 = c31561ez.A01;
        String str2 = c31561ez.A03;
        String str3 = c31561ez.A02;
        JTa jTa = ((C1OW) c31561ez).A02;
        L1W l1w = jTa.A00;
        boolean z = c31561ez.A06;
        String str4 = jTa.A04;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B(AbstractC13670mt.A06("direct_v2/threads/%s/items/%s/delete/", directThreadKey2.A00, str2));
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0J("is_shh_mode", z);
        if (str3 != null) {
            c25621Ms.A9s("original_message_client_context", str3);
        }
        LLX.A03(c25621Ms, l1w);
        if (str4 != null) {
            c25621Ms.A9s("send_attribution", str4);
        }
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new K8X(userSession, interfaceC37261GbE, this);
        C1GJ.A03(A0N);
    }

    public C31581f1(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.YJM
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new XlG(UserSession.this);
            }
        });
    }
}
