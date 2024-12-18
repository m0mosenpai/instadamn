package X;

import java.util.List;

/* renamed from: X.8E5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8E5 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public C8E5(String str, String str2, List list, long j) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(list, 4);
        this.A02 = str;
        this.A00 = j;
        this.A01 = str2;
        this.A03 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8E5) {
                C8E5 c8e5 = (C8E5) obj;
                if (!C14360o3.A0K(this.A02, c8e5.A02) || this.A00 != c8e5.A00 || !C14360o3.A0K(this.A01, c8e5.A01) || !C14360o3.A0K(this.A03, c8e5.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NativeModelRequestMetadata(modelName=");
        sb.append(this.A02);
        sb.append(", version=");
        sb.append(this.A00);
        sb.append(", assetName=");
        sb.append(this.A01);
        sb.append(", extras=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        long j = this.A00;
        return ((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode();
    }
}
