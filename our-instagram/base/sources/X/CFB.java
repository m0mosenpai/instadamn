package X;

import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class CFB {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        InterfaceC103384lE A00 = C1344465q.A00(c6fw.A02());
        C14360o3.A0B(str, 0);
        OVR ovr = OVR.A00;
        String A10 = AbstractC166997dE.A10(Locale.ROOT, str);
        switch (A10.hashCode()) {
            case -1348905847:
                if (A10.equals("DISMISSED")) {
                    num = C05F.A0C;
                    break;
                }
                throw AbstractC166987dD.A14(AnonymousClass001.A0R("Unknown experience outcome ", str));
            case 1951623110:
                if (A10.equals("BACKED")) {
                    num = C05F.A0N;
                    break;
                }
                throw AbstractC166987dD.A14(AnonymousClass001.A0R("Unknown experience outcome ", str));
            case 1967871671:
                if (A10.equals("APPROVED")) {
                    num = C05F.A00;
                    break;
                }
                throw AbstractC166987dD.A14(AnonymousClass001.A0R("Unknown experience outcome ", str));
            case 2012901275:
                if (A10.equals("DENIED")) {
                    num = C05F.A01;
                    break;
                }
                throw AbstractC166987dD.A14(AnonymousClass001.A0R("Unknown experience outcome ", str));
            default:
                throw AbstractC166987dD.A14(AnonymousClass001.A0R("Unknown experience outcome ", str));
        }
        C54515O6s c54515O6s = new C54515O6s(c6fq, A00);
        synchronized (ovr) {
            C14360o3.A0B(num, 0);
            AbstractC06930Yk.A0E();
            new C57261Pbj(16, c6fq, c54515O6s, num).invoke();
        }
        return null;
    }
}
