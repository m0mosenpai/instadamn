package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.PQd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56987PQd implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;

    public RunnableC56987PQd(Intent intent, Context context) {
        this.A01 = intent;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = this.A01;
        C12260kU.A00.A07().A0D(this.A00, intent);
    }
}
