package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6FY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6FY {
    /* JADX WARN: Finally extract failed */
    public static Object A00(C6FQ c6fq, C6FW c6fw, InterfaceC103384lE interfaceC103384lE) {
        boolean z;
        C136286Fh c136286Fh;
        C6FS c6fs = c6fq.A07;
        if (C1LN.A01.isTracing()) {
            C1LN.A01("Parse script");
        }
        Object obj = null;
        if (interfaceC103384lE instanceof InterfaceC103374lD) {
            InterfaceC103374lD interfaceC103374lD = (InterfaceC103374lD) interfaceC103384lE;
            try {
                interfaceC103374lD.ASn(c6fq.A00);
                C136266Fe F9w = interfaceC103374lD.F9w();
                c6fs.CzG(c6fw, interfaceC103384lE, interfaceC103384lE.Bqx());
                try {
                    List unmodifiableList = Collections.unmodifiableList(c6fw.A00);
                    ThreadLocal threadLocal = AbstractC136276Fg.A00;
                    if (threadLocal.get() == null) {
                        z = true;
                        c136286Fh = new C136286Fh();
                        threadLocal.set(c136286Fh);
                    } else {
                        z = false;
                        c136286Fh = (C136286Fh) threadLocal.get();
                    }
                    try {
                        try {
                            try {
                                C136296Fi c136296Fi = new C136296Fi(c6fq);
                                int i = c136286Fh.A01;
                                C136286Fh.A0D(c136286Fh, unmodifiableList.size() + 1 + 5);
                                C136286Fh.A0E(c136286Fh, null);
                                Iterator it = unmodifiableList.iterator();
                                while (it.hasNext()) {
                                    C136286Fh.A0E(c136286Fh, it.next());
                                }
                                C136286Fh.A0F(c136286Fh, new C1344465q(F9w), null, unmodifiableList.size(), c136286Fh.A02);
                                C136296Fi c136296Fi2 = c136286Fh.A03;
                                c136286Fh.A03 = c136296Fi;
                                try {
                                    C136286Fh.A0B(c136286Fh);
                                    c136286Fh.A03 = c136296Fi2;
                                    obj = c136286Fh.A05[c136286Fh.A01 - 1];
                                    C136286Fh.A0C(c136286Fh);
                                    int i2 = c136286Fh.A01;
                                    if (i2 == i) {
                                        if (z) {
                                            threadLocal.remove();
                                        }
                                    } else {
                                        throw new C6W5(AnonymousClass001.A0R("InvalidBytecode: ", String.format("Execution ended prematurely: stack size = %d, initial stack size = %d", Integer.valueOf(i2), Integer.valueOf(i))));
                                    }
                                } catch (Throwable th) {
                                    c136286Fh.A03 = c136296Fi2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                if (z) {
                                    threadLocal.remove();
                                }
                                throw th2;
                            }
                        } catch (C6W5 e) {
                            if (z) {
                                throw new C1338562t(e);
                            }
                            throw e;
                        }
                    } catch (C6W5 e2) {
                        throw e2;
                    } catch (RuntimeException e3) {
                        throw new C6W5(e3);
                    }
                } catch (C1338562t e4) {
                    C1338562t c1338562t = new C1338562t(interfaceC103384lE.Byi(), e4);
                    c6fs.Dij(c1338562t, interfaceC103384lE);
                    throw c1338562t;
                }
            } finally {
                if (C1LN.A01.isTracing()) {
                    C1LN.A00();
                }
            }
        }
        c6fs.Cw6(c6fw, interfaceC103384lE, obj, interfaceC103384lE.Bqx());
        return obj;
    }
}
