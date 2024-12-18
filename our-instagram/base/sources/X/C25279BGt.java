package X;

/* renamed from: X.BGt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25279BGt extends BH1 {
    public final boolean A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25279BGt) {
                C25279BGt c25279BGt = (C25279BGt) obj;
                if (this.A00 != c25279BGt.A00 || this.A01 != c25279BGt.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public C25279BGt(boolean z, int i) {
        super("loading", "content_type_loading");
        this.A00 = z;
        this.A01 = i;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A00) + this.A01;
    }
}
