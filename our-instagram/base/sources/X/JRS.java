package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: classes8.dex */
public final class JRS implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public JRS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static JRS A00(Object obj, int i) {
        return new JRS(obj, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01da, code lost:
    
        if (X.C2I7.A00(r2, "AdvancedCrypto") == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0265, code lost:
    
        if (r12 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
    
        if (r12.A01 == false) goto L34;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JRS.onCompletion(java.lang.Object):void");
    }
}
