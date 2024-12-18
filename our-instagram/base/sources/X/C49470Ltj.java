package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.Ltj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49470Ltj implements C74M {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C44139Jf4 A01;
    public final /* synthetic */ DirectAnimatedMedia A02;
    public final /* synthetic */ InterfaceC83713oG A03;

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        C14360o3.A0B(str2, 2);
        String A0w = AbstractC43593JPy.A0w();
        C44139Jf4 c44139Jf4 = this.A01;
        InterfaceC09390do interfaceC09390do = c44139Jf4.A02;
        ((C7X3) interfaceC09390do.getValue()).A03(A0w, false);
        ((C7X3) interfaceC09390do.getValue()).A05(A0w, true);
        UserSession userSession = this.A00;
        userSession.A01(LE2.class, MHJ.A00(userSession, 0));
        AbstractRunnableC133325zz.A02(new C44289Jhf(new C50269MHy(A0w, c44139Jf4, 39), 9), LE2.A00(userSession, this.A02, (InterfaceC2056098k) this.A03, AbstractC166987dD.A11(str2), A0w), C1M8.A01);
    }

    @Override // X.C74M
    public final /* synthetic */ void DQ4(XEC xec, String str, String str2, String str3) {
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
    }

    @Override // X.C74M
    public final void onError(String str) {
    }

    public C49470Ltj(UserSession userSession, C44139Jf4 c44139Jf4, DirectAnimatedMedia directAnimatedMedia, InterfaceC83713oG interfaceC83713oG) {
        this.A01 = c44139Jf4;
        this.A00 = userSession;
        this.A02 = directAnimatedMedia;
        this.A03 = interfaceC83713oG;
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }
}
