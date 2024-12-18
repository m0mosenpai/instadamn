package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8xF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202358xF extends Drawable implements InterfaceC133125ze {
    public final void A01(String str, int i) {
        String A00;
        C221049pS c221049pS = (C221049pS) this;
        C9SA c9sa = c221049pS.A00;
        if (str != null) {
            A00 = str.toUpperCase(C1Q2.A02());
            C14360o3.A07(A00);
        } else {
            A00 = C221049pS.A00(c221049pS);
        }
        c9sa.A05(A00, i);
    }
}
