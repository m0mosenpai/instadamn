package X;

import com.instagram.location.impl.LocationPluginImpl;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.5vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC130965vk implements Runnable {
    public final /* synthetic */ AbstractC128665rZ A00;
    public final /* synthetic */ LocationPluginImpl A01;
    public final /* synthetic */ WeakReference A02;

    public RunnableC130965vk(AbstractC128665rZ abstractC128665rZ, LocationPluginImpl locationPluginImpl, WeakReference weakReference) {
        this.A01 = locationPluginImpl;
        this.A02 = weakReference;
        this.A00 = abstractC128665rZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C218914p c218914p = C218914p.A08;
        C218914p.A0C.add(new AbstractRunnableC14200nk() { // from class: X.5iC
            {
                super(280);
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC130965vk runnableC130965vk = RunnableC130965vk.this;
                LocationPluginImpl locationPluginImpl = runnableC130965vk.A01;
                synchronized (locationPluginImpl.A02) {
                    InterfaceC127465pP interfaceC127465pP = (InterfaceC127465pP) runnableC130965vk.A02.get();
                    if (interfaceC127465pP != null) {
                        Map map = locationPluginImpl.A03;
                        if (map.containsKey(interfaceC127465pP)) {
                            runnableC130965vk.A00.A06();
                            map.remove(interfaceC127465pP);
                            LocationPluginImpl.A06(locationPluginImpl);
                        }
                    }
                }
            }
        });
    }
}
