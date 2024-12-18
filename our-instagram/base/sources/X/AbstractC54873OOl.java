package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.OOl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54873OOl {
    public static OTK parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            OTK otk = new OTK();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("camera_tool".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    otk.A00 = C51T.A00(A1P);
                } else if ("gen_ai_info".equals(A0s)) {
                    OUP parseFromJson = AbstractC53924Nsx.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    otk.A01 = parseFromJson;
                }
                c16l.A0z();
            }
            return otk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, OTK otk) {
        anonymousClass182.A0d();
        anonymousClass182.A0S("camera_tool", otk.A00.A00);
        anonymousClass182.A0r("gen_ai_info");
        OUP oup = otk.A01;
        anonymousClass182.A0d();
        String str = oup.A01;
        if (str != null) {
            anonymousClass182.A0S("generated_content_id", str);
        }
        String str2 = oup.A02;
        if (str2 != null) {
            anonymousClass182.A0S("prompt", str2);
        }
        anonymousClass182.A0S("recipe_caption", oup.A03);
        String str3 = oup.A00;
        if (str3 != null) {
            anonymousClass182.A0S("background_color", str3);
        }
        String str4 = oup.A06;
        if (str4 != null) {
            anonymousClass182.A0S("sticker_style_str", str4);
        }
        anonymousClass182.A0S("user_interactions_id", oup.A08);
        String str5 = oup.A07;
        if (str5 != null) {
            anonymousClass182.A0S("topic", str5);
        }
        anonymousClass182.A0S(TraceFieldType.RequestID, oup.A04);
        anonymousClass182.A0S("response_id", oup.A05);
        anonymousClass182.A0a();
        anonymousClass182.A0a();
    }
}
