package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94574Nk {
    public final C94494Nb A00;
    public final String A01;
    public final Map A02;

    public C94574Nk(C94494Nb c94494Nb) {
        Map A0E;
        String str;
        String str2;
        C14360o3.A0B(c94494Nb, 1);
        this.A00 = c94494Nb;
        List<C94514Ne> list = c94494Nb.A03;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (C94514Ne c94514Ne : list) {
                if (c94514Ne != null) {
                    Boolean bool = c94514Ne.A00;
                    if (bool == null || (str2 = bool.toString()) == null) {
                        str2 = c94514Ne.A03;
                        if (str2 == null) {
                            Integer num = c94514Ne.A01;
                            if (num != null) {
                                str2 = num.toString();
                            }
                        }
                        if (str2 != null) {
                        }
                    }
                    arrayList.add(new C09530e4(c94514Ne.A02, str2));
                }
            }
            A0E = AbstractC06930Yk.A08(arrayList);
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        this.A02 = A0E;
        C94514Ne c94514Ne2 = this.A00.A01;
        String str3 = null;
        if (c94514Ne2 != null) {
            Boolean bool2 = c94514Ne2.A00;
            if ((bool2 == null || (str = bool2.toString()) == null) && (str = c94514Ne2.A03) == null) {
                Integer num2 = c94514Ne2.A01;
                if (num2 != null) {
                    str = num2.toString();
                }
            }
            str3 = str;
        }
        this.A01 = str3;
    }
}
