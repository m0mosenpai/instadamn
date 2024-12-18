package X;

import android.content.Context;
import com.facebook.ultralight.UL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class Y4b {
    public static final YNX A03 = new C73350Y9f();
    public static final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final XVO A00;
    public final YB7 A01;
    public final Context A02;

    public static final void A01(C72720Xls c72720Xls) {
        List list = c72720Xls.A00;
        C18C.A0F(AbstractC166987dD.A1b(list));
        list.remove(AbstractC25226BEj.A05(list));
        List list2 = c72720Xls.A01;
        C18C.A0F(AbstractC166987dD.A1b(list2));
        list2.remove(AbstractC25226BEj.A05(list2));
    }

    public Y4b(YB7 yb7) {
        Context context;
        this.A01 = yb7;
        List list = yb7.BHn().A00;
        if (list.isEmpty()) {
            context = YB7.A00();
        } else {
            context = (Context) AbstractC58320PtC.A0u(list);
        }
        this.A02 = context;
        this.A00 = new XVO(this, yb7);
    }

    public static Object A00(int i) {
        Object obj;
        Context A00 = YB7.A00();
        AbstractC05810Sj.A00(A00);
        YB7 yb7 = YB7.get(A00);
        ConcurrentHashMap concurrentHashMap = A04;
        Integer valueOf = Integer.valueOf(i);
        Object obj2 = concurrentHashMap.get(valueOf);
        if (obj2 == null) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC72657Xk6.A00;
            concurrentHashMap2.putIfAbsent(valueOf, valueOf);
            Object obj3 = concurrentHashMap2.get(valueOf);
            synchronized (obj3) {
                obj = concurrentHashMap.get(obj3);
                if (obj == null) {
                    XVK Bqh = yb7.Bqh();
                    YNX ynx = A03;
                    Map map = Bqh.A01.A00;
                    Object obj4 = map.get(Y4b.class);
                    if (obj4 == null) {
                        synchronized (map) {
                            try {
                                obj4 = map.get(Y4b.class);
                                if (obj4 == null) {
                                    try {
                                        obj4 = ynx.ChF(Bqh);
                                        map.put(Y4b.class, obj4);
                                    } catch (Exception e) {
                                        throw new IllegalStateException(AnonymousClass001.A0R("Error creating the scope ", Y4b.class.getCanonicalName()), e);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    Y4b y4b = (Y4b) obj4;
                    C72720Xls BHn = y4b.A01.BHn();
                    BHn.A00.add(YB7.A00());
                    BHn.A01.add(y4b.A00);
                    YPa AcN = yb7.AcN();
                    C72720Xls c72720Xls = (C72720Xls) Y3I.A00.get();
                    c72720Xls.A01.add(AcN.Bqf());
                    try {
                        obj = UL.factorymap.get(i, AcN.Bqh(), YB7.A00());
                        if (obj != null) {
                            concurrentHashMap.put(obj3, obj);
                        }
                        Y3I.A01();
                        A01(BHn);
                    } catch (Throwable th2) {
                        Y3I.A01();
                        A01(BHn);
                        throw th2;
                    }
                }
            }
            return obj;
        }
        return obj2;
    }
}
