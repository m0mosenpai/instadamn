package X;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class M61 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public M61(View view, ImageView imageView, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = view;
        this.A01 = imageView;
        this.A02 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2UY.A01.A04();
        View view = this.A00;
        view.animate().scaleX(0.7f).scaleY(0.7f);
        ImageView imageView = this.A01;
        AbstractC43593JPy.A0E(imageView.animate(), 0.0f).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).setDuration(250L).withEndAction(new M60(view, imageView, this.A02));
    }
}
