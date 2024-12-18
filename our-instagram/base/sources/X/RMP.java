package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RMP extends AbstractC64527TId {
    public final int A00;
    public final RM0 A01;

    public final int hashCode() {
        return AbstractC37301Gc2.A02(5, this.A01);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        AbstractC64527TId abstractC64527TId = (AbstractC64527TId) obj;
        int A02 = abstractC64527TId.A02();
        int i = 5;
        if (5 == A02) {
            RM0 rm0 = this.A01;
            int size = rm0.size();
            RM0 rm02 = ((RMP) abstractC64527TId).A01;
            if (size != rm02.size()) {
                i = rm0.size();
                A02 = rm02.size();
            } else {
                TSQ A06 = rm0.entrySet().A06();
                TSQ A062 = rm02.entrySet().A06();
                do {
                    if (!A06.hasNext() && !A062.hasNext()) {
                        return 0;
                    }
                    Map.Entry A1K = AbstractC166987dD.A1K(A06);
                    Map.Entry A1K2 = AbstractC166987dD.A1K(A062);
                    int compareTo2 = ((AbstractC64527TId) A1K.getKey()).compareTo(A1K2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((AbstractC64527TId) A1K.getValue()).compareTo(A1K2.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
        }
        return i - A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((RMP) obj).A01);
    }

    public final String toString() {
        RM0 rm0 = this.A01;
        if (rm0.isEmpty()) {
            return "{}";
        }
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TSQ A06 = rm0.entrySet().A06();
        while (A06.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A06);
            A1I.put(A1K.getKey().toString().replace("\n", "\n  "), A1K.getValue().toString().replace("\n", "\n  "));
        }
        StringBuilder A0s = AbstractC58318PtA.A0s("{\n  ");
        Iterator A14 = AbstractC166997dE.A14(A1I);
        try {
            if (A14.hasNext()) {
                Map.Entry A1K2 = AbstractC166987dD.A1K(A14);
                Object key = A1K2.getKey();
                A0s.append(AbstractC58323PtF.A0f(key, key));
                while (true) {
                    A0s.append((CharSequence) " : ");
                    Object value = A1K2.getValue();
                    A0s.append(AbstractC58323PtF.A0f(value, value));
                    if (!A14.hasNext()) {
                        break;
                    }
                    A0s.append((CharSequence) ",\n  ");
                    A1K2 = AbstractC166987dD.A1K(A14);
                    Object key2 = A1K2.getKey();
                    A0s.append(AbstractC58323PtF.A0f(key2, key2));
                }
            }
            return AbstractC166997dE.A0x("\n}", A0s);
        } catch (IOException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    public RMP(RM0 rm0) {
        rm0.getClass();
        this.A01 = rm0;
        TSQ A06 = rm0.entrySet().A06();
        int i = 0;
        while (A06.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A06);
            int A03 = ((AbstractC64527TId) A1K.getKey()).A03();
            i = i < A03 ? A03 : i;
            int A032 = ((AbstractC64527TId) A1K.getValue()).A03();
            if (i < A032) {
                i = A032;
            }
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (i2 <= 8) {
        } else {
            throw new IOException("Exceeded cutoff limit for max depth of cbor value");
        }
    }
}
