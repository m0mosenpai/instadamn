package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dnn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31204Dnn {
    public final C57112jm A00;
    public final C64582wH A01;

    public C31204Dnn(UserSession userSession, C57112jm c57112jm, C5GR c5gr, InterfaceC64542wD interfaceC64542wD, C61582rL c61582rL, Integer num, String str, boolean z) {
        AbstractC167007dF.A1H(userSession, 1, str);
        this.A00 = c57112jm;
        this.A01 = new C64582wH(userSession, new C64572wG(c5gr, AbstractC64552wE.A00(interfaceC64542wD, str), c61582rL), num, z);
    }

    public final void A00(View view, InterfaceC66482zP interfaceC66482zP) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("load-more:");
        C59072n8 A00 = C59062n7.A00(interfaceC66482zP, C0eB.A00, AbstractC166997dE.A0v(interfaceC66482zP.getKey(), A1C));
        A00.A00(this.A01);
        this.A00.A05(view, A00.A01());
    }
}
