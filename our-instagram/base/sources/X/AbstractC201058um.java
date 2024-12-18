package X;

import com.instagram.api.schemas.StickerTraySectionCTAType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201058um {
    public static C201068un parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C201068un c201068un = new C201068un();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                if ("section_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c201068un.A03 = str;
                } else if ("section_title".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    C14360o3.A0B(str2, 0);
                    c201068un.A04 = str2;
                } else if ("allow_overflow".equals(A0q)) {
                    c201068un.A08 = c16l.A0d();
                } else if ("cta_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    C14360o3.A0B(str3, 0);
                    c201068un.A02 = str3;
                } else if ("show_separator".equals(A0q)) {
                    c201068un.A09 = c16l.A0d();
                } else if ("is_separator_invisible".equals(A0q)) {
                    c201068un.A01 = Boolean.valueOf(c16l.A0d());
                } else if ("cta_action".equals(A0q)) {
                    StickerTraySectionCTAType stickerTraySectionCTAType = (StickerTraySectionCTAType) StickerTraySectionCTAType.A01.get(c16l.A1Q());
                    if (stickerTraySectionCTAType == null) {
                        stickerTraySectionCTAType = StickerTraySectionCTAType.A0A;
                    }
                    c201068un.A00 = stickerTraySectionCTAType;
                } else if ("section_with_content_title".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    C14360o3.A0B(str4, 0);
                    c201068un.A06 = str4;
                } else if ("section_with_content_body".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    C14360o3.A0B(str5, 0);
                    c201068un.A05 = str5;
                } else if ("sticker_bundles".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C148276lx parseFromJson = AbstractC201078up.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c201068un.A07 = arrayList;
                }
                c16l.A0z();
            }
            return c201068un;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
