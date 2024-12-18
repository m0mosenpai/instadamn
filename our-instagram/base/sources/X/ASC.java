package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class ASC implements View.OnClickListener {
    public final /* synthetic */ EnumC223459tc A00;
    public final /* synthetic */ AGL A01;
    public final /* synthetic */ User A02;

    public ASC(EnumC223459tc enumC223459tc, AGL agl, User user) {
        this.A02 = user;
        this.A01 = agl;
        this.A00 = enumC223459tc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-197008361);
        User user = this.A02;
        if (user != null) {
            AGL.A00(this.A01, user);
        }
        C163987Vm c163987Vm = this.A01.A04;
        EnumC223459tc enumC223459tc = this.A00;
        if (user != null) {
            str = user.getId();
        } else {
            str = null;
        }
        AnonymousClass983 anonymousClass983 = c163987Vm.A00;
        AnonymousClass983.A01(anonymousClass983).A0Q();
        UserSession userSession = anonymousClass983.A10;
        String A07 = AnonymousClass983.A07(anonymousClass983);
        boolean z = anonymousClass983.A0b instanceof MsysThreadId;
        boolean z2 = anonymousClass983.A0j;
        InterfaceC60442pS interfaceC60442pS = anonymousClass983.A1Q;
        C14360o3.A0B(interfaceC60442pS, 7);
        C162337Ov.A05(enumC223459tc, null, interfaceC60442pS, userSession, str, A07, 26, z, z2);
        C0f9.A0C(-481883723, A05);
    }
}
