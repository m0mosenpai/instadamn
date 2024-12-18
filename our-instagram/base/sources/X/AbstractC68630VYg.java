package X;

import android.text.Layout;

/* renamed from: X.VYg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68630VYg {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            MSY.A1I(Layout.Alignment.ALIGN_NORMAL, iArr);
        } catch (NoSuchFieldError unused) {
        }
        try {
            MSY.A1J(Layout.Alignment.ALIGN_OPPOSITE, iArr);
        } catch (NoSuchFieldError unused2) {
        }
        A00 = iArr;
    }
}
