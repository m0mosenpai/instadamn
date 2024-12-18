package X;

import java.util.List;

/* renamed from: X.5Aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113535Aq {
    public final C18740w1 A00;
    public final C113505An A01;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.01O, X.0w1] */
    public C113535Aq(C01M c01m, C113525Ap c113525Ap) {
        this.A01 = c113525Ap.A05;
        int[] iArr = C01P.A00;
        ?? c01o = new C01O();
        long[] jArr = AbstractC004701m.A00;
        C18740w1.A02(c01o, 6);
        this.A00 = c01o;
        List A08 = c113525Ap.A08(false, true);
        int size = A08.size();
        for (int i = 0; i < size; i++) {
            C113525Ap c113525Ap2 = (C113525Ap) A08.get(i);
            if (c01m.A04(c113525Ap2.A02)) {
                this.A00.A06(c113525Ap2.A02);
            }
        }
    }
}
