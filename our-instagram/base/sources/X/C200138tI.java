package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8tI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200138tI {
    public Long A00;
    public Object A01;
    public String A02;
    public Map A03;
    public final InterfaceC200458to A04;

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        ConcurrentMapC200188tN concurrentMapC200188tN = ((C200448tn) this.A04).A00;
        long j = 0;
        for (int i = 0; i < concurrentMapC200188tN.A0K.length; i++) {
            j += Math.max(0, r7[i].A0C);
        }
        if (j > 0) {
            this.A02 = str;
            this.A00 = Long.valueOf(System.currentTimeMillis());
            this.A03 = AbstractC06930Yk.A0B(concurrentMapC200188tN);
        }
        concurrentMapC200188tN.clear();
    }

    public final RegularImmutableMap A00(C9BE c9be, ImmutableList immutableList) {
        if (!C14360o3.A0K(this.A01, c9be)) {
            A01("state_snapshot_mismatch");
        }
        ConcurrentMapC200188tN concurrentMapC200188tN = ((C200448tn) this.A04).A00;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = concurrentMapC200188tN.get(next);
            if (obj != null) {
                builder.put(next, obj);
            }
        }
        int i = builder.size;
        Object[] objArr = builder.alternatingKeysAndValues;
        builder.entriesUsed = true;
        RegularImmutableMap A00 = RegularImmutableMap.A00(builder, objArr, i);
        A00.keySet();
        return A00;
    }

    public C200138tI(UserSession userSession) {
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36599916001824418L);
        C200148tJ c200148tJ = new C200148tJ();
        c200148tJ.A02(A01, TimeUnit.MINUTES);
        this.A04 = c200148tJ.A00();
        this.A02 = NetInfoModule.CONNECTION_TYPE_NONE;
    }
}
