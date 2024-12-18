package X;

import java.util.Iterator;

/* renamed from: X.0Uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06250Uq {
    public final int A00;
    public final InterfaceC06290Uu A01;

    public final void A00(String str, int i, Integer num) {
        String str2;
        if (this.A00 != 0 && str != null && !str.startsWith("com.instagram")) {
            Iterator it = C06280Ut.A04.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    return;
                }
            }
            Iterator it2 = C06280Ut.A03.iterator();
            while (it2.hasNext()) {
                if (str.startsWith((String) it2.next())) {
                    return;
                }
            }
            InterfaceC06290Uu interfaceC06290Uu = this.A01;
            if (num.intValue() != 0) {
                str2 = "QUERY";
            } else {
                str2 = "ACQUIRE_CONTENT_PROVIDER_CLIENT";
            }
            interfaceC06290Uu.EHz(str2, str, i, AnonymousClass001.A0R("xapp comm to ", str));
        }
    }

    public C06250Uq(InterfaceC06290Uu interfaceC06290Uu, int i) {
        this.A01 = interfaceC06290Uu;
        this.A00 = i;
    }
}
