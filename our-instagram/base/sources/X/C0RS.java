package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0RS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RS implements C0CD {
    public boolean A00 = true;

    @Override // X.C0CD
    public final /* bridge */ /* synthetic */ void EIU(AbstractC02960Bu abstractC02960Bu, C0CC c0cc) {
        C05660Rq c05660Rq = (C05660Rq) abstractC02960Bu;
        long j = c05660Rq.A01;
        if (j != 0) {
            c0cc.A7m("wakelock_held_time_ms", j);
        }
        long j2 = c05660Rq.A00;
        if (j2 != 0) {
            c0cc.A7m("wakelock_acquired_count", j2);
        }
        if (this.A00) {
            try {
                JSONObject A04 = c05660Rq.A04();
                if (A04 != null) {
                    c0cc.A7n("wakelock_tag_time_ms", A04.toString());
                }
            } catch (JSONException e) {
                android.util.Log.e("WakeLockMetricsReporter", "Failed to serialize wakelock attribution data", e);
            }
        }
    }
}
