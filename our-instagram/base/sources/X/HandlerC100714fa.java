package X;

import android.os.Message;
import android.os.Process;
import java.lang.reflect.Method;

/* renamed from: X.4fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC100714fa extends HandlerC88153wN {
    public C1117652d A00;

    @Override // X.HandlerC88153wN, X.AbstractHandlerC88143wM
    public final void A03() {
        C1117652d c1117652d;
        Method method;
        Object obj;
        Message message = super.A00;
        if (message != null && (method = (c1117652d = this.A00).A02) != null && (obj = c1117652d.A00) != null) {
            try {
                method.invoke(obj, message, Integer.valueOf(Process.myPid()), true);
            } catch (Throwable unused) {
            }
        }
        super.A03();
    }
}
