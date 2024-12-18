package X;

import android.view.View;

/* renamed from: X.VhL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69070VhL {
    public boolean A00;
    public final View A01;
    public final C66309U8i A02;

    public C69070VhL(View view, C66309U8i c66309U8i) {
        this.A01 = view;
        this.A02 = c66309U8i;
        if (!c66309U8i.A02) {
            c66309U8i.A02 = true;
            c66309U8i.A05.stop();
            c66309U8i.invalidateSelf();
        }
        c66309U8i.A01(true);
        c66309U8i.setCallback(view);
    }
}
