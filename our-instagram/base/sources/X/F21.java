package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class F21 {
    public static final void A00(UserSession userSession, C83403nh c83403nh, Integer num, String str) {
        String str2;
        String str3;
        boolean z;
        C14360o3.A0B(str, 1);
        if (!c83403nh.A1S()) {
            if (C18U.A06(C06090Tz.A05, userSession, 36314867610946426L)) {
                synchronized (c83403nh) {
                    z = c83403nh.A2I;
                }
                if (!z) {
                    synchronized (c83403nh) {
                        c83403nh.A2I = true;
                    }
                } else {
                    return;
                }
            }
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            AbstractC31173DnH.A1P(A0c, "direct_v2/message_delivered_trigger/", str);
            A0c.A9s("item_id", c83403nh.A0i());
            A0c.A9s("sender_id", c83403nh.A1u);
            A0c.A9s("timestamp", String.valueOf(c83403nh.C8i()));
            if (num.intValue() != 0) {
                str2 = "load_thread";
            } else {
                str2 = "new_message_delta";
            }
            A0c.A9s("delivery_source", str2);
            A0c.A0H("client_context", c83403nh.A0g());
            Object obj = c83403nh.A1T;
            if (obj instanceof String) {
                str3 = (String) obj;
            } else {
                str3 = null;
            }
            A0c.A0H("message_body", str3);
            C1GJ.A03(AbstractC31177DnL.A0Q(A0c));
        }
    }
}
