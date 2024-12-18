package X;

import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.POb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56934POb implements Runnable {
    public final /* synthetic */ C56805PIw A00;

    public RunnableC56934POb(C56805PIw c56805PIw) {
        this.A00 = c56805PIw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56805PIw c56805PIw = this.A00;
        if (c56805PIw.A0G) {
            C25531Mh A03 = C56805PIw.A03(c56805PIw, C05F.A0j);
            A03.A0Q("mqtt_connection_status", Long.valueOf(AbstractC37302Gc3.A03(RealtimeClientManager.getInstance(c56805PIw.A0P).isMqttConnected() ? 1 : 0)));
            long j = c56805PIw.A05 + 1;
            c56805PIw.A05 = j;
            A03.A0Q("update_counter", Long.valueOf(j));
            A03.Cht();
            if (c56805PIw.A0b.get() > 0 && !c56805PIw.A0H) {
                c56805PIw.A0H = true;
            }
        }
        c56805PIw.A0L.postDelayed(this, 10000L);
    }
}
