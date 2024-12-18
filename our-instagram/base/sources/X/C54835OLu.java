package X;

import java.util.Map;

/* renamed from: X.OLu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54835OLu {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    public C54835OLu(String str, String str2, Map map, int i, int i2) {
        C14360o3.A0B(map, 2);
        this.A03 = str;
        this.A04 = map;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str2;
        this.A05 = map.containsKey("root");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54835OLu) {
                C54835OLu c54835OLu = (C54835OLu) obj;
                if (!C14360o3.A0K(this.A03, c54835OLu.A03) || !C14360o3.A0K(this.A04, c54835OLu.A04) || Float.compare(0.033f, 0.033f) != 0 || this.A00 != c54835OLu.A00 || this.A01 != c54835OLu.A01 || !C14360o3.A0K(this.A02, c54835OLu.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, (((AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A03)), 0.033f) + this.A00) * 31) + this.A01) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ODRCDLInitializationParameters(revisionId=");
        A1C.append(this.A03);
        A1C.append(", avatarConfig=");
        A1C.append(this.A04);
        A1C.append(", fixedElapsedTimeForAnimation=");
        A1C.append(0.033f);
        A1C.append(", lod=");
        A1C.append(this.A00);
        A1C.append(", textureSize=");
        A1C.append(this.A01);
        A1C.append(", assetProfile=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
