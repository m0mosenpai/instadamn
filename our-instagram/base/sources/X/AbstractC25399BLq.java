package X;

import android.view.View;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.BLq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25399BLq implements InterfaceC62892tS {
    public Timer A00;
    public final AtomicReference A01 = new AtomicReference(null);

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void E0r(View view) {
    }

    @Override // X.InterfaceC62892tS
    public void DXP(int i, int i2) {
        Timer timer = this.A00;
        if (timer != null) {
            timer.cancel();
        }
        this.A01.set(AbstractC167007dF.A0o(Integer.valueOf(i), i2));
        Timer timer2 = new Timer();
        timer2.schedule(new D3T(this), 150L);
        this.A00 = timer2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    @Override // X.InterfaceC62892tS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void Diq(X.C3VZ r10, float r11, float r12) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.AbstractC25398BLp
            if (r0 == 0) goto Ld6
            r6 = r9
            X.BLp r6 = (X.AbstractC25398BLp) r6
            r0 = 2
            X.C14360o3.A0B(r10, r0)
            X.3Zb r1 = r6.A0I
            float r0 = r1.A01
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 == 0) goto L1a
            r1.A01 = r11
            r0 = 68
            X.C75113Zb.A00(r1, r0)
        L1a:
            X.3VZ r0 = r1.A0i
            if (r10 == r0) goto L25
            r1.A0i = r10
            r0 = 16
            X.C75113Zb.A00(r1, r0)
        L25:
            boolean r0 = r6.A0E()
            r5 = 0
            if (r0 == 0) goto Le1
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r6.A03
            if (r2 == 0) goto Ld6
            int r0 = r2.A09
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.A0A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto Ld6
            if (r0 == 0) goto Ld6
            int r3 = r1.intValue()
            if (r3 < 0) goto Ld6
            int r4 = r0.intValue()
            if (r4 < 0) goto Ld6
            java.util.List r2 = r6.A0J
            if (r2 == 0) goto Ldd
            int r0 = r6.A03()
            int r0 = r3 % r0
            X.1qM r1 = X.AbstractC25225BEi.A0x(r2, r0)
            int r0 = r6.A03()
            int r4 = r4 % r0
            X.1qM r2 = X.AbstractC25225BEi.A0x(r2, r4)
            if (r1 == 0) goto Ldf
            java.lang.String r0 = r1.A2e()
        L69:
            java.lang.Integer r4 = X.AbstractC13950nL.A0D(r0)
            if (r1 == 0) goto Ldb
            java.lang.String r0 = r1.A2d()
        L73:
            java.lang.Integer r8 = X.AbstractC13950nL.A0D(r0)
            if (r2 == 0) goto Ld9
            java.lang.String r0 = r2.A2e()
        L7d:
            java.lang.Integer r1 = X.AbstractC13950nL.A0D(r0)
            if (r2 == 0) goto Ld7
            java.lang.String r0 = r2.A2d()
        L87:
            java.lang.Integer r7 = X.AbstractC13950nL.A0D(r0)
            if (r8 == 0) goto Ld6
            if (r4 == 0) goto Ld6
            if (r1 == 0) goto Ld6
            if (r7 == 0) goto Ld6
            float r0 = (float) r3
            float r3 = X.AbstractC166987dD.A01(r11, r0)
            X.0do r2 = r6.A0L
            java.lang.Object r0 = r2.getValue()
            android.animation.ArgbEvaluator r0 = (android.animation.ArgbEvaluator) r0
            java.lang.Object r0 = r0.evaluate(r3, r4, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            int r4 = X.AbstractC25230BEn.A0D(r0, r1)
            java.lang.Object r0 = r2.getValue()
            android.animation.ArgbEvaluator r0 = (android.animation.ArgbEvaluator) r0
            java.lang.Object r0 = r0.evaluate(r3, r8, r7)
            int r1 = X.AbstractC25230BEn.A0D(r0, r1)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r6.A03
            if (r0 == 0) goto Lc0
            android.graphics.drawable.Drawable r5 = r0.getBackground()
        Lc0:
            android.graphics.drawable.GradientDrawable r5 = (android.graphics.drawable.GradientDrawable) r5
            if (r5 != 0) goto Le9
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = r6.A03
            if (r3 == 0) goto Ld6
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r1 = new int[]{r4, r1}
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r2, r1)
            r3.setBackground(r0)
        Ld6:
            return
        Ld7:
            r0 = r5
            goto L87
        Ld9:
            r0 = r5
            goto L7d
        Ldb:
            r0 = r5
            goto L73
        Ldd:
            r1 = r5
            r2 = r5
        Ldf:
            r0 = r5
            goto L69
        Le1:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r6.A03
            if (r0 == 0) goto Ld6
            r0.setBackground(r5)
            return
        Le9:
            int[] r0 = new int[]{r4, r1}
            r5.setColors(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25399BLq.Diq(X.3VZ, float, float):void");
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DrZ(int i, int i2) {
        if (this instanceof AbstractC25398BLp) {
            AbstractC25398BLp abstractC25398BLp = (AbstractC25398BLp) this;
            AbstractC25227BEk.A1F(abstractC25398BLp.A0B, true);
            abstractC25398BLp.A08();
            abstractC25398BLp.A0I.A2W = true;
            abstractC25398BLp.A04().Cm1(C05F.A01, i, i2);
        }
    }
}
