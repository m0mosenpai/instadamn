package X;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class U42 implements Handler.Callback {
    public final /* synthetic */ C66200U3w A00;

    public U42(C66200U3w c66200U3w) {
        this.A00 = c66200U3w;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!AbstractC79383gk.A03()) {
            U41 u41 = this.A00.A04;
            u41.A00(u41.obtainMessage(message.what, message.obj));
        } else {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                C66200U3w c66200U3w = this.A00;
                Object obj = message.obj;
                obj.getClass();
                UKQ ukq = (UKQ) obj;
                C6T7 c6t7 = c66200U3w.A01;
                if (c6t7 != null) {
                    Map map = c66200U3w.A08;
                    map.putAll(ukq.A02);
                    HashMap hashMap = new HashMap(map);
                    java.util.Set set = c66200U3w.A09;
                    HashSet hashSet = new HashSet(set);
                    try {
                        C6FG A02 = c6t7.A02();
                        List<C66246U5q> list = ukq.A01;
                        for (C66246U5q c66246U5q : list) {
                            if (!hashSet.contains(c66246U5q)) {
                                HashMap A05 = C1338462s.A05(c66246U5q.A01.A02, hashMap);
                                C6FX c6fx = new C6FX();
                                c6fx.A01(A02);
                                C131845xK.A00(C6FP.A00(c66246U5q, A02, A05), c6fx.A00(), c66246U5q.A02);
                                hashSet.add(c66246U5q);
                            }
                        }
                        set.addAll(list);
                        C66200U3w.A00(c66200U3w, ukq.A00);
                        return true;
                    } catch (Throwable th) {
                        set.addAll(ukq.A01);
                        C66200U3w.A00(c66200U3w, ukq.A00);
                        throw th;
                    }
                }
            } else {
                C66200U3w c66200U3w2 = this.A00;
                Object obj2 = message.obj;
                obj2.getClass();
                C66203U3z c66203U3z = (C66203U3z) obj2;
                try {
                    C6T7 c6t72 = c66200U3w2.A01;
                    if (c6t72 != null) {
                        c6t72.A04();
                    }
                    C126545np c126545np = c66200U3w2.A00;
                    if (c126545np == null) {
                        C66200U3w.A00(c66200U3w2, 8);
                    } else {
                        c66203U3z.A01.A07(c126545np);
                    }
                    return true;
                } finally {
                    c66200U3w2.A01 = c66203U3z.A01;
                    C66200U3w.A00(c66200U3w2, c66203U3z.A00);
                }
            }
        }
        return true;
    }
}
