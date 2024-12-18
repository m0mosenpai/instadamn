package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.LSn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48138LSn implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C48138LSn(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                C0w9.A06("attribution_sdk:GraphQLAttributionEventsClient", "GraphQL error for event reportAdid", th);
                ((MQN) this.A01).DG5("GraphQL error for event reportAdid", th);
                return;
            case 1:
                LH3.A01((Activity) this.A01, "Sticker save failed", "Error saving sticker", null, 2131968948);
                return;
            case 2:
                C47972LIg c47972LIg = (C47972LIg) this.A02;
                L8Q l8q = c47972LIg.A07;
                LGU lgu = (LGU) this.A01;
                String str = lgu.A01;
                C14360o3.A06(str);
                l8q.A00.markerPoint(944520647, str.hashCode(), "server_response_received");
                String message = th.getMessage();
                if (message == null) {
                    message = "network_error";
                }
                C47972LIg.A00(c47972LIg, lgu, message);
                c47972LIg.A09.invoke();
                return;
            case 3:
                KDM.A06((KDM) this.A02, (DirectThreadThemeInfo) this.A01, true);
                return;
            case 4:
                L4X l4x = (L4X) this.A02;
                LGU lgu2 = (LGU) this.A01;
                String message2 = th.getMessage();
                if (message2 == null) {
                    message2 = "network_error";
                }
                UserSession userSession = l4x.A02;
                InterfaceC11380iw interfaceC11380iw = l4x.A01;
                String str2 = lgu2.A00;
                C14360o3.A06(str2);
                String str3 = lgu2.A01;
                LJM.A02(EnumC46271Ke3.AI_STICKER, interfaceC11380iw, userSession, message2, str2, str3, l4x.A06, null);
                L8Q l8q2 = l4x.A04;
                C14360o3.A06(str3);
                JQ0.A1G(l8q2.A00, "error", message2, 944520647, str3.hashCode());
                C47369KwK c47369KwK = l4x.A03;
                int i = l4x.A00;
                LGF lgf = c47369KwK.A00;
                C9GR.A0B(lgf.A01, "network_error");
                C47347Kvw c47347Kvw = lgf.A05;
                if (c47347Kvw == null) {
                    return;
                }
                c47347Kvw.A00.A03.Deq(i);
                return;
            case 5:
                AbstractC43673JTh abstractC43673JTh = (AbstractC43673JTh) this.A01;
                UserSession userSession2 = (UserSession) this.A02;
                C14360o3.A0A(th);
                abstractC43673JTh.A01(userSession2, th);
                return;
            case 6:
                Dialog dialog = (Dialog) this.A02;
                Context context = (Context) this.A01;
                dialog.dismiss();
                C9GR.A0C(context, "unknown_error_occured");
                return;
            default:
                InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) this.A01;
                C14360o3.A0A(th);
                C14360o3.A0B(th, 0);
                String message3 = th.getMessage();
                if (message3 == null) {
                    message3 = "";
                }
                interfaceC23621Ds.resumeWith(new C47800L9i(message3, -1, false));
                return;
        }
    }
}
