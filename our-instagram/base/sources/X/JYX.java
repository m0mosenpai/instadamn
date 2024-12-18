package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class JYX {
    public static final Map A00 = AbstractC166987dD.A1G();
    public static final C44103JeS A01 = new C44103JeS();

    public static final void A00(Resources resources, int i) {
        AbstractC58672mQ abstractC58672mQ;
        C14360o3.A0B(resources, 0);
        C44103JeS c44103JeS = A01;
        C14360o3.A0B(c44103JeS, 2);
        Drawable drawable = resources.getDrawable(i);
        if ((drawable instanceof AbstractC58672mQ) && (abstractC58672mQ = (AbstractC58672mQ) drawable) != null && abstractC58672mQ.A00.A02.A08 == null) {
            Map map = A00;
            synchronized (map) {
                map.put(abstractC58672mQ, c44103JeS);
            }
            abstractC58672mQ.A02();
        }
    }
}
