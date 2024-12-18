package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.GIg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36758GIg implements InterfaceC37187GZy {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ FFZ A02;
    public final /* synthetic */ C2EC A03;
    public final /* synthetic */ MessageIdentifier A04;

    @Override // X.InterfaceC37187GZy
    public final void onDismiss() {
    }

    public C36758GIg(FragmentActivity fragmentActivity, UserSession userSession, FFZ ffz, C2EC c2ec, MessageIdentifier messageIdentifier) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A03 = c2ec;
        this.A02 = ffz;
        this.A04 = messageIdentifier;
    }

    @Override // X.InterfaceC37187GZy
    public final void D9X() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        AbstractC167017dG.A1N(fragmentActivity, userSession);
        new C31605DuX(fragmentActivity, userSession).A02(this.A03.BKb(), C05F.A01);
    }

    @Override // X.InterfaceC37187GZy
    public final void DfZ() {
        FFZ ffz = this.A02;
        if (ffz != null) {
            ((C7ZX) ffz.A00.A0E.invoke()).EHs(this.A04);
        }
    }
}
