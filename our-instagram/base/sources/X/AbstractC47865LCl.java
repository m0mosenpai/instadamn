package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.io.IOException;

/* renamed from: X.LCl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47865LCl {
    public static C7Q4 parseFromJson(C16L c16l) {
        C47Z c47z;
        C14360o3.A0B(c16l, 0);
        try {
            C7Q4 c7q4 = new C7Q4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("mediaType".equals(A0s)) {
                    c7q4.A01 = AbstractC47866LCm.A00(c16l);
                } else if ("file_name".equals(A0s)) {
                    c7q4.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("file_size".equals(A0s)) {
                    c7q4.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("photo_path".equals(A0s)) {
                    c7q4.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("video_path".equals(A0s)) {
                    c7q4.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("video_cover_frame_path".equals(A0s)) {
                    c7q4.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("aspectPostCrop".equals(A0s)) {
                    c7q4.A03 = new Float(c16l.A0U());
                } else if ("pending_media".equals(A0s)) {
                    c7q4.A02 = C47Y.parseFromJson(c16l);
                } else if ("pending_media_key".equals(A0s)) {
                    c7q4.A06 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(2710).equals(A0s)) {
                    MediaUploadMetadata parseFromJson = AbstractC93554Hv.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c7q4.A00 = parseFromJson;
                } else if ("has_sticker".equals(A0s)) {
                    c7q4.A0A = c16l.A0d();
                } else if ("is_armadillo_express".equals(A0s)) {
                    c7q4.A0B = c16l.A0d();
                }
                c16l.A0z();
            }
            if (c7q4.A06 == null && (c47z = c7q4.A02) != null) {
                c7q4.A06 = c47z.A35;
            }
            c7q4.A02 = null;
            C7Q4.A00(c7q4);
            return c7q4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C7Q4 c7q4) {
        anonymousClass182.A0d();
        EnumC40111tc enumC40111tc = c7q4.A01;
        if (enumC40111tc != null) {
            anonymousClass182.A0S("mediaType", AbstractC47866LCm.A01(enumC40111tc));
        }
        String str = c7q4.A04;
        if (str != null) {
            anonymousClass182.A0S("file_name", str);
        }
        String str2 = c7q4.A05;
        if (str2 != null) {
            anonymousClass182.A0S("file_size", str2);
        }
        String str3 = c7q4.A07;
        if (str3 != null) {
            anonymousClass182.A0S("photo_path", str3);
        }
        String str4 = c7q4.A09;
        if (str4 != null) {
            anonymousClass182.A0S("video_path", str4);
        }
        String str5 = c7q4.A08;
        if (str5 != null) {
            anonymousClass182.A0S("video_cover_frame_path", str5);
        }
        Float f = c7q4.A03;
        if (f != null) {
            anonymousClass182.A0P("aspectPostCrop", f.floatValue());
        }
        if (c7q4.A02 != null) {
            anonymousClass182.A0r("pending_media");
            C47Y.A01(anonymousClass182, c7q4.A02);
        }
        String str6 = c7q4.A06;
        if (str6 != null) {
            anonymousClass182.A0S("pending_media_key", str6);
        }
        anonymousClass182.A0r(AbstractC111324zv.A00(2710));
        AbstractC93554Hv.A00(anonymousClass182, c7q4.A00);
        anonymousClass182.A0T("has_sticker", c7q4.A0A);
        anonymousClass182.A0T("is_armadillo_express", c7q4.A0B);
        anonymousClass182.A0a();
    }
}
