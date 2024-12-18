package X;

import android.content.Context;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lqn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C49293Lqn implements InterfaceC37118GXd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass442 A01;
    public final /* synthetic */ C7TL A02;
    public final /* synthetic */ EnumC46200Kcc A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ C47Z A05;
    public final /* synthetic */ C183978Ee A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public /* synthetic */ C49293Lqn(Context context, AnonymousClass442 anonymousClass442, C7TL c7tl, EnumC46200Kcc enumC46200Kcc, DirectShareTarget directShareTarget, C47Z c47z, C183978Ee c183978Ee, String str, String str2, boolean z, boolean z2) {
        this.A02 = c7tl;
        this.A01 = anonymousClass442;
        this.A04 = directShareTarget;
        this.A0A = z;
        this.A05 = c47z;
        this.A00 = context;
        this.A06 = c183978Ee;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = enumC46200Kcc;
        this.A09 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r12.A05() != false) goto L6;
     */
    @Override // X.InterfaceC37118GXd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC29011ae AXZ(X.L1W r42, com.instagram.model.direct.DirectThreadKey r43, java.lang.Boolean r44, java.lang.Long r45) {
        /*
            r41 = this;
            r0 = r41
            X.7TL r10 = r0.A02
            X.442 r12 = r0.A01
            com.instagram.model.direct.DirectShareTarget r5 = r0.A04
            boolean r8 = r0.A0A
            X.47Z r4 = r0.A05
            android.content.Context r3 = r0.A00
            X.8Ee r2 = r0.A06
            java.lang.String r7 = r0.A07
            java.lang.String r6 = r0.A08
            X.Kcc r15 = r0.A03
            boolean r9 = r0.A09
            r1 = 1
            if (r12 == 0) goto L23
            boolean r0 = r12.A05()
            r21 = 1
            if (r0 == 0) goto L25
        L23:
            r21 = 0
        L25:
            com.instagram.common.session.UserSession r0 = r10.A00
            com.instagram.model.direct.DirectThreadKey r17 = r5.A00()
            r11 = 0
            r36 = r42
            if (r42 == 0) goto Lec
            boolean r10 = X.AbstractC46831KnQ.A00(r36)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r10)
        L38:
            java.lang.Integer r19 = X.C05F.A0N
            r24 = 0
            r16 = r0
            r20 = r8
            r22 = r24
            X.7Cz r27 = X.AbstractC159387Cy.A03(r16, r17, r18, r19, r20, r21, r22)
            r17 = r43
            if (r4 == 0) goto Ld0
            com.instagram.model.direct.DirectThreadKey r5 = r5.A00()
            X.1td r3 = X.C40121td.A00(r3, r0)
            X.7Q4 r3 = X.LLY.A03(r0, r5, r4, r3)
        L56:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r2.A01()
            java.lang.String r2 = r2.A03
            if (r2 == 0) goto Lc7
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto Lc7
            X.C14360o3.A0B(r0, r1)
            X.0sl r1 = X.C16930sl.A00
            X.9vG r1 = X.AbstractC178007vZ.A01(r0, r2, r1)
        L6d:
            if (r1 == 0) goto Lc2
            com.instagram.common.gallery.metadata.MediaUploadMetadata r4 = r3.A00
            java.lang.String r2 = r1.A02()
            r4.A03 = r2
            java.lang.String r2 = r4.A05
            boolean r2 = X.AbstractC13670mt.A0B(r2)
            if (r2 == 0) goto L87
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r3.A00
            java.lang.String r1 = r1.A03()
            r2.A05 = r1
        L87:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r2 = r3.A00
            java.lang.String r1 = r2.A0A
            if (r1 == 0) goto L93
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L9d
        L93:
            java.lang.String r1 = r3.A02()
            java.lang.String r1 = X.C197098ne.A05(r1)
            r2.A0A = r1
        L9d:
            java.lang.Class<X.1bP> r37 = X.C29481bP.class
            r35 = r0
            r38 = r7
            r39 = r6
            r40 = r8
            X.JTa r13 = X.AbstractC31277Doz.A04(r35, r36, r37, r38, r39, r40)
            long r22 = X.AbstractC31177DnL.A05()
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r9)
            X.1eO r10 = new X.1eO
            r20 = r45
            r14 = r11
            r18 = r11
            r21 = r11
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24)
            return r10
        Lc2:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r3.A00
            r1.A03 = r2
            goto L87
        Lc7:
            java.lang.String r4 = r3.A02()
            X.9vG r1 = X.AbstractC178007vZ.A00(r11, r0, r4, r1)
            goto L6d
        Ld0:
            com.instagram.pendingmedia.model.constants.ShareType r30 = com.instagram.pendingmedia.model.constants.ShareType.A0E
            X.1td r31 = X.C40121td.A00(r3, r0)
            r25 = r3
            r26 = r0
            r28 = r17
            r29 = r11
            r32 = r2
            r33 = r11
            r34 = r11
            r35 = r7
            X.7Q4 r3 = X.LLY.A02(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L56
        Lec:
            r18 = r11
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49293Lqn.AXZ(X.L1W, com.instagram.model.direct.DirectThreadKey, java.lang.Boolean, java.lang.Long):X.1ae");
    }
}
