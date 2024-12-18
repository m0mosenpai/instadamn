package X;

import com.facebook.maps.ttrc.common.MapboxTTRC;

/* renamed from: X.Wpr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71202Wpr implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (MapboxTTRC.class) {
            InterfaceC72008XEw interfaceC72008XEw = MapboxTTRC.sTTRCTrace;
            if (interfaceC72008XEw != null) {
                interfaceC72008XEw.EoN("midgard_data_done");
            }
        }
    }
}
