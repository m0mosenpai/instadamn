package X;

import android.os.Binder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.3wN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class HandlerC88153wN extends AbstractHandlerC88143wM {
    @Override // X.AbstractHandlerC88143wM
    public void A03() {
        MessageQueue myQueue = Looper.myQueue();
        while (true) {
            if (this instanceof C40T) {
                C40T c40t = (C40T) this;
                Message A01 = c40t.A01(myQueue);
                if (A01 != null) {
                    C1120153q c1120153q = c40t.A00;
                    Field field = c1120153q.A01;
                    Object obj = null;
                    if (field != null) {
                        try {
                            obj = field.get(A01);
                        } catch (Throwable unused) {
                        }
                    }
                    Method method = c1120153q.A02;
                    if (method != null && obj != null) {
                        try {
                            method.invoke(c1120153q.A00, A01, obj);
                        } catch (Throwable unused2) {
                        }
                    }
                    c40t.A02(A01);
                    Method method2 = c1120153q.A03;
                    if (method2 != null && obj != null) {
                        try {
                            method2.invoke(c1120153q.A00, A01, obj);
                        } catch (Throwable unused3) {
                        }
                    }
                    Binder.clearCallingIdentity();
                    try {
                        c40t.A04.A03.invoke(A01, new Object[0]);
                    } catch (Throwable unused4) {
                    }
                } else {
                    return;
                }
            } else {
                Message A012 = A01(myQueue);
                if (A012 != null) {
                    A02(A012);
                    Binder.clearCallingIdentity();
                    this.A04.A03.invoke(A012, new Object[0]);
                } else {
                    return;
                }
            }
        }
    }
}
