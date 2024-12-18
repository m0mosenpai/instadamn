package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gmm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37946Gmm extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C37933GmV A02;
    public final /* synthetic */ C9JG A03;

    public C37946Gmm(Context context, UserSession userSession, C37933GmV c37933GmV, C9JG c9jg) {
        this.A01 = userSession;
        this.A03 = c9jg;
        this.A00 = context;
        this.A02 = c37933GmV;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(251608743);
        UserSession userSession = this.A01;
        AJv.A00(userSession, "badge_fetch_failed", "");
        C006802i.A0p.markerPoint(962534132, "pro_dash_hyper_card_api_start");
        C9JG.A00(this.A00, userSession, this.A02, false);
        C0f9.A0A(1823575242, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(586338395);
        C006802i.A0p.markerPoint(962534132, "pro_dash_badge_api_end");
        C0f9.A0A(1109597575, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        int A03 = C0f9.A03(399463603);
        C38834H8i c38834H8i = (C38834H8i) obj;
        int A0N = AbstractC167017dG.A0N(c38834H8i, -96742848);
        if (c38834H8i.mFromDiskCache) {
            z = false;
        } else {
            C37944Gmi c37944Gmi = c38834H8i.A00;
            if (c37944Gmi == null) {
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            z = c37944Gmi.A00;
        }
        UserSession userSession = this.A01;
        C006802i.A0p.markerPoint(962534132, "pro_dash_hyper_card_api_start");
        C9JG.A00(this.A00, userSession, this.A02, z);
        C0f9.A0A(-440336578, A0N);
        C0f9.A0A(-155141062, A03);
    }
}
