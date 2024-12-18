package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SQ2 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public Rect A05;
    public C003501a A06;
    public C005101q A07;
    public List A08;
    public List A09;
    public Map A0A;
    public Map A0B;
    public Map A0C;
    public final SH8 A0D = new SH8();
    public final HashSet A0E = AbstractC166987dD.A1H();
    public int A04 = 0;

    public final float A00() {
        return ((this.A00 - this.A03) / this.A01) * 1000.0f;
    }

    public final SFO A01(String str) {
        int size = this.A09.size();
        for (int i = 0; i < size; i++) {
            SFO sfo = (SFO) this.A09.get(i);
            String str2 = sfo.A02;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return sfo;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("LottieComposition:\n");
        Iterator it = this.A08.iterator();
        while (it.hasNext()) {
            A0s.append(((SOF) it.next()).A00("\t"));
        }
        return A0s.toString();
    }

    public final Map A02() {
        float A00 = AbstractC63359SiH.A00();
        if (A00 != this.A02) {
            Iterator A15 = AbstractC166997dE.A15(this.A0B);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                Map map = this.A0B;
                Object key = A1K.getKey();
                C62597SIa c62597SIa = (C62597SIa) A1K.getValue();
                float f = this.A02 / A00;
                C62597SIa c62597SIa2 = new C62597SIa((int) (c62597SIa.A02 * f), (int) (c62597SIa.A01 * f), c62597SIa.A05, c62597SIa.A04, c62597SIa.A03);
                Bitmap bitmap = c62597SIa.A00;
                if (bitmap != null) {
                    c62597SIa2.A00 = C0fK.A00(bitmap, c62597SIa2.A02, c62597SIa2.A01, true);
                }
                map.put(key, c62597SIa2);
            }
        }
        this.A02 = A00;
        return this.A0B;
    }

    public final void A03(String str) {
        SQZ.A00(str);
        this.A0E.add(str);
    }
}
