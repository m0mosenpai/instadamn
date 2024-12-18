package X;

import android.os.HandlerThread;
import android.os.Message;
import java.util.Stack;

/* renamed from: X.1tI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39941tI implements InterfaceC39221rz {
    public C40621uV A00;
    public C40621uV A01;
    public final InterfaceC37451oi A02;
    public final InterfaceC37451oi A03;
    public final InterfaceC38311qL A04;
    public final C39931tH A05;
    public final HandlerC39951tJ A06;
    public final C38151q2 A07;
    public final C38951rU A08;

    @Override // X.InterfaceC39221rz
    public final void CtZ(C39831t7 c39831t7) {
        HandlerC39951tJ handlerC39951tJ = this.A06;
        HandlerC39951tJ.A03(handlerC39951tJ);
        handlerC39951tJ.sendMessage(handlerC39951tJ.obtainMessage(4, null));
    }

    @Override // X.InterfaceC39221rz
    public final void E6E(C39851t9 c39851t9) {
        Message obtainMessage;
        HandlerC39951tJ handlerC39951tJ = this.A06;
        if (handlerC39951tJ.A06.A04.B1R()) {
            synchronized (handlerC39951tJ.A04) {
                Stack stack = handlerC39951tJ.A02;
                if (stack == null) {
                    stack = new Stack();
                    handlerC39951tJ.A02 = stack;
                }
                stack.push(c39851t9);
            }
            obtainMessage = handlerC39951tJ.obtainMessage(8);
        } else {
            obtainMessage = handlerC39951tJ.obtainMessage(1, c39851t9);
        }
        handlerC39951tJ.sendMessageAtFrontOfQueue(obtainMessage);
        HandlerC39951tJ.A04(handlerC39951tJ, c39851t9.A03, "event.queued", c39851t9.A05, c39851t9.A06);
    }

    @Override // X.InterfaceC39221rz
    public final void E6F(C39851t9 c39851t9) {
        boolean z;
        HandlerC39951tJ handlerC39951tJ = this.A06;
        String str = c39851t9.A05;
        String str2 = c39851t9.A06;
        C0CA c0ca = c39851t9.A03;
        HandlerC39951tJ.A04(handlerC39951tJ, c0ca, "event.queued", str, str2);
        C39941tI c39941tI = handlerC39951tJ.A06;
        if (c39941tI.A04.B1R()) {
            long j = c39851t9.A00;
            synchronized (handlerC39951tJ.A05) {
                C39961tK c39961tK = handlerC39951tJ.A01;
                if (c39961tK != null && !c39961tK.A05 && c39961tK.A08.length > c39961tK.A02 && c39961tK.A09.length > c39961tK.A01) {
                    z = false;
                } else {
                    int i = c39941tI.A07.A02.A0J;
                    synchronized (C39961tK.A0B) {
                        try {
                            c39961tK = C39961tK.A0A;
                            if (c39961tK != null) {
                                C39961tK.A0A = c39961tK.A03;
                                c39961tK.A03 = null;
                            } else {
                                c39961tK = new C39961tK(i);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    handlerC39951tJ.A01 = c39961tK;
                    z = true;
                }
                if (!c39961tK.A05) {
                    C0CA[] c0caArr = c39961tK.A08;
                    int length = c0caArr.length;
                    int i2 = c39961tK.A02;
                    if (length > i2) {
                        C0CA[] c0caArr2 = c39961tK.A09;
                        int length2 = c0caArr2.length;
                        int i3 = c39961tK.A01;
                        if (length2 > i3) {
                            if (j != -2 && j != -4) {
                                c0caArr[i2] = c0ca;
                                c39961tK.A07[i2] = j;
                                c39961tK.A02 = i2 + 1;
                            } else {
                                c0caArr2[i3] = c0ca;
                                c39961tK.A06[i3] = j;
                                c39961tK.A01 = i3 + 1;
                                c39961tK.A04 = true;
                            }
                            if (z) {
                                handlerC39951tJ.sendMessage(handlerC39951tJ.obtainMessage(1, 2, 0, c39961tK));
                            }
                        }
                    }
                }
                throw new IllegalStateException("Batch cannot accept more events");
            }
            return;
        }
        handlerC39951tJ.sendMessage(handlerC39951tJ.obtainMessage(1, 1, 0, c39851t9));
    }

    @Override // X.InterfaceC39221rz
    public final void Enc(C39841t8 c39841t8) {
        HandlerC39951tJ handlerC39951tJ = this.A06;
        HandlerC39951tJ.A03(handlerC39951tJ);
        AbstractC05810Sj.A01(c39841t8, "Cannot start a session with null batchSession");
        handlerC39951tJ.sendMessage(handlerC39951tJ.obtainMessage(3, c39841t8));
    }

    @Override // X.InterfaceC39221rz
    public final void F8b() {
        HandlerC39951tJ handlerC39951tJ = this.A06;
        HandlerC39951tJ.A03(handlerC39951tJ);
        handlerC39951tJ.sendMessage(handlerC39951tJ.obtainMessage(9));
    }

    public C39941tI(HandlerThread handlerThread, InterfaceC37451oi interfaceC37451oi, InterfaceC37451oi interfaceC37451oi2, InterfaceC38311qL interfaceC38311qL, C39931tH c39931tH, C38201qA c38201qA, C38151q2 c38151q2, C38951rU c38951rU) {
        this.A06 = new HandlerC39951tJ(handlerThread.getLooper(), this, c38201qA);
        this.A03 = interfaceC37451oi;
        this.A02 = interfaceC37451oi2;
        this.A05 = c39931tH;
        this.A04 = interfaceC38311qL;
        this.A07 = c38151q2;
        this.A08 = c38951rU;
    }
}
