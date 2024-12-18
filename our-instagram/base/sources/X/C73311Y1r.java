package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Y1r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73311Y1r {
    public boolean A00;
    public final YQ7 A01;
    public final YM5 A02;
    public final YNG A03;
    public final CopyOnWriteArraySet A04;
    public final Object A05 = AbstractC58318PtA.A0b();
    public final ArrayDeque A06 = new ArrayDeque();
    public final ArrayDeque A07 = new ArrayDeque();

    public static void A00(C73311Y1r c73311Y1r, Object obj, int i, int i2) {
        c73311Y1r.A02(new Y8d(obj, i), i2);
    }

    public final void A01() {
        if (this.A00) {
            WDn.A02(AbstractC167007dF.A1X(Thread.currentThread(), AbstractC72046XLm.A0b(((Y8Y) this.A02).A00)));
        }
        ArrayDeque arrayDeque = this.A07;
        if (!arrayDeque.isEmpty()) {
            Y8Y y8y = (Y8Y) this.A02;
            Handler handler = y8y.A00;
            if (!handler.hasMessages(1)) {
                Y3Q A00 = Y8Y.A00();
                Message obtainMessage = handler.obtainMessage(1);
                A00.A00 = obtainMessage;
                A00.A01 = y8y;
                obtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(obtainMessage);
                Y3Q.A01(A00);
            }
            ArrayDeque arrayDeque2 = this.A06;
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

    public final void A02(final YNF ynf, final int i) {
        if (this.A00) {
            WDn.A02(AbstractC167007dF.A1X(Thread.currentThread(), AbstractC72046XLm.A0b(((Y8Y) this.A02).A00)));
        }
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.A04);
        this.A07.add(new Runnable() { // from class: X.YHw
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                YNF ynf2 = ynf;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    C72847Xp3 c72847Xp3 = (C72847Xp3) it.next();
                    if (i2 != -1) {
                        c72847Xp3.A00.A01(i2);
                    }
                    c72847Xp3.A01 = true;
                    ynf2.CP5(c72847Xp3.A02);
                }
            }
        });
    }

    public final void A03(Object obj) {
        synchronized (this.A05) {
            this.A04.add(new C72847Xp3(obj));
        }
    }

    public C73311Y1r(Looper looper, YQ7 yq7, YNG yng, CopyOnWriteArraySet copyOnWriteArraySet, boolean z) {
        this.A01 = yq7;
        this.A04 = copyOnWriteArraySet;
        this.A03 = yng;
        Y89 y89 = new Y89(this, 0);
        List list = Y8Y.A01;
        this.A02 = new Y8Y(new Handler(looper, y89));
        this.A00 = z;
    }
}
