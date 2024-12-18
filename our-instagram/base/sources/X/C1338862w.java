package X;

import java.util.Map;

/* renamed from: X.62w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1338862w {
    public final Map A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1338862w) && C14360o3.A0K(this.A00, ((C1338862w) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BloksFunctionTable(entries=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C1338862w(Map map) {
        this.A00 = map;
    }
}
