package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pi3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57652Pi3 extends C0YY implements InterfaceC16660sJ {
    public static final C57652Pi3 A00 = new C57652Pi3();

    public C57652Pi3() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        List list;
        double d;
        List list2 = (List) obj;
        C14360o3.A0B(list2, 0);
        List A0a = AbstractC50523MSb.A0a(-1.0d);
        if ((!list2.isEmpty()) && list2.size() == 1) {
            int i = 0;
            HashMap hashMap = ((Example) MSZ.A0o(list2, list2.size())).A02;
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
            if (j > 0 && A002 != -1.0d && list.size() >= j) {
                List A0h = AbstractC001800i.A0h(list, 20);
                if (!(A0h instanceof Collection) || !A0h.isEmpty()) {
                    Iterator it = A0h.iterator();
                    while (it.hasNext()) {
                        if (MSY.A07(it) == 1 && (i = i + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                }
                if (i / A0h.size() >= A002) {
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
