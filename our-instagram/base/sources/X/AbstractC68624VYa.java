package X;

import android.widget.ImageView;

/* renamed from: X.VYa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68624VYa {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        try {
            MSY.A1I(ImageView.ScaleType.FIT_CENTER, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            MSY.A1J(ImageView.ScaleType.FIT_XY, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            MSY.A1K(ImageView.ScaleType.CENTER_CROP, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        A00 = iArr;
    }
}
