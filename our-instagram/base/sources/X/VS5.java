package X;

import java.util.List;

/* loaded from: classes11.dex */
public abstract class VS5 {
    public static final C70666Wem A00(XLM xlm, String str) {
        List AYm;
        C14360o3.A0B(xlm, 0);
        if ((xlm instanceof XAG) && (AYm = ((XAG) xlm).AYm()) != null && !AYm.isEmpty()) {
            C69219Vjm c69219Vjm = null;
            C68729Vb8 BOy = ((XAH) xlm).BOy();
            String id = xlm.getId();
            if (xlm.CBa() == VEO.A06) {
                c69219Vjm = xlm.C37();
            }
            return new C70666Wem(null, BOy, c69219Vjm, id, str, AYm);
        }
        return null;
    }
}
