package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5hF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC122795hF {
    public static final long A00(float f, int i, long j, boolean z) {
        int A01;
        if ((z || i == 2) && Constraints.A07(j)) {
            A01 = Constraints.A01(j);
        } else {
            A01 = Integer.MAX_VALUE;
        }
        int A03 = Constraints.A03(j);
        if (A03 != A01) {
            A01 = C17s.A03(AbstractC122805hG.A00(f), A03, A01);
        }
        return AbstractC119035aK.A04(0, A01, 0, Constraints.A00(j));
    }
}
