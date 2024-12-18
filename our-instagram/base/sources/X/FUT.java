package X;

import com.instagram.direct.model.DirectForwardingParams;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FUT {
    public static DirectForwardingParams parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            DirectForwardingParams directForwardingParams = new DirectForwardingParams();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("forwarded_thread_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    directForwardingParams.A07 = A0m;
                } else if ("forwarded_message_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    directForwardingParams.A06 = A0m2;
                } else if ("is_from_msys_thread".equals(A0s)) {
                    directForwardingParams.A0A = c16l.A0d();
                } else if (AbstractC111324zv.A00(946).equals(A0s)) {
                    directForwardingParams.A01 = AbstractC166997dE.A0h(c16l);
                } else if ("forward_warning_icon".equals(A0s)) {
                    directForwardingParams.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("forward_warning_text".equals(A0s)) {
                    directForwardingParams.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("is_from_pre_cutover".equals(A0s)) {
                    directForwardingParams.A0B = c16l.A0d();
                } else if ("forwarded_message_client_context".equals(A0s)) {
                    directForwardingParams.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("forwarded_thread_id_v2".equals(A0s)) {
                    directForwardingParams.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("forwarded_thread_subtype".equals(A0s)) {
                    directForwardingParams.A03 = AbstractC166997dE.A0h(c16l);
                } else if ("forwarded_thread_audience_type".equals(A0s)) {
                    directForwardingParams.A00 = AbstractC166997dE.A0h(c16l);
                } else if ("forwarded_thread_user_type".equals(A0s)) {
                    directForwardingParams.A09 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return directForwardingParams;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, DirectForwardingParams directForwardingParams) {
        anonymousClass182.A0d();
        String str = directForwardingParams.A07;
        if (str != null) {
            anonymousClass182.A0S("forwarded_thread_id", str);
        }
        String str2 = directForwardingParams.A06;
        if (str2 != null) {
            anonymousClass182.A0S("forwarded_message_id", str2);
        }
        anonymousClass182.A0T("is_from_msys_thread", directForwardingParams.A0A);
        Integer num = directForwardingParams.A01;
        if (num != null) {
            anonymousClass182.A0Q(AbstractC111324zv.A00(946), num.intValue());
        }
        Integer num2 = directForwardingParams.A02;
        if (num2 != null) {
            anonymousClass182.A0Q("forward_warning_icon", num2.intValue());
        }
        String str3 = directForwardingParams.A04;
        if (str3 != null) {
            anonymousClass182.A0S("forward_warning_text", str3);
        }
        anonymousClass182.A0T("is_from_pre_cutover", directForwardingParams.A0B);
        String str4 = directForwardingParams.A05;
        if (str4 != null) {
            anonymousClass182.A0S("forwarded_message_client_context", str4);
        }
        String str5 = directForwardingParams.A08;
        if (str5 != null) {
            anonymousClass182.A0S("forwarded_thread_id_v2", str5);
        }
        Integer num3 = directForwardingParams.A03;
        if (num3 != null) {
            anonymousClass182.A0Q("forwarded_thread_subtype", num3.intValue());
        }
        Integer num4 = directForwardingParams.A00;
        if (num4 != null) {
            anonymousClass182.A0Q("forwarded_thread_audience_type", num4.intValue());
        }
        String str6 = directForwardingParams.A09;
        if (str6 != null) {
            anonymousClass182.A0S("forwarded_thread_user_type", str6);
        }
        anonymousClass182.A0a();
    }
}
