package X;

import android.animation.ValueAnimator;
import android.view.animation.BaseInterpolator;

/* renamed from: X.DHv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29933DHv extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C76223bS A04;
    public final /* synthetic */ C2XI A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29933DHv(C76223bS c76223bS, C2XI c2xi, float f, float f2, float f3, long j) {
        super(1);
        this.A04 = c76223bS;
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A05 = c2xi;
        this.A03 = j;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A04.A05.A03("clips_swipe_left_nudge_chevron_component") != null) {
            float f = this.A02;
            float f2 = this.A00;
            float f3 = this.A01;
            C2XI c2xi = this.A05;
            long j = this.A03;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
            BaseInterpolator baseInterpolator = C26549Bo8.A03;
            ofFloat.setInterpolator(baseInterpolator);
            ofFloat.setDuration(533L);
            ofFloat.addUpdateListener(new BFF(c2xi, 18));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, f3);
            ofFloat2.setInterpolator(baseInterpolator);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(2);
            ofFloat2.setDuration(j);
            ofFloat2.setStartDelay(533L);
            ofFloat2.addUpdateListener(new BFF(c2xi, 19));
            ofFloat2.start();
        }
        return C0eB.A00;
    }
}
