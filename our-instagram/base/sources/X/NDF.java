package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDF extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C105824pt A02;
    public final EnumC142806cg A03;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (r0 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r0 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if (r0.CQp() != true) goto L10;
     */
    @Override // X.AbstractC61132qb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.AbstractC52922bZ create() {
        /*
            r28 = this;
            r2 = r28
            com.instagram.common.session.UserSession r11 = r2.A01
            X.6cg r15 = r2.A03
            X.NZa r1 = X.AbstractC54266Nym.A00(r11, r15)
            X.6l0 r0 = X.AbstractC147746kz.A0A
            X.0iw r10 = r2.A00
            X.6kz r5 = r0.A00(r10, r11, r15)
            X.0do r0 = r1.A06
            java.lang.Object r3 = r0.getValue()
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r3 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r3
            X.OLC r24 = r1.A02()
            X.MTU r25 = r1.A03()
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r21 = r1.A01()
            X.6lA r6 = r1.A03
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r20 = X.MSX.A0W(r1)
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r4 = r1.A04
            X.4pt r7 = r2.A02
            r1 = 1
            if (r7 == 0) goto Lad
            X.C14360o3.A0B(r11, r1)
            X.0sl r2 = X.C16930sl.A00
            X.Mse r8 = com.instagram.video.live.mvvm.model.domainmodel.IgLiveBroadcastInfoKt.A00(r7, r2)
            X.4vU r0 = r8.A03
            if (r0 == 0) goto L4b
            X.4vE r0 = r0.A05
            if (r0 == 0) goto L4b
            boolean r0 = r0.CQp()
            r9 = 1
            if (r0 == r1) goto L4c
        L4b:
            r9 = 0
        L4c:
            boolean r0 = r8.A0M
            if (r9 == 0) goto L54
            r26 = 1
            if (r0 == 0) goto L56
        L54:
            r26 = 0
        L56:
            X.Mse r2 = com.instagram.video.live.mvvm.model.domainmodel.IgLiveBroadcastInfoKt.A00(r7, r2)
            X.4vU r0 = r2.A03
            if (r0 == 0) goto Lab
            X.4vE r0 = r0.A05
            if (r0 == 0) goto Lab
            boolean r0 = r0.Az1()
            if (r0 != r1) goto Lab
        L68:
            boolean r0 = r2.A0M
            if (r1 == 0) goto L70
            r27 = 1
            if (r0 == 0) goto L72
        L70:
            r27 = 0
        L72:
            X.0do r0 = r5.A03
            java.lang.Object r2 = r0.getValue()
            X.OBA r2 = (X.OBA) r2
            X.0do r0 = r5.A08
            java.lang.Object r1 = r0.getValue()
            X.OT2 r1 = (X.OT2) r1
            X.0do r0 = r5.A04
            java.lang.Object r0 = r0.getValue()
            X.O92 r0 = (X.O92) r0
            r9 = 0
            X.7kl r5 = X.C171547kk.A03
            X.7kk r12 = r5.A00(r11)
            X.0sy r13 = X.C08730cb.A00(r11)
            X.2kX r14 = X.C57582kX.A00(r11)
            X.NaJ r8 = new X.NaJ
            r19 = r3
            r22 = r6
            r23 = r4
            r16 = r2
            r17 = r0
            r18 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r8
        Lab:
            r1 = 0
            goto L68
        Lad:
            r26 = 0
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NDF.create():X.2bZ");
    }

    public NDF(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C105824pt c105824pt, EnumC142806cg enumC142806cg) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = enumC142806cg;
        this.A02 = c105824pt;
    }
}
