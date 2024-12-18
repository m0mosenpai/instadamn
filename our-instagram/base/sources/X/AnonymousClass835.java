package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Deprecated;

/* renamed from: X.835, reason: invalid class name */
/* loaded from: classes4.dex */
public interface AnonymousClass835 {
    boolean AJh(int i, int i2, boolean z);

    C184708Hl Csh();

    void EPa(float f);

    void ERh(int i);

    void EW1(Drawable drawable);

    @Deprecated(message = "This method should only be used from PreCaptureButtonManager, this is necessary so\n        to avoid conflicting with the animations to show and hide pre-capture buttons.")
    void EhF(boolean z, boolean z2);

    View getView();

    void setEnabled(boolean z);

    static void A00(C8HI c8hi) {
        c8hi.A0s.setEnabled(!C8HI.A0K(c8hi));
    }
}
