package X;

import android.graphics.Point;

/* renamed from: X.OJj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54791OJj {
    public final int A00;
    public final Point A01;
    public final Point A02;
    public final OEN A03;
    public final Double A04;
    public final Double A05;
    public final Exception A06;
    public final Integer A07;
    public final String A08;

    public C54791OJj(Point point, Point point2, OEN oen, Double d, Double d2, Exception exc, Integer num, int i) {
        this.A03 = oen;
        this.A00 = i;
        this.A01 = point;
        this.A02 = point2;
        this.A07 = num;
        this.A04 = d;
        this.A05 = d2;
        this.A06 = exc;
        this.A08 = oen.A04;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RenderResult(renderConfig=");
        A1C.append(this.A03);
        A1C.append(", jpegQuality=");
        A1C.append(this.A00);
        A1C.append(", inputCropSize=");
        A1C.append(this.A01);
        A1C.append(", outputSize=");
        A1C.append(this.A02);
        A1C.append(AbstractC58317Pt9.A00(154));
        switch (this.A07.intValue()) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "IO_FAIL";
                break;
            default:
                str = "RENDER_FAIL";
                break;
        }
        A1C.append(str);
        A1C.append(", imageUploadMsssim=");
        A1C.append(this.A04);
        A1C.append(", imageUploadSsim=");
        A1C.append(this.A05);
        A1C.append(", path='");
        A1C.append(this.A08);
        return AbstractC166997dE.A0x("')", A1C);
    }
}
