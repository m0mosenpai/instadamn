package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class GT1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C32071E6x A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C2DS A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GT1(Context context, C32071E6x c32071E6x, UserSession userSession, C2DS c2ds, DirectThreadKey directThreadKey, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        super(0);
        this.A03 = userSession;
        this.A05 = directThreadKey;
        this.A00 = i;
        this.A04 = c2ds;
        this.A01 = context;
        this.A02 = c32071E6x;
        this.A07 = z;
        this.A06 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession = this.A03;
        DirectThreadKey directThreadKey = this.A05;
        String str = directThreadKey.A00;
        if (str != null) {
            int i = this.A00;
            AbstractC31278Dp0.A0G(userSession, str, i, true);
            C2DS c2ds = this.A04;
            C81663kb B3U = c2ds.B3U(directThreadKey);
            if (B3U != null) {
                c2ds.Ean(B3U, false);
                c2ds.FCS(directThreadKey);
                C35244Fgd.A01(this.A01, this.A02, userSession, directThreadKey, this.A06, i, false, this.A07);
                return C0eB.A00;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
