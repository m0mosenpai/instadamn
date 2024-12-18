package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.direct.send.mutation.DirectConfigureAnimatedMediaMessageMutationProcessor;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.EventRouter;
import com.instagram.realtimeclient.MainRealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeDelegateProvider;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;
import com.instagram.realtimeclient.RealtimeOperation;
import com.instagram.realtimeclient.RealtimeProtocol;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28551Zq {
    public static C28551Zq A01;
    public final Context A00;

    public static synchronized C28551Zq A00(Context context) {
        C28551Zq c28551Zq;
        synchronized (C28551Zq.class) {
            c28551Zq = A01;
            if (c28551Zq == null) {
                c28551Zq = new C28551Zq(context.getApplicationContext());
                A01 = c28551Zq;
            }
        }
        return c28551Zq;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, X.1aG] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.1aS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, X.1aV] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.1aX] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.1Zs, java.lang.Object] */
    public final void A01(final android.net.Uri uri) {
        final Context context = this.A00;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(uri, 2);
        ?? obj = new Object();
        AbstractC28591Zu abstractC28591Zu = new AbstractC28591Zu(context) { // from class: X.1Zt
            public final java.util.Set A00 = Collections.synchronizedSet(new HashSet());
            public final Context A01;

            /* JADX WARN: Code restructure failed: missing block: B:112:0x0340, code lost:
            
                if (X.C18U.A06(r3, r20, 36328061751671950L) != false) goto L124;
             */
            /* JADX WARN: Code restructure failed: missing block: B:138:0x0384, code lost:
            
                if (com.instagram.realtimeclient.RealtimeClientManager.getInstance(r20).isMqttConnected() == false) goto L137;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x004f, code lost:
            
                if (r9.C76(r6) == null) goto L6;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:115:0x034c  */
            /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r0v146 */
            /* JADX WARN: Type inference failed for: r0v147 */
            /* JADX WARN: Type inference failed for: r0v37, types: [X.MOH] */
            @Override // X.C1WE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A06(X.C116155Nu r19, com.instagram.common.session.UserSession r20, java.lang.String r21) {
                /*
                    Method dump skipped, instructions count: 1005
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C28581Zt.A06(X.5Nu, com.instagram.common.session.UserSession, java.lang.String):void");
            }

            @Override // X.C1WE
            public final boolean A09(C116155Nu c116155Nu, UserSession userSession, String str) {
                PushChannelType pushChannelType;
                if (userSession != null) {
                    C14360o3.A0B(str, 0);
                    String A012 = AbstractC162167Oa.A01("thread_id:", str);
                    String str2 = userSession.userId;
                    String A0g = AnonymousClass001.A0g(str2, "_", A012);
                    if (str2.equals(c116155Nu.A0j) && A012 != null && !c116155Nu.A05() && !c116155Nu.A1S && !this.A00.contains(A0g) && ((((pushChannelType = c116155Nu.A0B) != PushChannelType.A08 && pushChannelType != PushChannelType.A0F) || !C18U.A06(C06090Tz.A05, userSession, 36318806096091642L)) && (!RealtimeClientManager.getInstance(userSession).isMqttConnected() || C18U.A06(C06090Tz.A05, userSession, 36318806095698424L)))) {
                        return true;
                    }
                }
                return false;
            }

            @Override // X.C1WE
            public final String A0C() {
                return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            }

            @Override // X.C1WE
            public final String A03(C116155Nu c116155Nu, UserSession userSession) {
                EnumC117355Su enumC117355Su;
                boolean contains;
                if (userSession != null && AbstractC117345St.A01(userSession) && "direct_v2_message".equals(c116155Nu.A0X)) {
                    if (c116155Nu.A03() != null && c116155Nu.A03().CVQ()) {
                        InterfaceC09390do interfaceC09390do = AbstractC43605JQl.A00;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (!C18U.A06(c06090Tz, userSession, 36320326514975096L) && !C18U.A06(c06090Tz, userSession, 36320326514844022L)) {
                            return null;
                        }
                    }
                    if (!c116155Nu.A1S && !c116155Nu.A05()) {
                        InterfaceC09390do interfaceC09390do2 = AbstractC43605JQl.A00;
                        C06090Tz c06090Tz2 = C06090Tz.A05;
                        boolean A06 = C18U.A06(c06090Tz2, userSession, 36320326514385264L);
                        String str = c116155Nu.A11;
                        if (A06) {
                            if (str != null) {
                                contains = LFX.A00.A00(userSession, str);
                            } else {
                                return null;
                            }
                        } else {
                            if (C14360o3.A0K(str, "direct_v2_text")) {
                                enumC117355Su = EnumC117355Su.A06;
                            } else if (C14360o3.A0K(str, "direct_v2_reel_share")) {
                                enumC117355Su = EnumC117355Su.A05;
                            } else {
                                enumC117355Su = EnumC117355Su.A07;
                            }
                            contains = AbstractC117345St.A00.contains(enumC117355Su);
                        }
                        if (contains) {
                            String str2 = c116155Nu.A11;
                            if (str2 != null) {
                                if (str2.equals("direct_v2_broadcast_chat_new_message")) {
                                    return c116155Nu.A0x;
                                }
                                if ((str2.equals("direct_v2_like") || str2.equals("direct_v2_user_reaction")) && C18U.A06(c06090Tz2, userSession, 36320326514909559L)) {
                                    return c116155Nu.A0s;
                                }
                            }
                            return AbstractC43609JQq.A02(c116155Nu);
                        }
                        return null;
                    }
                    return null;
                }
                return null;
            }

            @Override // X.C1WE
            public final boolean A07(C116155Nu c116155Nu) {
                return c116155Nu.A0X.equals("direct_v2_delete_item");
            }

            @Override // X.C1WE
            public final boolean A08(C116155Nu c116155Nu) {
                return c116155Nu.A0X.equals("direct_v2_edit_message");
            }

            @Override // X.C1WE
            public final String A0A(C116155Nu c116155Nu, UserSession userSession) {
                String str;
                String str2 = c116155Nu.A0g;
                String str3 = null;
                if (str2 != null) {
                    str = AbstractC162167Oa.A00(AbstractC08820cl.A03(str2), c116155Nu.A0X);
                } else {
                    str = null;
                }
                String str4 = c116155Nu.A0j;
                if ("direct_v2_reply_reminder".equals(c116155Nu.A0X)) {
                    str3 = "rr";
                }
                return AbstractC162167Oa.A02(str4, str, str3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v10, types: [X.0Jk, java.lang.Object] */
            @Override // X.C1WE
            public final void A0B(C116155Nu c116155Nu, UserSession userSession, String str, boolean z) {
                final String str2;
                String str3 = c116155Nu.A0g;
                if (str3 == null) {
                    str3 = "";
                }
                android.net.Uri A03 = AbstractC08820cl.A03(str3);
                String str4 = c116155Nu.A0j;
                C14360o3.A0B(A03, 0);
                if (A03.getQueryParameter("sid") != null) {
                    str2 = A03.getQueryParameter("sid");
                } else {
                    str2 = c116155Nu.A1A;
                }
                final String A012 = AbstractC43609JQq.A01(A03);
                final String A00 = AbstractC43609JQq.A00(A03);
                String queryParameter = A03.getQueryParameter("dr");
                if (queryParameter != null && queryParameter.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                    String queryParameter2 = A03.getQueryParameter("ts");
                    final Long l = null;
                    if (queryParameter2 != null) {
                        try {
                            l = Long.valueOf(Long.parseLong(queryParameter2));
                        } catch (NumberFormatException unused) {
                            C0w9.A03("DirectNotificationUtils_ts", AnonymousClass001.A0R("Invalid ts: ", queryParameter2));
                        }
                    }
                    final String str5 = c116155Nu.A0s;
                    if (str4 != null && str2 != null && A012 != null && A00 != null && l != null && str5 != null) {
                        C023409i.A0A.A0A(new Object(), null, new C0JG() { // from class: X.Lvj
                            @Override // X.C0JG
                            public final void ATM(UserSession userSession2, final InterfaceC03960Jm interfaceC03960Jm) {
                                String str6 = str2;
                                String str7 = A012;
                                String str8 = A00;
                                String str9 = str5;
                                long longValue = l.longValue();
                                Runnable runnable = new Runnable() { // from class: X.M1O
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        InterfaceC03960Jm.this.AIn(null);
                                    }
                                };
                                C25621Ms A0C = AbstractC31179DnN.A0C(userSession2);
                                A0C.A0B("direct_v2/delivery_receipt/");
                                A0C.A9s("sender_ig_id", str6);
                                A0C.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str7);
                                A0C.A9s("item_id", str8);
                                A0C.A9s("item_client_context", str9);
                                A0C.A9s("watermark_ts_ms", String.valueOf(longValue));
                                C1ON A0K = AbstractC31178DnM.A0K(A0C, "dr_disable", "0");
                                A0K.A00 = new EV0(runnable, 1);
                                C1GJ.A03(A0K);
                            }
                        }, str4);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid params: recipientId=");
                        sb.append(str4);
                        sb.append(" senderId=");
                        sb.append(str2);
                        sb.append(" threadId=");
                        sb.append(A012);
                        sb.append(" messageId=");
                        sb.append(A00);
                        sb.append(" timestampMs=");
                        sb.append(l);
                        sb.append(" clientContext=");
                        sb.append(str5);
                        C0w9.A03("DirectPushNotificationHandler_sendDeliveryReceipt", sb.toString());
                    }
                }
                LG9.A00(userSession).A01(c116155Nu);
                Context context2 = this.A01;
                C14360o3.A0B(context2, 0);
                if (userSession != null && OZB.A00(context2, userSession)) {
                    if (C14360o3.A0K(userSession.userId, AbstractC19750y3.A01("stella_direct_shared_preference").getString("pairedIgUserId", null))) {
                        C48525LdN c48525LdN = (C48525LdN) userSession.A01(C48525LdN.class, new C50171MDy(9, context2, userSession));
                        if (new C23821Ep(c48525LdN.A01).A00.areNotificationsEnabled()) {
                            HandlerC25861Nt handlerC25861Nt = c48525LdN.A00;
                            if (handlerC25861Nt == null) {
                                C14360o3.A0F("handler");
                                throw C00O.createAndThrow();
                            }
                            handlerC25861Nt.A01(33735910, new M4Q(c116155Nu, c48525LdN));
                        }
                    }
                }
            }

            {
                this.A01 = context.getApplicationContext();
            }

            @Override // X.C1WE
            public final void A04(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, String str) {
                LG9.A00(AbstractC03270Dk.A01(abstractC12990ll)).A01(c116155Nu);
            }

            @Override // X.C1WE
            public final void A05(C116155Nu c116155Nu, UserSession userSession, String str) {
                LG9.A00(userSession).A01(c116155Nu);
                AbstractC86593tX.A0Q(this.A01, c116155Nu, userSession);
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
            
                if (r0.booleanValue() == false) goto L11;
             */
            @Override // X.C1WE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A0D(X.C116155Nu r8, X.AbstractC12990ll r9, X.L85 r10, java.lang.String r11) {
                /*
                    r7 = this;
                    com.instagram.common.session.UserSession r4 = X.AbstractC03270Dk.A01(r9)
                    r3 = 0
                    X.C14360o3.A0B(r11, r3)
                    java.lang.String r0 = "thread_id:"
                    java.lang.String r5 = X.AbstractC162167Oa.A01(r0, r11)
                    java.lang.String r1 = r8.A11
                    java.lang.String r0 = "direct_v2_pending"
                    boolean r0 = r0.equals(r1)
                    r6 = 0
                    if (r0 == 0) goto L33
                    if (r4 == 0) goto L33
                    java.lang.String r1 = r4.userId
                    java.lang.String r0 = r8.A0j
                    boolean r0 = r1.equals(r0)
                    if (r0 != 0) goto L39
                    java.lang.Boolean r0 = r8.A0F
                    if (r0 == 0) goto L32
                    boolean r0 = r0.booleanValue()
                    r6 = 1
                    if (r0 != 0) goto L33
                L32:
                    r6 = 0
                L33:
                    r0 = r6 ^ 1
                    r10.A00(r0)
                    return
                L39:
                    X.0Tz r2 = X.C06090Tz.A06
                    r0 = 2342154921886876463(0x2081017e0000032f, double:4.058728513124833E-152)
                    boolean r0 = X.C18U.A06(r2, r4, r0)
                    if (r0 != 0) goto L51
                    r0 = 36311912674034480(0x81017e000d0330, double:3.027138019171048E-306)
                    boolean r0 = X.C18U.A06(r2, r4, r0)
                    if (r0 == 0) goto L33
                L51:
                    com.instagram.direct.perf.constants.ThreadFetchReason r1 = com.instagram.direct.perf.constants.ThreadFetchReason.CHECK_MUTED_WORDS_FOR_PUSH
                    r0 = 1
                    X.C14360o3.A0B(r5, r0)
                    r0 = 20
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    X.2EC r0 = X.LL3.A00(r4, r1, r0, r5, r3)
                    if (r0 == 0) goto L33
                    boolean r0 = r0.Aqm()
                    if (r0 == 0) goto L33
                    r6 = 1
                    goto L33
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C28581Zt.A0D(X.5Nu, X.0ll, X.L85, java.lang.String):void");
            }
        };
        HashMap hashMap = C1WZ.A09;
        hashMap.put("direct_v2_message", abstractC28591Zu);
        hashMap.put("direct_v2_delete_item", abstractC28591Zu);
        hashMap.put("direct_v2_reply_reminder", abstractC28591Zu);
        hashMap.put("direct_v2_channel_direct_invites", abstractC28591Zu);
        hashMap.put("direct_v2_edit_message", abstractC28591Zu);
        C27741Wc.A01().A05(new AbstractC28611Zw(context, uri) { // from class: X.1Zv
            public static final InterfaceC08100bW A02 = new C1QF("IgSecureUriParser").A00;
            public final Context A00;
            public final android.net.Uri A01;

            @Override // X.AbstractC28611Zw
            public final List A00(String str, Collection collection) {
                String str2;
                C14360o3.A0B(str, 0);
                boolean z = false;
                if (str.length() == 0) {
                    z = true;
                }
                String str3 = "";
                if (!z && AbstractC001900j.A0a(str, ";", false) && (str2 = ((String[]) new C11L(";").A03(str).toArray(new String[0]))[0]) != null && str2.length() != 0) {
                    str3 = str2;
                }
                String A012 = AbstractC162167Oa.A01("thread_id:", str);
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(A012)) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(AbstractC162167Oa.A02(str3, A012, "rr"));
                    return linkedList;
                }
                return new ArrayList();
            }

            @Override // X.C1WJ
            public final void AB1(C116155Nu c116155Nu, UserSession userSession, String str) {
                C14360o3.A0B(str, 0);
                C9C9 c9c9 = new C9C9(AbstractC162167Oa.A01("thread_id:", str), c116155Nu.A11, 7);
                if (userSession != null) {
                    AbstractC162187Oc.A00(c9c9, userSession).A01(c9c9);
                }
            }

            @Override // X.C1WJ
            public final boolean ACT(C116155Nu c116155Nu, C116155Nu c116155Nu2) {
                if (c116155Nu == null || c116155Nu2 == null) {
                    return false;
                }
                String str = c116155Nu.A0g;
                String str2 = c116155Nu2.A0g;
                if (str == null || str2 == null) {
                    return false;
                }
                android.net.Uri A03 = AbstractC08820cl.A03(str);
                C14360o3.A07(A03);
                android.net.Uri A032 = AbstractC08820cl.A03(str2);
                C14360o3.A07(A032);
                String A012 = AbstractC43609JQq.A01(A03);
                String A013 = AbstractC43609JQq.A01(A032);
                String A00 = AbstractC43609JQq.A00(A03);
                return A012 != null && A00 != null && A012.equals(A013) && A00.equals(AbstractC43609JQq.A00(A032));
            }

            @Override // X.C1WJ
            public final String Amb() {
                return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            }

            @Override // X.C1WJ
            public final void DW8(C116155Nu c116155Nu, UserSession userSession) {
                AbstractC86593tX.A0Q(this.A00, c116155Nu, userSession);
            }

            {
                this.A00 = context.getApplicationContext();
                this.A01 = uri;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
            
                if (r0.CYc() != false) goto L12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:208:0x07ea, code lost:
            
                if (r10.A1S != false) goto L246;
             */
            /* JADX WARN: Code restructure failed: missing block: B:233:0x08bc, code lost:
            
                if (r23.CVQ() != false) goto L274;
             */
            /* JADX WARN: Code restructure failed: missing block: B:235:0x08c2, code lost:
            
                if (X.AbstractC43609JQq.A03(r9, r46) != false) goto L283;
             */
            /* JADX WARN: Code restructure failed: missing block: B:236:0x08c4, code lost:
            
                if (r6 == null) goto L372;
             */
            /* JADX WARN: Code restructure failed: missing block: B:238:0x08ca, code lost:
            
                if (r6.length() == 0) goto L372;
             */
            /* JADX WARN: Code restructure failed: missing block: B:240:0x08d4, code lost:
            
                if (X.C0BQ.A00(r46).CLL() == false) goto L282;
             */
            /* JADX WARN: Code restructure failed: missing block: B:241:0x08d6, code lost:
            
                r6 = r1.getString(com.facebook.R.string.res_0x7f130050_name_removed, r22.getUsername(), r6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:242:0x08e5, code lost:
            
                r13 = r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:244:0x0a7a, code lost:
            
                if (X.C0BQ.A00(r46).CLL() == false) goto L375;
             */
            /* JADX WARN: Code restructure failed: missing block: B:245:0x0a7c, code lost:
            
                r6 = r22.getUsername();
             */
            /* JADX WARN: Code restructure failed: missing block: B:246:0x0a82, code lost:
            
                r6 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:247:0x08e6, code lost:
            
                r10.A02 = r13;
                r10.A01 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:289:0x093e, code lost:
            
                if (r5 != null) goto L305;
             */
            /* JADX WARN: Code restructure failed: missing block: B:312:0x0a1d, code lost:
            
                if (r13 == null) goto L343;
             */
            /* JADX WARN: Code restructure failed: missing block: B:352:0x0af8, code lost:
            
                if (r7.A1S != false) goto L397;
             */
            /* JADX WARN: Code restructure failed: missing block: B:372:0x0b95, code lost:
            
                if (r7.A1S != false) goto L417;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x012e, code lost:
            
                if (r14.A03(r10) != false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:390:0x0a91, code lost:
            
                if (r5.CVQ() == true) goto L274;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x02cf  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x02d9  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x031d  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x02ea  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x02fb  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x0309 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:152:0x0456 A[Catch: Exception -> 0x067e, TryCatch #0 {Exception -> 0x067e, blocks: (B:134:0x03f1, B:136:0x03f5, B:138:0x03fb, B:140:0x0408, B:142:0x0413, B:144:0x0426, B:146:0x0431, B:148:0x0435, B:149:0x0449, B:152:0x0456, B:154:0x045e, B:156:0x0464, B:158:0x0471, B:160:0x047e, B:162:0x048a, B:164:0x048f, B:171:0x0492, B:173:0x0498, B:437:0x04a4, B:439:0x04b3, B:440:0x04b7, B:442:0x04bd, B:445:0x04ce, B:447:0x04d2, B:449:0x04db, B:450:0x04e7, B:451:0x04f0, B:453:0x04f6, B:456:0x050b, B:459:0x0515, B:465:0x0519, B:468:0x0529, B:469:0x0532, B:471:0x0538, B:476:0x0563, B:477:0x0570, B:479:0x0576, B:482:0x0586, B:485:0x058e, B:491:0x0592, B:494:0x0622, B:496:0x0447, B:498:0x043e), top: B:133:0x03f1, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:173:0x0498 A[Catch: Exception -> 0x067e, TryCatch #0 {Exception -> 0x067e, blocks: (B:134:0x03f1, B:136:0x03f5, B:138:0x03fb, B:140:0x0408, B:142:0x0413, B:144:0x0426, B:146:0x0431, B:148:0x0435, B:149:0x0449, B:152:0x0456, B:154:0x045e, B:156:0x0464, B:158:0x0471, B:160:0x047e, B:162:0x048a, B:164:0x048f, B:171:0x0492, B:173:0x0498, B:437:0x04a4, B:439:0x04b3, B:440:0x04b7, B:442:0x04bd, B:445:0x04ce, B:447:0x04d2, B:449:0x04db, B:450:0x04e7, B:451:0x04f0, B:453:0x04f6, B:456:0x050b, B:459:0x0515, B:465:0x0519, B:468:0x0529, B:469:0x0532, B:471:0x0538, B:476:0x0563, B:477:0x0570, B:479:0x0576, B:482:0x0586, B:485:0x058e, B:491:0x0592, B:494:0x0622, B:496:0x0447, B:498:0x043e), top: B:133:0x03f1, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:177:0x06b5  */
            /* JADX WARN: Removed duplicated region for block: B:190:0x073c  */
            /* JADX WARN: Removed duplicated region for block: B:269:0x0952  */
            /* JADX WARN: Removed duplicated region for block: B:272:0x096b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:276:0x08f2 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:277:0x096f  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
            /* JADX WARN: Removed duplicated region for block: B:437:0x04a4 A[Catch: Exception -> 0x067e, TryCatch #0 {Exception -> 0x067e, blocks: (B:134:0x03f1, B:136:0x03f5, B:138:0x03fb, B:140:0x0408, B:142:0x0413, B:144:0x0426, B:146:0x0431, B:148:0x0435, B:149:0x0449, B:152:0x0456, B:154:0x045e, B:156:0x0464, B:158:0x0471, B:160:0x047e, B:162:0x048a, B:164:0x048f, B:171:0x0492, B:173:0x0498, B:437:0x04a4, B:439:0x04b3, B:440:0x04b7, B:442:0x04bd, B:445:0x04ce, B:447:0x04d2, B:449:0x04db, B:450:0x04e7, B:451:0x04f0, B:453:0x04f6, B:456:0x050b, B:459:0x0515, B:465:0x0519, B:468:0x0529, B:469:0x0532, B:471:0x0538, B:476:0x0563, B:477:0x0570, B:479:0x0576, B:482:0x0586, B:485:0x058e, B:491:0x0592, B:494:0x0622, B:496:0x0447, B:498:0x043e), top: B:133:0x03f1, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x01aa  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01ef  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0237  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0c9e  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x02be  */
            /* JADX WARN: Type inference failed for: r0v107, types: [X.MOH] */
            /* JADX WARN: Type inference failed for: r0v111 */
            /* JADX WARN: Type inference failed for: r0v112 */
            /* JADX WARN: Type inference failed for: r7v4, types: [androidx.core.app.NotificationCompat$InboxStyle, X.Xpo] */
            @Override // X.C1WJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C47690L3x AEk(com.instagram.common.session.UserSession r46, java.lang.String r47, java.lang.String r48, java.util.List r49, boolean r50) {
                /*
                    Method dump skipped, instructions count: 3238
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C28601Zv.AEk(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.util.List, boolean):X.L3x");
            }
        }, AbstractC19750y3.A01("direct_thread_notifications"), RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        AbstractC28571Zs.A00 = obj;
        AbstractC28641a0.A00 = new C0KV() { // from class: X.1Zz
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.2DO] */
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(-1191761197);
                int A032 = C0f9.A03(457712923);
                C14360o3.A0B(userSession, 0);
                C2DP c2dp = new C2DP(userSession.deviceSession.A06(), AbstractC25651Mw.A00(userSession), userSession, new Object(), (C2DK) userSession.A01(C2DK.class, new C37058GUs(userSession, 34)), new C37058GUs(userSession, 35));
                C0f9.A0A(-1563240797, A032);
                C0f9.A0A(608572427, A03);
                return c2dp;
            }
        };
        RealtimeClientManager.addRealtimeDelegateProvider(new RealtimeDelegateProvider() { // from class: X.1a2
            @Override // com.instagram.realtimeclient.RealtimeDelegateProvider
            public final MainRealtimeEventHandler.Delegate get(final UserSession userSession) {
                return new MainRealtimeEventHandler.Delegate(userSession) { // from class: X.4Jm
                    public final C93814Jp A00;

                    @Override // com.instagram.realtimeclient.MainRealtimeEventHandler.Delegate
                    public final String getProtocol() {
                        return RealtimeProtocol.DIRECT_V2;
                    }

                    @Override // com.instagram.realtimeclient.MainRealtimeEventHandler.Delegate
                    public final int getSkywalkerMessageType() {
                        return 1;
                    }

                    @Override // com.instagram.realtimeclient.MainRealtimeEventHandler.Delegate
                    public final void handleRealtimeOperation(RealtimeOperation realtimeOperation) {
                        String str;
                        DLog.d(DLogTag.DIRECT_REAL_TIME.INSTANCE, "op=%s", realtimeOperation.op);
                        if (realtimeOperation.op.ordinal() == 0) {
                            String str2 = realtimeOperation.path;
                            if (str2.startsWith(RealtimeProtocol.THREADS_PREFIX) && str2.contains(RealtimeProtocol.ACTIVITY_INDICATOR_COMPONENT)) {
                                C0K8.A02(C93794Jm.class, "indicate_activity: in addOrReplaceDirectActivityIndicator");
                                Map match = EventRouter.match(RealtimeProtocol.ADD_DIRECT_V2_INDICATE_ACTIVITY_TEMPLATE, realtimeOperation.path);
                                if (match != null && (str = (String) match.get(RealtimeProtocol.THREAD_ID)) != null) {
                                    try {
                                        C32071E6x parseFromJson = AbstractC46847Kng.parseFromJson(C16V.A00(realtimeOperation.value));
                                        C93814Jp c93814Jp = this.A00;
                                        C6C2 c6c2 = new C6C2(str, null);
                                        C6C2 c6c22 = new C6C2(parseFromJson.A01, null);
                                        C93814Jp.A00(c93814Jp, c6c2, c6c22, parseFromJson.A00);
                                        C93834Jr c93834Jr = c93814Jp.A02;
                                        C47578Kzo c47578Kzo = (C47578Kzo) c93834Jr.A00(c6c22);
                                        if (c47578Kzo != null) {
                                            c93814Jp.A00.removeMessages(1, c47578Kzo);
                                            C6C2 c6c23 = c47578Kzo.A00;
                                            String str3 = c6c23.A01;
                                            String str4 = c6c2.A01;
                                            if (str4 == null || !str4.equals(str3)) {
                                                C6C2 c6c24 = c47578Kzo.A01;
                                                String str5 = c6c24.A01;
                                                if (str5 != null) {
                                                    c93834Jr.A02.remove(str5);
                                                }
                                                C93814Jp.A00(c93814Jp, c6c23, c6c24, 0);
                                            }
                                        }
                                        C47578Kzo c47578Kzo2 = new C47578Kzo(c6c22, c6c2);
                                        c93834Jr.A01(c6c22, c47578Kzo2);
                                        Handler handler = c93814Jp.A00;
                                        Message obtainMessage = handler.obtainMessage(1, c47578Kzo2);
                                        C14360o3.A07(obtainMessage);
                                        handler.sendMessageDelayed(obtainMessage, 10000L);
                                    } catch (IOException e) {
                                        C0K8.A05(C93794Jm.class, "invalid activityStatus format from realtime value:", e);
                                    }
                                }
                            }
                        }
                    }

                    {
                        this.A00 = AbstractC93804Jo.A00(userSession);
                    }
                };
            }
        });
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new RealtimeEventHandlerProvider() { // from class: X.1a4
            @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
            public final RealtimeEventHandler get(UserSession userSession) {
                return C28811aJ.A00(userSession);
            }
        });
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new RealtimeEventHandlerProvider() { // from class: X.1a6
            @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
            public final RealtimeEventHandler get(UserSession userSession) {
                return (RealtimeEventHandler) userSession.A01(C94054Kp.class, new C94064Kq(userSession, C28551Zq.this.A00));
            }
        });
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new RealtimeEventHandlerProvider() { // from class: X.1a7
            @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
            public final RealtimeEventHandler get(UserSession userSession) {
                C14360o3.A0B(userSession, 0);
                return (RealtimeEventHandler) AbstractC41851wZ.A00(userSession).A01(C94084Ku.class, C94074Kt.A00);
            }
        });
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(new RealtimeEventHandlerProvider() { // from class: X.1a8
            @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
            public final RealtimeEventHandler get(UserSession userSession) {
                return AbstractC94094Kv.A00(userSession);
            }
        });
        C0KV c0kv = C28711a9.A01;
        C14360o3.A0B(c0kv, 0);
        C28741aC.A0N = c0kv;
        AbstractC28761aE.A00.add(new Object());
        C28781aG.A00 = new Object();
        C0KV c0kv2 = new C0KV() { // from class: X.1aH
            @Override // X.C0KV
            public final Object AXR(final UserSession userSession) {
                return new InterfaceC93894Jz(userSession) { // from class: X.4Jy
                    public final UserSession A00;

                    @Override // X.InterfaceC93894Jz
                    public final void DAJ(C83403nh c83403nh, DirectThreadKey directThreadKey, boolean z) {
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void DAK(DirectThreadKey directThreadKey, Long l, String str, boolean z) {
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void DAL(C83403nh c83403nh, DirectThreadKey directThreadKey, boolean z) {
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void Drg(C5lP c5lP) {
                        C26141Ov.A01(this.A00).A08(c5lP.A04, null, null);
                    }

                    {
                        this.A00 = userSession;
                    }
                };
            }
        };
        List list = C28811aJ.A0u;
        list.add(c0kv2);
        List list2 = C28821aL.A06;
        list2.add(c0kv2);
        C0KV c0kv3 = new C0KV() { // from class: X.1aM
            @Override // X.C0KV
            public final Object AXR(final UserSession userSession) {
                return new InterfaceC93894Jz(userSession) { // from class: X.4K0
                    public final UserSession A00;

                    {
                        C14360o3.A0B(userSession, 1);
                        this.A00 = userSession;
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void DAJ(C83403nh c83403nh, DirectThreadKey directThreadKey, boolean z) {
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void DAK(DirectThreadKey directThreadKey, Long l, String str, boolean z) {
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void DAL(C83403nh c83403nh, DirectThreadKey directThreadKey, boolean z) {
                        if (C2EY.A0L == c83403nh.A10) {
                            UserSession userSession2 = this.A00;
                            ArrayList Ab7 = AbstractC28761aE.A00(userSession2).Ab7(directThreadKey, false);
                            String str = directThreadKey.A00;
                            if (str != null) {
                                AbstractC162277Op.A02(userSession2, str, Ab7);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void Drg(C5lP c5lP) {
                    }
                };
            }
        };
        list.add(c0kv3);
        list2.add(c0kv3);
        C0KV c0kv4 = new C0KV() { // from class: X.1aN
            @Override // X.C0KV
            public final Object AXR(final UserSession userSession) {
                return new InterfaceC93894Jz(userSession) { // from class: X.4K1
                    public final UserSession A00;

                    {
                        C14360o3.A0B(userSession, 1);
                        this.A00 = userSession;
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void DAJ(C83403nh c83403nh, DirectThreadKey directThreadKey, boolean z) {
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void DAK(DirectThreadKey directThreadKey, Long l, String str, boolean z) {
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void Drg(C5lP c5lP) {
                    }

                    @Override // X.InterfaceC93894Jz
                    public final void DAL(C83403nh c83403nh, DirectThreadKey directThreadKey, boolean z) {
                        String str = directThreadKey.A00;
                        UserSession userSession2 = this.A00;
                        C81663kb A03 = C2DU.A03((C2DU) AbstractC28761aE.A00(userSession2), directThreadKey);
                        if (str != null && A03 != null && !A03.CVQ() && !A03.CX1() && !A03.CWl() && !A03.CWj(userSession2) && !c83403nh.A2P && !C14360o3.A0K(userSession2.userId, c83403nh.BtE()) && c83403nh.A10 == C2EY.A1i && C18U.A06(C06090Tz.A05, userSession2, 36314867610815353L)) {
                            F21.A00(userSession2, c83403nh, C05F.A00, str);
                        }
                    }
                };
            }
        };
        list.add(c0kv4);
        list2.add(c0kv4);
        C0KV c0kv5 = new C0KV() { // from class: X.1aO
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(-1241855559);
                int A032 = C0f9.A03(994047750);
                C14360o3.A0B(userSession, 0);
                Object A012 = userSession.A01(C452726k.class, new MHJ(userSession, 19));
                C0f9.A0A(44287, A032);
                C0f9.A0A(-565188218, A03);
                return A012;
            }
        };
        C26141Ov.A0S.add(c0kv5);
        List list3 = C26141Ov.A0T;
        list3.add(c0kv5);
        C26141Ov.A0U.add(new C0KV() { // from class: X.1aQ
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
                int A03 = C0f9.A03(2118926984);
                int A032 = C0f9.A03(766167228);
                final Context context2 = C28551Zq.this.A00;
                final InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.5cC
                    @Override // X.InterfaceC08830cm
                    public final /* bridge */ /* synthetic */ Object get() {
                        return AbstractC28761aE.A00(userSession);
                    }
                };
                InterfaceC29421bJ interfaceC29421bJ = new InterfaceC29421bJ(context2, userSession, interfaceC08830cm) { // from class: X.5cD
                    public final Context A00;
                    public final UserSession A01;
                    public final InterfaceC08830cm A02;

                    @Override // X.InterfaceC29421bJ
                    public final void DUn(C1OW c1ow, MNP mnp) {
                    }

                    @Override // X.InterfaceC29421bJ
                    public final void DUr(C1OW c1ow, MNP mnp) {
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
                    
                        if (((X.C29721bn) r13).A0H == null) goto L12;
                     */
                    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00be. Please report as an issue. */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
                    /* JADX WARN: Removed duplicated region for block: B:92:0x0160 A[RETURN] */
                    @Override // X.InterfaceC29421bJ
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void DUs(X.C1OW r13, X.MNP r14, X.MNP r15) {
                        /*
                            Method dump skipped, instructions count: 392
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C120145cD.DUs(X.1OW, X.MNP, X.MNP):void");
                    }

                    {
                        this.A00 = context2.getApplicationContext();
                        this.A01 = userSession;
                        this.A02 = interfaceC08830cm;
                    }
                };
                C0f9.A0A(-381950115, A032);
                C0f9.A0A(-268448841, A03);
                return interfaceC29421bJ;
            }
        });
        list3.add(new C0KV() { // from class: X.1aR
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
                int A03 = C0f9.A03(-31844851);
                int A032 = C0f9.A03(677212094);
                final Context context2 = C28551Zq.this.A00;
                InterfaceC452826l interfaceC452826l = new InterfaceC452826l(context2, userSession) { // from class: X.5bo
                    public final UserSession A00;
                    public final InterfaceC70363Du A01;
                    public final Context A02;

                    @Override // X.InterfaceC452826l
                    public final void D1t(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DB8(C1OW c1ow, String str, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void DB9(C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DCa(C1OW c1ow) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUo(C19260xA c19260xA, C1OW c1ow, boolean z) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da4(String str, String str2, String str3) {
                    }

                    @Override // X.InterfaceC452826l
                    public final /* synthetic */ void Da8(C1OW c1ow, String str, String str2) {
                    }

                    @Override // X.InterfaceC452826l
                    public final void DhF(C1OW c1ow, String str, boolean z) {
                    }

                    private String A00(C1OW c1ow) {
                        C7Q4 c7q4;
                        if (c1ow instanceof C31311ea) {
                            return ((C31311ea) c1ow).A01.A03;
                        }
                        if (c1ow instanceof C31351ee) {
                            return ((C31351ee) c1ow).A01.A07;
                        }
                        if (c1ow instanceof C31191eO) {
                            return ((C31191eO) c1ow).A04.A06;
                        }
                        if (c1ow instanceof C29271b4) {
                            C47Z c47z = ((C29271b4) c1ow).A07;
                            if (c47z == null) {
                                return null;
                            }
                            return c47z.A35;
                        }
                        if (!(c1ow instanceof C33941iu)) {
                            return null;
                        }
                        if (!C18U.A06(C06090Tz.A05, this.A00, 36325480474883171L) || (c7q4 = ((AbstractC33951iv) c1ow).A01) == null) {
                            return null;
                        }
                        return c7q4.A06;
                    }

                    {
                        this.A02 = context2;
                        this.A00 = userSession;
                        this.A01 = C70343Ds.A00(context2, userSession);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private void A01(X.C1OW r5) {
                        /*
                            r4 = this;
                            java.lang.String r1 = r4.A00(r5)
                            if (r1 == 0) goto L36
                            com.instagram.common.session.UserSession r0 = r4.A00
                            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.C25A.A00(r0)
                            X.47Z r3 = r0.A03(r1)
                        L10:
                            boolean r0 = r5 instanceof X.AbstractC29011ae
                            if (r0 == 0) goto L34
                            X.1ae r5 = (X.AbstractC29011ae) r5
                            java.util.List r0 = r5.C7R()
                            boolean r0 = r0.isEmpty()
                            if (r0 != 0) goto L34
                            java.util.List r1 = r5.C7R()
                            r0 = 0
                            java.lang.Object r2 = r1.get(r0)
                            X.3o9 r2 = (X.C3o9) r2
                        L2b:
                            if (r3 == 0) goto L33
                            X.3Du r1 = r4.A01
                            r0 = 0
                            r1.EHL(r2, r3, r0)
                        L33:
                            return
                        L34:
                            r2 = 0
                            goto L2b
                        L36:
                            r3 = 0
                            goto L10
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C119905bo.A01(X.1OW):void");
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUp(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z) {
                        String str;
                        String A00 = A00(c1ow);
                        if (A00 != null) {
                            C47Z A033 = C25A.A00(this.A00).A03(A00);
                            if (A033 != null) {
                                if (c114675Fx != null) {
                                    str = c114675Fx.toString();
                                } else {
                                    str = "Unkown Error";
                                }
                                this.A01.EHK(null, A033, str, new Exception(str));
                                return;
                            }
                            C114675Fx c114675Fx2 = AbstractC47202Ktb.A02;
                            if (c114675Fx != c114675Fx2) {
                                return;
                            }
                            this.A01.EHa(null, null, null, null, A00, null, c114675Fx2.A04, null, 1);
                        }
                    }

                    @Override // X.InterfaceC452826l
                    public final void D6x(C1OW c1ow) {
                        A01(c1ow);
                    }

                    @Override // X.InterfaceC452826l
                    public final void DUt(C19260xA c19260xA, C1OW c1ow) {
                        A01(c1ow);
                    }
                };
                C0f9.A0A(1573790852, A032);
                C0f9.A0A(-102700723, A03);
                return interfaceC452826l;
            }
        });
        C28891aS.A00 = new Object();
        AbstractC28921aV.A00 = new Object();
        C28951aY.A00 = new Object();
        List singletonList = Collections.singletonList(C28961aZ.A00);
        C14360o3.A07(singletonList);
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            list3.add(it.next());
        }
        C26141Ov.A0Q = new InterfaceC08830cm() { // from class: X.1aa
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C17280tP A00 = C17280tP.A00();
                return A00.A1a.CES(A00, C17280tP.A4G[16]);
            }
        };
        C26141Ov.A0R = new InterfaceC08830cm() { // from class: X.1ac
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                C17280tP A00 = C17280tP.A00();
                return A00.A1b.CES(A00, C17280tP.A4G[130]);
            }
        };
        C26161Ox c26161Ox = AbstractC26151Ow.A00;
        c26161Ox.A03(C29001ad.A01, "event_share");
        c26161Ox.A03(C29061aj.A02, "direct_app_invite");
        c26161Ox.A03(C29091am.A00, "send_reshare");
        c26161Ox.A03(C29121ap.A00, "send_hashtag_share_message");
        c26161Ox.A03(C29141ar.A00, "send_location_share_message");
        c26161Ox.A03(C29161at.A02, "add_thread_to_inbox");
        C1OZ c1oz = C29201ax.A01;
        c26161Ox.A03(c1oz, "send_dynamic_xma");
        c26161Ox.A03(C29221az.A02, "send_clips_reaction_request_message");
        c26161Ox.A03(C29251b2.A02, "group_profile_invite");
        C25991Og[] c25991OgArr = new C25991Og[150];
        C1OZ c1oz2 = C29271b4.A0Q;
        C0KV c0kv6 = C29291b6.A04;
        C0KV c0kv7 = AbstractC29321b9.A05;
        C25991Og c25991Og = new C25991Og(AbstractC29321b9.A00(c1oz2, c0kv6, c0kv7, "send_text_message"));
        C25991Og c25991Og2 = new C25991Og(AbstractC29321b9.A00(C29481bP.A07, C29551bW.A03, c0kv7, "send_link_message"));
        C25991Og c25991Og3 = new C25991Og(AbstractC29321b9.A00(C29581bZ.A04, C29611bc.A02, c0kv7, "send_destination_share_message"));
        C25991Og c25991Og4 = new C25991Og(AbstractC29321b9.A00(C29631be.A01, C29651bg.A03, c0kv7, "send_like_message"));
        C25981Of c25981Of = new C25981Of(C29681bj.A01, C29701bl.A02, c0kv7, "send_media_message");
        c25981Of.A02 = C29441bL.A01;
        c25981Of.A06 = false;
        c25981Of.A05 = true;
        C25991Og c25991Og5 = new C25991Og(c25981Of);
        C25991Og c25991Og6 = new C25991Og(AbstractC29321b9.A00(C29721bn.A0L, C29741bp.A03, c0kv7, "send_reel_share_message"));
        C25991Og c25991Og7 = new C25991Og(AbstractC29321b9.A00(C29761br.A07, C29781bt.A02, c0kv7, "send_rooms_link_xma"));
        C25991Og c25991Og8 = new C25991Og(AbstractC29321b9.A00(C29801bv.A08, C29821bx.A02, c0kv7, "send_p2b_order_xma"));
        C25991Og c25991Og9 = new C25991Og(AbstractC29321b9.A00(C29841bz.A04, C29871c2.A02, c0kv7, "whatsapp_contact_share"));
        C25991Og c25991Og10 = new C25991Og(AbstractC29321b9.A00(C29891c4.A01, C29911c6.A02, c0kv7, "send_book_now_link_share_message"));
        C25991Og c25991Og11 = new C25991Og(AbstractC29321b9.A00(C29931c8.A04, C29951cA.A02, c0kv7, "send_live_video_share_message"));
        C25991Og c25991Og12 = new C25991Og(AbstractC29321b9.A00(C29971cC.A07, C29991cF.A03, c0kv7, "send_story_share_message"));
        C25991Og c25991Og13 = new C25991Og(AbstractC29321b9.A00(C30011cH.A06, C30031cJ.A03, c0kv7, "send_live_viewer_invite_message"));
        C1OZ c1oz3 = C30061cM.A06;
        C0KV c0kv8 = C30081cO.A04;
        C25991Og c25991Og14 = new C25991Og(AbstractC29321b9.A00(c1oz3, c0kv8, c0kv7, "send_media_share_message"));
        C25991Og c25991Og15 = new C25991Og(AbstractC29321b9.A00(C30101cQ.A02, C30121cS.A03, c0kv7, "send_igtv_share_message"));
        C1OZ c1oz4 = C30141cU.A06;
        C0KV c0kv9 = C30161cW.A04;
        System.arraycopy(new C25991Og[]{c25991Og, c25991Og2, c25991Og3, c25991Og4, c25991Og5, c25991Og6, c25991Og7, c25991Og8, c25991Og9, c25991Og10, c25991Og11, c25991Og12, c25991Og13, c25991Og14, c25991Og15, new C25991Og(AbstractC29321b9.A00(c1oz4, c0kv9, c0kv7, "send_clips_share_message")), new C25991Og(AbstractC29321b9.A00(C30181cZ.A02, C30201cb.A03, c0kv7, "send_clips_mention_message")), new C25991Og(AbstractC29321b9.A00(C30221cd.A02, C30241cf.A03, c0kv7, "send_media_mention_message")), new C25991Og(AbstractC29321b9.A00(C30261ch.A02, C30281cj.A03, c0kv7, "send_reels_mention_message")), new C25991Og(AbstractC29321b9.A00(C30311cm.A01, C30331co.A03, c0kv7, "send_comment_mention_message")), new C25991Og(AbstractC29321b9.A00(C30351cq.A03, C30371cs.A02, c0kv7, "send_clips_share_reply")), new C25991Og(AbstractC29321b9.A00(C30401cv.A03, C30421cx.A03, c0kv7, "send_reels_audio_share_message")), new C25991Og(AbstractC29321b9.A00(C30441cz.A04, C1d2.A03, c0kv7, "send_location_share_message_xma")), new C25991Og(AbstractC29321b9.A00(C30461d4.A05, C1d7.A02, c0kv7, "send_address_share_message_xma")), new C25991Og(AbstractC29321b9.A00(C30501dA.A01, C30511dC.A02, c0kv7, "send_voting_share_message")), new C25991Og(AbstractC29321b9.A00(C30541dF.A03, C1dH.A03, c0kv7, "send_info_center_share_message")), new C25991Og(AbstractC29321b9.A00(C1dJ.A0C, C30571dL.A03, c0kv7, "send_info_center_fact_share_message"))}, 0, c25991OgArr, 0, 27);
        C1OZ c1oz5 = C1dN.A03;
        C0KV c0kv10 = C30611dQ.A03;
        C25991Og c25991Og16 = new C25991Og(AbstractC29321b9.A00(c1oz5, c0kv10, c0kv7, "send_profile_share_message"));
        C25991Og c25991Og17 = new C25991Og(AbstractC29321b9.A00(c1oz5, c0kv10, c0kv7, "send_ai_agent_profile_share_message"));
        C25991Og c25991Og18 = new C25991Og(AbstractC29321b9.A00(C30631dS.A08, C30651dU.A02, c0kv7, "send_comment_reshare_message"));
        C25991Og c25991Og19 = new C25991Og(AbstractC29321b9.A00(C30671dW.A06, C30691dY.A03, c0kv7, "send_collection_item_response"));
        C25991Og c25991Og20 = new C25991Og(AbstractC29321b9.A00(C30711da.A01, C30741dd.A01, c0kv7, "send_repost_reply_message"));
        C25991Og c25991Og21 = new C25991Og(AbstractC29321b9.A00(C30761df.A02, C30781dh.A03, c0kv7, "send_ar_effect_share_message"));
        C25991Og c25991Og22 = new C25991Og(AbstractC29321b9.A00(C30801dj.A02, C30821dl.A03, c0kv7, "send_product_share_message"));
        C25991Og c25991Og23 = new C25991Og(AbstractC29321b9.A00(C30841dn.A06, C30861dp.A03, c0kv7, "send_shops_collection_share_message"));
        C25991Og c25991Og24 = new C25991Og(AbstractC29321b9.A00(C30881dr.A04, C30901dt.A03, c0kv7, "send_shop_share_message"));
        C25991Og c25991Og25 = new C25991Og(AbstractC29321b9.A00(C30921dv.A03, C30941dx.A02, c0kv7, "send_hscroll_product_share_message"));
        C25991Og c25991Og26 = new C25991Og(AbstractC29321b9.A00(C30961dz.A02, C30981e1.A02, c0kv7, "send_fbpay_referral"));
        C25991Og c25991Og27 = new C25991Og(AbstractC29321b9.A00(C31001e3.A06, C31021e5.A02, c0kv7, "send_subscription_share_message"));
        C25991Og c25991Og28 = new C25991Og(AbstractC29321b9.A00(C1e7.A03, C31051e9.A02, c0kv7, "send_animated_media_message"));
        C25991Og c25991Og29 = new C25991Og(AbstractC29321b9.A00(C31071eB.A05, DirectConfigureAnimatedMediaMessageMutationProcessor.A05, c0kv7, "config_animated_media_message"));
        C25991Og c25991Og30 = new C25991Og(AbstractC29321b9.A00(C31111eG.A01, C31131eI.A02, c0kv7, "send_static_sticker_message"));
        C25991Og c25991Og31 = new C25991Og(AbstractC29321b9.A00(c1oz4, c0kv9, c0kv7, "send_social_context_reply_text"));
        C25991Og c25991Og32 = new C25991Og(AbstractC29321b9.A00(c1oz3, c0kv8, c0kv7, "send_friendly_feed_message"));
        C25991Og c25991Og33 = new C25991Og(AbstractC29321b9.A00(C31151eK.A02, C31171eM.A02, c0kv7, "send_story_interaction_reply_text"));
        C1OZ c1oz6 = C31191eO.A09;
        C0KV c0kv11 = C31211eQ.A06;
        C0KV c0kv12 = AbstractC29321b9.A00;
        C25981Of A00 = AbstractC29321b9.A00(c1oz6, c0kv11, c0kv12, "configure_media_message");
        A00.A03 = new C0t0(50);
        A00.A00 = new C0t0(10);
        C25991Og c25991Og34 = new C25991Og(A00);
        C25991Og c25991Og35 = new C25991Og(AbstractC29321b9.A00(C31231eS.A02, C31251eU.A02, c0kv7, "send_status_reply_message"));
        C25981Of A002 = AbstractC29321b9.A00(C31271eW.A03, C31291eY.A04, c0kv12, "configure_file_message");
        A002.A05 = false;
        C25991Og c25991Og36 = new C25991Og(A002);
        C25991Og c25991Og37 = new C25991Og(AbstractC29321b9.A00(C31311ea.A09, C31331ec.A07, c0kv12, "configure_visual_message"));
        C25991Og c25991Og38 = new C25991Og(AbstractC29321b9.A00(C31351ee.A02, C31371eg.A04, c0kv7, "configure_voice_message"));
        C25981Of c25981Of2 = new C25981Of(C31391ei.A07, C31411ek.A02, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_reaction");
        c25981Of2.A04 = C31441en.A02;
        c25981Of2.A02 = C31461ep.A01;
        c25981Of2.A06 = true;
        c25981Of2.A05 = false;
        C25991Og c25991Og39 = new C25991Og(c25981Of2);
        C1OZ c1oz7 = C31481er.A05;
        C0KV c0kv13 = C31501et.A01;
        C14360o3.A0B(c0kv13, 0);
        C25981Of c25981Of3 = new C25981Of(c1oz7, new C29401bH(c0kv13), new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "forward_message");
        c25981Of3.A04 = C31521ev.A02;
        c25981Of3.A02 = C31541ex.A01;
        c25981Of3.A06 = true;
        c25981Of3.A05 = true;
        C25991Og c25991Og40 = new C25991Og(c25981Of3);
        C25981Of c25981Of4 = new C25981Of(C31561ez.A07, C31581f1.A02, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "unsend_message");
        C0KV c0kv14 = AbstractC29321b9.A01;
        c25981Of4.A02 = c0kv14;
        C25991Og c25991Og41 = new C25991Og(c25981Of4);
        C25981Of c25981Of5 = new C25981Of(C31601f3.A04, C31631f6.A01, new C0KV() { // from class: X.1f8
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(-6495617);
                int A032 = C0f9.A03(-1556781001);
                Object obj2 = new Object();
                C0f9.A0A(1242175623, A032);
                C0f9.A0A(-2007581409, A03);
                return obj2;
            }
        }, "send_thread_seen_marker");
        c25981Of5.A04 = C31661f9.A01;
        C0KV c0kv15 = C31681fB.A01;
        c25981Of5.A02 = c0kv15;
        C0KV c0kv16 = AbstractC29321b9.A03;
        c25981Of5.A03 = c0kv16;
        System.arraycopy(new C25991Og[]{c25991Og16, c25991Og17, c25991Og18, c25991Og19, c25991Og20, c25991Og21, c25991Og22, c25991Og23, c25991Og24, c25991Og25, c25991Og26, c25991Og27, c25991Og28, c25991Og29, c25991Og30, c25991Og31, c25991Og32, c25991Og33, c25991Og34, c25991Og35, c25991Og36, c25991Og37, c25991Og38, c25991Og39, c25991Og40, c25991Og41, new C25991Og(c25981Of5)}, 0, c25991OgArr, 27, 27);
        C25981Of c25981Of6 = new C25981Of(C31701fD.A07, C31721fF.A02, new C0KV() { // from class: X.1f8
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(-6495617);
                int A032 = C0f9.A03(-1556781001);
                Object obj2 = new Object();
                C0f9.A0A(1242175623, A032);
                C0f9.A0A(-2007581409, A03);
                return obj2;
            }
        }, "send_visual_item_seen_marker");
        c25981Of6.A02 = c0kv15;
        c25981Of6.A03 = c0kv16;
        C25991Og c25991Og42 = new C25991Og(c25981Of6);
        C25981Of c25981Of7 = new C25981Of(C31741fH.A04, C31761fJ.A01, new C0KV() { // from class: X.1f8
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(-6495617);
                int A032 = C0f9.A03(-1556781001);
                Object obj2 = new Object();
                C0f9.A0A(1242175623, A032);
                C0f9.A0A(-2007581409, A03);
                return obj2;
            }
        }, "send_voice_item_seen_marker");
        c25981Of7.A02 = c0kv15;
        c25981Of7.A03 = c0kv16;
        C25991Og c25991Og43 = new C25991Og(c25981Of7);
        C25981Of c25981Of8 = new C25981Of(C31771fL.A02, C31791fN.A01, new C0KV() { // from class: X.1f8
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(-6495617);
                int A032 = C0f9.A03(-1556781001);
                Object obj2 = new Object();
                C0f9.A0A(1242175623, A032);
                C0f9.A0A(-2007581409, A03);
                return obj2;
            }
        }, "send_permanent_media_item_seen_marker");
        c25981Of8.A02 = c0kv15;
        c25981Of8.A03 = c0kv16;
        C25991Og c25991Og44 = new C25991Og(c25981Of8);
        C25981Of c25981Of9 = new C25981Of(C31811fP.A01, C31831fR.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "accept_valued_request");
        c25981Of9.A02 = c0kv14;
        C25991Og c25991Og45 = new C25991Og(c25981Of9);
        C25981Of c25981Of10 = new C25981Of(C31851fT.A02, C1fV.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_mark_unread");
        c25981Of10.A04 = C1fX.A01;
        c25981Of10.A02 = c0kv14;
        C25991Og c25991Og46 = new C25991Og(c25981Of10);
        C25981Of c25981Of11 = new C25981Of(C31891fZ.A03, C31911fb.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_mute_thread");
        c25981Of11.A04 = C31931fd.A01;
        c25981Of11.A02 = c0kv14;
        C25991Og c25991Og47 = new C25991Og(c25981Of11);
        C25981Of c25981Of12 = new C25981Of(C31951ff.A02, C31971fh.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_mute_thread_mentions");
        c25981Of12.A04 = C31991fj.A01;
        c25981Of12.A02 = c0kv14;
        C25991Og c25991Og48 = new C25991Og(c25981Of12);
        C25981Of c25981Of13 = new C25981Of(C32011fl.A02, C32031fn.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_mute_thread_reactions");
        c25981Of13.A04 = C32051fp.A01;
        c25981Of13.A02 = c0kv14;
        C25991Og c25991Og49 = new C25991Og(c25981Of13);
        C25981Of c25981Of14 = new C25981Of(C32071fr.A03, C32091ft.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_mute_video_call");
        c25981Of14.A04 = C32111fv.A01;
        c25981Of14.A02 = c0kv14;
        C25991Og c25991Og50 = new C25991Og(c25981Of14);
        C25981Of c25981Of15 = new C25981Of(C32131fx.A02, C32151fz.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "translate_thread");
        c25981Of15.A04 = C32171g1.A01;
        c25981Of15.A02 = c0kv14;
        C25991Og c25991Og51 = new C25991Og(c25981Of15);
        C25981Of c25981Of16 = new C25981Of(C1g3.A02, C32201g5.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_admin_approval");
        c25981Of16.A04 = C32221g7.A01;
        c25981Of16.A02 = c0kv14;
        C25991Og c25991Og52 = new C25991Og(c25981Of16);
        C25981Of c25981Of17 = new C25981Of(C1g9.A01, C32251gB.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "delete_thread");
        C0KV c0kv17 = C32271gD.A02;
        c25981Of17.A04 = c0kv17;
        c25981Of17.A02 = c0kv14;
        C25991Og c25991Og53 = new C25991Og(c25981Of17);
        C25981Of c25981Of18 = new C25981Of(C32291gF.A01, C32311gH.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "leave_thread");
        c25981Of18.A04 = c0kv17;
        c25981Of18.A02 = c0kv14;
        C25991Og c25991Og54 = new C25991Og(c25981Of18);
        C25981Of c25981Of19 = new C25981Of(C32331gJ.A01, C32351gL.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "end_thread");
        c25981Of19.A04 = c0kv17;
        c25981Of19.A02 = c0kv14;
        C25991Og c25991Og55 = new C25991Og(c25981Of19);
        C25981Of c25981Of20 = new C25981Of(C32371gN.A02, C32391gP.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "end_group_chat");
        c25981Of20.A04 = c0kv17;
        c25981Of20.A02 = c0kv14;
        C25991Og c25991Og56 = new C25991Og(c25981Of20);
        C25981Of c25981Of21 = new C25981Of(C32411gR.A02, C32431gT.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "change_thread_title");
        c25981Of21.A04 = C32451gV.A01;
        c25981Of21.A02 = c0kv14;
        C25991Og c25991Og57 = new C25991Og(c25981Of21);
        C25981Of c25981Of22 = new C25981Of(C32471gX.A02, C32491gZ.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "star_thread");
        c25981Of22.A04 = C32511gb.A02;
        c25981Of22.A02 = c0kv14;
        C25991Og c25991Og58 = new C25991Og(c25981Of22);
        C25981Of c25981Of23 = new C25981Of(C32531gd.A01, C32551gf.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "share_chat_activity");
        c25981Of23.A04 = C32571gh.A02;
        c25981Of23.A02 = c0kv14;
        C25991Og c25991Og59 = new C25991Og(c25981Of23);
        C25981Of c25981Of24 = new C25981Of(C32591gj.A02, C32611gl.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "clips_together_activity");
        c25981Of24.A04 = C32631gn.A02;
        c25981Of24.A02 = c0kv14;
        C25991Og c25991Og60 = new C25991Og(c25981Of24);
        C25981Of c25981Of25 = new C25981Of(C32651gp.A02, C32671gr.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "incoming_chat_activity");
        c25981Of25.A04 = C32691gt.A02;
        c25981Of25.A02 = c0kv14;
        C25991Og c25991Og61 = new C25991Og(c25981Of25);
        C25981Of c25981Of26 = new C25981Of(C32711gv.A04, C32731gx.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_poll_vote");
        c25981Of26.A02 = c0kv14;
        c25981Of26.A04 = C32751gz.A01;
        C25991Og c25991Og62 = new C25991Og(c25981Of26);
        C25981Of c25981Of27 = new C25981Of(C32771h1.A03, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1h3
            @Override // X.InterfaceC25941Ob
            public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                C32771h1 c32771h1 = (C32771h1) c1ow;
                C25621Ms c25621Ms = new C25621Ms(userSession);
                String str = c32771h1.A02;
                int i = c32771h1.A00;
                String str2 = c32771h1.A01;
                c25621Ms.A05();
                c25621Ms.A0L("direct_v2/threads/%s/move/", str);
                c25621Ms.A0R(C40781ul.class, C55702hA.class);
                c25621Ms.A9s("folder", String.valueOf(i));
                if (i == 7) {
                    if (str2 != null) {
                        c25621Ms.A9s("custom_folder_id", str2);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return c25621Ms.A0N();
            }
        }), new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "thread_move_folder");
        c25981Of27.A04 = C32801h4.A01;
        c25981Of27.A02 = c0kv14;
        C25991Og c25991Og63 = new C25991Og(c25981Of27);
        C25981Of c25981Of28 = new C25981Of(C32821h6.A02, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1h8
            @Override // X.InterfaceC25941Ob
            public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                String str;
                C32821h6 c32821h6 = (C32821h6) c1ow;
                String str2 = c32821h6.A00;
                if (str2 != null) {
                    String str3 = c32821h6.A01;
                    if (str3 != null) {
                        List singletonList2 = Collections.singletonList(str3);
                        C14360o3.A0B(userSession, 0);
                        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                        c25621Ms.A05();
                        c25621Ms.A0L("direct_v2/threads/%s/deny_participant_requests/", str2);
                        c25621Ms.A0R(C40781ul.class, C55702hA.class);
                        c25621Ms.A9s("user_ids", DirectThreadApi.A0J(singletonList2));
                        return c25621Ms.A0N();
                    }
                    str = "userId";
                } else {
                    str = "threadId";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }), new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "thread_deny_request");
        c25981Of28.A02 = c0kv14;
        C25991Og c25991Og64 = new C25991Og(c25981Of28);
        C25981Of c25981Of29 = new C25981Of(C32851h9.A04, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1hB
            @Override // X.InterfaceC25941Ob
            public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                C32851h9 c32851h9 = (C32851h9) c1ow;
                String str = c32851h9.A00;
                boolean z = c32851h9.A03;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(str, 1);
                C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                c25621Ms.A09(C05F.A01);
                c25621Ms.A0L("direct_v2/threads/%s/toggle_shh_mode/", str);
                c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
                c25621Ms.A0I("enable_shh_mode", z);
                return c25621Ms.A0N();
            }
        }), new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "thread_toggle_shh_mode");
        c25981Of29.A02 = C32881hC.A01;
        c25981Of29.A04 = C32911hF.A01;
        C25991Og c25991Og65 = new C25991Og(c25981Of29);
        C25981Of c25981Of30 = new C25981Of(C32931hH.A03, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1hJ
            @Override // X.InterfaceC25941Ob
            public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                C32931hH c32931hH = (C32931hH) c1ow;
                String str = c32931hH.C7Q().A00;
                String str2 = c32931hH.A01;
                boolean z = ((C1OW) c32931hH).A02.A07;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(str, 1);
                C14360o3.A0B(str2, 2);
                C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                c25621Ms.A05();
                c25621Ms.A0L("direct_v2/threads/%s/set_theme/%s/", str, str2);
                c25621Ms.A0R(C40781ul.class, C55702hA.class);
                c25621Ms.A0I("is_shh_mode", z);
                return c25621Ms.A0N();
            }
        }), new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "set_thread_theme");
        c25981Of30.A04 = C32961hK.A01;
        c25981Of30.A02 = c0kv14;
        System.arraycopy(new C25991Og[]{c25991Og42, c25991Og43, c25991Og44, c25991Og45, c25991Og46, c25991Og47, c25991Og48, c25991Og49, c25991Og50, c25991Og51, c25991Og52, c25991Og53, c25991Og54, c25991Og55, c25991Og56, c25991Og57, c25991Og58, c25991Og59, c25991Og60, c25991Og61, c25991Og62, c25991Og63, c25991Og64, c25991Og65, new C25991Og(c25981Of30), new C25991Og(AbstractC29321b9.A00(C32981hM.A02, C33001hO.A02, c0kv7, "forward_media_message")), new C25991Og(AbstractC29321b9.A00(C33021hQ.A02, C33041hS.A02, c0kv7, "forward_music_message"))}, 0, c25991OgArr, 54, 27);
        C25981Of c25981Of31 = new C25981Of(C33061hU.A01, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1hW
            @Override // X.InterfaceC25941Ob
            public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                C33061hU c33061hU = (C33061hU) c1ow;
                String str = c33061hU.A00.A00;
                boolean z = c33061hU.A02.A07;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(str, 1);
                C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                c25621Ms.A05();
                c25621Ms.A0L("direct_v2/threads/%s/shh_screenshot/", str);
                c25621Ms.A0J("is_shh_mode", z);
                c25621Ms.A0R(C40781ul.class, C55702hA.class);
                return c25621Ms.A0N();
            }
        }), new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_shh_mode_screenshot");
        c25981Of31.A02 = c0kv14;
        C25991Og c25991Og66 = new C25991Og(c25981Of31);
        C25981Of c25981Of32 = new C25981Of(C33091hX.A01, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1hZ
            @Override // X.InterfaceC25941Ob
            public final C1ON AES(UserSession userSession, C1OW c1ow) {
                String str = ((C33091hX) c1ow).C7Q().A00;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(str, 1);
                C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                c25621Ms.A05();
                c25621Ms.A0L("direct_v2/threads/%s/ephemeral_screenshot/", str);
                c25621Ms.A0R(C40781ul.class, C55702hA.class);
                return c25621Ms.A0N();
            }
        }), new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_disappearing_mode_screenshot");
        c25981Of32.A02 = c0kv14;
        C25991Og c25991Og67 = new C25991Og(c25981Of32);
        C25981Of c25981Of33 = new C25981Of(C33121ha.A01, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1hc
            @Override // X.InterfaceC25941Ob
            public final /* bridge */ /* synthetic */ C1ON AES(UserSession userSession, C1OW c1ow) {
                String str = ((C33121ha) c1ow).A00.A00;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(str, 1);
                C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                c25621Ms.A05();
                c25621Ms.A0L("direct_v2/threads/%s/shh_replay/", str);
                c25621Ms.A0R(C40781ul.class, C55702hA.class);
                return c25621Ms.A0N();
            }
        }), new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_shh_mode_replay");
        c25981Of33.A02 = c0kv14;
        C25991Og c25991Og68 = new C25991Og(c25981Of33);
        C25981Of A003 = AbstractC29321b9.A00(C33151hd.A04, C33171hf.A02, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_poll_message");
        A003.A02 = AbstractC29321b9.A04;
        C25991Og c25991Og69 = new C25991Og(A003);
        C25991Og c25991Og70 = new C25991Og(AbstractC29321b9.A00(C33191hh.A06, C33211hj.A02, c0kv7, "send_ai_sticker"));
        C25991Og c25991Og71 = new C25991Og(AbstractC29321b9.A00(C33231hl.A05, C33251hn.A02, c0kv7, "send_cutout_sticker"));
        C25991Og c25991Og72 = new C25991Og(AbstractC29321b9.A00(C33271hp.A05, C33291hr.A03, c0kv7, "send_store_sticker"));
        C25991Og c25991Og73 = new C25991Og(AbstractC29321b9.A00(C33311ht.A0B, C33331hv.A06, c0kv7, "send_avatar_sticker"));
        C25981Of c25981Of34 = new C25981Of(C33351hx.A02, C33371hz.A02, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "group_invite_link_enabled");
        c25981Of34.A04 = C33391i1.A01;
        c25981Of34.A02 = c0kv14;
        C25991Og c25991Og74 = new C25991Og(c25981Of34);
        C25981Of c25981Of35 = new C25981Of(C33411i3.A01, C33431i5.A02, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "group_invite_link_reset");
        c25981Of35.A02 = c0kv14;
        C25991Og c25991Og75 = new C25991Og(c25981Of35);
        C25981Of c25981Of36 = new C25981Of(C33451i7.A03, C33471i9.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "ig_me_referral");
        c25981Of36.A02 = c0kv14;
        C25991Og c25991Og76 = new C25991Og(c25981Of36);
        C25991Og c25991Og77 = new C25991Og(AbstractC29321b9.A00(C33491iB.A03, C33511iD.A02, c0kv7, "send_collection_share_message"));
        C25991Og c25991Og78 = new C25991Og(AbstractC29321b9.A00(C33531iF.A03, C33551iH.A02, c0kv7, "send_public_collection_share_message"));
        C25991Og c25991Og79 = new C25991Og(AbstractC29321b9.A00(C33571iJ.A04, C33591iL.A03, c0kv7, "notes_send_text_response"));
        C25991Og c25991Og80 = new C25991Og(AbstractC29321b9.A00(C33611iN.A01, C33631iP.A03, c0kv7, "notes_send_mention_message"));
        C25991Og c25991Og81 = new C25991Og(AbstractC29321b9.A00(C33651iR.A04, C33671iT.A03, c0kv7, "content_notes_send_text_response"));
        C25991Og c25991Og82 = new C25991Og(AbstractC29321b9.A00(C33691iV.A01, C33711iX.A03, c0kv7, "content_notes_send_mention_message"));
        C25991Og c25991Og83 = new C25991Og(AbstractC29321b9.A00(C33731iZ.A05, C33751ib.A03, c0kv7, "notes_send_media_response"));
        C25991Og c25991Og84 = new C25991Og(AbstractC29321b9.A00(C33771id.A04, C33791if.A03, c0kv7, "notes_send_audio_response"));
        C25991Og c25991Og85 = new C25991Og(AbstractC29321b9.A00(C33811ih.A02, C33831ij.A03, c0kv7, "notes_send_animated_media_response"));
        C25991Og c25991Og86 = new C25991Og(AbstractC29321b9.A00(C33851il.A06, C33871in.A03, c0kv7, "notes_send_note_reply_avatar"));
        C25991Og c25991Og87 = new C25991Og(AbstractC29321b9.A00(C33891ip.A0C, C33921is.A05, c0kv7, "send_prompt_message"));
        C25991Og c25991Og88 = new C25991Og(AbstractC29321b9.A00(C33941iu.A05, C33971ix.A03, c0kv7, "configure_prompt_response_message"));
        C25981Of c25981Of37 = new C25981Of(C33991iz.A02, C34011j1.A05, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "configure_prompt_response");
        c25981Of37.A04 = C34031j3.A01;
        c25981Of37.A06 = false;
        c25981Of37.A05 = true;
        C25991Og c25991Og89 = new C25991Og(c25981Of37);
        C25981Of c25981Of38 = new C25981Of(C34051j5.A06, C34071j7.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "broadcast_collection_item_media_reaction");
        c25981Of38.A04 = C34091j9.A02;
        System.arraycopy(new C25991Og[]{c25991Og66, c25991Og67, c25991Og68, c25991Og69, c25991Og70, c25991Og71, c25991Og72, c25991Og73, c25991Og74, c25991Og75, c25991Og76, c25991Og77, c25991Og78, c25991Og79, c25991Og80, c25991Og81, c25991Og82, c25991Og83, c25991Og84, c25991Og85, c25991Og86, c25991Og87, c25991Og88, c25991Og89, new C25991Og(c25981Of38), new C25991Og(new C25981Of(C34111jB.A02, C34131jD.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "dismiss_inbox_nudge")), new C25991Og(new C25981Of(C34151jF.A02, C34171jH.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "thread_subscribe_to_content"))}, 0, c25991OgArr, 81, 27);
        C25981Of c25981Of39 = new C25981Of(C34191jJ.A04, C34211jL.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "ig_notification_messages");
        c25981Of39.A02 = c0kv14;
        C25991Og c25991Og90 = new C25991Og(c25981Of39);
        C25991Og c25991Og91 = new C25991Og(AbstractC29321b9.A00(C34231jN.A05, C34251jP.A03, c0kv7, "send_fundraiser_share_message"));
        C25991Og c25991Og92 = new C25991Og(AbstractC29321b9.A00(C34271jR.A01, C34291jT.A02, c0kv7, "send_mediakit_share_message"));
        C25991Og c25991Og93 = new C25991Og(AbstractC29321b9.A00(c1oz, C34311jV.A02, c0kv7, "send_standard_dxma"));
        C25991Og c25991Og94 = new C25991Og(AbstractC29321b9.A00(C34331jX.A01, C34351jZ.A02, c0kv7, "account_recs_from_friends"));
        C25991Og c25991Og95 = new C25991Og(AbstractC29321b9.A00(C34371jb.A00, C34391jd.A02, c0kv7, "school_invite_share"));
        C25991Og c25991Og96 = new C25991Og(AbstractC29321b9.A00(C34411jf.A03, C34431jh.A09, c0kv7, "forward_content_ref"));
        C25991Og c25991Og97 = new C25991Og(AbstractC29321b9.A00(C34451jj.A01, C34471jl.A02, c0kv7, "partnership_ad_code"));
        C25991Og c25991Og98 = new C25991Og(AbstractC29321b9.A00(C34491jn.A03, C34511jp.A02, c0kv7, "prompt_v2_share"));
        C25981Of c25981Of40 = new C25981Of(C34531jr.A05, C34551jt.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "bump_thread");
        c25981Of40.A04 = C34571jv.A00;
        c25981Of40.A02 = c0kv14;
        C25991Og c25991Og99 = new C25991Og(c25981Of40);
        C25981Of c25981Of41 = new C25981Of(C34591jx.A02, C34611jz.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "commnets_enabled");
        c25981Of41.A04 = C34631k1.A01;
        c25981Of41.A02 = c0kv14;
        C25991Og c25991Og100 = new C25991Og(c25981Of41);
        C25981Of c25981Of42 = new C25981Of(C34651k3.A08, C1k5.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "set_disappearing_messages_settings");
        c25981Of42.A04 = C1k7.A02;
        c25981Of42.A02 = c0kv14;
        C25991Og c25991Og101 = new C25991Og(c25981Of42);
        C25981Of c25981Of43 = new C25981Of(C34681k9.A04, new C25951Oc(new InterfaceC25941Ob() { // from class: X.1kB
            @Override // X.InterfaceC25941Ob
            public final C1ON AES(UserSession userSession, C1OW c1ow) {
                String str;
                C34681k9 c34681k9 = (C34681k9) c1ow;
                String str2 = c34681k9.A02;
                if (str2 != null) {
                    String str3 = c34681k9.A00;
                    if (str3 != null) {
                        String str4 = c34681k9.A01;
                        boolean z = c34681k9.A03;
                        C25621Ms c25621Ms = new C25621Ms(userSession);
                        c25621Ms.A05();
                        c25621Ms.A0L("direct_v2/items/%s/branded_content/add_paid_partnership_label/", str3);
                        c25621Ms.A0S(C40781ul.class, C55702hA.class);
                        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                        c25621Ms.A9s("item_id", str3);
                        c25621Ms.A0H("original_message_client_context", str4);
                        c25621Ms.A0I("is_paid_partnership", z);
                        return c25621Ms.A0N();
                    }
                    str = "itemId";
                } else {
                    str = "threadId";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }), new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "add_paid_partnership_label");
        c25981Of43.A04 = C34711kC.A01;
        c25981Of43.A02 = c0kv14;
        c25981Of43.A05 = true;
        C25991Og c25991Og102 = new C25991Og(c25981Of43);
        C25981Of c25981Of44 = new C25981Of(C34731kE.A02, C34751kG.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "show_hide_channel");
        c25981Of44.A02 = c0kv14;
        C25991Og c25991Og103 = new C25991Og(c25981Of44);
        C25981Of c25981Of45 = new C25981Of(C34771kI.A02, C34791kK.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "thread_toggle_read_receipts_disabled");
        c25981Of45.A02 = c0kv14;
        C25991Og c25991Og104 = new C25991Og(c25981Of45);
        C25981Of c25981Of46 = new C25981Of(C34811kM.A03, C34831kO.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "delete_messages");
        c25981Of46.A02 = c0kv14;
        C25991Og c25991Og105 = new C25991Og(c25981Of46);
        C25981Of c25981Of47 = new C25981Of(C34851kQ.A08, C34871kS.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "edit_message");
        c25981Of47.A02 = C34891kU.A01;
        C25991Og c25991Og106 = new C25991Og(c25981Of47);
        C25981Of c25981Of48 = new C25981Of(C34911kW.A01, C34931kY.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "decline_channel");
        c25981Of48.A02 = c0kv14;
        C25991Og c25991Og107 = new C25991Og(c25981Of48);
        C25981Of c25981Of49 = new C25981Of(C34951ka.A03, C34971kc.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "save_sticker");
        c25981Of49.A02 = c0kv14;
        C25991Og c25991Og108 = new C25991Og(c25981Of49);
        C25981Of c25981Of50 = new C25981Of(C34991ke.A03, C35011kg.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "unsave_sticker");
        c25981Of50.A02 = c0kv14;
        C25991Og c25991Og109 = new C25991Og(c25981Of50);
        C25981Of c25981Of51 = new C25981Of(C35031ki.A03, C35051kk.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "pin_thread");
        c25981Of51.A02 = c0kv14;
        C25991Og c25991Og110 = new C25991Og(c25981Of51);
        C25981Of c25981Of52 = new C25981Of(C35071km.A02, C35091ko.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_set_nudge");
        c25981Of52.A04 = C35111kq.A01;
        c25981Of52.A02 = c0kv14;
        C25991Og c25991Og111 = new C25991Og(c25981Of52);
        C25981Of c25981Of53 = new C25981Of(C35131ks.A04, C35141kt.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "dismiss_one_click_upsell");
        c25981Of53.A04 = C35161kv.A01;
        c25981Of53.A02 = c0kv14;
        C25991Og c25991Og112 = new C25991Og(c25981Of53);
        C25981Of c25981Of54 = new C25981Of(C35181kx.A08, C35201kz.A02, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_visual_item_replayed_marker");
        c25981Of54.A02 = c0kv14;
        C25991Og c25991Og113 = new C25991Og(c25981Of54);
        C25981Of A004 = AbstractC29321b9.A00(C1l1.A02, C1l3.A02, c0kv7, "wall_post_send_response");
        A004.A02 = c0kv14;
        C25991Og c25991Og114 = new C25991Og(A004);
        C25981Of A005 = AbstractC29321b9.A00(C1l5.A02, C35251l7.A02, c0kv7, "quick_snap_send_response");
        A005.A02 = c0kv14;
        C25991Og c25991Og115 = new C25991Og(A005);
        C25981Of A006 = AbstractC29321b9.A00(C35271l9.A02, C35281lA.A02, c0kv7, "send_potato_reply");
        A006.A02 = c0kv14;
        System.arraycopy(new C25991Og[]{c25991Og90, c25991Og91, c25991Og92, c25991Og93, c25991Og94, c25991Og95, c25991Og96, c25991Og97, c25991Og98, c25991Og99, c25991Og100, c25991Og101, c25991Og102, c25991Og103, c25991Og104, c25991Og105, c25991Og106, c25991Og107, c25991Og108, c25991Og109, c25991Og110, c25991Og111, c25991Og112, c25991Og113, c25991Og114, c25991Og115, new C25991Og(A006)}, 0, c25991OgArr, 108, 27);
        C25981Of A007 = AbstractC29321b9.A00(C35301lC.A02, C35311lD.A02, c0kv7, "send_potato_share");
        A007.A02 = c0kv14;
        C25991Og c25991Og116 = new C25991Og(A007);
        C25981Of c25981Of55 = new C25981Of(C35331lF.A07, C35351lH.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "send_client_side_inference");
        c25981Of55.A02 = c0kv14;
        C25991Og c25991Og117 = new C25991Og(c25981Of55);
        C25981Of A008 = AbstractC29321b9.A00(C35371lJ.A02, C35391lL.A02, c0kv7, "friend_map_presence");
        A008.A02 = c0kv14;
        C25991Og c25991Og118 = new C25991Og(A008);
        C25991Og c25991Og119 = new C25991Og(AbstractC29321b9.A00(C35411lN.A06, C35431lP.A02, c0kv7, "send_ify_content"));
        C25981Of c25981Of56 = new C25981Of(C35451lR.A05, C35471lT.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "edit_add_yours");
        c25981Of56.A02 = c0kv14;
        C25991Og c25991Og120 = new C25991Og(c25981Of56);
        C25981Of c25981Of57 = new C25981Of(C35491lV.A02, C35511lX.A02, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "thread_toggle_typing_indicator_control");
        c25981Of57.A02 = c0kv14;
        C25991Og c25991Og121 = new C25991Og(c25981Of57);
        C25981Of c25981Of58 = new C25981Of(C35531lZ.A02, C35551lb.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "thread_toggle_locked_chat");
        c25981Of58.A02 = c0kv14;
        C25991Og c25991Og122 = new C25991Og(c25981Of58);
        C25981Of c25981Of59 = new C25981Of(C35571ld.A02, C35591lf.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "thread_toggle_notification_preview_control");
        c25981Of59.A02 = c0kv14;
        C25991Og c25991Og123 = new C25991Og(c25981Of59);
        C25981Of c25981Of60 = new C25981Of(C35611lh.A01, C35631lj.A01, AbstractC29321b9.A02, "thread_dyi_deletion");
        c25981Of60.A02 = c0kv14;
        C25991Og c25991Og124 = new C25991Og(c25981Of60);
        C25981Of c25981Of61 = new C25981Of(C35651ll.A04, C35671ln.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "stop_recurring_prompt");
        c25981Of61.A02 = c0kv14;
        C25991Og c25991Og125 = new C25991Og(c25981Of61);
        C25981Of c25981Of62 = new C25981Of(C35691lp.A02, C35721ls.A02, new C0KV() { // from class: X.1lu
            @Override // X.C0KV
            public final Object AXR(UserSession userSession) {
                return new Object();
            }
        }, "folder_update_name");
        c25981Of62.A04 = C35751lv.A01;
        c25981Of62.A02 = c0kv14;
        C25991Og c25991Og126 = new C25991Og(c25981Of62);
        C25981Of c25981Of63 = new C25981Of(C35771lx.A01, C35791lz.A02, new C0KV() { // from class: X.1lu
            @Override // X.C0KV
            public final Object AXR(UserSession userSession) {
                return new Object();
            }
        }, "folder_update_sequence");
        c25981Of63.A04 = C35811m1.A01;
        c25981Of63.A02 = c0kv14;
        C25991Og c25991Og127 = new C25991Og(c25981Of63);
        C25991Og c25991Og128 = new C25991Og(AbstractC29321b9.A00(C35831m3.A06, C35851m5.A02, c0kv7, "send_direct_music_sticker"));
        C25991Og c25991Og129 = new C25991Og(AbstractC29321b9.A00(C35871m7.A02, C35891m9.A02, c0kv7, "send_scheduled_message"));
        C25981Of c25981Of64 = new C25981Of(C35911mB.A02, C35931mD.A01, new C0KV() { // from class: X.1em
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A03 = C0f9.A03(1693017766);
                int A032 = C0f9.A03(-1817352002);
                Object obj2 = new Object();
                C0f9.A0A(-2051687042, A032);
                C0f9.A0A(839963400, A03);
                return obj2;
            }
        }, "mark_ephemeral_item_ranges_viewed");
        c25981Of64.A02 = c0kv14;
        System.arraycopy(new C25991Og[]{c25991Og116, c25991Og117, c25991Og118, c25991Og119, c25991Og120, c25991Og121, c25991Og122, c25991Og123, c25991Og124, c25991Og125, c25991Og126, c25991Og127, c25991Og128, c25991Og129, new C25991Og(c25981Of64)}, 0, c25991OgArr, 135, 15);
        Iterator it2 = Arrays.asList(c25991OgArr).iterator();
        while (it2.hasNext()) {
            C26141Ov.A02((C25991Og) it2.next());
        }
        C25981Of c25981Of65 = new C25981Of(C35951mF.A04, AbstractC35971mH.A00, new C0t0(new C25961Od("block_fb_user")), "block_fb_user");
        c25981Of65.A04 = C35991mJ.A01;
        c25981Of65.A02 = C36011mL.A01;
        c25981Of65.A03 = new C0t0(0);
        C25991Og c25991Og130 = new C25991Og(c25981Of65);
        C25991Og c25991Og131 = new C25991Og(new C25981Of(C36031mN.A02, AbstractC36051mP.A00, new C0t0(new C25961Od("remove_pseudo_block")), "remove_pseudo_block"));
        C25981Of c25981Of66 = new C25981Of(C36071mR.A05, AbstractC36091mT.A00, new C0t0(new C25961Od("block_ig_user")), "block_ig_user");
        c25981Of66.A04 = C36111mV.A01;
        c25981Of66.A02 = C36131mX.A02;
        c25981Of66.A03 = new C0t0(0);
        Iterator it3 = AbstractC16960so.A1Q(c25991Og130, c25991Og131, new C25991Og(c25981Of66)).iterator();
        while (it3.hasNext()) {
            C26141Ov.A02((C25991Og) it3.next());
        }
        C36151mZ[] c36151mZArr = new C36151mZ[55];
        System.arraycopy(new C36151mZ[]{new C36151mZ(C36161ma.A00, RealtimeProtocol.DIRECT_V2_INBOX_NEWTHREAD_TEMPLATE), new C36151mZ(C36171mb.A00, RealtimeProtocol.DIRECT_V2_THREAD_MESSAGE_TEMPLATE), new C36151mZ(C36181mc.A00, RealtimeProtocol.DIRECT_V2_THREAD_MESSAGE_BATCHED_POLL_TEMPLATE), new C36151mZ(C36191md.A00, RealtimeProtocol.DIRECT_V2_THREAD_MESSAGE_LIKE_TEMPLATE), new C36151mZ(C36201me.A00, RealtimeProtocol.DIRECT_V2_THREAD_MESSAGE_COUNT_BASED_REACTION_TEMPLATE), new C36151mZ(C36211mf.A00, RealtimeProtocol.DIRECT_V2_THREAD_MESSAGE_COUNT_BASED_REACTION_SELF_REACTED_TEMPLATE), new C36151mZ(C36221mg.A00, RealtimeProtocol.DIRECT_V2_THREAD_MESSAGE_MEDIA_INTERVENTIONS_TEMPLATE), new C36151mZ(C36231mh.A00, RealtimeProtocol.DIRECT_V2_THREAD_MESSAGE_MEDIA_MISINFO_TEMPLATE), new C36151mZ(C36241mi.A00, RealtimeProtocol.REPLACE_DIRECT_V2_MESSAGE_HAS_SEEN_TEMPLATE), new C36151mZ(C36251mj.A00, RealtimeProtocol.REPLACE_DIRECT_V2_MESSAGE_SEED_SHARED_ALBUM_TEMPLATE), new C36151mZ(C36261mk.A00, RealtimeProtocol.DIRECT_V2_INBOX_PREFIX), new C36151mZ(C36271ml.A00, RealtimeProtocol.DIRECT_V2_ADMINS_TEMPLATE), new C36151mZ(C36281mm.A00, RealtimeProtocol.REPLACE_USERS_FRIENDSHIP_STATUS_RESTRICTING_TEMPLATE), new C36151mZ(C36291mn.A00, RealtimeProtocol.REPLACE_USERS_FRIENDSHIP_STATUS_BLOCKING_TEMPLATE), new C36151mZ(C36301mo.A00, RealtimeProtocol.REPLACE_USERS_FRIENDSHIP_STATUS_IS_MESSAGING_ONLY_BLOCKING_TEMPLATE), new C36151mZ(C36311mp.A00, RealtimeProtocol.REPLACE_USERS_FRIENDSHIP_STATUS_MESSAGING_PSEUDO_BLOCKING_TEMPLATE), new C36151mZ(C36321mq.A00, RealtimeProtocol.REPLACE_USERS_ACCOUNT_STATE_TEMPLATE), new C36151mZ(C36331mr.A00, RealtimeProtocol.DIRECT_V2_ADMIN_APPROVAL_REQUIRED_TEMPLATE), new C36151mZ(C36341ms.A00, RealtimeProtocol.DIRECT_V2_THREAD_SHH_MODE_ENABLED_TEMPLATE), new C36151mZ(C36351mt.A00, RealtimeProtocol.DIRECT_V2_THEME_UPDATE_TEMPLATE), new C36151mZ(C36361mu.A00, RealtimeProtocol.DIRECT_V2_THEME_DATA_UPDATE_TEMPLATE), new C36151mZ(C36371mv.A00, RealtimeProtocol.THREAD_IMAGE_CHANGED_TEMPLATE), new C36151mZ(C36381mw.A00, RealtimeProtocol.DIRECT_V2_THREAD_POLICY_VIOLATION_REPORTED_TEMPLATE), new C36151mZ(C36391mx.A00, RealtimeProtocol.DIRECT_V2_THREAD_POLICY_VIOLATION_REVIEWED_TEMPLATE), new C36151mZ(C36401my.A00, RealtimeProtocol.DIRECT_V2_THREAD_POLICY_VIOLATION_VISIBILITY_CHANGED_TEMPLATE), new C36151mZ(C36411mz.A00, RealtimeProtocol.DIRECT_V2_THREAD_MESSAGE_POLICY_VIOLATION_REPORTED_TEMPLATE), new C36151mZ(C36421n0.A00, RealtimeProtocol.DIRECT_V2_THREAD_MESSAGE_POLICY_VIOLATION_REVIEWED_TEMPLATE)}, 0, c36151mZArr, 0, 27);
        System.arraycopy(new C36151mZ[]{new C36151mZ(C36431n1.A00, RealtimeProtocol.DIRECT_V2_THREAD_MESSAGE_POLICY_VIOLATION_VISIBILITY_CHANGED_TEMPLATE), new C36151mZ(C36441n2.A00, RealtimeProtocol.DIRECT_V2_TAKEDOWN_CHANNELS_METADATA_UPDATE), new C36151mZ(C36451n3.A00, RealtimeProtocol.DIRECT_V2_VIDEO_CALL_IDENTIFIER_TEMPLATE), new C36151mZ(C1n4.A00, RealtimeProtocol.CLOSE_FRIENDS_LIST_CHANGED_TEMPLATE), new C36151mZ(C36461n5.A00, RealtimeProtocol.COMMENT_FILTER_STATE_CHANGED_TEMPLATE), new C36151mZ(C36471n6.A00, RealtimeProtocol.GENERAL_FOLDER_STATE_CHANGED_TEMPLATE), new C36151mZ(C36481n7.A00, RealtimeProtocol.DIRECT_THREAD_GROUP_INVITE_LINK_MODE), new C36151mZ(C36491n8.A00, RealtimeProtocol.DIRECT_USER_IS_VIEWER_UNCONNECTED_TEMPLATE), new C36151mZ(C36501n9.A00, RealtimeProtocol.DIRECT_INBOX_SETTING), new C36151mZ(C36511nA.A00, RealtimeProtocol.DIRECT_THREAD_SNIPPET_UPDATE_TEMPLATE), new C36151mZ(C36521nB.A00, RealtimeProtocol.DIRECT_USER_REACHABILITY_STATUS_TEMPLATE), new C36151mZ(C36531nC.A00, RealtimeProtocol.DIRECT_BROADCAST_CHANNEL_COLLABORATOR_UPDATE), new C36151mZ(C36541nD.A00, RealtimeProtocol.DIRECT_BROADCAST_CHANNEL_INVITATION_UPDATE), new C36151mZ(C36551nE.A00, RealtimeProtocol.DIRECT_BROADCAST_CHANNEL_PARTICIPANT_UPDATE), new C36151mZ(C36561nF.A00, RealtimeProtocol.DIRECT_BROADCAST_CHANNEL_INPUT_MODE_UPDATE), new C36151mZ(C36571nG.A00, RealtimeProtocol.DIRECT_THREAD_BTV_ENABLED_MAP_UPDATE), new C36151mZ(C36581nH.A00, RealtimeProtocol.DIRECT_THREAD_DISAPPEARING_MODE_METADATA_UPDATE), new C36151mZ(C36591nI.A00, RealtimeProtocol.DIRECT_HIDE_CHANNELS_IN_MAIN_TAB_UPDATE), new C36151mZ(C36601nJ.A00, RealtimeProtocol.DIRECT_V2_BUMP_THREAD_TEMPLATE), new C36151mZ(C36611nK.A00, RealtimeProtocol.DIRECT_LARGE_SCALE_THREAD_SEQUENCE_ID_FORWARD_TEMPLATE), new C36151mZ(C36621nL.A00, RealtimeProtocol.DIRECT_THREAD_INSTAMADILLO_CUTOVER_METADATA_UPDATE), new C36151mZ(C36631nM.A00, RealtimeProtocol.DIRECT_V2_THREAD_LAST_DAILY_PROMPT_UPDATE), new C36151mZ(C36641nN.A00, RealtimeProtocol.DIRECT_V2_NICKNAME_UPDATE), new C36151mZ(C36651nO.A00, RealtimeProtocol.DIRECT_V2_NICKNAME_SETTING_UPDATE), new C36151mZ(C36661nP.A00, RealtimeProtocol.DIRECT_V2_PINNED_MESSAGES_UPDATE), new C36151mZ(C36671nQ.A00, RealtimeProtocol.DIRECT_V2_MARK_AFTER_VIEWED_MESSAGES_SEEN), new C36151mZ(C36681nR.A00, RealtimeProtocol.DIRECT_FOLDER)}, 0, c36151mZArr, 27, 27);
        System.arraycopy(new C36151mZ[]{new C36151mZ(C36691nS.A00, RealtimeProtocol.DIRECT_V2_ONE_CLICK_UPSELL_UPDATE)}, 0, c36151mZArr, 54, 1);
        for (Object obj2 : AbstractC16960so.A1Q(c36151mZArr)) {
            C14360o3.A0B(obj2, 0);
            C28821aL.A05.add(obj2);
        }
    }

    public C28551Zq(Context context) {
        this.A00 = context;
    }
}
