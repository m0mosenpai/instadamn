package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.5PE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PE {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C2A7 A03;
    public final InterfaceC96774Wm A04;
    public final C5PD A05;
    public final Object A06;
    public final ArrayDeque A07;
    public final ArrayDeque A08;
    public final CopyOnWriteArraySet A09;

    public C5PE(Looper looper, C2A7 c2a7, C5PD c5pd) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.A03 = c2a7;
        this.A09 = copyOnWriteArraySet;
        this.A05 = c5pd;
        this.A06 = new Object();
        this.A07 = new ArrayDeque();
        this.A08 = new ArrayDeque();
        Handler.Callback callback = new Handler.Callback() { // from class: X.5PF
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C5PE c5pe = C5PE.this;
                Iterator it = c5pe.A09.iterator();
                while (it.hasNext()) {
                    C5PS c5ps = (C5PS) it.next();
                    if (!c5ps.A02 && c5ps.A01) {
                        c5ps.A00.A00();
                        c5ps.A00 = new C4WM();
                        c5ps.A01 = false;
                    }
                    if (((C96764Wl) c5pe.A04).A00.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        };
        List list = C96764Wl.A01;
        this.A04 = new C96764Wl(new Handler(looper, callback));
        this.A02 = true;
        this.A00 = C2C5.A02(C2C1.A0D);
    }

    public static void A00(C5PE c5pe) {
        if (c5pe.A02) {
            boolean z = false;
            if (Thread.currentThread() == ((C96764Wl) c5pe.A04).A00.getLooper().getThread()) {
                z = true;
            }
            C4B8.A04(z);
        }
    }

    public final void A01() {
        A00(this);
        ArrayDeque arrayDeque = this.A08;
        if (!arrayDeque.isEmpty()) {
            C96764Wl c96764Wl = (C96764Wl) this.A04;
            Handler handler = c96764Wl.A00;
            if (!handler.hasMessages(0)) {
                C96834Wt A00 = C96764Wl.A00();
                Message obtainMessage = handler.obtainMessage(0);
                A00.A00 = obtainMessage;
                A00.A01 = c96764Wl;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                C96834Wt.A00(A00);
            }
            ArrayDeque arrayDeque2 = this.A07;
            boolean z = !arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (z) {
                return;
            }
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void A02(final InterfaceC116555Pk interfaceC116555Pk, final int i) {
        A00(this);
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.A09);
        if (this.A00) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                C5PS c5ps = (C5PS) it.next();
                if (!c5ps.A02) {
                    if (i != -1) {
                        c5ps.A00.A01(i);
                    }
                    c5ps.A01 = true;
                    interfaceC116555Pk.CP5(c5ps.A03);
                }
            }
            return;
        }
        this.A08.add(new Runnable() { // from class: X.5Pl
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                InterfaceC116555Pk interfaceC116555Pk2 = interfaceC116555Pk;
                Iterator it2 = copyOnWriteArraySet2.iterator();
                while (it2.hasNext()) {
                    C5PS c5ps2 = (C5PS) it2.next();
                    if (!c5ps2.A02) {
                        if (i2 != -1) {
                            c5ps2.A00.A01(i2);
                        }
                        c5ps2.A01 = true;
                        interfaceC116555Pk2.CP5(c5ps2.A03);
                    }
                }
            }
        });
    }
}
