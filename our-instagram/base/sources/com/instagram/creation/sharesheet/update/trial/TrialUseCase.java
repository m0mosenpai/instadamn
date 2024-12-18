package com.instagram.creation.sharesheet.update.trial;

import X.AbstractC09440dt;
import X.AbstractC153926w1;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC43594JPz;
import X.AnonymousClass057;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06160Ug;
import X.C0UO;
import X.C0fO;
import X.C10M;
import X.C12L;
import X.C153936w2;
import X.C19K;
import X.C19L;
import X.C50161MDo;
import X.C50634MWv;
import X.C51754Mtd;
import X.C51756Mtf;
import X.C52457NJb;
import X.EnumC09460dv;
import X.InterfaceC06180Ui;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC15070pN;
import X.OX6;
import X.PZW;
import com.facebook.systrace.Systrace;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.common.session.UserSession;
import com.instagram.trials.impl.TrialsPreferencesImpl;

/* loaded from: classes9.dex */
public final class TrialUseCase extends OX6 {
    public final UserSession A00;
    public final C52457NJb A01;
    public final C153936w2 A02;
    public final InterfaceC09390do A03;
    public final C19L A04;
    public final InterfaceC06180Ui A05;
    public final C05A A06;
    public final C05A A07;
    public final InterfaceC15070pN A08;
    public final C0UO A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if (r1 == false) goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.api.schemas.MediaTrialGraduationStrategy r10, com.instagram.creation.sharesheet.update.trial.TrialUseCase r11, X.InterfaceC23621Ds r12) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.update.trial.TrialUseCase.A01(com.instagram.api.schemas.MediaTrialGraduationStrategy, com.instagram.creation.sharesheet.update.trial.TrialUseCase, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrialUseCase(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C52457NJb c52457NJb, boolean z, boolean z2) {
        super(c52457NJb);
        C19K A13 = AbstractC43594JPz.A13(C12L.A00, 1375895555);
        AbstractC25229BEm.A1I(userSession, 2, A13);
        this.A01 = c52457NJb;
        this.A00 = userSession;
        this.A0A = z;
        this.A0B = z2;
        this.A04 = A13;
        C008002u A1H = AbstractC25225BEi.A1H(new C50634MWv(7, 4, false, false));
        this.A07 = A1H;
        this.A09 = A1H;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A05 = A00;
        this.A08 = new C06160Ug(null, A00);
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A03, new C50161MDo(this, 1));
        this.A02 = AbstractC153926w1.A01(interfaceC11380iw, userSession, A04().A0N);
        this.A06 = AbstractC25235BEs.A1A(true);
    }

    public static final TrialsPreferencesImpl A00(TrialUseCase trialUseCase) {
        return (TrialsPreferencesImpl) AbstractC166987dD.A17(trialUseCase.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (X.C51754Mtd.A0M(r18) == X.EnumC76383bi.A06) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r0.A00 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (X.AbstractC166987dD.A1b(r0) != true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (A04().A0k == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(boolean r19) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.update.trial.TrialUseCase.A08(boolean):void");
    }

    public final void A09(boolean z) {
        C51754Mtd A00;
        MediaTrialGraduationStrategy mediaTrialGraduationStrategy;
        if (Systrace.A0E(1L)) {
            C0fO.A01("TrialUseCase.setAutoGraduationEnabled", -44755192);
        }
        try {
            C51756Mtf c51756Mtf = null;
            PZW.A01(this, this.A04, 22, z);
            if (((C50634MWv) this.A07.getValue()).A01) {
                if (!z) {
                    mediaTrialGraduationStrategy = MediaTrialGraduationStrategy.A04;
                } else {
                    mediaTrialGraduationStrategy = MediaTrialGraduationStrategy.A05;
                }
                c51756Mtf = new C51756Mtf(mediaTrialGraduationStrategy);
            }
            A00 = C51754Mtd.A00(null, c51756Mtf, null, null, null, null, null, null, null, null, null, null, A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
            A07(A00);
            if (Systrace.A0E(1L)) {
                C0fO.A00(604206652);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1424524979);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:5:0x0010, B:7:0x001c, B:11:0x0027, B:12:0x002c, B:14:0x003f, B:16:0x004c, B:19:0x0063, B:21:0x0088, B:31:0x006f, B:36:0x001f), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(boolean r11) {
        /*
            r10 = this;
            r8 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L10
            r1 = -956417850(0xffffffffc6fe38c6, float:-32540.387)
            java.lang.String r0 = "TrialUseCase.setEnabled"
            X.C0fO.A01(r0, r1)
        L10:
            X.05A r7 = r10.A07     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r7.getValue()     // Catch: java.lang.Throwable -> La1
            X.MWv r0 = (X.C50634MWv) r0     // Catch: java.lang.Throwable -> La1
            boolean r0 = r0.A00     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L1f
            com.instagram.api.schemas.MediaTrialGraduationStrategy r6 = com.instagram.api.schemas.MediaTrialGraduationStrategy.A05     // Catch: java.lang.Throwable -> La1
            goto L21
        L1f:
            com.instagram.api.schemas.MediaTrialGraduationStrategy r6 = com.instagram.api.schemas.MediaTrialGraduationStrategy.A04     // Catch: java.lang.Throwable -> La1
        L21:
            r5 = 0
            if (r11 == 0) goto L25
            goto L27
        L25:
            r1 = r5
            goto L2c
        L27:
            X.Mtf r1 = new X.Mtf     // Catch: java.lang.Throwable -> La1
            r1.<init>(r6)     // Catch: java.lang.Throwable -> La1
        L2c:
            X.Mtd r0 = r10.A04()     // Catch: java.lang.Throwable -> La1
            X.Mtd r0 = X.C51754Mtd.A02(r1, r0)     // Catch: java.lang.Throwable -> La1
            r10.A07(r0)     // Catch: java.lang.Throwable -> La1
            com.instagram.common.session.UserSession r3 = r10.A00     // Catch: java.lang.Throwable -> La1
            boolean r0 = X.AbstractC55222Oeo.A04(r3)     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L6f
            X.0Tz r2 = X.C06090Tz.A05     // Catch: java.lang.Throwable -> La1
            r0 = 2342168176156357430(0x20810d8c00063336, double:4.069967009316565E-152)
            boolean r0 = X.C18U.A06(r2, r3, r0)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L6f
        L4c:
            java.lang.Object r4 = r7.getValue()     // Catch: java.lang.Throwable -> La1
            r0 = r4
            X.MWv r0 = (X.C50634MWv) r0     // Catch: java.lang.Throwable -> La1
            boolean r3 = r0.A02     // Catch: java.lang.Throwable -> La1
            boolean r2 = r0.A00     // Catch: java.lang.Throwable -> La1
            r1 = 4
            X.MWv r0 = new X.MWv     // Catch: java.lang.Throwable -> La1
            r0.<init>(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> La1
            boolean r0 = r7.AIi(r4, r0)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L4c
            X.19L r2 = r10.A04     // Catch: java.lang.Throwable -> La1
            r1 = 1
            X.D4z r0 = new X.D4z     // Catch: java.lang.Throwable -> La1
            r0.<init>(r10, r5, r1)     // Catch: java.lang.Throwable -> La1
            X.AbstractC166987dD.A1Z(r0, r2)     // Catch: java.lang.Throwable -> La1
            goto L86
        L6f:
            java.lang.Object r4 = r7.getValue()     // Catch: java.lang.Throwable -> La1
            r0 = r4
            X.MWv r0 = (X.C50634MWv) r0     // Catch: java.lang.Throwable -> La1
            boolean r3 = r0.A02     // Catch: java.lang.Throwable -> La1
            boolean r2 = r0.A00     // Catch: java.lang.Throwable -> La1
            r1 = 4
            X.MWv r0 = new X.MWv     // Catch: java.lang.Throwable -> La1
            r0.<init>(r11, r3, r2, r1)     // Catch: java.lang.Throwable -> La1
            boolean r0 = r7.AIi(r4, r0)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L6f
        L86:
            if (r11 == 0) goto L94
            X.19L r2 = r10.A04     // Catch: java.lang.Throwable -> La1
            r1 = 43
            X.PZZ r0 = new X.PZZ     // Catch: java.lang.Throwable -> La1
            r0.<init>(r10, r6, r5, r1)     // Catch: java.lang.Throwable -> La1
            X.AbstractC166987dD.A1Z(r0, r2)     // Catch: java.lang.Throwable -> La1
        L94:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto La0
            r0 = 1182674578(0x467e2e92, float:16267.643)
            X.C0fO.A00(r0)
        La0:
            return
        La1:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto Lae
            r0 = -1732808992(0xffffffff98b76ee0, float:-4.7416346E-24)
            X.C0fO.A00(r0)
        Lae:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.update.trial.TrialUseCase.A0A(boolean):void");
    }
}
