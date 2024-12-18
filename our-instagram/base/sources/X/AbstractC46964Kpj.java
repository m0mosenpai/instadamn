package X;

import java.io.IOException;

/* renamed from: X.Kpj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46964Kpj {
    public static C29481bP parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C29481bP c29481bP = new C29481bP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("link".equals(A0s)) {
                    c29481bP.A00 = AbstractC1122154p.parseFromJson(c16l);
                } else if ("after_post_action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c29481bP.A04 = A1P;
                } else if ("replied_to_message".equals(A0s)) {
                    c29481bP.A02 = AnonymousClass442.A00(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c29481bP.A01 = FUT.parseFromJson(c16l);
                } else if ("private_reply_info".equals(A0s)) {
                    c29481bP.A03 = AbstractC47855LCa.parseFromJson(c16l);
                } else if ("is_channel_invite_link".equals(A0s)) {
                    c29481bP.A05 = c16l.A0d();
                } else if ("is_x_transport_forward".equals(A0s)) {
                    c29481bP.A06 = c16l.A0d();
                } else {
                    AbstractC47856LCb.A01(c16l, c29481bP, A0s);
                }
                c16l.A0z();
            }
            return c29481bP;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
