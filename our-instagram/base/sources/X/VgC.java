package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class VgC {
    public final C23031Ai A00;
    public final java.util.Set A01;

    public VgC(UserSession userSession) {
        HashSet hashSet = new HashSet();
        this.A01 = hashSet;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        this.A00 = A00;
        try {
            String A0j = MSX.A0j(A00, A00.A0K, C23031Ai.A8c, 3);
            if (A0j != null && A0j.length() > 0) {
                String[] A1b = AbstractC31173DnH.A1b(AbstractC31175DnJ.A0h(A0j, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1), 0);
                hashSet.addAll(AbstractC16960so.A1Q(Arrays.copyOf(A1b, A1b.length)));
            }
        } catch (Exception e) {
            C0K8.A0F("SearchBlacklistStore", "Error reading to hidden entries.  Clearing results.", e);
            InterfaceC19610xo ARD = this.A00.A01.ARD();
            ARD.EEj("blacklist_search_ids");
            ARD.apply();
        }
    }
}
