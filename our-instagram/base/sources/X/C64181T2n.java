package X;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.T2n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64181T2n implements TmN {
    public final int A00;
    public final AbstractC910944l A01;

    public static void A00(int i) {
        if (i == 1) {
        } else {
            throw AbstractC166987dD.A12(AnonymousClass001.A0c("Can not deserialize Singleton container from ", " entries", i));
        }
    }

    @Override // X.TmN
    public final Object AK2(Object obj) {
        if (obj == null) {
            return null;
        }
        switch (this.A00) {
            case 1:
                java.util.Set set = (java.util.Set) obj;
                A00(set.size());
                return Collections.singleton(set.iterator().next());
            case 2:
                List list = (List) obj;
                A00(list.size());
                return Collections.singletonList(AbstractC166987dD.A16(list));
            case 3:
                Map map = (Map) obj;
                A00(map.size());
                Map.Entry A1K = AbstractC166987dD.A1K(AbstractC166997dE.A15(map));
                return Collections.singletonMap(A1K.getKey(), A1K.getValue());
            case 4:
                return Collections.unmodifiableSet((java.util.Set) obj);
            case 5:
                return Collections.unmodifiableList((List) obj);
            case 6:
                return Collections.unmodifiableMap((Map) obj);
            case 7:
                return Collections.synchronizedSet((java.util.Set) obj);
            case 8:
                return Collections.synchronizedCollection((Collection) obj);
            case 9:
                return Collections.synchronizedList((List) obj);
            case 10:
                return Collections.synchronizedMap((Map) obj);
            default:
                return obj;
        }
    }

    public C64181T2n(AbstractC910944l abstractC910944l, int i) {
        this.A01 = abstractC910944l;
        this.A00 = i;
    }

    @Override // X.TmN
    public final AbstractC910944l BI9(C910844k c910844k) {
        return this.A01;
    }

    @Override // X.TmN
    public final AbstractC910944l BaK(C910844k c910844k) {
        return this.A01;
    }
}
