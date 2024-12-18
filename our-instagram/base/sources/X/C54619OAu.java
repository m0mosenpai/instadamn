package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OAu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54619OAu {
    public final V3E A00;
    public final C52210N8z A01;
    public final C67929V2t A02;

    public C54619OAu(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC71958XCk interfaceC71958XCk, XLU xlu, Integer num, String str, boolean z, boolean z2, boolean z3) {
        AbstractC167027dH.A0a(1, context, userSession, interfaceC11380iw, xlu);
        C14360o3.A0B(interfaceC71958XCk, 5);
        InterfaceC72020XFi interfaceC72020XFi = InterfaceC72020XFi.A01;
        C14360o3.A0B(interfaceC72020XFi, 5);
        this.A00 = new V3E(context, interfaceC11380iw, userSession, xlu, interfaceC72020XFi, num, str, z, z2, z3, false, false, false);
        this.A02 = new C67929V2t(interfaceC71958XCk);
        this.A01 = new C52210N8z(userSession, fragmentActivity);
    }
}
