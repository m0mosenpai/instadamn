package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GIn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36764GIn implements InterfaceC37219GaU {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C6FQ A02;
    public final /* synthetic */ InterfaceC103384lE A03;
    public final /* synthetic */ InterfaceC103384lE A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ User A06;
    public final /* synthetic */ String A07;

    @Override // X.InterfaceC37219GaU
    public final void Czi() {
    }

    @Override // X.InterfaceC37219GaU
    public final void DqX() {
    }

    public C36764GIn(Activity activity, InterfaceC11380iw interfaceC11380iw, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, UserSession userSession, User user, String str) {
        this.A05 = userSession;
        this.A01 = interfaceC11380iw;
        this.A06 = user;
        this.A07 = str;
        this.A02 = c6fq;
        this.A04 = interfaceC103384lE;
        this.A00 = activity;
        this.A03 = interfaceC103384lE2;
    }

    @Override // X.InterfaceC37219GaU
    public final void D6t() {
        UserSession userSession = this.A05;
        AbstractC34867FYc.A00(this.A01, userSession, "block_confirm", userSession.userId, this.A06.getId(), this.A07);
    }

    @Override // X.InterfaceC37219GaU
    public final void DFf() {
        InterfaceC103384lE interfaceC103384lE;
        C6FQ c6fq = this.A02;
        if (c6fq != null && (interfaceC103384lE = this.A03) != null) {
            AbstractC31171DnF.A1K(c6fq, interfaceC103384lE);
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void onCancel() {
        UserSession userSession = this.A05;
        AbstractC34867FYc.A00(this.A01, userSession, "block_cancel", userSession.userId, this.A06.getId(), this.A07);
    }

    @Override // X.InterfaceC37219GaU
    public final void onSuccess() {
        InterfaceC103384lE interfaceC103384lE;
        C6FQ c6fq = this.A02;
        if (c6fq != null && (interfaceC103384lE = this.A04) != null) {
            AbstractC31171DnF.A1K(c6fq, interfaceC103384lE);
            return;
        }
        if (this.A06.CQf()) {
            Activity activity = this.A00;
            C9GR.A09(activity, activity.getString(2131953929));
        }
        AbstractC35261Fgv.A03(this.A00);
    }
}
