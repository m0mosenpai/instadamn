package X;

/* renamed from: X.Vuk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69750Vuk {
    public final String A00;
    public final String A01;

    public C69750Vuk(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69750Vuk) {
                C69750Vuk c69750Vuk = (C69750Vuk) obj;
                if (!C14360o3.A0K(this.A00, c69750Vuk.A00) || !C14360o3.A0K(this.A01, c69750Vuk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00.hashCode() * 31) + ((int) (0 >>> 32))) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CdsAnalyticsConfig(analyticsName=");
        sb.append(this.A00);
        sb.append(", featureId=");
        sb.append(0L);
        sb.append(", moduleClassNameOverride=");
        return AbstractC25236BEt.A0Y(this.A01, sb);
    }
}
