package X;

import com.instagram.user.model.User;

/* renamed from: X.Btx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26896Btx extends C3r5 {
    public static final InterfaceC30891Di4 A00(C38321qM c38321qM) {
        InterfaceC30891Di4 interfaceC30891Di4;
        User A14 = AbstractC25226BEj.A14(c38321qM);
        if (A14 != null) {
            interfaceC30891Di4 = new C26256BjP(A14.Bhu(), A14.getUsername(), A14.isVerified());
        } else {
            interfaceC30891Di4 = D0U.A00;
        }
        return interfaceC30891Di4;
    }
}
