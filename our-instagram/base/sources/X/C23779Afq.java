package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Afq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23779Afq implements InterfaceC1830389y {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ InteractiveDrawableContainer A01;

    public C23779Afq(Drawable drawable, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A01 = interactiveDrawableContainer;
        this.A00 = drawable;
    }

    @Override // X.InterfaceC1830389y
    public final void DvK(float f, float f2, float f3, float f4) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A01;
        Drawable drawable = this.A00;
        interactiveDrawableContainer.A0m(drawable, f);
        interactiveDrawableContainer.A0l(drawable, f2);
        interactiveDrawableContainer.A0n(drawable, f3, f4);
    }
}
