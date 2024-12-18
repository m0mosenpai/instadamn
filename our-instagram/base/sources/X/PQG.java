package X;

import android.content.Intent;

/* loaded from: classes9.dex */
public final class PQG implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C47705L4m A01;

    public PQG(Intent intent, C47705L4m c47705L4m) {
        this.A01 = c47705L4m;
        this.A00 = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((C54839OLy) this.A01.A04.getValue()).A00(this.A00);
    }
}
