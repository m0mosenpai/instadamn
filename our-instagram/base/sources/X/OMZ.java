package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OMZ {
    public final String A02;
    public boolean A01 = false;
    public Map A00 = AbstractC166987dD.A1G();

    public final void A03() {
        this.A01 = true;
    }

    public final String A01() {
        return this.A02;
    }

    public final Map A02() {
        return this.A00;
    }

    public final boolean A04() {
        return this.A01;
    }

    public OMZ(String str) {
        this.A02 = str;
    }

    public final String A00() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        Iterator A15 = AbstractC166997dE.A15(this.A00);
        int i = 0;
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (i > 0) {
                A1C.append(" , ");
            }
            A1C.append(AbstractC31172DnG.A17(A1K));
            A1C.append(": ");
            A1C.append((String) A1K.getValue());
            i++;
        }
        return A1C.toString();
    }
}
