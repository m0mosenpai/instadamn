package X;

import android.content.Context;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.rtc.analytics.RtcCallSurveyLogger;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OWf {
    public C54609OAk A00;
    public C55906Orv A01;
    public RtcCallSurveyLogger A02;
    public C55213OeY A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final UserFlowLoggerImpl A08;
    public final UserSession A09;
    public final InterfaceC15680qO A0A;
    public final C54678ODe A0B;
    public final C55133Obx A0C;
    public final C41951wl A0D;
    public final C1W4 A0E;
    public final OC9 A0F;
    public final C54610OAl A0G;
    public final C56053OuU A0H;
    public final OGR A0I;
    public final C1CM A0J;
    public final java.util.Set A0K;
    public final InterfaceC16820sZ A0L;
    public final InterfaceC16820sZ A0M;

    public final void A02(InterfaceC57853PlJ interfaceC57853PlJ) {
        InterfaceC02590Ai A0f;
        Long l;
        long j;
        Long A0j;
        Integer num;
        EnumC53137Neq enumC53137Neq;
        Integer num2;
        EnumC53137Neq enumC53137Neq2;
        EnumC53137Neq enumC53137Neq3;
        EnumC53137Neq enumC53137Neq4;
        String str;
        UserSession userSession;
        C19280xC A01;
        String str2;
        String str3;
        C14360o3.A0B(interfaceC57853PlJ, 0);
        if (interfaceC57853PlJ instanceof PB3) {
            A00(new C56573P9v(((PB3) interfaceC57853PlJ).A00));
            return;
        }
        if (interfaceC57853PlJ instanceof PBE) {
            C51678Ms9 c51678Ms9 = (C51678Ms9) this.A0L.invoke();
            if (c51678Ms9 == null) {
                return;
            }
            RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = c51678Ms9.A03;
            String str4 = null;
            if (!AbstractC25229BEm.A1a(rtcCallConnectionEntity.A01, EnumC53137Neq.A03)) {
                str3 = rtcCallConnectionEntity.A0J;
            } else {
                str3 = null;
                str4 = rtcCallConnectionEntity.A0E;
            }
            C1W4 c1w4 = this.A0E;
            userSession = this.A09;
            String str5 = rtcCallConnectionEntity.A03.A00;
            String str6 = c51678Ms9.A08;
            boolean A1W = AbstractC31171DnF.A1W(userSession, rtcCallConnectionEntity.A0G);
            AbstractC167017dG.A1R(str5, str6);
            A01 = C1W4.A01(C7T3.A0Q, c1w4, C05F.A0Y, userSession.userId, null, str5, str6, str3, str4, null);
            A01.A09("is_current_user", Boolean.valueOf(A1W));
        } else if (interfaceC57853PlJ instanceof PB2) {
            PB2 pb2 = (PB2) interfaceC57853PlJ;
            C51678Ms9 c51678Ms92 = (C51678Ms9) this.A0L.invoke();
            if (c51678Ms92 == null) {
                return;
            }
            RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity2 = c51678Ms92.A03;
            String str7 = null;
            if (!AbstractC25229BEm.A1a(rtcCallConnectionEntity2.A01, EnumC53137Neq.A03)) {
                str = rtcCallConnectionEntity2.A0J;
            } else {
                str = null;
                str7 = rtcCallConnectionEntity2.A0E;
            }
            C1W4 c1w42 = this.A0E;
            userSession = this.A09;
            String str8 = rtcCallConnectionEntity2.A03.A00;
            String str9 = c51678Ms92.A08;
            Integer num3 = pb2.A00;
            AbstractC167017dG.A1R(str8, str9);
            C14360o3.A0B(num3, 7);
            A01 = C1W4.A01(C7T3.A0Q, c1w42, C05F.A0N, userSession.userId, null, str8, str9, str, str7, null);
            switch (num3.intValue()) {
                case 3:
                    str2 = "tap_reply_button";
                    break;
                case 4:
                    str2 = "tap_quick_reply_option1";
                    break;
                case 5:
                    str2 = "tap_quick_reply_option2";
                    break;
                case 6:
                    str2 = "tap_quick_reply_option3";
                    break;
                default:
                    str2 = "tap_custom_reply";
                    break;
            }
            A01.A0C("action", str2);
        } else {
            if (interfaceC57853PlJ instanceof InterfaceC58293Psl) {
                InterfaceC58293Psl interfaceC58293Psl = (InterfaceC58293Psl) interfaceC57853PlJ;
                C55906Orv c55906Orv = this.A01;
                if (c55906Orv == null) {
                    return;
                }
                if (interfaceC58293Psl instanceof PAV) {
                    PAV pav = (PAV) interfaceC58293Psl;
                    String str10 = pav.A01;
                    String str11 = pav.A02;
                    Integer num4 = pav.A00;
                    C14360o3.A0B(num4, 2);
                    C55906Orv.A00(c55906Orv, C05F.A00, num4, str10, str11);
                    if (!c55906Orv.A01.A01() && ((enumC53137Neq4 = c55906Orv.A05) == EnumC53137Neq.A04 || enumC53137Neq4 == EnumC53137Neq.A02)) {
                        return;
                    }
                    C006802i c006802i = c55906Orv.A02.A00;
                    if (!c006802i.isMarkerOn(112601624, 0)) {
                        return;
                    }
                    c006802i.markerEnd(112601624, (short) 2);
                    return;
                }
                if (interfaceC58293Psl instanceof PAS) {
                    Integer num5 = ((PAS) interfaceC58293Psl).A00;
                    C14360o3.A0B(num5, 0);
                    C55906Orv.A00(c55906Orv, C05F.A01, num5, null, null);
                    if (!c55906Orv.A01.A01() && ((enumC53137Neq3 = c55906Orv.A05) == EnumC53137Neq.A04 || enumC53137Neq3 == EnumC53137Neq.A02)) {
                        return;
                    }
                    C006802i c006802i2 = c55906Orv.A02.A00;
                    if (!c006802i2.isMarkerOn(112601624, 0)) {
                        return;
                    }
                    c006802i2.markerEnd(112601624, (short) 4);
                    return;
                }
                if (interfaceC58293Psl instanceof PAR) {
                    String str12 = ((PAR) interfaceC58293Psl).A00;
                    if (!c55906Orv.A01.A01() && ((enumC53137Neq2 = c55906Orv.A05) == EnumC53137Neq.A04 || enumC53137Neq2 == EnumC53137Neq.A02)) {
                        return;
                    }
                    C006802i c006802i3 = c55906Orv.A02.A00;
                    c006802i3.markerStart(112601624);
                    c006802i3.markerAnnotate(112601624, AbstractC111324zv.A00(493), str12);
                    return;
                }
                if (interfaceC58293Psl instanceof PAY) {
                    num = C05F.A0C;
                    num2 = C05F.A01;
                } else if (interfaceC58293Psl instanceof PAZ) {
                    num = C05F.A0N;
                    num2 = C05F.A01;
                } else if (interfaceC58293Psl instanceof PAW) {
                    num = C05F.A0Y;
                    num2 = C05F.A00;
                } else if (interfaceC58293Psl instanceof PAX) {
                    num = C05F.A0j;
                    num2 = C05F.A00;
                } else {
                    if (interfaceC58293Psl instanceof C56578PAa) {
                        num = C05F.A08;
                    } else if (interfaceC58293Psl instanceof C56579PAb) {
                        num = C05F.A09;
                    } else {
                        if (interfaceC58293Psl instanceof PAT) {
                            Integer num6 = ((PAT) interfaceC58293Psl).A00;
                            C14360o3.A0B(num6, 0);
                            C55906Orv.A00(c55906Orv, C05F.A0A, num6, null, null);
                            if (!c55906Orv.A01.A01() && ((enumC53137Neq = c55906Orv.A05) == EnumC53137Neq.A04 || enumC53137Neq == EnumC53137Neq.A02)) {
                                return;
                            }
                            C54963OSt c54963OSt = c55906Orv.A02;
                            String A00 = AbstractC54154Nwq.A00(num6);
                            C006802i c006802i4 = c54963OSt.A00;
                            if (!c006802i4.isMarkerOn(112601624, 0)) {
                                return;
                            }
                            MSY.A1D(c006802i4, "error_message", A00, 112601624);
                            return;
                        }
                        if (interfaceC58293Psl instanceof C56583PAf) {
                            num = C05F.A1F;
                        } else if (interfaceC58293Psl instanceof C56584PAg) {
                            num = C05F.A02;
                        } else {
                            if (interfaceC58293Psl instanceof C56585PAh) {
                                Integer num7 = C05F.A1I;
                                C55906Orv.A00(c55906Orv, num7, num7, null, null);
                                return;
                            }
                            if (interfaceC58293Psl instanceof C56586PAi) {
                                num = C05F.A03;
                            } else if (interfaceC58293Psl instanceof C56581PAd) {
                                num = C05F.A04;
                            } else if (interfaceC58293Psl instanceof C56582PAe) {
                                num = C05F.A05;
                            } else if (interfaceC58293Psl instanceof PAU) {
                                Integer num8 = ((PAU) interfaceC58293Psl).A00;
                                C14360o3.A0B(num8, 0);
                                C55906Orv.A00(c55906Orv, C05F.A06, num8, null, null);
                                return;
                            } else if (interfaceC58293Psl instanceof C56580PAc) {
                                num = C05F.A07;
                            } else {
                                AbstractC166987dD.A1T(C18950wb.A01, "Attempt to log undefined avatar event", 245701013);
                                return;
                            }
                        }
                    }
                    num2 = C05F.A1I;
                }
                C55906Orv.A00(c55906Orv, num, num2, null, null);
                return;
            }
            if (interfaceC57853PlJ instanceof PB4) {
                PB4 pb4 = (PB4) interfaceC57853PlJ;
                RtcCallSurveyLogger rtcCallSurveyLogger = this.A02;
                if (rtcCallSurveyLogger == null) {
                    return;
                }
                java.util.Set A0k = AbstractC001800i.A0k(this.A0K);
                String str13 = pb4.A01;
                String str14 = pb4.A02;
                String str15 = pb4.A03;
                String str16 = pb4.A00;
                String str17 = (String) this.A0M.invoke();
                RtcCallKey rtcCallKey = rtcCallSurveyLogger.A00;
                if (rtcCallKey == null) {
                    C0w9.A03("RtcCallSurveyLogger", "Call key is null when attempting to log call end survey");
                    return;
                }
                rtcCallSurveyLogger.A01(str13, str14, str15, str17, true);
                String str18 = (String) AbstractC001800i.A0A(A0k);
                if (str18 != null && (A0j = AbstractC166997dE.A0j(str18)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                A0f = AbstractC166987dD.A0f(rtcCallSurveyLogger.A01, "ls_rtc_end_call_survey");
                A0f.AAk("rtc_end_call_survey_selected_options", AbstractC166987dD.A1J(str14));
                A0f.AAP("rtc_end_call_survey_issue", str13);
                A0f.AAP("shared_call_id", rtcCallKey.A00);
                if (str16 == null) {
                    str16 = "";
                }
                A0f.AAP("rtc_end_call_survey_freeform", str16);
                A0f.A9K("peer_id", Long.valueOf(j));
                if (str17 == null) {
                    str17 = "";
                }
                A0f.AAP("local_call_id", str17);
            } else if (interfaceC57853PlJ instanceof PBB) {
                RtcCallSurveyLogger rtcCallSurveyLogger2 = this.A02;
                if (rtcCallSurveyLogger2 == null) {
                    return;
                }
                String str19 = (String) this.A0M.invoke();
                Integer valueOf = Integer.valueOf(this.A05 ? 1 : 0);
                RtcCallKey rtcCallKey2 = rtcCallSurveyLogger2.A00;
                if (rtcCallKey2 == null) {
                    return;
                }
                A0f = AbstractC166987dD.A0f(rtcCallSurveyLogger2.A01, "ls_rtc_star_rating_shown");
                if (str19 == null) {
                    str19 = "";
                }
                A0f.AAP("local_call_id", str19);
                A0f.AAP("shared_call_id", rtcCallKey2.A00);
                if (valueOf != null) {
                    l = AbstractC25229BEm.A0n(valueOf);
                } else {
                    l = null;
                }
                A0f.A9K("rating_style", l);
            } else {
                if (interfaceC57853PlJ instanceof PB0) {
                    C54610OAl c54610OAl = this.A0G;
                    String str20 = ((PB0) interfaceC57853PlJ).A00;
                    InterfaceC58274PsS interfaceC58274PsS = c54610OAl.A00;
                    if (interfaceC58274PsS == null) {
                        return;
                    }
                    interfaceC58274PsS.AUk(str20);
                    return;
                }
                if (interfaceC57853PlJ instanceof PB6) {
                    PB6 pb6 = (PB6) interfaceC57853PlJ;
                    C54609OAk c54609OAk = this.A00;
                    if (c54609OAk == null) {
                        return;
                    }
                    String str21 = pb6.A02;
                    Map map = pb6.A03;
                    String str22 = pb6.A01;
                    int i = pb6.A00;
                    boolean z = pb6.A04;
                    AbstractC167007dF.A1K(str21, map);
                    if (c54609OAk.A02) {
                        return;
                    }
                    AnonymousClass229.A01(c54609OAk.A01).A13(EnumC114925Hg.RTC, EnumC50631MWs.A0N, str21, null, str22, map, null, -1, i, z, false);
                    return;
                }
                A00(interfaceC57853PlJ);
                return;
            }
            A0f.Cht();
            return;
        }
        AbstractC31173DnH.A1S(A01, userSession);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.OGR] */
    public /* synthetic */ OWf(Context context, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        OC9 oc9 = new OC9();
        C1W4 c1w4 = ((C27661Vu) C3ER.A00()).A01;
        UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(C006802i.A0p);
        C14360o3.A0B(c1w4, 6);
        this.A07 = context;
        this.A09 = userSession;
        this.A0L = interfaceC16820sZ;
        this.A0M = interfaceC16820sZ2;
        this.A0F = oc9;
        this.A0E = c1w4;
        this.A08 = userFlowLoggerImpl;
        this.A0C = AbstractC53884NsG.A00(userSession);
        this.A0B = (C54678ODe) userSession.A01(C54678ODe.class, new C50156MDj(userSession, 37));
        this.A0D = C41951wl.A00(userSession);
        this.A0G = AbstractC54155Nwr.A00(userSession);
        this.A0A = new Ox4(this, 0);
        this.A0H = new C56053OuU(this);
        this.A0J = new C1CM(context);
        this.A0I = new Object();
        this.A0K = AbstractC31171DnF.A0l();
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.InterfaceC57853PlJ r12) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWf.A00(X.PlJ):void");
    }

    public final String A01(EnumC46283KeF enumC46283KeF, RtcCallFunnelSessionId rtcCallFunnelSessionId, RtcCallKey rtcCallKey, RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        EnumC53137Neq enumC53137Neq;
        EnumC53376NjR enumC53376NjR;
        EnumC53343Nit enumC53343Nit;
        EnumC53369NjK enumC53369NjK;
        String str7;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 5);
        Context context = this.A07;
        UserSession userSession = this.A09;
        C55213OeY c55213OeY = new C55213OeY(context, enumC46283KeF, userSession, rtcCallFunnelSessionId, rtcCallKey, num2, str, str3, str4, str5, str6, z);
        C55213OeY c55213OeY2 = this.A03;
        if (c55213OeY2 != null && !c55213OeY2.A0O) {
            C55213OeY.A02(EnumC53328Ni7.A0c, c55213OeY2, null);
        }
        this.A03 = c55213OeY;
        OC9 oc9 = this.A0F;
        oc9.A00 = C05F.A00;
        oc9.A03 = false;
        oc9.A02 = false;
        oc9.A01 = false;
        C006802i c006802i = C006802i.A0p;
        c006802i.markerStart(805190082);
        int intValue = num.intValue();
        c006802i.markerAnnotate(805190082, "call_type", intValue != 0 ? "JOIN_CALL" : "INITIATE_CALL");
        c006802i.markerAnnotate(805190082, "startup_type", C1CC.A09.toString());
        c006802i.markerAnnotate(805190082, "time_since_startup", C1CC.A02());
        c006802i.markerAnnotate(805190082, "time_since_startup_bucket", C1CC.A00());
        c006802i.markerEnd(805190082, (short) 2);
        C0L6.A05(C0LK.A6Z, DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime()));
        C0L6.A05(C0LK.A6a, intValue != 0 ? "join_call" : "initiate_call");
        C55213OeY c55213OeY3 = this.A03;
        if (c55213OeY3 != null) {
            c55213OeY3.A0Y.A05();
        }
        if (intValue != 0) {
            oc9.A02 = true;
        } else {
            oc9.A03 = true;
        }
        A02(new C56600PAw(num));
        C51678Ms9 c51678Ms9 = (C51678Ms9) this.A0L.invoke();
        if (c51678Ms9 == null || (enumC53137Neq = c51678Ms9.A02) == null) {
            enumC53137Neq = EnumC53137Neq.A03;
        }
        this.A01 = new C55906Orv(userSession, enumC53137Neq, rtcCallKey);
        this.A02 = new RtcCallSurveyLogger(context, C12L.A00, userSession, rtcCallKey);
        this.A00 = new C54609OAk(userSession, context, z);
        C55133Obx c55133Obx = this.A0C;
        c55133Obx.A00 = rtcCallKey;
        NH7 nh7 = c55213OeY.A0Y;
        c55133Obx.A01 = nh7.A05();
        if (rtcStartCoWatchPlaybackArguments != null) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(c55133Obx.A02), "ig_cowatch_event");
            EnumC53379NjU enumC53379NjU = EnumC53379NjU.A05;
            int intValue2 = rtcStartCoWatchPlaybackArguments.A03.intValue();
            if (intValue2 == 5) {
                enumC53376NjR = EnumC53376NjR.IN_THREAD_ENTRYPOINT_SINGLE_FEED;
            } else if (intValue2 == 2) {
                enumC53376NjR = EnumC53376NjR.SHARE_SHEET_ENTRYPOINT;
            } else if (intValue2 != 6) {
                enumC53376NjR = intValue2 != 7 ? null : EnumC53376NjR.DIRECT_SHARE_LOCAL_ENTRYPOINT;
            } else {
                enumC53376NjR = EnumC53376NjR.DIRECT_SHARE_ENTRYPOINT;
            }
            String str8 = rtcStartCoWatchPlaybackArguments.A04;
            String A0L = AbstractC001900j.A0L(str8, "_", str8);
            int intValue3 = rtcStartCoWatchPlaybackArguments.A01.intValue();
            if (intValue3 != 0 && intValue3 != 2) {
                if (intValue3 == 1) {
                    enumC53343Nit = EnumC53343Nit.FACEBOOK;
                } else {
                    throw B4Z.A00();
                }
            } else {
                enumC53343Nit = EnumC53343Nit.INSTAGRAM;
            }
            switch (rtcStartCoWatchPlaybackArguments.A02.intValue()) {
                case 0:
                    enumC53369NjK = EnumC53369NjK.PHOTO;
                    break;
                case 1:
                    enumC53369NjK = EnumC53369NjK.VIDEO;
                    break;
                case 2:
                    enumC53369NjK = EnumC53369NjK.CAROUSEL_PHOTO;
                    break;
                case 3:
                    enumC53369NjK = EnumC53369NjK.CAROUSEL_VIDEO;
                    break;
                case 4:
                    enumC53369NjK = EnumC53369NjK.CAROUSEL;
                    break;
                case 5:
                    enumC53369NjK = EnumC53369NjK.IGTV;
                    break;
                case 6:
                    enumC53369NjK = EnumC53369NjK.REELS;
                    break;
                case 7:
                    enumC53369NjK = null;
                    break;
                default:
                    throw B4Z.A00();
            }
            if (A0f.isSampled()) {
                AbstractC37300Gc1.A0e(enumC53379NjU, A0f);
                A0f.A8R(enumC53376NjR, CacheBehaviorLogger.SOURCE);
                A0f.A9M("extra_info", null);
                RtcCallKey rtcCallKey2 = c55133Obx.A00;
                if (rtcCallKey2 != null) {
                    str7 = rtcCallKey2.A00;
                } else {
                    str7 = null;
                }
                A0f.AAP("server_info", str7);
                MSW.A1U(A0f, c55133Obx.A01);
                MSW.A1O(enumC53369NjK, A0f);
                MSW.A1S(A0f, A0L);
                A0f.A8R(enumC53343Nit, "media_source");
                A0f.Cht();
            }
        }
        OXJ A00 = AbstractC54148Nwk.A00(userSession);
        String A05 = nh7.A05();
        C14360o3.A0B(A05, 0);
        A00.A01 = A05;
        if (!this.A04) {
            C18150uz.A0B.A03(this.A0A);
            this.A04 = true;
        }
        return nh7.A05();
    }
}
