package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Y9d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73348Y9d implements InterfaceC197808or, InterfaceC197978p8 {
    public final Handler A00;
    public final HandlerThread A01;
    public final C72798XnL A02;
    public final Y7X A03;
    public final InterfaceC178407wE A04;
    public final WeakReference A06;
    public final Object A05 = AbstractC58318PtA.A0b();
    public final boolean A07 = true;

    public C73348Y9d(HandlerThread handlerThread, C72669Xkk c72669Xkk, C178597wX c178597wX, C72798XnL c72798XnL, Y2B y2b, Y1e y1e, InterfaceC178897x1 interfaceC178897x1, InterfaceC178407wE interfaceC178407wE, C201608vp c201608vp, List list, int i) {
        this.A06 = AbstractC25225BEi.A16(c72669Xkk);
        this.A04 = interfaceC178407wE;
        this.A02 = c72798XnL;
        this.A03 = new Y7X(c178597wX, c72798XnL, y2b, this, this, y1e, this, new C73349Y9e(c178597wX, this), this, interfaceC178897x1, interfaceC178407wE, c201608vp, list, i);
        this.A01 = handlerThread;
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper(), new Y88(this));
    }

    public static void A00(C73348Y9d c73348Y9d, Object obj, int i) {
        Message obtainMessage;
        Handler handler = c73348Y9d.A00;
        if (obj != null) {
            obtainMessage = handler.obtainMessage(i, 0, 0, obj);
        } else {
            obtainMessage = handler.obtainMessage(i, 0, 0);
        }
        handler.sendMessage(obtainMessage);
    }

    public final void A04(InterfaceC185788Ly interfaceC185788Ly) {
        ArrayList A17 = AbstractC25225BEi.A17(1);
        A17.add(interfaceC185788Ly);
        Iterator it = A17.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Y7X y7x = this.A03;
            if (next != null) {
                synchronized (next) {
                    y7x.A0i.add(next);
                }
            }
        }
        A00(this, A17, 9);
    }

    @Override // X.InterfaceC197808or
    public final void CtB(InterfaceC199678sJ interfaceC199678sJ) {
        this.A00.removeMessages(4);
        A00(this, interfaceC199678sJ, 4);
    }

    @Override // X.InterfaceC197978p8
    public final void Ehr(InterfaceC178897x1 interfaceC178897x1, int i) {
        C0J8.A08(AbstractC25229BEm.A1a(Thread.currentThread(), this.A01), "You cannot set up a shared context on the RenderThread");
        interfaceC178897x1.EhZ(this.A03.A0H(), 1);
    }

    public static void A01(C73348Y9d c73348Y9d, Object[] objArr, int i) {
        Handler handler = c73348Y9d.A00;
        handler.sendMessage(handler.obtainMessage(i, 0, 0, objArr));
    }

    public final C72748XmP A02() {
        C72673Xkq c72673Xkq = this.A03.A0V;
        synchronized (c72673Xkq) {
            List list = c72673Xkq.A00;
            if (!list.isEmpty()) {
                return (C72748XmP) list.remove(0);
            }
            return new C72748XmP();
        }
    }

    public final void A03(C72748XmP c72748XmP) {
        InterfaceC179247xa interfaceC179247xa = c72748XmP.A00;
        if (interfaceC179247xa != null) {
            if (interfaceC179247xa.AOo() && Thread.currentThread() != this.A01) {
                A00(this, c72748XmP, 12);
            } else {
                this.A03.A0J(c72748XmP);
            }
        }
    }

    @Override // X.InterfaceC197808or
    public final InterfaceC178897x1 B09() {
        return this.A03.A0H();
    }

    @Override // X.InterfaceC197808or
    public final void EUo(EnumC197748ol enumC197748ol, InterfaceC199678sJ interfaceC199678sJ) {
        A01(this, new Object[]{enumC197748ol, interfaceC199678sJ}, 23);
    }
}
