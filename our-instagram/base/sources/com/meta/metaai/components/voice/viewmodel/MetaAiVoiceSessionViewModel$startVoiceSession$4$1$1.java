package com.meta.metaai.components.voice.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C07X;
import X.C0eB;
import X.C10Q;
import X.C15200pa;
import X.C1JX;
import X.C51029Mgc;
import X.C57188PaR;
import X.InterfaceC09390do;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.OEE;
import X.PVV;
import android.content.Context;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1", f = "MetaAiVoiceSessionViewModel.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C07X A03;
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession A04;
    public final /* synthetic */ C51029Mgc A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1(Context context, C07X c07x, MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, C51029Mgc c51029Mgc, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = metaAiRsysSdkRealTimeSession;
        this.A05 = c51029Mgc;
        this.A02 = context;
        this.A01 = j;
        this.A03 = c07x;
        this.A06 = interfaceC16660sJ;
        this.A07 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = this.A04;
        C51029Mgc c51029Mgc = this.A05;
        return new MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1(this.A02, this.A03, metaAiRsysSdkRealTimeSession, c51029Mgc, interfaceC23621Ds, this.A06, this.A01, this.A07);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = this.A04;
            InterfaceC19390xP interfaceC19390xP = (InterfaceC19390xP) metaAiRsysSdkRealTimeSession.A03.getValue();
            InterfaceC19390xP interfaceC19390xP2 = (InterfaceC19390xP) metaAiRsysSdkRealTimeSession.A04.getValue();
            InterfaceC09390do interfaceC09390do = metaAiRsysSdkRealTimeSession.A05;
            C15200pa A01 = C10Q.A01(new C57188PaR(1, null), interfaceC19390xP, interfaceC19390xP2, ((OEE) interfaceC09390do.getValue()).A05, ((OEE) interfaceC09390do.getValue()).A04);
            C51029Mgc c51029Mgc = this.A05;
            PVV pvv = new PVV(this.A02, this.A03, c51029Mgc, this.A06, this.A01, this.A07);
            this.A00 = 1;
            if (A01.collect(pvv, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
