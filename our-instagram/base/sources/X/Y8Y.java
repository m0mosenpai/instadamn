package X;

import android.os.Handler;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y8Y implements YM5 {
    public static final List A01 = AbstractC25225BEi.A17(50);
    public final Handler A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static Y3Q A00() {
        Y3Q y3q;
        List list = A01;
        synchronized (list) {
            if (list.isEmpty()) {
                y3q = new Object();
            } else {
                y3q = (Y3Q) list.remove(AbstractC25226BEj.A05(list));
            }
        }
        return y3q;
    }

    public Y8Y(Handler handler) {
        this.A00 = handler;
    }
}
