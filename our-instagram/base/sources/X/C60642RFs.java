package X;

import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.RFs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60642RFs extends AbstractC63157Se6 {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public C60642RFs() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0 && (leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L)) == 0) {
            android.util.Log.e("GAv4", "UUID.randomUUID() returned 0.");
            leastSignificantBits = Integer.MAX_VALUE;
        }
        this.A00 = leastSignificantBits;
        this.A06 = false;
    }

    public final String toString() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(MSV.A00(565), this.A02);
        A1G.put("interstitial", Boolean.valueOf(this.A05));
        A1G.put("automatic", Boolean.valueOf(this.A06));
        A1G.put("screenId", Integer.valueOf(this.A00));
        A1G.put("referrerScreenId", Integer.valueOf(this.A01));
        A1G.put("referrerScreenName", this.A03);
        return AbstractC63157Se6.A01("referrerUri", this.A04, A1G);
    }
}
