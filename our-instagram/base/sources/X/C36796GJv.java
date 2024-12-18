package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.GJv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36796GJv implements InterfaceC42241xE {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Capabilities A01;
    public final /* synthetic */ InterfaceC37169GZg A02;
    public final /* synthetic */ InterfaceC37279GbW A03;
    public final /* synthetic */ FJJ A04;

    public C36796GJv(UserSession userSession, Capabilities capabilities, InterfaceC37169GZg interfaceC37169GZg, InterfaceC37279GbW interfaceC37279GbW, FJJ fjj) {
        this.A00 = userSession;
        this.A01 = capabilities;
        this.A02 = interfaceC37169GZg;
        this.A03 = interfaceC37279GbW;
        this.A04 = fjj;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        E70 A00;
        E9B e9b = (E9B) obj;
        if (e9b != null && (A00 = e9b.A00()) != null) {
            UserSession userSession = this.A00;
            Capabilities capabilities = this.A01;
            Bundle A0D = AbstractC31174DnI.A0D(userSession);
            A0D.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", capabilities);
            C32342EMo c32342EMo = new C32342EMo();
            c32342EMo.setArguments(A0D);
            c32342EMo.A01 = this.A02;
            c32342EMo.A02 = A00;
            c32342EMo.A03 = false;
            this.A03.stop();
            FJJ fjj = this.A04;
            fjj.A01.A00.A02(fjj.A00, c32342EMo);
        }
    }
}
