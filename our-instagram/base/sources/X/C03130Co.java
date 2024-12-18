package X;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import com.facebook.proxygen.TraceEventType;
import com.instagram.common.session.UserSession;
import com.instagram.notifications.actions.NotificationActionReceiver;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03130Co extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03130Co(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new C14C(context, c211211o) { // from class: X.14B
            public final Context A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, c211211o);
                C14360o3.A0B(context, 1);
                this.A00 = context;
            }

            /* JADX WARN: Type inference failed for: r7v0, types: [X.2T0, java.lang.Object] */
            @Override // X.C14C, X.AbstractC211911v
            public final void A07() {
                super.A07();
                final Context context2 = this.A00;
                C1WE c1we = new C1WE() { // from class: X.2Sx
                    public final Handler A00 = new Handler(Looper.getMainLooper());

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
                    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
                    @Override // X.C1WE
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void A04(X.C116155Nu r9, X.AbstractC12990ll r10, java.lang.String r11) {
                        /*
                            r8 = this;
                            r0 = 1
                            X.C14360o3.A0B(r11, r0)
                            r0 = 2
                            X.C14360o3.A0B(r10, r0)
                            java.lang.String r1 = r9.A0X
                            java.lang.String r0 = "live_broadcast_revoke"
                            boolean r0 = X.C14360o3.A0K(r1, r0)
                            if (r0 == 0) goto L96
                            java.lang.String r0 = r9.A0g
                            if (r0 != 0) goto L19
                            java.lang.String r0 = ""
                        L19:
                            android.net.Uri r5 = X.AbstractC08820cl.A03(r0)
                            X.C14360o3.A07(r5)
                            java.lang.String r0 = "reel_id"
                            java.lang.String r1 = r5.getQueryParameter(r0)
                            X.0Bo r0 = X.C0BQ.A00(r10)
                            boolean r0 = r0.CPH(r1)
                            if (r0 != 0) goto L96
                            java.lang.String r0 = "published_time"
                            java.lang.String r1 = r5.getQueryParameter(r0)
                            if (r1 == 0) goto L47
                            r0 = 10
                            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r1)     // Catch: java.lang.NumberFormatException -> L4c
                            if (r0 == 0) goto L47
                            long r1 = r0.longValue()     // Catch: java.lang.NumberFormatException -> L4c
                            goto L50
                        L47:
                            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.NumberFormatException -> L4c
                            goto L50
                        L4c:
                            long r1 = java.lang.System.currentTimeMillis()
                        L50:
                            java.lang.String r0 = "insta_video_notifications"
                            X.0tT r7 = X.AbstractC19750y3.A01(r0)
                            java.lang.String r0 = "#recent-check"
                            java.lang.String r6 = X.AnonymousClass001.A0R(r11, r0)
                            r3 = -1
                            long r3 = r7.getLong(r6, r3)
                            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                            if (r0 >= 0) goto L71
                            X.0xo r0 = r7.ARD()
                            r0.E7G(r6, r1)
                            r0.apply()
                        L71:
                            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                            if (r0 > 0) goto L96
                            X.1Wc r1 = X.C27741Wc.A01()
                            java.lang.String r0 = "iglive"
                            r1.A03(r10, r0, r11)
                            boolean r0 = r10 instanceof com.instagram.common.session.UserSession
                            if (r0 == 0) goto L96
                            java.lang.String r0 = "id"
                            java.lang.String r2 = r5.getQueryParameter(r0)
                            if (r2 == 0) goto L96
                            android.os.Handler r1 = r8.A00
                            X.PRk r0 = new X.PRk
                            r0.<init>(r10, r2)
                            r1.post(r0)
                        L96:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C50292Sx.A04(X.5Nu, X.0ll, java.lang.String):void");
                    }

                    @Override // X.C1WE
                    public final String A0C() {
                        return "iglive";
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
                    @Override // X.C1WE
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void A0D(X.C116155Nu r9, X.AbstractC12990ll r10, X.L85 r11, java.lang.String r12) {
                        /*
                            r8 = this;
                            r4 = 0
                            X.C14360o3.A0B(r9, r4)
                            r0 = 1
                            X.C14360o3.A0B(r12, r0)
                            r0 = 2
                            X.C14360o3.A0B(r10, r0)
                            r0 = 3
                            X.C14360o3.A0B(r11, r0)
                            java.lang.String r0 = r9.A0g
                            if (r0 != 0) goto L16
                            java.lang.String r0 = ""
                        L16:
                            android.net.Uri r3 = X.AbstractC08820cl.A03(r0)
                            X.C14360o3.A07(r3)
                            java.lang.String r0 = "reel_id"
                            java.lang.String r2 = r3.getQueryParameter(r0)
                            java.lang.String r1 = r9.A0X
                            java.lang.String r0 = "live_broadcast_revoke"
                            boolean r0 = X.C14360o3.A0K(r1, r0)
                            r7 = 0
                            if (r0 != 0) goto L98
                            X.0Bo r0 = X.C0BQ.A00(r10)
                            boolean r0 = r0.CPH(r2)
                            if (r0 != 0) goto L98
                            java.lang.String r0 = "live_broadcast"
                            boolean r0 = X.C14360o3.A0K(r1, r0)
                            if (r0 == 0) goto L8c
                            java.lang.String r0 = "published_time"
                            java.lang.String r1 = r3.getQueryParameter(r0)
                            if (r1 == 0) goto L59
                            r0 = 10
                            java.lang.Long r0 = X.AbstractC003100w.A0k(r0, r1)     // Catch: java.lang.NumberFormatException -> L5e
                            if (r0 == 0) goto L59
                            long r1 = r0.longValue()     // Catch: java.lang.NumberFormatException -> L5e
                            goto L62
                        L59:
                            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.NumberFormatException -> L5e
                            goto L62
                        L5e:
                            long r1 = java.lang.System.currentTimeMillis()
                        L62:
                            java.lang.String r0 = "insta_video_notifications"
                            X.0tT r6 = X.AbstractC19750y3.A01(r0)
                            java.lang.String r0 = "#recent-check"
                            java.lang.String r5 = X.AnonymousClass001.A0R(r12, r0)
                            r3 = -1
                            long r3 = r6.getLong(r5, r3)
                            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                            if (r0 >= 0) goto L83
                            X.0xo r0 = r6.ARD()
                            r0.E7G(r5, r1)
                            r0.apply()
                        L83:
                            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                            if (r0 >= 0) goto L88
                            r7 = 1
                        L88:
                            r11.A00(r7)
                            return
                        L8c:
                            java.lang.String r0 = "Collapse key not supported: "
                            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)
                            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                            r0.<init>(r1)
                            throw r0
                        L98:
                            r11.A00(r4)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C50292Sx.A0D(X.5Nu, X.0ll, X.L85, java.lang.String):void");
                    }

                    @Override // X.C1WE
                    public final String A0A(C116155Nu c116155Nu, UserSession userSession) {
                        String str = c116155Nu.A0g;
                        if (str == null) {
                            str = "";
                        }
                        android.net.Uri A03 = AbstractC08820cl.A03(str);
                        C14360o3.A07(A03);
                        String queryParameter = A03.getQueryParameter("reel_id");
                        if ("broadcast".equals(A03.getPath()) && queryParameter != null) {
                            return AnonymousClass001.A0T(queryParameter, "live_broadcast", '_');
                        }
                        throw new UnsupportedOperationException("Live notification not handled");
                    }
                };
                HashMap hashMap = C1WZ.A09;
                hashMap.put("live_broadcast", c1we);
                hashMap.put("live_broadcast_revoke", c1we);
                hashMap.put("reachability_silent_push", new Object());
                hashMap.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, new AbstractC28591Zu(context2) { // from class: X.2Sz
                    public final Context A00;

                    @Override // X.C1WE
                    public final String A0C() {
                        return "newstab";
                    }

                    @Override // X.C1WE
                    public final void A0D(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, L85 l85, String str) {
                        l85.A00(true);
                    }

                    @Override // X.C1WE
                    public final void A06(C116155Nu c116155Nu, UserSession userSession, String str) {
                        if (c116155Nu.A0X.equals("ar_video_calling_effect_try_it")) {
                            String str2 = c116155Nu.A0g;
                            if (str2 == null) {
                                str2 = "";
                            }
                            android.net.Uri A03 = AbstractC08820cl.A03(str2);
                            AbstractC35047FcK.A02(this.A00, new C19270xB("NewsfeedPushNotificationHandler"), userSession, A03.getQueryParameter("effect_id"), A03.getQueryParameter("test_link_crypto_hash"), A03.getQueryParameter("test_link_revision_id"));
                        }
                    }

                    @Override // X.C1WE
                    public final boolean A09(C116155Nu c116155Nu, UserSession userSession, String str) {
                        return c116155Nu.A0X.equals("ar_video_calling_effect_try_it");
                    }

                    @Override // X.C1WE
                    public final void A0B(C116155Nu c116155Nu, UserSession userSession, String str, boolean z) {
                        if (userSession != null) {
                            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36310413729726514L);
                            User A00 = C08730cb.A00(userSession).A00();
                            if (!A06 && !z) {
                                InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                                ARD.E77("HAS_NEW_NOTIFICATION", true);
                                ARD.apply();
                            }
                            ((C54702fS) AbstractC54332en.A00(userSession)).A00.A04.A00 = SystemClock.elapsedRealtime();
                            C50B c50b = c116155Nu.A08;
                            if (c50b != null && A00.getId().equals(c116155Nu.A0j)) {
                                AbstractC23021Ah.A01(userSession, c50b.A01);
                                C1Z6.A00(userSession).A02();
                            }
                        }
                    }

                    {
                        this.A00 = context2;
                    }
                });
                C211211o c211211o2 = ((C14C) this).A01;
                AbstractC12990ll A08 = ((AnonymousClass122) c211211o2.A00()).A08();
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, A08, 36310482449072245L)) {
                    final C2T1 c2t1 = new C2T1(new C17320tT(PreferenceManager.getDefaultSharedPreferences(context2), "ColdStartSilentPushHandler"), new Object());
                    hashMap.put("app_cold_start_silent_push", new C1WE(c2t1) { // from class: X.2T3
                        public final C2T1 A00;

                        @Override // X.C1WE
                        public final String A0C() {
                            return "app_cold_start_silent_push";
                        }

                        @Override // X.C1WE
                        public final void A0D(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, L85 l85, String str) {
                            l85.A00(false);
                        }

                        @Override // X.C1WE
                        public final void A04(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, String str) {
                            C2T1 c2t12 = this.A00;
                            C2T1.A00(c2t12, false);
                            long currentTimeMillis = System.currentTimeMillis();
                            if (c2t12.A00 <= 0 && c2t12.A01 == C05F.A00) {
                                c2t12.A00 = currentTimeMillis;
                                InterfaceC19610xo ARD = c2t12.A02.ARD();
                                ARD.E7G("sp_ts_011", currentTimeMillis);
                                ARD.apply();
                                return;
                            }
                            c2t12.A03.A00(new Integer[]{c2t12.A01}, currentTimeMillis);
                        }

                        {
                            this.A00 = c2t1;
                        }
                    });
                }
                final Handler handler = new Handler(Looper.getMainLooper());
                final C2T4 c2t4 = C2T4.A00;
                hashMap.put("rollcall_story", new C1WE(handler, c2t4) { // from class: X.2T5
                    public final Handler A00;
                    public final InterfaceC16660sJ A01;

                    {
                        C14360o3.A0B(c2t4, 2);
                        this.A00 = handler;
                        this.A01 = c2t4;
                    }

                    @Override // X.C1WE
                    public final void A06(C116155Nu c116155Nu, UserSession userSession, String str) {
                        C14360o3.A0B(userSession, 1);
                        AbstractC70833Fv.A00(userSession).A03 = false;
                        this.A00.post(new GMP(userSession));
                    }

                    @Override // X.C1WE
                    public final String A0C() {
                        return "ROLL_CALL";
                    }

                    @Override // X.C1WE
                    public final void A0D(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, L85 l85, String str) {
                        C14360o3.A0B(l85, 3);
                        l85.A00(true);
                    }

                    @Override // X.C1WE
                    public final boolean A09(C116155Nu c116155Nu, UserSession userSession, String str) {
                        android.net.Uri uri = (android.net.Uri) this.A01.invoke(c116155Nu);
                        if (!C14360o3.A0K(uri.getHost(), "create_rollcall_story") && !C14360o3.A0K(uri.getEncodedPath(), "create_rollcall_story")) {
                            return false;
                        }
                        return true;
                    }
                });
                if (C18U.A06(c06090Tz, ((AnonymousClass122) c211211o2.A00()).A08(), 36317491838457071L)) {
                    Iterator it = AbstractC16960so.A1Q("close_friend_story", "story_daily_digest", "first_reel_post", "resurrected_reel_post").iterator();
                    while (it.hasNext()) {
                        hashMap.put(it.next(), new Object());
                    }
                }
                hashMap.put("ig_encrypted_backups_one_time_code", new C2T6(context2));
                C2T7 c2t7 = C2T7.A00;
                C28811aJ.A0u.add(c2t7);
                C14360o3.A0B(c2t7, 0);
                C28821aL.A06.add(c2t7);
                C27741Wc.A01().A05(new AbstractC28611Zw(context2) { // from class: X.2T8
                    public final Context A00;

                    @Override // X.C1WJ
                    public final void AB1(C116155Nu c116155Nu, UserSession userSession, String str) {
                    }

                    @Override // X.C1WJ
                    public final boolean ACT(C116155Nu c116155Nu, C116155Nu c116155Nu2) {
                        return false;
                    }

                    @Override // X.C1WJ
                    public final String Amb() {
                        return "newstab";
                    }

                    @Override // X.C1WJ
                    public final void DW8(C116155Nu c116155Nu, UserSession userSession) {
                    }

                    @Override // X.AbstractC28611Zw
                    public final List A00(String str, Collection collection) {
                        ArrayList arrayList = new ArrayList();
                        C14360o3.A0B(str, 0);
                        if (AbstractC001900j.A0a(str, "&", false)) {
                            Iterator it2 = collection.iterator();
                            while (it2.hasNext()) {
                                String str2 = (String) it2.next();
                                if (AbstractC34761FTg.A01(str).equals(AbstractC34761FTg.A01(str2)) && AbstractC34761FTg.A00(str).equals(AbstractC34761FTg.A00(str2))) {
                                    arrayList.add(str2);
                                }
                            }
                        }
                        return arrayList;
                    }

                    {
                        this.A00 = context2.getApplicationContext();
                    }

                    @Override // X.C1WJ
                    public final C47690L3x AEk(UserSession userSession, String str, String str2, List list, boolean z) {
                        boolean z2;
                        String str3;
                        String str4;
                        boolean z3 = true;
                        C116155Nu c116155Nu = (C116155Nu) list.get(list.size() - 1);
                        if (userSession == null || (((str4 = c116155Nu.A0g) != null && str4.startsWith("draft_post_capture_page")) || c116155Nu.A0D == null || (!C18U.A06(C06090Tz.A06, userSession, 36325106812924650L) && !C18U.A06(C06090Tz.A05, userSession, 36325106812859113L)))) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        Context context3 = this.A00;
                        XN9 A03 = AbstractC55212OeW.A03(context3, C92I.A00(context3, c116155Nu.A07, userSession, "newstab", c116155Nu.A11, c116155Nu.A0X), c116155Nu, userSession, "newstab", str2, z2);
                        C14360o3.A0B(context3, 2);
                        if ("resurrected_reel_post".equals(c116155Nu.A11) && C18U.A06(C06090Tz.A05, userSession, 36310654247829723L)) {
                            A03.A06(AbstractC55212OeW.A01(context3, null, c116155Nu, null, "view_story"), context3.getString(2131976891), 0);
                            Intent intent = new Intent();
                            intent.putExtra("from_notification_id", c116155Nu.A12);
                            intent.putExtra("from_notification_category", c116155Nu.A11);
                            intent.putExtra("landing_path", c116155Nu.A0g);
                            intent.putExtra("channel", TraceEventType.Push);
                            intent.putExtra("igNotification_object", c116155Nu.A04());
                            Bundle bundle = new Bundle();
                            bundle.putString("notification_category", "newstab");
                            bundle.putString("notification_uuid", str2);
                            if (userSession != null) {
                                str3 = userSession.token;
                            } else {
                                str3 = "";
                            }
                            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str3);
                            intent.putExtras(bundle);
                            intent.setComponent(new ComponentName(context3, (Class<?>) NotificationActionReceiver.class));
                            String string = context3.getString(2131976876);
                            C14360o3.A07(string);
                            String str5 = c116155Nu.A0j;
                            Uri.Builder buildUpon = AbstractC08820cl.A03(AnonymousClass001.A0R("ig://", c116155Nu.A0g)).buildUpon();
                            String str6 = c116155Nu.A11;
                            if (str6 != null && str6.length() != 0) {
                                buildUpon.appendQueryParameter("push_category", str6);
                            }
                            String str7 = c116155Nu.A1A;
                            if (str7 != null && str7.length() != 0) {
                                buildUpon.appendQueryParameter("sender_user_id", str7);
                            }
                            buildUpon.appendQueryParameter("notification_action_key", "view_profile");
                            android.net.Uri build = buildUpon.build();
                            C14360o3.A07(build);
                            AbstractC34771FTu.A01(context3, intent, build, str5, "via_push_notification");
                            C04750Mt c04750Mt = new C04750Mt();
                            c04750Mt.A0B(intent, context3.getClassLoader());
                            A03.A0Y.add(new Y3h(c04750Mt.A02(context3, 0, 134217728), string, 0).A01());
                        }
                        if (userSession == null || !C18U.A06(C06090Tz.A05, userSession, 36325106812793576L)) {
                            z3 = false;
                        }
                        Notification A00 = AbstractC55212OeW.A00(context3, A03, list, z3, z2);
                        C1Z6.A00(userSession).A03(A00, context3, list);
                        return new C47690L3x(A00, c116155Nu, AbstractC55212OeW.A06(list, 10));
                    }
                }, AbstractC19750y3.A01("news_feed_notifications"), "newstab");
                C27741Wc.A01().A05(new C1WJ(context2) { // from class: X.2T9
                    public final Context A00;

                    {
                        C14360o3.A0B(context2, 1);
                        Context applicationContext = context2.getApplicationContext();
                        C14360o3.A07(applicationContext);
                        this.A00 = applicationContext;
                    }

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
                        Context context3 = this.A00;
                        XN9 A05 = AbstractC55212OeW.A05(context3, userSession, "iglive", str2, list);
                        C116155Nu c116155Nu = (C116155Nu) AbstractC001800i.A0K(list);
                        Notification A00 = AbstractC55212OeW.A00(context3, A05, list, false, false);
                        C14360o3.A07(A00);
                        C1Z6.A00(userSession).A03(A00, context3, list);
                        return new C47690L3x(A00, c116155Nu, AbstractC55212OeW.A06(list, 10));
                    }

                    @Override // X.C1WJ
                    public final String Amb() {
                        return "iglive";
                    }

                    @Override // X.C1WJ
                    public final void DW8(C116155Nu c116155Nu, UserSession userSession) {
                    }
                }, AbstractC19750y3.A01("insta_video_notifications"), "iglive");
                C27741Wc.A01().A05(new AbstractC28611Zw(context2) { // from class: X.2T8
                    public final Context A00;

                    @Override // X.C1WJ
                    public final void AB1(C116155Nu c116155Nu, UserSession userSession, String str) {
                    }

                    @Override // X.C1WJ
                    public final boolean ACT(C116155Nu c116155Nu, C116155Nu c116155Nu2) {
                        return false;
                    }

                    @Override // X.C1WJ
                    public final String Amb() {
                        return "newstab";
                    }

                    @Override // X.C1WJ
                    public final void DW8(C116155Nu c116155Nu, UserSession userSession) {
                    }

                    @Override // X.AbstractC28611Zw
                    public final List A00(String str, Collection collection) {
                        ArrayList arrayList = new ArrayList();
                        C14360o3.A0B(str, 0);
                        if (AbstractC001900j.A0a(str, "&", false)) {
                            Iterator it2 = collection.iterator();
                            while (it2.hasNext()) {
                                String str2 = (String) it2.next();
                                if (AbstractC34761FTg.A01(str).equals(AbstractC34761FTg.A01(str2)) && AbstractC34761FTg.A00(str).equals(AbstractC34761FTg.A00(str2))) {
                                    arrayList.add(str2);
                                }
                            }
                        }
                        return arrayList;
                    }

                    {
                        this.A00 = context2.getApplicationContext();
                    }

                    @Override // X.C1WJ
                    public final C47690L3x AEk(UserSession userSession, String str, String str2, List list, boolean z) {
                        boolean z2;
                        String str3;
                        String str4;
                        boolean z3 = true;
                        C116155Nu c116155Nu = (C116155Nu) list.get(list.size() - 1);
                        if (userSession == null || (((str4 = c116155Nu.A0g) != null && str4.startsWith("draft_post_capture_page")) || c116155Nu.A0D == null || (!C18U.A06(C06090Tz.A06, userSession, 36325106812924650L) && !C18U.A06(C06090Tz.A05, userSession, 36325106812859113L)))) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        Context context3 = this.A00;
                        XN9 A03 = AbstractC55212OeW.A03(context3, C92I.A00(context3, c116155Nu.A07, userSession, "newstab", c116155Nu.A11, c116155Nu.A0X), c116155Nu, userSession, "newstab", str2, z2);
                        C14360o3.A0B(context3, 2);
                        if ("resurrected_reel_post".equals(c116155Nu.A11) && C18U.A06(C06090Tz.A05, userSession, 36310654247829723L)) {
                            A03.A06(AbstractC55212OeW.A01(context3, null, c116155Nu, null, "view_story"), context3.getString(2131976891), 0);
                            Intent intent = new Intent();
                            intent.putExtra("from_notification_id", c116155Nu.A12);
                            intent.putExtra("from_notification_category", c116155Nu.A11);
                            intent.putExtra("landing_path", c116155Nu.A0g);
                            intent.putExtra("channel", TraceEventType.Push);
                            intent.putExtra("igNotification_object", c116155Nu.A04());
                            Bundle bundle = new Bundle();
                            bundle.putString("notification_category", "newstab");
                            bundle.putString("notification_uuid", str2);
                            if (userSession != null) {
                                str3 = userSession.token;
                            } else {
                                str3 = "";
                            }
                            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str3);
                            intent.putExtras(bundle);
                            intent.setComponent(new ComponentName(context3, (Class<?>) NotificationActionReceiver.class));
                            String string = context3.getString(2131976876);
                            C14360o3.A07(string);
                            String str5 = c116155Nu.A0j;
                            Uri.Builder buildUpon = AbstractC08820cl.A03(AnonymousClass001.A0R("ig://", c116155Nu.A0g)).buildUpon();
                            String str6 = c116155Nu.A11;
                            if (str6 != null && str6.length() != 0) {
                                buildUpon.appendQueryParameter("push_category", str6);
                            }
                            String str7 = c116155Nu.A1A;
                            if (str7 != null && str7.length() != 0) {
                                buildUpon.appendQueryParameter("sender_user_id", str7);
                            }
                            buildUpon.appendQueryParameter("notification_action_key", "view_profile");
                            android.net.Uri build = buildUpon.build();
                            C14360o3.A07(build);
                            AbstractC34771FTu.A01(context3, intent, build, str5, "via_push_notification");
                            C04750Mt c04750Mt = new C04750Mt();
                            c04750Mt.A0B(intent, context3.getClassLoader());
                            A03.A0Y.add(new Y3h(c04750Mt.A02(context3, 0, 134217728), string, 0).A01());
                        }
                        if (userSession == null || !C18U.A06(C06090Tz.A05, userSession, 36325106812793576L)) {
                            z3 = false;
                        }
                        Notification A00 = AbstractC55212OeW.A00(context3, A03, list, z3, z2);
                        C1Z6.A00(userSession).A03(A00, context3, list);
                        return new C47690L3x(A00, c116155Nu, AbstractC55212OeW.A06(list, 10));
                    }
                }, AbstractC19750y3.A01("news_feed_notifications"), "ig_encrypted_backups_one_time_code");
                C27741Wc.A01().A05(new C1WJ(context2) { // from class: X.2TA
                    public final Context A00;

                    {
                        C14360o3.A0B(context2, 1);
                        this.A00 = context2.getApplicationContext();
                    }

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
                        C116155Nu c116155Nu = (C116155Nu) AbstractC001800i.A0K(list);
                        Context context3 = this.A00;
                        XN9 A04 = AbstractC55212OeW.A04(context3, c116155Nu, userSession, "ROLL_CALL", str2);
                        A04.A0A.vibrate = MTN.A04;
                        return new C47690L3x(AbstractC55212OeW.A00(context3, A04, list, false, false), c116155Nu, AbstractC55212OeW.A06(list, 10));
                    }

                    @Override // X.C1WJ
                    public final String Amb() {
                        return "ROLL_CALL";
                    }

                    @Override // X.C1WJ
                    public final void DW8(C116155Nu c116155Nu, UserSession userSession) {
                    }
                }, AbstractC19750y3.A01("roll_call_notifications"), "ROLL_CALL");
            }
        };
    }
}
