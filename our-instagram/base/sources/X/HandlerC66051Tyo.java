package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.Thread;

/* renamed from: X.Tyo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class HandlerC66051Tyo extends Handler {
    public final Thread.UncaughtExceptionHandler A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC66051Tyo(Handler.Callback callback, Looper looper, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(looper, callback);
        C14360o3.A0B(looper, 1);
        this.A00 = uncaughtExceptionHandler;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        C14360o3.A0B(message, 0);
        try {
            super.dispatchMessage(message);
        } catch (Exception e) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A00;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), e);
            }
        }
    }
}
