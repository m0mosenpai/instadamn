package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.TypedImageUrl;
import java.io.IOException;

/* renamed from: X.LCq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47870LCq {
    public static DirectStoreSticker parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            TypedImageUrl typedImageUrl = null;
            TypedImageUrl typedImageUrl2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sticker_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("preview_url".equals(A0s)) {
                    typedImageUrl = AbstractC47871LCr.parseFromJson(c16l);
                } else if ("image_url".equals(A0s)) {
                    typedImageUrl2 = AbstractC47871LCr.parseFromJson(c16l);
                } else if ("sticker_pack_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("alt_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("emoji".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "is_favorite");
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("sticker_id", c16l, "DirectStoreSticker");
            } else if (typedImageUrl2 != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("sticker_pack_id", c16l, "DirectStoreSticker");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_favorite", c16l, "DirectStoreSticker");
                } else {
                    return new DirectStoreSticker(typedImageUrl, typedImageUrl2, str, str2, str3, str4, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("image_url", c16l, "DirectStoreSticker");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, DirectStoreSticker directStoreSticker) {
        anonymousClass182.A0d();
        String str = directStoreSticker.A04;
        if (str != null) {
            anonymousClass182.A0S("sticker_id", str);
        }
        TypedImageUrl typedImageUrl = directStoreSticker.A01;
        if (typedImageUrl != null) {
            anonymousClass182.A0r("preview_url");
            AbstractC47871LCr.A00(anonymousClass182, typedImageUrl);
        }
        TypedImageUrl typedImageUrl2 = directStoreSticker.A00;
        if (typedImageUrl2 != null) {
            anonymousClass182.A0r("image_url");
            AbstractC47871LCr.A00(anonymousClass182, typedImageUrl2);
        }
        String str2 = directStoreSticker.A05;
        if (str2 != null) {
            anonymousClass182.A0S("sticker_pack_id", str2);
        }
        String str3 = directStoreSticker.A02;
        if (str3 != null) {
            anonymousClass182.A0S("alt_text", str3);
        }
        String str4 = directStoreSticker.A03;
        if (str4 != null) {
            anonymousClass182.A0S("emoji", str4);
        }
        anonymousClass182.A0T("is_favorite", directStoreSticker.A06);
        anonymousClass182.A0a();
    }
}
