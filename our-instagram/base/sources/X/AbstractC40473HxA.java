package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.HxA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40473HxA {
    public static void A00(View view, C6FG c6fg, C102884kP c102884kP) {
        C42277Io1 c42277Io1 = (C42277Io1) AnonymousClass634.A06(c6fg, c102884kP);
        if (c42277Io1 == null) {
            AbstractC25241Le.A02("IGShoppingNavBarExtensionBinderUtils", "Got null NavbarExtensionController on binding.");
            return;
        }
        C14360o3.A0B(view, 0);
        C6FG c6fg2 = c42277Io1.A07;
        C56352iT A00 = Hx9.A00(C6BQ.A03(c6fg2), c6fg2);
        if (A00 != null) {
            c42277Io1.A00 = A00;
        }
        Fragment A002 = C6BQ.A00(c6fg2);
        if (A002 instanceof C72743Nv) {
            C72743Nv c72743Nv = (C72743Nv) A002;
            c72743Nv.A09.A0Z = true;
            C56352iT.A0t.A03(c72743Nv.A03).A0W.remove(c72743Nv);
        }
        C6BQ.A0I(c6fg2, c42277Io1);
        view.post(new J4O(A002, c42277Io1));
    }
}
