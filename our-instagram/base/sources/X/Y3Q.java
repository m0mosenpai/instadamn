package X;

import android.os.Message;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y3Q {
    public Message A00;
    public Y8Y A01;

    public static void A01(Y3Q y3q) {
        y3q.A00 = null;
        y3q.A01 = null;
        List list = Y8Y.A01;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(y3q);
            }
        }
    }

    public static void A00(Message message, Y3Q y3q, Y8Y y8y) {
        y3q.A00 = message;
        y3q.A01 = y8y;
        message.getClass();
        message.sendToTarget();
        A01(y3q);
    }
}
