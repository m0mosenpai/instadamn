package X;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public abstract class VQD {
    /* JADX WARN: Type inference failed for: r1v3, types: [X.VK6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.VK6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.VK6, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C4IA c4ia;
        C4IB c4ib;
        Context context;
        C4IC c4ic;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A02;
        try {
            c4ia = C4IA.valueOf(AbstractC65702TsY.A0g(str));
        } catch (IllegalArgumentException unused) {
            c4ia = null;
        }
        try {
            c4ib = C4IB.valueOf(AbstractC65702TsY.A0g(str2));
        } catch (IllegalArgumentException unused2) {
            c4ib = null;
        }
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A00()).A00;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            context = c6fg.A00;
        } else {
            context = null;
        }
        C4IC c4ic2 = C4IC.A0C;
        if (context != null && c4ia != null && c4ib != null) {
            ?? obj = new Object();
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            switch (c4ia.ordinal()) {
                case 0:
                    c4ic2 = C70119W4r.A00(context, c4ib, false);
                    break;
                case 1:
                    c4ic2 = C70119W4r.A00(context, c4ib, true);
                    break;
                case 2:
                case 6:
                case 7:
                default:
                    c4ic2 = C4IC.A0A;
                    break;
                case 3:
                    c4ic2 = obj.A01(context);
                    break;
                case 4:
                    C69686VtW c69686VtW = new C69686VtW(C4IA.A06, c4ib);
                    String[] A01 = c69686VtW.A01();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(A01.length));
                    for (String str3 : A01) {
                        if (AbstractC23451Ch.A07(context, str3)) {
                            c4ic = C4IC.A06;
                        } else {
                            c4ic = C4IC.A05;
                        }
                        linkedHashMap.put(str3, c4ic);
                    }
                    c4ic2 = c69686VtW.A00(linkedHashMap);
                    break;
                case 5:
                    c4ic2 = obj3.A01(context);
                    break;
                case 8:
                    c4ic2 = obj2.A01(context);
                    break;
            }
        }
        C6FX c6fx = new C6FX();
        c6fx.A03(c4ic2.A00, 0);
        AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
        return null;
    }
}
