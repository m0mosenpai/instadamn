package com.instagram.rtc.stateprovider;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.stateprovider.RtcCallAiStatusStateProvider$getAiStatus$1", f = "RtcCallAiStatusStateProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcCallAiStatusStateProvider$getAiStatus$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCallAiStatusStateProvider$getAiStatus$1(String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = str;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AbstractC166987dD.A1a(obj2);
        RtcCallAiStatusStateProvider$getAiStatus$1 rtcCallAiStatusStateProvider$getAiStatus$1 = new RtcCallAiStatusStateProvider$getAiStatus$1(this.A02, (InterfaceC23621Ds) obj3);
        rtcCallAiStatusStateProvider$getAiStatus$1.A00 = obj;
        rtcCallAiStatusStateProvider$getAiStatus$1.A01 = A1a;
        return rtcCallAiStatusStateProvider$getAiStatus$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r1 != null) goto L12;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.AbstractC09560e7.A00(r8)
            java.lang.Object r1 = r7.A00
            com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState r1 = (com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState) r1
            boolean r6 = r7.A01
            r5 = 1
            r2 = 0
            if (r1 == 0) goto L19
            com.facebook.rsys.metaaivoicestate.gen.MetaAiUserContent r0 = r1.userContent
            if (r0 == 0) goto L19
            com.facebook.rsys.metaaivoicestate.gen.MetaAiCaption r0 = r0.caption
            if (r0 == 0) goto L19
            java.lang.String r3 = r0.text
            if (r3 != 0) goto L1d
        L19:
            java.lang.String r3 = ""
            if (r1 == 0) goto L23
        L1d:
            int r0 = r1.state
            java.lang.Integer r2 = X.AbstractC43592JPx.A0r(r0)
        L23:
            java.lang.String r4 = r7.A02
            X.MwS r1 = new X.MwS
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.stateprovider.RtcCallAiStatusStateProvider$getAiStatus$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
