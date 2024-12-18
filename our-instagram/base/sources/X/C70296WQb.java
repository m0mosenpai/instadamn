package X;

import android.app.Activity;

/* renamed from: X.WQb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70296WQb implements InterfaceC09670ek {
    public static final C70296WQb A00 = new C70296WQb();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C14360o3.A0B(c07x, 0);
        int A05 = AbstractC25227BEk.A05(c07r, 1);
        if (A05 != 2) {
            if (A05 == 3) {
                WFS.A00((Activity) c07x, WFS.A0E, false);
                return;
            }
            return;
        }
        WFS.A00((Activity) c07x, WFS.A0E, WFS.A00);
    }
}
