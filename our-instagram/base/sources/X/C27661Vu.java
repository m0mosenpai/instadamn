package X;

import android.app.Notification;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;
import com.instagram.realtimeclient.RealtimePayload;
import com.instagram.rtc.analytics.RtcCallSurveyLogger;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.1Vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27661Vu extends AbstractC27671Vv {
    public final Context A00;
    public final C1W4 A01;
    public final C1Vt A02;
    public final C1WO A04;
    public final C1WB A05;
    public final C1WL A09;
    public final C1WH A0A;
    public final WeakHashMap A06 = new WeakHashMap();
    public final C27701Vy A03 = new C27701Vy(this);
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C9EU(this, 31));
    public final InterfaceC09390do A08 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EU(this, 32));

    @Override // X.AbstractC27671Vv
    public final C3ES A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        return (C3ES) userSession.A01(C3ES.class, new C9FL(10, context.getApplicationContext(), userSession, this));
    }

    @Override // X.AbstractC27671Vv
    public final boolean A02(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        C56139Ovz A01 = MWJ.A01(A00(context, userSession).A06);
        if (A01 != null) {
            return A01.A09();
        }
        return false;
    }

    @Override // X.AbstractC27671Vv
    public final boolean A04(UserSession userSession, String str) {
        String str2;
        C51881MwP c51881MwP;
        RtcCallKey rtcCallKey;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        A00(this.A00, userSession);
        C56139Ovz A01 = MWJ.A01(userSession);
        if (A01 != null && (c51881MwP = (C51881MwP) A01.A09.A0K.A00.A00) != null && (rtcCallKey = c51881MwP.A00) != null) {
            str2 = rtcCallKey.A00;
        } else {
            str2 = null;
        }
        return C14360o3.A0K(str2, str);
    }

    @Override // X.AbstractC27671Vv
    public final void A01(Context context, UserSession userSession, RtcCreateCallArgs rtcCreateCallArgs, InterfaceC16820sZ interfaceC16820sZ) {
        OWM owm = OWM.A03;
        owm.A00(C05F.A00, rtcCreateCallArgs.A0B);
        owm.A01("product_loading");
        A00(context, userSession).A06(rtcCreateCallArgs, interfaceC16820sZ);
    }

    @Override // X.AbstractC27671Vv
    public final boolean A03(UserSession userSession, String str) {
        EnumC53186Nfi enumC53186Nfi;
        RtcConnectionEntity A00 = C55051Oa2.A00(AnonymousClass001.A0T(userSession.userId, str, '_'));
        if (A00 != null) {
            enumC53186Nfi = A00.C01();
        } else {
            enumC53186Nfi = null;
        }
        if (enumC53186Nfi != EnumC53186Nfi.A03) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1WH, X.1WJ] */
    public C27661Vu(final Context context, C1Vt c1Vt) {
        this.A00 = context;
        this.A02 = c1Vt;
        this.A01 = new C1W4(C16030qx.A02.A05(context));
        C1W4 c1w4 = this.A01;
        C1W6 c1w6 = (C1W6) this.A07.getValue();
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        C1WB c1wb = new C1WB(applicationContext, c1w4, c1w6, this);
        this.A05 = c1wb;
        ?? r3 = new C1WJ(context) { // from class: X.1WH
            public final Context A00;

            @Override // X.C1WJ
            public final void AB1(C116155Nu c116155Nu, UserSession userSession, String str) {
            }

            @Override // X.C1WJ
            public final boolean ACT(C116155Nu c116155Nu, C116155Nu c116155Nu2) {
                return false;
            }

            @Override // X.C1WJ
            public final C47690L3x AEk(UserSession userSession, String str, String str2, List list, boolean z) {
                C14360o3.A0B(str2, 2);
                C14360o3.A0B(list, 3);
                Context context2 = this.A00;
                XN9 A05 = AbstractC55212OeW.A05(context2, userSession, "video_call_incoming", str2, list);
                C116155Nu c116155Nu = (C116155Nu) list.get(list.size() - 1);
                Notification A00 = AbstractC55212OeW.A00(context2, A05, list, false, false);
                C14360o3.A07(A00);
                C1Z6.A00(userSession).A03(A00, context2, list);
                return new C47690L3x(A00, c116155Nu, AbstractC55212OeW.A06(list, 10));
            }

            @Override // X.C1WJ
            public final String Amb() {
                return "video_call_incoming";
            }

            @Override // X.C1WJ
            public final void DW8(C116155Nu c116155Nu, UserSession userSession) {
            }

            {
                this.A00 = context;
            }
        };
        this.A0A = r3;
        this.A09 = C1WL.A00;
        this.A04 = new C1WO(this);
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new RealtimeEventHandlerProvider() { // from class: X.1WQ
            @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
            public final RealtimeEventHandler get(UserSession userSession) {
                C27661Vu c27661Vu = C27661Vu.this;
                Context context2 = c27661Vu.A00;
                C14360o3.A0A(userSession);
                return new C93864Jw(context2, userSession, c27661Vu.A04);
            }
        });
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new RealtimeEventHandlerProvider() { // from class: X.1WY
            @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
            public final RealtimeEventHandler get(final UserSession userSession) {
                final Context context2 = C27661Vu.this.A00;
                C14360o3.A0A(userSession);
                return new RealtimeEventHandler(context2, userSession) { // from class: X.4Jx
                    public final Context A00;
                    public final UserSession A01;

                    {
                        C14360o3.A0B(context2, 1);
                        C14360o3.A0B(userSession, 2);
                        this.A00 = context2;
                        this.A01 = userSession;
                    }

                    @Override // com.instagram.realtimeclient.RealtimeEventHandler
                    public final boolean canHandleRealtimeEvent(String str, String str2) {
                        C14360o3.A0B(str, 0);
                        return RealtimeConstants.MQTT_TOPIC_RTC_ON_DEMAND_LOG.equals(str);
                    }

                    @Override // com.instagram.realtimeclient.RealtimeEventHandler
                    public final boolean handleRealtimeEvent(C5EZ c5ez, RealtimePayload realtimePayload) {
                        C14360o3.A0B(c5ez, 0);
                        if (!C14360o3.A0K(c5ez.A00, RealtimeConstants.MQTT_TOPIC_RTC_ON_DEMAND_LOG)) {
                            return false;
                        }
                        UserSession userSession2 = this.A01;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession2, 36314236250491383L)) {
                            Context applicationContext2 = this.A00.getApplicationContext();
                            C14360o3.A07(applicationContext2);
                            OWf oWf = MWJ.A00(applicationContext2, userSession2).A06;
                            String A02 = AbstractC06300Uv.A02();
                            RtcCallSurveyLogger rtcCallSurveyLogger = oWf.A02;
                            if (rtcCallSurveyLogger != null) {
                                rtcCallSurveyLogger.A01("triggered_by_peer", "triggered_by_peer", A02, (String) oWf.A0M.invoke(), C18U.A06(c06090Tz, oWf.A09, 36314236250556920L));
                            }
                        }
                        return true;
                    }

                    @Override // com.instagram.realtimeclient.RealtimeEventHandler
                    public final List getMqttTopicsToHandle() {
                        return AbstractC16960so.A1N(RealtimeConstants.MQTT_TOPIC_RTC_ON_DEMAND_LOG);
                    }
                };
            }
        });
        HashMap hashMap = C1WZ.A09;
        hashMap.put("video_call_incoming", c1wb);
        hashMap.put("video_call_ended", c1wb);
        hashMap.put("rtc_ring", c1wb);
        hashMap.put("rtc_generic", c1wb);
        C27741Wc.A01().A05(r3, AbstractC19750y3.A01("insta_video_call_notifications"), "video_call_incoming");
        C1XC.A00.add(new C1XB() { // from class: X.1XA
            @Override // X.C1XB
            public final boolean CPL(Context context2, UserSession userSession) {
                C14360o3.A0B(userSession, 1);
                return !C27661Vu.this.A02(context2, userSession);
            }

            @Override // X.C1XB
            public final void CuO(Context context2, C19280xC c19280xC, UserSession userSession) {
                C27661Vu c27661Vu = C27661Vu.this;
                c19280xC.A09("video_call_in_progress", Boolean.valueOf(c27661Vu.A02(context2, userSession)));
                C56139Ovz A01 = MWJ.A01(c27661Vu.A00(context2, userSession).A06);
                if (A01 != null && A01.A09()) {
                    A01.A06.A02(PBF.A00);
                }
            }

            @Override // X.C1XB
            public final String AY4(Context context2, UserSession userSession, boolean z) {
                String string = context2.getString(z ? 2131976044 : 2131976050);
                C14360o3.A07(string);
                return string;
            }

            @Override // X.C1XB
            public final String AY5(Context context2, UserSession userSession, boolean z) {
                String string = context2.getString(z ? 2131976045 : 2131976051);
                C14360o3.A07(string);
                return string;
            }
        });
    }
}
