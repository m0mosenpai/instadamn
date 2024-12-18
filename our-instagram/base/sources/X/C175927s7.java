package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.7s7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175927s7 {
    public long A00;
    public final LinkedList A01 = new LinkedList();

    public final synchronized String A00() {
        String str;
        str = null;
        LinkedList linkedList = this.A01;
        if (!linkedList.isEmpty()) {
            long j = this.A00;
            StringBuilder sb = new StringBuilder();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            sb.append(j);
            str = sb.toString();
            linkedList.clear();
            this.A00 = 0L;
        }
        return str;
    }

    public final synchronized void A01(String str) {
        this.A00 = System.nanoTime();
        LinkedList linkedList = this.A01;
        linkedList.addLast(str);
        if (linkedList.size() > 40) {
            linkedList.removeFirst();
        }
    }
}
