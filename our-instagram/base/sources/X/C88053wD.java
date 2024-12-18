package X;

import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.3wD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88053wD {
    public static final C88053wD A04;
    public final Field A00;
    public final Field A01;
    public final Method A02;
    public final Method A03;

    public final int A01(MessageQueue messageQueue) {
        Message message;
        int i;
        synchronized (messageQueue) {
            try {
                message = (Message) this.A00.get(messageQueue);
            } catch (Throwable unused) {
                message = null;
            }
            i = 0;
            while (message != null) {
                try {
                    message = (Message) this.A01.get(message);
                } catch (Throwable unused2) {
                    message = null;
                }
                i++;
            }
        }
        return i;
    }

    static {
        Field field;
        Field field2;
        C88053wD c88053wD;
        Method method = null;
        try {
            method = MessageQueue.class.getDeclaredMethod("next", new Class[0]);
            method.setAccessible(true);
        } catch (Throwable unused) {
        }
        Method method2 = null;
        try {
            method2 = Message.class.getDeclaredMethod("recycleUnchecked", new Class[0]);
            method2.setAccessible(true);
        } catch (Throwable unused2) {
        }
        try {
            field = MessageQueue.class.getDeclaredField("mMessages");
            try {
                field.setAccessible(true);
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            field = null;
        }
        try {
            field2 = Message.class.getDeclaredField("next");
            try {
                field2.setAccessible(true);
            } catch (Throwable unused5) {
            }
        } catch (Throwable unused6) {
            field2 = null;
        }
        if (method != null && method2 != null && field != null && field2 != null) {
            c88053wD = new C88053wD(field, field2, method, method2);
        } else {
            c88053wD = null;
        }
        A04 = c88053wD;
    }

    public C88053wD(Field field, Field field2, Method method, Method method2) {
        this.A02 = method;
        this.A03 = method2;
        this.A00 = field;
        this.A01 = field2;
    }

    public final int A00(MessageQueue messageQueue) {
        Message message;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (messageQueue) {
            try {
                message = (Message) this.A00.get(messageQueue);
            } catch (Throwable unused) {
                message = null;
            }
            i = 0;
            while (message != null) {
                if (message.getWhen() > uptimeMillis) {
                    break;
                }
                try {
                    message = (Message) this.A01.get(message);
                } catch (Throwable unused2) {
                    message = null;
                }
                i++;
            }
        }
        return i;
    }
}
