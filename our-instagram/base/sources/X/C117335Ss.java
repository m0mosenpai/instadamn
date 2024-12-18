package X;

/* renamed from: X.5Ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117335Ss {
    public final String A00;
    public final C17u A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117335Ss) {
                C117335Ss c117335Ss = (C117335Ss) obj;
                if (!C14360o3.A0K(this.A00, c117335Ss.A00) || !C14360o3.A0K(this.A01, c117335Ss.A01)) {
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
        sb.append("MatchGroup(value=");
        sb.append(this.A00);
        sb.append(", range=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C117335Ss(String str, C17u c17u) {
        this.A00 = str;
        this.A01 = c17u;
    }
}
