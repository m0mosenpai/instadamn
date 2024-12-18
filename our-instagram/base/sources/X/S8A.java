package X;

import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;

/* loaded from: classes10.dex */
public abstract class S8A {
    public static final SF4 A00;

    static {
        Field field;
        Field field2;
        SF4 sf4 = null;
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
            sf4 = new SF4(field, field2);
        }
        A00 = sf4;
    }
}
