package X;

import java.util.Map;

/* renamed from: X.Pzr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58678Pzr {
    public final long A00;
    public final EnumC58683Pzw A01;
    public final String A02;
    public final Map A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C58678Pzr) {
                C58678Pzr c58678Pzr = (C58678Pzr) obj;
                if (!C14360o3.A0K(this.A02, c58678Pzr.A02) || !C14360o3.A0K(this.A03, c58678Pzr.A03) || this.A00 != c58678Pzr.A00 || this.A01 != c58678Pzr.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC25236BEt.A01(this.A00, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A02))));
    }

    public C58678Pzr(EnumC58683Pzw enumC58683Pzw, String str, Map map, long j) {
        this.A02 = str;
        this.A03 = map;
        this.A00 = j;
        this.A01 = enumC58683Pzw;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ComponentQueryStoreRequest(appId=");
        A1C.append(this.A02);
        A1C.append(", params=");
        A1C.append(this.A03);
        A1C.append(", cacheTtlSeconds=");
        A1C.append(this.A00);
        A1C.append(", queryPurpose=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
