package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes7.dex */
public final class J5Q implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C38501GwM A02;

    public J5Q(View view, C38501GwM c38501GwM, int i) {
        this.A02 = c38501GwM;
        this.A00 = i;
        this.A01 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect A0U = AbstractC166987dD.A0U();
        TextView textView = this.A02.A00;
        textView.getHitRect(A0U);
        int i = -this.A00;
        A0U.inset(i, i);
        this.A01.setTouchDelegate(new TouchDelegate(A0U, textView));
    }
}
