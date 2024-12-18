package X;

/* renamed from: X.5YJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5YJ {
    public static final /* synthetic */ C5YJ A07 = new Object();
    public static final C5YL A00 = new C5YL() { // from class: X.5YK
        @Override // X.C5YL
        public final long AIx(long j, long j2) {
            float max = Math.max(C5YC.A02(j2) / C5YC.A02(j), C5YC.A00(j2) / C5YC.A00(j));
            return AbstractC119165aY.A00(max, max);
        }
    };
    public static final C5YL A04 = new C5YL() { // from class: X.5YM
        @Override // X.C5YL
        public final long AIx(long j, long j2) {
            float min = Math.min(C5YC.A02(j2) / C5YC.A02(j), C5YC.A00(j2) / C5YC.A00(j));
            return AbstractC119165aY.A00(min, min);
        }
    };
    public static final C5YL A02 = new C5YL() { // from class: X.5YN
        @Override // X.C5YL
        public final long AIx(long j, long j2) {
            float A002 = C5YC.A00(j2) / C5YC.A00(j);
            return AbstractC119165aY.A00(A002, A002);
        }
    };
    public static final C5YL A03 = new C5YL() { // from class: X.5YO
        @Override // X.C5YL
        public final long AIx(long j, long j2) {
            float A022 = C5YC.A02(j2) / C5YC.A02(j);
            return AbstractC119165aY.A00(A022, A022);
        }
    };
    public static final C5YL A05 = new C5YL() { // from class: X.5YP
        @Override // X.C5YL
        public final long AIx(long j, long j2) {
            float min;
            if (C5YC.A02(j) <= C5YC.A02(j2) && C5YC.A00(j) <= C5YC.A00(j2)) {
                min = 1.0f;
            } else {
                min = Math.min(C5YC.A02(j2) / C5YC.A02(j), C5YC.A00(j2) / C5YC.A00(j));
            }
            return AbstractC119165aY.A00(min, min);
        }
    };
    public static final C5YQ A06 = new Object();
    public static final C5YL A01 = new C5YL() { // from class: X.5YR
        @Override // X.C5YL
        public final long AIx(long j, long j2) {
            return AbstractC119165aY.A00(C5YC.A02(j2) / C5YC.A02(j), C5YC.A00(j2) / C5YC.A00(j));
        }
    };
}
