package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G6g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36456G6g implements MR6 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C6WQ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    @Override // X.MR6
    public final /* synthetic */ void onFailureInBackground(InterfaceC40821up interfaceC40821up) {
    }

    @Override // X.MR6
    public final /* synthetic */ void onStart() {
    }

    @Override // X.MR6
    public final /* synthetic */ void onSuccessInBackground(C2EC c2ec) {
    }

    public C36456G6g(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C6WQ c6wq, String str, String str2) {
        this.A03 = c6wq;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = interfaceC11380iw;
        this.A05 = str2;
    }

    @Override // X.MR6
    public final void onFailure() {
        this.A03.dismiss();
        C146106i8 A0j = AbstractC25229BEm.A0j();
        AbstractC25226BEj.A1N(this.A00, A0j, 2131963183);
        AbstractC31178DnM.A1S(A0j);
    }

    @Override // X.MR6
    public final void onSuccess(C2EC c2ec) {
        this.A03.dismiss();
        FragmentActivity fragmentActivity = this.A00;
        C36881nl A01 = C36881nl.A01(fragmentActivity, this.A01, this.A02, this.A04);
        AbstractC31179DnN.A1R(A01, this.A05);
        A01.A0s = true;
        C36395G3w.A00(A01, fragmentActivity, 0);
    }
}
