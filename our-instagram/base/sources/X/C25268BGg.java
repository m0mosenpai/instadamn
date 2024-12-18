package X;

/* renamed from: X.BGg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25268BGg extends BH1 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25268BGg) {
                C25268BGg c25268BGg = (C25268BGg) obj;
                if (this.A00 != c25268BGg.A00 || this.A01 != c25268BGg.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C25268BGg(int i, int i2) {
        super(String.valueOf(i), "content_type_header");
        this.A00 = i;
        this.A01 = i2;
    }
}
