package X;

import org.json.JSONObject;

/* renamed from: X.MoA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51463MoA extends AbstractC53423NkC {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final JSONObject A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51463MoA) {
                C51463MoA c51463MoA = (C51463MoA) obj;
                if (!C14360o3.A0K(this.A07, c51463MoA.A07) || !C14360o3.A0K(this.A06, c51463MoA.A06) || !C14360o3.A0K(this.A08, c51463MoA.A08) || !C14360o3.A0K(this.A03, c51463MoA.A03) || this.A09 != c51463MoA.A09 || this.A01 != c51463MoA.A01 || this.A02 != c51463MoA.A02 || !C14360o3.A0K(this.A04, c51463MoA.A04) || this.A00 != c51463MoA.A00 || !C14360o3.A0K(this.A05, c51463MoA.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC167007dF.A0D(this.A09, ((((((AbstractC167017dG.A0O(this.A07) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A01) * 31) + this.A02) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + this.A00) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public C51463MoA(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, int i, int i2, int i3, boolean z) {
        this.A07 = str;
        this.A06 = str2;
        this.A08 = jSONObject;
        this.A03 = str3;
        this.A09 = z;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = str4;
        this.A00 = i3;
        this.A05 = str5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UserAvatarData(revisionId=");
        A1C.append(this.A07);
        A1C.append(", renderConfigHash=");
        A1C.append(this.A06);
        A1C.append(", config=");
        A1C.append(this.A08);
        A1C.append(", arEffectId=");
        A1C.append(this.A03);
        A1C.append(", isOdrEnabled=");
        A1C.append(this.A09);
        A1C.append(", lod=");
        A1C.append(this.A01);
        A1C.append(", textureSize=");
        A1C.append(this.A02);
        A1C.append(", assetProfile=");
        A1C.append(this.A04);
        A1C.append(", cacheVersion=");
        A1C.append(this.A00);
        A1C.append(", avatarStyle=");
        return AbstractC25236BEt.A0Y(this.A05, A1C);
    }
}
