package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.io.File;

/* renamed from: X.Ltl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49472Ltl implements C74M {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C6JY A01;
    public final /* synthetic */ C49296Lqq A02;
    public final /* synthetic */ DirectAnimatedMedia A03;
    public final /* synthetic */ InterfaceC2056098k A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        C14360o3.A0B(str2, 2);
        UserSession userSession = this.A00;
        userSession.A01(LE2.class, MHJ.A00(userSession, 0));
        DirectAnimatedMedia directAnimatedMedia = this.A03;
        File A11 = AbstractC166987dD.A11(str2);
        String A0w = AbstractC43593JPy.A0w();
        InterfaceC2056098k interfaceC2056098k = this.A04;
        LE2.A00(userSession, directAnimatedMedia, interfaceC2056098k, A11, A0w);
        String str3 = this.A05;
        if (str3.length() != 0) {
            this.A02.A00.A02(this.A01.A0C(interfaceC2056098k, str3, this.A06), C49769Lyc.A00);
        }
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

    public C49472Ltl(UserSession userSession, C6JY c6jy, C49296Lqq c49296Lqq, DirectAnimatedMedia directAnimatedMedia, InterfaceC2056098k interfaceC2056098k, String str, String str2) {
        this.A00 = userSession;
        this.A03 = directAnimatedMedia;
        this.A04 = interfaceC2056098k;
        this.A05 = str;
        this.A02 = c49296Lqq;
        this.A01 = c6jy;
        this.A06 = str2;
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }
}
