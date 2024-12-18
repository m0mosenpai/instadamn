package X;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes5.dex */
public abstract class BTA {
    public static final Rect A00(View view, View view2, C58X c58x) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C58Z A00 = BJZ.A00(((C58W) c58x).A01);
        if (A00 != null) {
            C114205Dh A02 = BJZ.A02(A00);
            int i = (int) A02.A01;
            int i2 = iArr[0];
            int i3 = iArr2[0];
            int i4 = (int) A02.A03;
            int i5 = iArr[1];
            int i6 = iArr2[1];
            return new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) A02.A02) + i2) - i3, (((int) A02.A00) + i5) - i6);
        }
        return null;
    }

    public static final View A01(C58J c58j) {
        View view;
        BT9 bt9 = AbstractC114335Dx.A02(c58j.A03).A0E;
        if (bt9 != null && (view = bt9.A0J) != null) {
            return view;
        }
        throw AbstractC166987dD.A14("Could not fetch interop view");
    }
}
