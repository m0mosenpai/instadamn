package X;

import java.util.HashMap;

/* loaded from: classes10.dex */
public final class RFr extends AbstractC63157Se6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public String A05;

    public final String toString() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("language", this.A05);
        A1G.put("screenColors", Integer.valueOf(this.A00));
        A1G.put("screenWidth", Integer.valueOf(this.A01));
        A1G.put(AbstractC111324zv.A00(3047), Integer.valueOf(this.A02));
        A1G.put("viewportWidth", Integer.valueOf(this.A03));
        return AbstractC63157Se6.A01("viewportHeight", Integer.valueOf(this.A04), A1G);
    }
}
