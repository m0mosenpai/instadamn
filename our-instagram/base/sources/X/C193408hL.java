package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.8hL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193408hL {
    public boolean A00;
    public final C01U A02 = new C01U();
    public final Handler A01 = new Handler(Looper.getMainLooper());

    public final void A00(InterfaceC16660sJ interfaceC16660sJ) {
        C9EL c9el = new C9EL(interfaceC16660sJ, 10);
        C01U c01u = this.A02;
        if (c01u.isEmpty() && !this.A00) {
            this.A00 = true;
            c9el.invoke(new C206959Ea(this, 1));
        } else {
            c01u.addLast(c9el);
        }
    }
}
