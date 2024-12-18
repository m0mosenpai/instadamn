package X;

import android.animation.ValueAnimator;

/* renamed from: X.If3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41787If3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C38521Gwh A03;

    public C41787If3(C38521Gwh c38521Gwh, int i, int i2, int i3) {
        this.A03 = c38521Gwh;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float A00 = AbstractC167017dG.A00(valueAnimator);
        C38521Gwh c38521Gwh = this.A03;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        int A02 = AbstractC13950nL.A02(A00, c38521Gwh.A02, this.A01);
        c38521Gwh.A0B.setTextColor(A02);
        c38521Gwh.A09.setColorFilter(A02);
        c38521Gwh.A07.setBackgroundColor(AbstractC13950nL.A02(A00, this.A02, this.A00));
    }
}
