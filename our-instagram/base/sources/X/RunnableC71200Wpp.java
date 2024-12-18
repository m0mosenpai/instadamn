package X;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.Wpp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71200Wpp implements Runnable {
    public Handler A00;
    public C02N A01;
    public Callable A02;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.A02.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.A00.post(new RunnableC71529Wve(this, this.A01, obj));
    }
}
