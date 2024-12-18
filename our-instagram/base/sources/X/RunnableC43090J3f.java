package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.J3f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43090J3f implements Runnable {
    public final /* synthetic */ IK9 A00;

    public RunnableC43090J3f(IK9 ik9) {
        this.A00 = ik9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect A0U = AbstractC166987dD.A0U();
        IK9 ik9 = this.A00;
        ImageView imageView = ik9.A01;
        imageView.getHitRect(A0U);
        View view = ik9.A00;
        int i = -view.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        A0U.inset(i, i);
        view.setTouchDelegate(new TouchDelegate(A0U, imageView));
    }
}
