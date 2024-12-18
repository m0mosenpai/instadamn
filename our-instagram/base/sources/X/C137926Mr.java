package X;

/* renamed from: X.6Mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137926Mr {
    public final long A00;
    public final InterfaceC1333460b A01;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
                C137926Mr c137926Mr = (C137926Mr) obj;
                long j = this.A00;
                long j2 = c137926Mr.A00;
                long j3 = C1132359l.A01;
                if (j != j2 || !C14360o3.A0K(this.A01, c137926Mr.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = C1132359l.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OverscrollConfiguration(glowColor=");
        sb.append((Object) C1132359l.A06(this.A00));
        sb.append(", drawPadding=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C137926Mr() {
        long j = C1132359l.A01;
        C1333560c c1333560c = new C1333560c(0.0f, 0.0f, 0.0f, 0.0f);
        this.A00 = 4284900966L << 32;
        this.A01 = c1333560c;
    }
}
