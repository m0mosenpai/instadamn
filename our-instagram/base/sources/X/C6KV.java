package X;

/* renamed from: X.6KV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KV {
    public final float A00;
    public final C6L5 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6KV) {
                C6KV c6kv = (C6KV) obj;
                if (!C119145aW.A01(this.A00, c6kv.A00) || !C14360o3.A0K(this.A01, c6kv.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BorderStroke(width=");
        sb.append((Object) C119145aW.A00(this.A00));
        sb.append(", brush=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C6KV(C6L5 c6l5, float f) {
        this.A00 = f;
        this.A01 = c6l5;
    }
}
