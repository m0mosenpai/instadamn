package X;

/* renamed from: X.4Iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93694Iy {
    public final double A00;
    public final double A01;
    public final C93664Iu A02;
    public final C4It A03;
    public final C4B6 A04;
    public final boolean A05;

    public final String toString() {
        String str;
        String str2;
        boolean A02 = C4BW.A02(this.A04);
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (A02) {
            str = "audio, ";
        } else {
            str = "video, ";
        }
        sb.append(str);
        sb.append("bitrate=");
        C4It c4It = this.A03;
        sb.append(c4It.A03);
        sb.append(", risk=");
        sb.append(c4It);
        sb.append(", reward=");
        sb.append(this.A02);
        sb.append(", risk thr=");
        sb.append(this.A01);
        sb.append(" (");
        sb.append("NORMAL");
        sb.append("), ratio=");
        sb.append(this.A00);
        if (this.A05) {
            str2 = ", too risky";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    public C93694Iy(C93664Iu c93664Iu, C4It c4It, C4B6 c4b6, double d, double d2, boolean z) {
        this.A04 = c4b6;
        this.A03 = c4It;
        this.A02 = c93664Iu;
        this.A00 = d;
        this.A01 = d2;
        this.A05 = z;
    }
}
