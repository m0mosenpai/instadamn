package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7Xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164397Xc {
    public final UserSession A00;
    public final C164417Xe A01;
    public final C03250Di A02;

    public static final java.util.Set A00(C164397Xc c164397Xc, java.util.Set set) {
        long j;
        long j2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            C66057Tyu c66057Tyu = (C66057Tyu) obj;
            Integer num = c66057Tyu.A04;
            if (num == null || num == C05F.A00) {
                C164417Xe c164417Xe = c164397Xc.A01;
                String str = c66057Tyu.A06;
                C14360o3.A0B(str, 0);
                Object obj2 = c164417Xe.A03.get(str);
                if (obj2 == null) {
                    obj2 = null;
                }
                C47632L1r c47632L1r = (C47632L1r) obj2;
                if (c47632L1r != null) {
                    C66056Tyt c66056Tyt = c66057Tyu.A01;
                    long j3 = c66056Tyt.A00;
                    C58913QIr c58913QIr = c47632L1r.A00;
                    if (c58913QIr != null) {
                        j = c58913QIr.A01;
                    } else {
                        j = 0;
                    }
                    if (j3 > j) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (c58913QIr != null) {
                            j2 = c58913QIr.A00;
                        } else {
                            j2 = 0;
                        }
                        if (currentTimeMillis > j2 + C36J.A03(c66056Tyt.A02)) {
                        }
                    }
                }
                arrayList.add(obj);
            }
        }
        return AbstractC001800i.A0k(arrayList);
    }

    public C164397Xc(C03250Di c03250Di, UserSession userSession, C164417Xe c164417Xe) {
        this.A01 = c164417Xe;
        this.A00 = userSession;
        this.A02 = c03250Di;
    }
}
