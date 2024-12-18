package X;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class RrA {
    public static final C152406tQ A00(Bundle bundle, Bundle bundle2) {
        AbstractMap A1I;
        if (bundle == null) {
            if (bundle2 == null) {
                return new C152406tQ();
            }
            A1I = AbstractC166987dD.A1G();
            Iterator A14 = AbstractC58319PtB.A14(bundle2);
            while (A14.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A14);
                C14360o3.A05(A1B);
                A1I.put(A1B, bundle2.get(A1B));
            }
        } else {
            ClassLoader classLoader = C152406tQ.class.getClassLoader();
            C14360o3.A0A(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                A1I = AbstractC166987dD.A1I();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    AbstractC25225BEi.A1S(obj);
                    A1I.put(obj, parcelableArrayList2.get(i));
                }
            } else {
                throw AbstractC166987dD.A14("Invalid bundle passed as restored state");
            }
        }
        return new C152406tQ(A1I);
    }
}
