package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Afr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23780Afr implements InterfaceC1830389y {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C23780Afr(Drawable drawable, InteractiveDrawableContainer interactiveDrawableContainer, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = interactiveDrawableContainer;
            this.A01 = drawable;
        } else {
            this.A01 = interactiveDrawableContainer;
            this.A02 = drawable;
        }
    }

    @Override // X.InterfaceC1830389y
    public final void DvK(float f, float f2, float f3, float f4) {
        InteractiveDrawableContainer interactiveDrawableContainer;
        Object obj;
        switch (this.A00) {
            case 0:
            case 3:
                interactiveDrawableContainer = (InteractiveDrawableContainer) this.A01;
                obj = this.A02;
                break;
            case 1:
                interactiveDrawableContainer = ((AAG) this.A02).A04;
                obj = this.A01;
                break;
            case 2:
                interactiveDrawableContainer = ((A9S) this.A02).A02;
                obj = this.A01;
                break;
            default:
                interactiveDrawableContainer = (InteractiveDrawableContainer) this.A02;
                obj = this.A01;
                break;
        }
        Drawable drawable = (Drawable) obj;
        interactiveDrawableContainer.A0m(drawable, f);
        interactiveDrawableContainer.A0l(drawable, f2);
        interactiveDrawableContainer.A0n(drawable, f3, f4);
    }

    public C23780Afr(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
