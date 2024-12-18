package X;

import java.io.File;

/* renamed from: X.0OL, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0OL {
    public static final C0N9 A01 = new C0N9() { // from class: X.08a
        @Override // X.C0N9
        public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
            File A02 = c0nk.A05().A02("");
            if (A02 == null) {
                return null;
            }
            return new AnonymousClass066(C0OD.A00(A02));
        }
    };
    public static final C0N9 A00 = new C0N9() { // from class: X.09K
        @Override // X.C0N9
        public final /* bridge */ /* synthetic */ Object ALP(C0NK c0nk) {
            if (C04770Mv.A00 == C04770Mv.A03) {
                File file = c0nk.A05().A05;
                C02R.A03(file, "Did you call SessionManager.init()?");
                C0Mq A002 = C0OD.A00(file);
                if (A002 == null) {
                    return null;
                }
                C04770Mv.A00(A002);
            }
            return new AnonymousClass066(C04770Mv.A00);
        }
    };
}
