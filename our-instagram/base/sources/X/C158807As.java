package X;

/* renamed from: X.7As, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158807As extends AbstractC158777Ao {
    public final int A00;
    public final CharSequence A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158807As) {
                C158807As c158807As = (C158807As) obj;
                if (!C14360o3.A0K(this.A01, c158807As.A01) || this.A00 != c158807As.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        CharSequence charSequence = this.A01;
        return ((charSequence != null ? charSequence.hashCode() : 0) * 31) + this.A00;
    }

    public C158807As(CharSequence charSequence, int i) {
        this.A01 = charSequence;
        this.A00 = i;
    }
}
