package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import com.instagram.ui.widget.bubblespinner.BubbleSpinner;

/* renamed from: X.85v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1821185v implements InterfaceC1821285w {
    public BubbleSpinner A00;
    public Runnable A01;
    public final Handler A02;
    public final ViewStub A03;

    public C1821185v(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A03 = viewStub;
        this.A02 = new Handler(Looper.getMainLooper());
    }

    public final void A00() {
        BubbleSpinner bubbleSpinner = this.A00;
        if (bubbleSpinner == null) {
            View inflate = this.A03.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.bubblespinner.BubbleSpinner");
            bubbleSpinner = (BubbleSpinner) inflate;
            this.A00 = bubbleSpinner;
        }
        bubbleSpinner.setLoadingStatus(C8ZZ.LOADING);
    }

    @Override // X.InterfaceC1821285w
    public final void CMh() {
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
            this.A01 = null;
        }
        BubbleSpinner bubbleSpinner = this.A00;
        if (bubbleSpinner == null) {
            View inflate = this.A03.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.bubblespinner.BubbleSpinner");
            bubbleSpinner = (BubbleSpinner) inflate;
            this.A00 = bubbleSpinner;
        }
        bubbleSpinner.setLoadingStatus(C8ZZ.DONE);
    }
}
