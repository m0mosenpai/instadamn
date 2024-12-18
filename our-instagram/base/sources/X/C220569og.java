package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.9og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220569og extends AbstractC61526Rp1 implements BDU {
    @Override // X.BDU
    public final void ATZ(Context context, Bundle bundle, Bundle bundle2, UserSession userSession, String str) {
        String str2;
        String str3;
        Activity activity;
        boolean z;
        List subList;
        long A0L = AbstractC166987dD.A0L(bundle.getLong("dwell_time"));
        String str4 = userSession.userId;
        if (A0L <= 3) {
            str2 = "3767741376819537";
        } else if (A0L <= 6) {
            str2 = "449851024747685";
        } else if (A0L <= 15) {
            str2 = "519656387490237";
        } else if (A0L <= 90) {
            str2 = "823031693319788";
        } else {
            str2 = null;
        }
        String string = bundle.getString("final_url", null);
        if (string != null) {
            C117315Sq A06 = new C11L("(?:https?:\\/\\/)(?:[^@\\/\\n]+@)?(?:www\\.)?([^:\\/?\\n]+)").A06(string, 0);
            if (A06 != null && (subList = A06.A00().subList(1, A06.A00().size())) != null) {
                str3 = AbstractC001800i.A0P(", ", "", "", subList, null);
            } else {
                str3 = null;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            List A0m = AbstractC167007dF.A0m(C18U.A04(C06090Tz.A05, userSession, 36893678878458852L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
            if (!(A0m instanceof Collection) || !A0m.isEmpty()) {
                Iterator it = A0m.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    if (str3 != null && AbstractC001900j.A0a(str3, A1B, false)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (activity != null && str2 != null && str3 != null && !z) {
                LinkedHashMap A0u = AbstractC167017dG.A0u(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4, AbstractC166987dD.A1L("dwell_time", String.valueOf(A0L)), AbstractC166987dD.A1L("domain_url", str3), AbstractC166987dD.A1L(AbstractC58317Pt9.A00(41), str));
                C1VN c1vn = C1VN.A00;
                if (c1vn != null) {
                    c1vn.A01(activity, userSession, str2, A0u);
                }
            }
        }
    }

    @Override // X.BDU
    public final void E61() {
    }

    @Override // X.BDU
    public final boolean EiD() {
        return false;
    }
}
