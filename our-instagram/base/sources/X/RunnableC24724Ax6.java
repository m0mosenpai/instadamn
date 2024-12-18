package X;

import android.os.Handler;

/* renamed from: X.Ax6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24724Ax6 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AM5 A01;
    public final /* synthetic */ InterfaceC176157sY A02;

    public RunnableC24724Ax6(Handler handler, AM5 am5, InterfaceC176157sY interfaceC176157sY) {
        this.A01 = am5;
        this.A02 = interfaceC176157sY;
        this.A00 = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C212399b8 c212399b8;
        AM5 am5 = this.A01;
        InterfaceC176157sY interfaceC176157sY = this.A02;
        Handler handler = this.A00;
        synchronized (am5) {
            if (am5.A0F != C05F.A01) {
                c212399b8 = new C212399b8("prepare() must be called before starting audio recording.");
            } else {
                try {
                    C175927s7 c175927s7 = am5.A09;
                    c175927s7.A01("stAR");
                    am5.A03 = false;
                    am5.A02.startRecording();
                    c175927s7.A01("stARs");
                    am5.A0F = C05F.A0C;
                    if (!am5.A0D) {
                        if (am5.A0C) {
                            am5.A06.post(am5.A0A);
                        } else {
                            am5.A06.post(am5.A0B);
                        }
                    }
                    AD8.A01(interfaceC176157sY, handler);
                } catch (Exception e) {
                    am5.A09.A01("stARe");
                    c212399b8 = new AbstractC223559ty(22002, e);
                }
            }
            AM5.A02(c212399b8, am5);
            AD8.A00(handler, c212399b8, interfaceC176157sY);
        }
    }
}
