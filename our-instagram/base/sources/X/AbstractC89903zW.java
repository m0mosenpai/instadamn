package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3zW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC89903zW {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(C76223bS c76223bS, AbstractC51432Xq abstractC51432Xq) {
        if (abstractC51432Xq != null) {
            C78303ew c78303ew = c76223bS.A03;
            C78303ew c78303ew2 = c78303ew;
            if (c78303ew == null) {
                c78303ew2 = new Object();
            }
            AbstractC89913zX.A02(abstractC51432Xq, c76223bS.A05.A08());
            List list = c78303ew2.A02;
            if (list == null) {
                list = new ArrayList();
                c78303ew2.A02 = list;
            }
            AbstractC89913zX.A03(abstractC51432Xq, list);
            c76223bS.A03 = c78303ew2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(C76223bS c76223bS, InterfaceC16660sJ interfaceC16660sJ, Object[] objArr) {
        int i;
        C78303ew c78303ew = c76223bS.A03;
        C78303ew c78303ew2 = c78303ew;
        if (c78303ew == null) {
            c78303ew2 = new Object();
        }
        String A08 = c76223bS.A05.A08();
        List list = c78303ew2.A01;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C28000CVx c28000CVx = new C28000CVx(new CVI(A08, i), interfaceC16660sJ, objArr);
        C76133bI c76133bI = c76223bS.A02;
        if (c76133bI != null) {
            C75803al c75803al = c76133bI.A00;
            C27862CPz c27862CPz = (C27862CPz) c75803al.A03.A01.get(c28000CVx.A01);
            List list2 = c78303ew2.A01;
            if (list2 == null) {
                list2 = new ArrayList();
                c78303ew2.A01 = list2;
            }
            list2.add(c28000CVx);
            AbstractC51432Xq A00 = c28000CVx.A00(c27862CPz);
            if (A00 != null) {
                List list3 = c78303ew2.A00;
                if (list3 == null) {
                    list3 = new ArrayList();
                    c78303ew2.A00 = list3;
                }
                list3.add(A00);
            }
            c76223bS.A03 = c78303ew2;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
