package X;

import android.media.AudioRecord;
import android.os.Handler;

/* loaded from: classes4.dex */
public final class Ax7 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AM5 A01;
    public final /* synthetic */ InterfaceC176157sY A02;

    public Ax7(Handler handler, AM5 am5, InterfaceC176157sY interfaceC176157sY) {
        this.A01 = am5;
        this.A02 = interfaceC176157sY;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AM5 am5 = this.A01;
        InterfaceC176157sY interfaceC176157sY = this.A02;
        Handler handler = this.A00;
        synchronized (am5) {
            C175927s7 c175927s7 = am5.A09;
            c175927s7.A01("sAR");
            am5.A0F = C05F.A00;
            AudioRecord audioRecord = am5.A02;
            if (audioRecord != null) {
                audioRecord.release();
            }
            am5.A02 = null;
            c175927s7.A01("sARs");
            AD8.A01(interfaceC176157sY, handler);
        }
    }
}
