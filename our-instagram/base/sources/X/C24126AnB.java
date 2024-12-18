package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.AnB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24126AnB implements C7XU {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC166427cB A01;
    public final /* synthetic */ UserSession A02;

    @Override // X.C7XU
    public final void DB3() {
    }

    public C24126AnB(FragmentActivity fragmentActivity, InterfaceC166427cB interfaceC166427cB, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = interfaceC166427cB;
    }

    @Override // X.C7XU
    public final void DAy() {
        FragmentActivity fragmentActivity = this.A00;
        if (!fragmentActivity.isFinishing()) {
            AbstractC86593tX.A0X(fragmentActivity, (ClipsViewerConfig) ((C9BK) this.A01).A01, this.A02);
        }
    }
}
