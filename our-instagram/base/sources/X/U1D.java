package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class U1D {
    public long A00;
    public final int A01;
    public final List A02;
    public final UserSession A04;
    public final C13920nI A05 = C13920nI.A00;
    public final ConcurrentMap A03 = new ConcurrentHashMap();

    public final void A00(String str, String str2) {
        ConcurrentMap concurrentMap = this.A03;
        if (str2 == null) {
            str2 = "";
        }
        concurrentMap.put(str, str2);
    }

    public final void A01(String str, String str2) {
        this.A02.add(new C9QC(1, str, str2, System.currentTimeMillis()));
    }

    public U1D(UserSession userSession, int i) {
        this.A01 = i;
        this.A04 = userSession;
        List A0z = AbstractC58322PtE.A0z();
        C14360o3.A07(A0z);
        this.A02 = A0z;
    }

    public final void A02(short s) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.A00) {
            C0w9.A07("QplSession", new RuntimeException());
            return;
        }
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        int i = this.A01;
        c006802i.A0e(i, this.A00);
        for (C9QC c9qc : this.A02) {
            C006802i c006802i2 = C006802i.A0p;
            C14360o3.A07(c006802i2);
            c006802i2.markerPoint(i, c9qc.A03, c9qc.A02, c9qc.A01, TimeUnit.MILLISECONDS);
        }
        Iterator A15 = AbstractC166997dE.A15(this.A03);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                C006802i c006802i3 = C006802i.A0p;
                C14360o3.A07(c006802i3);
                c006802i3.markerAnnotate(i, str, (String) value);
            } else if (value instanceof Integer) {
                C006802i c006802i4 = C006802i.A0p;
                C14360o3.A07(c006802i4);
                c006802i4.markerAnnotate(i, str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                C006802i c006802i5 = C006802i.A0p;
                C14360o3.A07(c006802i5);
                c006802i5.markerAnnotate(i, str, ((Boolean) value).booleanValue());
            }
        }
        C006802i c006802i6 = C006802i.A0p;
        C14360o3.A07(c006802i6);
        c006802i6.markerEnd(i, s, currentTimeMillis, TimeUnit.MILLISECONDS);
    }
}
