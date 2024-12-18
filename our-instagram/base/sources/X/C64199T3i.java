package X;

import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.util.HashMap;

/* renamed from: X.T3i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64199T3i implements InterfaceC65392TjP {
    public final int A00;
    public final Object A01;

    public C64199T3i(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65392TjP
    public final /* bridge */ /* synthetic */ void Dx0(Object obj) {
        C63406Sjd A06;
        C58444PvN c58444PvN;
        String str;
        switch (this.A00) {
            case 0:
                C62678SLr c62678SLr = (C62678SLr) obj;
                Q8K q8k = (Q8K) this.A01;
                if (c62678SLr.A02 == null) {
                    C2JS c2js = (C2JS) c62678SLr.A01;
                    String str2 = q8k.A01;
                    C1LC A0a = AbstractC58319PtB.A0a(c2js, QS1.class, "actions", 0, -384450045);
                    while (true) {
                        if (A0a.hasNext()) {
                            C2JS reinterpretRequired = AbstractC25225BEi.A0l(A0a).reinterpretRequired(0, QSL.class, -687358097);
                            RhY rhY = RhY.A02;
                            if (reinterpretRequired.getOptionalEnumField(0, "action_type", rhY) != null && ((RhY) reinterpretRequired.getOptionalEnumField(0, "action_type", rhY)).name().equals(str2)) {
                                A06 = C63406Sjd.A04(new C3AY(reinterpretRequired, c2js));
                            }
                        } else {
                            A06 = C63406Sjd.A06(MSY.A0d("No content found for the flow ", str2));
                        }
                    }
                } else {
                    A06 = C63406Sjd.A06(MSY.A0d("Failed to fetch the flows content for payment type: ", q8k.A02));
                }
                q8k.A0A(A06);
                return;
            case 1:
                ((C2GT) this.A01).A0A(obj);
                return;
            case 2:
            default:
                C62678SLr c62678SLr2 = (C62678SLr) obj;
                C62583SHi c62583SHi = (C62583SHi) this.A01;
                c62583SHi.A01.A01.execute(new RunnableC64726TRi(c62583SHi, c62678SLr2.A01, null, c62678SLr2.A02));
                return;
            case 3:
                c58444PvN = ((IGPaymentMethodsAPI) this.A01).A01;
                break;
            case 4:
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put(AbstractC58358Pty.A00(), AbstractC166997dE.A0n());
                A1G.put("flow_name", "FBPAY_HUB");
                Throwable th = ((C62678SLr) obj).A02;
                if (th != null) {
                    A1G.put("throwable", th);
                    str = "fbpay_auth_ticket_query_fail";
                } else {
                    str = "fbpay_auth_ticket_query_success";
                }
                C2FP.A04().A00.Chz(str, A1G);
                return;
            case 5:
                c58444PvN = ((C62706SMu) this.A01).A03;
                break;
        }
        c58444PvN.A03(obj);
    }
}
