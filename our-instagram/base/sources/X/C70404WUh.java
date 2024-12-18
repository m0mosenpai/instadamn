package X;

import java.io.File;

/* renamed from: X.WUh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70404WUh implements InterfaceC03450Gy {
    public boolean A00;
    public final /* synthetic */ WUI A01;

    public C70404WUh(WUI wui) {
        this.A01 = wui;
    }

    @Override // X.InterfaceC03450Gy
    public final void E4z(File file) {
        WUI wui = this.A01;
        if (!wui.A01.equals(file) && !this.A00) {
            file.delete();
        }
        if (this.A00 && file.equals(wui.A02)) {
            this.A00 = false;
        }
    }

    @Override // X.InterfaceC03450Gy
    public final void E54(File file) {
        if (!this.A00 && file.equals(this.A01.A02)) {
            this.A00 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (".tmp".equals(r1) != false) goto L10;
     */
    @Override // X.InterfaceC03450Gy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FDl(java.io.File r10) {
        /*
            r9 = this;
            boolean r0 = r9.A00
            if (r0 == 0) goto L87
            X.WUI r6 = r9.A01
            java.lang.String r8 = r10.getName()
            r7 = 46
            int r3 = r8.lastIndexOf(r7)
            if (r3 <= 0) goto L87
            java.lang.String r1 = r8.substring(r3)
            java.lang.String r5 = ".cnt"
            r4 = r5
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L27
            java.lang.String r5 = ".tmp"
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L87
        L27:
            r2 = 0
            java.lang.String r1 = r8.substring(r2, r3)
            java.lang.String r3 = ".tmp"
            boolean r0 = r5.equals(r3)
            if (r0 == 0) goto L3e
            int r0 = r1.lastIndexOf(r7)
            if (r0 <= 0) goto L87
            java.lang.String r1 = r1.substring(r2, r0)
        L3e:
            int r0 = r1.hashCode()
            int r0 = r0 % 100
            int r0 = java.lang.Math.abs(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r0 = r6.A02
            r1.append(r0)
            java.lang.String r0 = java.io.File.separator
            java.lang.String r0 = X.MSZ.A0u(r0, r2, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File r0 = r10.getParentFile()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L87
            r0 = 0
            if (r5 != r3) goto L80
            long r4 = r10.lastModified()
            X.0JM r0 = r6.A00
            long r2 = r0.now()
            long r0 = X.WUI.A04
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L87
            return
        L80:
            if (r5 != r4) goto L83
            r0 = 1
        L83:
            X.C0Hf.A01(r0)
            return
        L87:
            r10.delete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70404WUh.FDl(java.io.File):void");
    }
}
