package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;

/* renamed from: X.3wM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractHandlerC88143wM extends Handler implements Runnable {
    public Message A00;
    public Message A01;
    public boolean A02;
    public final InterfaceC88013w9 A03;
    public final C88053wD A04;

    public abstract void A03();

    public final Message A01(MessageQueue messageQueue) {
        Message message;
        try {
            this.A03.Ena();
            message = (Message) this.A04.A02.invoke(messageQueue, new Object[0]);
        } catch (Throwable unused) {
            message = null;
        }
        this.A03.AVj();
        return message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Message message = this.A01;
        if (message != null) {
            this.A03.AVg(message);
            this.A01 = null;
        }
        A03();
        this.A00 = null;
    }

    public AbstractHandlerC88143wM(Looper looper, InterfaceC88013w9 interfaceC88013w9, C88053wD c88053wD) {
        super(looper);
        this.A02 = false;
        this.A04 = c88053wD;
        this.A03 = interfaceC88013w9;
        Looper.getMainLooper();
    }

    public final void A02(Message message) {
        Handler target = message.getTarget();
        if (target != null) {
            try {
                InterfaceC88013w9 interfaceC88013w9 = this.A03;
                interfaceC88013w9.EnF(message);
                target.dispatchMessage(message);
                interfaceC88013w9.AVg(message);
            } catch (Throwable th) {
                this.A03.AVg(message);
                throw th;
            }
        }
    }
}
