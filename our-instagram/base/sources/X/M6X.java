package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class M6X implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public M6X(Bitmap bitmap, View view, ImageView imageView, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = imageView;
        this.A01 = view;
        this.A00 = bitmap;
        this.A03 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = this.A02;
        View view = this.A01;
        Bitmap bitmap = this.A00;
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        int measuredWidth = imageView.getMeasuredWidth();
        Rect A0U = AbstractC166987dD.A0U();
        view.getLocalVisibleRect(A0U);
        float f = measuredWidth;
        imageView.setY(A0U.bottom + (2.0f * f));
        float exactCenterY = A0U.exactCenterY() - (f * 0.1f);
        imageView.setVisibility(8);
        imageView.clearAnimation();
        imageView.setImageBitmap(bitmap);
        AbstractC43593JPy.A0E(imageView.animate().y(exactCenterY), 1.0f).alpha(1.0f).setInterpolator(new OvershootInterpolator(1.8f)).setDuration(500L).setStartDelay(150L).withStartAction(new M2F(imageView)).withEndAction(new M61(view, imageView, interfaceC16820sZ));
    }
}
