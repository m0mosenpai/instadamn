package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7CY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7CY {
    public final UserSession A00;
    public final List A01;
    public final InterfaceC09390do A02;

    public C7CY(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new ArrayList();
        this.A02 = AbstractC09440dt.A01(C7CZ.A00);
    }

    public final void A00(InterfaceC65635Tpw interfaceC65635Tpw, LiveLocationSession liveLocationSession) {
        String str = liveLocationSession.A04;
        C14360o3.A07(str);
        Long A0k = AbstractC003100w.A0k(10, str);
        if (A0k == null) {
            interfaceC65635Tpw.onError(new Throwable("Existing session ID is invalid"));
            return;
        }
        UserSession userSession = this.A00;
        String str2 = liveLocationSession.A02;
        C14360o3.A07(str2);
        long longValue = A0k.longValue();
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/threads/broadcast/end_live_location_session/");
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        c25621Ms.A0E(AbstractC58317Pt9.A00(856), longValue);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new RaZ(interfaceC65635Tpw, liveLocationSession, userSession, this, A0k);
        C1GJ.A03(A0N);
    }
}
