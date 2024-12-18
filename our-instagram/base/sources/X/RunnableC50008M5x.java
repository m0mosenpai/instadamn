package X;

import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;

/* renamed from: X.M5x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50008M5x implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ AlphaAnimation A01;
    public final /* synthetic */ boolean A02;

    public RunnableC50008M5x(ViewGroup viewGroup, AlphaAnimation alphaAnimation, boolean z) {
        this.A00 = viewGroup;
        this.A01 = alphaAnimation;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.A00;
        viewGroup.startAnimation(this.A01);
        viewGroup.setVisibility(AbstractC167007dF.A05(this.A02 ? 1 : 0));
    }
}
