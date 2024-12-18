package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6AQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AQ {
    public final Object A00;
    public final String A01;
    public final List A02;
    public final Map A03;

    public C6AQ(Object obj, String str, List list, Map map) {
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(map, 2);
        C14360o3.A0B(str, 3);
        C14360o3.A0B(list, 4);
        this.A00 = obj;
        this.A03 = map;
        this.A01 = str;
        this.A02 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6AQ) {
                C6AQ c6aq = (C6AQ) obj;
                if (!C14360o3.A0K(this.A00, c6aq.A00) || !C14360o3.A0K(this.A03, c6aq.A03) || !C14360o3.A0K(this.A01, c6aq.A01) || !C14360o3.A0K(this.A02, c6aq.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A00.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Template(templateObject=");
        sb.append(this.A00);
        sb.append(", expandedVariables=");
        sb.append(this.A03);
        sb.append(", scopeKey=");
        sb.append(this.A01);
        sb.append(", keyPathBase=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }
}
