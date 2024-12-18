package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class LCZ {
    public static C31191eO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31191eO c31191eO = new C31191eO();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("direct_pending_media".equals(A0s)) {
                    c31191eO.A04 = AbstractC47865LCl.parseFromJson(c16l);
                } else if ("mutation_queue_override".equals(A0s)) {
                    EnumC46200Kcc enumC46200Kcc = (EnumC46200Kcc) AbstractC166997dE.A0m(EnumC46200Kcc.A01, c16l.A1D());
                    if (enumC46200Kcc == null) {
                        enumC46200Kcc = EnumC46200Kcc.A04;
                    }
                    c31191eO.A03 = enumC46200Kcc;
                } else if ("private_reply_info".equals(A0s)) {
                    c31191eO.A02 = AbstractC47855LCa.parseFromJson(c16l);
                } else if ("is_x_transport_forward".equals(A0s)) {
                    c31191eO.A06 = AbstractC166997dE.A0d(c16l);
                } else if ("existing_album_identifier".equals(A0s)) {
                    c31191eO.A05 = AbstractC47067KrO.parseFromJson(c16l);
                } else if ("replied_to_message".equals(A0s)) {
                    c31191eO.A01 = AnonymousClass442.A00(c16l);
                } else if ("should_skip_genai_eval".equals(A0s)) {
                    c31191eO.A08 = c16l.A0d();
                } else if ("genai_params".equals(A0s)) {
                    c31191eO.A00 = AbstractC83783oN.parseFromJson(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c31191eO, A0s);
                }
                c16l.A0z();
            }
            return c31191eO;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C31191eO c31191eO) {
        anonymousClass182.A0d();
        if (c31191eO.A04 != null) {
            anonymousClass182.A0r("direct_pending_media");
            AbstractC47865LCl.A00(anonymousClass182, c31191eO.A04);
        }
        EnumC46200Kcc enumC46200Kcc = c31191eO.A03;
        if (enumC46200Kcc != null) {
            anonymousClass182.A0Q("mutation_queue_override", enumC46200Kcc.A00);
        }
        if (c31191eO.A02 != null) {
            anonymousClass182.A0r("private_reply_info");
            AbstractC47855LCa.A00(anonymousClass182, c31191eO.A02);
        }
        Boolean bool = c31191eO.A06;
        if (bool != null) {
            anonymousClass182.A0T("is_x_transport_forward", bool.booleanValue());
        }
        if (c31191eO.A05 != null) {
            anonymousClass182.A0r("existing_album_identifier");
            MessageIdentifier messageIdentifier = c31191eO.A05;
            anonymousClass182.A0d();
            anonymousClass182.A0S("non_null_identifier", messageIdentifier.A01);
            String A00 = messageIdentifier.A00();
            if (A00 != null) {
                anonymousClass182.A0S("message_client_context", A00);
            }
            anonymousClass182.A0a();
        }
        if (c31191eO.A01 != null) {
            anonymousClass182.A0r("replied_to_message");
            AbstractC43642JSa.A01(anonymousClass182, c31191eO.A01);
        }
        anonymousClass182.A0T("should_skip_genai_eval", c31191eO.A08);
        if (c31191eO.A00 != null) {
            anonymousClass182.A0r("genai_params");
            AbstractC83783oN.A00(c31191eO.A00, anonymousClass182);
        }
        AbstractC47856LCb.A00(anonymousClass182, c31191eO);
        anonymousClass182.A0a();
    }
}
