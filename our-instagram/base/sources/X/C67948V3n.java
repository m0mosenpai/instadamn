package X;

/* renamed from: X.V3n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67948V3n extends C1P1 {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C166467cF A01;
    public final /* synthetic */ C68860VdG A02;

    public C67948V3n(C38321qM c38321qM, C166467cF c166467cF, C68860VdG c68860VdG) {
        this.A01 = c166467cF;
        this.A00 = c38321qM;
        this.A02 = c68860VdG;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C0f9.A0A(1001537311, C0f9.A03(-1977197567));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r0.booleanValue() == false) goto L16;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1063503202(0x3f63c562, float:0.8897306)
            int r5 = X.C0f9.A03(r0)
            X.HAh r8 = (X.C38885HAh) r8
            r0 = 700157297(0x29bb8d71, float:8.3290044E-14)
            int r6 = X.AbstractC167017dG.A0N(r8, r0)
            X.7cF r0 = r7.A01
            com.instagram.common.session.UserSession r4 = r0.A01
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r0 = r8.A02
            if (r0 == 0) goto L39
            java.util.Iterator r2 = r0.iterator()
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r1 = r2.next()
            X.1rO r1 = (X.C38891rO) r1
            X.1DU r0 = X.C1DS.A00(r4)
            X.3qg r0 = X.AbstractC168857gK.A00(r0, r1)
            r3.add(r0)
            goto L21
        L39:
            java.util.List r0 = r8.A02
            if (r0 == 0) goto L78
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf(r3)
            if (r4 == 0) goto L78
            X.1qM r3 = r7.A00
            java.lang.String r2 = r8.A01
            java.lang.Boolean r0 = r8.A00
            if (r0 == 0) goto L52
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L53
        L52:
            r1 = 0
        L53:
            java.util.List r0 = r3.A0U
            r0.addAll(r4)
            r3.A0O = r2
            r3.A0X = r1
            X.VdG r0 = r7.A02
            if (r0 == 0) goto L6b
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r0 = r0.A00
            X.1qM r1 = r0.A01
            if (r1 == 0) goto L6b
            X.V2n r0 = r0.A03
            r0.A01(r1)
        L6b:
            r0 = 1177790970(0x4633a9fa, float:11498.494)
        L6e:
            X.C0f9.A0A(r0, r6)
            r0 = 1972488987(0x7591cb1b, float:3.6963013E32)
            X.C0f9.A0A(r0, r5)
            return
        L78:
            r0 = -303966661(0xffffffffede1d63b, float:-8.7366395E27)
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67948V3n.onSuccess(java.lang.Object):void");
    }
}
