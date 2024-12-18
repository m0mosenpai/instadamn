package X;

import android.view.View;

/* loaded from: classes7.dex */
public abstract class HxL {
    public static Object A00(C6FW c6fw) {
        C6FG c6fg = (C6FG) c6fw.A01();
        boolean A1a = AbstractC166987dD.A1a(c6fw.A02());
        C102884kP c102884kP = (C102884kP) c6fw.A00();
        View view = C6BQ.A00(c6fg).mView;
        if (view != null) {
            C56352iT A00 = Hx9.A00(C6BQ.A03(c6fg), c6fg);
            if (A00 != null) {
                A00.A0B = A1a;
            }
            AbstractC40473HxA.A00(view, c6fg, c102884kP);
        }
        return null;
    }
}
