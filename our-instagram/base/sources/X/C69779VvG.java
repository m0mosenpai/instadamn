package X;

import java.util.Map;

/* renamed from: X.VvG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69779VvG {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;
    public final boolean A07;

    public C69779VvG(String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z) {
        C14360o3.A0B(str2, 2);
        this.A05 = str;
        this.A00 = str2;
        this.A07 = z;
        this.A06 = map;
        this.A04 = str3;
        this.A01 = str4;
        this.A02 = str5;
        this.A03 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69779VvG) {
                C69779VvG c69779VvG = (C69779VvG) obj;
                if (!C14360o3.A0K(this.A05, c69779VvG.A05) || !C14360o3.A0K(this.A00, c69779VvG.A00) || !"UNKNOWN".equals("UNKNOWN") || this.A07 != c69779VvG.A07 || !C14360o3.A0K(this.A06, c69779VvG.A06) || !C14360o3.A0K(this.A04, c69779VvG.A04) || !C14360o3.A0K(this.A01, c69779VvG.A01) || !C14360o3.A0K(this.A02, c69779VvG.A02) || !C14360o3.A0K(this.A03, c69779VvG.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (((((((AbstractC167007dF.A0D(this.A07, (AbstractC166997dE.A0K(this.A00, this.A05.hashCode() * 31) + 433141802) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0D + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AvailabilityInfo(securityOriginUrlHost=");
        sb.append(this.A05);
        sb.append(", clickSourceOfIAWLink=");
        sb.append(this.A00);
        sb.append(AbstractC111324zv.A00(1413));
        sb.append("UNKNOWN");
        sb.append(", isProductEnabled=");
        sb.append(this.A07);
        sb.append(", additionalInfo=");
        sb.append(this.A06);
        sb.append(", sdkFeatureFlags=");
        sb.append(this.A04);
        sb.append(", iawAdId=");
        sb.append(this.A01);
        sb.append(", iawSessionId=");
        sb.append(this.A02);
        sb.append(", iawTrackingToken=");
        return AbstractC25236BEt.A0Y(this.A03, sb);
    }
}
