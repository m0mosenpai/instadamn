package X;

import com.instagram.common.session.UserSession;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public abstract class FBS {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.FaJ, java.lang.Object] */
    public static final C34933FaJ A00(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        if (!(abstractC12990ll instanceof UserSession)) {
            ?? obj = new Object();
            WeakHashMap weakHashMap = C34933FaJ.A01;
            if (weakHashMap.containsKey(abstractC12990ll) && weakHashMap.get(abstractC12990ll) != null) {
                C34933FaJ c34933FaJ = (C34933FaJ) weakHashMap.get(abstractC12990ll);
                if (c34933FaJ != null) {
                    return c34933FaJ;
                }
                return obj;
            }
            weakHashMap.put(abstractC12990ll, obj);
            return obj;
        }
        throw AbstractC31172DnG.A0u();
    }
}
