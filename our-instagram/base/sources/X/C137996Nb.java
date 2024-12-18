package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.UpdatableAnimationState;

/* renamed from: X.6Nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137996Nb extends C58J implements C5DZ, InterfaceC138006Nc, InterfaceC1129458d {
    public InterfaceC31113Dlv A01;
    public C6M3 A02;
    public InterfaceC1131459c A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public C114205Dh A07;
    public final ScrollingLogic A09;
    public final C138016Nd A08 = new C138016Nd();
    public long A00 = 0;

    public static final void A03(C137996Nb c137996Nb) {
        InterfaceC31113Dlv interfaceC31113Dlv = c137996Nb.A01;
        if (interfaceC31113Dlv == null) {
            interfaceC31113Dlv = (InterfaceC31113Dlv) C5Zy.A00(BWI.A01, c137996Nb);
        }
        if (!c137996Nb.A04) {
            UpdatableAnimationState updatableAnimationState = new UpdatableAnimationState(interfaceC31113Dlv.Bqy());
            AbstractC23641Du.A03(C05F.A0N, AnonymousClass191.A00, new C9DM(c137996Nb, updatableAnimationState, interfaceC31113Dlv, (InterfaceC23621Ds) null, 0, 42), c137996Nb.A05());
            return;
        }
        throw new IllegalStateException("launchAnimation called when previous animation was running");
    }

    @Override // X.C5DZ
    public final /* synthetic */ void DYp(InterfaceC1131459c interfaceC1131459c) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r5 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r3 = X.AbstractC119215ad.A01(r12.A00);
        r1 = r12.A02.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r1 == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r1 != 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        r2 = r5.A01;
        r1 = r5.A02 - r2;
        r0 = X.C5YC.A02(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        return r11.AFH(r2, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        r2 = r5.A03;
        r1 = r5.A00 - r2;
        r0 = X.C5YC.A00(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005b, code lost:
    
        if (r5 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float A00(X.InterfaceC31113Dlv r11, X.C137996Nb r12) {
        /*
            long r4 = r12.A00
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto La
            r0 = 1
        La:
            r10 = 0
            if (r0 != 0) goto L5d
            X.6Nd r0 = r12.A08
            X.57S r1 = r0.A00
            int r0 = r1.A00
            r5 = 0
            if (r0 <= 0) goto L53
            int r9 = r0 + (-1)
            java.lang.Object[] r6 = r1.A02
        L1a:
            r0 = r6[r9]
            X.6Ne r0 = (X.C138026Ne) r0
            X.0sZ r0 = r0.A00
            java.lang.Object r4 = r0.invoke()
            X.5Dh r4 = (X.C114205Dh) r4
            if (r4 == 0) goto L4d
            long r7 = r4.A01()
            long r0 = r12.A00
            long r2 = X.AbstractC119215ad.A01(r0)
            X.6M3 r0 = r12.A02
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L62
            r0 = 1
            if (r1 != r0) goto L9b
            float r1 = X.C5YC.A02(r7)
            float r0 = X.C5YC.A02(r2)
        L46:
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 > 0) goto L5e
            r5 = r4
        L4d:
            int r9 = r9 + (-1)
            if (r9 >= 0) goto L1a
        L51:
            if (r5 != 0) goto L6b
        L53:
            boolean r0 = r12.A06
            if (r0 == 0) goto L5d
            X.5Dh r5 = A02(r12)
            if (r5 != 0) goto L6b
        L5d:
            return r10
        L5e:
            if (r5 != 0) goto L51
            r5 = r4
            goto L51
        L62:
            float r1 = X.C5YC.A00(r7)
            float r0 = X.C5YC.A00(r2)
            goto L46
        L6b:
            long r0 = r12.A00
            long r3 = X.AbstractC119215ad.A01(r0)
            X.6M3 r0 = r12.A02
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L8b
            r0 = 1
            if (r1 != r0) goto L95
            float r2 = r5.A01
            float r1 = r5.A02
            float r1 = r1 - r2
            float r0 = X.C5YC.A02(r3)
        L86:
            float r0 = r11.AFH(r2, r1, r0)
            return r0
        L8b:
            float r2 = r5.A03
            float r1 = r5.A00
            float r1 = r1 - r2
            float r0 = X.C5YC.A00(r3)
            goto L86
        L95:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L9b:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137996Nb.A00(X.Dlv, X.6Nb):float");
    }

    public static final C114205Dh A02(C137996Nb c137996Nb) {
        if (!((C58J) c137996Nb).A08) {
            return null;
        }
        C59U A03 = AbstractC114335Dx.A03(c137996Nb);
        InterfaceC1131459c interfaceC1131459c = c137996Nb.A03;
        if (interfaceC1131459c == null || !interfaceC1131459c.CQ7()) {
            return null;
        }
        return A03.Chk(interfaceC1131459c, false);
    }

    @Override // X.C5DZ
    public final void Def(long j) {
        int A00;
        int A002;
        C114205Dh A02;
        long j2 = this.A00;
        this.A00 = j;
        int ordinal = this.A02.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                A00 = (int) (j >> 32);
                A002 = (int) (j2 >> 32);
            } else {
                throw new RuntimeException();
            }
        } else {
            A00 = C119055aN.A00(j);
            A002 = C119055aN.A00(j2);
        }
        if (C14360o3.A00(A00, A002) < 0 && (A02 = A02(this)) != null) {
            C114205Dh c114205Dh = this.A07;
            if (c114205Dh == null) {
                c114205Dh = A02;
            }
            if (!this.A04 && !this.A06 && A04(this, c114205Dh, j2) && !A04(this, A02, j)) {
                this.A06 = true;
                A03(this);
            }
            this.A07 = A02;
        }
    }

    public C137996Nb(InterfaceC31113Dlv interfaceC31113Dlv, C6M3 c6m3, ScrollingLogic scrollingLogic, boolean z) {
        this.A02 = c6m3;
        this.A09 = scrollingLogic;
        this.A05 = z;
        this.A01 = interfaceC31113Dlv;
    }

    public static final long A01(C137996Nb c137996Nb, C114205Dh c114205Dh, long j) {
        long A01 = AbstractC119215ad.A01(j);
        int ordinal = c137996Nb.A02.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                InterfaceC31113Dlv interfaceC31113Dlv = c137996Nb.A01;
                if (interfaceC31113Dlv == null) {
                    interfaceC31113Dlv = (InterfaceC31113Dlv) C5Zy.A00(BWI.A01, c137996Nb);
                }
                float f = c114205Dh.A01;
                return AbstractC119395aw.A00(interfaceC31113Dlv.AFH(f, c114205Dh.A02 - f, C5YC.A02(A01)), 0.0f);
            }
            throw new RuntimeException();
        }
        InterfaceC31113Dlv interfaceC31113Dlv2 = c137996Nb.A01;
        if (interfaceC31113Dlv2 == null) {
            interfaceC31113Dlv2 = (InterfaceC31113Dlv) C5Zy.A00(BWI.A01, c137996Nb);
        }
        float f2 = c114205Dh.A03;
        return AbstractC119395aw.A00(0.0f, interfaceC31113Dlv2.AFH(f2, c114205Dh.A00 - f2, C5YC.A00(A01)));
    }

    public static final boolean A04(C137996Nb c137996Nb, C114205Dh c114205Dh, long j) {
        long A01 = A01(c137996Nb, c114205Dh, j);
        if (Math.abs(C119365at.A01(A01)) <= 0.5f && Math.abs(C119365at.A02(A01)) <= 0.5f) {
            return true;
        }
        return false;
    }
}
