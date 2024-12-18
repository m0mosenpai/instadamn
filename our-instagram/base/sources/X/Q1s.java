package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.PowerManager;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class Q1s extends BroadcastReceiver {
    public static final Q1s A00 = new BroadcastReceiver();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, 637349893);
        if (intent == null) {
            AnonymousClass919 anonymousClass919 = AnonymousClass918.A00;
            anonymousClass919.A02(intent, "intent_empty");
            anonymousClass919.A01(intent, "intent was null");
            i = -6237400;
        } else {
            C14360o3.A0B(context, 0);
            S56 s56 = C62888SVs.A01;
            C62888SVs c62888SVs = C62888SVs.A02;
            if (c62888SVs == null) {
                synchronized (s56) {
                    c62888SVs = C62888SVs.A02;
                    if (c62888SVs == null) {
                        c62888SVs = new C62888SVs(context);
                        C62888SVs.A02 = c62888SVs;
                    }
                }
            }
            Runnable runnable = new Runnable() { // from class: X.TPn
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass919 anonymousClass9192;
                    String str;
                    C58449PvX c58449PvX;
                    int hashCode;
                    QJW qjw;
                    C0f6 c0f6;
                    Context context2 = context;
                    Intent intent2 = intent;
                    String action = intent2.getAction();
                    if (!"com.facebook.rti.fbns.intent.RECEIVE".equals(action)) {
                        anonymousClass9192 = AnonymousClass918.A00;
                        String A002 = MSV.A00(1319);
                        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
                        if (qPLInstance != null) {
                            qPLInstance.markerAnnotate(875309620, anonymousClass9192.A00(intent2), A002, action);
                        }
                        str = "Action was not receive";
                    } else if (!((C74123Uq) C3UY.A00).A00(intent2, new C3VA(context2, null)).Cfc()) {
                        anonymousClass9192 = AnonymousClass918.A00;
                        anonymousClass9192.A02(intent2, "intent_auth_failed");
                        str = "Sender not preload FBNS";
                    } else {
                        String stringExtra = intent2.getStringExtra("receive_type");
                        if (DialogModule.KEY_MESSAGE.equals(stringExtra)) {
                            if (C40911uy.A00 == null && (c0f6 = C40911uy.A01) != null) {
                                c0f6.AEp("PushManager was not initialized before access", 817901599);
                            }
                            C40961v3 c40961v3 = C40911uy.A00;
                            if (c40961v3 != null && (c58449PvX = (C58449PvX) c40961v3.A08.getValue()) != null) {
                                PushInfraMetaData A01 = PushInfraMetaData.Companion.A01(intent2);
                                C14360o3.A0B(A01, 0);
                                QuickPerformanceLogger qPLInstance2 = QuickPerformanceLoggerProvider.getQPLInstance();
                                String str2 = A01.A08;
                                if (str2 == null) {
                                    hashCode = 1;
                                } else {
                                    hashCode = UUID.fromString(str2).hashCode();
                                }
                                if (str2 != null) {
                                    if (qPLInstance2 != null) {
                                        qPLInstance2.markerAnnotate(875309620, hashCode, "push_infra_notif_id", str2);
                                    }
                                } else if (qPLInstance2 != null) {
                                    qPLInstance2.markerPoint(875309620, hashCode, "push_infra_notif_id_missing");
                                }
                                Long l = A01.A01;
                                if (l != null) {
                                    long longValue = l.longValue();
                                    if (qPLInstance2 != null) {
                                        qPLInstance2.markerAnnotate(875309620, hashCode, "push_infra_use_case_id", longValue);
                                    }
                                }
                                String str3 = A01.A09;
                                if (str3 != null) {
                                    if (qPLInstance2 != null) {
                                        qPLInstance2.markerAnnotate(875309620, hashCode, "token_fbid", str3);
                                    }
                                } else if (qPLInstance2 != null) {
                                    qPLInstance2.markerPoint(875309620, hashCode, "token_fbid_missing");
                                }
                                String str4 = A01.A06;
                                if (str4 != null) {
                                    if (qPLInstance2 != null) {
                                        qPLInstance2.markerAnnotate(875309620, hashCode, "log_notification_request_on_client", String.valueOf(str4));
                                    }
                                } else if (qPLInstance2 != null) {
                                    qPLInstance2.markerPoint(875309620, hashCode, "log_notification_request_on_client_missing");
                                }
                                String str5 = A01.A02;
                                if (str5 != null) {
                                    if (qPLInstance2 != null) {
                                        qPLInstance2.markerAnnotate(875309620, hashCode, "compression_algorithm", str5);
                                    }
                                } else if (qPLInstance2 != null) {
                                    qPLInstance2.markerPoint(875309620, hashCode, "compressoin_algorithm_missing");
                                }
                                String str6 = A01.A03;
                                if (str6 != null) {
                                    if (qPLInstance2 != null) {
                                        qPLInstance2.markerAnnotate(875309620, hashCode, "hpke_ciphersuite", str6);
                                    }
                                } else if (qPLInstance2 != null) {
                                    qPLInstance2.markerPoint(875309620, hashCode, "hpke_ciphersuite_missing");
                                }
                                String str7 = A01.A07;
                                if (str7 != null) {
                                    if (qPLInstance2 != null) {
                                        qPLInstance2.markerAnnotate(875309620, hashCode, "pre_fan_out_notification_request_identifier", str7);
                                    }
                                } else if (qPLInstance2 != null) {
                                    qPLInstance2.markerPoint(875309620, hashCode, "pre_fan_out_notification_request_identifier_missing");
                                }
                                String str8 = A01.A05;
                                if (str8 != null) {
                                    if (qPLInstance2 != null) {
                                        qPLInstance2.markerAnnotate(875309620, hashCode, "keystore_id", str8);
                                    }
                                } else if (qPLInstance2 != null) {
                                    qPLInstance2.markerPoint(875309620, hashCode, "keystore_id_missing");
                                }
                                QuickPerformanceLogger quickPerformanceLogger = c58449PvX.A04;
                                if (quickPerformanceLogger != null) {
                                    quickPerformanceLogger.markerAnnotate(875309620, "is_background", AbstractC166997dE.A0b().equals(BackgroundStartupDetector.A0G));
                                }
                                MarkerEditor A003 = C58449PvX.A00(c58449PvX);
                                if (A003 != null) {
                                    A003.annotate("push_channel", "FBNS");
                                    A003.point("received_start");
                                }
                                String stringExtra2 = intent2.getStringExtra("data");
                                String stringExtra3 = intent2.getStringExtra("bin");
                                C40681ub c40681ub = c58449PvX.A05;
                                QJW qjw2 = null;
                                if (c40681ub != null) {
                                    if (C18U.A06(C06090Tz.A05, c40681ub.A00, 36321292882814258L)) {
                                        Context context3 = c58449PvX.A00;
                                        if (stringExtra2 != null) {
                                            qjw = new QJW(stringExtra2);
                                        } else {
                                            qjw = null;
                                        }
                                        if (stringExtra3 != null) {
                                            qjw2 = new QJW(stringExtra3);
                                        }
                                        c58449PvX.A04(new QIm(context3, A01, qjw, qjw2, null, "FBNS", false, false));
                                    }
                                }
                                MarkerEditor A004 = C58449PvX.A00(c58449PvX);
                                if (A004 != null) {
                                    A004.point("received_logging_start");
                                }
                                C58450PvY c58450PvY = c58449PvX.A03;
                                if (c58450PvY != null) {
                                    C58450PvY.A00(c58450PvY, A01, "notif_received_push", "FBNS", AbstractC166987dD.A1I());
                                }
                                MarkerEditor A005 = C58449PvX.A00(c58449PvX);
                                if (A005 != null) {
                                    A005.point("received_logging_end");
                                }
                                c58449PvX.A03(A01, str3);
                                c58449PvX.A06.A00(new C31200Dnj("FBNS", 3), c58449PvX.A01(A01, stringExtra2, null, "FBNS"));
                                MarkerEditor A006 = C58449PvX.A00(c58449PvX);
                                if (A006 != null) {
                                    A006.point("received_end");
                                }
                            }
                            anonymousClass9192 = AnonymousClass918.A00;
                            anonymousClass9192.A02(intent2, "ack_notification_start");
                            String stringExtra4 = intent2.getStringExtra("extra_notification_sender");
                            String stringExtra5 = intent2.getStringExtra("extra_notification_id");
                            if (stringExtra4 != null && !stringExtra4.isEmpty()) {
                                if (stringExtra5 != null && !stringExtra5.isEmpty()) {
                                    Intent A0E = AbstractC58318PtA.A0E("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK");
                                    A0E.putExtra("extra_notification_id", stringExtra5);
                                    A0E.putExtra("extra_processor_completed", true);
                                    if (!"com.facebook.services".equals(stringExtra4) && !"com.facebook.services.dev".equals(stringExtra4)) {
                                        C0K8.A0O("FBNSPreloadIPC", "Unknown package %s", stringExtra4);
                                    } else {
                                        try {
                                            A0E.setPackage(stringExtra4);
                                            C04750Mt c04750Mt = new C04750Mt();
                                            c04750Mt.A0D = true;
                                            c04750Mt.A0B = context2.getPackageName();
                                            PendingIntent A012 = c04750Mt.A01(context2, 0, 134217728);
                                            Bundle A0b = AbstractC166987dD.A0b();
                                            A0b.putParcelable("auth_pending_intent", A012);
                                            A0E.putExtra("auth_bundle", A0b);
                                            context2.sendBroadcast(A0E);
                                        } catch (RuntimeException e) {
                                            if (!(e.getCause() instanceof DeadObjectException)) {
                                                throw e;
                                            }
                                        }
                                    }
                                    anonymousClass9192.A02(intent2, "ack_notification_end");
                                    QuickPerformanceLogger qPLInstance3 = QuickPerformanceLoggerProvider.getQPLInstance();
                                    if (qPLInstance3 == null) {
                                        return;
                                    }
                                    qPLInstance3.markerEnd(875309620, anonymousClass9192.A00(intent2), (short) 2);
                                    return;
                                }
                                anonymousClass9192.A02(intent2, "ack_notification_notif_id_empty");
                                str = "notif id was empty";
                            } else {
                                anonymousClass9192.A02(intent2, "ack_notification_pkg_empty");
                                str = "package name was empty";
                            }
                        } else {
                            if ("registered".equals(stringExtra)) {
                                intent2.getStringExtra("data");
                                throw new C141786av("Push token registration not yet supported in PushSDK");
                            }
                            if ("unregistered".equals(stringExtra)) {
                                throw new C141786av("Push token registration not yet supported in PushSDK");
                            }
                            if (!"reg_error".equals(stringExtra)) {
                                return;
                            }
                            intent2.getStringExtra("data");
                            throw new C141786av("Push token registration not yet supported in PushSDK");
                        }
                    }
                    anonymousClass9192.A01(intent2, str);
                }
            };
            PowerManager powerManager = c62888SVs.A00;
            if (powerManager != null) {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "IgFbnsWakefulExecutor");
                C0BX.A02(newWakeLock, "IgFbnsWakefulExecutor");
                AbstractC09820fg.A02(newWakeLock);
                newWakeLock.acquire(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                C0BX.A01(newWakeLock, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                C14120nc.A00().ATO(new RcF(newWakeLock, runnable));
            }
            i = -1225756317;
        }
        C0f9.A0E(i, A04, intent);
    }
}
