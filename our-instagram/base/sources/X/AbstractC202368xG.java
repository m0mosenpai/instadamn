package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8xG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202368xG extends Drawable implements InterfaceC133125ze {
    public final void A00(int i) {
        String str;
        C221059pT c221059pT = (C221059pT) this;
        C9SA c9sa = c221059pT.A00;
        String title = c221059pT.A01.getTitle();
        if (title != null) {
            str = title.toUpperCase(C1Q2.A02());
            C14360o3.A07(str);
        } else {
            str = "";
        }
        c9sa.A05(str, i);
    }
}
