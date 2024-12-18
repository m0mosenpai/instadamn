package X;

import android.text.Layout;
import com.instagram.api.schemas.ClipsTextAlignment;

/* renamed from: X.A3i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC22790A3i {
    public static final /* synthetic */ int[] A00;

    static {
        ClipsTextAlignment.values();
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        A00 = iArr;
    }
}
