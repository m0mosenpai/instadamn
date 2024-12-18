package X;

import java.io.File;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OMB {
    public final OTB A00 = OTB.A01.A00();

    public List A03(C6FW c6fw) {
        Object A03 = c6fw.A03(4);
        AbstractC25225BEi.A1S(A03);
        return AbstractC166987dD.A1J(A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r1.startsWith(X.MSX.A0i(r8.getCacheDir())) != true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r0 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r1 = X.AbstractC166987dD.A11(r10.getPath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r1.exists() != true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        if (r13 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.0NO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A01(X.C6FQ r26, X.C6FW r27) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OMB.A01(X.6FQ, X.6FW):java.util.ArrayList");
    }

    public File A02(String str) {
        return File.createTempFile(AnonymousClass001.A0Q("scp_temp_", System.nanoTime()), AnonymousClass001.A0D(str, '.'));
    }

    public void A04(C6FQ c6fq, C6FW c6fw, String str) {
        C131845xK.A00(c6fq, new C6FW(AbstractC166987dD.A1J(str)), ((C1344465q) c6fw.A02()).A00);
    }
}
