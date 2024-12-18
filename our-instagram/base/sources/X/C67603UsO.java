package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.Window;

/* renamed from: X.UsO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67603UsO extends TRV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67603UsO(Activity activity, R3M r3m, int i, boolean z) {
        super(r3m);
        this.A01 = activity;
        this.A02 = z;
        this.A00 = i;
    }

    @Override // X.TRV
    public final void A00() {
        Activity activity = this.A01;
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            if (this.A02) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), AbstractC25228BEl.A1Z(Integer.valueOf(window.getStatusBarColor()), this.A00));
                ofObject.addUpdateListener(new C35292FhR(activity, 0));
                ofObject.setDuration(300L).setStartDelay(0L);
                ofObject.start();
                return;
            }
            window.setStatusBarColor(this.A00);
        }
    }
}
