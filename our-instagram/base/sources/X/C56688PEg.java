package X;

import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;
import java.util.Arrays;

/* renamed from: X.PEg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56688PEg implements InterfaceC65533Tm3 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ RtcCallIntentHandlerActivity A01;

    public C56688PEg(UserSession userSession, RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity) {
        this.A01 = rtcCallIntentHandlerActivity;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65533Tm3
    public final void DYG() {
        P9X p9x;
        OXE.A00.A00("RtcCallIntentHandlerActivity", "Required permission was denied");
        RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity = this.A01;
        InterfaceC58177Pqh interfaceC58177Pqh = rtcCallIntentHandlerActivity.A00;
        if ((interfaceC58177Pqh instanceof P9X) && (p9x = (P9X) interfaceC58177Pqh) != null && p9x.A08 != null && p9x.A0U) {
            C63002SaQ c63002SaQ = rtcCallIntentHandlerActivity.A01;
            if (c63002SaQ == null) {
                C14360o3.A0F("permissionsPresenter");
                throw C00O.createAndThrow();
            }
            if (AbstractC23451Ch.A08(c63002SaQ.A04.A01, (String[]) Arrays.copyOf(new String[]{"android.permission.RECORD_AUDIO"}, 1))) {
                UserSession userSession = this.A00;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36323603574369687L) && !C18U.A06(c06090Tz, userSession, 36323603575090592L)) {
                    AbstractC54146Nwi.A00(p9x);
                }
            }
        }
    }

    @Override // X.InterfaceC65533Tm3
    public final void DYH() {
        InterfaceC58177Pqh interfaceC58177Pqh = this.A01.A00;
        if (interfaceC58177Pqh != null) {
            AbstractC54146Nwi.A00(interfaceC58177Pqh);
        }
    }
}
