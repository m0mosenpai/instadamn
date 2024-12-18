package X;

import android.animation.AnimatorSet;

/* renamed from: X.6Pa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138446Pa {
    public C141596ac A00;
    public AnimatorSet A01;
    public final C6TT A02;

    public C138446Pa(C6TT c6tt) {
        C14360o3.A0B(c6tt, 1);
        this.A02 = c6tt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r4.A03 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet A00() {
        /*
            r13 = this;
            android.animation.AnimatorSet r1 = r13.A01
            if (r1 != 0) goto L28
            X.6TT r4 = r13.A02
            r10 = 0
            X.2iX r0 = r4.A07
            boolean r0 = r0.CWW()
            r3 = 1
            if (r0 == 0) goto L15
            android.widget.ImageView r0 = r4.A03
            r2 = 1
            if (r0 != 0) goto L16
        L15:
            r2 = 0
        L16:
            X.6TV r0 = r4.A05
            int r1 = r0.ordinal()
            if (r1 == r3) goto L29
            r0 = 4
            if (r1 == r0) goto L29
            if (r1 == r10) goto L25
            if (r2 != 0) goto L2f
        L25:
            r1 = 0
        L26:
            r13.A01 = r1
        L28:
            return r1
        L29:
            if (r2 == 0) goto L25
            android.widget.TextView r0 = r4.A04
            if (r0 == 0) goto L25
        L2f:
            r9 = 1
            if (r1 == r3) goto L93
            r0 = 4
            if (r1 == r0) goto L7c
            r0 = 3
            if (r1 == r0) goto L5c
            r0 = 2
            if (r1 != r0) goto L25
            int r2 = r4.A06
            r0 = 750(0x2ee, double:3.705E-321)
            android.animation.AnimatorSet r8 = X.C138456Pb.A01(r4, r2, r0)
            android.animation.ObjectAnimator r4 = X.C138456Pb.A02(r4)
        L47:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.AnimatorSet$Builder r0 = r1.play(r4)
            r0.after(r8)
        L53:
            X.6Ps r0 = new X.6Ps
            r0.<init>()
            r1.addListener(r0)
            goto L26
        L5c:
            r2 = 600(0x258, double:2.964E-321)
            int r0 = r4.A06
            android.animation.AnimatorSet r8 = X.C138456Pb.A01(r4, r0, r2)
            android.widget.ImageView r6 = r4.A00()
            r4 = 0
            r0 = 0
            float[] r5 = new float[r9]
            r5[r10] = r4
            java.lang.String r4 = "translationY"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r6, r4, r5)
            r4.setDuration(r2)
            r4.setStartDelay(r0)
            goto L47
        L7c:
            r0 = 750(0x2ee, double:3.705E-321)
            android.animation.AnimatorSet r0 = X.C138456Pb.A01(r4, r10, r0)
            android.animation.AnimatorSet r2 = X.C138456Pb.A00(r4, r10)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.AnimatorSet$Builder r0 = r1.play(r0)
            r0.with(r2)
            goto L53
        L93:
            int r2 = r4.A06
            r0 = 750(0x2ee, double:3.705E-321)
            android.animation.AnimatorSet r0 = X.C138456Pb.A01(r4, r2, r0)
            android.animation.AnimatorSet r1 = X.C138456Pb.A00(r4, r2)
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            android.animation.AnimatorSet$Builder r0 = r8.play(r0)
            r0.with(r1)
            android.animation.ObjectAnimator r12 = X.C138456Pb.A02(r4)
            android.widget.TextView r11 = r4.A01()
            r7 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r4 = 600(0x258, double:2.964E-321)
            r2 = 1200(0x4b0, double:5.93E-321)
            r0 = 2
            float[] r1 = new float[r0]
            r1[r10] = r7
            r1[r9] = r6
            java.lang.String r0 = "alpha"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r11, r0, r1)
            r1.setDuration(r4)
            r1.setStartDelay(r2)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            android.animation.AnimatorSet$Builder r0 = r4.play(r12)
            r0.with(r1)
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138446Pa.A00():android.animation.AnimatorSet");
    }

    public final void A01(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                C138456Pb.A03(this);
                return;
            }
        } else {
            C141596ac c141596ac = this.A00;
            if (c141596ac != null && c141596ac.A0t) {
                AnimatorSet A00 = A00();
                if (A00 != null && A00.isRunning()) {
                    return;
                }
            } else {
                AnimatorSet A002 = A00();
                if (A002 != null) {
                    A002.cancel();
                }
                C6TT c6tt = this.A02;
                c6tt.A02();
                InterfaceC56392iX interfaceC56392iX = c6tt.A07;
                if (interfaceC56392iX.CWW()) {
                    interfaceC56392iX.setVisibility(0);
                }
                AnimatorSet A003 = A00();
                if (A003 == null) {
                    return;
                }
                A003.start();
                return;
            }
        }
        AnimatorSet A004 = A00();
        if (A004 != null) {
            A004.cancel();
        }
        C6TT c6tt2 = this.A02;
        int ordinal = c6tt2.A05.ordinal();
        if (ordinal == 1 || ordinal == 4 || ordinal == 3 || ordinal == 2) {
            c6tt2.A03(1.0f);
            if (c6tt2.A03 != null) {
                c6tt2.A00().setAlpha(1.0f);
            }
            if (c6tt2.A03 != null) {
                c6tt2.A00().setTranslationY(0.0f);
            }
            if (c6tt2.A04 != null) {
                c6tt2.A01().setAlpha(0.0f);
            }
            if (c6tt2.A04 != null) {
                c6tt2.A01().setTranslationY(0.0f);
            }
        }
        InterfaceC56392iX interfaceC56392iX2 = c6tt2.A07;
        if (!interfaceC56392iX2.CWW()) {
            return;
        }
        interfaceC56392iX2.setVisibility(0);
    }
}
