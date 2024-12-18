package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3PZ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3PZ {
    public static final void A01(C9C2 c9c2, InterfaceC11380iw interfaceC11380iw, CircularImageView circularImageView) {
        C14360o3.A0B(c9c2, 0);
        C14360o3.A0B(circularImageView, 1);
        ImageUrl imageUrl = (ImageUrl) c9c2.A01;
        if (imageUrl != null) {
            circularImageView.setUrl(imageUrl, interfaceC11380iw);
        } else {
            circularImageView.setImageDrawable((Drawable) c9c2.A00);
        }
    }

    public static final C09530e4 A00(float f, boolean z, boolean z2) {
        int i;
        float f2 = f / 72.0f;
        if (!z && z2) {
            f2 *= 1.25f;
        }
        if (f2 < 0.6111111f) {
            i = 2;
        } else {
            i = 4;
            if (f2 < 0.7777778f) {
                i = 3;
            }
        }
        return new C09530e4(Float.valueOf(f2), Integer.valueOf(i));
    }
}
