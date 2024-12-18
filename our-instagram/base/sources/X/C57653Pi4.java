package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pi4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57653Pi4 extends C0YY implements InterfaceC16660sJ {
    public static final C57653Pi4 A00 = new C57653Pi4();

    public C57653Pi4() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        List list;
        double d;
        List list2 = (List) obj;
        C14360o3.A0B(list2, 0);
        List A0a = AbstractC50523MSb.A0a(-1.0d);
        if ((!list2.isEmpty()) && list2.size() == 1) {
            int i2 = 0;
            HashMap hashMap = ((Example) MSZ.A0o(list2, list2.size())).A02;
            FeatureData A0K = MSW.A0K("222", hashMap);
            if (A0K != null) {
                i = (int) A0K.A01;
            } else {
                i = 0;
            }
            double A002 = AbstractC50524MSc.A00(hashMap);
            FeatureData A0K2 = MSW.A0K("444", hashMap);
            if (A0K2 == null || (list = A0K2.A07) == null) {
                list = C16930sl.A00;
            }
            if (i > 0 && A002 != -1.0d && list.size() >= i) {
                List A0h = AbstractC001800i.A0h(list, i);
                if (!(A0h instanceof Collection) || !A0h.isEmpty()) {
                    Iterator it = A0h.iterator();
                    while (it.hasNext()) {
                        if (MSY.A07(it) == 1 && (i2 = i2 + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                }
                if (i2 / A0h.size() >= A002) {
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
