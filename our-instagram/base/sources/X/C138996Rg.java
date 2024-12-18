package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138996Rg {
    public boolean A00;
    public final int A01;
    public final long A02;
    public final QuickPerformanceLogger A03;
    public final C170967jn A04;
    public final C919249w A05;

    public static final void A00(C138996Rg c138996Rg, long j) {
        C919249w c919249w = c138996Rg.A05;
        C14360o3.A07(String.format("[%s] %4dms;", Arrays.copyOf(new Object[]{c919249w.A05, Long.valueOf(j - c919249w.A00)}, 2)));
    }

    public static final void A01(List list) {
        String str;
        Number number;
        StringBuilder sb = new StringBuilder("[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC139056Rm abstractC139056Rm = (AbstractC139056Rm) it.next();
            C9BN c9bn = abstractC139056Rm.A01;
            if (c9bn != null && (number = (Number) c9bn.A02) != null) {
                int intValue = number.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            str = "⚫";
                        }
                    } else {
                        str = "❌";
                    }
                } else {
                    str = "✅";
                }
                sb.append(str);
            }
            if (abstractC139056Rm.A04) {
                str = "🟡";
            } else {
                str = "⚪";
            }
            sb.append(str);
        }
        sb.append("]");
        C14360o3.A07(sb.toString());
    }

    public C138996Rg(C170967jn c170967jn, C919249w c919249w) {
        this.A05 = c919249w;
        this.A04 = c170967jn;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A03 = c006802i;
        this.A01 = hashCode();
        this.A02 = c919249w.A00 - 3000;
    }
}
