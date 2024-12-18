package X;

import java.util.List;

/* renamed from: X.Eyb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33935Eyb {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        boolean z;
        List list = c6fw.A00;
        if (list.size() > 1) {
            Object obj = list.get(1);
            C14360o3.A0C(obj, AbstractC111324zv.A00(11));
            z = AbstractC166987dD.A1a(obj);
        } else {
            z = false;
        }
        C140966Yy A0P = AbstractC31173DnH.A0P(C6BQ.A04(c6fq), C6BQ.A0B(c6fq));
        A0P.A0B(null, FVI.A00().A01(true, false, !z, false, z));
        A0P.A04();
        return null;
    }
}
