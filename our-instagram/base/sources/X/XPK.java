package X;

import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class XPK implements Runnable {
    public final /* synthetic */ XPJ A00;

    public XPK(XPJ xpj) {
        this.A00 = xpj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        XPJ xpj = this.A00;
        try {
            j = ((Long) xpj.A07.invoke(xpj.A04, new Object[0])).longValue();
        } catch (Exception e) {
            XPJ.A00(xpj, e);
            j = 0;
        }
        if (xpj.A00 == -1) {
            xpj.A00 = j;
            xpj.A01 = j;
        } else {
            long j2 = j - xpj.A01;
            xpj.A01 = j;
            int i = (int) j2;
            AbstractC24941Jv abstractC24941Jv = xpj.A05.A01;
            AbstractC24941Jv.A00(abstractC24941Jv);
            if (abstractC24941Jv.A04) {
                C24981Jz c24981Jz = abstractC24941Jv.A02;
                c24981Jz.getClass();
                c24981Jz.A02.A00(i);
                c24981Jz.A01.A00(i);
                c24981Jz.A00.A00(i);
                C1K1 c1k1 = c24981Jz.A03;
                long now = c24981Jz.A04.now();
                if (i >= 200) {
                    ArrayList arrayList = c1k1.A01;
                    if (arrayList.size() < 50) {
                        arrayList.add(Long.valueOf(now));
                        c1k1.A00.add(Integer.valueOf(i));
                    }
                }
            }
        }
        xpj.A03(xpj.A06);
    }
}
