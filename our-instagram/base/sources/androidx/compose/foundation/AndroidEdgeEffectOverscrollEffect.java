package androidx.compose.foundation;

import X.AbstractC119215ad;
import X.AbstractC119395aw;
import X.AbstractC65751TtQ;
import X.AbstractC74903Yf;
import X.BHO;
import X.C0eB;
import X.C119055aN;
import X.C119365at;
import X.C137926Mr;
import X.C137946Mu;
import X.C137956Mv;
import X.C14360o3;
import X.C1H4;
import X.C25260BFy;
import X.C5AC;
import X.C5XU;
import X.C5YB;
import X.C5YC;
import X.C6KX;
import X.C6M9;
import X.C9D3;
import X.InterfaceC09390do;
import X.InterfaceC137936Mt;
import X.InterfaceC74953Yl;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;

/* loaded from: classes3.dex */
public final class AndroidEdgeEffectOverscrollEffect implements InterfaceC137936Mt {
    public C119365at A00;
    public C25260BFy A01;
    public long A02;
    public boolean A03;
    public final C137946Mu A04;
    public final InterfaceC74953Yl A05;
    public final Modifier A06;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.InterfaceC137936Mt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ACG(X.InterfaceC23621Ds r11, X.InterfaceC16620sF r12, long r13) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.ACG(X.1Ds, X.0sF, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r0.isFinished() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r0 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04() {
        /*
            r3 = this;
            X.6Mu r2 = r3.A04
            android.widget.EdgeEffect r0 = r2.A07
            if (r0 == 0) goto L48
            r0.onRelease()
            boolean r1 = r0.isFinished()
        Ld:
            android.widget.EdgeEffect r0 = r2.A01
            if (r0 == 0) goto L1f
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L1e
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L1f
        L1e:
            r1 = 1
        L1f:
            android.widget.EdgeEffect r0 = r2.A03
            if (r0 == 0) goto L31
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L30
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L31
        L30:
            r1 = 1
        L31:
            android.widget.EdgeEffect r0 = r2.A05
            if (r0 == 0) goto L3e
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L40
        L3e:
            if (r1 == 0) goto L47
        L40:
            X.3Yl r1 = r3.A05
            X.0eB r0 = X.C0eB.A00
            r1.Egh(r0)
        L47:
            return
        L48:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A04():void");
    }

    public final long A05() {
        long A01;
        C119365at c119365at = this.A00;
        if (c119365at != null) {
            A01 = c119365at.A00;
        } else {
            A01 = C5YB.A01(this.A02);
        }
        float A012 = C119365at.A01(A01);
        long j = this.A02;
        return AbstractC119395aw.A00(A012 / C5YC.A02(j), C119365at.A02(A01) / C5YC.A00(j));
    }

    public final void A06(long j) {
        long j2 = this.A02;
        boolean z = false;
        if (j2 == 0) {
            z = true;
        }
        boolean z2 = false;
        if (j == j2) {
            z2 = true;
        }
        boolean z3 = !z2;
        this.A02 = j;
        if (z3) {
            C137946Mu c137946Mu = this.A04;
            long A00 = AbstractC119215ad.A00(C1H4.A01(C5YC.A02(j)), C1H4.A01(C5YC.A00(j)));
            c137946Mu.A00 = A00;
            EdgeEffect edgeEffect = c137946Mu.A07;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (A00 >> 32), C119055aN.A00(A00));
            }
            EdgeEffect edgeEffect2 = c137946Mu.A01;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (A00 >> 32), C119055aN.A00(A00));
            }
            EdgeEffect edgeEffect3 = c137946Mu.A03;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize(C119055aN.A00(A00), (int) (A00 >> 32));
            }
            EdgeEffect edgeEffect4 = c137946Mu.A05;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize(C119055aN.A00(A00), (int) (A00 >> 32));
            }
            EdgeEffect edgeEffect5 = c137946Mu.A08;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (A00 >> 32), C119055aN.A00(A00));
            }
            EdgeEffect edgeEffect6 = c137946Mu.A02;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (A00 >> 32), C119055aN.A00(A00));
            }
            EdgeEffect edgeEffect7 = c137946Mu.A04;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize(C119055aN.A00(A00), (int) (A00 >> 32));
            }
            EdgeEffect edgeEffect8 = c137946Mu.A06;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize(C119055aN.A00(A00), (int) (A00 >> 32));
            }
        }
        if (!z && z3) {
            this.A05.Egh(C0eB.A00);
            A04();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x016e, code lost:
    
        if ((!r0.isFinished()) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x019a, code lost:
    
        if ((!r0.isFinished()) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01aa, code lost:
    
        if (r10 == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01a8, code lost:
    
        if (r6 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0141, code lost:
    
        if ((!r0.isFinished()) != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0148  */
    @Override // X.InterfaceC137936Mt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ACH(X.InterfaceC16660sJ r14, int r15, long r16) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.ACH(X.0sJ, int, long):long");
    }

    @Override // X.InterfaceC137936Mt
    public final Modifier B0U() {
        return this.A06;
    }

    @Override // X.InterfaceC137936Mt
    public final boolean CWK() {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        C137946Mu c137946Mu = this.A04;
        EdgeEffect edgeEffect4 = c137946Mu.A07;
        if ((edgeEffect4 == null || AbstractC65751TtQ.A00(edgeEffect4) == 0.0f) && (((edgeEffect = c137946Mu.A01) == null || AbstractC65751TtQ.A00(edgeEffect) == 0.0f) && (((edgeEffect2 = c137946Mu.A03) == null || AbstractC65751TtQ.A00(edgeEffect2) == 0.0f) && ((edgeEffect3 = c137946Mu.A05) == null || AbstractC65751TtQ.A00(edgeEffect3) == 0.0f)))) {
            return false;
        }
        return true;
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, C137926Mr c137926Mr) {
        Modifier bho;
        C137946Mu c137946Mu = new C137946Mu(context, C5AC.A00(c137926Mr.A00));
        this.A04 = c137946Mu;
        C0eB c0eB = C0eB.A00;
        C6M9 c6m9 = C6M9.A00;
        C14360o3.A0C(c6m9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A05 = new ParcelableSnapshotMutableState(c6m9, c0eB);
        this.A02 = 0L;
        Modifier A00 = C6KX.A00(Modifier.A00, c0eB, new C9D3(this, null, 3));
        if (Build.VERSION.SDK_INT >= 31) {
            bho = new C137956Mv(this, c137946Mu, C5XU.A00);
        } else {
            bho = new BHO(this, c137946Mu, c137926Mr, C5XU.A00);
        }
        this.A06 = A00.Eq3(bho);
    }

    private final float A00(long j) {
        float A01 = C119365at.A01(A05());
        float A02 = C119365at.A02(j);
        float A00 = A02 / C5YC.A00(this.A02);
        C137946Mu c137946Mu = this.A04;
        EdgeEffect edgeEffect = c137946Mu.A01;
        if (edgeEffect == null) {
            edgeEffect = C137946Mu.A00(c137946Mu);
            c137946Mu.A01 = edgeEffect;
        }
        float A002 = (-AbstractC65751TtQ.A01(edgeEffect, -A00, 1.0f - A01)) * C5YC.A00(this.A02);
        if (AbstractC65751TtQ.A00(edgeEffect) != 0.0f) {
            return A02;
        }
        return A002;
    }

    private final float A01(long j) {
        float A02 = C119365at.A02(A05());
        float A01 = C119365at.A01(j);
        float A022 = A01 / C5YC.A02(this.A02);
        C137946Mu c137946Mu = this.A04;
        EdgeEffect edgeEffect = c137946Mu.A03;
        if (edgeEffect == null) {
            edgeEffect = C137946Mu.A00(c137946Mu);
            c137946Mu.A03 = edgeEffect;
        }
        float A012 = AbstractC65751TtQ.A01(edgeEffect, A022, 1.0f - A02) * C5YC.A02(this.A02);
        if (AbstractC65751TtQ.A00(edgeEffect) != 0.0f) {
            return A01;
        }
        return A012;
    }

    private final float A02(long j) {
        float A02 = C119365at.A02(A05());
        float A01 = C119365at.A01(j);
        float A022 = A01 / C5YC.A02(this.A02);
        C137946Mu c137946Mu = this.A04;
        EdgeEffect edgeEffect = c137946Mu.A05;
        if (edgeEffect == null) {
            edgeEffect = C137946Mu.A00(c137946Mu);
            c137946Mu.A05 = edgeEffect;
        }
        float A023 = (-AbstractC65751TtQ.A01(edgeEffect, -A022, A02)) * C5YC.A02(this.A02);
        if (AbstractC65751TtQ.A00(edgeEffect) != 0.0f) {
            return A01;
        }
        return A023;
    }

    private final float A03(long j) {
        float A01 = C119365at.A01(A05());
        float A02 = C119365at.A02(j);
        float A00 = A02 / C5YC.A00(this.A02);
        C137946Mu c137946Mu = this.A04;
        EdgeEffect edgeEffect = c137946Mu.A07;
        if (edgeEffect == null) {
            edgeEffect = C137946Mu.A00(c137946Mu);
            c137946Mu.A07 = edgeEffect;
        }
        float A012 = AbstractC65751TtQ.A01(edgeEffect, A00, A01) * C5YC.A00(this.A02);
        if (AbstractC65751TtQ.A00(edgeEffect) != 0.0f) {
            return A02;
        }
        return A012;
    }
}
