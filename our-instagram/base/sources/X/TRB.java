package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes10.dex */
public final class TRB implements Runnable {
    public final /* synthetic */ InterfaceC65635Tpw A00;
    public final /* synthetic */ LiveLocationSession A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C7CY A03;
    public final /* synthetic */ Long A04;

    public TRB(InterfaceC65635Tpw interfaceC65635Tpw, LiveLocationSession liveLocationSession, UserSession userSession, C7CY c7cy, Long l) {
        this.A03 = c7cy;
        this.A00 = interfaceC65635Tpw;
        this.A01 = liveLocationSession;
        this.A02 = userSession;
        this.A04 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<InterfaceC159157Cb> list = this.A03.A01;
        LiveLocationSession liveLocationSession = this.A01;
        UserSession userSession = this.A02;
        Long l = this.A04;
        for (InterfaceC159157Cb interfaceC159157Cb : list) {
            String str = liveLocationSession.A02;
            C14360o3.A07(str);
            interfaceC159157Cb.DPN(l.longValue(), str, false, userSession.token);
        }
        this.A00.onSuccess();
    }
}
