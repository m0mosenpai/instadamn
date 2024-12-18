package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148196lp extends AbstractC148206lq {
    public static final C143256dQ A03 = new Object();
    public boolean A00;
    public final UserSession A01;
    public final C23031Ai A02;

    public static final ArrayList A00(C148196lp c148196lp) {
        int i;
        ArrayList arrayList = new ArrayList();
        String string = c148196lp.A02.A01.getString("PREFERENCE_CACHED_QUICK_REACTION_EMOJIS_V2", "");
        C14360o3.A07(string);
        if (!AbstractC13670mt.A0B(string)) {
            for (String str : AbstractC001900j.A0R(string, new String[]{";"}, 0)) {
                if (str.length() != 0) {
                    List A0R = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                    ImmutableList immutableList = C83863oV.A07;
                    String str2 = (String) A0R.get(0);
                    String str3 = (String) A0R.get(1);
                    if (A0R.size() == 3) {
                        i = Integer.parseInt((String) A0R.get(2));
                    } else {
                        i = 0;
                    }
                    arrayList.add(new C83863oV(str2, str3, i));
                }
            }
            return arrayList;
        }
        return null;
    }

    public C148196lp(UserSession userSession) {
        this.A01 = userSession;
        this.A02 = AbstractC23021Ah.A00(userSession);
    }
}
