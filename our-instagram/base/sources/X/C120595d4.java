package X;

/* renamed from: X.5d4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120595d4 extends C0T6 {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final int A05;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StoryPrefetchStoryTraySignals(unreadCount=");
        sb.append(this.A05);
        sb.append(", probabilityTapEnterStory=");
        sb.append(this.A00);
        sb.append(", probabilityTapStory1=");
        sb.append(this.A01);
        sb.append(", probabilityTapStory2=");
        sb.append(this.A02);
        sb.append(", probabilityTapStory3=");
        sb.append(this.A03);
        sb.append(", probabilityTapStory4=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C120595d4(double d, double d2, double d3, double d4, double d5, int i) {
        this.A05 = i;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = d3;
        this.A03 = d4;
        this.A04 = d5;
    }
}
