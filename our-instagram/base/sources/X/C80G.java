package X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.80G, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C80G {
    public static final int A01(C84B c84b) {
        if (c84b == null) {
            return 0;
        }
        List list = c84b.A01;
        if (!list.isEmpty()) {
            List subList = c84b.A05().subList(0, list.size());
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(subList, 10));
            Iterator it = subList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(A00((AbstractC115485Ki) it.next())));
            }
            return AbstractC001800i.A02(arrayList);
        }
        return c84b.A00;
    }

    public static final int A00(AbstractC115485Ki abstractC115485Ki) {
        if (abstractC115485Ki instanceof C115475Kh) {
            C115475Kh c115475Kh = (C115475Kh) abstractC115485Ki;
            double d = c115475Kh.A08 - c115475Kh.A09;
            C115525Km c115525Km = c115475Kh.A0G;
            return (int) Math.ceil((d * c115525Km.A06) / (c115525Km.A02 - c115525Km.A03));
        }
        if (abstractC115485Ki instanceof C52435NIf) {
            return ((C52435NIf) abstractC115485Ki).A00;
        }
        return 0;
    }

    public static final File A02(C115475Kh c115475Kh, C49602Pt c49602Pt, boolean z) {
        if (!z && c115475Kh.A00 != 1.0f) {
            File A01 = AMc.A01(c49602Pt, new File(c115475Kh.A0G.A0F), "adjusted");
            if (!A01.exists()) {
                throw new IOException("Adjusted source video file does not exist");
            }
            return A01;
        }
        return new File(c115475Kh.A0G.A0F);
    }
}
