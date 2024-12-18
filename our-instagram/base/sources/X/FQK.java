package X;

import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class FQK {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public final User A04;
    public final List A05;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r1 <= 2500) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.content.Context r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.A05
            int r3 = r0.size()
            boolean r0 = r4.A03
            if (r0 == 0) goto L1e
            r2 = 50
        Lc:
            if (r3 > r2) goto L19
            java.lang.String r0 = r4.A02
            if (r0 != 0) goto L19
            r4.A00 = r3
            int r0 = r3 + 1
        L16:
            r4.A01 = r0
            return
        L19:
            r4.A00 = r2
            int r0 = r2 + 2
            goto L16
        L1e:
            if (r5 == 0) goto L2f
            int r1 = X.AbstractC13880nE.A06(r5)
            r0 = 1500(0x5dc, float:2.102E-42)
            if (r1 >= r0) goto L2a
            r2 = 3
            goto Lc
        L2a:
            r0 = 2500(0x9c4, float:3.503E-42)
            r2 = 7
            if (r1 > r0) goto Lc
        L2f:
            r2 = 5
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQK.A00(android.content.Context):void");
    }

    public FQK(User user, String str, List list) {
        this.A04 = user;
        this.A05 = list;
        this.A02 = str;
    }
}
