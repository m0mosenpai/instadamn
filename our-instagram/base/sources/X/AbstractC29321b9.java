package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1b9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC29321b9 {
    public static final C0KV A01 = new C0KV() { // from class: X.1bA
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(-259326721);
            int A033 = C0f9.A03(-1237654960);
            C32891hD c32891hD = new C32891hD(AbstractC11060iN.A00(userSession), null, "direct_mutation_waterfall");
            C0f9.A0A(275107227, A033);
            C0f9.A0A(239274761, A032);
            return c32891hD;
        }
    };
    public static final C0KV A04 = new C0KV() { // from class: X.1bB
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(783067681);
            int A033 = C0f9.A03(-815568762);
            KWK kwk = new KWK(new C29135Ct2(this), userSession);
            C0f9.A0A(279542081, A033);
            C0f9.A0A(-1141427811, A032);
            return kwk;
        }
    };
    public static final C0KV A05 = new C0KV() { // from class: X.1bC
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(-640417414);
            int A033 = C0f9.A03(1851573698);
            Object obj = new Object();
            C0f9.A0A(712605209, A033);
            C0f9.A0A(-778746458, A032);
            return obj;
        }
    };
    public static final C0KV A03 = new C0KV() { // from class: X.1bD
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(470853986);
            int A033 = C0f9.A03(-447132473);
            Integer valueOf = Integer.valueOf(Long.valueOf(C18U.A01(C06090Tz.A05, userSession, 36605606831854901L)).intValue());
            C0f9.A0A(904619993, A033);
            C0f9.A0A(-1510654983, A032);
            return valueOf;
        }
    };
    public static final C0KV A00 = new C0KV() { // from class: X.1bE
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.1Oe] */
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(888789626);
            int A033 = C0f9.A03(-1145892635);
            ?? obj = new Object();
            HashMap hashMap = new HashMap();
            hashMap.put(EnumC40111tc.A0a, new Object());
            C49236Lpr c49236Lpr = new C49236Lpr(obj, Collections.unmodifiableMap(hashMap));
            C0f9.A0A(-431868834, A033);
            C0f9.A0A(1173827849, A032);
            return c49236Lpr;
        }
    };
    public static final C0KV A02 = new C0KV() { // from class: X.1bF
        @Override // X.C0KV
        public final Object AXR(UserSession userSession) {
            return new InterfaceC25971Oe() { // from class: X.G5X
                @Override // X.InterfaceC25971Oe
                public final String AXT(C1OW c1ow) {
                    List list = ((C35611lh) c1ow).A00;
                    if (list != null) {
                        return list.toString();
                    }
                    C14360o3.A0F("threadIds");
                    throw C00O.createAndThrow();
                }
            };
        }
    };

    public static C25981Of A00(C1OZ c1oz, C0KV c0kv, C0KV c0kv2, String str) {
        C25981Of c25981Of = new C25981Of(c1oz, new C29401bH(c0kv), c0kv2, str);
        c25981Of.A04 = C29411bI.A04;
        c25981Of.A02 = C29441bL.A01;
        c25981Of.A06 = true;
        c25981Of.A05 = true;
        return c25981Of;
    }
}
