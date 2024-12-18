package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Tsy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65724Tsy implements XEX {
    public C141596ac A00;
    public AnimatorSet A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final C6e8 A05;

    public C65724Tsy(C6e8 c6e8) {
        C14360o3.A0B(c6e8, 1);
        this.A05 = c6e8;
        this.A04 = c6e8.A04;
        this.A02 = c6e8.A01;
        this.A03 = c6e8.A02;
    }

    @Override // X.XEX
    public final void EhB() {
        View view;
        int i;
        this.A03.setAlpha(1.0f);
        this.A02.setAlpha(0.0f);
        C141596ac c141596ac = this.A00;
        if (c141596ac != null && c141596ac.A0V != null) {
            view = this.A04;
            i = 8;
        } else {
            view = this.A04;
            i = 0;
        }
        view.setVisibility(i);
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // X.XEX
    public final AnimatorSet Ac0() {
        return this.A01;
    }

    @Override // X.XEX
    public final C141596ac Blc() {
        return this.A00;
    }

    @Override // X.XEX
    public final void EK3() {
        View view;
        int i;
        this.A02.setAlpha(1.0f);
        this.A03.setAlpha(0.0f);
        C141596ac c141596ac = this.A00;
        if (c141596ac != null && c141596ac.A0V != null) {
            view = this.A04;
            i = 8;
        } else {
            view = this.A04;
            i = 0;
        }
        view.setVisibility(i);
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // X.XEX
    public final void EPk() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.A01 = animatorSet;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setStartDelay(2000L);
        C65759TtZ.A00(ofFloat, this, 18);
        animatorSet.play(ofFloat);
    }

    @Override // X.XEX
    public final void EkX() {
        if (this.A05.A00) {
            AbstractC65725Tsz.A01(this);
        }
    }

    @Override // X.XEX
    public final void start() {
        if (this.A05.A00) {
            AbstractC65725Tsz.A02(this);
        }
    }

    @Override // X.XEX
    public final void EcI(C141596ac c141596ac) {
        this.A00 = c141596ac;
    }
}
