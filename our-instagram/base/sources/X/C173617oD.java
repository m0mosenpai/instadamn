package X;

import java.util.Map;

/* renamed from: X.7oD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173617oD {
    public final EnumC173197nX A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C173617oD) {
                C173617oD c173617oD = (C173617oD) obj;
                if (this.A00 != c173617oD.A00 || !C14360o3.A0K(this.A01, c173617oD.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XpostContentCompatConfigModel(sourceAppName=");
        sb.append(this.A00);
        sb.append(", featureConfigMap=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C173617oD(EnumC173197nX enumC173197nX, Map map) {
        this.A00 = enumC173197nX;
        this.A01 = map;
    }
}
