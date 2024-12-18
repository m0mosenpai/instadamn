package X;

/* renamed from: X.096, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass096 {
    public final String A00(C0M6 c0m6, C0OP c0op) {
        if (!c0op.equals(C0OP.A0U) && !c0op.equals(C0OP.A0R) && !c0op.equals(C0OP.A0Q) && !c0op.equals(C0OP.A0B) && !c0op.equals(C0OP.A07)) {
            boolean equals = c0op.equals(C0OP.A0E);
            C0M6 c0m62 = C0M6.CRITICAL_REPORT;
            if (equals) {
                if (c0m6 != c0m62) {
                    return "collector";
                }
            } else {
                if (c0m6 == c0m62) {
                    return "collector";
                }
                return null;
            }
        }
        return "perf";
    }
}
