package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class ILQ {
    public final UserSession A00;
    public final String A01;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        X.C14360o3.A0B(r5, 1);
        r8 = X.AbstractC166987dD.A1G();
        r8.putAll(r5.A01);
        r4 = r5.A00;
        r10 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r10.hasNext() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        r3 = (com.instagram.api.schemas.ProductVariantPossibleValueDictIntf) r10.next();
        r1 = r3.getId();
        X.C14360o3.A0B(r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r5.A01.get(r1) != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r11 != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r3.isPreselected() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        r1 = r3.getId();
        r0 = r3.getValue();
        X.C14360o3.A0B(r1, 0);
        X.C14360o3.A0B(r0, 1);
        r8.put(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01cf, code lost:
    
        r5 = new X.C41578IaR(r4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (r1.equals(r0) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C41726Idx A00(X.JID r14, X.C41726Idx r15) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ILQ.A00(X.JID, X.Idx):X.Idx");
    }

    public ILQ(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }
}
