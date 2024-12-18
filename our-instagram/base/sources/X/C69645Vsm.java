package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Vsm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69645Vsm {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;

    public C69645Vsm(C67882V0n c67882V0n, UserSession userSession, String str, String str2, String str3, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        this.A04 = str3;
        this.A03 = str2;
        if (c67882V0n != null) {
            arrayList.add(new WeakReference(c67882V0n));
        }
        this.A07 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = userSession;
        this.A05 = str;
    }

    public final void A00() {
        W90 w90 = W90.A04;
        boolean z = this.A07;
        LruCache lruCache = w90.A01;
        String str = this.A04;
        if (z) {
            lruCache.remove(str);
        } else if (lruCache.get(str) != null) {
            W90.A00(w90, this);
            return;
        }
        synchronized (w90.A02) {
            ConcurrentMap concurrentMap = w90.A03;
            C69645Vsm c69645Vsm = (C69645Vsm) concurrentMap.get(str);
            if (c69645Vsm == null) {
                concurrentMap.put(str, this);
                C907642p c907642p = new C907642p(C142216be.class, "IGCanvasDocumentQuery", AbstractC13670mt.A06("{\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\",\"%s\":\"%s\"}", "0", str, RealtimeSubscription.GRAPHQL_MQTT_VERSION, "102", "3", Integer.valueOf(this.A00), "2", Integer.valueOf(this.A01), "4", this.A05), true);
                C907542o c907542o = new C907542o(this.A02);
                c907542o.A09(c907642p);
                c907542o.A08 = "canvas_policy";
                C1ON A07 = c907542o.A07(C05F.A00);
                A07.A00 = new C31456Ds0(12, this, w90);
                C14120nc.A00().ATO(new C68020V6m(A07));
            } else {
                c69645Vsm.A06.addAll(this.A06);
            }
        }
    }
}
