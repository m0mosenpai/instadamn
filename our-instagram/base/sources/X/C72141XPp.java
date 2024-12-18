package X;

import java.util.ArrayList;

/* renamed from: X.XPp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72141XPp extends C3OI {
    public C56082hw[] A0O;
    public int A0B = -1;
    public int A0I = -1;
    public int A07 = -1;
    public int A08 = -1;
    public int A0C = -1;
    public int A0D = -1;
    public float A02 = 0.5f;
    public float A05 = 0.5f;
    public float A00 = 0.5f;
    public float A01 = 0.5f;
    public float A03 = 0.5f;
    public float A04 = 0.5f;
    public int A0A = 0;
    public int A0H = 0;
    public int A09 = 2;
    public int A0G = 2;
    public int A0J = 0;
    public int A0E = -1;
    public int A0F = 0;
    public ArrayList A0K = AbstractC166987dD.A1E();
    public C56082hw[] A0N = null;
    public C56082hw[] A0M = null;
    public int[] A0L = null;
    public int A06 = 0;

    public static final int A00(C56082hw c56082hw, C72141XPp c72141XPp, int i) {
        int i2 = 0;
        if (c56082hw != null) {
            Integer[] numArr = c56082hw.A14;
            if (numArr[1] == C05F.A0C) {
                int i3 = c56082hw.A0G;
                if (i3 != 0) {
                    if (i3 == 2) {
                        i2 = (int) (c56082hw.A03 * i);
                        if (i2 != c56082hw.A06()) {
                            c56082hw.A0t = true;
                            c72141XPp.A0d(c56082hw, numArr[0], C05F.A00, c56082hw.A07(), i2);
                        }
                    } else if (i3 != 1 && i3 == 3) {
                        return (int) ((c56082hw.A07() * c56082hw.A01) + 0.5f);
                    }
                }
            }
            return c56082hw.A06();
        }
        return i2;
    }

    public static final int A01(C56082hw c56082hw, C72141XPp c72141XPp, int i) {
        int i2 = 0;
        if (c56082hw != null) {
            Integer[] numArr = c56082hw.A14;
            if (numArr[0] == C05F.A0C) {
                int i3 = c56082hw.A0H;
                if (i3 != 0) {
                    if (i3 == 2) {
                        i2 = (int) (c56082hw.A04 * i);
                        if (i2 != c56082hw.A07()) {
                            c56082hw.A0t = true;
                            c72141XPp.A0d(c56082hw, C05F.A00, numArr[1], i2, c56082hw.A06());
                        }
                    } else if (i3 != 1 && i3 == 3) {
                        return (int) ((c56082hw.A06() * c56082hw.A01) + 0.5f);
                    }
                }
            }
            return c56082hw.A07();
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (((X.C56062hu) r0).A0H == false) goto L6;
     */
    @Override // X.C56082hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(X.C56142i3 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72141XPp.A0O(X.2i3, boolean):void");
    }
}
