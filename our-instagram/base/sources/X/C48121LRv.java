package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LRv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48121LRv implements InterfaceC50509MRm {
    public final Map A00;
    public volatile Map A01;

    @Override // X.InterfaceC50509MRm
    public final Map BDK() {
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    HashMap A1G = AbstractC166987dD.A1G();
                    Iterator A15 = AbstractC166997dE.A15(this.A00);
                    while (A15.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A15);
                        List list = (List) A1K.getValue();
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = ((L9K) list.get(i)).A00;
                            if (!TextUtils.isEmpty(str)) {
                                A1C.append(str);
                                if (i != AbstractC25226BEj.A05(list)) {
                                    A1C.append(',');
                                }
                            }
                        }
                        String obj = A1C.toString();
                        if (!TextUtils.isEmpty(obj)) {
                            A1G.put(A1K.getKey(), obj);
                        }
                    }
                    this.A01 = Collections.unmodifiableMap(A1G);
                }
            }
        }
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C48121LRv) {
            return this.A00.equals(((C48121LRv) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C48121LRv(Map map) {
        this.A00 = Collections.unmodifiableMap(map);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LazyHeaders{headers=");
        A1C.append(this.A00);
        return AbstractC167027dH.A0R(A1C);
    }
}
