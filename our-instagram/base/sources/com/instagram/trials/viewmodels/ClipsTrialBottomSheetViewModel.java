package com.instagram.trials.viewmodels;

import X.AbstractC07080Za;
import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.AbstractC25229BEm;
import X.AbstractC61152qd;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C153936w2;
import X.C24721Ip;
import X.C54482O5k;
import X.EnumC37319GcL;
import X.InterfaceC19390xP;
import X.InterfaceC24731Iq;
import X.NXM;
import com.instagram.trials.impl.TrialsPreferencesImpl;
import com.instagram.trials.model.TrialMetricsData;
import com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl;

/* loaded from: classes9.dex */
public final class ClipsTrialBottomSheetViewModel extends AbstractC61152qd {
    public final EnumC37319GcL A00;
    public final C54482O5k A01;
    public final TrialsPreferencesImpl A02;
    public final C153936w2 A03;
    public final TrialMetricsData A04;
    public final ClipsTrialBottomSheetRepositoryImpl A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final InterfaceC24731Iq A09;
    public final InterfaceC19390xP A0A;
    public final C05A A0B;
    public final C0UO A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 18
            boolean r0 = X.PXB.A03(r6, r3)
            if (r0 == 0) goto L41
            r4 = r6
            X.PXB r4 = (X.PXB) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L49
            X.AbstractC09560e7.A00(r1)
        L24:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L46
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L46
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L31:
            X.AbstractC09560e7.A00(r1)
            com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl r1 = r5.A05
            java.lang.String r0 = r5.A06
            r4.A00 = r2
            java.lang.Object r1 = r1.A03(r0, r4)
            if (r1 != r3) goto L24
            return r3
        L41:
            X.PXB r4 = X.PXB.A00(r5, r6, r3)
            goto L16
        L46:
            X.0eB r3 = X.C0eB.A00
            return r3
        L49:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel.A00(com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel, X.1Ds):java.lang.Object");
    }

    public ClipsTrialBottomSheetViewModel(EnumC37319GcL enumC37319GcL, C54482O5k c54482O5k, TrialsPreferencesImpl trialsPreferencesImpl, C153936w2 c153936w2, TrialMetricsData trialMetricsData, ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1R(str, str2);
        this.A05 = clipsTrialBottomSheetRepositoryImpl;
        this.A06 = str;
        this.A08 = str2;
        this.A03 = c153936w2;
        this.A0E = z;
        this.A07 = str3;
        this.A00 = enumC37319GcL;
        this.A0D = z2;
        this.A04 = trialMetricsData;
        this.A01 = c54482O5k;
        this.A02 = trialsPreferencesImpl;
        this.A0F = z3;
        C008002u A00 = C10E.A00(NXM.A00);
        this.A0B = A00;
        this.A0C = AbstractC208910l.A02(A00);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A09 = A12;
        this.A0A = AbstractC07080Za.A03(A12);
    }
}
