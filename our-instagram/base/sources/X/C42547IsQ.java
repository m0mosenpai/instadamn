package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IsQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42547IsQ implements C5H9 {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C166747cm A02;
    public final /* synthetic */ C72343Mh A03;

    public C42547IsQ(C38321qM c38321qM, C38321qM c38321qM2, C166747cm c166747cm, C72343Mh c72343Mh) {
        this.A02 = c166747cm;
        this.A01 = c38321qM;
        this.A00 = c38321qM2;
        this.A03 = c72343Mh;
    }

    @Override // X.C5H9
    public final void A8X(C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC167017dG.A1O(str, c82713mZ);
        UserSession userSession = this.A02.A0E;
        C5SE c5se = new C5SE(userSession, this.A01);
        c5se.A00 = this.A00.A16(userSession);
        c5se.A8X(c82713mZ, interfaceC60442pS, str);
        User user = this.A03.A01;
        C14360o3.A0B(user, 0);
        C11520jB A0B = AbstractC37300Gc1.A0B();
        AbstractC37440GeK.A00(A0B, user);
        c82713mZ.A0E(A0B);
    }
}
