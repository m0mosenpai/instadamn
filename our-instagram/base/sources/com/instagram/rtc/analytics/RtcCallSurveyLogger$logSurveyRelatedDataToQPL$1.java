package com.instagram.rtc.analytics;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C006802i;
import X.C06090Tz;
import X.C0eB;
import X.C18U;
import X.C1JX;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.facebook.quicklog.EventBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.analytics.RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1", f = "RtcCallSurveyLogger.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ RtcCallSurveyLogger A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1(RtcCallSurveyLogger rtcCallSurveyLogger, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = rtcCallSurveyLogger;
        this.A06 = z;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A02 = str4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1(this.A01, this.A04, this.A03, this.A05, this.A02, interfaceC23621Ds, this.A06);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        RtcCallKey rtcCallKey;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            RtcCallSurveyLogger rtcCallSurveyLogger = this.A01;
            UserSession userSession = rtcCallSurveyLogger.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 2342156227556935496L)) {
                String A04 = C18U.A04(c06090Tz, userSession, 36876168296726618L);
                str = null;
                if (this.A06 && A04.length() != 0) {
                    this.A00 = 1;
                    obj = RtcCallSurveyLogger.A00(rtcCallSurveyLogger, A04, this);
                    if (obj == c1jx) {
                        return c1jx;
                    }
                }
                RtcCallSurveyLogger rtcCallSurveyLogger2 = this.A01;
                EventBuilder annotate = C006802i.A0p.markEventBuilder(867381049, "ig_survey_qpl").annotate("reason_key", this.A04).annotate("details", this.A03).annotate("bb_trace_id", this.A05).annotate("call_id", this.A02);
                rtcCallKey = rtcCallSurveyLogger2.A00;
                if (rtcCallKey != null || (r1 = rtcCallKey.A00) == null) {
                    String str2 = "null";
                }
                annotate.annotate("shared_call_id", str2).annotate("logcat", str).setLevel(7).report();
            }
            return C0eB.A00;
        }
        str = (String) obj;
        RtcCallSurveyLogger rtcCallSurveyLogger22 = this.A01;
        EventBuilder annotate2 = C006802i.A0p.markEventBuilder(867381049, "ig_survey_qpl").annotate("reason_key", this.A04).annotate("details", this.A03).annotate("bb_trace_id", this.A05).annotate("call_id", this.A02);
        rtcCallKey = rtcCallSurveyLogger22.A00;
        if (rtcCallKey != null) {
        }
        String str22 = "null";
        annotate2.annotate("shared_call_id", str22).annotate("logcat", str).setLevel(7).report();
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RtcCallSurveyLogger$logSurveyRelatedDataToQPL$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
