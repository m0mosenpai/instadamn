package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GmV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37933GmV implements JGM {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ JGM A01;
    public final /* synthetic */ C9JG A02;

    public C37933GmV(UserSession userSession, JGM jgm, C9JG c9jg) {
        this.A00 = userSession;
        this.A01 = jgm;
        this.A02 = c9jg;
    }

    @Override // X.JGM
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        AbstractC192138fE abstractC192138fE = (AbstractC192138fE) obj;
        C14360o3.A0B(abstractC192138fE, 0);
        UserSession userSession = this.A00;
        C006802i.A0p.markerPoint(962534132, "pro_dash_hyper_card_api_end");
        if (abstractC192138fE instanceof C193038gj) {
            this.A01.onResult(((C193038gj) abstractC192138fE).A00);
        } else if (abstractC192138fE instanceof C215539gT) {
            String message = ((C215539gT) abstractC192138fE).A00.getMessage();
            if (message == null) {
                message = "";
            }
            AJv.A00(userSession, "hypercard_fetch_failed", message);
        }
        this.A02.A01 = false;
    }
}
