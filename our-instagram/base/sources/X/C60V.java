package X;

/* renamed from: X.60V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60V {
    public final C5Y2 A00;
    public final Integer A01;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("AnimationResult(endReason=");
        if (this.A01.intValue() != 0) {
            str = "Finished";
        } else {
            str = "BoundReached";
        }
        sb.append(str);
        sb.append(", endState=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C60V(C5Y2 c5y2, Integer num) {
        this.A00 = c5y2;
        this.A01 = num;
    }
}
