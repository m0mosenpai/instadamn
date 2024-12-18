package com.instagram.rtc.interactor.participants;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16600sD;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.NU4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.interactor.participants.RtcCallParticipantsInteractor$participantNames$1", f = "RtcCallParticipantsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcCallParticipantsInteractor$participantNames$1 extends AbstractC23611Dp implements InterfaceC16600sD {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ NU4 A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantsInteractor$participantNames$1(NU4 nu4, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        super(4, interfaceC23621Ds);
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A03 = nu4;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AbstractC166987dD.A1a(obj3);
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A05;
        RtcCallParticipantsInteractor$participantNames$1 rtcCallParticipantsInteractor$participantNames$1 = new RtcCallParticipantsInteractor$participantNames$1(this.A03, (InterfaceC23621Ds) obj4, interfaceC16820sZ, interfaceC16820sZ2);
        rtcCallParticipantsInteractor$participantNames$1.A00 = obj;
        rtcCallParticipantsInteractor$participantNames$1.A01 = obj2;
        rtcCallParticipantsInteractor$participantNames$1.A02 = A1a;
        return rtcCallParticipantsInteractor$participantNames$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r0.length() == 0) goto L8;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r7 = r8.A00
            X.Mti r7 = (X.C51759Mti) r7
            java.lang.Object r6 = r8.A01
            X.O4Y r6 = (X.O4Y) r6
            boolean r5 = r8.A02
            X.0sZ r0 = r8.A04
            java.lang.Object r3 = r0.invoke()
            X.Ms8 r3 = (X.C51677Ms8) r3
            X.0sZ r0 = r8.A05
            java.lang.Object r2 = r0.invoke()
            X.MsA r2 = (X.C51679MsA) r2
            r4 = 0
            if (r3 == 0) goto L2b
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L2b
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L2c
        L2b:
            r1 = 1
        L2c:
            java.lang.String r0 = ""
            if (r1 != 0) goto L39
            if (r5 != 0) goto L39
            if (r3 == 0) goto L38
            java.lang.String r2 = r3.A03
            if (r2 != 0) goto L47
        L38:
            return r0
        L39:
            if (r2 == 0) goto L48
            java.lang.String r2 = r2.A03
            if (r2 == 0) goto L48
            int r1 = r2.length()
            if (r1 == 0) goto L48
            if (r5 != 0) goto L48
        L47:
            return r2
        L48:
            java.util.Map r5 = r6.A00
            java.lang.Object r2 = r7.A00
            com.instagram.rtc.rsys.models.EngineModel r2 = (com.instagram.rtc.rsys.models.EngineModel) r2
            if (r2 == 0) goto L8a
            com.instagram.rtc.rsys.models.IgCallModel r1 = r2.callModel
            if (r1 == 0) goto L8a
            com.instagram.rtc.rsys.models.ParticipantModel r6 = r1.selfParticipant
        L56:
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            if (r2 == 0) goto L8c
            com.instagram.rtc.rsys.models.IgCallModel r1 = r2.callModel
            if (r1 == 0) goto L8c
            java.util.ArrayList r1 = r1.participants
            if (r1 == 0) goto L8c
            java.util.Iterator r7 = r1.iterator()
        L68:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8c
            com.instagram.rtc.rsys.models.ParticipantModel r1 = X.MSW.A0s(r7)
            java.lang.String r1 = r1.userId
            java.lang.Object r1 = r5.get(r1)
            X.MtC r1 = (X.C51731MtC) r1
            if (r1 == 0) goto L68
            java.lang.String r2 = r1.A04
            if (r2 == 0) goto L68
            int r1 = r2.length()
            if (r1 == 0) goto L68
            r3.add(r2)
            goto L68
        L8a:
            r6 = r4
            goto L56
        L8c:
            if (r6 == 0) goto Lb5
            X.NU4 r1 = r8.A03
            X.0cb r2 = X.C17060sy.A01
            com.instagram.common.session.UserSession r1 = r1.A06
            com.instagram.user.model.User r2 = r2.A01(r1)
            java.lang.String r1 = r6.userId
            java.lang.Object r1 = r5.get(r1)
            X.MtC r1 = (X.C51731MtC) r1
            if (r1 == 0) goto La6
            java.lang.String r1 = r1.A04
            if (r1 != 0) goto Lb2
        La6:
            X.17P r1 = r2.A03
            java.lang.String r1 = r1.B3r()
            if (r1 != 0) goto Lb2
            java.lang.String r1 = r2.getUsername()
        Lb2:
            r3.add(r1)
        Lb5:
            java.lang.String r1 = ", "
            java.lang.String r0 = X.AbstractC001800i.A0P(r1, r0, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.interactor.participants.RtcCallParticipantsInteractor$participantNames$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
