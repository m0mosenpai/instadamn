package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ge0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37420Ge0 extends AbstractC46524KiP {
    public IHX A00;
    public final C23031Ai A01;
    public final UserSession A02;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        IHX ihx = this.A00;
        if (ihx == null) {
            ihx = new IHX(context, new J8Z(this, 39));
            this.A00 = ihx;
        }
        return AbstractC166987dD.A0d(ihx.A01);
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        C14360o3.A0B(interfaceC37159GYw, 1);
        if (c2ec != null) {
            UserSession userSession = this.A02;
            C14360o3.A0B(userSession, 0);
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (A00.A01.getInt("blend_direct_thread_nux_seen_count", 0) < 3 && C23031Ai.A07(A00, "blend_direct_thread_nux_last_shown_time_ms", 1L) && C18U.A06(C06090Tz.A05, userSession, 36324058840838003L) && AbstractC2056998t.A00(userSession).booleanValue()) {
                interfaceC37159GYw.Dpu(this);
                return;
            }
        }
        interfaceC37159GYw.onFailure();
    }

    public C37420Ge0(UserSession userSession) {
        this.A02 = userSession;
        this.A01 = AbstractC23021Ah.A00(userSession);
    }
}
