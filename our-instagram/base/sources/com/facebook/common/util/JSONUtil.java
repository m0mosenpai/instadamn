package com.facebook.common.util;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC37303Gc4;
import X.AbstractC911344p;
import X.AnonymousClass550;
import X.C1122354v;
import X.C1122554x;
import X.C1122654z;
import X.C54s;
import X.C55B;
import X.C60597RBo;
import X.C60598RBp;
import X.C60599RBq;
import X.C60600RBr;
import X.C60601RBs;
import X.C60602RBt;
import X.C60603RBu;
import X.C913045j;
import X.MSW;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class JSONUtil {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.55B] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.55B] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.44p] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.54s] */
    public static AbstractC911344p A00(Object obj) {
        ?? c55b;
        if (obj == null) {
            return C60603RBu.A00;
        }
        if (obj instanceof CharSequence) {
            return new C1122354v(obj.toString());
        }
        if (obj instanceof Boolean) {
            if (AbstractC166987dD.A1a(obj)) {
                return AnonymousClass550.A02;
            }
            return AnonymousClass550.A01;
        }
        if (obj instanceof Float) {
            return new C60598RBp(AbstractC166987dD.A09(obj));
        }
        if (obj instanceof Double) {
            return new C60597RBo(MSW.A00(obj));
        }
        if (obj instanceof Short) {
            return new C60599RBq(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return C1122554x.A00(AbstractC166987dD.A0H(obj));
        }
        if (obj instanceof Long) {
            return new C1122654z(AbstractC166987dD.A0N(obj));
        }
        if (obj instanceof BigDecimal) {
            return new C60601RBs((BigDecimal) obj);
        }
        if (obj instanceof BigInteger) {
            return new C60600RBr((BigInteger) obj);
        }
        if (obj instanceof Map) {
            c55b = new C54s(C913045j.A00);
            Iterator A15 = AbstractC166997dE.A15((Map) obj);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                c55b.A0C(A00(A1K.getValue()), A1K.getKey().toString());
            }
        } else if (obj instanceof Iterable) {
            c55b = new C55B(C913045j.A00);
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                c55b.A0C(A00(it.next()));
            }
        } else if (obj instanceof Object[]) {
            c55b = new C55B(C913045j.A00);
            for (Object obj2 : (Object[]) obj) {
                c55b.A0C(A00(obj2));
            }
        } else {
            Class<?> cls = obj.getClass();
            if (cls.getAnnotation(JsonSerialize.class) != null) {
                return new C60602RBt(obj);
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Can't convert to json: ");
            A1C.append(obj);
            throw AbstractC37303Gc4.A0M(cls, ", of type: ", A1C);
        }
        return c55b;
    }
}
