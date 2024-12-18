package X;

/* renamed from: X.8Zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189188Zn extends AbstractC189198Zo {
    public final C84B A00;
    public final C8Ba A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C189188Zn) {
                C189188Zn c189188Zn = (C189188Zn) obj;
                if (!C14360o3.A0K(this.A00, c189188Zn.A00) || !C14360o3.A0K(this.A01, c189188Zn.A01)) {
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
        sb.append("GenerateWarmSegmentsEvent(segmentStore=");
        sb.append(this.A00);
        sb.append(", bitmapGeneratorParams=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C189188Zn(C8Ba c8Ba, C84B c84b) {
        this.A00 = c84b;
        this.A01 = c8Ba;
    }
}
