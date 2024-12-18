package X;

import java.util.HashMap;

/* renamed from: X.RFt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60643RFt extends AbstractC63157Se6 {
    public double A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;

    public final String toString() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("hitType", this.A01);
        A1G.put("clientId", this.A02);
        A1G.put("userId", this.A03);
        A1G.put("androidAdId", this.A04);
        A1G.put("AdTargetingEnabled", Boolean.valueOf(this.A06));
        A1G.put("sessionControl", this.A05);
        A1G.put("nonInteraction", Boolean.valueOf(this.A07));
        return AbstractC63157Se6.A01("sampleRate", Double.valueOf(this.A00), A1G);
    }
}
