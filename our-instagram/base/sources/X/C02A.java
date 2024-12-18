package X;

import android.content.Context;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Pair;

/* renamed from: X.02A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C02A implements C0LR {
    public final Context A00;
    public final Integer A01;
    public final String A02;

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        Pair pair;
        C10860hv c10860hv;
        HealthStats healthStats;
        long j;
        synchronized (this) {
            Context context = this.A00;
            String str = this.A02;
            pair = AbstractC04530Lv.A00;
            if (pair == null) {
                SystemHealthManager systemHealthManager = (SystemHealthManager) context.getSystemService(SystemHealthManager.class);
                if (systemHealthManager == null) {
                    pair = null;
                } else {
                    try {
                        HealthStats takeMyUidSnapshot = systemHealthManager.takeMyUidSnapshot();
                        if (takeMyUidSnapshot != null && takeMyUidSnapshot.hasStats(10014) && (healthStats = takeMyUidSnapshot.getStats(10014).get(str)) != null) {
                            long j2 = 0;
                            if (healthStats.hasMeasurement(30005)) {
                                j = healthStats.getMeasurement(30005);
                            } else {
                                j = 0;
                            }
                            if (healthStats.hasMeasurement(30004)) {
                                j2 = healthStats.getMeasurement(30004);
                            }
                            pair = new Pair(Long.valueOf(j), Long.valueOf(j2));
                            AbstractC04530Lv.A00 = pair;
                        }
                    } catch (SecurityException e) {
                        C0PC.A00().DEh("OSSysHealthCollect", e, null);
                        C0K8.A0F("lacrima", "Unable to retrieve health stats", e);
                    }
                    pair = null;
                }
            }
        }
        if (pair != null) {
            int intValue = this.A01.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    c024209q.A02(C0LK.A2y, (Long) pair.first);
                    c10860hv = C0LK.A30;
                } else {
                    c024209q.A02(C0LK.A2K, (Long) pair.first);
                    c10860hv = C0LK.A2L;
                }
            } else {
                c024209q.A02(C0LK.A3U, (Long) pair.first);
                c10860hv = C0LK.A3V;
            }
            c024209q.A02(c10860hv, (Long) pair.second);
        }
    }

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A0d;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    public C02A(Context context, Integer num, String str) {
        this.A00 = context;
        this.A01 = num;
        this.A02 = str;
    }
}
