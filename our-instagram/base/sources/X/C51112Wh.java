package X;

import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.2Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51112Wh implements InterfaceC51122Wi {
    public static final C79153gM A03 = new Object();
    public final Map A02 = new HashMap();
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    @Override // X.InterfaceC51122Wi
    public final void DyX(C2XI c2xi) {
        C2XI[] c2xiArr;
        java.util.Set set = (java.util.Set) this.A02.get(c2xi);
        if (set != null) {
            for (Pair pair : (Pair[]) set.toArray(new Pair[0])) {
                AbstractC50812Vc abstractC50812Vc = (AbstractC50812Vc) pair.first;
                SparseArray sparseArray = (SparseArray) pair.second;
                Object obj = this.A01.get(abstractC50812Vc);
                if (obj != null) {
                    if (sparseArray != null && sparseArray.size() != 0 && (obj instanceof View)) {
                        int size = sparseArray.size();
                        for (int i = 0; i < size; i++) {
                            if (sparseArray.valueAt(i) == c2xi) {
                                C79153gM.A00((View) obj, c2xi, sparseArray.keyAt(i));
                            }
                        }
                    }
                    C14360o3.A0A(abstractC50812Vc);
                    if (abstractC50812Vc instanceof AbstractC50792Va) {
                        c2xiArr = ((AbstractC50792Va) abstractC50812Vc).A1A();
                    } else {
                        c2xiArr = new C2XI[0];
                    }
                    int length = c2xiArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (c2xi == c2xiArr[i2]) {
                            ((AbstractC50792Va) abstractC50812Vc).A0i(i2, c2xi.A00, obj);
                        }
                    }
                }
            }
        }
    }

    public static final void A00(Pair pair, C51112Wh c51112Wh, C2XI c2xi) {
        if (c2xi != null) {
            Map map = c51112Wh.A02;
            java.util.Set set = (java.util.Set) map.get(c2xi);
            if (set == null) {
                set = new HashSet();
                map.put(c2xi, set);
                c2xi.A01.add(c51112Wh);
            }
            set.add(pair);
        }
    }
}
