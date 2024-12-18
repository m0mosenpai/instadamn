package X;

import android.widget.Scroller;

/* loaded from: classes9.dex */
public final class PSG implements Runnable {
    public Integer A00 = C05F.A0C;
    public final Scroller A01;
    public final /* synthetic */ C50809McW A02;

    public PSG(C50809McW c50809McW) {
        this.A02 = c50809McW;
        this.A01 = new Scroller(c50809McW.getContext());
    }

    @Override // java.lang.Runnable
    public final void run() {
        Scroller scroller = this.A01;
        boolean isFinished = scroller.isFinished();
        C50809McW c50809McW = this.A02;
        if (!isFinished) {
            float currX = scroller.getCurrX();
            c50809McW.A00 = currX;
            float f = c50809McW.A02 - currX;
            c50809McW.A02 = currX;
            Integer num = this.A00;
            if (((num == C05F.A01 && f <= 0.0f) || (num == C05F.A00 && f > 0.0f)) && !C50809McW.A05(c50809McW, f)) {
                scroller.forceFinished(true);
                c50809McW.removeCallbacks(this);
            }
            if (scroller.computeScrollOffset()) {
                c50809McW.postOnAnimation(this);
                return;
            }
        }
        InterfaceC57808Pka interfaceC57808Pka = c50809McW.A0L;
        if (interfaceC57808Pka == null) {
            return;
        }
        AbstractC51365MmQ abstractC51365MmQ = ((C56165OwX) interfaceC57808Pka).A00;
        InterfaceC58200Pr6 interfaceC58200Pr6 = abstractC51365MmQ.A02;
        C50809McW c50809McW2 = abstractC51365MmQ.A01;
        interfaceC58200Pr6.Dn4(c50809McW2.A0H, c50809McW2.A0G);
    }
}
