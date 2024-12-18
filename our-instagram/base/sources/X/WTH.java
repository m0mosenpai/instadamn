package X;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes11.dex */
public final class WTH implements InterfaceC94694Nw {
    public final C94664Nt A00;
    public final WindowLayoutComponent A01;
    public final ReentrantLock A05 = new ReentrantLock();
    public final Map A03 = new LinkedHashMap();
    public final Map A04 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();

    @Override // X.InterfaceC94694Nw
    public final void EDM(Context context, C02N c02n, Executor executor) {
        C14360o3.A0B(context, 0);
        ReentrantLock reentrantLock = this.A05;
        reentrantLock.lock();
        try {
            Map map = this.A03;
            MulticastConsumer multicastConsumer = (MulticastConsumer) map.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.A00(c02n);
                this.A04.put(c02n, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                map.put(context, multicastConsumer2);
                this.A04.put(c02n, context);
                multicastConsumer2.A00(c02n);
                if (context instanceof Activity) {
                    C94664Nt c94664Nt = this.A00;
                    WindowLayoutComponent windowLayoutComponent = this.A01;
                    C0YZ c0yz = new C0YZ(WindowLayoutInfo.class);
                    Activity activity = (Activity) context;
                    C71767X2n c71767X2n = new C71767X2n(multicastConsumer2);
                    C14360o3.A0B(activity, 4);
                    C64737TRv c64737TRv = new C64737TRv(c71767X2n, c0yz);
                    ClassLoader classLoader = c94664Nt.A00;
                    String A00 = AbstractC111324zv.A00(2646);
                    Class<?> loadClass = classLoader.loadClass(A00);
                    C14360o3.A07(loadClass);
                    Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, c64737TRv);
                    C14360o3.A07(newProxyInstance);
                    Class<?> cls = windowLayoutComponent.getClass();
                    Class<?> loadClass2 = classLoader.loadClass(A00);
                    C14360o3.A07(loadClass2);
                    cls.getMethod("addWindowLayoutInfoListener", Activity.class, loadClass2).invoke(windowLayoutComponent, activity, newProxyInstance);
                    Class<?> loadClass3 = classLoader.loadClass(A00);
                    C14360o3.A07(loadClass3);
                    this.A02.put(multicastConsumer2, new WTD(windowLayoutComponent, newProxyInstance, cls.getMethod("removeWindowLayoutInfoListener", loadClass3)));
                } else {
                    multicastConsumer2.accept(new WindowLayoutInfo(C16930sl.A00));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.InterfaceC94694Nw
    public final void F9Z(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        ReentrantLock reentrantLock = this.A05;
        reentrantLock.lock();
        try {
            Map map = this.A04;
            Context context = (Context) map.get(c02n);
            if (context != null) {
                Map map2 = this.A03;
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
                            X7C x7c = (X7C) this.A02.remove(multicastConsumer);
                            if (x7c != null) {
                                WTD wtd = (WTD) x7c;
                                wtd.A02.invoke(wtd.A01, wtd.A00);
                            }
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

    public WTH(C94664Nt c94664Nt, WindowLayoutComponent windowLayoutComponent) {
        this.A01 = windowLayoutComponent;
        this.A00 = c94664Nt;
    }
}
