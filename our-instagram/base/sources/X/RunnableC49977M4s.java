package X;

import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.ProgressBar;

/* renamed from: X.M4s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49977M4s implements Runnable {
    public final /* synthetic */ K5D A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public RunnableC49977M4s(K5D k5d, boolean z, boolean z2) {
        this.A00 = k5d;
        this.A02 = z;
        this.A01 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPropertyAnimator withEndAction;
        K5D k5d = this.A00;
        ImageButton imageButton = k5d.A03;
        C14360o3.A0A(imageButton);
        boolean z = this.A02;
        imageButton.setEnabled(z);
        if (!z) {
            ImageButton imageButton2 = k5d.A03;
            C14360o3.A0A(imageButton2);
            if (imageButton2.getVisibility() == 0) {
                if (!((AbstractC60562R7d) k5d).A04) {
                    ProgressBar progressBar = k5d.A07;
                    C14360o3.A0A(progressBar);
                    progressBar.setVisibility(0);
                    if (this.A01) {
                        ProgressBar progressBar2 = k5d.A07;
                        C14360o3.A0A(progressBar2);
                        withEndAction = AbstractC43594JPz.A0H(progressBar2);
                        withEndAction.start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        boolean z2 = this.A01;
        ProgressBar progressBar3 = k5d.A07;
        if (z2) {
            C14360o3.A0A(progressBar3);
            withEndAction = AbstractC43594JPz.A0G(progressBar3).withEndAction(new RunnableC49817LzO(k5d));
            withEndAction.start();
            return;
        }
        AbstractC43593JPy.A19(progressBar3);
    }
}
