package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.59W, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C59W implements C59X {
    public int A00;
    public int A01;
    public long A03 = 0 << 32;
    public long A04 = C5AS.A00;
    public long A02 = 0;

    public void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        A0K(null, f, j);
    }

    public abstract void A0K(InterfaceC16660sJ interfaceC16660sJ, float f, long j);

    private final void A0E() {
        long j = this.A03;
        int i = (int) (j >> 32);
        long j2 = this.A04;
        int A03 = C17s.A03(i, Constraints.A03(j2), Constraints.A01(j2));
        this.A01 = A03;
        int A00 = C119055aN.A00(j);
        int A032 = C17s.A03(A00, Constraints.A02(j2), Constraints.A00(j2));
        this.A00 = A032;
        this.A02 = AbstractC113765Bo.A00((A03 - i) / 2, (A032 - A00) / 2);
    }

    public final int A0F() {
        C59W A0V;
        if (this instanceof C113385Aa) {
            A0V = ((C113385Aa) this).A0S.A0I.A0W.A04;
        } else if (this instanceof C121665fI) {
            A0V = ((C121665fI) this).A0J.A0I.A0W.A04.A0V();
            C14360o3.A0A(A0V);
        } else {
            return C119055aN.A00(this.A03);
        }
        return A0V.A0F();
    }

    public final int A0G() {
        C59W A0V;
        if (this instanceof C113385Aa) {
            A0V = ((C113385Aa) this).A0S.A0I.A0W.A04;
        } else if (this instanceof C121665fI) {
            A0V = ((C121665fI) this).A0J.A0I.A0W.A04.A0V();
            C14360o3.A0A(A0V);
        } else {
            return (int) (this.A03 >> 32);
        }
        return A0V.A0G();
    }

    public final void A0H(long j) {
        if (this.A03 != j) {
            this.A03 = j;
            A0E();
        }
    }

    public final void A0I(long j) {
        if (this.A04 != j) {
            this.A04 = j;
            A0E();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.58J] */
    public final /* synthetic */ Object BbJ() {
        if (this instanceof C113385Aa) {
            return ((C113385Aa) this).A0A;
        }
        if (this instanceof C59U) {
            AnonymousClass599 anonymousClass599 = ((C59U) this).A0H;
            C59S c59s = anonymousClass599.A0W;
            boolean z = false;
            if ((c59s.A02.A00 & 64) != 0) {
                z = true;
            }
            if (!z) {
                return null;
            }
            Object obj = null;
            for (C58J c58j = c59s.A05; c58j != null; c58j = c58j.A04) {
                if ((c58j.A01 & 64) != 0) {
                    ?? r0 = 0;
                    C5AY c5ay = c58j;
                    do {
                        if (c5ay instanceof C5Dc) {
                            obj = ((C5Dc) c5ay).Cpn(anonymousClass599.A0C, obj);
                        } else if ((c5ay.A01 & 64) != 0 && (c5ay instanceof C5AY)) {
                            C58J c58j2 = c5ay.A00;
                            int i = 0;
                            r0 = r0;
                            c5ay = c5ay;
                            while (c58j2 != null) {
                                if ((c58j2.A01 & 64) != 0) {
                                    i++;
                                    r0 = r0;
                                    if (i == 1) {
                                        c5ay = c58j2;
                                    } else {
                                        if (r0 == 0) {
                                            r0 = new C57S(new C58J[16]);
                                        }
                                        if (c5ay != 0) {
                                            r0.A09(c5ay);
                                            c5ay = 0;
                                        }
                                        r0.A09(c58j2);
                                    }
                                }
                                c58j2 = c58j2.A02;
                                r0 = r0;
                                c5ay = c5ay;
                            }
                            if (i == 1) {
                            }
                        }
                        c5ay = AbstractC114335Dx.A00(r0);
                    } while (c5ay != 0);
                }
            }
            return obj;
        }
        if (this instanceof AbstractC137606Lg) {
            return ((AbstractC137606Lg) this).A04.BbJ();
        }
        if (this instanceof C121665fI) {
            return ((C121665fI) this).A06;
        }
        return null;
    }
}
