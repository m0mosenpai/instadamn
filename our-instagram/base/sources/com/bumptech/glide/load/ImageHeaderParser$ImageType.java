package com.bumptech.glide.load;

/* loaded from: classes10.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    UNKNOWN(false);

    public final boolean A00;

    public boolean hasAlpha() {
        return this.A00;
    }

    ImageHeaderParser$ImageType(boolean z) {
        this.A00 = z;
    }

    public boolean isWebp() {
        int ordinal = ordinal();
        if (ordinal == 6 || ordinal == 5 || ordinal == 7) {
            return true;
        }
        return false;
    }
}
