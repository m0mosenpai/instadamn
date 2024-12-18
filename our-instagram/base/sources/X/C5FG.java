package X;

import android.graphics.Bitmap;

/* renamed from: X.5FG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FG {
    public static final C5FG A02;
    public final Bitmap.Config A00;
    public final Bitmap.Config A01;

    public C5FG(Bitmap.Config config, Bitmap.Config config2) {
        this.A01 = config2;
        this.A00 = config;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass());
    }

    static {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        A02 = new C5FG(config, config);
    }

    public final String toString() {
        C44122Jem c44122Jem = new C44122Jem(getClass().getSimpleName());
        C44122Jem.A00(c44122Jem, String.valueOf(100), "minDecodeIntervalMs");
        C44122Jem.A00(c44122Jem, String.valueOf(Integer.MAX_VALUE), "maxDimensionPx");
        String valueOf = String.valueOf(false);
        C44122Jem.A00(c44122Jem, valueOf, "decodePreviewFrame");
        C44122Jem.A00(c44122Jem, valueOf, "useLastFrameForPreview");
        C44122Jem.A00(c44122Jem, valueOf, "useEncodedImageForPreview");
        C44122Jem.A00(c44122Jem, valueOf, "decodeAllFrames");
        C44122Jem.A00(c44122Jem, valueOf, "forceStaticImage");
        C44122Jem.A00(c44122Jem, this.A01.name(), "bitmapConfigName");
        C44122Jem.A00(c44122Jem, this.A00.name(), "animatedBitmapConfigName");
        C44122Jem.A00(c44122Jem, null, "customImageDecoder");
        C44122Jem.A00(c44122Jem, null, "bitmapTransformation");
        C44122Jem.A00(c44122Jem, null, "colorSpace");
        return AnonymousClass001.A0g("ImageDecodeOptions{", c44122Jem.toString(), "}");
    }

    public final int hashCode() {
        return ((((-552645669) + this.A01.ordinal()) * 31) + this.A00.ordinal()) * 31 * 31 * 31;
    }
}
