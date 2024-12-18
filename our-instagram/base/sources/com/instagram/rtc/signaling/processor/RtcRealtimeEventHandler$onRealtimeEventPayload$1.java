package com.instagram.rtc.signaling.processor;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C93864Jw;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.signaling.processor.RtcRealtimeEventHandler$onRealtimeEventPayload$1", f = "RtcRealtimeEventHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcRealtimeEventHandler$onRealtimeEventPayload$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ C93864Jw A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcRealtimeEventHandler$onRealtimeEventPayload$1(C93864Jw c93864Jw, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A00 = c93864Jw;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new RtcRealtimeEventHandler$onRealtimeEventPayload$1(this.A00, this.A02, this.A01, this.A03, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RtcRealtimeEventHandler$onRealtimeEventPayload$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
    
        if (r1 == X.EnumC53138Ner.A04) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
    
        if (r1 != X.C05F.A0Y) goto L11;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.signaling.processor.RtcRealtimeEventHandler$onRealtimeEventPayload$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
