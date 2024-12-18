package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.WTb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70373WTb implements InterfaceC65475Tks {
    public C71183WpV A00;
    public final C69540Vr4 A01 = new C69540Vr4();
    public final SL1 A02 = new SL1();
    public final File A03;

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0141, code lost:
    
        throw X.MSY.A0X("unexpected journal line: ", java.util.Arrays.toString(r14));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized X.C71183WpV A00() {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70373WTb.A00():X.WpV");
    }

    @Override // X.InterfaceC65475Tks
    public final File AXN(InterfaceC65617To8 interfaceC65617To8) {
        String A00 = this.A02.A00(interfaceC65617To8);
        android.util.Log.isLoggable("DiskLruCacheWrapper", 2);
        try {
            C71183WpV A002 = A00();
            synchronized (A002) {
                C71183WpV.A01(A002);
                C69371VmH c69371VmH = (C69371VmH) A002.A0A.get(A00);
                if (c69371VmH != null && c69371VmH.A01) {
                    File[] fileArr = c69371VmH.A02;
                    int length = fileArr.length;
                    for (int i = 0; i < length; i = 1) {
                        if (fileArr[i].exists()) {
                        }
                    }
                    A002.A00++;
                    C71183WpV.A04(A002, A002.A02, "READ", A00);
                    if (C71183WpV.A08(A002)) {
                        A002.A0C.submit(A002.A0B);
                    }
                    return fileArr[0];
                }
                return null;
            }
        } catch (IOException e) {
            if (android.util.Log.isLoggable("DiskLruCacheWrapper", 5)) {
                android.util.Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x00ae, code lost:
    
        if (r1.A00 != null) goto L45;
     */
    @Override // X.InterfaceC65475Tks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E6x(X.InterfaceC65617To8 r10, X.C69048Vgp r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70373WTb.E6x(X.To8, X.Vgp):void");
    }

    @Deprecated
    public C70373WTb(File file) {
        this.A03 = file;
    }
}
