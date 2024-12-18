package X;

import java.util.HashMap;

/* loaded from: classes10.dex */
public final class RFp extends AbstractC63157Se6 {
    public long A00;
    public String A01;
    public String A02;
    public String A03;

    public final String toString() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("variableName", this.A02);
        A1G.put("timeInMillis", Long.valueOf(this.A00));
        A1G.put("category", this.A01);
        return AbstractC63157Se6.A01("label", this.A03, A1G);
    }
}
