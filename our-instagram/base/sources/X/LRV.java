package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LRV implements C06N {
    public final /* synthetic */ AbstractC10360h2 A00;
    public final /* synthetic */ C7Vn A01;

    public LRV(AbstractC10360h2 abstractC10360h2, C7Vn c7Vn) {
        this.A00 = abstractC10360h2;
        this.A01 = c7Vn;
    }

    @Override // X.C06N
    public final void onBackStackChanged() {
        if (this.A00.A0L() <= 0) {
            UserSession userSession = this.A01.A00.A10;
            C2DS A00 = C2JD.A00(userSession);
            C48746LhE c48746LhE = new C48746LhE();
            C14360o3.A0B(A00, 1);
            C28811aJ A002 = C28811aJ.A00(userSession);
            C14360o3.A07(A002);
            new C43631JRo(c48746LhE, A002, A00).AV5(C4I2.A00, C4I3.A03, "manual_refresh");
        }
    }
}
