package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.WTt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70391WTt implements X90 {
    public final /* synthetic */ C66356UBx A00;
    public final /* synthetic */ UPT A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C69727VuM A03;
    public final /* synthetic */ C69680VtQ A04;

    public C70391WTt(C66356UBx c66356UBx, UPT upt, UserSession userSession, C69727VuM c69727VuM, C69680VtQ c69680VtQ) {
        this.A01 = upt;
        this.A02 = userSession;
        this.A00 = c66356UBx;
        this.A04 = c69680VtQ;
        this.A03 = c69727VuM;
    }

    @Override // X.X90
    public final void DR2(C70394WTw c70394WTw) {
        List list;
        C69211Vje c69211Vje;
        UPT upt = this.A01;
        if (upt != null && (c69211Vje = upt.A02) != null) {
            list = c69211Vje.A01;
        } else {
            list = null;
        }
        C14360o3.A0C(list, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.discovery.mediamap.model.MediaMapPin>");
        UserSession userSession = this.A02;
        WlM wlM = new WlM();
        Context context = c70394WTw.A0G;
        C14360o3.A07(context);
        int round = Math.round(AbstractC13880nE.A04(context, 44));
        c70394WTw.A0A(new ULY(new C70375WTd(c70394WTw, userSession, wlM, list, round, Math.round(C46014KYc.A00(context, round))), c70394WTw));
        c70394WTw.A06 = new C70381WTj(0, this.A03, this.A04);
        C66356UBx c66356UBx = this.A00;
        AbstractC70135W6m.A01(c70394WTw, list, c66356UBx.getHeight(), c66356UBx.getWidth());
    }
}
