package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.WwJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71569WwJ implements Runnable {
    public final /* synthetic */ Handler.Callback A00;
    public final /* synthetic */ Message A01;
    public final /* synthetic */ C14510oO A02;

    public RunnableC71569WwJ(Handler.Callback callback, Message message, C14510oO c14510oO) {
        this.A02 = c14510oO;
        this.A00 = callback;
        this.A01 = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A00 = this.A00.handleMessage(this.A01);
    }
}
