package X;

import android.graphics.Rect;

/* renamed from: X.Bb2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25786Bb2 extends AbstractC28843CoD {
    public static C25786Bb2 A03;
    public C113525Ap A00;
    public C127055oj A01;
    public Rect A02 = new Rect();
    public static final BIZ A05 = BIZ.Rtl;
    public static final BIZ A04 = BIZ.Ltr;

    private final int A00(BIZ biz, int i) {
        C127055oj c127055oj = this.A01;
        if (c127055oj != null) {
            int A032 = c127055oj.A03(i);
            C127055oj c127055oj2 = this.A01;
            if (c127055oj2 != null) {
                BIZ A09 = c127055oj2.A09(A032);
                C127055oj c127055oj3 = this.A01;
                if (biz != A09) {
                    if (c127055oj3 != null) {
                        return c127055oj3.A03(i);
                    }
                } else if (c127055oj3 != null) {
                    return c127055oj3.A03.A07(i, false) - 1;
                }
            }
        }
        C14360o3.A0F("layoutResult");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC30987Djj
    public final int[] AWL(int i) {
        int i2;
        if (AbstractC28843CoD.A01(this) <= 0 || i >= AbstractC28843CoD.A01(this)) {
            return null;
        }
        try {
            C113525Ap c113525Ap = this.A00;
            if (c113525Ap == null) {
                C14360o3.A0F("node");
                throw C00O.createAndThrow();
            }
            C114205Dh A032 = c113525Ap.A03();
            int round = Math.round(A032.A00 - A032.A03);
            int i3 = 0;
            if (0 < i) {
                i3 = i;
            }
            C127055oj c127055oj = this.A01;
            if (c127055oj != null) {
                int A06 = c127055oj.A03.A06(i3);
                C127055oj c127055oj2 = this.A01;
                if (c127055oj2 != null) {
                    float A042 = c127055oj2.A03.A04(A06) + round;
                    C127055oj c127055oj3 = this.A01;
                    if (c127055oj3 != null) {
                        float A043 = c127055oj3.A03.A04(r1.A02 - 1);
                        C127055oj c127055oj4 = this.A01;
                        if (A042 < A043) {
                            if (c127055oj4 != null) {
                                i2 = c127055oj4.A03.A05(A042);
                                return A03(i3, A00(A04, i2 - 1) + 1);
                            }
                        } else if (c127055oj4 != null) {
                            i2 = c127055oj4.A03.A02;
                            return A03(i3, A00(A04, i2 - 1) + 1);
                        }
                    }
                }
            }
            C14360o3.A0F("layoutResult");
            throw C00O.createAndThrow();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC30987Djj
    public final int[] E56(int i) {
        int i2;
        if (AbstractC28843CoD.A01(this) <= 0 || i <= 0) {
            return null;
        }
        try {
            C113525Ap c113525Ap = this.A00;
            if (c113525Ap == null) {
                C14360o3.A0F("node");
                throw C00O.createAndThrow();
            }
            C114205Dh A032 = c113525Ap.A03();
            int round = Math.round(A032.A00 - A032.A03);
            int A01 = AbstractC28843CoD.A01(this);
            if (A01 > i) {
                A01 = i;
            }
            C127055oj c127055oj = this.A01;
            if (c127055oj != null) {
                int A06 = c127055oj.A03.A06(A01);
                C127055oj c127055oj2 = this.A01;
                if (c127055oj2 != null) {
                    float A042 = c127055oj2.A03.A04(A06) - round;
                    if (A042 > 0.0f) {
                        C127055oj c127055oj3 = this.A01;
                        if (c127055oj3 != null) {
                            i2 = c127055oj3.A03.A05(A042);
                        }
                    } else {
                        i2 = 0;
                    }
                    if (A01 == AbstractC28843CoD.A01(this) && i2 < A06) {
                        i2++;
                    }
                    return A03(A00(A05, i2), A01);
                }
            }
            C14360o3.A0F("layoutResult");
            throw C00O.createAndThrow();
        } catch (IllegalStateException unused) {
            return null;
        }
    }
}
