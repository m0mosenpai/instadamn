package X;

import android.view.MotionEvent;

/* loaded from: classes8.dex */
public final class L80 {
    public boolean A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;
    public final int A03;
    public final L71 A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16660sJ A06;

    public final boolean A00(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A00 = false;
        }
        if (this.A00) {
            AbstractC25227BEk.A1Q(this.A01, true);
            return AbstractC25231BEo.A1a(motionEvent, this.A02);
        }
        if (motionEvent.getY() <= this.A03 && this.A04.A00(motionEvent) && !AbstractC25231BEo.A1b(this.A05)) {
            this.A00 = true;
            AbstractC25227BEk.A1Q(this.A01, true);
            boolean A1a = AbstractC25231BEo.A1a(motionEvent, this.A02);
            InterfaceC16660sJ interfaceC16660sJ = this.A06;
            motionEvent.setAction(3);
            interfaceC16660sJ.invoke(motionEvent);
            return A1a;
        }
        return AbstractC25231BEo.A1a(motionEvent, this.A06);
    }

    public L80(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, int i, int i2) {
        this.A03 = i2;
        this.A05 = interfaceC16820sZ;
        this.A02 = interfaceC16660sJ;
        this.A06 = interfaceC16660sJ2;
        this.A01 = interfaceC16660sJ3;
        this.A04 = new L71(i);
    }
}
