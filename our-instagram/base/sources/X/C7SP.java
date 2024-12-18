package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* renamed from: X.7SP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SP extends C3OO implements InterfaceC161697Me, InterfaceC161707Mf, InterfaceC161737Mi {
    public final View A00;
    public final View A01;
    public final C7SO A02;
    public final C7SK A03;
    public final C7SB A04;
    public final C7SN A05;
    public final C7SD A06;
    public final AbstractC163037Ro A07;
    public final C7SH A08;
    public final C7S4 A09;
    public final C7SI A0A;
    public final C7S9 A0B;
    public final C7SA A0C;
    public final C7S8 A0D;
    public final C7SE A0E;
    public final C162957Rg A0F;
    public final C7SL A0G;
    public final C162947Rf A0H;
    public final C7SF A0I;
    public final C7SC A0J;
    public final C7SM A0K;
    public final C7SG A0L;
    public final C7QD A0M;
    public final C7S6 A0N;
    public final C163047Rp A0O;
    public final C7S0 A0P;
    public final C7S3 A0Q;
    public final C7SQ A0R;
    public final C7SR A0S;

    @Override // X.InterfaceC161707Mf
    public final void APo(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A0R.APo(motionEvent);
    }

    @Override // X.InterfaceC161697Me
    public final void DCG(Canvas canvas, Integer num, float f) {
        C14360o3.A0B(num, 2);
        this.A0S.DCG(canvas, num, f);
    }

    @Override // X.InterfaceC161697Me
    public final void Drc(Integer num) {
        C14360o3.A0B(num, 0);
        this.A0S.Drc(num);
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Eiq(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A0R.Eiq(motionEvent);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.7S4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7SP(android.view.View r35, android.view.View r36, X.C7SO r37, X.C7SK r38, X.C7SB r39, X.C7SN r40, X.C7SD r41, X.AbstractC163037Ro r42, X.C7SH r43, X.C7SI r44, X.C7S9 r45, X.C7SA r46, X.C7S8 r47, X.C7SE r48, X.C162957Rg r49, X.C7SL r50, X.C162947Rf r51, X.C7SF r52, X.C7SC r53, X.C7SM r54, X.C7SG r55, X.C7QD r56, X.C7S6 r57, X.C163047Rp r58, X.C7S0 r59, X.C7S3 r60) {
        /*
            r34 = this;
            r0 = r42
            android.view.View r1 = r0.A00()
            r13 = r34
            r13.<init>(r1)
            r13.A07 = r0
            r5 = r56
            r13.A0M = r5
            r14 = r49
            r13.A0F = r14
            r0 = r51
            r13.A0H = r0
            r3 = r58
            r13.A0O = r3
            r2 = r59
            r13.A0P = r2
            r0 = r60
            r13.A0Q = r0
            r4 = r57
            r13.A0N = r4
            r9 = r47
            r13.A0D = r9
            r11 = r45
            r13.A0B = r11
            r10 = r46
            r13.A0C = r10
            r18 = r39
            r0 = r18
            r13.A04 = r0
            r6 = r53
            r13.A0J = r6
            r17 = r41
            r0 = r17
            r13.A06 = r0
            r8 = r48
            r13.A0E = r8
            r0 = r52
            r13.A0I = r0
            r0 = r55
            r13.A0L = r0
            r16 = r43
            r0 = r16
            r13.A08 = r0
            r12 = r44
            r13.A0A = r12
            r0 = r38
            r13.A03 = r0
            r7 = r50
            r13.A0G = r7
            r0 = r54
            r13.A0K = r0
            r0 = r40
            r13.A05 = r0
            r19 = r37
            r0 = r19
            r13.A02 = r0
            r0 = r35
            r13.A01 = r0
            r21 = r36
            r0 = r21
            r13.A00 = r0
            X.7S4 r0 = new X.7S4
            r0.<init>()
            r13.A09 = r0
            boolean r0 = r5 instanceof X.InterfaceC161707Mf
            if (r0 == 0) goto Lc6
            r15 = r5
            X.7Mf r15 = (X.InterfaceC161707Mf) r15
        L89:
            X.7SQ r0 = new X.7SQ
            r0.<init>(r1, r15, r14)
            r13.A0R = r0
            android.view.View r0 = r13.itemView
            android.content.Context r15 = r0.getContext()
            X.C14360o3.A07(r15)
            r20 = 0
            X.7SR r0 = new X.7SR
            r30 = r8
            r31 = r12
            r32 = r7
            r33 = r19
            r22 = r3
            r23 = r4
            r24 = r11
            r25 = r10
            r26 = r18
            r27 = r6
            r28 = r17
            r29 = r16
            r14 = r0
            r16 = r1
            r17 = r21
            r18 = r5
            r19 = r9
            r21 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r13.A0S = r0
            return
        Lc6:
            r15 = 0
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7SP.<init>(android.view.View, android.view.View, X.7SO, X.7SK, X.7SB, X.7SN, X.7SD, X.7Ro, X.7SH, X.7SI, X.7S9, X.7SA, X.7S8, X.7SE, X.7Rg, X.7SL, X.7Rf, X.7SF, X.7SC, X.7SM, X.7SG, X.7QD, X.7S6, X.7Rp, X.7S0, X.7S3):void");
    }

    @Override // X.InterfaceC161697Me
    public final boolean AG9() {
        return this.A0S.AG9();
    }

    @Override // X.InterfaceC161697Me
    public final boolean AGA(MotionEvent motionEvent) {
        return this.A0S.AG9();
    }

    @Override // X.InterfaceC161737Mi
    public final C7S5 Bkh() {
        return this.A09;
    }

    @Override // X.InterfaceC161697Me
    public final Integer C4a() {
        return this.A0S.C4a();
    }

    @Override // X.InterfaceC161697Me
    public final float C4c() {
        return this.A0S.C4c();
    }

    @Override // X.InterfaceC161697Me
    public final List CGY() {
        return this.A0S.CGY();
    }

    @Override // X.InterfaceC161697Me
    public final List CGZ() {
        return this.A0S.CGZ();
    }

    @Override // X.InterfaceC161707Mf
    public final void DBy(float f, float f2) {
        this.A0R.DBy(f, f2);
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Ej5() {
        return this.A0R.Ej5();
    }
}
