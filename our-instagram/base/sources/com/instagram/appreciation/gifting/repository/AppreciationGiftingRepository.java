package com.instagram.appreciation.gifting.repository;

import X.AbstractC37302Gc3;
import X.C46613Kjq;

/* loaded from: classes8.dex */
public final class AppreciationGiftingRepository {
    public final AppreciationGiftingDataSource A00;
    public final C46613Kjq A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            r17 = this;
            r4 = 38
            r5 = r19
            boolean r0 = X.MAN.A02(r5, r4)
            r6 = r17
            if (r0 == 0) goto Lb3
            r3 = r5
            X.MAN r3 = (X.MAN) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r1 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L9f
            if (r0 != r4) goto Lbf
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L3e
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r2 = r1.A00
            r1 = 0
            X.MU9 r0 = new X.MU9
            r0.<init>(r2, r1)
        L38:
            X.0rp r2 = new X.0rp
            r2.<init>(r0)
            return r2
        L3e:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Lba
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r7 = r1.A00
            X.Jwi r7 = (X.C45053Jwi) r7
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            int r6 = r7.A00
            java.util.List r0 = r7.A03
            java.util.ArrayList r5 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r9 = r0.iterator()
        L58:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r8 = r9.next()
            X.Jwk r8 = (X.C45055Jwk) r8
            long r2 = r7.A01
            long r0 = r8.A01
            java.lang.String r11 = java.lang.String.valueOf(r0)
            int r15 = r8.A00
            java.lang.String r12 = r8.A04
            java.lang.String r13 = r8.A03
            java.lang.String r14 = r8.A02
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r16 = X.AbstractC167007dF.A1N(r8)
            X.Jwe r10 = new X.Jwe
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r5.add(r10)
            goto L58
        L83:
            com.instagram.api.schemas.ContentAppreciationDisclaimerType r1 = r7.A02
            com.instagram.api.schemas.ContentAppreciationDisclaimerType r0 = com.instagram.api.schemas.ContentAppreciationDisclaimerType.A05
            if (r1 != r0) goto L9c
            X.KbZ r8 = X.EnumC46135KbZ.A02
        L8b:
            boolean r0 = r7.A04
            X.JwS r7 = new X.JwS
            r11 = r4
            r12 = r0
            r10 = r6
            r9 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            X.MU9 r0 = new X.MU9
            r0.<init>(r7, r4)
            goto L38
        L9c:
            X.KbZ r8 = X.EnumC46135KbZ.A03
            goto L8b
        L9f:
            X.AbstractC09560e7.A00(r1)
            com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource r1 = r6.A00
            java.lang.String r0 = r6.A03
            r3.A01 = r6
            r3.A00 = r4
            r5 = r18
            java.lang.Object r1 = r1.A01(r5, r0, r3)
            if (r1 != r2) goto L28
            return r2
        Lb3:
            X.MAN r3 = new X.MAN
            r3.<init>(r6, r5, r4)
            goto L1a
        Lba:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lbf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    public AppreciationGiftingRepository(AppreciationGiftingDataSource appreciationGiftingDataSource, C46613Kjq c46613Kjq, String str, String str2) {
        AbstractC37302Gc3.A1U(str, str2);
        this.A00 = appreciationGiftingDataSource;
        this.A01 = c46613Kjq;
        this.A03 = str;
        this.A02 = str2;
    }
}
