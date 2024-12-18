package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25991Og {
    public static final long A04;
    public static final long A05;
    public static final long A06;
    public final C1OZ A00;
    public final C0KV A01;
    public final String A02;
    public final Map A03;
    public static final C0KV A09 = new C0t0(10);
    public static final C0KV A07 = new C0t0(6);
    public static final C0KV A08 = new C0t0(2000L);

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A04 = timeUnit.toMillis(1L);
        A05 = timeUnit.toMillis(2L);
        A06 = timeUnit.toMillis(1L);
    }

    public final long A00(String str) {
        Map map = this.A03;
        if (map.containsKey(str)) {
            return ((Number) map.get(str)).longValue();
        }
        C0w9.A04("DirectMutationDefinition_getMutationTtlMs", AnonymousClass001.A0R("Unsupported lifecycle state: ", str), 1);
        return A04;
    }

    public C25991Og(final C25981Of c25981Of) {
        long j;
        this.A02 = c25981Of.A0A;
        this.A00 = c25981Of.A07;
        this.A01 = new C0KV(c25981Of) { // from class: X.1Oi
            public final C25981Of A00;

            {
                this.A00 = c25981Of;
            }

            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                C17050sx c17050sx;
                int A03 = C0f9.A03(-1302474640);
                int A032 = C0f9.A03(-1831529836);
                C25981Of c25981Of2 = this.A00;
                C17050sx A00 = C0KW.A00(userSession, c25981Of2.A08);
                C17050sx A002 = C0KW.A00(userSession, c25981Of2.A09);
                C0KV c0kv = c25981Of2.A04;
                C17050sx c17050sx2 = null;
                if (c0kv != null) {
                    c17050sx = C0KW.A00(userSession, c0kv);
                } else {
                    c17050sx = null;
                }
                C0KV c0kv2 = c25981Of2.A02;
                if (c0kv2 != null) {
                    c17050sx2 = C0KW.A00(userSession, c0kv2);
                }
                C43684JTt c43684JTt = new C43684JTt(A00, A002, c17050sx, c17050sx2, C0KW.A00(userSession, c25981Of2.A03), C0KW.A00(userSession, c25981Of2.A00), C0KW.A00(userSession, c25981Of2.A01));
                C0f9.A0A(-991670801, A032);
                C0f9.A0A(6816006, A03);
                return c43684JTt;
            }
        };
        HashMap hashMap = new HashMap();
        Long valueOf = Long.valueOf(A04);
        hashMap.put("queued", valueOf);
        hashMap.put("executing", valueOf);
        if (c25981Of.A05) {
            j = A05;
        } else {
            j = 0;
        }
        Long valueOf2 = Long.valueOf(j);
        hashMap.put("upload_failed_transient", valueOf2);
        hashMap.put("upload_failed_permanent", valueOf2);
        hashMap.put("uploaded", Long.valueOf(c25981Of.A06 ? A06 : 0L));
        this.A03 = Collections.unmodifiableMap(hashMap);
    }
}
