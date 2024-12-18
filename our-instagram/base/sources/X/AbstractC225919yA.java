package X;

import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.9yA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225919yA {
    public static final ImageCacheKey A00(ImageUrl imageUrl) {
        List<ImageCacheKey> BxS = imageUrl.BxS();
        ImageCacheKey imageCacheKey = null;
        if (BxS != null) {
            for (ImageCacheKey imageCacheKey2 : BxS) {
                int i = imageCacheKey2.A01;
                int height = imageUrl.getHeight();
                if (i > height && imageCacheKey2.A00 > height && (imageCacheKey == null || i < imageCacheKey.A01)) {
                    imageCacheKey = imageCacheKey2;
                }
            }
        }
        return imageCacheKey;
    }
}
