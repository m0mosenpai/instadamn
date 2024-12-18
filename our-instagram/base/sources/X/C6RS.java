package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6RS, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6RS {
    public static final void A00(Context context, View view, View view2, View view3, UserSession userSession, C141596ac c141596ac, final InterfaceC16620sF interfaceC16620sF) {
        if (C18U.A06(C06090Tz.A05, userSession, 36313896950434098L)) {
            view.setOnTouchListener(new ViewOnTouchListenerC48078LQd(context, view2, view3, userSession, c141596ac, new C207179Ew(42, interfaceC16620sF, view)));
        } else {
            C0fQ.A00(new View.OnClickListener() { // from class: X.6RW
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    int A05 = C0f9.A05(1489718672);
                    InterfaceC16620sF interfaceC16620sF2 = InterfaceC16620sF.this;
                    C14360o3.A0A(view4);
                    interfaceC16620sF2.invoke(view4, null);
                    C0f9.A0C(1123640655, A05);
                }
            }, view);
        }
    }

    public static final boolean A01(UserSession userSession, C41181vS c41181vS, boolean z, boolean z2, boolean z3, boolean z4) {
        if (AbstractC130925vf.A0F(userSession, c41181vS) || z2 || z3 || z4) {
            return false;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (z) {
            if (!C18U.A06(c06090Tz, userSession, 36313896951286072L) || !C18U.A06(c06090Tz, userSession, 36313896951089463L)) {
                return false;
            }
            return true;
        }
        return C18U.A06(c06090Tz, userSession, 36313896951089463L);
    }
}
