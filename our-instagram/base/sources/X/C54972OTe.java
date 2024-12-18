package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OTe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54972OTe {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final String A02;

    public C54972OTe(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A02 = str;
    }

    public static final void A00(C54972OTe c54972OTe, String str, String str2) {
        InterfaceC60442pS interfaceC60442pS = c54972OTe.A01;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "igtv_composer_end");
        c82713mZ.A5n = c54972OTe.A02;
        c82713mZ.A24 = AbstractC166997dE.A0b();
        c82713mZ.A4P = str;
        c82713mZ.A61 = str2;
        C32U.A0I(c54972OTe.A00, c82713mZ, interfaceC60442pS, C05F.A00);
    }
}
