package X;

/* renamed from: X.Vui, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69748Vui {
    public final Object A00;
    public final java.util.Set A01;

    public C69748Vui(Object obj, java.util.Set set) {
        C14360o3.A0B(set, 2);
        this.A00 = obj;
        this.A01 = set;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69748Vui) {
                C69748Vui c69748Vui = (C69748Vui) obj;
                if (!C14360o3.A0K(this.A00, c69748Vui.A00) || !C14360o3.A0K(this.A01, c69748Vui.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ValueEntry(value=");
        sb.append(this.A00);
        sb.append(", variableLog=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }
}
