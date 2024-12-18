package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.model.direct.stickerstore.TypedImageUrl;

/* loaded from: classes8.dex */
public abstract class LHH {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r15 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.model.direct.stickerstore.DirectStoreSticker A00(X.C59436QeX r11, java.lang.String r12, int r13, int r14, boolean r15) {
        /*
            r10 = 0
            if (r11 == 0) goto L55
            java.lang.String r0 = "strong_id__"
            java.lang.String r7 = r11.A07(r0)
            if (r7 == 0) goto L55
            java.lang.String r0 = "image(force_static_image:$sticker_full_force_static_image,height:$sticker_full_size,width:$sticker_full_size)"
            java.lang.String r6 = r11.A0A(r0)
            r5 = 5
            java.lang.String r4 = "original_aspect_ratio"
            double r0 = r11.getCoercedDoubleField(r5, r4)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            r2 = 4
            java.lang.String r1 = "is_animated"
            boolean r0 = r11.getCoercedBooleanField(r2, r1)
            com.instagram.model.direct.stickerstore.TypedImageUrl r6 = A02(r3, r6, r14, r0)
            if (r6 == 0) goto L55
            boolean r0 = r11.getCoercedBooleanField(r2, r1)
            if (r0 == 0) goto L32
            r3 = 1
            if (r15 == 0) goto L33
        L32:
            r3 = 0
        L33:
            java.lang.String r0 = "image(force_static_image:$sticker_preview_force_static_image,height:$sticker_preview_size,width:$sticker_preview_size)"
            java.lang.String r2 = r11.A09(r0)
            double r0 = r11.getCoercedDoubleField(r5, r4)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            com.instagram.model.direct.stickerstore.TypedImageUrl r5 = A02(r0, r2, r13, r3)
            if (r5 == 0) goto L55
            java.lang.String r0 = "accessibility_label"
            java.lang.String r9 = r11.A08(r0)
            r11 = 0
            com.instagram.model.direct.stickerstore.DirectStoreSticker r4 = new com.instagram.model.direct.stickerstore.DirectStoreSticker
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L55:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LHH.A00(X.QeX, java.lang.String, int, int, boolean):com.instagram.model.direct.stickerstore.DirectStoreSticker");
    }

    public static final DirectStoreSticker A01(DirectStoreStickerResponseItem directStoreStickerResponseItem) {
        boolean z;
        if (directStoreStickerResponseItem == null) {
            return null;
        }
        String str = directStoreStickerResponseItem.A09;
        int i = directStoreStickerResponseItem.A00;
        Double d = directStoreStickerResponseItem.A04;
        Boolean bool = directStoreStickerResponseItem.A02;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        TypedImageUrl A02 = A02(d, str, i, z);
        if (A02 != null) {
            return new DirectStoreSticker(null, A02, directStoreStickerResponseItem.A07, directStoreStickerResponseItem.A0A, directStoreStickerResponseItem.A05, directStoreStickerResponseItem.A06, AbstractC31177DnL.A1a(directStoreStickerResponseItem.A03));
        }
        return null;
    }

    public static final TypedImageUrl A02(Double d, String str, int i, boolean z) {
        double d2;
        if (str != null) {
            if (d != null && d.doubleValue() != 0.0d) {
                d2 = d.doubleValue();
            } else {
                d2 = 1.0d;
            }
            try {
                return new TypedImageUrl(new SimpleImageUrl(AbstractC25227BEk.A0B(str).toString(), (int) (i * d2), i), "image/webp", z);
            } catch (Exception e) {
                C18950wb.A01.AEp(AbstractC166997dE.A0y("Failed to parse sticker image url. Error: ", e), 20134884);
            }
        }
        return null;
    }
}
