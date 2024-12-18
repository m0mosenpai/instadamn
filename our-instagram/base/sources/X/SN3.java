package X;

import android.graphics.RectF;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

/* loaded from: classes10.dex */
public final class SN3 {
    public long A00;
    public SelfieEvidence A01;
    public SNY A02;
    public ImmutableList A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final long A08;
    public final RectF A09;
    public final C210719Tt A0A;
    public final C62492SDt A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;

    public SN3(RectF rectF, C210719Tt c210719Tt, Integer num, String str, String str2, Collection collection, int i, long j) {
        AbstractC167007dF.A1H(collection, 5, num);
        this.A0A = c210719Tt;
        this.A0D = str;
        this.A08 = j;
        this.A0E = str2;
        this.A04 = C05F.A00;
        if (!collection.isEmpty()) {
            this.A03 = ImmutableList.copyOf(collection);
        }
        this.A0B = new C62492SDt(collection);
        this.A07 = i;
        this.A0C = num;
        this.A09 = rectF;
    }

    public final void A00() {
        String str = this.A0D;
        if (str != null) {
            C63256SgE.A01(str);
        }
        this.A05 = false;
        String str2 = this.A0E;
        if (str2 != null) {
            C63256SgE.A01(str2);
        }
        this.A06 = false;
        C62492SDt c62492SDt = this.A0B;
        PriorityQueue priorityQueue = c62492SDt.A01;
        Iterator A13 = AbstractC166997dE.A13(priorityQueue);
        while (A13.hasNext()) {
            c62492SDt.A00.add(((C62491SDs) A13.next()).A01);
        }
        priorityQueue.clear();
        Iterator it = c62492SDt.A00.iterator();
        while (it.hasNext()) {
            C63256SgE.A01(AbstractC166987dD.A1B(it));
        }
    }
}
