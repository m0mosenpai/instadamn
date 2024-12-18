package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.systrace.Systrace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class SZN {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public InterfaceC65228TgK A0C;
    public final R3M A0K;
    public final C63309ShF A0L;
    public final R5L A0M;
    public final int[] A0P = new int[4];
    public final Object A0N = AbstractC58318PtA.A0b();
    public final Object A0O = AbstractC58318PtA.A0b();
    public ArrayList A0G = AbstractC166987dD.A1E();
    public ArrayList A0F = AbstractC166987dD.A1E();
    public ArrayList A0E = AbstractC166987dD.A1E();
    public ArrayDeque A0D = new ArrayDeque();
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = false;

    public final void A01(SKS sks, R3N r3n, String str, int i) {
        synchronized (this.A0O) {
            this.A00++;
            this.A0D.addLast(new R5e(sks, r3n, this, str, i));
        }
    }

    public static void A00(SZN szn) {
        if (szn.A0I) {
            C0I2.A04("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (szn.A0N) {
            ArrayList arrayList = szn.A0E;
            if (!arrayList.isEmpty()) {
                szn.A0E = AbstractC166987dD.A1E();
                long uptimeMillis = SystemClock.uptimeMillis();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC58319PtB.A1N(it);
                }
                if (szn.A0J) {
                    szn.A02 = SystemClock.uptimeMillis() - uptimeMillis;
                    szn.A07 = szn.A01;
                    szn.A0J = false;
                    Systrace.A09("batchedExecutionTime", 0, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 1000000 * uptimeMillis);
                    Systrace.A06(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "batchedExecutionTime", 0);
                }
                szn.A01 = 0L;
            }
        }
    }

    public SZN(R3M r3m, C63309ShF c63309ShF, int i) {
        this.A0L = c63309ShF;
        this.A0M = new R5L(r3m, this, i == -1 ? 8 : i);
        this.A0K = r3m;
    }
}
