package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4Qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC95234Qj {
    public static final InterfaceC95254Ql A00(final Context context, final C95224Qi c95224Qi, final UserSession userSession, final C30P c30p) {
        Object obj;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        if (c30p != null) {
            final C2CF A02 = C2CF.A0D.A02(context, userSession);
            obj = new InterfaceC95254Ql(context, c95224Qi, userSession, c30p, A02) { // from class: X.4Qk
                public int A00;
                public Boolean A01;
                public Boolean A02 = Boolean.valueOf(C17280tP.A00().A0Y());
                public String A03;
                public C95224Qi A04;
                public C4SH A05;
                public String A06;
                public final Context A07;
                public final UserSession A08;
                public final C30P A09;
                public final C2CF A0A;
                public final C1CN A0B;
                public final boolean A0C;
                public final boolean A0D;
                public final boolean A0E;

                private String A02(C4SH c4sh) {
                    if (c4sh == null) {
                        return null;
                    }
                    if (this.A0E) {
                        if (c4sh.A02 == EnumC40111tc.A09) {
                            return c4sh.A06;
                        }
                        return c4sh.A0B;
                    }
                    C75363a3 c75363a3 = c4sh.A04;
                    if (c75363a3 == null || c4sh.A0B == null) {
                        return null;
                    }
                    return c75363a3.A0G;
                }

                @Override // X.InterfaceC95254Ql
                public final void EHk(EnumC92424Bx enumC92424Bx, Object obj2) {
                }

                @Override // X.InterfaceC95254Ql
                public final void EIf(Object obj2, int i) {
                }

                @Override // X.InterfaceC95254Ql
                public final void EIj(C4SG c4sg, Object obj2, String str) {
                    String str2;
                    C1CN c1cn;
                    String str3 = str;
                    if (obj2 != null) {
                        C30P c30p2 = this.A09;
                        C4SH A07 = c30p2.A07(obj2);
                        this.A05 = A07;
                        this.A01 = null;
                        this.A00 = 1;
                        if ((c30p2 instanceof C4SU) && ((C4SU) c30p2).A0H.Cc5()) {
                            str3 = "cobroadcast_finish";
                        }
                        UserSession userSession2 = this.A08;
                        C4SW c4sw = new C4SW(userSession2);
                        InterfaceC60442pS interfaceC60442pS = c30p2.A00;
                        C4SY c4sy = new C4SY(this.A07, userSession2, interfaceC60442pS, c4sw, "video_should_start");
                        c4sy.A0A = c4sg.A06;
                        c4sy.A15 = str3;
                        c4sy.A1F = c30p2.A09();
                        c4sy.A0m = c30p2.A02();
                        c4sy.A0M = this.A00;
                        c4sy.A0b = c4sg.A0H;
                        if (A07 != null) {
                            c4sy.A01(A07);
                        }
                        A03(c4sy, c30p2, A07, c4sw);
                        String A022 = A02(A07);
                        if (A022 != null && (c1cn = this.A0B) != null) {
                            c1cn.A0q(A022, str3);
                        }
                        if (A07 != null && A07.A04 != null && (str2 = A07.A0B) != null) {
                            this.A0A.A03.A00(A07, str2, str3, c30p2.A09(), interfaceC60442pS.getModuleName(), c4sg.A05);
                        }
                    }
                }

                public static int A00(C4SG c4sg, C4SH c4sh) {
                    EnumC40111tc enumC40111tc = c4sh.A02;
                    EnumC40111tc enumC40111tc2 = EnumC40111tc.A0L;
                    int i = c4sg.A05;
                    if (enumC40111tc != enumC40111tc2) {
                        return Math.min(i, c4sg.A06);
                    }
                    return i;
                }

                private C4SH A01(Object obj2) {
                    if (obj2 != null) {
                        return this.A09.A07(obj2);
                    }
                    return null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
                
                    if (r0 != false) goto L15;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private void A03(X.C4SY r4, X.C30P r5, X.C4SH r6, X.C4SW r7) {
                    /*
                        r3 = this;
                        java.lang.Boolean r0 = r3.A02
                        boolean r0 = r0.booleanValue()
                        if (r0 != 0) goto L2e
                        if (r6 == 0) goto L4a
                        boolean r0 = r6.A0P
                        if (r0 != 0) goto L4e
                        X.1tc r1 = r6.A02
                        X.1tc r0 = X.EnumC40111tc.A0L
                        if (r1 != r0) goto L4b
                        java.lang.String r1 = r4.A1Q
                        java.lang.String r0 = "video_viewed"
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto L2e
                        java.lang.String r0 = "video_paused"
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto L2e
                        java.lang.String r0 = "video_playing_update"
                        boolean r0 = r1.equals(r0)
                    L2c:
                        if (r0 == 0) goto L4e
                    L2e:
                        r4.A00(r5)
                        com.instagram.common.session.UserSession r1 = r3.A08
                        X.30P r0 = r3.A09
                        X.0kP r2 = new X.0kP
                        r2.<init>(r1)
                        X.2pS r0 = r0.A00
                        r2.A00 = r0
                        X.0kM r0 = X.C12180kM.A05
                        r2.A01(r0)
                    L43:
                        X.0wW r0 = r2.A00()
                        r7.A00(r0)
                    L4a:
                        return
                    L4b:
                        boolean r0 = r6.A0Q
                        goto L2c
                    L4e:
                        r4.A00(r5)
                        com.instagram.common.session.UserSession r1 = r3.A08
                        X.30P r0 = r3.A09
                        X.0kP r2 = new X.0kP
                        r2.<init>(r1)
                        X.2pS r0 = r0.A00
                        r2.A00 = r0
                        goto L43
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C95244Qk.A03(X.4SY, X.30P, X.4SH, X.4SW):void");
                }

                @Override // X.InterfaceC95254Ql
                public final void EHH(C121955fn c121955fn) {
                    C2CK c2ck = this.A0A.A06;
                    C2CJ c2cj = c2ck.A03;
                    if (c2cj.A00()) {
                        long now = RealtimeSinceBootClock.A00.now();
                        C2CG c2cg = C2CF.A0D;
                        String str = c121955fn.A0Q;
                        int hashCode = str.hashCode();
                        C006802i c006802i = c2ck.A02;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        c006802i.markerStart(28180481, hashCode, now, timeUnit);
                        HashMap hashMap = new HashMap();
                        hashMap.put("time_ms", String.valueOf(c121955fn.A0E));
                        hashMap.put("video_id", C2CG.A00(str));
                        hashMap.put("ig_video_id", str);
                        long j = c121955fn.A0B;
                        hashMap.put("player_id", String.valueOf(j));
                        String str2 = c121955fn.A0R;
                        hashMap.put("vp_session_id", str2);
                        hashMap.put("is_live", Boolean.toString(c121955fn.A0T));
                        hashMap.put("video_position_ms", String.valueOf(c121955fn.A0F));
                        hashMap.put("buffer_duration_ms", String.valueOf(c121955fn.A0A));
                        hashMap.put("segment_start_ms", String.valueOf(c121955fn.A0D));
                        hashMap.put("segment_duration_ms", String.valueOf(c121955fn.A0C));
                        String valueOf = String.valueOf(c121955fn.A08);
                        hashMap.put("bandwidth_estimate", valueOf);
                        hashMap.put("current_bitrate", String.valueOf(c121955fn.A05));
                        hashMap.put("next_bitrate", String.valueOf(c121955fn.A07));
                        hashMap.put("constraint_bitrate", String.valueOf(c121955fn.A03));
                        hashMap.put("decision_reasons", c121955fn.A0K);
                        hashMap.put("decision_reason_details", c121955fn.A0J);
                        hashMap.put("constraint_width", String.valueOf(c121955fn.A04));
                        hashMap.put("constraint_reasons", c121955fn.A0H);
                        hashMap.put("format_bandwidth_estimate", c121955fn.A0M);
                        hashMap.put("is_prefetch", Boolean.toString(c121955fn.A0U));
                        String bool = Boolean.toString(false);
                        hashMap.put("is_buffer_falling", bool);
                        hashMap.put("bandwidth_confidence_pct", String.valueOf(c121955fn.A02));
                        hashMap.put("bandwidth_estimate_confidence_based", String.valueOf(c121955fn.A09));
                        hashMap.put("min_viewport_dimension", String.valueOf(c121955fn.A06));
                        hashMap.put("format_mos", String.valueOf(c121955fn.A00));
                        hashMap.put("player_origin", c121955fn.A0P);
                        hashMap.put("is_audio", Boolean.toString(c121955fn.A0S));
                        hashMap.put("is_wifi", Boolean.toString(c121955fn.A0V));
                        String str3 = c121955fn.A0I;
                        if (str3 != null) {
                            hashMap.put("current_quality_label", str3);
                        }
                        String str4 = c121955fn.A0O;
                        if (str4 != null) {
                            hashMap.put("next_quality_label", str4);
                        }
                        String str5 = c121955fn.A0N;
                        if (str5 != null) {
                            hashMap.put("highest_quality_label_from_manifest", str5);
                        }
                        String str6 = c121955fn.A0G;
                        if (str6 != null) {
                            hashMap.put("constraint_quality_label", str6);
                        }
                        hashMap.put("data_connection_quality", "UNKNOWN");
                        String str7 = c121955fn.A0L;
                        if (str7 != null) {
                            hashMap.put("encoding_tag", str7);
                        }
                        hashMap.put("kbps_estimate", valueOf);
                        hashMap.put("playback_speed", String.valueOf(c121955fn.A01));
                        c2cg.A03(28180481, hashCode, hashMap);
                        c006802i.markerEnd(28180481, hashCode, (short) 2, now, timeUnit);
                        if (c2cj.A00() && !str.equals(c2ck.A00)) {
                            c2ck.A00 = str;
                            C121945fm[] c121945fmArr = c121955fn.A0W;
                            if (c121945fmArr != null) {
                                for (C121945fm c121945fm : c121945fmArr) {
                                    int hashCode2 = AnonymousClass001.A0R(str, c121945fm.A08).hashCode();
                                    c006802i.markerStart(28180484, hashCode2, now, timeUnit);
                                    String str8 = c121945fm.A08;
                                    String A00 = C2CG.A00(str);
                                    int i = c121945fm.A00;
                                    int i2 = c121945fm.A03;
                                    int i3 = c121945fm.A02;
                                    boolean z = c121945fm.A0F;
                                    boolean z2 = c121945fm.A0G;
                                    boolean z3 = c121945fm.A0E;
                                    boolean z4 = c121945fm.A0D;
                                    boolean z5 = c121945fm.A0C;
                                    boolean z6 = c121945fm.A0B;
                                    boolean z7 = c121945fm.A0A;
                                    boolean z8 = c121945fm.A09;
                                    String str9 = c121945fm.A07;
                                    String str10 = c121945fm.A05;
                                    String str11 = c121945fm.A06;
                                    String str12 = c121945fm.A04;
                                    int i4 = c121945fm.A01;
                                    HashMap hashMap2 = new HashMap();
                                    boolean endsWith = str8.endsWith("vd");
                                    hashMap2.put("is_audio", bool);
                                    hashMap2.put("time_ms", Long.toString(System.currentTimeMillis()));
                                    hashMap2.put("video_id", A00);
                                    hashMap2.put("format_id", str8);
                                    hashMap2.put(TraceFieldType.Bitrate, Integer.toString(i));
                                    hashMap2.put(IgReactMediaPickerNativeModule.WIDTH, Integer.toString(i2));
                                    hashMap2.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.toString(i3));
                                    hashMap2.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, Boolean.toString(endsWith));
                                    hashMap2.put("fb_max_bandwidth", Integer.toString(i4));
                                    hashMap2.put("hvq_landscape", Boolean.toString(z));
                                    hashMap2.put("hvq_portrait", Boolean.toString(z2));
                                    hashMap2.put("avoid_on_cell", Boolean.toString(z3));
                                    hashMap2.put("avoid_on_cell_intentional", Boolean.toString(z4));
                                    hashMap2.put("avoid_on_cell_datasaver", Boolean.toString(z5));
                                    hashMap2.put("avoid_on_cell_datasaver_intentional", Boolean.toString(z6));
                                    hashMap2.put("avoid_on_abr", Boolean.toString(z7));
                                    hashMap2.put("avoid_on_abr_intentional", Boolean.toString(z8));
                                    hashMap2.put("quality_label", str9);
                                    hashMap2.put("mos", str10.replaceAll(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, ";"));
                                    hashMap2.put("mos_confidence", str11);
                                    hashMap2.put("mos_csvqm", str12.replaceAll(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, ";"));
                                    hashMap2.put("upload_mos", str10.replaceAll(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, ";"));
                                    hashMap2.put("player_id", Long.toString(j));
                                    hashMap2.put("vp_session_id", str2);
                                    hashMap2.put("ig_video_id", str);
                                    c2cg.A03(28180484, hashCode2, hashMap2);
                                    c006802i.markerEnd(28180484, hashCode2, (short) 2, now, timeUnit);
                                }
                            }
                        }
                    }
                    C1CN c1cn = this.A0B;
                    if (c1cn != null) {
                        c1cn.A0d(c121955fn, c121955fn.A0Q);
                    }
                }

                @Override // X.InterfaceC95254Ql
                public final void EHM(C75363a3 c75363a3) {
                    String A04;
                    String str;
                    C2CP c2cp = this.A0A.A01;
                    if (c75363a3 != null) {
                        String str2 = c75363a3.A0G;
                        int hashCode = str2.hashCode();
                        C006802i c006802i = c2cp.A01;
                        c006802i.markerStart(61683940, hashCode);
                        UserSession userSession2 = c2cp.A02;
                        Context context2 = c2cp.A00;
                        if (C18U.A06(C06090Tz.A05, userSession2, 36321932831958938L)) {
                            A04 = String.valueOf(c75363a3.A01(context2));
                        } else {
                            A04 = c75363a3.A04();
                        }
                        C09530e4 c09530e4 = new C09530e4("VIDEO_ID", str2);
                        C09530e4 c09530e42 = new C09530e4("SOURCE_TYPE", AbstractC95674Sb.A00(c75363a3.A0E));
                        ProductType productType = c75363a3.A09;
                        if (productType == null || (str = productType.A00) == null) {
                            str = "";
                        }
                        C4BJ.A00(c006802i, AbstractC06930Yk.A06(c09530e4, c09530e42, new C09530e4("PRODUCT_TYPE", str), new C09530e4("VIDEO_CODEC", A04), new C09530e4("IS_DASH", Boolean.valueOf(c75363a3.A08()))), 61683940, hashCode);
                        c006802i.markerEnd(61683940, hashCode, (short) 2);
                    }
                }

                @Override // X.InterfaceC95254Ql
                public final void EHU(C4SG c4sg, Object obj2, String str, String str2, int i, int i2) {
                    C75363a3 c75363a3;
                    boolean startsWith = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND);
                    boolean startsWith2 = str2.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND);
                    if (startsWith) {
                        C4SH A01 = A01(obj2);
                        if (A01 != null) {
                            UserSession userSession2 = this.A08;
                            C4SW c4sw = new C4SW(userSession2);
                            C30P c30p2 = this.A09;
                            C4SY c4sy = new C4SY(this.A07, userSession2, c30p2.A00, c4sw, "video_format_changed");
                            c4sy.A01(A01);
                            c4sy.A0P = c4sg.A0D;
                            c4sy.A0O = c4sg.A0C;
                            c4sy.A01 = i;
                            c4sy.A0y = str2;
                            c4sy.A0A = c4sg.A06;
                            int i3 = c4sg.A05;
                            c4sy.A09 = i3;
                            c4sy.A0F = c4sg.A09;
                            c4sy.A02 = c4sg.A0A;
                            c4sy.A08 = c4sg.A04;
                            c4sy.A0E = c4sg.A08;
                            int i4 = this.A00 + 1;
                            this.A00 = i4;
                            c4sy.A0M = i4;
                            c4sy.A0b = c4sg.A0H;
                            if (!A01.A0N && ((c75363a3 = A01.A04) == null || c75363a3.A08())) {
                                c4sy.A16 = str;
                            }
                            A03(c4sy, c30p2, A01, c4sw);
                            String str3 = A01.A0B;
                            if (str3 != null) {
                                C2CO c2co = this.A0A.A05;
                                String str4 = c4sg.A0K;
                                String str5 = c4sg.A00;
                                String str6 = c4sg.A0L;
                                if (c2co.A03.A00()) {
                                    ACC acc = new ACC(str, i, AnonymousClass001.A04(i2, "w_", str));
                                    ACC acc2 = c2co.A00;
                                    if (acc2 != null && !acc2.equals(acc)) {
                                        Integer num = C05F.A0j;
                                        C14360o3.A0B(str4, 3);
                                        C2CO.A00(c2co, null, null, Integer.valueOf(acc2.A00), Integer.valueOf(acc.A00), num, null, null, acc.A02, str4, str6, acc2.A02, acc2.A01, str3, str5, i3);
                                    }
                                    c2co.A00 = acc;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!startsWith2 || !this.A0C) {
                        return;
                    }
                    String str7 = this.A06;
                    if (str7 != null && str7.equals(str)) {
                        return;
                    }
                    this.A06 = str;
                    C4SH A012 = A01(obj2);
                    if (A012 == null) {
                        return;
                    }
                    UserSession userSession3 = this.A08;
                    C4SW c4sw2 = new C4SW(userSession3);
                    C30P c30p3 = this.A09;
                    C4SY c4sy2 = new C4SY(this.A07, userSession3, c30p3.A00, c4sw2, "video_format_changed");
                    c4sy2.A01(A012);
                    c4sy2.A0h = str;
                    c4sy2.A0P = c4sg.A0D;
                    c4sy2.A0O = c4sg.A0C;
                    c4sy2.A01 = i;
                    c4sy2.A0y = str2;
                    c4sy2.A0A = c4sg.A06;
                    c4sy2.A09 = c4sg.A05;
                    c4sy2.A0F = c4sg.A09;
                    c4sy2.A02 = c4sg.A0A;
                    c4sy2.A08 = c4sg.A04;
                    c4sy2.A0E = c4sg.A08;
                    int i5 = this.A00 + 1;
                    this.A00 = i5;
                    c4sy2.A0M = i5;
                    c4sy2.A0b = c4sg.A0H;
                    A03(c4sy2, c30p3, A012, c4sw2);
                }

                @Override // X.InterfaceC95254Ql
                public final void EHb(EnumC92424Bx enumC92424Bx, Object obj2) {
                    if (this.A0D) {
                        boolean z = false;
                        if (enumC92424Bx == EnumC92424Bx.CACHED) {
                            z = true;
                        }
                        A04(obj2, z);
                    }
                }

                @Override // X.InterfaceC95254Ql
                public final void EHp(C53302cE c53302cE) {
                    C2CK c2ck = this.A0A.A06;
                    C14360o3.A0B(c53302cE, 0);
                    C2CJ c2cj = c2ck.A03;
                    if (c2cj.A00() && c2cj.A01) {
                        C2CL c2cl = c2ck.A01;
                        int i = c53302cE.A00;
                        Integer num = c53302cE.A03;
                        switch (num.intValue()) {
                            case 0:
                            case 2:
                                c2cl.A00.markerStart(28196231, i, c53302cE.A01, TimeUnit.MILLISECONDS);
                                c2cl.A01(i, C2CL.A00(c53302cE));
                                return;
                            case 1:
                            case 4:
                                c2cl.A00.markerPoint(28196231, i, AbstractC225339ww.A00(num), c53302cE.A01, TimeUnit.MILLISECONDS);
                                return;
                            case 3:
                            default:
                                c2cl.A01(i, C2CL.A00(c53302cE));
                                c2cl.A00.markerEnd(28196231, i, (short) 2, c53302cE.A01, TimeUnit.MILLISECONDS);
                                return;
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
                
                    if (r8 != false) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
                
                    X.AbstractC68643VZb.A03 = X.C05F.A01;
                    X.AbstractC68643VZb.A01 = r3;
                    X.AbstractC68643VZb.A00 = r12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x0154, code lost:
                
                    if (r8 != false) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:74:0x0158, code lost:
                
                    if (r8 != false) goto L24;
                 */
                @Override // X.InterfaceC95254Ql
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void EIX(X.C4SG r28, java.lang.Object r29, int r30, boolean r31) {
                    /*
                        Method dump skipped, instructions count: 406
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C95244Qk.EIX(X.4SG, java.lang.Object, int, boolean):void");
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
                
                    if (r34.A0N == false) goto L8;
                 */
                @Override // X.InterfaceC95254Ql
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void EIY(X.C4SG r34, java.lang.Object r35, int r36) {
                    /*
                        Method dump skipped, instructions count: 366
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C95244Qk.EIY(X.4SG, java.lang.Object, int):void");
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
                
                    if (r37.A0N == false) goto L15;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, X.XfE] */
                @Override // X.InterfaceC95254Ql
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void EIZ(X.C4SG r37, java.lang.Object r38, java.util.List r39) {
                    /*
                        Method dump skipped, instructions count: 532
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C95244Qk.EIZ(X.4SG, java.lang.Object, java.util.List):void");
                }

                @Override // X.InterfaceC95254Ql
                public final void EIc(Object obj2, boolean z) {
                    if (!this.A0D) {
                        A04(obj2, z);
                    }
                }

                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, X.XpA] */
                @Override // X.InterfaceC95254Ql
                public final void EId(C4SG c4sg, Object obj2, String str) {
                    String str2;
                    C4SH A01 = A01(obj2);
                    if (A01 != null) {
                        C75363a3 c75363a3 = A01.A04;
                        String str3 = A01.A0B;
                        if (c75363a3 != null && str3 != null) {
                            C2CM c2cm = this.A0A.A03;
                            String A00 = AbstractC95664Sa.A00(A01);
                            int i = c4sg.A03;
                            C30P c30p2 = this.A09;
                            String moduleName = c30p2.A00.getModuleName();
                            long j = c4sg.A06;
                            String A04 = c30p2.A04(str);
                            C14360o3.A0B(A00, 1);
                            C14360o3.A0B(moduleName, 4);
                            C2CJ c2cj = c2cm.A01;
                            if (c2cj.A00()) {
                                long uptimeMillis = SystemClock.uptimeMillis();
                                C2CG c2cg = C2CF.A0D;
                                int hashCode = str3.hashCode();
                                HashMap hashMap = new HashMap();
                                c2cg.A04(hashMap, hashCode, uptimeMillis);
                                hashMap.put("duration", String.valueOf((int) (j / 1000)));
                                c2cg.A03(1900557, hashCode, hashMap);
                                C006802i c006802i = c2cm.A00;
                                c006802i.markerEnd(1900557, hashCode, (short) 2);
                                if (c2cj.A00()) {
                                    c006802i.markerStart(1900557, hashCode);
                                }
                                ?? obj3 = new Object();
                                synchronized (obj3) {
                                    obj3.A05 = true;
                                }
                                C2CF.A0E.put(Integer.valueOf(hashCode), obj3);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("video_id", str3);
                                hashMap2.put("player_type", A00);
                                hashMap2.put("start_bitrate", String.valueOf(i));
                                hashMap2.put("streaming_format", AbstractC92554Cp.A00(c75363a3));
                                if (A00.equals("live")) {
                                    str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                                } else {
                                    str2 = "0";
                                }
                                hashMap2.put("is_live_streaming", str2);
                                hashMap2.put("player_origin", moduleName);
                                hashMap2.put("original_play_reason", A04);
                                c2cg.A03(1900557, hashCode, hashMap2);
                            }
                        }
                    }
                }

                @Override // X.InterfaceC95254Ql
                public final void EIg(Object obj2) {
                    C1CN c1cn;
                    if (obj2 != null) {
                        C30P c30p2 = this.A09;
                        C4SH A07 = c30p2.A07(obj2);
                        C4SH c4sh = this.A05;
                        if (c4sh != null && A07 != null) {
                            String str = A07.A09;
                            if (str.equals(c4sh.A09)) {
                                this.A05 = null;
                                this.A01 = null;
                                UserSession userSession2 = this.A08;
                                C4SW c4sw = new C4SW(userSession2);
                                C4SY c4sy = new C4SY(this.A07, userSession2, c30p2.A00, c4sw, "video_exited");
                                c4sy.A01(A07);
                                c4sy.A1F = c30p2.A09();
                                c4sy.A0m = c30p2.A02();
                                int i = this.A00 + 1;
                                this.A00 = i;
                                c4sy.A0M = i;
                                A03(c4sy, c30p2, A07, c4sw);
                                C2CM c2cm = this.A0A.A03;
                                if (c2cm.A01.A00()) {
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    C2CG c2cg = C2CF.A0D;
                                    int hashCode = str.hashCode();
                                    C006802i c006802i = c2cm.A00;
                                    if (!c006802i.isMarkerOn(1900557, hashCode)) {
                                        C2CF.A0E.remove(Integer.valueOf(hashCode));
                                    } else {
                                        HashMap hashMap = new HashMap();
                                        c2cg.A04(hashMap, hashCode, uptimeMillis);
                                        c2cg.A03(1900557, hashCode, hashMap);
                                        c006802i.markerEnd(1900557, hashCode, (short) 477);
                                    }
                                }
                                String A022 = A02(A07);
                                if (A022 != null && (c1cn = this.A0B) != null) {
                                    c1cn.A0h(A022);
                                }
                            }
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
                
                    if (r33.A0N == false) goto L20;
                 */
                @Override // X.InterfaceC95254Ql
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void EIh(X.C4SG r33, java.lang.Object r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38) {
                    /*
                        Method dump skipped, instructions count: 482
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C95244Qk.EIh(X.4SG, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
                }

                @Override // X.InterfaceC95254Ql
                public final void EIi(C4SG c4sg, Object obj2, int i) {
                    C75363a3 c75363a3;
                    String str;
                    Integer num;
                    Integer num2;
                    if (obj2 != null) {
                        C4SH A07 = this.A09.A07(obj2);
                        this.A05 = A07;
                        this.A01 = null;
                        if (A07 != null && (c75363a3 = A07.A04) != null && (str = A07.A0B) != null) {
                            C2CO c2co = this.A0A.A05;
                            String str2 = c4sg.A0K;
                            String str3 = c4sg.A00;
                            String str4 = c4sg.A0L;
                            boolean z = A07.A0Q;
                            if (c2co.A03.A00()) {
                                C2CI c2ci = c2co.A02;
                                if (!AbstractC06440Vm.A01(1900596)) {
                                    C006802i c006802i = c2ci.A01;
                                    c006802i.markerStart(1900596, false);
                                    if (!AbstractC06440Vm.A01(1900596)) {
                                        c006802i.markerEnd(1900596, (short) 2);
                                    } else {
                                        c2ci.A00.postDelayed(new RunnableC64611TLx(c2ci), 120000L);
                                    }
                                }
                                Integer num3 = C05F.A00;
                                Integer num4 = null;
                                String str5 = null;
                                String str6 = null;
                                C14360o3.A0B(str2, 3);
                                if (c75363a3.A08()) {
                                    Integer num5 = c75363a3.A0E;
                                    num2 = C05F.A0N;
                                    if (num5 == num2) {
                                        num = C05F.A0C;
                                    } else {
                                        num = C05F.A01;
                                    }
                                } else {
                                    num = C05F.A0N;
                                    num2 = num;
                                }
                                boolean z2 = false;
                                if (c75363a3.A0E == num2) {
                                    z2 = true;
                                }
                                Boolean valueOf = Boolean.valueOf(z2);
                                Boolean valueOf2 = Boolean.valueOf(z);
                                ACC acc = c2co.A00;
                                if (acc != null) {
                                    num4 = Integer.valueOf(acc.A00);
                                    str6 = acc.A01;
                                    str5 = acc.A02;
                                }
                                C2CO.A00(c2co, valueOf, valueOf2, num4, null, num3, num, null, null, str2, str4, str5, str6, str, str3, i);
                            }
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
                
                    if (r11.A0N == false) goto L9;
                 */
                @Override // X.InterfaceC95254Ql
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void EIk(X.C4SG r11, java.lang.Object r12, int r13) {
                    /*
                        r10 = this;
                        if (r12 == 0) goto L77
                        X.30P r1 = r10.A09
                        X.4SH r2 = r1.A07(r12)
                        if (r2 == 0) goto L77
                        com.instagram.common.session.UserSession r6 = r10.A08
                        X.Xb2 r8 = new X.Xb2
                        r8.<init>(r6)
                        X.2pS r7 = r1.A00
                        android.content.Context r5 = r10.A07
                        r0 = 1365(0x555, float:1.913E-42)
                        java.lang.String r9 = X.AbstractC111324zv.A00(r0)
                        X.4SY r4 = new X.4SY
                        r4.<init>(r5, r6, r7, r8, r9)
                        r4.A01(r2)
                        int r0 = r11.A05
                        r4.A09 = r0
                        r4.A0K = r0
                        r4.A0L = r13
                        int r0 = r11.A09
                        r4.A0F = r0
                        int r0 = r11.A06
                        r4.A0A = r0
                        int r0 = r11.A0A
                        float r0 = (float) r0
                        r4.A02 = r0
                        boolean r0 = r2.A0M
                        if (r0 == 0) goto L41
                        boolean r3 = r11.A0N
                        r0 = 1
                        if (r3 != 0) goto L42
                    L41:
                        r0 = 0
                    L42:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        r4.A0V = r0
                        boolean r0 = r11.A0O
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        r4.A0W = r0
                        java.lang.String r0 = r1.A09()
                        r4.A1F = r0
                        java.lang.String r0 = r1.A02()
                        r4.A0m = r0
                        int r0 = r11.A0D
                        r4.A0P = r0
                        int r0 = r11.A02
                        r4.A0J = r0
                        int r0 = r10.A00
                        int r0 = r0 + 1
                        r10.A00 = r0
                        r4.A0M = r0
                        java.lang.Integer r0 = r11.A0H
                        r4.A0b = r0
                        java.lang.String r0 = r11.A0M
                        r4.A18 = r0
                        r10.A03(r4, r1, r2, r8)
                    L77:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C95244Qk.EIk(X.4SG, java.lang.Object, int):void");
                }

                @Override // X.InterfaceC95254Ql
                public final void EIl(C4SG c4sg, Object obj2, String str, int i) {
                    String str2;
                    C1CN c1cn;
                    String str3 = str;
                    if (obj2 != null) {
                        C30P c30p2 = this.A09;
                        C4SH A07 = c30p2.A07(obj2);
                        this.A05 = A07;
                        this.A01 = null;
                        this.A00 = 1;
                        if ((c30p2 instanceof C4SU) && ((C4SU) c30p2).A0H.Cc5()) {
                            str3 = "cobroadcast_finish";
                        }
                        UserSession userSession2 = this.A08;
                        C4SW c4sw = new C4SW(userSession2);
                        InterfaceC60442pS interfaceC60442pS = c30p2.A00;
                        C4SY c4sy = new C4SY(this.A07, userSession2, interfaceC60442pS, c4sw, "video_should_start");
                        c4sy.A15 = str3;
                        c4sy.A1F = c30p2.A09();
                        c4sy.A0m = c30p2.A02();
                        c4sy.A0M = this.A00;
                        c4sy.A03 = c4sg.A0B;
                        c4sy.A0b = c4sg.A0H;
                        if (A07 != null) {
                            c4sy.A01(A07);
                        }
                        C95224Qi c95224Qi2 = this.A04;
                        if (c95224Qi2 != null) {
                            c4sy.A0v = c95224Qi2.A00();
                        }
                        A03(c4sy, c30p2, A07, c4sw);
                        if (A07 != null) {
                            String A022 = A02(A07);
                            if (A022 != null && (c1cn = this.A0B) != null) {
                                c1cn.A0p(A022, str3);
                            }
                            if (A07.A04 != null && (str2 = A07.A0B) != null) {
                                this.A0A.A03.A00(A07, str2, str3, c30p2.A09(), interfaceC60442pS.getModuleName(), i);
                            }
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
                
                    if (r32.A0N == false) goto L8;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC95254Ql
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void EIm(X.C4SG r32, java.lang.Object r33, java.lang.String r34, long r35, boolean r37, boolean r38, boolean r39) {
                    /*
                        Method dump skipped, instructions count: 473
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C95244Qk.EIm(X.4SG, java.lang.Object, java.lang.String, long, boolean, boolean, boolean):void");
                }

                @Override // X.InterfaceC95254Ql
                public final void EIt(C4SG c4sg, Object obj2, int i) {
                    UserSession userSession2 = this.A08;
                    C4SW c4sw = new C4SW(userSession2);
                    C4SH A01 = A01(obj2);
                    if (A01 != null) {
                        int A00 = A00(c4sg, A01);
                        C30P c30p2 = this.A09;
                        C4SY c4sy = new C4SY(this.A07, userSession2, c30p2.A00, c4sw, "instagram_video_viewability_changed");
                        c4sy.A01(A01);
                        c4sy.A09 = A00;
                        c4sy.A0b = Integer.valueOf(i);
                        int i2 = this.A00 + 1;
                        this.A00 = i2;
                        c4sy.A0M = i2;
                        A03(c4sy, c30p2, A01, c4sw);
                    }
                }

                {
                    this.A04 = c95224Qi;
                    this.A09 = c30p;
                    this.A08 = userSession;
                    this.A07 = context;
                    this.A0A = A02;
                    this.A0B = A02.A07;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    this.A0C = C18U.A06(c06090Tz, userSession, 36315954237411160L);
                    this.A0D = C18U.A06(c06090Tz, userSession, 36318449613412502L);
                    this.A0E = C18U.A06(c06090Tz, userSession, 36315589165321648L);
                }

                private void A04(Object obj2, boolean z) {
                    C4SH A01 = A01(obj2);
                    if (A01 != null) {
                        UserSession userSession2 = this.A08;
                        C4SW c4sw = new C4SW(userSession2);
                        C30P c30p2 = this.A09;
                        C4SY c4sy = new C4SY(this.A07, userSession2, c30p2.A00, c4sw, "video_fetched");
                        c4sy.A01(A01);
                        c4sy.A0Y = Boolean.valueOf(z);
                        int i = this.A00 + 1;
                        this.A00 = i;
                        c4sy.A0M = i;
                        A03(c4sy, c30p2, A01, c4sw);
                    }
                }

                @Override // X.InterfaceC95254Ql
                public final void EIa(C4SG c4sg, Object obj2, String str, String str2, String str3) {
                    C4SH A01 = A01(obj2);
                    if (A01 != null) {
                        UserSession userSession2 = this.A08;
                        C4SW c4sw = new C4SW(userSession2);
                        C30P c30p2 = this.A09;
                        C4SY c4sy = new C4SY(this.A07, userSession2, c30p2.A00, c4sw, AbstractC111324zv.A00(3290));
                        c4sy.A01(A01);
                        c4sy.A15 = AnonymousClass001.A0g(str, ":", str2);
                        c4sy.A0q = str3;
                        c4sy.A03 = c4sg.A0B;
                        A03(c4sy, c30p2, A01, c4sw);
                    }
                }

                @Override // X.InterfaceC95254Ql
                public final void EIe(C4SG c4sg, Object obj2) {
                    String str;
                    boolean z;
                    boolean z2;
                    String str2;
                    String str3;
                    C4SH A01 = A01(obj2);
                    if (A01 != null) {
                        C75363a3 c75363a3 = A01.A04;
                        String A022 = A02(A01);
                        if (A022 != null) {
                            String str4 = null;
                            if (c75363a3 != null) {
                                ProductType productType = c75363a3.A09;
                                if (productType != null) {
                                    str = productType.A00;
                                } else {
                                    str = null;
                                }
                                str2 = AbstractC95674Sb.A00(c75363a3.A0E);
                                Boolean bool = c75363a3.A0B;
                                if (bool != null) {
                                    z = bool.booleanValue();
                                } else {
                                    z = false;
                                }
                                str3 = c75363a3.A0L;
                                z2 = c75363a3.A0T;
                            } else {
                                EnumC40111tc enumC40111tc = A01.A02;
                                if (enumC40111tc != null) {
                                    str = enumC40111tc.toString();
                                } else {
                                    str = null;
                                }
                                z = A01.A0M;
                                z2 = A01.A0Q;
                                str2 = null;
                                str3 = null;
                            }
                            C95224Qi c95224Qi2 = this.A04;
                            if (c95224Qi2 != null) {
                                str4 = c95224Qi2.A00();
                            }
                            C1CN c1cn = this.A0B;
                            if (c1cn != null) {
                                String str5 = c4sg.A0L;
                                c1cn.A0e(Boolean.valueOf(z), Integer.valueOf(c4sg.A07), A022, str, str5, str2, str3, c4sg.A00, str4, c4sg.A0P, z2);
                            }
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
                
                    if (r11.A0N == false) goto L8;
                 */
                @Override // X.InterfaceC95254Ql
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void EIn(X.C4SG r11, java.lang.Object r12, int r13, int r14, int r15) {
                    /*
                        r10 = this;
                        X.4SH r2 = r10.A01(r12)
                        if (r2 == 0) goto L6e
                        com.instagram.common.session.UserSession r6 = r10.A08
                        X.Xb1 r8 = new X.Xb1
                        r8.<init>(r6)
                        X.30P r1 = r10.A09
                        X.2pS r7 = r1.A00
                        android.content.Context r5 = r10.A07
                        java.lang.String r9 = "video_playing_update"
                        X.4SY r4 = new X.4SY
                        r4.<init>(r5, r6, r7, r8, r9)
                        r4.A01(r2)
                        boolean r0 = r2.A0M
                        if (r0 == 0) goto L26
                        boolean r3 = r11.A0N
                        r0 = 1
                        if (r3 != 0) goto L27
                    L26:
                        r0 = 0
                    L27:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        r4.A0V = r0
                        boolean r0 = r11.A0O
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        r4.A0W = r0
                        int r0 = r11.A05
                        r4.A09 = r0
                        int r0 = r11.A09
                        r4.A0F = r0
                        int r0 = r11.A06
                        r4.A0A = r0
                        r4.A0N = r15
                        java.lang.String r0 = r1.A09()
                        r4.A1F = r0
                        java.lang.String r0 = r1.A02()
                        r4.A0m = r0
                        int r0 = r11.A0D
                        r4.A0P = r0
                        int r0 = r11.A02
                        r4.A0J = r0
                        int r0 = r11.A04
                        r4.A08 = r0
                        int r0 = r11.A08
                        r4.A0E = r0
                        r4.A06 = r13
                        r4.A0G = r14
                        int r0 = r10.A00
                        int r0 = r0 + 1
                        r10.A00 = r0
                        r4.A0M = r0
                        r10.A03(r4, r1, r2, r8)
                    L6e:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C95244Qk.EIn(X.4SG, java.lang.Object, int, int, int):void");
                }

                @Override // X.InterfaceC95254Ql
                public final void EIo(Object obj2, String str, String str2, int i, long j) {
                    String str3;
                    C4SH A01 = A01(obj2);
                    if (A01 != null && (str3 = A01.A0B) != null && this.A0A.A03.A01.A00()) {
                        C2CG c2cg = C2CF.A0D;
                        int hashCode = str3.hashCode();
                        HashMap hashMap = new HashMap();
                        hashMap.put("video_id", str3);
                        hashMap.put("render_delay", String.valueOf(j));
                        hashMap.put("video_decoder", str);
                        hashMap.put("audio_decoder", str2);
                        hashMap.put("video_decoder_init_time", String.valueOf(i));
                        c2cg.A03(1900557, hashCode, hashMap);
                    }
                }

                @Override // X.InterfaceC95254Ql
                public final void EIp(Object obj2) {
                    String A022;
                    C1CN c1cn;
                    C4SH A01 = A01(obj2);
                    if (A01 != null && (A022 = A02(A01)) != null && (c1cn = this.A0B) != null) {
                        c1cn.A0l(A022);
                    }
                }

                @Override // X.InterfaceC95254Ql
                public final void EIq(C4SG c4sg, Object obj2) {
                    Float f;
                    C4SH A01 = A01(obj2);
                    if (A01 != null) {
                        int A00 = A00(c4sg, A01);
                        UserSession userSession2 = this.A08;
                        C4SW c4sw = new C4SW(userSession2);
                        C30P c30p2 = this.A09;
                        C4SY c4sy = new C4SY(this.A07, userSession2, c30p2.A00, c4sw, AbstractC111324zv.A00(3300));
                        c4sy.A01(A01);
                        c4sy.A0P = c4sg.A0D;
                        c4sy.A0O = c4sg.A0C;
                        c4sy.A0d = c4sg.A0I;
                        c4sy.A09 = A00;
                        c4sy.A0F = c4sg.A09;
                        c4sy.A02 = c4sg.A0A;
                        int i = this.A00 + 1;
                        this.A00 = i;
                        c4sy.A0M = i;
                        Boolean bool = c4sg.A0E;
                        if (bool != null) {
                            c4sy.A0H = bool.booleanValue() ? 1 : 0;
                        }
                        Float f2 = c4sg.A0G;
                        if (f2 != null && (f = c4sg.A0F) != null) {
                            c4sy.A05 = f2.floatValue();
                            c4sy.A04 = f.floatValue();
                        }
                        A03(c4sy, c30p2, A01, c4sw);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
                
                    if (r11.A0N == false) goto L8;
                 */
                @Override // X.InterfaceC95254Ql
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void EIr(X.C4SG r11, java.lang.Object r12) {
                    /*
                        r10 = this;
                        X.4SH r2 = r10.A01(r12)
                        if (r2 == 0) goto L68
                        com.instagram.common.session.UserSession r6 = r10.A08
                        X.Xb4 r8 = new X.Xb4
                        r8.<init>(r6)
                        X.30P r1 = r10.A09
                        X.2pS r7 = r1.A00
                        android.content.Context r5 = r10.A07
                        java.lang.String r9 = "video_viewed"
                        X.4SY r4 = new X.4SY
                        r4.<init>(r5, r6, r7, r8, r9)
                        r4.A01(r2)
                        boolean r0 = r2.A0M
                        if (r0 == 0) goto L26
                        boolean r3 = r11.A0N
                        r0 = 1
                        if (r3 != 0) goto L27
                    L26:
                        r0 = 0
                    L27:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        r4.A0V = r0
                        boolean r0 = r11.A0O
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        r4.A0W = r0
                        int r0 = r11.A05
                        r4.A09 = r0
                        int r0 = r11.A09
                        r4.A0F = r0
                        int r0 = r11.A06
                        r4.A0A = r0
                        java.lang.String r0 = r1.A09()
                        r4.A1F = r0
                        java.lang.String r0 = r1.A02()
                        r4.A0m = r0
                        int r0 = r11.A0D
                        r4.A0P = r0
                        int r0 = r11.A02
                        r4.A0J = r0
                        int r0 = r11.A04
                        r4.A08 = r0
                        int r0 = r11.A08
                        r4.A0E = r0
                        int r0 = r10.A00
                        int r0 = r0 + 1
                        r10.A00 = r0
                        r4.A0M = r0
                        r10.A03(r4, r1, r2, r8)
                    L68:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C95244Qk.EIr(X.4SG, java.lang.Object):void");
                }

                @Override // X.InterfaceC95254Ql
                public final void EIs(Object obj2, String str, String str2, String str3) {
                    C4SH A01 = A01(obj2);
                    if (A01 != null) {
                        UserSession userSession2 = this.A08;
                        C4SW c4sw = new C4SW(userSession2);
                        C30P c30p2 = this.A09;
                        C4SY c4sy = new C4SY(this.A07, userSession2, c30p2.A00, c4sw, "video_playback_warning");
                        c4sy.A01(A01);
                        c4sy.A15 = AnonymousClass001.A0g(str, ":", str2);
                        c4sy.A0q = str3;
                        A03(c4sy, c30p2, A01, c4sw);
                    }
                }
            };
        } else {
            obj = new Object();
        }
        InterfaceC95254Ql interfaceC95254Ql = (InterfaceC95254Ql) obj;
        if (C18U.A06(C06090Tz.A05, userSession, 36328405347614200L)) {
            return new C49681LxC(interfaceC95254Ql, c30p);
        }
        return interfaceC95254Ql;
    }
}
