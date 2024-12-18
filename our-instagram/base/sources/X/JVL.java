package X;

import com.facebook.msys.mca.MailboxCallback;

/* loaded from: classes8.dex */
public final class JVL implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public JVL(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        switch (i) {
            case 6:
            case 23:
            case 34:
            case 35:
                this.A01 = interfaceC16660sJ;
                return;
            default:
                this.A01 = interfaceC16660sJ;
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (X.C14360o3.A0K(r1, false) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018d, code lost:
    
        if (r0 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a3, code lost:
    
        if (r1 != 0) goto L63;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVL.onCompletion(java.lang.Object):void");
    }

    public JVL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public JVL(C1346766r c1346766r, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                this.A01 = c1346766r;
                return;
            default:
                this.A01 = c1346766r;
                return;
        }
    }
}
