package X;

import com.instagram.user.model.User;

/* renamed from: X.Cxp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29418Cxp implements InterfaceC37142GYd {
    public final /* synthetic */ C25814BbV A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C29418Cxp(C25814BbV c25814BbV, User user, String str, String str2) {
        this.A00 = c25814BbV;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = user;
    }

    @Override // X.InterfaceC37142GYd
    public final void Dy6(String str) {
        C25814BbV c25814BbV = this.A00;
        String str2 = this.A02;
        String str3 = this.A03;
        User user = this.A01;
        C28238Cci.A00.A01(c25814BbV.A0C.A02);
        c25814BbV.A0B.A00(new C50371MLy(c25814BbV, user, str2, str3, 17));
        c25814BbV.A0N.Egh(new C166957d9(user, str2, new C57265Pbn(user, c25814BbV, str2, str3, 3), new C57265Pbn(user, c25814BbV, str2, str3, 4)));
    }
}
