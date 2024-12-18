package X;

import java.util.List;

/* renamed from: X.G2k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36358G2k implements InterfaceC37156GYt {
    public final EnumC31337Dq2 A00;
    public final List A01;

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r1 == X.EnumC31337Dq2.A06) goto L9;
     */
    @Override // X.InterfaceC37156GYt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getItems() {
        /*
            r20 = this;
            r4 = r20
            java.util.List r0 = r4.A01
            java.util.ArrayList r3 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r2 = r0.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r6 = r2.next()
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            X.Dq2 r1 = r4.A00
            X.Dq2 r0 = X.EnumC31337Dq2.A07
            r18 = 0
            if (r1 == r0) goto L26
            X.Dq2 r0 = X.EnumC31337Dq2.A06
            r17 = 0
            if (r1 != r0) goto L28
        L26:
            r17 = 1
        L28:
            X.Dq2 r0 = X.EnumC31337Dq2.A04
            if (r1 != r0) goto L2e
            r18 = 1
        L2e:
            r7 = 0
            r8 = 0
            X.E9f r5 = new X.E9f
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r19 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.add(r5)
            goto Lc
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36358G2k.getItems():java.util.List");
    }

    public C36358G2k(EnumC31337Dq2 enumC31337Dq2, List list) {
        this.A01 = list;
        this.A00 = enumC31337Dq2;
    }
}
