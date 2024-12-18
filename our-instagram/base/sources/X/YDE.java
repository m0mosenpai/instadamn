package X;

import java.util.Iterator;

/* loaded from: classes12.dex */
public final class YDE implements InterfaceC73607YNx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ YOw A01;
    public final /* synthetic */ InterfaceC73607YNx A02;
    public final /* synthetic */ Xl5 A03;
    public final /* synthetic */ YD6 A04;

    public YDE(YOw yOw, InterfaceC73607YNx interfaceC73607YNx, Xl5 xl5, YD6 yd6, int i) {
        this.A04 = yd6;
        this.A01 = yOw;
        this.A03 = xl5;
        this.A00 = i;
        this.A02 = interfaceC73607YNx;
    }

    @Override // X.InterfaceC73607YNx
    public final void DD3(Object obj) {
        YD6 yd6 = this.A04;
        if (!yd6.A00) {
            yd6.A00 = true;
            C72863XpS c72863XpS = yd6.A01;
            YDP ydp = new YDP();
            Iterator A14 = AbstractC166997dE.A14(c72863XpS.A00);
            while (A14.hasNext()) {
                ydp.A00(AbstractC166987dD.A1K(A14).getValue());
            }
            Iterator it = ydp.iterator();
            while (it.hasNext()) {
                YOw yOw = (YOw) it.next();
                if (yOw != this.A01) {
                    yOw.AGF(this.A03);
                }
            }
            this.A02.DD3(new C72725Xlx(this.A00, obj));
        }
    }
}
