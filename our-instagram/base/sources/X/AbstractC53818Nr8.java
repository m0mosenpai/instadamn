package X;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Nr8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53818Nr8 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C54983OTr c54983OTr;
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 1);
        String A0s2 = AbstractC31173DnH.A0s(list, 2);
        String A0s3 = AbstractC31173DnH.A0s(list, 3);
        String A0s4 = AbstractC31173DnH.A0s(list, 4);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        synchronized (C54983OTr.A03) {
            C14360o3.A0B(A0B, 0);
            c54983OTr = (C54983OTr) A0B.A01(C54983OTr.class, new C57238PbM(A0B, 41));
        }
        if (A0s3 == null) {
            A0s3 = "com.bloks.www.consent.flow.action";
        }
        C14360o3.A0B(str, 0);
        String A0p = AbstractC25231BEo.A0p();
        LinkedHashMap A00 = OND.A00(str, A0p, A0s, A0s2, A0s4);
        String obj = AbstractC16960so.A1Q(str, A0s3, A0s, A0s2, A0s4).toString();
        AbstractC192798gL A02 = C192108fB.A02(null, c54983OTr.A01, A0s3, A00);
        A02.A00(new N8A(c54983OTr, obj, A0p));
        C1GJ.A03(A02);
        return null;
    }
}
