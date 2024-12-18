package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7GM, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7GM {
    public static final C7GN A00(Context context, UserSession userSession, C7DK c7dk, C7GL c7gl, C7GJ c7gj, InterfaceC83713oG interfaceC83713oG, boolean z, boolean z2) {
        C14360o3.A0B(context, 1);
        C7GN c7gn = new C7GN(context, userSession, c7dk, c7gl, c7gj, interfaceC83713oG, z, z2);
        GestureDetector gestureDetector = new GestureDetector(c7gn.A0L, c7gn);
        c7gn.A06 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        C7GJ c7gj2 = c7gn.A0R;
        View view = c7gj2.A00;
        if (view != null) {
            c7gj2.A00 = view;
            view.setOnTouchListener(new C7GW(c7gn));
        }
        return c7gn;
    }
}
