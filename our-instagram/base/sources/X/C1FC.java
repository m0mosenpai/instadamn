package X;

import org.json.JSONObject;

/* renamed from: X.1FC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FC extends C1B1 implements C1B2 {
    public final long A00;
    public final boolean A01;

    @Override // X.C1B1
    public final String A00() {
        return "stale_removal";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C1FC c1fc = (C1FC) obj;
            if (this.A00 != c1fc.A00 || this.A01 != c1fc.A01) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C1B2
    public final JSONObject EqM() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stale_age_s", this.A00);
        jSONObject.put("is_itemized", this.A01);
        return jSONObject;
    }

    public final int hashCode() {
        long j = this.A00;
        return (((int) (j ^ (j >>> 32))) * 31) + (this.A01 ? 1 : 0);
    }

    public C1FC(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
    }
}
