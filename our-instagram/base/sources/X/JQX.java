package X;

import java.util.HashMap;

/* loaded from: classes8.dex */
public abstract class JQX {
    public static final HashMap A00 = AbstractC166987dD.A1G();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0Jk, java.lang.Object] */
    public static final MRU A00(String str) {
        MRU mru;
        if (str != null) {
            HashMap hashMap = A00;
            if (!hashMap.containsKey(str)) {
                try {
                    if (!C023409i.A0A.A0A(new Object(), null, new C43600JQg(str), str)) {
                        C18950wb.A01.EH8(216072193, "NotificationJourneyTrackerProvider: Failed to run user session operation to get intended user session");
                    }
                } catch (Exception e) {
                    C18950wb.A01.EH8(216072193, AnonymousClass001.A0R("NotificationJourneyTrackerProvider: Exception while attempting to get intended user session: ", e.getMessage()));
                }
            }
            Boolean bool = (Boolean) hashMap.get(str);
            if (bool == null) {
                C18950wb.A01.EH8(216072193, "NotificationJourneyTrackerProvider: Failed to get sampling value for user. Defaulting to true");
            } else if (!bool.booleanValue()) {
                mru = C49525Lue.A00;
                return mru;
            }
        }
        mru = JQZ.A01;
        return mru;
    }
}
