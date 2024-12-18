package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86753tn {
    public static final void A00(Context context, C9BR c9br, C3Y8 c3y8, C86773tp c86773tp, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c9br, 2);
        C14360o3.A0B(c86773tp, 3);
        if (c9br.A02) {
            c3y8.A00 = new LPG(context, c3y8, c86773tp, interfaceC16820sZ);
        }
        C9B5 c9b5 = (C9B5) c9br.A01;
        if (c9b5 != null) {
            c3y8.A00(EnumC79303gb.A03);
            View A01 = c3y8.A01.A01();
            C14360o3.A07(A01);
            View findViewById = A01.findViewById(R.id.zero_rating_video_badge_container);
            if (findViewById != null) {
                int i = 8;
                if (c9b5.A00) {
                    i = 0;
                }
                findViewById.setVisibility(i);
                return;
            }
            return;
        }
        c3y8.A00(EnumC79303gb.A02);
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC86743tm interfaceC86743tm, C3Y8 c3y8, EnumC79303gb enumC79303gb, boolean z) {
        C14360o3.A0B(enumC79303gb, 5);
        C86763to c86763to = new C86763to(userSession);
        C86773tp c86773tp = new C86773tp(interfaceC11380iw, userSession);
        C57012jc c57012jc = c3y8.A01;
        View A01 = c57012jc.A01();
        C14360o3.A07(A01);
        Context context = A01.getContext();
        C14360o3.A07(context);
        C9BR A00 = c86763to.A00(context, enumC79303gb, z);
        View A012 = c57012jc.A01();
        C14360o3.A07(A012);
        Context context2 = A012.getContext();
        C14360o3.A07(context2);
        A00(context2, A00, c3y8, c86773tp, new C9EJ(interfaceC86743tm, 23));
    }
}
