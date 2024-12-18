package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.XpS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72863XpS {
    public HashMap A00 = AbstractC166987dD.A1G();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C72863XpS) {
            return this.A00.equals(((C72863XpS) obj).A00);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.Xf7] */
    public final YDO A00() {
        YDO ydo = new YDO();
        Iterator A14 = AbstractC166997dE.A14(this.A00);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            Object key = A1K.getKey();
            Object value = A1K.getValue();
            ?? obj = new Object();
            obj.A00 = key;
            obj.A01 = value;
            ydo.A00.add(obj);
        }
        return ydo;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
