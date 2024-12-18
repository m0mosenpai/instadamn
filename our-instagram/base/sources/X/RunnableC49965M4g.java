package X;

import android.widget.ImageView;

/* renamed from: X.M4g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49965M4g implements Runnable {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public RunnableC49965M4g(ImageView imageView, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = imageView;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = this.A00;
        imageView.setVisibility(8);
        imageView.setRotation(0.0f);
        this.A01.invoke();
    }
}
