package X;

import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class M60 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public M60(View view, ImageView imageView, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = view;
        this.A01 = imageView;
        this.A02 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC43593JPy.A0E(this.A00.animate().setInterpolator(new OvershootInterpolator(1.8f)).setStartDelay(125L), 1.0f).withEndAction(new M2G(this.A02));
        this.A01.setVisibility(8);
    }
}
