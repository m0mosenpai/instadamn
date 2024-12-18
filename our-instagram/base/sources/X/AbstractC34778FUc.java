package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.FUc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34778FUc {
    public static void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectThreadKey directThreadKey, String str) {
        A01(interfaceC11380iw, userSession, directThreadKey, str, new HashMap());
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectThreadKey directThreadKey, String str, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_professional_thread_reminder_events");
        if (A0f.isSampled()) {
            String str2 = directThreadKey.A00;
            if (str2 == null) {
                str2 = "null";
            }
            map.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            AbstractC31171DnF.A1C(A0f, str);
            A0f.A9M("event_data", map);
            A0f.Cht();
        }
    }
}
