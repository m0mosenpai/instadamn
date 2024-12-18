package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.41G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41G {
    public final UserSession A00;

    public final C206199Bc A00(Context context, C38321qM c38321qM, C38321qM c38321qM2, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c75113Zb, 3);
        C14360o3.A0B(interfaceC60442pS, 4);
        C60962qK A00 = AbstractC60952qJ.A00(interfaceC60442pS);
        boolean A4v = c38321qM2.A4v();
        return new C206199Bc(new C9BH(new C207219Fa(8, this, c38321qM, c38321qM2, c75113Zb), 17), C79413go.A00.A00(context, this.A00, c38321qM, c38321qM2, A00, c75113Zb, C3YE.A07), 1, A4v, c75113Zb.A1s);
    }

    public C41G(UserSession userSession) {
        this.A00 = userSession;
    }
}
