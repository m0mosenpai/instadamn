package X;

/* renamed from: X.Efa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32969Efa extends C32547EUx {
    public final C07270a1 A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32969Efa(X.C6FQ r14, X.C07270a1 r15, X.C32316ELf r16) {
        /*
            r13 = this;
            r4 = r15
            r5 = r16
            X.AbstractC167017dG.A1Q(r15, r5)
            androidx.fragment.app.FragmentActivity r1 = X.C6BQ.A04(r14)
            X.DwI r7 = X.EnumC31713DwI.A0z
            X.0iw r3 = X.C6BQ.A08(r14)
            java.lang.Integer r8 = X.C05F.A0j
            androidx.fragment.app.FragmentActivity r0 = X.C6BQ.A04(r14)
            android.net.Uri r2 = X.AbstractC31525Dt9.A00(r0)
            r6 = 0
            r0 = r13
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32969Efa.<init>(X.6FQ, X.0a1, X.ELf):void");
    }

    @Override // X.C32547EUx, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -627805681);
        super.onFail(abstractC115105If);
        C35037FcA A06 = C1Q9.A1D.A02(this.A00).A06(null, EnumC31713DwI.A0z);
        C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
        if (c40781ul != null) {
            str = c40781ul.mErrorType;
        } else {
            str = null;
        }
        if (!(abstractC115105If instanceof C115115Ig) || str == null) {
            str = super.A00;
            C14360o3.A07(str);
        }
        A06.A04("error", str);
        A06.A02();
        C0f9.A0A(1538622639, A0N);
    }
}
