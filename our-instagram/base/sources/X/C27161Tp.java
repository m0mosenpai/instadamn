package X;

import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;

/* renamed from: X.1Tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27161Tp {
    public static C27161Tp A02;
    public final Field A00;
    public final Field A01;

    static {
        Field field;
        Field field2;
        C27161Tp c27161Tp;
        try {
            field = MessageQueue.class.getDeclaredField("mMessages");
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            field = null;
        }
        try {
            field2 = Message.class.getDeclaredField("next");
            try {
                field2.setAccessible(true);
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            field2 = null;
        }
        if (field != null && field2 != null) {
            c27161Tp = new C27161Tp(field, field2);
        } else {
            c27161Tp = null;
        }
        A02 = c27161Tp;
    }

    public C27161Tp(Field field, Field field2) {
        this.A00 = field;
        this.A01 = field2;
    }
}
