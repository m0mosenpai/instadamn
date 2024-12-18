package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Awh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24701Awh implements Runnable {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ AMp A01;

    public RunnableC24701Awh(IgTextView igTextView, AMp aMp) {
        this.A01 = aMp;
        this.A00 = igTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AMp aMp = this.A01;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        IgTextView igTextView = this.A00;
        ANV.A00(ofFloat, igTextView, 13);
        ofFloat.addListener(new AN5(igTextView, 3));
        ofFloat.setDuration(50L);
        ofFloat.start();
        aMp.A02 = ofFloat;
    }
}
