package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.facebook.R;

/* renamed from: X.9yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226369yt {
    public static final Bitmap A00(Resources resources, Bitmap bitmap) {
        float f;
        boolean A1a = AbstractC167017dG.A1a(bitmap, resources);
        float A04 = AbstractC166987dD.A04(resources, R.dimen.action_button_settings_height);
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width > height) {
            f = A04;
            A04 = (A04 / height) * width;
        } else {
            f = (A04 / width) * height;
        }
        Bitmap A00 = C0fK.A00(bitmap, C1H4.A01(A04), C1H4.A01(f), A1a);
        C14360o3.A07(A00);
        return A00;
    }
}
