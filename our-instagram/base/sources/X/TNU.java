package X;

import android.content.Intent;

/* loaded from: classes10.dex */
public final class TNU implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C1T6 A01;

    public TNU(Intent intent, C1T6 c1t6) {
        this.A01 = c1t6;
        this.A00 = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0b3.A00().A06().A0C(this.A01.A00, this.A00);
    }
}
