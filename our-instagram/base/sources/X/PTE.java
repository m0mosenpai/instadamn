package X;

import android.view.View;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* loaded from: classes9.dex */
public final class PTE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C50724MaP A03;

    public PTE(View view, C50724MaP c50724MaP, int i, int i2) {
        this.A02 = view;
        this.A03 = c50724MaP;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A02;
        if (view != null) {
            int i = this.A00;
            int i2 = this.A01;
            AbstractC13880nE.A0k(view, i, i2, i, i2);
        }
        InteractiveDrawableContainer interactiveDrawableContainer = this.A03.A0T;
        if (interactiveDrawableContainer != null) {
            int i3 = this.A00;
            int i4 = this.A01;
            AbstractC13880nE.A0k(interactiveDrawableContainer, i3, i4, i3, i4);
        }
    }
}
