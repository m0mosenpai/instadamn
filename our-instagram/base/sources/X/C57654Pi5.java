package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pi5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57654Pi5 extends C0YY implements InterfaceC16660sJ {
    public static final C57654Pi5 A00 = new C57654Pi5();

    public C57654Pi5() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        List list;
        List list2;
        int i;
        double d;
        List list3 = (List) obj;
        C14360o3.A0B(list3, 0);
        List A0a = AbstractC50523MSb.A0a(-1.0d);
        if ((!list3.isEmpty()) && list3.size() == 1) {
            int i2 = 0;
            HashMap hashMap = ((Example) MSZ.A0o(list3, list3.size())).A02;
            FeatureData A0K = MSW.A0K("111", hashMap);
            if (A0K != null) {
                j = A0K.A01;
            } else {
                j = 0;
            }
            double A002 = AbstractC50524MSc.A00(hashMap);
            FeatureData A0K2 = MSW.A0K("444", hashMap);
            if (A0K2 == null || (list = A0K2.A07) == null) {
                list = C16930sl.A00;
            }
            FeatureData A0K3 = MSW.A0K("555", hashMap);
            if (A0K3 == null || (list2 = A0K3.A07) == null) {
                list2 = C16930sl.A00;
            }
            if (j > 0 && A002 != -1.0d && AbstractC31172DnG.A02(list2, list.size()) >= j) {
                List A0h = AbstractC001800i.A0h(list, 20);
                List A0h2 = AbstractC001800i.A0h(list2, 20);
                if ((A0h instanceof Collection) && A0h.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = A0h.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (MSY.A07(it) == 1 && (i = i + 1) < 0) {
                            break;
                        }
                    }
                }
                if (!(A0h2 instanceof Collection) || !A0h2.isEmpty()) {
                    Iterator it2 = A0h2.iterator();
                    while (it2.hasNext()) {
                        if (MSY.A07(it2) == 1 && (i2 = i2 + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                }
                if ((i + i2) / AbstractC31172DnG.A02(A0h2, A0h.size()) >= A002) {
                    d = 1.0d;
                } else {
                    d = 0.0d;
                }
                A0a = AbstractC50523MSb.A0a(d);
            }
        }
        A0a.toString();
        return A0a;
    }
}
