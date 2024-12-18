package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.CtZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29168CtZ implements C3PE {
    public final /* synthetic */ InterfaceC156146zi A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ Reel A02;

    @Override // X.C3PE
    public final void DQY(View view) {
    }

    public C29168CtZ(InterfaceC156146zi interfaceC156146zi, UserSession userSession, Reel reel) {
        this.A00 = interfaceC156146zi;
        this.A02 = reel;
        this.A01 = userSession;
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        Reel A0M;
        InterfaceC156146zi interfaceC156146zi = this.A00;
        Reel reel = this.A02;
        if (reel == null) {
            A0M = null;
        } else {
            A0M = C1OU.A04(this.A01).A0M(reel.getId());
        }
        interfaceC156146zi.DUx(A0M);
        return true;
    }
}
