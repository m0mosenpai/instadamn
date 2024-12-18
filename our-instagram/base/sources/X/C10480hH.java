package X;

import java.io.File;

/* renamed from: X.0hH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10480hH extends C0L1 {
    @Override // X.C0L1
    public final C024209q A00(C0M6 c0m6) {
        C024209q c024209q = new C024209q(null);
        c024209q.A03(C0LK.A6w, AnonymousClass001.A0g("android_", c0m6.A00, "java"));
        return c024209q;
    }

    @Override // X.C0L1
    public final C0OP A01() {
        return C0OP.A0G;
    }

    @Override // X.C0L1
    public final Integer A02() {
        return C05F.A00;
    }

    @Override // X.C0L1
    public final File[] A05(C0M6 c0m6, File file) {
        if (c0m6 == C0M6.LARGE_REPORT) {
            return new File[]{new File(file, "critical_java_app_death_early_prop.txt")};
        }
        return null;
    }
}
