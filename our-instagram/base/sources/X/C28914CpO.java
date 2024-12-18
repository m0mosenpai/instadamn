package X;

import com.instagram.schools.management.data.SchoolSettingsRepository;

/* renamed from: X.CpO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28914CpO implements InterfaceC48192Ji {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SchoolSettingsRepository A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    public C28914CpO(SchoolSettingsRepository schoolSettingsRepository, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2) {
        this.A04 = interfaceC16820sZ;
        this.A02 = schoolSettingsRepository;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = interfaceC16820sZ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // X.InterfaceC48192Ji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.AnonymousClass436 r28) {
        /*
            r27 = this;
            if (r28 == 0) goto Lcf
            X.2JS r4 = X.AbstractC25225BEi.A0k(r28)
            if (r4 == 0) goto Lcf
            java.lang.Class<com.instagram.schools.management.data.UpdateGradYearResponseImpl$XdtUpdateGraduation> r3 = com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation.class
            X.4OF r0 = X.C2JS.Companion
            r1 = 374151420(0x164d18fc, float:1.6567652E-25)
            r2 = 0
            r0 = 397(0x18d, float:5.56E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            X.2JS r1 = r4.getRequiredTreeField(r2, r0, r3, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation"
            X.C14360o3.A0C(r1, r0)
            if (r1 == 0) goto Lcf
            java.lang.String r0 = "success"
            boolean r0 = r1.getRequiredBooleanField(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2b:
            r14 = 1
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r14)
            r1 = r27
            if (r0 == 0) goto Ld2
            X.0sZ r0 = r1.A04
            r0.invoke()
            com.instagram.schools.management.data.SchoolSettingsRepository r13 = r1.A02
            int r15 = r1.A00
            int r12 = r1.A01
            X.05A r11 = r13.A03
        L41:
            java.lang.Object r10 = r11.getValue()
            r9 = r10
            X.Mti r9 = (X.C51759Mti) r9
            java.lang.Object r0 = r9.A01
            X.Bf2 r0 = (X.C26014Bf2) r0
            if (r0 == 0) goto Lcd
            java.lang.String r8 = r0.A04
            com.instagram.schools.management.data.SchoolAddress r7 = r0.A02
            X.5Hc r6 = r0.A06
            java.lang.String r5 = r0.A05
            boolean r4 = r0.A09
            boolean r3 = r0.A08
            java.lang.String r2 = r0.A03
            X.5Hc r1 = r0.A07
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            X.AbstractC167007dF.A1G(r7, r14, r5)
            r0 = 8
            X.C14360o3.A0B(r2, r0)
            X.Bf2 r0 = new X.Bf2
            r26 = r3
            r25 = r4
            r24 = r12
            r23 = r15
            r22 = r1
            r21 = r6
            r20 = r2
            r19 = r5
            r18 = r8
            r17 = r7
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L85:
            java.lang.Object r2 = r9.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.C14360o3.A0B(r2, r14)
            X.Mti r1 = new X.Mti
            r1.<init>(r0, r2)
            boolean r0 = r11.AIi(r10, r1)
            if (r0 == 0) goto L41
            if (r28 == 0) goto Lcc
            X.2JS r3 = X.AbstractC25225BEi.A0k(r28)
            if (r3 == 0) goto Lcc
            java.lang.Class<com.instagram.schools.management.data.UpdateGradYearResponseImpl$XdtUpdateGraduation> r2 = com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation.class
            X.4OF r0 = X.C2JS.Companion
            r1 = 374151420(0x164d18fc, float:1.6567652E-25)
            r0 = 397(0x18d, float:5.56E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            X.2JS r3 = r3.A05(r2, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation"
            X.C14360o3.A0C(r3, r0)
            if (r3 == 0) goto Lcc
            java.lang.Class<com.instagram.schools.management.data.UpdateGradYearResponseImpl$XdtUpdateGraduation$User> r2 = com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation.User.class
            r1 = 491786776(0x1d501218, float:2.7537925E-21)
            java.lang.String r0 = "user"
            X.2JS r2 = r3.getOptionalTreeField(r14, r0, r2, r1)
            if (r2 == 0) goto Lcc
            java.lang.Class<com.instagram.schools.management.data.UpdateGradYearResponseImpl$XdtUpdateGraduation$User$ShowSchoolsBadge> r1 = com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation.User.ShowSchoolsBadge.class
            r0 = 1109422879(0x4220731f, float:40.112423)
            X.AbstractC25236BEt.A0s(r2, r13, r1, r0)
        Lcc:
            return
        Lcd:
            r0 = 0
            goto L85
        Lcf:
            r0 = 0
            goto L2b
        Ld2:
            X.0sZ r0 = r1.A03
            r0.invoke()
            com.instagram.schools.management.data.SchoolSettingsRepository r0 = r1.A02
            X.0do r0 = r0.A02
            X.Ct5 r1 = X.AbstractC25226BEj.A12(r0)
            r0 = 1159(0x487, float:1.624E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            r1.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28914CpO.invoke(X.436):void");
    }
}
