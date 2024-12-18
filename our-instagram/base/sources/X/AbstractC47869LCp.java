package X;

import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import java.io.IOException;

/* renamed from: X.LCp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47869LCp {
    public static DirectStoreStickerResponseItem parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Double d = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sticker_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("image_mime_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("image_height".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("image_width".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("original_aspect_ratio".equals(A0s)) {
                    d = Double.valueOf(c16l.A0U());
                } else if ("emoji".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("alt_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("is_favorite".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_animated".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("pack_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("sticker_id", c16l, "DirectStoreStickerResponseItem");
            } else if (num != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("image_width", c16l, "DirectStoreStickerResponseItem");
                } else if (str6 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("pack_id", c16l, "DirectStoreStickerResponseItem");
                } else {
                    return new DirectStoreStickerResponseItem(bool, bool2, d, str, str2, str3, str4, str5, str6, num.intValue(), num2.intValue());
                }
            } else {
                AbstractC166997dE.A1V("image_height", c16l, "DirectStoreStickerResponseItem");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, DirectStoreStickerResponseItem directStoreStickerResponseItem) {
        anonymousClass182.A0d();
        String str = directStoreStickerResponseItem.A07;
        if (str != null) {
            anonymousClass182.A0S("sticker_id", str);
        }
        String str2 = directStoreStickerResponseItem.A09;
        if (str2 != null) {
            anonymousClass182.A0S("image_url", str2);
        }
        String str3 = directStoreStickerResponseItem.A08;
        if (str3 != null) {
            anonymousClass182.A0S("image_mime_type", str3);
        }
        anonymousClass182.A0Q("image_height", directStoreStickerResponseItem.A00);
        anonymousClass182.A0Q("image_width", directStoreStickerResponseItem.A01);
        Double d = directStoreStickerResponseItem.A04;
        if (d != null) {
            anonymousClass182.A0O("original_aspect_ratio", d.doubleValue());
        }
        String str4 = directStoreStickerResponseItem.A06;
        if (str4 != null) {
            anonymousClass182.A0S("emoji", str4);
        }
        String str5 = directStoreStickerResponseItem.A05;
        if (str5 != null) {
            anonymousClass182.A0S("alt_text", str5);
        }
        Boolean bool = directStoreStickerResponseItem.A03;
        if (bool != null) {
            anonymousClass182.A0T("is_favorite", bool.booleanValue());
        }
        Boolean bool2 = directStoreStickerResponseItem.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("is_animated", bool2.booleanValue());
        }
        String str6 = directStoreStickerResponseItem.A0A;
        if (str6 != null) {
            anonymousClass182.A0S("pack_id", str6);
        }
        anonymousClass182.A0a();
    }
}
