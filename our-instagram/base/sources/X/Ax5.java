package X;

import android.media.AudioRecord;
import android.os.Handler;

/* loaded from: classes4.dex */
public final class Ax5 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AM5 A01;
    public final /* synthetic */ InterfaceC176157sY A02;

    public Ax5(Handler handler, AM5 am5, InterfaceC176157sY interfaceC176157sY) {
        this.A01 = am5;
        this.A02 = interfaceC176157sY;
        this.A00 = handler;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.9b8, X.9ty] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.9b8, X.9ty] */
    @Override // java.lang.Runnable
    public final void run() {
        AM5 am5 = this.A01;
        InterfaceC176157sY interfaceC176157sY = this.A02;
        Handler handler = this.A00;
        if (am5.A0F != C05F.A00) {
            ?? abstractC223559ty = new AbstractC223559ty(22002, "Must only call prepare() on a stopped AudioRecorder.");
            AM5.A02(abstractC223559ty, am5);
            AD8.A00(handler, abstractC223559ty, interfaceC176157sY);
            return;
        }
        try {
            C175927s7 c175927s7 = am5.A09;
            c175927s7.A01("pAR");
            int i = am5.A04;
            C177547uo c177547uo = am5.A08;
            AudioRecord audioRecord = new AudioRecord(i, c177547uo.A04, c177547uo.A01, c177547uo.A02, am5.A01);
            am5.A02 = audioRecord;
            if (audioRecord.getState() != 0) {
                c175927s7.A01("pARs");
                am5.A0F = C05F.A01;
                AD8.A01(interfaceC176157sY, handler);
                return;
            }
            throw AbstractC166987dD.A14("Could not prepare audio recording");
        } catch (Exception e) {
            am5.A09.A01("pARe");
            ?? abstractC223559ty2 = new AbstractC223559ty(22002, e);
            AM5.A02(abstractC223559ty2, am5);
            AD8.A00(handler, abstractC223559ty2, interfaceC176157sY);
        }
    }
}
