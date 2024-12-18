package com.instagram.rtc.interactor.participants;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16570sA;
import X.InterfaceC23621Ds;
import X.NU4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.interactor.participants.RtcCallParticipantsInteractor$setup$flow$1", f = "RtcCallParticipantsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcCallParticipantsInteractor$setup$flow$1 extends AbstractC23611Dp implements InterfaceC16570sA {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ boolean A04;
    public final /* synthetic */ NU4 A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantsInteractor$setup$flow$1(NU4 nu4, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(6, interfaceC23621Ds);
        this.A05 = nu4;
        this.A06 = z;
        this.A07 = z2;
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AbstractC166987dD.A1a(obj3);
        RtcCallParticipantsInteractor$setup$flow$1 rtcCallParticipantsInteractor$setup$flow$1 = new RtcCallParticipantsInteractor$setup$flow$1(this.A05, (InterfaceC23621Ds) obj6, this.A06, this.A07);
        rtcCallParticipantsInteractor$setup$flow$1.A00 = obj;
        rtcCallParticipantsInteractor$setup$flow$1.A01 = obj2;
        rtcCallParticipantsInteractor$setup$flow$1.A04 = A1a;
        rtcCallParticipantsInteractor$setup$flow$1.A02 = obj4;
        rtcCallParticipantsInteractor$setup$flow$1.A03 = obj5;
        return rtcCallParticipantsInteractor$setup$flow$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r2.inCallState != 5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02ec, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r1.A08.A00, 36323259976854646L) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f5, code lost:
    
        if (r0 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0266, code lost:
    
        if (r2.selfParticipant.audioEnabled == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x026c, code lost:
    
        r45 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0272, code lost:
    
        if (r2.selfParticipant.videoEnabled != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0274, code lost:
    
        r45 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x027e, code lost:
    
        if (X.C14360o3.A0K(X.MSY.A0g(r19), r7) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0280, code lost:
    
        r46 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x028a, code lost:
    
        if (X.C14360o3.A0K(r2.selfParticipant.userId, r7) == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x028e, code lost:
    
        r9 = r6.A03;
        r7 = r0.A03;
        r6 = r0.A01;
        r0 = r0.A00;
        X.AbstractC167027dH.A12(r5, r7, r6);
        X.C14360o3.A0B(r0, 5);
        r23 = new X.C51876MwK(r0, r5, r7, r6, r44, r45, r46, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x028c, code lost:
    
        r46 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (X.AbstractC25231BEo.A1b(r1.A0C) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x026a, code lost:
    
        if (r3 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r8 != X.C05F.A01) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r5 == X.C05F.A0C) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0172, code lost:
    
        if (X.C14360o3.A0K(r9.userId, r7) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r2.e2eeMandated != true) goto L10;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.interactor.participants.RtcCallParticipantsInteractor$setup$flow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
