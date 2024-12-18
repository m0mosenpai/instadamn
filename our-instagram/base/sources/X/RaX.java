package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class RaX extends AnonymousClass935 {
    public final /* synthetic */ InterfaceC65635Tpw A00;
    public final /* synthetic */ LiveLocationSession A01;
    public final /* synthetic */ C7CY A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RaX(InterfaceC65635Tpw interfaceC65635Tpw, LiveLocationSession liveLocationSession, UserSession userSession, C7CY c7cy) {
        super(userSession);
        this.A00 = interfaceC65635Tpw;
        this.A01 = liveLocationSession;
        this.A02 = c7cy;
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(649815780);
        int A032 = C0f9.A03(-1054116313);
        C7CY c7cy = this.A02;
        ((Executor) c7cy.A02.getValue()).execute(new RunnableC64595TLg(this.A00));
        C0f9.A0A(-1121956636, A032);
        C0f9.A0A(1783265786, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        String str;
        int A03 = C0f9.A03(193907942);
        RaV raV = (RaV) obj;
        int A032 = C0f9.A03(667527701);
        C14360o3.A0B(raV, 1);
        SCL scl = raV.A00;
        if (scl != null) {
            str = scl.A00;
        } else {
            str = null;
        }
        boolean A0K = C14360o3.A0K(str, "404");
        InterfaceC65635Tpw interfaceC65635Tpw = this.A00;
        if (A0K) {
            String str2 = this.A01.A02;
            C14360o3.A07(str2);
            interfaceC65635Tpw.onError(new C64876TYc(str2));
        } else {
            interfaceC65635Tpw.onSuccess();
        }
        C0f9.A0A(204507420, A032);
        C0f9.A0A(616945530, A03);
    }
}
