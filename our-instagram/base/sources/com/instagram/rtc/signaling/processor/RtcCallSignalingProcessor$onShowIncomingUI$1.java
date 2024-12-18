package com.instagram.rtc.signaling.processor;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1WB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC58275PsT;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.signaling.processor.RtcCallSignalingProcessor$onShowIncomingUI$1", f = "RtcCallSignalingProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcCallSignalingProcessor$onShowIncomingUI$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ InterfaceC58275PsT A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ RtcConnectionEntity A02;
    public final /* synthetic */ C1WB A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCallSignalingProcessor$onShowIncomingUI$1(InterfaceC58275PsT interfaceC58275PsT, UserSession userSession, RtcConnectionEntity rtcConnectionEntity, C1WB c1wb, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = c1wb;
        this.A01 = userSession;
        this.A02 = rtcConnectionEntity;
        this.A04 = z;
        this.A00 = interfaceC58275PsT;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C1WB c1wb = this.A03;
        return new RtcCallSignalingProcessor$onShowIncomingUI$1(this.A00, this.A01, this.A02, c1wb, interfaceC23621Ds, this.A04);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RtcCallSignalingProcessor$onShowIncomingUI$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a9, code lost:
    
        if (r12 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x021a, code lost:
    
        if (r7 != 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02e0, code lost:
    
        if (r9.priorityCallSenders == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02e4, code lost:
    
        if (r10 != false) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARN: Type inference failed for: r4v70, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.Xpo] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.signaling.processor.RtcCallSignalingProcessor$onShowIncomingUI$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
