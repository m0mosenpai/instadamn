package X;

import com.instagram.api.schemas.StickerTraySurface;

/* renamed from: X.IOx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41282IOx {
    public static StickerTraySurface A00(Object obj) {
        return A01((String) obj);
    }

    public static final StickerTraySurface A01(String str) {
        StickerTraySurface stickerTraySurface = (StickerTraySurface) StickerTraySurface.A01.get(str);
        if (stickerTraySurface == null) {
            return StickerTraySurface.A0b;
        }
        return stickerTraySurface;
    }
}
