package X;

/* renamed from: X.6Eo, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Eo {
    public final Object A00;
    public final Runnable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6Eo) {
                C6Eo c6Eo = (C6Eo) obj;
                if (!C14360o3.A0K(this.A00, c6Eo.A00) || !C14360o3.A0K(this.A01, c6Eo.A01)) {
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
        sb.append("SubscribeResult(snapshot=");
        sb.append(this.A00);
        sb.append(", cancelToken=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C6Eo(Runnable runnable, Object obj) {
        this.A00 = obj;
        this.A01 = runnable;
    }
}
