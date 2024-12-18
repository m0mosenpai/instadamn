package X;

import android.content.Context;
import java.util.Locale;

/* renamed from: X.CBr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27496CBr {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        Object A01 = c6fw.A01();
        AbstractC25225BEi.A1S(A01);
        String str = (String) A01;
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A02()).A00;
        InterfaceC103384lE interfaceC103384lE2 = ((C1344465q) c6fw.A00()).A00;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            String A10 = AbstractC166997dE.A10(Locale.ROOT, str);
            if (A10.equals("BLOKS_SHELL_TEST")) {
                num = C05F.A00;
            } else if (A10.equals("PAYMENTS_AUTOFILL")) {
                num = C05F.A01;
            } else if (A10.equals("ENCRYPTED_BACKUPS")) {
                num = C05F.A0C;
            } else {
                throw AbstractC166987dD.A12(A10);
            }
            C30484DbT c30484DbT = new C30484DbT(11, c6fq, interfaceC103384lE);
            C30484DbT c30484DbT2 = new C30484DbT(12, c6fq, interfaceC103384lE2);
            AbstractC69814Vw0.A00(context, num, AbstractC166987dD.A1I(), DK9.A00, c30484DbT, c30484DbT2);
        }
        return null;
    }
}
