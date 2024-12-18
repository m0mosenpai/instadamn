package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G6h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36457G6h implements MR6 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C6WQ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    @Override // X.MR6
    public final /* synthetic */ void onFailureInBackground(InterfaceC40821up interfaceC40821up) {
    }

    @Override // X.MR6
    public final /* synthetic */ void onStart() {
    }

    @Override // X.MR6
    public final /* synthetic */ void onSuccessInBackground(C2EC c2ec) {
    }

    public C36457G6h(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C6WQ c6wq, String str, String str2, String str3) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = interfaceC11380iw;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = c6wq;
    }

    @Override // X.MR6
    public final void onFailure() {
        FragmentActivity fragmentActivity = this.A00;
        if (!fragmentActivity.isDestroyed()) {
            this.A03.dismiss();
            C9GR.A0F(fragmentActivity, "general_error_try_again", 2131963183);
        }
    }

    @Override // X.MR6
    public final void onSuccess(C2EC c2ec) {
        FragmentActivity fragmentActivity = this.A00;
        C36881nl A01 = C36881nl.A01(fragmentActivity, this.A01, this.A02, this.A04);
        AbstractC31179DnN.A1R(A01, this.A06);
        A01.A0g = this.A05;
        AbstractC31174DnI.A1P(A01);
        if (!fragmentActivity.isDestroyed()) {
            this.A03.dismiss();
        }
    }
}
