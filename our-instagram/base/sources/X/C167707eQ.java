package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7eQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167707eQ implements InterfaceC168627fw {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC168627fw
    public final boolean Ei4() {
        return true;
    }

    public C167707eQ(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.InterfaceC168627fw
    public final void Cqc() {
        AbstractC35239FgY.A05(this.A00, this.A01, this.A02);
    }

    @Override // X.InterfaceC168627fw
    public final void Crv() {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            UserSession userSession = this.A01;
            String str = this.A02;
            AbstractC35239FgY.A04(fragmentActivity, userSession);
            FDR.A00(AbstractC12220kQ.A01(null, userSession), userSession, null, str, "click", "cant_mention_alert_nux_go_to_settings");
        }
    }

    @Override // X.InterfaceC168627fw
    public final boolean Ei5() {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }
}
