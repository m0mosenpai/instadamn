package com.instagram.preferences.common.datastore;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC43594JPz;
import X.C12N;
import X.C14360o3;
import X.C19L;
import X.C50361MLn;
import X.C57165PZj;
import X.C57662PiD;
import X.C57750Pjd;
import X.InterfaceC105054oL;
import X.InterfaceC23621Ds;
import X.InterfaceC50122Sb;
import X.InterfaceC58011Pnv;
import X.MSW;
import X.MT1;
import java.util.List;

/* loaded from: classes9.dex */
public final class IgDatastoreEditor implements InterfaceC105054oL {
    public final InterfaceC58011Pnv A00;
    public final List A01;
    public final C19L A02;

    @Override // X.InterfaceC105054oL
    public final InterfaceC105054oL E7J(String str, String str2) {
        C14360o3.A0B(str2, 1);
        A00(new MT1(str), str2);
        return this;
    }

    private final void A00(MT1 mt1, Object obj) {
        this.A01.add(new C57750Pjd(3, obj, mt1));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.InterfaceC105054oL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ABt(X.InterfaceC23621Ds r9) {
        /*
            r8 = this;
            r3 = 49
            boolean r0 = X.PX5.A02(r9, r3)
            if (r0 == 0) goto L22
            r7 = r9
            X.PX5 r7 = (X.PX5) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L2e
            goto L2a
        L22:
            r0 = 42
            X.PX5 r7 = new X.PX5
            r7.<init>(r8, r9, r3, r0)
            goto L16
        L2a:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> L62
            goto L5f
        L2e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L33:
            X.AbstractC09560e7.A00(r1)
            java.util.List r0 = r8.A01
            java.util.List r1 = X.AbstractC001800i.A0a(r0)
            r0.clear()
            X.Pnv r5 = r8.A00     // Catch: java.lang.Throwable -> L62
            r7.A00 = r2     // Catch: java.lang.Throwable -> L62
            r4 = 0
            r0 = 46
            r3 = 42
            X.PZU r2 = new X.PZU     // Catch: java.lang.Throwable -> L62
            r2.<init>(r1, r4, r0, r3)     // Catch: java.lang.Throwable -> L62
            r1 = 31
            X.D52 r0 = new X.D52     // Catch: java.lang.Throwable -> L62
            r0.<init>(r2, r4, r1, r3)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r5.FAf(r7, r0)     // Catch: java.lang.Throwable -> L62
            if (r0 == r6) goto L5c
            X.0eB r0 = X.C0eB.A00     // Catch: java.lang.Throwable -> L62
        L5c:
            if (r0 != r6) goto L5f
            return r6
        L5f:
            X.0eB r6 = X.C0eB.A00
            return r6
        L62:
            r2 = move-exception
            java.lang.String r1 = "Failed to write to datastore"
            X.Ne4 r0 = new X.Ne4
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.preferences.common.datastore.IgDatastoreEditor.ABt(X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC105054oL
    public final InterfaceC105054oL AHV() {
        this.A01.add(C57662PiD.A00);
        return this;
    }

    @Override // X.InterfaceC105054oL
    public final InterfaceC50122Sb AIX() {
        List list = this.A01;
        List A0a = AbstractC001800i.A0a(list);
        list.clear();
        return MSW.A1H(new C57165PZj(this, A0a, (InterfaceC23621Ds) null, 14), this.A02);
    }

    @Override // X.InterfaceC105054oL
    public final InterfaceC105054oL E76(String str, boolean z) {
        A00(new MT1(str), Boolean.valueOf(z));
        return this;
    }

    @Override // X.InterfaceC105054oL
    public final InterfaceC105054oL E7C(String str, int i) {
        A00(new MT1(str), Integer.valueOf(i));
        return this;
    }

    @Override // X.InterfaceC105054oL
    public final InterfaceC105054oL E7F(String str, long j) {
        A00(new MT1(str), Long.valueOf(j));
        return this;
    }

    @Override // X.InterfaceC105054oL
    public final InterfaceC105054oL EEi(String str) {
        this.A01.add(new C50361MLn(str, 44));
        return this;
    }

    public IgDatastoreEditor(InterfaceC58011Pnv interfaceC58011Pnv, C12N c12n) {
        AbstractC167017dG.A1P(interfaceC58011Pnv, c12n);
        this.A00 = interfaceC58011Pnv;
        this.A02 = AbstractC43594JPz.A13(c12n, 1393575193);
        this.A01 = AbstractC166987dD.A1E();
    }
}
