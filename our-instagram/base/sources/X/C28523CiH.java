package X;

import android.animation.ValueAnimator;

/* renamed from: X.CiH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28523CiH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C2XI A02;
    public final /* synthetic */ C2XI A03;
    public final /* synthetic */ C2XI A04;
    public final /* synthetic */ C2XI A05;
    public final /* synthetic */ C2XI A06;
    public final /* synthetic */ C92534Ck A07;

    public C28523CiH(C2XI c2xi, C2XI c2xi2, C2XI c2xi3, C2XI c2xi4, C2XI c2xi5, C92534Ck c92534Ck, int i, int i2) {
        this.A02 = c2xi;
        this.A07 = c92534Ck;
        this.A01 = i;
        this.A06 = c2xi2;
        this.A05 = c2xi3;
        this.A03 = c2xi4;
        this.A00 = i2;
        this.A04 = c2xi5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float A00 = AbstractC167017dG.A00(valueAnimator);
        C2XI c2xi = this.A02;
        C92534Ck c92534Ck = this.A07;
        int i = this.A01;
        C92524Cj c92524Cj = c92534Ck.A00;
        AbstractC25227BEk.A1E(c2xi, AbstractC75103Za.A00(A00, c92524Cj.A01, i));
        AbstractC25227BEk.A1E(this.A06, AbstractC75103Za.A00(A00, c92524Cj.A09, -1));
        AbstractC25227BEk.A1E(this.A05, AbstractC75103Za.A00(A00, c92524Cj.A06, c92524Cj.A05));
        AbstractC25227BEk.A1E(this.A03, AbstractC75103Za.A00(A00, this.A00, c92524Cj.A02));
        AbstractC25227BEk.A1E(this.A04, AbstractC75103Za.A00(A00, c92524Cj.A04, i));
    }
}
