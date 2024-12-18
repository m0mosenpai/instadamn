package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class U96 extends Handler {
    public final /* synthetic */ C69190VjJ A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ArrayList arrayList;
        C14360o3.A0B(message, 0);
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                C69190VjJ c69190VjJ = this.A00;
                C14360o3.A0C(message.obj, "null cannot be cast to non-null type com.facebook.crudolib.eventbus.EventSubscriber<T of com.facebook.crudolib.eventbus.EventDispatcher>");
                Looper looper = c69190VjJ.A02;
                if (looper != null) {
                    Looper myLooper = Looper.myLooper();
                    if (!C14360o3.A0K(myLooper, looper)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot dispatch event from looper thread ");
                        sb.append(myLooper);
                        throw AbstractC43594JPz.A0o(looper, "; expected ", sb);
                    }
                    return;
                }
                return;
            }
            throw AbstractC25230BEn.A0n(AbstractC111324zv.A00(1846), i);
        }
        C69190VjJ c69190VjJ2 = this.A00;
        Object obj = message.obj;
        C14360o3.A0C(obj, "null cannot be cast to non-null type T of com.facebook.crudolib.eventbus.EventDispatcher");
        C14360o3.A0B(obj, 0);
        Looper looper2 = c69190VjJ2.A02;
        if (looper2 != null) {
            Looper myLooper2 = Looper.myLooper();
            if (!C14360o3.A0K(myLooper2, looper2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot dispatch event from looper thread ");
                sb2.append(myLooper2);
                throw AbstractC43594JPz.A0o(looper2, "; expected ", sb2);
            }
        }
        synchronized (c69190VjJ2) {
            if (!c69190VjJ2.A01) {
                c69190VjJ2.A01 = true;
                arrayList = c69190VjJ2.A00;
            } else {
                throw new UnsupportedOperationException("Nested synchronous dispatching is not supported");
            }
        }
        try {
            if (0 < arrayList.size()) {
                arrayList.get(0);
                synchronized (c69190VjJ2) {
                }
                throw new NullPointerException("handleEvent");
            }
            synchronized (c69190VjJ2) {
                c69190VjJ2.A01 = false;
            }
        } catch (Throwable th) {
            synchronized (c69190VjJ2) {
                c69190VjJ2.A01 = false;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U96(Looper looper, C69190VjJ c69190VjJ) {
        super(looper);
        this.A00 = c69190VjJ;
    }
}
