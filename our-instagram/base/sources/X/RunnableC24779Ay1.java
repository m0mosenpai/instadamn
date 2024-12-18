package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Ay1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24779Ay1 implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C206189Bb A01;
    public final /* synthetic */ C190988cu A02;

    public RunnableC24779Ay1(Drawable drawable, C206189Bb c206189Bb, C190988cu c190988cu) {
        this.A02 = c190988cu;
        this.A01 = c206189Bb;
        this.A00 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C190988cu c190988cu = this.A02;
        InteractiveDrawableContainer interactiveDrawableContainer = c190988cu.A02;
        Drawable drawable = (Drawable) this.A01.A03;
        interactiveDrawableContainer.A0Q(drawable);
        c190988cu.A04(this.A00, drawable);
    }
}
