package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.41x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C906241x {
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C9EJ(this, 10));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C9EJ(this, 11));

    public final C9BW A00(Context context, C38321qM c38321qM, C38321qM c38321qM2, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC86303t2 interfaceC86303t2) {
        C9BJ c9bj;
        C14360o3.A0B(interfaceC86303t2, 6);
        if (c38321qM2.A4v()) {
            c9bj = new C9BJ(((C41G) this.A01.getValue()).A00(context, c38321qM, c38321qM2, interfaceC60442pS, c75113Zb));
        } else {
            c9bj = new C9BJ(((C79373gj) this.A02.getValue()).A00(context, c38321qM, c38321qM2, interfaceC60442pS, c75113Zb));
        }
        return new C9BW(23, c9bj, new C9BH(new C207319Fk(4, context, c38321qM2, c75113Zb, c38321qM, interfaceC60442pS, this), 23));
    }

    public C906241x(UserSession userSession) {
        this.A00 = userSession;
    }
}
