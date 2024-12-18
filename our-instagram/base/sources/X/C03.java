package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C03 extends C33H {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Nj6 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;

    @Override // X.C33H, X.C33I
    public final boolean Dtk(C5SW c5sw) {
        C14360o3.A0B(c5sw, 0);
        AbstractC27715CKi.A00(this.A00, this.A01, this.A02, this.A03);
        c5sw.A08(false);
        return true;
    }

    public C03(Activity activity, Nj6 nj6, UserSession userSession, C38321qM c38321qM) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A03 = c38321qM;
        this.A01 = nj6;
    }

    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        long currentTimeMillis = System.currentTimeMillis();
        UserSession userSession = this.A02;
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(userSession));
        A0w.E7G("world_pages_tooltip_last_seen_timestamp_ms", currentTimeMillis);
        A0w.apply();
        C28350CfA.A00 = currentTimeMillis;
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        AbstractC167007dF.A18(A0x, "world_pages_tooltip_impression_count", A0x.getInt("world_pages_tooltip_impression_count", 0) + 1);
    }
}
