package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class RaZ extends AnonymousClass935 {
    public final /* synthetic */ InterfaceC65635Tpw A00;
    public final /* synthetic */ LiveLocationSession A01;
    public final /* synthetic */ C7CY A02;
    public final /* synthetic */ Long A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RaZ(InterfaceC65635Tpw interfaceC65635Tpw, LiveLocationSession liveLocationSession, UserSession userSession, C7CY c7cy, Long l) {
        super(userSession);
        this.A02 = c7cy;
        this.A00 = interfaceC65635Tpw;
        this.A01 = liveLocationSession;
        this.A03 = l;
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(242951080);
        int A0N = AbstractC167017dG.A0N(userSession, -40342564);
        C7CY c7cy = this.A02;
        ((Executor) c7cy.A02.getValue()).execute(new TRB(this.A00, this.A01, userSession, c7cy, this.A03));
        C0f9.A0A(-336401227, A0N);
        C0f9.A0A(-1896782033, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(160655433);
        int A032 = C0f9.A03(1576756929);
        C14360o3.A0B(userSession, 0);
        List<InterfaceC159157Cb> list = this.A02.A01;
        LiveLocationSession liveLocationSession = this.A01;
        Long l = this.A03;
        for (InterfaceC159157Cb interfaceC159157Cb : list) {
            String str = liveLocationSession.A02;
            C14360o3.A07(str);
            interfaceC159157Cb.DPN(l.longValue(), str, false, userSession.token);
        }
        this.A00.onSuccess();
        C0f9.A0A(-1793254028, A032);
        C0f9.A0A(-61951238, A03);
    }
}
