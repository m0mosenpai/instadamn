package X;

import java.util.List;

/* renamed from: X.7o9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173577o9 {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C173577o9) {
                C173577o9 c173577o9 = (C173577o9) obj;
                if (!C14360o3.A0K(this.A01, c173577o9.A01) || !C14360o3.A0K(this.A00, c173577o9.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SourceAndDestinationConfig(sources=");
        sb.append(this.A01);
        sb.append(", destinations=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C173577o9(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
