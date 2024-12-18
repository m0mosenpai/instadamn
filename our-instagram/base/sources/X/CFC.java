package X;

import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class CFC {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object A00(C6FW c6fw) {
        Integer num;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A01;
        Object A03 = c6fw.A03(1);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A03;
        OVR ovr = OVR.A00;
        C14360o3.A0B(str, 0);
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
        synchronized (ovr) {
            C14360o3.A0B(num, 0);
            C14360o3.A0B(str2, 1);
            AbstractC06930Yk.A0E();
            new C57258Pbg(str2, num, 28).invoke();
        }
        return null;
    }
}
