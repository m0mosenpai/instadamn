package X;

import android.os.Message;
import java.util.List;

/* renamed from: X.4Wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96834Wt {
    public Message A00;
    public C96764Wl A01;

    public static void A00(C96834Wt c96834Wt) {
        c96834Wt.A00 = null;
        c96834Wt.A01 = null;
        List list = C96764Wl.A01;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(c96834Wt);
            }
        }
    }

    public final void A01() {
        Message message = this.A00;
        message.getClass();
        message.sendToTarget();
        A00(this);
    }
}
