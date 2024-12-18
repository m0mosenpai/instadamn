package X;

import android.os.SystemClock;

/* renamed from: X.Ats, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24535Ats implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C175947s9 A01;

    public RunnableC24535Ats(C175947s9 c175947s9, int i) {
        this.A01 = c175947s9;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C175947s9 c175947s9 = this.A01;
        InterfaceC25222BDw interfaceC25222BDw = c175947s9.A02;
        if (interfaceC25222BDw != null) {
            int i = this.A00;
            int i2 = -1;
            if (i != -3 && i != -2) {
                if (i != -1) {
                    if (i == 1) {
                        i2 = 6;
                    }
                } else {
                    i2 = 4;
                }
            } else {
                i2 = 5;
            }
            C175917s6 c175917s6 = c175947s9.A01;
            if (c175917s6 != null) {
                c175917s6.A03 = Integer.valueOf(i2);
                c175917s6.A01 = SystemClock.elapsedRealtime();
            }
            interfaceC25222BDw.onReceivedAudioMixingMode(i2);
        }
    }
}
