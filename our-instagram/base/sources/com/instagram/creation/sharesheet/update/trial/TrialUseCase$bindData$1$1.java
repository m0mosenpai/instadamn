package com.instagram.creation.sharesheet.update.trial;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C51754Mtd;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.sharesheet.update.trial.TrialUseCase$bindData$1$1", f = "TrialUseCase.kt", i = {0, 0, 0}, l = {82}, m = "invokeSuspend", n = {"$this$update$iv", "prevValue$iv", "isTrialToggleEnabled"}, s = {"L$0", "L$3", "I$0"})
/* loaded from: classes9.dex */
public final class TrialUseCase$bindData$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public final /* synthetic */ C51754Mtd A09;
    public final /* synthetic */ TrialUseCase A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrialUseCase$bindData$1$1(C51754Mtd c51754Mtd, TrialUseCase trialUseCase, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A09 = c51754Mtd;
        this.A0A = trialUseCase;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new TrialUseCase$bindData$1$1(this.A09, this.A0A, interfaceC23621Ds);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r2.AIi(r2.getValue(), X.AbstractC166997dE.A0a()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        X.PZT.A03(r3, r3.A04, 49);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return X.C0eB.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (X.AbstractC31176DnK.A1b(r2) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009e -> B:4:0x001e). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1JX r7 = X.C1JX.A02
            int r0 = r12.A02
            r6 = 1
            if (r0 == 0) goto L54
            int r9 = r12.A01
            boolean r10 = r12.A08
            int r8 = r12.A00
            java.lang.Object r5 = r12.A06
            java.lang.Object r4 = r12.A05
            X.Mtd r4 = (X.C51754Mtd) r4
            java.lang.Object r3 = r12.A04
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r3 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r3
            java.lang.Object r2 = r12.A03
            X.05A r2 = (X.C05A) r2
            X.AbstractC09560e7.A00(r13)
        L1e:
            boolean r9 = X.AbstractC167007dF.A1M(r9)
            boolean r11 = X.AbstractC166987dD.A1a(r13)
        L26:
            r1 = 4
            X.MWv r0 = new X.MWv
            r0.<init>(r9, r10, r11, r1)
            boolean r0 = r2.AIi(r5, r0)
            if (r0 == 0) goto L63
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r3 = r12.A0A
            X.05A r2 = r3.A06
            boolean r0 = X.AbstractC31176DnK.A1b(r2)
            if (r0 == 0) goto L51
        L3c:
            java.lang.Object r1 = r2.getValue()
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L3c
            X.19L r1 = r3.A04
            r0 = 49
            X.PZT.A03(r3, r1, r0)
        L51:
            X.0eB r7 = X.C0eB.A00
            return r7
        L54:
            X.AbstractC09560e7.A00(r13)
            X.Mtd r4 = r12.A09
            X.Mtf r0 = r4.A01
            boolean r8 = X.AbstractC167007dF.A1W(r0)
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r3 = r12.A0A
            X.05A r2 = r3.A07
        L63:
            java.lang.Object r5 = r2.getValue()
            boolean r9 = X.AbstractC167007dF.A1M(r8)
            com.instagram.common.session.UserSession r0 = r3.A00
            boolean r10 = X.AbstractC55222Oeo.A04(r0)
            X.Mtf r0 = r4.A01
            if (r0 == 0) goto L84
            X.Mtf r0 = r4.A01
            if (r0 == 0) goto L82
            java.lang.Object r1 = r0.A00
        L7b:
            com.instagram.api.schemas.MediaTrialGraduationStrategy r0 = com.instagram.api.schemas.MediaTrialGraduationStrategy.A05
            boolean r11 = X.AbstractC167007dF.A1X(r1, r0)
            goto L26
        L82:
            r1 = 0
            goto L7b
        L84:
            com.instagram.trials.impl.TrialsPreferencesImpl r0 = com.instagram.creation.sharesheet.update.trial.TrialUseCase.A00(r3)
            r12.A03 = r2
            r12.A04 = r3
            r12.A05 = r4
            r12.A06 = r5
            r12.A07 = r5
            r12.A00 = r8
            r12.A08 = r10
            r12.A01 = r9
            r12.A02 = r6
            java.lang.Object r13 = r0.A01(r12)
            if (r13 != r7) goto L1e
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.update.trial.TrialUseCase$bindData$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TrialUseCase$bindData$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
