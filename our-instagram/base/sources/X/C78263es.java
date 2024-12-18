package X;

/* renamed from: X.3es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78263es {
    public final C2X5 A00;
    public final C2WC A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C78263es(C2X5 c2x5, C2WC c2wc, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c2wc, 1);
        this.A01 = c2wc;
        this.A00 = c2x5;
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C78263es) {
                C78263es c78263es = (C78263es) obj;
                if (!C14360o3.A0K(this.A01, c78263es.A01) || !C14360o3.A0K(this.A00, c78263es.A00) || this.A04 != c78263es.A04 || this.A02 != c78263es.A02 || this.A03 != c78263es.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Model(renderUnit=");
        sb.append(this.A01);
        sb.append(", viewAttributes=");
        sb.append(this.A00);
        sb.append(", isRootHost=");
        sb.append(this.A04);
        sb.append(", cloneStateListAnimators=");
        sb.append(this.A02);
        sb.append(", isEventHandlerRedesignEnabled=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        return i4 + i5;
    }
}
