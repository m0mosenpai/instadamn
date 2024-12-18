package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class RaY extends AnonymousClass935 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC65636Tpx A01;
    public final /* synthetic */ C7CY A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RaY(InterfaceC65636Tpx interfaceC65636Tpx, UserSession userSession, C7CY c7cy, String str, long j) {
        super(userSession);
        this.A02 = c7cy;
        this.A01 = interfaceC65636Tpx;
        this.A03 = str;
        this.A00 = j;
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-443821846);
        C60883RaU c60883RaU = (C60883RaU) obj;
        int A032 = C0f9.A03(561952938);
        C14360o3.A0B(c60883RaU, 1);
        C60882RaT c60882RaT = c60883RaU.A00;
        if (c60882RaT != null) {
            long j = c60882RaT.A00;
            if (Long.valueOf(j) != null && j > 0) {
                C7CY c7cy = this.A02;
                List list = c7cy.A01;
                String str = this.A03;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC159157Cb) it.next()).DPN(j, str, true, c7cy.A00.token);
                }
                InterfaceC65636Tpx interfaceC65636Tpx = this.A01;
                UserSession userSession2 = c7cy.A00;
                long j2 = this.A00;
                AbstractC63311ShH.A04(str, "groupishId");
                String valueOf = String.valueOf(j);
                AbstractC63311ShH.A04(valueOf, "sessionId");
                long currentTimeMillis = System.currentTimeMillis();
                String str2 = userSession2.userId;
                AbstractC63311ShH.A04(str2, "userAliasId");
                interfaceC65636Tpx.onSuccess(new LiveLocationSession(str, null, valueOf, str2, j2, currentTimeMillis, false));
                C0f9.A0A(-1809107520, A032);
                C0f9.A0A(-759521171, A03);
            }
        }
        this.A01.onError(new Throwable("Location sharing session ID missing from server response"));
        C0f9.A0A(-1809107520, A032);
        C0f9.A0A(-759521171, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-1284996322);
        int A032 = C0f9.A03(-773532204);
        C7CY c7cy = this.A02;
        ((Executor) c7cy.A02.getValue()).execute(new RunnableC64594TLf(this.A01));
        C0f9.A0A(-468902768, A032);
        C0f9.A0A(147622253, A03);
    }
}
