package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1Ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24651Ii {
    public final java.util.Set A03 = new HashSet();
    public final java.util.Set A04 = new HashSet();
    public final Runnable A02 = new Runnable() { // from class: X.1Ij
        @Override // java.lang.Runnable
        public final void run() {
            C24651Ii c24651Ii = C24651Ii.this;
            java.util.Set set = c24651Ii.A03;
            if (!set.isEmpty()) {
                StringBuilder sb = new StringBuilder("critical path timeout: ");
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
                C0K8.A0E("CriticalPathManagerImpl", sb.toString());
                set.clear();
                C24651Ii.A00(c24651Ii);
            }
        }
    };
    public final int A00 = 10000;
    public final Handler A01 = new Handler(Looper.getMainLooper());

    public final synchronized void A03(String str) {
        this.A03.add(str);
        int i = this.A00;
        if (i > 0) {
            this.A01.postDelayed(this.A02, i);
        }
    }

    public final synchronized void A04(String str) {
        java.util.Set set = this.A03;
        set.remove(str);
        if (set.isEmpty() && this.A00 > 0) {
            this.A01.removeCallbacks(this.A02);
        }
        A00(this);
    }

    public static void A00(C24651Ii c24651Ii) {
        for (InterfaceC24681Il interfaceC24681Il : c24651Ii.A04) {
            C1KA Bbe = interfaceC24681Il.Bbe();
            if (!(Bbe == C1KA.A01 ? !c24651Ii.A03.isEmpty() : c24651Ii.A03.contains(Bbe.A00))) {
                interfaceC24681Il.ELG();
            }
        }
    }

    public final void A01(AbstractRunnableC14200nk abstractRunnableC14200nk, InterfaceC24681Il interfaceC24681Il) {
        if (this.A04.contains(interfaceC24681Il)) {
            interfaceC24681Il.E37(abstractRunnableC14200nk);
            A00(this);
            return;
        }
        throw new IllegalStateException("Queue not managed");
    }

    public final void A02(AbstractRunnableC14200nk abstractRunnableC14200nk, InterfaceC24681Il interfaceC24681Il) {
        if (this.A04.contains(interfaceC24681Il)) {
            interfaceC24681Il.Ep7(abstractRunnableC14200nk);
            A00(this);
            return;
        }
        throw new IllegalStateException("Queue not managed");
    }
}
