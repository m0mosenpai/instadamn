package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class ONW {
    public static C45116Jxl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("existing_prompt_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("prompt_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("replied_to_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C45116Jxl(str, str2, str3, 2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C45116Jxl c45116Jxl, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        String str = c45116Jxl.A00;
        if (str != null) {
            anonymousClass182.A0S("existing_prompt_id", str);
        }
        String str2 = c45116Jxl.A01;
        if (str2 != null) {
            anonymousClass182.A0S("prompt_text", str2);
        }
        String str3 = c45116Jxl.A02;
        if (str3 != null) {
            anonymousClass182.A0S("replied_to_media_id", str3);
        }
        anonymousClass182.A0a();
    }
}
