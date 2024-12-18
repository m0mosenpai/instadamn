package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.FfO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35171FfO {
    public static String A01(Boolean bool, Map map) {
        StringWriter stringWriter = new StringWriter();
        try {
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            Iterator A16 = AbstractC166997dE.A16(map);
            while (A16.hasNext()) {
                FNN fnn = (FNN) A16.next();
                A0A.A0d();
                List list = fnn.A04;
                C16V.A03(A0A, AbstractC58317Pt9.A00(339));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC167017dG.A1F(A0A, it);
                }
                A0A.A0Z();
                if (fnn.A05 != null) {
                    C16V.A03(A0A, "phone_numbers_normalized");
                    Iterator it2 = fnn.A05.iterator();
                    while (it2.hasNext()) {
                        AbstractC167017dG.A1F(A0A, it2);
                    }
                    A0A.A0Z();
                }
                List list2 = fnn.A03;
                C16V.A03(A0A, AbstractC111324zv.A00(2306));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    AbstractC167017dG.A1F(A0A, it3);
                }
                A0A.A0Z();
                String str = fnn.A01;
                if (str != null) {
                    A0A.A0S("first_name", str);
                }
                String str2 = fnn.A02;
                if (str2 != null) {
                    A0A.A0S("last_name", str2);
                }
                String str3 = fnn.A00;
                if (str3 != null) {
                    A0A.A0S("display_name", str3);
                }
                A0A.A0a();
            }
            A0A.A0Z();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            if (bool.booleanValue()) {
                A03(1001131023);
            }
            throw new RuntimeException("Error creating json string", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r2.AhE(X.C06090Tz.A04, 36327434685004361L) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if (r1 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r2.AhE(X.C06090Tz.A04, 36327434685069898L) == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedHashMap A02(android.content.Context r15, com.instagram.common.session.UserSession r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35171FfO.A02(android.content.Context, com.instagram.common.session.UserSession, boolean, boolean):java.util.LinkedHashMap");
    }

    public static void A03(int i) {
        C18950wb.A00("ContactHelper", i, true).report();
    }

    public static FNN A00(Map map, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (FNN) map.get(valueOf);
        }
        FNN fnn = new FNN();
        map.put(valueOf, fnn);
        return fnn;
    }
}
