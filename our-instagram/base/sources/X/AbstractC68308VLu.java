package X;

import java.util.List;

/* renamed from: X.VLu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68308VLu {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0O = AbstractC65702TsY.A0O(c6fw);
        String A00 = C6AN.A00(c6fw.A02());
        boolean A01 = C6DZ.A01(c6fw.A00());
        U4G u4g = (U4G) AnonymousClass634.A06(C103064kh.A00(c6fq, c6fw, 3), A0O);
        if (u4g != null) {
            if (AbstractC79383gk.A03()) {
                List list = u4g.A01.A03;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String A0D = ((U48) list.get(i)).A01.A0D();
                    if (A0D != null && A0D.equals(A00)) {
                        if (i >= 0) {
                            u4g.A01(i, A01);
                            return null;
                        }
                        return null;
                    }
                }
                return null;
            }
            throw new RuntimeException("setIndexById cannot be called from a background thread.");
        }
        return null;
    }
}
