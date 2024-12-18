package X;

import android.graphics.Point;

/* renamed from: X.Xab, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C72278Xab extends AbstractC73478YFb {
    public float A00;
    public YRN A01;
    public C73480YFd A02;
    public Y13 A03;
    public final YQ3 A04;

    @Override // X.AbstractC73478YFb, X.YQ3
    public YRN AMV() {
        if (this.A02 != null) {
            C72279Xac c72279Xac = new C72279Xac(this);
            c72279Xac.A01(this);
            return c72279Xac;
        }
        throw AbstractC166987dD.A14("backed brush can't make a mark without a backing");
    }

    @Override // X.YQ3
    public final C22978ABc ArF() {
        return this.A04.ArF();
    }

    @Override // X.YQ3
    public final void CNp(C22978ABc c22978ABc) {
        this.A04.CNp(c22978ABc);
    }

    @Override // X.AbstractC73478YFb, X.YQ3
    public void ERe(int i) {
        super.A03 = i;
        this.A04.ERe(i);
    }

    @Override // X.YQ3
    public final void EYc(float[] fArr) {
        this.A07 = fArr;
        this.A04.EYc(fArr);
    }

    @Override // X.AbstractC73478YFb, X.YQ3
    public final boolean isValid() {
        return this.A04.isValid();
    }

    public C72278Xab(YQ3 yq3, String str) {
        super(str);
        this.A00 = 1.0f;
        this.A03 = Y13.A08;
        this.A04 = yq3;
    }

    @Override // X.AbstractC73478YFb, X.YQ3
    public final void EQD(Point point) {
        super.EQD(point);
        C22978ABc ArF = this.A04.ArF();
        if (this.A02 == null) {
            int i = point.x;
            int i2 = point.y;
            if (i * i2 > 0 && ArF != null) {
                C73480YFd c73480YFd = new C73480YFd(ArF, i, i2);
                this.A02 = c73480YFd;
                c73480YFd.A01 = this.A03;
                c73480YFd.A00 = this.A00;
                c73480YFd.A02();
            }
        }
    }
}
