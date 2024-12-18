package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;

/* renamed from: X.Cvn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29292Cvn implements C33R {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ColorDrawable A01;
    public final /* synthetic */ C76223bS A02;
    public final /* synthetic */ C2XI A03;
    public final /* synthetic */ C2XI A04;
    public final /* synthetic */ C2XI A05;
    public final /* synthetic */ C2XI A06;
    public final /* synthetic */ C2XI A07;
    public final /* synthetic */ C92524Cj A08;
    public final /* synthetic */ C26447BmU A09;
    public final /* synthetic */ C92534Ck A0A;
    public final /* synthetic */ C38321qM A0B;
    public final /* synthetic */ InterfaceC16660sJ A0C;

    public C29292Cvn(ColorDrawable colorDrawable, C76223bS c76223bS, C2XI c2xi, C2XI c2xi2, C2XI c2xi3, C2XI c2xi4, C2XI c2xi5, C92524Cj c92524Cj, C26447BmU c26447BmU, C92534Ck c92534Ck, C38321qM c38321qM, InterfaceC16660sJ interfaceC16660sJ, int i) {
        this.A0C = interfaceC16660sJ;
        this.A0A = c92534Ck;
        this.A07 = c2xi;
        this.A06 = c2xi2;
        this.A03 = c2xi3;
        this.A05 = c2xi4;
        this.A04 = c2xi5;
        this.A08 = c92524Cj;
        this.A00 = i;
        this.A01 = colorDrawable;
        this.A02 = c76223bS;
        this.A09 = c26447BmU;
        this.A0B = c38321qM;
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C92534Ck c92534Ck;
        int i2;
        int i3;
        int i4;
        int i5;
        C14360o3.A0B(c75113Zb, 0);
        if (i != 5) {
            if (i == 14 && c75113Zb.A28) {
                ArgbEvaluator argbEvaluator = AbstractC92514Ci.A00;
                C14360o3.A07(this.A02.A05.A0C);
                C92524Cj c92524Cj = this.A08;
                C38321qM c38321qM = this.A0B;
                int i6 = c75113Zb.A0S;
                int i7 = c75113Zb.A0B;
                AbstractC92514Ci.A02(c92524Cj, c38321qM, new C50268MHx(27, this.A03, this.A05), c75113Zb.A01, i6, i7);
                return;
            }
            return;
        }
        boolean z = c75113Zb.A28;
        int A0H = AbstractC166987dD.A0H(this.A0C.invoke(Integer.valueOf(c75113Zb.A02)));
        if (!c75113Zb.A2O) {
            float[] fArr = {0.0f, 1.0f};
            if (z) {
                // fill-array-data instruction
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ValueAnimator duration = ofFloat.setDuration(200L);
            C2XI c2xi = this.A03;
            c92534Ck = this.A0A;
            duration.addUpdateListener(new C28523CiH(c2xi, this.A07, this.A06, this.A04, this.A05, c92534Ck, A0H, this.A00));
            ofFloat.start();
        } else {
            c92534Ck = this.A0A;
            C92524Cj c92524Cj2 = c92534Ck.A00;
            if (z) {
                i2 = -1;
            } else {
                i2 = c92524Cj2.A09;
            }
            AbstractC25227BEk.A1E(this.A07, i2);
            C2XI c2xi2 = this.A06;
            if (z) {
                i3 = c92524Cj2.A05;
            } else {
                i3 = c92524Cj2.A06;
            }
            AbstractC25227BEk.A1E(c2xi2, i3);
            C2XI c2xi3 = this.A03;
            int i8 = A0H;
            if (!z) {
                i8 = c92524Cj2.A01;
            }
            AbstractC25227BEk.A1E(c2xi3, i8);
            C2XI c2xi4 = this.A05;
            if (!z) {
                A0H = c92524Cj2.A04;
            }
            AbstractC25227BEk.A1E(c2xi4, A0H);
            C2XI c2xi5 = this.A04;
            if (z) {
                i4 = this.A08.A02;
            } else {
                i4 = this.A00;
            }
            AbstractC25227BEk.A1E(c2xi5, i4);
        }
        ColorDrawable colorDrawable = this.A01;
        C92524Cj c92524Cj3 = c92534Ck.A00;
        if (z) {
            i5 = c92524Cj3.A07;
        } else {
            i5 = c92524Cj3.A08;
        }
        colorDrawable.setColor(i5);
    }
}
