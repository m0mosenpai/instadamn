package X;

import java.io.File;

/* renamed from: X.6XX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XX {
    public final /* synthetic */ C6XW A00;

    public C6XX(C6XW c6xw) {
        this.A00 = c6xw;
    }

    public final void A00() {
        C6XW c6xw = this.A00;
        C6XW.A01(C6XZ.A03, c6xw);
        File file = new File(OWL.A00.getFilesDir(), MSV.A00(35));
        if (file.exists()) {
            C19K A02 = AbstractC24771Iv.A02(2022716810, 3);
            AbstractC23641Du.A05(AnonymousClass191.A00, new PZS(file, null, 39), A02);
        }
        C6XW.A02(c6xw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r2.A00(r3, r1).exists() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r6 = this;
            X.6XW r5 = r6.A00
            X.6XZ r1 = X.C6XW.A00(r5)
            X.6XZ r0 = X.C6XZ.A05
            if (r1 != r0) goto L5c
            android.view.ViewGroup r0 = r5.A04()
            android.content.Context r0 = r0.getContext()
            X.C14360o3.A07(r0)
            boolean r0 = X.AbstractC15820qc.A0F(r0)
            if (r0 == 0) goto L5c
            int r0 = r5.A00
            int r1 = r0 + 1
            r5.A00 = r1
            X.6XY r0 = r5.A08
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r1 != r0) goto L5b
            X.6XZ r0 = X.C6XZ.A02
            X.C6XW.A01(r0, r5)
            X.Ib8 r1 = r5.A02
            if (r1 == 0) goto L68
            r4 = 0
            X.KcL r3 = r1.A04
            X.KcL r0 = X.EnumC46183KcL.A03
            if (r3 == r0) goto L4d
            X.OWL r2 = X.OWL.A01
            java.lang.String r1 = r1.A05
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            java.io.File r0 = r2.A00(r3, r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L68
        L4d:
            X.19L r2 = r5.A0E
            r0 = 49
            X.PZB r1 = new X.PZB
            r1.<init>(r5, r4, r0)
            X.191 r0 = X.AnonymousClass191.A00
            X.AbstractC23641Du.A05(r0, r1, r2)
        L5b:
            return
        L5c:
            X.6XZ r1 = X.C6XW.A00(r5)
            X.6XZ r0 = X.C6XZ.A02
            if (r1 == r0) goto L5b
            r6.A00()
            return
        L68:
            X.C6XW.A02(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6XX.A01():void");
    }
}
