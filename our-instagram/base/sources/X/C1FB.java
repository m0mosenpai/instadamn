package X;

import org.json.JSONObject;

/* renamed from: X.1FB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FB extends C1B1 implements C1B2 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.C1B1
    public final String A00() {
        return "max_size";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1FB c1fb = (C1FB) obj;
            return this.A01 == c1fb.A01 && this.A02 == c1fb.A02 && this.A03 == c1fb.A03 && this.A04 == c1fb.A04 && this.A05 == c1fb.A05;
        }
        return false;
    }

    @Override // X.C1B2
    public final JSONObject EqM() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("max_size", this.A01);
        jSONObject.put("max_size_low_space_bytes", this.A02);
        jSONObject.put("max_size_very_low_space_bytes", this.A03);
        jSONObject.put("delete_only_on_init", this.A04);
        jSONObject.put("is_itemized", this.A05);
        return jSONObject;
    }

    public final int hashCode() {
        long j = this.A01;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A02;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A03;
        return ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0);
    }

    public C1FB(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.A01 = j;
        this.A02 = j2;
        this.A03 = j3;
        this.A00 = j4;
        this.A04 = z;
        this.A05 = z2;
    }
}
