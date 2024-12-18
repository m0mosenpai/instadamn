package X;

import java.io.File;

/* renamed from: X.0hL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10510hL extends C0L1 {
    @Override // X.C0L1
    public final C024209q A00(C0M6 c0m6) {
        C024209q c024209q = new C024209q(null);
        c024209q.A03(C0LK.A6w, AnonymousClass001.A0g("android_", c0m6.A00, "native"));
        return c024209q;
    }

    @Override // X.C0L1
    public final C0OP A01() {
        return C0OP.A0O;
    }

    @Override // X.C0L1
    public final Integer A02() {
        return C05F.A00;
    }

    @Override // X.C0L1
    public final void A04(C0M6 c0m6, File file, File file2, String str) {
        if (C0M4.A01 == 1 && !str.equals("native_app_death_early")) {
            return;
        }
        A03(c0m6, file, file2);
    }
}
