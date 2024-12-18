package X;

import com.instagram.common.session.UserSession;
import com.instagram.sponsored.asyncads.requestpathsignals.persistence.QSRealtimeSignalRoom;

/* loaded from: classes9.dex */
public final class OCJ {
    public final UserSession A00;
    public final InterfaceC19630xq A01;
    public final QSRealtimeSignalRoom A02;
    public final C19L A03;

    public /* synthetic */ OCJ(UserSession userSession) {
        QSRealtimeSignalRoom qSRealtimeSignalRoom = new QSRealtimeSignalRoom(userSession);
        this.A00 = userSession;
        this.A02 = qSRealtimeSignalRoom;
        this.A03 = AbstractC24771Iv.A01(2036935562, 3);
        this.A01 = C1AT.A01(userSession).A04(C1AV.A2b, OCJ.class);
    }
}
