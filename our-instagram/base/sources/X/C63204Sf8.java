package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sf8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63204Sf8 {
    public static final C63204Sf8 A03 = new C63204Sf8(true);
    public boolean A00;
    public boolean A01;
    public final TZJ A02;

    public C63204Sf8(boolean z) {
        RaE raE = new RaE(0);
        this.A02 = raE;
        if (!this.A01) {
            raE.A05();
            this.A01 = true;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Iterable entrySet;
        Map.Entry A1K;
        C63204Sf8 c63204Sf8 = new C63204Sf8();
        TZJ tzj = this.A02;
        if (0 < tzj.A00.size()) {
            A1K = (Map.Entry) tzj.A00.get(0);
        } else {
            if (tzj.A01.isEmpty()) {
                entrySet = S9C.A00;
            } else {
                entrySet = tzj.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            if (it.hasNext()) {
                A1K = AbstractC166987dD.A1K(it);
            } else {
                c63204Sf8.A00 = this.A00;
                return c63204Sf8;
            }
        }
        A1K.getKey();
        A1K.getValue();
        throw AbstractC166987dD.A15("isRepeated");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63204Sf8)) {
            return false;
        }
        return this.A02.equals(((C63204Sf8) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public C63204Sf8() {
        this.A02 = new RaE(16);
    }
}
