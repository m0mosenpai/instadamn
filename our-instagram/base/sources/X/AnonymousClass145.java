package X;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.service.notification.StatusBarNotification;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.Future;

/* renamed from: X.145, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass145 extends AbstractC211911v {
    public static C40561uP A03;
    public final Context A00;
    public final C17090t4 A01;
    public final C211211o A02;

    public AnonymousClass145(Context context, C211211o c211211o, C17090t4 c17090t4) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c17090t4, 2);
        this.A00 = context;
        this.A01 = c17090t4;
        this.A02 = c211211o;
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "SessionScopedProviderInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        A03 = new C40561uP(((AnonymousClass122) this.A02.A00()).A08());
        C17090t4 c17090t4 = this.A01;
        c17090t4.A01(new C0KV() { // from class: X.1uR
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
                int A032 = C0f9.A03(-1851495148);
                int A033 = C0f9.A03(1291352820);
                C14360o3.A0B(userSession, 0);
                C40631uW c40631uW = new C40631uW(userSession, AnonymousClass145.this.A00);
                C0f9.A0A(-12905316, A033);
                C0f9.A0A(492823968, A032);
                return c40631uW;
            }
        });
        c17090t4.A01(new C0KV() { // from class: X.1uT
            @Override // X.C0KV
            public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
                int A032 = C0f9.A03(1326574233);
                int A033 = C0f9.A03(-249558568);
                C14360o3.A0B(userSession, 0);
                final Context context = AnonymousClass145.this.A00;
                InterfaceC13030lp interfaceC13030lp = new InterfaceC13030lp(userSession, context) { // from class: X.1ua
                    public final Context A00;
                    public final UserSession A01;

                    {
                        C14360o3.A0B(context, 2);
                        this.A01 = userSession;
                        this.A00 = context;
                    }

                    @Override // X.InterfaceC13030lp
                    public final void DyC(boolean z) {
                        AbstractC09800fd.A01("SessionScopedProviderInitializer-PushLiteSDKInitializer", -1884481332);
                        try {
                            UserSession userSession2 = this.A01;
                            final Context context2 = this.A00;
                            C18920wW A02 = AbstractC12220kQ.A02(userSession2);
                            C14360o3.A0C(A02, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.base.Logger<*>");
                            final C40681ub c40681ub = new C40681ub(userSession2);
                            C18950wb c18950wb = C18950wb.A01;
                            final C40701ud A01 = AbstractC40691uc.A01(userSession2);
                            C40871uu c40871uu = C40871uu.A00;
                            final String A05 = C16030qx.A02.A05(context2);
                            C14360o3.A0B(c18950wb, 3);
                            C40911uy c40911uy = C40911uy.A02;
                            C40911uy.A01 = c18950wb;
                            if (C40911uy.A00 == null) {
                                synchronized (c40911uy) {
                                    if (C40911uy.A00 == null) {
                                        C206319Bo c206319Bo = new C206319Bo(context2, A02, A01, c40681ub);
                                        C14360o3.A0B(c40871uu, 0);
                                        c206319Bo.A00 = c40871uu;
                                        c206319Bo.A01 = new InterfaceC08830cm() { // from class: X.1v0
                                            @Override // X.InterfaceC08830cm
                                            public final /* bridge */ /* synthetic */ Object get() {
                                                context2.getApplicationContext();
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        };
                                        C40941v1 c40941v1 = C40941v1.A00;
                                        C14360o3.A0B(c40941v1, 0);
                                        c206319Bo.A02 = c40941v1;
                                        C40911uy.A00 = new C40961v3(c206319Bo);
                                    }
                                }
                            }
                            if (C40911uy.A00 == null) {
                                C0K8.A0C("PushLiteSDKInitializer", "Did not init a PushManager from PushLite SDK");
                            }
                            AbstractRunnableC14200nk abstractRunnableC14200nk = new AbstractRunnableC14200nk() { // from class: X.1v6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1652125191, 3, true, true);
                                }

                                /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, X.4wo] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    NotificationManager notificationManager;
                                    NotificationManager.Policy notificationPolicy;
                                    String obj;
                                    StatusBarNotification[] activeNotifications;
                                    C40701ud c40701ud = A01;
                                    C40681ub c40681ub2 = c40681ub;
                                    Context context3 = context2;
                                    String str = A05;
                                    C14360o3.A0B(c40701ud, 0);
                                    C14360o3.A0B(c40681ub2, 1);
                                    UserSession userSession3 = c40681ub2.A00;
                                    C06090Tz c06090Tz = C06090Tz.A05;
                                    if (C18U.A06(c06090Tz, userSession3, 36321292882224427L)) {
                                        final C87513vJ c87513vJ = new C87513vJ(context3, c40701ud, c40681ub2, str);
                                        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                                        Context context4 = c87513vJ.A00;
                                        if (currentTimeMillis - context4.getSharedPreferences("token_ack_prefs", 0).getInt("push_check_time", 0) >= ((int) C18U.A01(c06090Tz, c87513vJ.A02.A00, 36602767859127110L))) {
                                            final QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
                                            if (qPLInstance != null) {
                                                qPLInstance.markerStart(875301323);
                                            }
                                            try {
                                                try {
                                                    Object systemService = context4.getSystemService("notification");
                                                    C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                                                    notificationManager = (NotificationManager) systemService;
                                                } catch (Exception e) {
                                                    if (qPLInstance != null) {
                                                        qPLInstance.markerAnnotate(875301323, "notification_settings_manager_error", e.getMessage());
                                                    }
                                                }
                                            } catch (NoClassDefFoundError unused) {
                                                notificationManager = null;
                                            }
                                            ?? obj2 = new Object();
                                            obj2.A00 = notificationManager;
                                            if (qPLInstance != null) {
                                                boolean z2 = true;
                                                if (notificationManager != null) {
                                                    z2 = notificationManager.areNotificationsEnabled();
                                                }
                                                qPLInstance.markerAnnotate(875301323, "notifications_on", z2);
                                                qPLInstance.markerAnnotate(875301323, "notifications_paused", obj2.A00());
                                                int i = -1;
                                                NotificationManager notificationManager2 = obj2.A00;
                                                if (notificationManager2 != null) {
                                                    i = notificationManager2.getImportance();
                                                }
                                                qPLInstance.markerAnnotate(875301323, "notifications_importance", i);
                                                int i2 = -1;
                                                NotificationManager notificationManager3 = obj2.A00;
                                                if (notificationManager3 != null && (activeNotifications = notificationManager3.getActiveNotifications()) != null) {
                                                    i2 = activeNotifications.length;
                                                }
                                                qPLInstance.markerAnnotate(875301323, "active_notifications_count", i2);
                                                String str2 = "No Policy";
                                                NotificationManager notificationManager4 = obj2.A00;
                                                if (notificationManager4 != null && (notificationPolicy = notificationManager4.getNotificationPolicy()) != null && (obj = notificationPolicy.toString()) != null) {
                                                    str2 = obj;
                                                }
                                                qPLInstance.markerAnnotate(875301323, "notifications_policy", str2);
                                                boolean z3 = false;
                                                if (GoogleApiAvailability.A00.A02(context4) == 0) {
                                                    z3 = true;
                                                }
                                                qPLInstance.markerAnnotate(875301323, "google_play_available", z3);
                                            }
                                            String str3 = c87513vJ.A03;
                                            try {
                                                C109644wq c109644wq = (C109644wq) C109634wp.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
                                                C2JM c2jm = c109644wq.A00;
                                                c2jm.A04("app_id", "0");
                                                c109644wq.A01 = true;
                                                c2jm.A04(AbstractC50529MSi.A02(0, 9, 30), str3);
                                                c109644wq.A02 = true;
                                                c87513vJ.A01.ATV(new InterfaceC48212Jk() { // from class: X.4wt
                                                    @Override // X.InterfaceC48212Jk
                                                    public final void invoke(Throwable th) {
                                                        C0K8.A0C("PushabilityChecker", "check pushability failed");
                                                        QuickPerformanceLogger quickPerformanceLogger = qPLInstance;
                                                        if (quickPerformanceLogger != null) {
                                                            quickPerformanceLogger.markerAnnotate(875301323, "error_message", th.getMessage());
                                                            quickPerformanceLogger.markerEnd(875301323, (short) 3);
                                                        }
                                                    }
                                                }, new InterfaceC48192Ji() { // from class: X.4ws
                                                    @Override // X.InterfaceC48192Ji
                                                    public final void invoke(AnonymousClass436 anonymousClass436) {
                                                        String str4;
                                                        QuickPerformanceLogger quickPerformanceLogger;
                                                        C2JS c2js;
                                                        ImmutableList requiredCompactedTreeListField;
                                                        C2JS c2js2;
                                                        QuickPerformanceLogger quickPerformanceLogger2;
                                                        C2JS c2js3;
                                                        C2JS optionalTreeField;
                                                        String str5 = null;
                                                        if (anonymousClass436 != null && (c2js3 = (C2JS) anonymousClass436.Bos()) != null && (optionalTreeField = c2js3.getOptionalTreeField(0, "xfb_init_push_healthcheck(data:{\"app_id\":$app_id,\"device_id\":$device_id})", C59037QUv.class, -51376335)) != null) {
                                                            str4 = optionalTreeField.getOptionalStringField(0, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        if (C14360o3.A0K(str4, "TokenNotFound")) {
                                                            QuickPerformanceLogger quickPerformanceLogger3 = qPLInstance;
                                                            if (quickPerformanceLogger3 != null) {
                                                                quickPerformanceLogger3.markerAnnotate(875301323, "error_message", "Token not found for app/device/user by pushability healthcheck mutation");
                                                                quickPerformanceLogger3.markerEnd(875301323, (short) 3);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null) {
                                                            C2JS optionalTreeField2 = c2js.getOptionalTreeField(0, "xfb_init_push_healthcheck(data:{\"app_id\":$app_id,\"device_id\":$device_id})", C59037QUv.class, -51376335);
                                                            if (optionalTreeField2 != null && (requiredCompactedTreeListField = optionalTreeField2.getRequiredCompactedTreeListField(1, AbstractC58317Pt9.A00(933), C59036QUu.class, 461710326)) != null && (c2js2 = (C2JS) AbstractC001800i.A0J(requiredCompactedTreeListField)) != null && (quickPerformanceLogger2 = qPLInstance) != null) {
                                                                String A00 = AbstractC43591JPw.A00(1263);
                                                                quickPerformanceLogger2.markerAnnotate(875301323, A00, c2js2.getOptionalStringField(0, A00));
                                                                quickPerformanceLogger2.markerAnnotate(875301323, "error_message", c2js2.getOptionalStringField(2, "error_message"));
                                                                quickPerformanceLogger2.markerAnnotate(875301323, TraceFieldType.ErrorCode, c2js2.getOptionalStringField(1, TraceFieldType.ErrorCode));
                                                            }
                                                            C2JS optionalTreeField3 = c2js.getOptionalTreeField(0, "xfb_init_push_healthcheck(data:{\"app_id\":$app_id,\"device_id\":$device_id})", C59037QUv.class, -51376335);
                                                            if (optionalTreeField3 != null) {
                                                                str5 = optionalTreeField3.getOptionalStringField(0, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
                                                            }
                                                        }
                                                        if (!C14360o3.A0K(str5, "Success") || (quickPerformanceLogger = qPLInstance) == null) {
                                                            return;
                                                        }
                                                        quickPerformanceLogger.markerPoint(875301323, "initiate_pushability_check_mutation_success");
                                                    }
                                                }, c109644wq.build());
                                                SharedPreferences.Editor edit = context4.getSharedPreferences("token_ack_prefs", 0).edit();
                                                edit.putInt("push_check_time", currentTimeMillis);
                                                edit.apply();
                                            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                                                throw new RuntimeException(e2);
                                            }
                                        }
                                    }
                                }
                            };
                            InterfaceC14020nS A00 = C14120nc.A00();
                            C14360o3.A07(A00);
                            A00.ATO(abstractRunnableC14200nk);
                            AbstractC09800fd.A00(-1897774179);
                        } catch (Throwable th) {
                            AbstractC09800fd.A00(1603542044);
                            throw th;
                        }
                    }
                };
                C0f9.A0A(1335938985, A033);
                C0f9.A0A(1172760678, A032);
                return interfaceC13030lp;
            }
        });
        C17090t4.A00(c17090t4, true);
        new C41011v8(this.A00).A07();
        C40561uP c40561uP = A03;
        if (c40561uP == null) {
            C14360o3.A0F("asyncJobManager");
            throw C00O.createAndThrow();
        }
        Iterator it = c40561uP.A01.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).get();
        }
    }
}
