package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.zstd.ZstdInputStream;
import com.google.firebase.messaging.RemoteMessage;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PvX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58449PvX {
    public final Context A00;
    public final InterfaceC02550Ad A01;
    public final InterfaceC40711ue A02;
    public final C58450PvY A03;
    public final QuickPerformanceLogger A04;
    public final C40681ub A05;
    public final C58448PvW A06;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r6 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C45127Jxw A01(com.facebook.pushlite.model.PushInfraMetaData r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            r4 = 2
            java.lang.String r9 = r11.A03
            java.lang.String r8 = r11.A04
            java.lang.String r6 = r11.A05
            if (r9 == 0) goto Le
            if (r8 == 0) goto Le
            r3 = 1
            if (r6 != 0) goto Lf
        Le:
            r3 = 0
        Lf:
            java.lang.String r1 = r11.A02
            java.lang.String r0 = "zstd"
            boolean r2 = X.C14360o3.A0K(r1, r0)
            r5 = 0
            if (r12 == 0) goto L2e
            byte[] r1 = X.MSY.A1a(r12)
        L1f:
            if (r13 == 0) goto L2c
            byte[] r0 = X.MSY.A1a(r13)
        L25:
            if (r1 == 0) goto L35
            if (r3 != 0) goto L30
            if (r2 == 0) goto L35
            goto L30
        L2c:
            r0 = r5
            goto L25
        L2e:
            r1 = r5
            goto L1f
        L30:
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L35
        L35:
            if (r0 == 0) goto L3c
            r2 = 0
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L3c
        L3c:
            if (r9 == 0) goto Lb3
            if (r8 == 0) goto Lb3
            if (r6 == 0) goto Lb3
            com.facebook.quicklog.MarkerEditor r3 = A00(r10)     // Catch: java.lang.Exception -> L7f
            if (r3 == 0) goto L4d
            java.lang.String r2 = "decryption_start"
            r3.point(r2)     // Catch: java.lang.Exception -> L7f
        L4d:
            android.content.Context r2 = r10.A00     // Catch: java.lang.Exception -> L7f
            X.SIy r7 = new X.SIy     // Catch: java.lang.Exception -> L7f
            r7.<init>(r2, r6, r9)     // Catch: java.lang.Exception -> L7f
            byte[] r2 = X.MSY.A1a(r8)     // Catch: java.lang.Exception -> L7f
            r6 = 0
            byte[] r3 = android.util.Base64.decode(r2, r6)     // Catch: java.lang.Exception -> L7f
            byte[] r2 = new byte[r6]     // Catch: java.lang.Exception -> L7f
            X.SIZ r3 = X.AbstractC63052SbY.A00(r7, r3, r2)     // Catch: java.lang.Exception -> L7f
            if (r1 == 0) goto L6b
            byte[] r2 = new byte[r6]     // Catch: java.lang.Exception -> L7f
            byte[] r1 = X.AbstractC63052SbY.A01(r3, r7, r2, r1)     // Catch: java.lang.Exception -> L7f
        L6b:
            if (r0 == 0) goto L73
            byte[] r2 = new byte[r6]     // Catch: java.lang.Exception -> L7f
            byte[] r0 = X.AbstractC63052SbY.A01(r3, r7, r2, r0)     // Catch: java.lang.Exception -> L7f
        L73:
            com.facebook.quicklog.MarkerEditor r3 = A00(r10)     // Catch: java.lang.Exception -> L7f
            if (r3 == 0) goto La7
            java.lang.String r2 = "decryption_end"
            r3.point(r2)     // Catch: java.lang.Exception -> L7f
            goto La7
        L7f:
            r8 = move-exception
            X.0Ad r2 = r10.A01
            if (r2 == 0) goto La0
            X.PvY r7 = new X.PvY
            r7.<init>(r2)
            r2 = 1195(0x4ab, float:1.675E-42)
            java.lang.String r6 = X.AbstractC43591JPw.A00(r2)
            java.lang.String r3 = "exception"
            java.lang.String r2 = r8.toString()
            X.0e4[] r2 = X.AbstractC25230BEn.A1b(r3, r2)
            java.util.LinkedHashMap r2 = X.AbstractC06930Yk.A07(r2)
            X.C58450PvY.A00(r7, r11, r6, r14, r2)
        La0:
            X.PvW r3 = r10.A06
            java.lang.String r2 = "decryption_error"
            r3.A01(r14, r2)
        La7:
            X.0e4 r0 = X.AbstractC166987dD.A1L(r1, r0)
            java.lang.Object r1 = r0.A00
            byte[] r1 = (byte[]) r1
            java.lang.Object r0 = r0.A01
            byte[] r0 = (byte[]) r0
        Lb3:
            byte[] r2 = r10.A05(r11, r14, r1)
            byte[] r1 = r10.A05(r11, r14, r0)
            if (r2 == 0) goto Lc3
            java.nio.charset.Charset r0 = X.C15W.A05
            java.lang.String r5 = X.AbstractC58318PtA.A0m(r0, r2)
        Lc3:
            X.Jxw r0 = new X.Jxw
            r0.<init>(r5, r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58449PvX.A01(com.facebook.pushlite.model.PushInfraMetaData, java.lang.String, java.lang.String, java.lang.String):X.Jxw");
    }

    public static final MarkerEditor A00(C58449PvX c58449PvX) {
        QuickPerformanceLogger quickPerformanceLogger = c58449PvX.A04;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger.withMarker(875309620);
        }
        return null;
    }

    public final PushInfraMetaData A02(RemoteMessage remoteMessage) {
        String str;
        QJW qjw;
        PushInfraMetaData A02 = PushInfraMetaData.Companion.A02(remoteMessage);
        String str2 = A02.A08;
        QuickPerformanceLogger quickPerformanceLogger = this.A04;
        if (str2 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "push_infra_notif_id", str2);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "push_infra_notif_id_missing");
        }
        Long l = A02.A01;
        if (l != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "push_infra_use_case_id", l.longValue());
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "push_infra_use_case_id_missing");
        }
        String str3 = A02.A09;
        if (str3 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "token_fbid", str3);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "token_fbid_missing");
        }
        String str4 = A02.A06;
        if (str4 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "log_notification_request_on_client", str4);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "log_notification_request_on_client_missing");
        }
        String str5 = A02.A02;
        if (str5 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "compression_algorithm", str5);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "compressoin_algorithm_missing");
        }
        String str6 = A02.A03;
        if (str6 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "hpke_ciphersuite", str6);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "hpke_ciphersuite_missing");
        }
        String str7 = A02.A07;
        if (str7 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "pre_fan_out_notification_request_identifier", str7);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "pre_fan_out_notification_request_identifier_missing");
        }
        String str8 = A02.A05;
        if (str8 != null) {
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerAnnotate(875309620, "keystore_id", str8);
                Boolean bool = true;
                quickPerformanceLogger.markerAnnotate(875309620, "is_background", bool.equals(BackgroundStartupDetector.A0G));
                quickPerformanceLogger.markerStart(875309620);
            }
        } else if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(875309620, "keystore_id_missing");
            Boolean bool2 = true;
            quickPerformanceLogger.markerAnnotate(875309620, "is_background", bool2.equals(BackgroundStartupDetector.A0G));
            quickPerformanceLogger.markerStart(875309620);
        }
        MarkerEditor A00 = A00(this);
        if (A00 != null) {
            A00.annotate("push_channel", "FCM");
            A00.point("received_start");
        }
        try {
            Bundle A0b = AbstractC166987dD.A0b();
            Iterator A15 = AbstractC166997dE.A15(remoteMessage.A02());
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                A0b.putString((String) entry.getKey(), (String) entry.getValue());
            }
            String A1A = AbstractC166987dD.A1A("data", remoteMessage.A02());
            if (A1A == null) {
                A1A = AbstractC166987dD.A1A("notification", remoteMessage.A02());
            }
            String A1A2 = AbstractC166987dD.A1A("bin", remoteMessage.A02());
            C40681ub c40681ub = this.A05;
            if (c40681ub != null) {
                if (C18U.A06(C06090Tz.A05, c40681ub.A00, 36321292882814258L)) {
                    Context context = this.A00;
                    QJW qjw2 = null;
                    if (A1A != null) {
                        qjw = new QJW(A1A);
                    } else {
                        qjw = null;
                    }
                    if (A1A2 != null) {
                        qjw2 = new QJW(A1A2);
                    }
                    A04(new QIm(context, A02, qjw, qjw2, null, "FCM", false, false));
                    return A02;
                }
            }
            MarkerEditor A002 = A00(this);
            if (A002 != null) {
                A002.point("received_logging_start");
            }
            int A003 = remoteMessage.A00() - remoteMessage.A01();
            C58450PvY c58450PvY = this.A03;
            if (c58450PvY != null) {
                if (A003 < 0) {
                    str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    str = "0";
                }
                C58450PvY.A00(c58450PvY, A02, "notif_received_push", "FCM", AbstractC06930Yk.A07(AbstractC25230BEn.A1b("priority_lowered", str)));
            }
            MarkerEditor A004 = A00(this);
            if (A004 != null) {
                A004.point("received_logging_end");
            }
            A03(A02, str3);
            this.A06.A00(new C31200Dnj("FCM", 3), A01(A02, A1A, A1A2, "FCM"));
            MarkerEditor A005 = A00(this);
            if (A005 != null) {
                A005.point("received_end");
            }
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(875309620, (short) 2);
                return A02;
            }
        } catch (RjG e) {
            C0K8.A0L("PushProcessor", "Error processing payload: source=%s", e, "FCM");
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(875309620, (short) 3);
            }
        }
        return A02;
    }

    public final void A03(PushInfraMetaData pushInfraMetaData, String str) {
        boolean z;
        C40681ub c40681ub;
        Long l = pushInfraMetaData.A01;
        if (l != null && l.longValue() == 52) {
            z = true;
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                qPLInstance.markerEnd(875301323, (short) 2);
            }
        } else {
            z = false;
        }
        InterfaceC40711ue interfaceC40711ue = this.A02;
        if (interfaceC40711ue != null && (c40681ub = this.A05) != null && str != null) {
            new C58451PvZ(this.A00, interfaceC40711ue, c40681ub).A00(str, z);
        }
    }

    public final void A04(QIm qIm) {
        InterfaceC65541TmF[] interfaceC65541TmFArr;
        String str;
        MarkerEditor A00;
        MarkerEditor A002;
        try {
            InterfaceC02550Ad interfaceC02550Ad = this.A01;
            if (interfaceC02550Ad != null) {
                interfaceC65541TmFArr = new InterfaceC65541TmF[]{new C64123Szl(interfaceC02550Ad), new C64124Szm(this.A00, this.A02, this.A05), C64127Szp.A00, C64128Szq.A00, C64126Szo.A00, C64125Szn.A00};
            } else {
                interfaceC65541TmFArr = new InterfaceC65541TmF[]{C64127Szp.A00, new C64124Szm(this.A00, this.A02, this.A05), C64128Szq.A00, C64126Szo.A00, C64125Szn.A00};
            }
            QIm qIm2 = qIm;
            for (InterfaceC65541TmF interfaceC65541TmF : AbstractC16960so.A1Q(interfaceC65541TmFArr)) {
                if (interfaceC65541TmF.EjA(qIm2)) {
                    MarkerEditor A003 = A00(this);
                    if (A003 != null) {
                        A003.point(AnonymousClass001.A0R(interfaceC65541TmF.Be9(), "_start"));
                    }
                    Object E6A = interfaceC65541TmF.E6A(qIm2);
                    if ((!(E6A instanceof C09540e5)) && (A002 = A00(this)) != null) {
                        A002.point(AnonymousClass001.A0R(interfaceC65541TmF.Be9(), "_end"));
                    }
                    Throwable A004 = C09550e6.A00(E6A);
                    if (A004 != null && (A00 = A00(this)) != null) {
                        A00.point(AnonymousClass001.A0g(interfaceC65541TmF.Be9(), "_failure_", A004.getMessage()));
                    }
                    if (!(E6A instanceof C09540e5)) {
                        qIm2 = (QIm) E6A;
                    }
                    Throwable A005 = C09550e6.A00(E6A);
                    if (A005 != null) {
                        C0K8.A0L("PushProcessor", "The plugin returned an error: %s", A005, interfaceC65541TmF.Be9());
                        this.A06.A01(qIm2.A07, "plugin_error");
                        MarkerEditor A006 = A00(this);
                        if (A006 != null) {
                            A006.annotate("error_from_plugin", A005.getMessage());
                        }
                        MarkerEditor A007 = A00(this);
                        if (A007 != null) {
                            A007.point("received_end_via_plugins");
                        }
                        QuickPerformanceLogger quickPerformanceLogger = this.A04;
                        if (quickPerformanceLogger != null) {
                            quickPerformanceLogger.markerEnd(875309620, (short) 3);
                            return;
                        }
                        return;
                    }
                } else {
                    MarkerEditor A008 = A00(this);
                    if (A008 != null) {
                        A008.point(AnonymousClass001.A0R(interfaceC65541TmF.Be9(), "_skipped"));
                    }
                }
            }
            C31200Dnj c31200Dnj = new C31200Dnj(qIm2.A07, 3);
            InterfaceC65492TlE interfaceC65492TlE = qIm2.A06;
            byte[] bArr = null;
            if (interfaceC65492TlE != null) {
                str = interfaceC65492TlE.CEV();
            } else {
                str = null;
            }
            InterfaceC65492TlE interfaceC65492TlE2 = qIm2.A05;
            if (interfaceC65492TlE2 != null) {
                bArr = interfaceC65492TlE2.CEU();
            }
            this.A06.A00(c31200Dnj, new C45127Jxw(str, bArr, 2));
            MarkerEditor A009 = A00(this);
            if (A009 != null) {
                A009.point("received_end_via_plugins");
            }
            QuickPerformanceLogger quickPerformanceLogger2 = this.A04;
            if (quickPerformanceLogger2 != null) {
                quickPerformanceLogger2.markerEnd(875309620, (short) 2);
            }
        } catch (Throwable th) {
            C0K8.A0G("PushProcessor", "Unexpected error when processing plugin pipeline: %s", th);
            this.A06.A01(qIm.A07, "plugin_pipeline_crash");
            MarkerEditor A0010 = A00(this);
            if (A0010 != null) {
                A0010.annotate("error_from_plugin", th.getMessage());
            }
            MarkerEditor A0011 = A00(this);
            if (A0011 != null) {
                A0011.point("received_end_via_plugins");
            }
            QuickPerformanceLogger quickPerformanceLogger3 = this.A04;
            if (quickPerformanceLogger3 != null) {
                quickPerformanceLogger3.markerEnd(875309620, (short) 3);
            }
        }
    }

    public final byte[] A05(PushInfraMetaData pushInfraMetaData, String str, byte[] bArr) {
        if (bArr != null && C14360o3.A0K(pushInfraMetaData.A02, "zstd")) {
            try {
                MarkerEditor A00 = A00(this);
                if (A00 != null) {
                    A00.point("decompression_start");
                }
                ZstdInputStream zstdInputStream = ZstdInputStream.$redex_init_class;
                ZstdInputStream zstdInputStream2 = new ZstdInputStream(new ByteArrayInputStream(bArr));
                try {
                    byte[] A01 = AbstractC54919OQu.A01(zstdInputStream2);
                    zstdInputStream2.close();
                    MarkerEditor A002 = A00(this);
                    if (A002 != null) {
                        A002.point("decompression_end");
                        return A01;
                    }
                    return A01;
                } finally {
                }
            } catch (Exception e) {
                InterfaceC02550Ad interfaceC02550Ad = this.A01;
                if (interfaceC02550Ad != null) {
                    C58450PvY.A00(new C58450PvY(interfaceC02550Ad), pushInfraMetaData, AbstractC43591JPw.A00(1194), str, AbstractC06930Yk.A07(AbstractC25230BEn.A1b("exception", e.toString())));
                }
                this.A06.A01(str, "decompression_error");
                return null;
            }
        } else {
            return bArr;
        }
    }

    public C58449PvX(Context context, InterfaceC02550Ad interfaceC02550Ad, InterfaceC40711ue interfaceC40711ue, C40681ub c40681ub, C58448PvW c58448PvW) {
        C58450PvY c58450PvY;
        MSZ.A1O(c58448PvW, context);
        this.A06 = c58448PvW;
        this.A05 = c40681ub;
        this.A01 = interfaceC02550Ad;
        this.A00 = context;
        this.A02 = interfaceC40711ue;
        if (interfaceC02550Ad != null) {
            c58450PvY = new C58450PvY(interfaceC02550Ad);
        } else {
            c58450PvY = null;
        }
        this.A03 = c58450PvY;
        this.A04 = QuickPerformanceLoggerProvider.getQPLInstance();
    }
}
