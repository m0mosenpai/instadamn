package X;

import android.text.Layout;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VZ4 {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            MSY.A1I(Layout.Alignment.ALIGN_CENTER, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            MSY.A1J(Layout.Alignment.ALIGN_OPPOSITE, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        try {
            MSY.A1K(Layout.Alignment.ALIGN_NORMAL, iArr);
        } catch (NoSuchFieldError unused3) {
        }
        A00 = iArr;
    }
}
