package androidx.window.layout.adapter.extensions;

import X.C02N;
import X.C14360o3;
import X.C4PX;
import X.C70101W3r;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes11.dex */
public final class MulticastConsumer implements C02N, Consumer {
    public C4PX A00;
    public final Context A03;
    public final ReentrantLock A02 = new ReentrantLock();
    public final Set A01 = new LinkedHashSet();

    @Override // X.C02N
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        C14360o3.A0B(windowLayoutInfo, 0);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            C4PX A00 = C70101W3r.A00.A00(this.A03, windowLayoutInfo);
            this.A00 = A00;
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                ((C02N) it.next()).accept(A00);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A00(C02N c02n) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            C4PX c4px = this.A00;
            if (c4px != null) {
                c02n.accept(c4px);
            }
            this.A01.add(c02n);
        } finally {
            reentrantLock.unlock();
        }
    }

    public MulticastConsumer(Context context) {
        this.A03 = context;
    }
}
