package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Tzt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66115Tzt extends MZ4 {
    public final Context A00;
    public final C65868TvV A01;
    public final C66110Tzo A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final String A05;

    @Override // X.MZ4
    public final MZA A00() {
        return new U0s(this.A00, this.A01, this.A02, this.A03, this.A04, this.A05);
    }

    @Override // X.MZ4
    public final void A01(MZB mzb, MZA mza) {
        String str;
        C38321qM c38321qM = (C38321qM) ((C4S7) mzb).A03;
        boolean z = true;
        boolean z2 = !mza.A0J(c38321qM);
        if (System.currentTimeMillis() - mza.A01 <= 500) {
            z = false;
        }
        if (z2 && z) {
            if (c38321qM != null) {
                str = c38321qM.getId();
            } else {
                str = null;
            }
            C14360o3.A0B(AnonymousClass001.A0R("ignoringStartVideoSinceVideoIsPlaying: restarting video ", str), 0);
            mza.A0C(mzb);
        }
    }

    public C66115Tzt(Context context, C65868TvV c65868TvV, C66110Tzo c66110Tzo, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        super(context, userSession, interfaceC60442pS, str, 0L, AbstractC167007dF.A1V(c66110Tzo));
        this.A01 = c65868TvV;
        this.A02 = c66110Tzo;
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A05 = str;
    }
}
