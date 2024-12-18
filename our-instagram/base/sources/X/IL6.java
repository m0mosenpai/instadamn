package X;

import com.instagram.api.schemas.ContextualAdResponseExtrasImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class IL6 {
    public final Map A00 = AbstractC166987dD.A1I();

    /* JADX WARN: Type inference failed for: r0v24, types: [X.IL5, java.lang.Object] */
    public final HBC A00(C38321qM c38321qM, int i) {
        String BVL;
        Map map = this.A00;
        if (!map.containsKey(c38321qM.getId())) {
            String id = c38321qM.getId();
            if (id != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator<E> it = c38321qM.A1E().iterator();
                while (it.hasNext()) {
                    C38321qM A0i = AbstractC31172DnG.A0i(it);
                    ?? obj = new Object();
                    C14360o3.A0B(A0i, 0);
                    obj.A00 = A0i;
                    A1E.add(obj);
                }
                HBC hbc = new HBC();
                hbc.A0B = A1E;
                String str = null;
                C38011pl A00 = AbstractC42331xN.A00(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i), C16930sl.A00);
                C14360o3.A0B(A00, 0);
                hbc.A06 = A00;
                JMJ BVD = c38321qM.A0C.BVD();
                H4K h4k = null;
                if (BVD != null && (BVL = BVD.BVL()) != null) {
                    JMJ BVD2 = c38321qM.A0C.BVD();
                    if (BVD2 != null) {
                        str = BVD2.BVH();
                    }
                    if (str == null) {
                        str = "";
                    }
                    hbc.A01 = new ContextualAdResponseExtrasImpl(BVL, "", str, "");
                    JMJ BVD3 = c38321qM.A0C.BVD();
                    if (BVD3 != null) {
                        int BVI = BVD3.BVI();
                        if (Integer.valueOf(BVI) != null) {
                            hbc.A00 = BVI;
                            JMJ BVD4 = c38321qM.A0C.BVD();
                            if (BVD4 != null) {
                                h4k = BVD4.Ewv();
                            }
                            hbc.A03 = h4k;
                            hbc.A08 = c38321qM.A0N;
                            hbc.A05 = c38321qM;
                            map.put(id, hbc);
                        }
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        Object obj2 = map.get(c38321qM.getId());
        if (obj2 != null) {
            return (HBC) obj2;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
