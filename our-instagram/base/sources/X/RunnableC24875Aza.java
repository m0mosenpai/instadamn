package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.List;

/* renamed from: X.Aza, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24875Aza implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C8D0 A01;
    public final /* synthetic */ C8FC A02;
    public final /* synthetic */ InteractiveDrawableContainer A03;
    public final /* synthetic */ BEd A04;

    public RunnableC24875Aza(Drawable drawable, C8D0 c8d0, C8FC c8fc, InteractiveDrawableContainer interactiveDrawableContainer, BEd bEd) {
        this.A03 = interactiveDrawableContainer;
        this.A02 = c8fc;
        this.A00 = drawable;
        this.A04 = bEd;
        this.A01 = c8d0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List drawableRealBounds;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A03;
        int width = interactiveDrawableContainer.getWidth();
        int height = interactiveDrawableContainer.getHeight();
        C8FC c8fc = this.A02;
        float f = c8fc.A02;
        if (f != -1.0f) {
            float intrinsicWidth = (f * width) / this.A00.getIntrinsicWidth();
            float f2 = c8fc.A01;
            if (f2 != -1.0f && intrinsicWidth < f2) {
                intrinsicWidth = f2;
            }
            float f3 = c8fc.A00;
            if (f3 != -1.0f && intrinsicWidth > f3) {
                intrinsicWidth = f3;
            }
            this.A04.Ed5(intrinsicWidth);
        }
        C8D0 c8d0 = this.A01;
        Drawable drawable = this.A00;
        drawableRealBounds = interactiveDrawableContainer.getDrawableRealBounds();
        c8d0.A02(drawable, drawableRealBounds, width, height);
        BEd bEd = this.A04;
        C14360o3.A0C(bEd, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.InteractiveDrawableImpl");
        ((C9LJ) bEd).A0g.set(AbstractC166987dD.A0W(drawable));
    }
}
