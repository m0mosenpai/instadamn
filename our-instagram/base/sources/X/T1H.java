package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class T1H implements InterfaceC65232TgO {
    public C4N8 A02;
    public final String A03;
    public final Context A04;
    public final RealtimeSinceBootClock A05;
    public final C4N2 A06;
    public final String A07;
    public final boolean A09;
    public final HashMap A08 = AbstractC166987dD.A1G();
    public int A00 = (int) (System.currentTimeMillis() / 86400000);
    public long A01 = SystemClock.elapsedRealtime();

    private synchronized void A01() {
        if (this.A02 == null) {
            C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
            Context context = this.A04;
            context.getApplicationContext();
            this.A02 = c74123Uq.A02().A00(context.getApplicationContext(), AnonymousClass001.A0u("rti.mqtt.counter.", this.A07, ".", this.A03));
        }
    }

    private void A00() {
        HashMap A10;
        if (this.A09) {
            HashMap hashMap = this.A08;
            synchronized (hashMap) {
                A10 = AbstractC58318PtA.A10(hashMap);
                hashMap.clear();
            }
            if (!A10.isEmpty()) {
                A01();
                C91M ARA = this.A02.ARA();
                Iterator A14 = AbstractC166997dE.A14(A10);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    ARA.E7E(AbstractC31172DnG.A17(A1K), this.A02.getLong(AbstractC31172DnG.A17(A1K), 0L) + AbstractC166987dD.A0N(A1K.getValue()));
                }
                ARA.AIY();
                this.A01 = SystemClock.elapsedRealtime();
            }
        }
    }

    public T1H(Context context, RealtimeSinceBootClock realtimeSinceBootClock, C4N2 c4n2, String str, String str2, boolean z) {
        this.A04 = context;
        this.A07 = str;
        this.A06 = c4n2;
        this.A05 = realtimeSinceBootClock;
        this.A03 = str2;
        this.A09 = z;
    }

    public final JSONObject A02(boolean z) {
        int indexOf;
        A01();
        JSONObject A0q = AbstractC31171DnF.A0q();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
        Map all = this.A02.getAll();
        C91M ARA = this.A02.ARA();
        Iterator A15 = AbstractC166997dE.A15(all);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            int i = 0;
            if (A17 != null && (indexOf = A17.indexOf(".")) > 0) {
                try {
                    i = Integer.parseInt(A17.substring(0, indexOf));
                } catch (NumberFormatException unused) {
                }
            }
            if (i <= currentTimeMillis && i + 3 >= currentTimeMillis) {
                if (z) {
                    A0q.putOpt(AbstractC31172DnG.A17(A1K), A1K.getValue());
                } else if (i != currentTimeMillis) {
                    A0q.putOpt(AbstractC31172DnG.A17(A1K), A1K.getValue());
                }
            }
            ARA.EEh(AbstractC31172DnG.A17(A1K));
        }
        ARA.AIY();
        if (A0q.length() == 0) {
            return null;
        }
        if (!z) {
            return A0q;
        }
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        A0q2.put("period_ms", System.currentTimeMillis() % 86400000);
        A0q2.put("data", A0q);
        return A0q2;
    }

    public final void A03(String[] strArr, long j) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 86400000);
        if (this.A00 != currentTimeMillis) {
            this.A00 = currentTimeMillis;
            A00();
        }
        StringBuilder A11 = AbstractC166997dE.A11(String.valueOf(currentTimeMillis));
        for (String str : strArr) {
            A11.append(".");
            A11.append(str);
        }
        String obj = A11.toString();
        HashMap hashMap = this.A08;
        synchronized (hashMap) {
            Long l = (Long) hashMap.get(obj);
            if (l == null) {
                l = AbstractC167007dF.A0d();
            }
            hashMap.put(obj, Long.valueOf(l.longValue() + j));
        }
        if (SystemClock.elapsedRealtime() - this.A01 > 3600000) {
            A00();
        }
    }
}
