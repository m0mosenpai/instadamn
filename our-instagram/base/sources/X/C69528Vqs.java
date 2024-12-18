package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vqs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69528Vqs {
    public List A00;

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, X.US9] */
    public final List A00(Map map) {
        C14360o3.A0B(map, 0);
        List list = this.A00;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                } else {
                    US9 us9 = (US9) obj;
                    String str = (String) AbstractC166997dE.A0m(map, i);
                    US9 us92 = us9;
                    if (str == null) {
                        if (us9 == null) {
                            i = i2;
                        }
                        arrayList.add(us92);
                        i = i2;
                    } else if (AbstractC001900j.A0T(str)) {
                        i = i2;
                    } else {
                        float f = us9.A00;
                        int i3 = us9.A04;
                        int i4 = us9.A02;
                        boolean z = us9.A07;
                        int i5 = us9.A03;
                        float f2 = us9.A01;
                        String str2 = us9.A05;
                        C14360o3.A0B(str2, 7);
                        ?? obj2 = new Object();
                        obj2.A06 = str;
                        obj2.A00 = f;
                        obj2.A04 = i3;
                        obj2.A02 = i4;
                        obj2.A07 = z;
                        obj2.A03 = i5;
                        obj2.A01 = f2;
                        obj2.A05 = str2;
                        us92 = obj2;
                        arrayList.add(us92);
                        i = i2;
                    }
                }
            }
            return arrayList;
        }
        C14360o3.A0F("tokens");
        throw C00O.createAndThrow();
    }
}
