package X;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes11.dex */
public final class WTG implements InterfaceC94694Nw {
    public final WindowLayoutComponent A00;
    public final ReentrantLock A03 = new ReentrantLock();
    public final Map A01 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();

    @Override // X.InterfaceC94694Nw
    public final void EDM(Context context, C02N c02n, Executor executor) {
        C14360o3.A0B(context, 0);
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Map map = this.A01;
            MulticastConsumer multicastConsumer = (MulticastConsumer) map.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.A00(c02n);
                this.A02.put(c02n, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                map.put(context, multicastConsumer2);
                this.A02.put(c02n, context);
                multicastConsumer2.A00(c02n);
                this.A00.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.InterfaceC94694Nw
    public final void F9Z(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Map map = this.A02;
            Context context = (Context) map.get(c02n);
            if (context != null) {
                Map map2 = this.A01;
                MulticastConsumer multicastConsumer = (MulticastConsumer) map2.get(context);
                if (multicastConsumer != null) {
                    ReentrantLock reentrantLock2 = multicastConsumer.A02;
                    reentrantLock2.lock();
                    try {
                        java.util.Set set = multicastConsumer.A01;
                        set.remove(c02n);
                        reentrantLock2.unlock();
                        map.remove(c02n);
                        if (set.isEmpty()) {
                            map2.remove(context);
                            this.A00.removeWindowLayoutInfoListener(multicastConsumer);
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public WTG(WindowLayoutComponent windowLayoutComponent) {
        this.A00 = windowLayoutComponent;
    }
}
