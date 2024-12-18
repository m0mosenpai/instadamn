package X;

import android.view.animation.AlphaAnimation;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;

/* renamed from: X.M5y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50009M5y implements Runnable {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ NoteBubbleView A01;
    public final /* synthetic */ boolean A02;

    public RunnableC50009M5y(AlphaAnimation alphaAnimation, NoteBubbleView noteBubbleView, boolean z) {
        this.A01 = noteBubbleView;
        this.A00 = alphaAnimation;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NoteBubbleView noteBubbleView = this.A01;
        noteBubbleView.startAnimation(this.A00);
        noteBubbleView.setVisibility(AbstractC167007dF.A05(this.A02 ? 1 : 0));
    }
}
