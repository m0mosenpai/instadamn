package X;

import java.io.File;

/* renamed from: X.0hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10540hO extends C0L1 {
    @Override // X.C0L1
    public final C024209q A00(C0M6 c0m6) {
        C024209q c024209q = new C024209q(null);
        c024209q.A03(C0LK.A4x, "anr");
        c024209q.A03(C0LK.A6w, AnonymousClass001.A0g("android_", c0m6.A00, "anr"));
        return c024209q;
    }

    @Override // X.C0L1
    public final C0OP A01() {
        return C0OP.A04;
    }

    @Override // X.C0L1
    public final Integer A02() {
        return C05F.A01;
    }

    @Override // X.C0L1
    public final void A03(C0M6 c0m6, File file, File file2) {
        boolean z;
        if (c0m6 == C0M6.LARGE_REPORT) {
            synchronized (C0SM.class) {
                z = C0SM.A0D;
            }
            if (!z) {
                super.A03(c0m6, file, file2);
            }
        }
    }
}
