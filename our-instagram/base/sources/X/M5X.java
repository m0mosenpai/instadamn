package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* loaded from: classes8.dex */
public final class M5X implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public M5X(View view, int i, View view2) {
        this.A02 = view;
        this.A00 = i;
        this.A01 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect A0U = AbstractC166987dD.A0U();
        View view = this.A02;
        view.getHitRect(A0U);
        int i = A0U.top;
        int i2 = this.A00;
        A0U.top = i - i2;
        A0U.left -= i2;
        A0U.bottom += i2;
        A0U.right += i2;
        this.A01.setTouchDelegate(new TouchDelegate(A0U, view));
    }
}
