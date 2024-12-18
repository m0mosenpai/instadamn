package com.meta.metaai.components.voice.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC31175DnJ;
import X.AbstractC53431NkK;
import X.AbstractC54148Nwk;
import X.AnonymousClass001;
import X.AnonymousClass131;
import X.AnonymousClass137;
import X.C05A;
import X.C05F;
import X.C07S;
import X.C07T;
import X.C07X;
import X.C0eB;
import X.C12P;
import X.C12T;
import X.C14360o3;
import X.C1JX;
import X.C3ER;
import X.C3HN;
import X.C51029Mgc;
import X.C51613Mr6;
import X.C51985MyT;
import X.C51987MyV;
import X.C51988MyW;
import X.C55004OVk;
import X.C55091Ob2;
import X.C57154PYy;
import X.EnumC53181Nfd;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.MWJ;
import X.OWf;
import X.OXE;
import X.OXJ;
import X.PYj;
import android.content.Context;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4", f = "MetaAiVoiceSessionViewModel.kt", i = {0}, l = {116, 132, 162, 165, 168}, m = "invokeSuspend", n = {"previousState"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class MetaAiVoiceSessionViewModel$startVoiceSession$4 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ C07X A04;
    public final /* synthetic */ C51029Mgc A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAiVoiceSessionViewModel$startVoiceSession$4(Context context, C07X c07x, C51029Mgc c51029Mgc, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A05 = c51029Mgc;
        this.A02 = j;
        this.A06 = str;
        this.A03 = context;
        this.A07 = str2;
        this.A08 = interfaceC16660sJ;
        this.A09 = z;
        this.A0A = z2;
        this.A04 = c07x;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C51029Mgc c51029Mgc = this.A05;
        long j = this.A02;
        String str = this.A06;
        return new MetaAiVoiceSessionViewModel$startVoiceSession$4(this.A03, this.A04, c51029Mgc, str, this.A07, interfaceC23621Ds, this.A08, j, this.A09, this.A0A);
    }

    @DebugMetadata(c = "com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4$4", f = "MetaAiVoiceSessionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.meta.metaai.components.voice.viewmodel.MetaAiVoiceSessionViewModel$startVoiceSession$4$4, reason: invalid class name */
    /* loaded from: classes9.dex */
    public final class AnonymousClass4 extends AbstractC23611Dp implements InterfaceC16620sF {
        public final /* synthetic */ long A00;
        public final /* synthetic */ Context A01;
        public final /* synthetic */ C07X A02;
        public final /* synthetic */ C51029Mgc A03;
        public final /* synthetic */ InterfaceC16660sJ A04;
        public final /* synthetic */ boolean A05;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Context context, C07X c07x, C51029Mgc c51029Mgc, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
            super(2, interfaceC23621Ds);
            this.A03 = c51029Mgc;
            this.A01 = context;
            this.A00 = j;
            this.A02 = c07x;
            this.A04 = interfaceC16660sJ;
            this.A05 = z;
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            C51029Mgc c51029Mgc = this.A03;
            return new AnonymousClass4(this.A01, this.A02, c51029Mgc, interfaceC23621Ds, this.A04, this.A00, this.A05);
        }

        @Override // X.InterfaceC16620sF
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            Object value;
            AbstractC09560e7.A00(obj);
            C51029Mgc c51029Mgc = this.A03;
            Context context = this.A01;
            long j = this.A00;
            C07X c07x = this.A02;
            InterfaceC16660sJ interfaceC16660sJ = this.A04;
            boolean z = this.A05;
            C05A c05a = c51029Mgc.A0A;
            do {
                value = c05a.getValue();
            } while (!C55091Ob2.A00(EnumC53181Nfd.A05, (C55091Ob2) value, C51029Mgc.A00(context, c07x, c51029Mgc, interfaceC16660sJ, j, z), value, c05a));
            return C0eB.A00;
        }
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C55091Ob2 c55091Ob2;
        AnonymousClass137 anonymousClass137;
        InterfaceC16620sF anonymousClass4;
        Object A00;
        Object value;
        C55091Ob2 c55091Ob22;
        String str;
        String str2;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        int i2 = 3;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj2);
                return C0eB.A00;
            }
            c55091Ob2 = (C55091Ob2) this.A01;
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            C51029Mgc c51029Mgc = this.A05;
            c55091Ob2 = (C55091Ob2) c51029Mgc.A0A.getValue();
            C55004OVk c55004OVk = c51029Mgc.A03;
            long j = this.A02;
            String str3 = this.A06;
            if (str3 == null) {
                str3 = "meta_ai_voice_sheet";
            }
            C51613Mr6 c51613Mr6 = new C51613Mr6(this.A03, str3, this.A07, this.A08, j, this.A09);
            this.A01 = c55091Ob2;
            this.A00 = 1;
            C3ER.A00();
            String str4 = c51613Mr6.A02;
            UserSession userSession = c55004OVk.A00;
            boolean A1T = AbstractC31175DnJ.A1T(2, str4, C55004OVk.A03);
            RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString rtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString = new RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString(str4);
            OXJ A002 = AbstractC54148Nwk.A00(userSession);
            A002.A01 = str4;
            A002.A01(2);
            A002.A04("meta_ai_thread_view_button");
            OWf oWf = MWJ.A00(c51613Mr6.A01, userSession).A06;
            Integer num = C05F.A00;
            Integer num2 = C05F.A01;
            String A0n = AbstractC166997dE.A0n();
            new String();
            String A01 = oWf.A01(null, rtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplIdFromString, null, null, num, num2, "meta_ai_thread_view_button", A0n, "-1", "-1", null, null, A1T);
            C14360o3.A0B(A01, 1);
            OXE.A00.A00("RtcCallAnalyticsManager", AnonymousClass001.A0u("logStartCallQplStep threadId: ", "-1", ", waterfallId: ", A01));
            obj2 = ((MetaAiRsysSdk) c55004OVk.A02.getValue()).A00(c51613Mr6, this);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        AbstractC53431NkK abstractC53431NkK = (AbstractC53431NkK) obj2;
        if (abstractC53431NkK instanceof C51985MyT) {
            C51029Mgc c51029Mgc2 = this.A05;
            MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = ((C51985MyT) abstractC53431NkK).A00;
            c51029Mgc2.A00 = metaAiRsysSdkRealTimeSession;
            if (metaAiRsysSdkRealTimeSession != null) {
                metaAiRsysSdkRealTimeSession.A00.A01 = 50L;
            }
            C05A c05a = c51029Mgc2.A0A;
            do {
                value = c05a.getValue();
                c55091Ob22 = (C55091Ob2) value;
                str = c55091Ob22.A05;
                str2 = c55091Ob22.A06;
            } while (!c05a.AIi(value, new C55091Ob2(c55091Ob22.A00, c55091Ob22.A01, c55091Ob22.A02, null, c55091Ob22.A04, str, str2, true, c55091Ob22.A0A, c55091Ob22.A08, true, c55091Ob22.A0B, c55091Ob22.A09)));
            c51029Mgc2.A05.invoke();
            if (this.A0A) {
                MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession2 = c51029Mgc2.A00;
                if (metaAiRsysSdkRealTimeSession2 != null) {
                    metaAiRsysSdkRealTimeSession2.A02(!c55091Ob2.A0A);
                }
                MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession3 = c51029Mgc2.A00;
                if (metaAiRsysSdkRealTimeSession3 != null) {
                    metaAiRsysSdkRealTimeSession3.A01(!c55091Ob2.A08);
                }
            }
            C07X c07x = this.A04;
            C07T lifecycle = c07x.getLifecycle();
            C07S c07s = C07S.STARTED;
            PYj pYj = new PYj(this.A03, c07x, c51029Mgc2, null, this.A08, this.A02, this.A09);
            this.A01 = null;
            this.A00 = 2;
            A00 = C3HN.A00(c07s, lifecycle, this, pYj);
        } else {
            if (abstractC53431NkK instanceof C51987MyV) {
                C12T c12t = C12P.A00;
                anonymousClass137 = AnonymousClass131.A00;
                anonymousClass4 = new C57154PYy(this.A05, this.A03, null, 32);
                this.A01 = null;
            } else {
                boolean z = abstractC53431NkK instanceof C51988MyW;
                C12T c12t2 = C12P.A00;
                anonymousClass137 = AnonymousClass131.A00;
                if (z) {
                    anonymousClass4 = new C57154PYy(this.A05, this.A03, null, 33);
                    this.A01 = null;
                    i2 = 4;
                } else {
                    anonymousClass4 = new AnonymousClass4(this.A03, this.A04, this.A05, null, this.A08, this.A02, this.A09);
                    this.A01 = null;
                    i2 = 5;
                }
            }
            this.A00 = i2;
            A00 = AbstractC23641Du.A00(this, anonymousClass137, anonymousClass4);
        }
        if (A00 == c1jx) {
            return c1jx;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MetaAiVoiceSessionViewModel$startVoiceSession$4) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
