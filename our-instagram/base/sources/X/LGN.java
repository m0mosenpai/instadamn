package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class LGN {
    public static final LGN A01 = new LGN();
    public final Map A00 = AbstractC166987dD.A1I();

    public final C05A A00(InterfaceC50385MMn interfaceC50385MMn) {
        C14360o3.A0B(interfaceC50385MMn, 0);
        Map map = this.A00;
        Object obj = map.get(interfaceC50385MMn);
        if (obj == null) {
            obj = AbstractC25227BEk.A0z();
            map.put(interfaceC50385MMn, obj);
        }
        return (C05A) obj;
    }

    public final void A01(MPW mpw) {
        C14360o3.A0B(mpw, 0);
        A00(mpw.CBN()).F8m(mpw);
    }
}
