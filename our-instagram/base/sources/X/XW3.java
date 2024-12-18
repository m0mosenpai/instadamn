package X;

/* loaded from: classes12.dex */
public final class XW3 extends AbstractC184688Hj {
    public Y1s A00;
    public Y1s A01;
    public final /* synthetic */ BDG A02;
    public final /* synthetic */ C175407rG A03;

    public XW3(BDG bdg, C175407rG c175407rG) {
        this.A03 = c175407rG;
        this.A02 = bdg;
    }

    @Override // X.AbstractC184688Hj
    public final void A01(Exception exc) {
        this.A02.Dyo(exc);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Y14, java.lang.Object] */
    @Override // X.AbstractC184688Hj
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        Y1s y1s = (Y1s) obj;
        int intValue = y1s.A00(Y1s.A0J).intValue();
        C175407rG c175407rG = this.A03;
        if (intValue == c175407rG.A00) {
            this.A01 = y1s;
        } else {
            this.A00 = y1s;
        }
        Y1s y1s2 = this.A01;
        if (y1s2 != null) {
            Y1s y1s3 = this.A00;
            if (y1s3 != null) {
                ?? obj2 = new Object();
                obj2.A0I = true;
                obj2.A00 = 0;
                obj2.A05 = 0;
                obj2.A06 = -1L;
                obj2.A07 = -1L;
                obj2.A08 = -1L;
                obj2.A09 = -1L;
                obj2.A0G = y1s2.A0G;
                obj2.A0B = y1s2.A0B;
                obj2.A0H = y1s2.A0H;
                obj2.A0C = y1s2.A0C;
                obj2.A03 = y1s2.A07;
                obj2.A02 = y1s2.A06;
                obj2.A04 = y1s2.A08;
                obj2.A01 = y1s2.A05;
                obj2.A0I = y1s2.A0I;
                obj2.A00 = y1s2.A04;
                obj2.A05 = y1s2.A09;
                obj2.A0D = y1s2.A0D;
                obj2.A0E = y1s2.A0E;
                obj2.A0F = y1s2.A0F;
                obj2.A06 = y1s2.A00;
                obj2.A07 = y1s2.A01;
                obj2.A08 = y1s2.A02;
                obj2.A09 = y1s2.A03;
                obj2.A0A = y1s2.A0A;
                obj2.A01(Y1s.A0R, y1s3);
                y1s2 = new Y1s(obj2);
            } else if (!c175407rG.A08) {
                return;
            }
            c175407rG.A03 = y1s2;
            this.A02.Dyp(y1s2);
        }
    }
}
