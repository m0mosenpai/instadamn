package X;

import android.os.Looper;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes11.dex */
public final class W4J {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final Looper A02 = Looper.myLooper();

    public static void A00(W4J w4j) {
        if (Looper.myLooper() == w4j.A02) {
        } else {
            throw new RuntimeException();
        }
    }

    public final Future A01(EnumC1125356h enumC1125356h, int i) {
        A00(this);
        Object obj = this.A00.get(enumC1125356h);
        obj.getClass();
        return (Future) ((SparseArray) obj).get(i);
    }
}
