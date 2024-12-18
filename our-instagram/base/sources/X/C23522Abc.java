package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Abc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23522Abc implements InterfaceC65508Tld {
    public final /* synthetic */ C2NN A00;

    @Override // X.InterfaceC65508Tld
    public final void DcL(Boolean bool, Integer num, Throwable th) {
        C14360o3.A0B(th, 0);
        C2NN c2nn = this.A00;
        C49082Nb A00 = c2nn.A00();
        String str = c2nn.A02;
        if (str != null) {
            A00.A00(str, th);
        } else {
            C14360o3.A0F("deviceKeyDER");
            throw C00O.createAndThrow();
        }
    }

    public C23522Abc(C2NN c2nn) {
        this.A00 = c2nn;
    }

    @Override // X.InterfaceC65508Tld
    public final void DcO(String str) {
        C2NN c2nn = this.A00;
        C49082Nb A00 = c2nn.A00();
        String str2 = c2nn.A02;
        if (str2 != null) {
            String str3 = A00.A01;
            if (str3 != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) A00.A00, "client_register_trusteddevice_success");
                if (A0f.isSampled()) {
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A06("family_device_id", str3);
                    A00(A0f, c0Zx, "dev_pub_key", str2);
                }
            }
            UserSession userSession = c2nn.A05;
            C2QO c2qo = new C2QO(userSession);
            String str4 = userSession.userId;
            C14360o3.A0B(str4, 0);
            C49722Qf c49722Qf = c2qo.A00.A00;
            c2qo.A00 = new C49712Qe(new C49722Qf(c49722Qf.A00, AnonymousClass090.A01(str4, c49722Qf.A01)));
            C2QO.A00(c2qo);
            C2QO c2qo2 = new C2QO(userSession);
            String str5 = c2nn.A02;
            if (str5 != null) {
                c2qo2.A00 = new C49712Qe(new C49722Qf(new C49732Qg(str5, C05F.A01), c2qo2.A00.A00.A01));
                C2QO.A00(c2qo2);
                if (C18U.A06(C06090Tz.A06, userSession, 36328289384545721L)) {
                    C49082Nb A002 = c2nn.A00();
                    String str6 = A002.A01;
                    if (str6 != null) {
                        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f((C18920wW) A002.A00, "client_bind_trusteddevice_init");
                        if (A0f2.isSampled()) {
                            A00(A0f2, new C0Zx(), "family_device_id", str6);
                        }
                    }
                    SF8 sf8 = new SF8(c2nn.A04);
                    C58252li c58252li = new C58252li();
                    AbstractC63246Sg0.A03(S5S.A00(sf8.A01), new C63625SqX(27, AbstractC166987dD.A1E(), c58252li));
                    C63406Sjd.A0B(c58252li, new C63625SqX(30, c2nn, sf8));
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("deviceKeyDER");
        throw C00O.createAndThrow();
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, String str, String str2) {
        c0Zx.A06(str, str2);
        interfaceC02590Ai.AAQ(c0Zx, "event_payload");
        interfaceC02590Ai.AAP(AbstractC58346Ptm.A00(), C2O0.A00);
        interfaceC02590Ai.AAP("product_type", AbstractC49212Oa.A00);
        interfaceC02590Ai.AAP("platform", "android");
        interfaceC02590Ai.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
        interfaceC02590Ai.Cht();
    }
}
