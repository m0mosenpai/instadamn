package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Ay0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24778Ay0 implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C9ZD A01;
    public final /* synthetic */ C23102AGo A02;

    public RunnableC24778Ay0(Drawable drawable, C9ZD c9zd, C23102AGo c23102AGo) {
        this.A02 = c23102AGo;
        this.A01 = c9zd;
        this.A00 = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23102AGo c23102AGo = this.A02;
        InteractiveDrawableContainer interactiveDrawableContainer = c23102AGo.A01;
        Drawable drawable = this.A01.A03;
        interactiveDrawableContainer.A0Q(drawable);
        c23102AGo.A01(this.A00, drawable);
    }
}
