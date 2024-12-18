package X;

import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class VQT {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC103384lE A00 = C1344465q.A00(c6fw.A00.get(0));
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0B(A0B, 0);
        C70812WhV c70812WhV = (C70812WhV) A0B.A01(C70812WhV.class, C71788X4p.A00);
        Iterator A13 = AbstractC166997dE.A13(c70812WhV.igBloksIdfaDialogList);
        while (A13.hasNext()) {
            ((C0SG) AbstractC166997dE.A0l(A13)).A08();
        }
        c70812WhV.igBloksIdfaDialogList.clear();
        C6BQ.A05(c6fq).A0Z();
        if (A00 != null) {
            C131845xK.A00(c6fq, C6FW.A01, A00);
            return null;
        }
        return null;
    }
}
