package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public abstract class YB7 implements YPa {
    public static volatile Context A02;
    public static final C72711Xlj A01 = new C72711Xlj(new Y9g());
    public static ThreadLocal A00 = new YKH();

    public static Context A00() {
        if (A02 == null) {
            int i = 0;
            while (A02 == null) {
                try {
                    Thread.sleep(1L);
                    i++;
                    if (i >= 5 && A02 == null) {
                        throw AbstractC166987dD.A14("Application is Null, was FbInjector.setApplication() called?");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return A02;
    }

    public static YB7 get(Context context) {
        Object ChF;
        C72711Xlj c72711Xlj = A01;
        WeakHashMap weakHashMap = c72711Xlj.A01;
        Reference reference = (Reference) weakHashMap.get(context);
        if (reference == null || (ChF = reference.get()) == null) {
            ChF = c72711Xlj.A00.ChF(context);
            synchronized (c72711Xlj) {
                weakHashMap.put(context, AbstractC25225BEi.A16(ChF));
            }
        }
        return (YB7) ChF;
    }
}
