package X;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.56i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1125456i {
    public final long A00;
    public final long A01;
    public final TimeUnit A02;

    public final boolean A06(TimeUnit timeUnit, long j, boolean z) {
        if (j < 0) {
            return false;
        }
        long A03 = A03(timeUnit);
        if (!z ? j < A03 || j > A02(timeUnit) : j < A03 || j >= A02(timeUnit)) {
            if (A02(timeUnit) >= 0 || j < A03(timeUnit)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1125456i c1125456i = (C1125456i) obj;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (A03(timeUnit) != c1125456i.A03(timeUnit) || A02(timeUnit) != c1125456i.A02(timeUnit)) {
                return false;
            }
        }
        return true;
    }

    public static C1125456i A00(JSONObject jSONObject) {
        long j = jSONObject.getLong("mStartTime");
        long j2 = jSONObject.getLong("mEndTime");
        String string = jSONObject.getString("mTimeUnit");
        for (TimeUnit timeUnit : TimeUnit.values()) {
            if (string.equals(A01(timeUnit))) {
                return new C1125456i(timeUnit, j, j2);
            }
        }
        throw new JSONException("invalid jsonObject for TimeRange");
    }

    public static String A01(TimeUnit timeUnit) {
        switch (AbstractC1125556j.A00[timeUnit.ordinal()]) {
            case 1:
                return "DAYS";
            case 2:
                return "HOURS";
            case 3:
                return "MINUTES";
            case 4:
                return "SECONDS";
            case 5:
                return "NANOSECONDS";
            case 6:
                return "MICROSECONDS";
            case 7:
                return "MILLISECONDS";
            default:
                return "";
        }
    }

    public final long A02(TimeUnit timeUnit) {
        return timeUnit.convert(this.A00, this.A02);
    }

    public final long A03(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01, this.A02);
    }

    public final JSONObject A04() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mStartTime", this.A01);
        jSONObject.put("mEndTime", this.A00);
        jSONObject.put("mTimeUnit", A01(this.A02));
        return jSONObject;
    }

    public final boolean A05(C1125456i c1125456i, boolean z) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (!A06(timeUnit, c1125456i.A03(timeUnit), z)) {
            if ((!A06(timeUnit, c1125456i.A02(timeUnit), z) || (z && c1125456i.A02(timeUnit) == A03(timeUnit))) && !c1125456i.A06(timeUnit, A03(timeUnit), z)) {
                if (c1125456i.A06(timeUnit, A02(timeUnit), z)) {
                    if (!z || A02(timeUnit) != c1125456i.A03(timeUnit)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A01), Long.valueOf(this.A00), this.A02});
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r10 < r12) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1125456i(java.util.concurrent.TimeUnit r9, long r10, long r12) {
        /*
            r8 = this;
            r8.<init>()
            r1 = 0
            r4 = r10
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r6 = r12
            if (r0 <= 0) goto L14
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L14
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L15
        L14:
            r1 = 1
        L15:
            java.lang.String r2 = "startTime: "
            java.lang.String r3 = " endTime: "
            java.lang.String r0 = X.AnonymousClass001.A0f(r2, r3, r4, r6)
            X.C02R.A06(r1, r0)
            r8.A01 = r10
            r8.A00 = r12
            r8.A02 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125456i.<init>(java.util.concurrent.TimeUnit, long, long):void");
    }

    public final String toString() {
        try {
            return A04().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
