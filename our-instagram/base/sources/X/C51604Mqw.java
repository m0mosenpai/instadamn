package X;

import org.json.JSONObject;

/* renamed from: X.Mqw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51604Mqw extends C0T6 {
    public final String A00;
    public final String A01;
    public final JSONObject A02;
    public final JSONObject A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51604Mqw) {
                C51604Mqw c51604Mqw = (C51604Mqw) obj;
                if (!C14360o3.A0K(this.A03, c51604Mqw.A03) || !C14360o3.A0K(this.A00, c51604Mqw.A00) || !C14360o3.A0K(this.A02, c51604Mqw.A02) || !C14360o3.A0K(this.A01, c51604Mqw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0G(this.A03)) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C51604Mqw(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.A03 = jSONObject;
        this.A00 = str;
        this.A02 = jSONObject2;
        this.A01 = str2;
    }
}
