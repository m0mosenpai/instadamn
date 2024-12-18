package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.HashMap;

/* renamed from: X.Fca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35063Fca {
    public static final void A02(UserSession userSession, InterfaceC37117GXc interfaceC37117GXc, String str, String str2, int i) {
        C14360o3.A0B(userSession, 0);
        if (str != null) {
            C1ON A06 = DirectThreadApi.A06(userSession, str, null);
            A06.A00 = new EE1(userSession, interfaceC37117GXc, str, str2, str, i);
            C1GJ.A03(A06);
        }
    }

    public static final void A01(AbstractC115105If abstractC115105If, UserSession userSession, String str, String str2, int i) {
        C25531Mh A0I;
        String str3;
        String str4;
        if (abstractC115105If != null) {
            InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
            C142846ck A00 = AbstractC147806l5.A00(userSession);
            String str5 = null;
            if (A0L != null) {
                str3 = A0L.getErrorType();
                str4 = A0L.getErrorTitle();
                str5 = A0L.getErrorBody();
            } else {
                str3 = null;
                str4 = null;
            }
            A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("error_type", str3);
                A1G.put(AbstractC58317Pt9.A00(24), str4);
                A1G.put(AbstractC111324zv.A00(2316), str5);
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1J(A0I, "thread_join_error");
                A0I.A0o("join_broadcast_chat");
                AbstractC31178DnM.A1H(A0I, "broadcast_chat_preview", i);
                A0I.A0r(null);
                A0I.A0h(null);
                A0I.A0v(A1G);
            } else {
                return;
            }
        } else {
            C142846ck A002 = AbstractC147806l5.A00(userSession);
            A0I = AbstractC31172DnG.A0I(A002);
            if (!AbstractC25226BEj.A1Z(A0I)) {
                return;
            }
            AbstractC31175DnJ.A1B(A0I, A002);
            AbstractC31174DnI.A1J(A0I, "thread_join_successful");
            A0I.A0o("join_broadcast_chat");
            A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_view", str, str2, i));
        }
        A0I.Cht();
    }

    public static final InterfaceC19390xP A00(UserSession userSession, String str, String str2, String str3, int i) {
        return JX4.A03(new C50125MBz(userSession, str, str2, (InterfaceC23621Ds) null, i), JX4.A04(new MBX(userSession, str, str2, (InterfaceC23621Ds) null, i), JX4.A00(new MC2(14, null), DirectThreadApi.A06(userSession, str, str3).A03(1495037516))));
    }
}
