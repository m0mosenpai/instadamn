package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.7IF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IF {
    public static final C7IF A00 = new Object();

    public final int[] A00(Context context, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        int A02;
        if (directThreadThemeInfo == null) {
            return new int[]{context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_purple)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_blue))};
        }
        if (C7IG.A07(directThreadThemeInfo, z).length == 0) {
            if (z) {
                A02 = directThreadThemeInfo.A01();
            } else {
                A02 = directThreadThemeInfo.A02();
            }
            return new int[]{A02};
        }
        int[] A07 = C7IG.A07(directThreadThemeInfo, z);
        C14360o3.A0A(A07);
        return A07;
    }
}
