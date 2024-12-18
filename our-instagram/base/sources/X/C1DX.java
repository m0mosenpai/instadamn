package X;

import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.pando.livetree.SupportedFieldsJNI;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1DX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DX {
    public static final C1DW A03 = new Object();
    public final UserSession A00;
    public final ConcurrentMap A01;
    public final InterfaceC09390do A02;

    public final C38321qM A00(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return A01(c38321qM, true, false);
    }

    public final void A03(C38321qM c38321qM) {
        A01(c38321qM, true, false);
    }

    public /* synthetic */ C1DX(UserSession userSession) {
        C17050sx A01 = AbstractC09440dt.A01(new C207019Eg(userSession, 11));
        this.A00 = userSession;
        this.A02 = A01;
        C18B c18b = new C18B();
        c18b.A03(64);
        c18b.A01();
        this.A01 = c18b.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C38321qM A01(C38321qM c38321qM, boolean z, boolean z2) {
        UserSession userSession;
        C06090Tz c06090Tz;
        String id;
        boolean z3;
        C38321qM c38321qM2 = c38321qM;
        C14360o3.A0B(c38321qM2, 0);
        Boolean CRM = c38321qM2.A0C.CRM();
        if (CRM != null && CRM.booleanValue()) {
            return c38321qM2;
        }
        Object putIfAbsent = this.A01.putIfAbsent(c38321qM2.getId(), c38321qM2);
        if (putIfAbsent != 0) {
            userSession = this.A00;
            c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36327164104620379L) && c38321qM2 == putIfAbsent) {
                return (C38321qM) putIfAbsent;
            }
            Boolean CXO = c38321qM2.A0C.CXO();
            if (CXO != null) {
                z3 = CXO.booleanValue();
            } else {
                z3 = false;
            }
            if (z && !z3) {
                if (C18U.A06(c06090Tz, userSession, 36321378781111670L)) {
                    try {
                        C38321qM c38321qM3 = (C38321qM) putIfAbsent;
                        String A3A = c38321qM3.A3A();
                        String A3A2 = c38321qM2.A3A();
                        if (A3A != null && A3A2 != null) {
                            int hashCode = c38321qM2.hashCode();
                            long j = c38321qM3.A04;
                            C54964OSu c54964OSu = new C54964OSu();
                            C44S c44s = c54964OSu.A00;
                            AbstractC911344p A08 = c44s.A08(A3A);
                            AbstractC911344p A082 = c44s.A08(A3A2);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C54964OSu.A00(A08, A082, c54964OSu, "", linkedHashMap);
                            C006802i c006802i = C006802i.A0p;
                            C14360o3.A07(c006802i);
                            c006802i.markerStart(15338041, hashCode);
                            boolean z4 = false;
                            if (Thread.currentThread().getId() == j) {
                                z4 = true;
                            }
                            c006802i.markerAnnotate(15338041, hashCode, "is_from_same_request", z4);
                            String str = (String) C1P5.A00.get();
                            if (str != null) {
                                c006802i.markerAnnotate(15338041, hashCode, "uri_path", new C11L("[0-9]+(_[0-9]+)*").A00(str, "<id>"));
                            }
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                String str2 = (String) entry.getKey();
                                String str3 = (String) entry.getValue();
                                String A0T = AnonymousClass001.A0T("media ", str2, '.');
                                StringBuilder sb = new StringBuilder();
                                for (int i = 0; i < A0T.length(); i++) {
                                    char charAt = A0T.charAt(i);
                                    if (!C11K.A01(charAt)) {
                                        sb.append(charAt);
                                    }
                                }
                                String obj = sb.toString();
                                C14360o3.A07(obj);
                                c006802i.markerAnnotate(15338041, hashCode, obj, str3);
                            }
                            c006802i.markerEnd(15338041, hashCode, (short) 2);
                        } else {
                            throw new IOException();
                        }
                    } catch (IOException unused) {
                        int hashCode2 = c38321qM2.hashCode();
                        C006802i c006802i2 = C006802i.A0p;
                        C14360o3.A07(c006802i2);
                        c006802i2.markerStart(15338041, hashCode2);
                        c006802i2.markerAnnotate(15338041, hashCode2, "field", "media");
                        c006802i2.markerEnd(15338041, hashCode2, (short) 3);
                    }
                }
                C38321qM c38321qM4 = (C38321qM) putIfAbsent;
                c38321qM4.A46(userSession, c38321qM2, z2);
                C14360o3.A0B(userSession, 0);
                AbstractC25651Mw.A00(userSession).E4s(new C57452kK(c38321qM4, false));
            }
            c38321qM2 = putIfAbsent;
        } else {
            if (Systrace.A0E(1L)) {
                C0fO.A01("MediaCache#subscribeToUpdates", 765874067);
            }
            try {
                InterfaceC09390do interfaceC09390do = this.A02;
                userSession = this.A00;
                C14360o3.A0B(interfaceC09390do, 0);
                C14360o3.A0B(userSession, 1);
                c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36327164104030547L) && (id = c38321qM2.getId()) != null) {
                    InterfaceC38831rF interfaceC38831rF = c38321qM2.A0C;
                    SupportedFieldsJNI supportedFieldsJNI = AbstractC39677Hj9.A00;
                    if (supportedFieldsJNI == null) {
                        supportedFieldsJNI = new SupportedFieldsJNI(C42553IsX.A09);
                        AbstractC39677Hj9.A00 = supportedFieldsJNI;
                    }
                    C1DU A00 = C1DS.A00(userSession);
                    C14360o3.A07(A00);
                    c38321qM2.A0C = new C42553IsX((PandoConsistencyServiceJNI) interfaceC09390do.getValue(), A00, interfaceC38831rF, supportedFieldsJNI, id, C18U.A06(c06090Tz, userSession, 36327164104292694L));
                }
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1679263196);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(2034568118);
                }
                throw th;
            }
        }
        if (C18U.A06(c06090Tz, userSession, 36321378781111670L)) {
            c38321qM2.A04 = Thread.currentThread().getId();
        }
        return c38321qM2;
    }

    public final C38321qM A02(String str) {
        if (str != null) {
            return (C38321qM) this.A01.get(str);
        }
        return null;
    }
}
