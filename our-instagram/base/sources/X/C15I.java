package X;

import org.json.JSONObject;

/* renamed from: X.15I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15I {
    public int A01;
    public int A04;
    public int[] A0C = {-1, -1};
    public int[] A0A = {-1, -1};
    public int[] A0D = {-1, -1};
    public int[] A0B = {-1, -1};
    public int A00 = 0;
    public int A05 = 0;
    public int A03 = 0;
    public int A06 = 0;
    public int A02 = 0;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public int A0F = 0;
    public int A0E = 0;

    private boolean A00(int[] iArr, int i) {
        int i2;
        this.A0E = i;
        int i3 = iArr[0];
        if (i3 > 0 && (i2 = iArr[1]) > 0) {
            this.A0F = 4;
            if (i3 > i2) {
                return false;
            }
            return true;
        }
        this.A0F = 3;
        return false;
    }

    public final boolean A01() {
        if (this.A02 <= 0) {
            this.A0F = 1;
        } else if (this.A07) {
            if (A00(this.A0C, 1) && A00(this.A0A, 2)) {
                return true;
            }
        } else {
            return A00(this.A0B, 0);
        }
        return false;
    }

    public final String toString() {
        if (!A01()) {
            return AnonymousClass001.A02(this.A0F, this.A0E, "invalid_", "_");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cores", this.A02);
            jSONObject.put("is_biglittle", this.A07);
            if (this.A07) {
                jSONObject.put("little_freq_min", this.A0C[0]);
                jSONObject.put("little_freq_max", this.A0C[1]);
                jSONObject.put("big_freq_min", this.A0A[0]);
                jSONObject.put("big_freq_max", this.A0A[1]);
                jSONObject.put("little_cores", this.A03);
                jSONObject.put("big_cores", this.A00);
                int i = this.A05;
                if (i != 0) {
                    jSONObject.put("mid_cores", i);
                }
                jSONObject.put("little_index", this.A04);
                jSONObject.put("big_index", this.A01);
            } else {
                jSONObject.put("freq_min", this.A0B[0]);
                jSONObject.put("freq_max", this.A0B[1]);
            }
            jSONObject.put("prebuild", this.A09);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
