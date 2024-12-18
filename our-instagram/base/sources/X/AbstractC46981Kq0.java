package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kq0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46981Kq0 {
    public static C29271b4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29271b4 c29271b4 = new C29271b4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                Long l = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                if ("text".equals(A0s)) {
                    c29271b4.A0L = AbstractC167017dG.A0m(c16l);
                } else if ("mentioned_user_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c29271b4.A0N = arrayList;
                } else if ("after_post_action".equals(A0s)) {
                    c29271b4.A0F = AbstractC167017dG.A0m(c16l);
                } else if ("replied_to_message".equals(A0s)) {
                    c29271b4.A03 = AnonymousClass442.A00(c16l);
                } else if ("forwarding_params".equals(A0s)) {
                    c29271b4.A01 = FUT.parseFromJson(c16l);
                } else if ("postback_payload".equals(A0s)) {
                    c29271b4.A0J = AbstractC167017dG.A0m(c16l);
                } else if ("power_up_data".equals(A0s)) {
                    c29271b4.A02 = AbstractC46845Kne.parseFromJson(c16l);
                } else if ("private_reply_info".equals(A0s)) {
                    c29271b4.A05 = AbstractC47855LCa.parseFromJson(c16l);
                } else if ("mentioned_entities".equals(A0s)) {
                    c29271b4.A04 = AbstractC46861Knu.parseFromJson(c16l);
                } else if ("is_suggested_reply".equals(A0s)) {
                    c29271b4.A08 = AbstractC166997dE.A0d(c16l);
                } else if ("send_silently".equals(A0s)) {
                    c29271b4.A0A = AbstractC166997dE.A0d(c16l);
                } else if ("is_x_transport_forward".equals(A0s)) {
                    c29271b4.A09 = AbstractC166997dE.A0d(c16l);
                } else if ("commands".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C206179Ba parseFromJson = LCF.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    c29271b4.A0M = arrayList2;
                } else if ("btt_dual_send".equals(A0s)) {
                    c29271b4.A0O = c16l.A0d();
                } else if ("attachment".equals(A0s)) {
                    c29271b4.A07 = C47Y.parseFromJson(c16l);
                } else if ("prompt_data".equals(A0s)) {
                    c29271b4.A00 = LCD.parseFromJson(c16l);
                } else if ("seed".equals(A0s)) {
                    c29271b4.A0B = AbstractC166997dE.A0h(c16l);
                } else if ("is_written_with_ai".equals(A0s)) {
                    c29271b4.A0C = AbstractC166997dE.A0h(c16l);
                } else if ("prompt_fbid".equals(A0s)) {
                    c29271b4.A0G = AbstractC167017dG.A0m(c16l);
                } else if ("should_skip_genai_eval".equals(A0s)) {
                    c29271b4.A0P = c16l.A0d();
                } else if ("thread_label".equals(A0s)) {
                    c29271b4.A0D = AbstractC47853LBw.A01(c16l.A1D());
                } else if ("scheduled_timestamp_sec".equals(A0s)) {
                    if (c16l.A11() == C16R.A0I) {
                        l = AbstractC31173DnH.A0h(c16l);
                    }
                    c29271b4.A0E = l;
                } else {
                    AbstractC47856LCb.A01(c16l, c29271b4, A0s);
                }
                c16l.A0z();
            }
            return c29271b4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
