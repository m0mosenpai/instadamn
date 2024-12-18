package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50962Vs extends C2V9 {
    public final List A00;

    public C50962Vs(C2V9 c2v9, C2V9 c2v92) {
        super(new C2VE(null, null), -1);
        this.A00 = AbstractC16960so.A1M(c2v9, c2v92);
    }

    @Override // X.C2V9
    /* renamed from: A01 */
    public final boolean CTz(C2V9 c2v9) {
        C50962Vs c50962Vs;
        if (this != c2v9) {
            if (c2v9 != null && C14360o3.A0K(c2v9.getClass(), getClass())) {
                List list = null;
                if ((c2v9 instanceof C50962Vs) && (c50962Vs = (C50962Vs) c2v9) != null) {
                    list = c50962Vs.A00;
                }
                int size = this.A00.size();
                if (list != null && size == list.size()) {
                    Iterable A0C = C17s.A0C(0, size);
                    if (!(A0C instanceof Collection) || !((Collection) A0C).isEmpty()) {
                        Iterator it = A0C.iterator();
                        while (it.hasNext()) {
                            int A00 = ((AbstractC16880sg) it).A00();
                            if (!((C2V9) r4.get(A00)).CTz((C2V9) list.get(A00))) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C2V9
    public final Object A00(Object obj) {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C2V9) list.get(i)).A00(obj);
        }
        return null;
    }
}
