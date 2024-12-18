package X;

/* renamed from: X.8a0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189258a0 extends AbstractC189198Zo {
    public final C115475Kh A00;
    public final C8Ba A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C189258a0) {
                C189258a0 c189258a0 = (C189258a0) obj;
                if (!C14360o3.A0K(this.A00, c189258a0.A00) || !C14360o3.A0K(this.A01, c189258a0.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C115475Kh c115475Kh = this.A00;
        return ((((c115475Kh == null ? 0 : c115475Kh.hashCode()) * 31) + AbstractC53644Nnp.A00()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerateSegmentEvent(videoSegment=");
        sb.append(this.A00);
        sb.append(", isStackTimeline=");
        sb.append(false);
        sb.append(", bitmapGeneratorParams=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C189258a0(C8Ba c8Ba, C115475Kh c115475Kh) {
        this.A00 = c115475Kh;
        this.A01 = c8Ba;
    }
}
