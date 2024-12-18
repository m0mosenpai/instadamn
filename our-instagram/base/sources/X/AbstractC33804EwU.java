package X;

import java.util.List;
import java.util.Locale;

/* renamed from: X.EwU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33804EwU {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        List list = c6fw.A00;
        Object obj = list.get(1);
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 3);
        Object obj2 = list.get(4);
        String A10 = AbstractC166997dE.A10(Locale.ROOT, A0e);
        if (A10.equals("KEYSTORE")) {
            num = C05F.A00;
        } else if (A10.equals("PLAY_INTEGRITY")) {
            num = C05F.A01;
        } else {
            throw AbstractC166987dD.A12(A10);
        }
        if (num.intValue() != 0) {
            C36696GFr c36696GFr = new C36696GFr(c6fq, A0H, A0I, obj);
            C6FG c6fg = c6fq.A03;
            if (c6fg != null) {
                FBE.A00().A01(c6fg.A00, C6BQ.A0A(C6BQ.A09(c6fq)), c36696GFr);
                return null;
            }
            return null;
        }
        C56714PFg c56714PFg = new C56714PFg(c6fq, A0H, A0I, obj2);
        C6FG c6fg2 = c6fq.A03;
        if (c6fg2 == null) {
            return null;
        }
        FBE.A00().A00(c6fg2.A00, C6BQ.A0A(C6BQ.A09(c6fq)), c56714PFg);
        return null;
    }
}
