package X;

import java.util.Map;

/* renamed from: X.6Ep, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Ep {
    public final Map A00;

    public C6Ep(Map map) {
        C14360o3.A0B(map, 1);
        this.A00 = map;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C6Ep) && C14360o3.A0K(this.A00, ((C6Ep) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot(memorySnapshot=");
        Map map = this.A00;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot(snapshot=");
        sb2.append(map);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
