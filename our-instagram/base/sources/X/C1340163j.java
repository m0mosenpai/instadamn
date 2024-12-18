package X;

import java.util.Map;

/* renamed from: X.63j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1340163j implements C63N {
    public final Map A00;

    @Override // X.C63N
    public final Q0J Epl(String str) {
        return (Q0J) this.A00.get(str);
    }

    public final boolean equals(Object obj) {
        Map map = this.A00;
        if (!(obj instanceof C1340163j) || !C14360o3.A0K(map, ((C1340163j) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        Map map = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot(snapshot=");
        sb.append(map);
        sb.append(')');
        return sb.toString();
    }
}
