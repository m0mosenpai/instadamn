package X;

import android.view.Choreographer;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.PriorityQueue;

/* renamed from: X.So7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ChoreographerFrameCallbackC63493So7 implements Choreographer.FrameCallback {
    public InterfaceC65656Tqi A00;
    public final /* synthetic */ T08 A01;

    public ChoreographerFrameCallbackC63493So7(T08 t08) {
        this.A01 = t08;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        SHU shu;
        T08 t08 = this.A01;
        if (t08.A0D.get() && !t08.A0E.get()) {
            return;
        }
        long j2 = j / 1000000;
        synchronized (t08.A0B) {
            while (true) {
                PriorityQueue priorityQueue = t08.A0C;
                if (!priorityQueue.isEmpty()) {
                    Object peek = priorityQueue.peek();
                    C14360o3.A0A(peek);
                    if (((SHU) peek).A00 >= j2 || (shu = (SHU) priorityQueue.poll()) == null) {
                        break;
                    }
                    InterfaceC65656Tqi interfaceC65656Tqi = this.A00;
                    if (interfaceC65656Tqi == null) {
                        interfaceC65656Tqi = new WritableNativeArray();
                        this.A00 = interfaceC65656Tqi;
                    }
                    int i = shu.A02;
                    interfaceC65656Tqi.pushInt(i);
                    if (shu.A03) {
                        shu.A00 = shu.A01 + j2;
                        priorityQueue.add(shu);
                    } else {
                        t08.A04.remove(i);
                    }
                } else {
                    break;
                }
            }
        }
        InterfaceC65656Tqi interfaceC65656Tqi2 = this.A00;
        if (interfaceC65656Tqi2 != null) {
            t08.A09.callTimers(interfaceC65656Tqi2);
            this.A00 = null;
        }
        t08.A08.A02(this, EnumC61159RgK.A07);
    }
}
