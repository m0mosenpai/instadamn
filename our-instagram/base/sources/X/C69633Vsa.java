package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* renamed from: X.Vsa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69633Vsa {
    public final float A00;
    public final int A01;
    public final C133115zd A02;
    public final Integer A03;
    public final Integer A04;
    public final long A05;
    public final long A06;

    public final ValueAnimator A00() {
        int i;
        int A0K = AbstractC167017dG.A0K(this.A03);
        Integer num = this.A04;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(A0K, i);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setStartDelay(this.A06);
        ofInt.setDuration(this.A05);
        C65759TtZ.A00(ofInt, this, 17);
        return ofInt;
    }

    public C69633Vsa(C133115zd c133115zd, Integer num, Integer num2, float f, int i, long j, long j2) {
        this.A02 = c133115zd;
        this.A06 = j;
        this.A05 = j2;
        this.A03 = num;
        this.A04 = num2;
        this.A01 = i;
        this.A00 = f;
    }
}
