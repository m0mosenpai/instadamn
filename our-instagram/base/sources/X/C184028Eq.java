package X;

import java.util.Map;

/* renamed from: X.8Eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184028Eq {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final Map A03;

    public C184028Eq(Integer num, String str, String str2, Map map) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = num;
        this.A03 = map;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C184028Eq) {
                C184028Eq c184028Eq = (C184028Eq) obj;
                if (!C14360o3.A0K(this.A01, c184028Eq.A01) || !C14360o3.A0K(this.A00, c184028Eq.A00) || !C14360o3.A0K(this.A03, c184028Eq.A03) || !C14360o3.A0K(this.A02, c184028Eq.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        Integer num = this.A00;
        return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadedAiModel(filePath=");
        sb.append(this.A01);
        sb.append(", version=");
        sb.append(this.A00);
        sb.append(", extras=");
        sb.append(this.A03);
        sb.append(", name=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }
}
