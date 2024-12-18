package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Imm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42200Imm implements InterfaceC43400JFp {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ C75113Zb A04;
    public final /* synthetic */ InterfaceC43589JPu A05;
    public final /* synthetic */ IG5 A06;

    public C42200Imm(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC43589JPu interfaceC43589JPu, IG5 ig5) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = interfaceC60442pS;
        this.A05 = interfaceC43589JPu;
        this.A06 = ig5;
        this.A02 = c38321qM;
        this.A04 = c75113Zb;
    }

    @Override // X.InterfaceC43400JFp
    public final void DlB(boolean z) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        String CGJ = this.A05.CGJ();
        String str = this.A06.A00;
        C55220Oej.A00.A09(fragmentActivity, userSession, this.A02, interfaceC60442pS, this.A04, CGJ, str, z);
    }
}
