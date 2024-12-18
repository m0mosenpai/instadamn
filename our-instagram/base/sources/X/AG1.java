package X;

import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class AG1 {
    public static AG1 A01;
    public final LinkedList A00 = new LinkedList();

    public static synchronized AG1 A00() {
        AG1 ag1;
        synchronized (AG1.class) {
            ag1 = A01;
            if (ag1 == null) {
                ag1 = new AG1();
                A01 = ag1;
            }
        }
        return ag1;
    }
}
