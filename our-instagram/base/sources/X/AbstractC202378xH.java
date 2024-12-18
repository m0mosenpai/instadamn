package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8xH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202378xH extends Drawable implements InterfaceC133125ze {
    public final void A00(String str, int i) {
        String upperCase;
        C221109pY c221109pY = (C221109pY) this;
        C9SA c9sa = c221109pY.A01;
        if (str != null) {
            upperCase = str.toUpperCase(C1Q2.A02());
        } else {
            String string = c221109pY.A00.getString(2131976887);
            C14360o3.A07(string);
            upperCase = string.toUpperCase(C1Q2.A02());
        }
        C14360o3.A07(upperCase);
        c9sa.A05(upperCase, i);
    }
}
