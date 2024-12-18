package X;

import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;

/* renamed from: X.8us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201108us {
    public static final void A00(C82G c82g, EnumC201098ur enumC201098ur, C82H c82h, C82I c82i, UserSession userSession) {
        C2JS c2js;
        Map map;
        C0Zx c0Zx = c82i;
        C14360o3.A0B(userSession, 0);
        if (c82i == null) {
            c0Zx = new C0Zx();
        }
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "crosspost_upsells");
        C200138tI A002 = AbstractC200128tH.A00(userSession);
        String A003 = AbstractC201118ut.A00(c82g);
        String str = null;
        if (A003 != null && ((c2js = (C2JS) A002.A04.BFG(A003)) != null || ((map = A002.A03) != null && (c2js = (C2JS) map.get(A003)) != null))) {
            str = c2js.getOptionalStringField(6, "client_session_id");
        }
        if (str != null) {
            c0Zx.A06("eligibility_fetch_session_id", str);
        }
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        c0Zx.A06("radio_type", AbstractC15820qc.A09(context));
        if (A00.isSampled()) {
            A00.A8R(c82g, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8R(enumC201098ur, "event_type");
            A00.A8R(c82h, "variant");
            A00.AAQ(c0Zx, "extra");
            A00.Cht();
        }
        if (!AbstractC001800i.A0u(AbstractC001900j.A0R(C18U.A04(C06090Tz.A05, userSession, 36881390978728313L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0), AbstractC201118ut.A01(c82h))) {
            C14360o3.A0B(enumC201098ur, 0);
            int ordinal = enumC201098ur.ordinal();
            if (ordinal != 5 && ordinal != 0 && ordinal != 1) {
                return;
            }
            C19K A022 = AnonymousClass194.A02(C12L.A00.AOT(1732129082, 3));
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206729Dd(userSession, c82g, c82h, enumC201098ur, str, null, 1), A022);
        }
    }
}
