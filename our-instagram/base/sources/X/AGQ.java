package X;

import android.util.Pair;

/* loaded from: classes4.dex */
public final class AGQ {
    public float A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public Pair A08;
    public boolean A09;
    public byte[] A0A;
    public float[] A0B;
    public C179297xf[] A0C;

    public static void A00(AGQ agq) {
        if (agq.A0C != null) {
            int i = 0;
            while (true) {
                C179297xf[] c179297xfArr = agq.A0C;
                if (i < c179297xfArr.length) {
                    if (c179297xfArr[i].A02 != null) {
                        c179297xfArr[i].A02.clear();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
