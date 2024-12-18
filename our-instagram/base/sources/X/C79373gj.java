package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79373gj {
    public final UserSession A00;

    public final C206189Bb A00(Context context, C38321qM c38321qM, C38321qM c38321qM2, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C38321qM c38321qM3 = c38321qM2;
        C60962qK A00 = AbstractC60952qJ.A00(interfaceC60442pS);
        if (c38321qM3.A0C.B5l() == null && c38321qM.A0C.B5l() != null) {
            c38321qM3 = c38321qM;
        }
        UserSession userSession = this.A00;
        boolean A002 = AbstractC40652I0k.A00(A00, c38321qM3);
        return new C206189Bb(new C9BW(28, new C9FY(40, c38321qM3, this, A00, c75113Zb), new C9FO(38, this, c75113Zb, c38321qM3)), C79413go.A00.A00(context, userSession, c38321qM3, c38321qM3, A00, c75113Zb, C3YE.A0I), A002);
    }

    public C79373gj(UserSession userSession) {
        this.A00 = userSession;
    }
}
