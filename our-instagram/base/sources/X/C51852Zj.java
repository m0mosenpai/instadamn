package X;

import android.content.res.Configuration;

/* renamed from: X.2Zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51852Zj {
    public static final void A00() {
        C11X c11x = C11X.A00;
        C18C.A07(c11x, "Must call setInstance() first");
        C27101Tj A01 = c11x.A01();
        Configuration configuration = A01.getConfiguration();
        Configuration A00 = AbstractC215613i.A00(configuration);
        if (configuration.uiMode != A00.uiMode) {
            A01.updateConfiguration(A00, A01.getDisplayMetrics());
        }
    }
}
