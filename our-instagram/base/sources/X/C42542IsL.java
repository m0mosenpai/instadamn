package X;

import com.instagram.user.model.User;

/* renamed from: X.IsL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42542IsL implements C5H9 {
    public final /* synthetic */ C5SE A00;
    public final /* synthetic */ User A01;

    public C42542IsL(C5SE c5se, User user) {
        this.A00 = c5se;
        this.A01 = user;
    }

    @Override // X.C5H9
    public final void A8X(C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC167017dG.A1O(str, c82713mZ);
        this.A00.A8X(c82713mZ, interfaceC60442pS, str);
        User user = this.A01;
        if (user != null) {
            C11520jB A0B = AbstractC37300Gc1.A0B();
            AbstractC37440GeK.A00(A0B, user);
            c82713mZ.A0E(A0B);
        }
    }
}
