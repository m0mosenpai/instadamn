package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lri, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49350Lri implements InterfaceC37198Ga9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C47021Kqe A02;
    public final /* synthetic */ C55174Odd A03;

    @Override // X.InterfaceC37198Ga9
    public final void DP8() {
    }

    @Override // X.InterfaceC37198Ga9
    public final void onCancel() {
    }

    public C49350Lri(Context context, UserSession userSession, C47021Kqe c47021Kqe, C55174Odd c55174Odd) {
        this.A03 = c55174Odd;
        this.A02 = c47021Kqe;
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.InterfaceC37198Ga9
    public final void Dar() {
        this.A03.A05(1, 2);
        C47021Kqe c47021Kqe = this.A02;
        UserSession userSession = this.A01;
        C45543KEi c45543KEi = new C45543KEi(11, this.A00, c47021Kqe);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("users/turn_off_message_settings_and_set_verified/");
        C1ON A0e = AbstractC25227BEk.A0e(A0c, C52097N2x.class, OQ7.class);
        A0e.A00 = c45543KEi;
        C1GJ.A04(A0e, 452886991);
    }

    @Override // X.InterfaceC37198Ga9
    public final void Dja() {
        this.A03.A05(1, 3);
    }
}
