package X;

/* renamed from: X.Vuq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69755Vuq {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69755Vuq) {
                C69755Vuq c69755Vuq = (C69755Vuq) obj;
                if (!C14360o3.A0K(this.A01, c69755Vuq.A01) || !C14360o3.A0K(this.A00, c69755Vuq.A00) || this.A02 != c69755Vuq.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.A00, this.A01.hashCode() * 31);
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return A0K + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Item(item=");
        sb.append(this.A01);
        sb.append(", hint=");
        sb.append(this.A00);
        sb.append(", useDefaultClickHint=");
        return AbstractC25236BEt.A0a(sb, this.A02);
    }

    public C69755Vuq(String str, String str2, boolean z) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
    }
}
