package X;

import com.instagram.model.mediatype.ProductType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23541Cq {
    public String A00;
    public Map A01 = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.IBq] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.IBn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.IBm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.IBr] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.IBo] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, X.IBp] */
    public final void A01(C23541Cq c23541Cq) {
        C14360o3.A0B(c23541Cq, 0);
        for (Map.Entry entry : c23541Cq.A01.entrySet()) {
            Object key = entry.getKey();
            C110974z9 c110974z9 = (C110974z9) entry.getValue();
            Map map = this.A01;
            if (map.containsKey(key)) {
                C110974z9 c110974z92 = (C110974z9) map.get(key);
                if (c110974z92 != null) {
                    C14360o3.A0B(c110974z9, 0);
                    IEM iem = c110974z92.A0A;
                    long j = iem.A01;
                    IEM iem2 = c110974z9.A0A;
                    iem.A01 = j + iem2.A01;
                    iem.A00 = Math.max(iem.A00, iem2.A00);
                    if (c110974z92.A08 != null || c110974z9.A08 != null) {
                        ?? obj = new Object();
                        obj.A00 = true;
                        c110974z92.A08 = obj;
                    }
                    if (c110974z92.A04 != null || c110974z9.A04 != null) {
                        ?? obj2 = new Object();
                        obj2.A00 = true;
                        c110974z92.A04 = obj2;
                    }
                    if (c110974z92.A03 != null || c110974z9.A03 != null) {
                        ?? obj3 = new Object();
                        obj3.A00 = true;
                        c110974z92.A03 = obj3;
                    }
                    if (c110974z92.A09 != null || c110974z9.A09 != null) {
                        ?? obj4 = new Object();
                        obj4.A00 = true;
                        c110974z92.A09 = obj4;
                    }
                    if (c110974z92.A05 != null || c110974z9.A05 != null) {
                        ?? obj5 = new Object();
                        obj5.A00 = true;
                        c110974z92.A05 = obj5;
                    }
                    if (c110974z92.A06 != null || c110974z9.A06 != null) {
                        ?? obj6 = new Object();
                        obj6.A00 = true;
                        c110974z92.A06 = obj6;
                    }
                    IEL iel = c110974z92.A07;
                    long j2 = iel.A01;
                    IEL iel2 = c110974z9.A07;
                    iel.A01 = j2 + iel2.A01;
                    iel.A00 = Math.max(iel.A00, iel2.A00);
                    C50627MWo c50627MWo = c110974z92.A02;
                    C50627MWo c50627MWo2 = c110974z9.A02;
                    if (c50627MWo != null) {
                        c50627MWo.A02(c50627MWo2);
                    } else if (c50627MWo2 != null) {
                        c50627MWo = c50627MWo2;
                    }
                    c110974z92.A02 = c50627MWo;
                    C50627MWo c50627MWo3 = c110974z92.A00;
                    C50627MWo c50627MWo4 = c110974z9.A00;
                    if (c50627MWo3 != null) {
                        c50627MWo3.A02(c50627MWo4);
                    } else if (c50627MWo4 != null) {
                        c50627MWo3 = c50627MWo4;
                    }
                    c110974z92.A00 = c50627MWo3;
                    C50627MWo c50627MWo5 = c110974z92.A01;
                    C50627MWo c50627MWo6 = c110974z9.A01;
                    if (c50627MWo5 != null) {
                        c50627MWo5.A02(c50627MWo6);
                    } else if (c50627MWo6 != null) {
                        c50627MWo5 = c50627MWo6;
                    }
                    c110974z92.A01 = c50627MWo5;
                }
            } else {
                map.put(key, c110974z9);
            }
        }
    }

    public final C110974z9 A00(C38321qM c38321qM) {
        String str;
        String id = c38321qM.getId();
        if (id != null) {
            Map map = this.A01;
            C110974z9 c110974z9 = (C110974z9) map.get(id);
            if (c110974z9 == null) {
                c110974z9 = new C110974z9();
                map.put(id, c110974z9);
            }
            String id2 = c38321qM.getId();
            if (id2 != null && AbstractC001900j.A0a(id2, "_", false)) {
                c110974z9.A0C = c38321qM.Biv();
            }
            ProductType A1z = c38321qM.A1z();
            if (A1z != null && (str = A1z.A00) != null) {
                c110974z9.A0D = str;
            }
            return c110974z9;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
