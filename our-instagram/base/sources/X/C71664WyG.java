package X;

import java.util.Map;

/* renamed from: X.WyG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71664WyG implements Map.Entry, InterfaceC15590qF {
    public final Object A00;
    public final Object A01;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C71664WyG) {
                C71664WyG c71664WyG = (C71664WyG) obj;
                if (!C14360o3.A0K(this.A00, c71664WyG.A00) || !C14360o3.A0K(this.A01, c71664WyG.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException(AbstractC111324zv.A00(30));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = 0;
        int A0M = AbstractC167017dG.A0M(this.A00) * 31;
        Object obj = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        }
        return A0M + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MapEntry(key=");
        sb.append(this.A00);
        sb.append(", value=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }

    public C71664WyG(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
