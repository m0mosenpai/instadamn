package X;

import android.os.HandlerThread;
import android.os.Message;
import java.util.Stack;

/* renamed from: X.Xp9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72853Xp9 {
    public Y0t A00;
    public Y0t A01;
    public final InterfaceC37451oi A02;
    public final InterfaceC38311qL A03;
    public final C72818Xni A04;
    public final HandlerC72134XPg A05;
    public final C38951rU A06;

    public final void A00(C39851t9 c39851t9) {
        Message obtainMessage;
        HandlerC72134XPg handlerC72134XPg = this.A05;
        if (handlerC72134XPg.A09.A03.B1R()) {
            synchronized (handlerC72134XPg.A06) {
                Stack stack = handlerC72134XPg.A03;
                if (stack == null) {
                    stack = new Stack();
                    handlerC72134XPg.A03 = stack;
                }
                stack.push(c39851t9);
            }
            obtainMessage = handlerC72134XPg.obtainMessage(8);
        } else {
            obtainMessage = handlerC72134XPg.obtainMessage(1, c39851t9);
        }
        handlerC72134XPg.sendMessageAtFrontOfQueue(obtainMessage);
        HandlerC72134XPg.A05(handlerC72134XPg, c39851t9.A03, "event.queued", c39851t9.A05, c39851t9.A06);
    }

    public final void A01(C39841t8 c39841t8) {
        HandlerC72134XPg handlerC72134XPg = this.A05;
        HandlerC72134XPg.A04(handlerC72134XPg);
        AbstractC05810Sj.A01(c39841t8, "Cannot start a session with null batchSession");
        AbstractC166997dE.A1H(handlerC72134XPg, c39841t8, 3);
    }

    public C72853Xp9(HandlerThread handlerThread, InterfaceC37451oi interfaceC37451oi, InterfaceC38311qL interfaceC38311qL, C72818Xni c72818Xni, C38201qA c38201qA, C38951rU c38951rU, Integer num) {
        this.A05 = new HandlerC72134XPg(handlerThread.getLooper(), this, c38201qA, num);
        this.A02 = interfaceC37451oi;
        this.A04 = c72818Xni;
        this.A03 = interfaceC38311qL;
        this.A06 = c38951rU;
    }
}
