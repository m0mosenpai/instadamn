package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CIu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27675CIu {
    public static final MUW A00(Context context, UserSession userSession, InterfaceC38371qR interfaceC38371qR, int i) {
        ImageUrl A1o;
        C38321qM A1e = interfaceC38371qR.BQN().A1e(i);
        if (A1e == null) {
            A1e = interfaceC38371qR.BQN();
        }
        String str = null;
        if (A1e.A4w()) {
            android.net.Uri uri = A1e.A05;
            if (uri != null) {
                A1o = AbstractC81033jX.A00(uri, -1, -1);
            } else {
                A1o = null;
            }
        } else {
            A1o = A1e.A1o(context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width));
        }
        String A07 = AbstractC75103Za.A07(context, userSession, interfaceC38371qR, i);
        if (!AbstractC75103Za.A0T(AbstractC905941u.A02(context, userSession, interfaceC38371qR, i, false))) {
            str = AbstractC75103Za.A05(context, userSession, A1e, interfaceC38371qR, i);
        }
        return new MUW(A1o, AbstractC75103Za.A04(interfaceC38371qR, i), A07, str, 8);
    }
}
