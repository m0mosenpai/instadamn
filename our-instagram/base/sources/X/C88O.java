package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.88O, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88O {
    public final UserSession A00;
    public final String A01;
    public final int A02;

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        if (r13 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(final X.C88X r21, X.InterfaceC11380iw r22, X.AnonymousClass895 r23, final X.C88N r24, X.C177327uS r25, final int r26, int r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88O.A01(X.88X, X.0iw, X.895, X.88N, X.7uS, int, int, boolean, boolean, boolean, boolean):void");
    }

    public static final void A00(C88X c88x, C177327uS c177327uS) {
        IgImageView igImageView = c177327uS.A07;
        igImageView.A09();
        igImageView.setImageDrawable(c88x.A01);
        Drawable drawable = c88x.A01;
        if (drawable instanceof BitmapDrawable) {
            InterfaceC65702y7 interfaceC65702y7 = c177327uS.A0A;
            C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap != null) {
                interfaceC65702y7.EGm(bitmap, igImageView);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C88O(Context context, UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = context.getColor(R.color.grey_10);
    }
}
