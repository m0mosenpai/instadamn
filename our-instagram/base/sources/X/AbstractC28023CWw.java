package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CWw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28023CWw {
    public static final C26092Bgc A00(C6FG c6fg, C102884kP c102884kP, long j) {
        C26112Bgw c26112Bgw;
        C26104Bgo c26104Bgo;
        if (c102884kP.A05 == 16621) {
            String A0F = c102884kP.A0F();
            float A00 = AbstractC25231BEo.A00(j);
            float A002 = AbstractC68291VLd.A00(A0F, A00, A00);
            String A0G = c102884kP.A0G();
            float A003 = AbstractC25232BEp.A00(j);
            long A004 = CCR.A00(A002, AbstractC68291VLd.A00(A0G, A003, A003));
            C102884kP A08 = c102884kP.A08(38);
            if (A08 != null) {
                c26112Bgw = AbstractC27500CBv.A00(A08, j);
            } else {
                c26112Bgw = C26112Bgw.A07;
            }
            C102884kP A082 = c102884kP.A08(35);
            if (A082 != null) {
                c26104Bgo = AbstractC27497CBs.A00(A082, A004);
            } else {
                c26104Bgo = null;
            }
            boolean A0S = c102884kP.A0S(41, false);
            List<C102884kP> A0M = c102884kP.A0M();
            C14360o3.A07(A0M);
            ArrayList A0q = AbstractC167017dG.A0q(A0M);
            for (C102884kP c102884kP2 : A0M) {
                C14360o3.A0A(c102884kP2);
                A0q.add(A01(c6fg, c102884kP2, A004));
            }
            return new C26092Bgc(c26104Bgo, c26112Bgw, A0q, A004, A0S);
        }
        throw AbstractC166987dD.A12("Expected Canvas group command.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (r0 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        if (r0 == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC30925Dic A01(X.C6FG r17, X.C102884kP r18, long r19) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28023CWw.A01(X.6FG, X.4kP, long):X.Dic");
    }
}
