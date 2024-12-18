package X;

import android.content.Context;
import android.os.Build;
import com.facebook.advancedcryptotransport.ACTRegistrationDeviceIdProvider;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.endtoend.EndToEnd;
import com.facebook.messaging.lockbox.LockBoxStorageManager;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.react.modules.intent.IntentModule;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.google.common.util.concurrent.SettableFuture;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.5mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125875mc {
    public static final C125875mc $redex_init_class = null;
    public C6Eh A00;
    public java.util.Set A01;
    public Context A02;
    public C6Eh A03;
    public C6Eh A04;
    public String A05;
    public String A06;
    public final C125815mW A07;
    public final AccountSession A08;
    public final C6AI A09;
    public final C125865mb A0A;
    public final C125855ma A0B;
    public final NotificationCenter A0D;
    public volatile boolean A0E = false;
    public volatile boolean A0F = false;
    public final RealtimeSinceBootClock A0C = RealtimeSinceBootClock.A00;

    public static void A00(C125875mc c125875mc) {
        AccountSession accountSession;
        AccountSession accountSession2;
        AccountSession accountSession3;
        if (c125875mc.A00 != null && (accountSession3 = c125875mc.A08) != null) {
            accountSession3.getSessionedNotificationCenter().removeEveryObserver(c125875mc.A00);
        }
        if (c125875mc.A04 != null && (accountSession2 = c125875mc.A08) != null) {
            accountSession2.getSessionedNotificationCenter().removeEveryObserver(c125875mc.A04);
        }
        if (c125875mc.A03 != null && (accountSession = c125875mc.A08) != null) {
            accountSession.getSessionedNotificationCenter().removeEveryObserver(c125875mc.A03);
        }
    }

    public static void A01(C125875mc c125875mc, C64K c64k, SettableFuture settableFuture) {
        Integer num = c64k.A00;
        if (num == C05F.A0Y || (num == C05F.A0j && c64k.A01 == C05F.A00)) {
            c125875mc.A0F = true;
        }
        settableFuture.set(c64k);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture A02() {
        String str;
        String str2;
        boolean z;
        int i;
        Map A01;
        JSONObject jSONObject;
        String optString;
        C64K c64k;
        final ?? obj = new Object();
        if (this.A0F) {
            c64k = C64K.A06;
        } else if (this.A0E) {
            c64k = C64K.A05;
        } else {
            String A00 = EndToEnd.A00("e2e_android_messenger_wa_sandbox.ports.regfb", false, false);
            if (A00 == null) {
                A00 = "22222";
            }
            String A002 = EndToEnd.A00("e2e_android_messenger_wa_sandbox.protocol.regfb", false, false);
            if (A002 == null) {
                A002 = "http";
            }
            String A003 = EndToEnd.A00("e2e_android_messenger_wa_sandbox.hostname", false, false);
            String A004 = EndToEnd.A00("e2e_android_messenger_wa_sandbox.ports.chatd", false, false);
            int i2 = 0;
            if (A003 != null && A004 != null) {
                i = Integer.parseInt(A004);
                str2 = AnonymousClass001.A13(A002, "://", A003, ":", A00, "/v2/fb_register_v2?");
                str = "mme-test.whatsapp.net";
                z = true;
            } else {
                str = null;
                str2 = null;
                z = false;
                i = 0;
            }
            if (EndToEnd.A00("ig.e2e.e2e_igid", false, false) != null && (A01 = EndToEnd.A01()) != null && (jSONObject = (JSONObject) A01.get("/settings/sandbox/web/sandbox")) != null && (optString = jSONObject.optString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) != null) {
                NetworkUtils.setSandboxDomain(optString);
            }
            this.A0E = true;
            this.A04 = new C6Eh() { // from class: X.69J
                @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
                public final void onNewNotification(String str3, InterfaceC49122Nj interfaceC49122Nj, Map map) {
                    C125875mc c125875mc = C125875mc.this;
                    C125875mc c125875mc2 = C125875mc.$redex_init_class;
                    C6AI c6ai = c125875mc.A09;
                    if (c6ai != null) {
                        c6ai.A00();
                    }
                }
            };
            C125855ma c125855ma = this.A0B;
            this.A03 = new C6Eh() { // from class: X.69K
                @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
                public final void onNewNotification(String str3, InterfaceC49122Nj interfaceC49122Nj, Map map) {
                    Number number;
                    int i3;
                    C42201xA c42201xA;
                    C125875mc c125875mc = C125875mc.this;
                    C125875mc c125875mc2 = C125875mc.$redex_init_class;
                    C6AI c6ai = c125875mc.A09;
                    if (c6ai != null && map != null && (number = (Number) map.get("MEMContextConnectionStateChangeUserInfoKey")) != null) {
                        map.get("MEMContextConnectionStateChangeSourceUserInfoKey");
                        map.get("MEMContextConnectionStateChangeReasonUserInfoKey");
                        int intValue = number.intValue();
                        if (intValue == 2) {
                            map.get("MEMContextConnectionIpAddressesUserInfoKey");
                            map.get("MEMContextConnectionWinnerStreamIpAddressUserInfoKey");
                            map.get("MEMContextConnectionWinnerStreamPortUserInfoKey");
                            map.get("MEMContextConnectionIdUserInfoKey");
                            map.get("MEMContextDNSResolutionMethodUserInfoKey");
                            c6ai.A00 = 2;
                            c6ai.A05 = System.currentTimeMillis();
                            C2FQ c2fq = c6ai.A0G;
                            if (c2fq != null) {
                                C006802i c006802i = c2fq.A02;
                                int i4 = c2fq.A01;
                                int i5 = c2fq.A00;
                                c006802i.markerPoint(i4, i5, "act_connection_end");
                                c006802i.markerPoint(i4, i5, "offline_sync_start");
                            }
                            IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = c6ai.A0H;
                            if (iGFOAMessagingReadyLogger != null) {
                                iGFOAMessagingReadyLogger.onLogActConnectionEnd();
                                iGFOAMessagingReadyLogger.onLogOfflineSyncStart();
                            }
                            c6ai.A0B.accept(Integer.valueOf(c6ai.A00));
                            c6ai.A08 = false;
                            c6ai.A07 = false;
                            c6ai.A02 = -1;
                            c6ai.A0E.accept(false);
                            c6ai.A09.set(true);
                            return;
                        }
                        int i6 = 1;
                        if (intValue == 1) {
                            map.get("MEMContextConnectionTokenReasonUserInfoKey");
                            C2FQ c2fq2 = c6ai.A0G;
                            if (c2fq2 != null) {
                                c2fq2.A02.markerPoint(c2fq2.A01, c2fq2.A00, "act_connection_start");
                            }
                            IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger2 = c6ai.A0H;
                            if (iGFOAMessagingReadyLogger2 != null) {
                                iGFOAMessagingReadyLogger2.onLogActConnectionStart();
                            }
                            c6ai.A00 = 1;
                            c42201xA = c6ai.A0B;
                        } else {
                            if (intValue != 0) {
                                return;
                            }
                            Number number2 = (Number) map.get("MEMContextConnectionFailureCodeUserInfoKey");
                            map.get("MEMContextDisconnectFlagsUserInfoKey");
                            map.get("MEMContextDNSResolutionMethodUserInfoKey");
                            map.get("MEMContextConnectionIpAddressesUserInfoKey");
                            if (number2 != null) {
                                i3 = number2.intValue();
                            } else {
                                i3 = -1;
                            }
                            if (i3 != -1) {
                                C2FQ c2fq3 = c6ai.A0G;
                                if (c2fq3 != null) {
                                    c2fq3.A06("connection_failure_code", String.valueOf(i3));
                                }
                                IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger3 = c6ai.A0H;
                                if (iGFOAMessagingReadyLogger3 != null) {
                                    iGFOAMessagingReadyLogger3.annotateConnectionFailureCode(i3);
                                }
                            }
                            c6ai.A00 = 0;
                            c6ai.A08 = false;
                            c6ai.A07 = false;
                            c6ai.A02 = -1;
                            c6ai.A0E.accept(false);
                            c6ai.A06 = System.currentTimeMillis();
                            c42201xA = c6ai.A0B;
                            i6 = c6ai.A00;
                        }
                        c42201xA.accept(Integer.valueOf(i6));
                    }
                }
            };
            AccountSession accountSession = this.A08;
            if (accountSession != null) {
                accountSession.getSessionedNotificationCenter().addObserver(this.A03, "MEMContextConnectionStateChangeNotification", 5, null);
                accountSession.getSessionedNotificationCenter().addObserver(this.A04, "MEMContextLoginFailureNotRegisteredNotification", 5, null);
            }
            String str3 = Build.MODEL;
            String str4 = "unknown";
            if (str3 == null) {
                str3 = "unknown";
            }
            C125815mW c125815mW = this.A07;
            List list = this.A0A.A00;
            String str5 = Build.MANUFACTURER;
            if (str5 == null) {
                str5 = "unknown";
            }
            String str6 = Build.DISPLAY;
            if (str6 == null) {
                str6 = "unknown";
            }
            String str7 = Build.BOARD;
            if (str7 == null) {
                str7 = "unknown";
            }
            String str8 = Build.VERSION.RELEASE;
            if (str8 != null) {
                str4 = str8;
            }
            Locale locale = Locale.getDefault();
            if (locale == null) {
                locale = AbstractC47137KsW.A00;
            }
            String country = locale.getCountry();
            Locale locale2 = Locale.getDefault();
            if (locale2 == null) {
                locale2 = AbstractC47137KsW.A00;
            }
            String language = locale2.getLanguage();
            boolean z2 = c125855ma.A04;
            boolean z3 = c125855ma.A05;
            boolean z4 = true;
            if (!z) {
                z4 = false;
            }
            if (str == null) {
                str = null;
            }
            boolean isRunningEndToEndTest = EndToEnd.isRunningEndToEndTest();
            String str9 = c125855ma.A03;
            String str10 = c125855ma.A02;
            Integer valueOf = Integer.valueOf(i);
            java.util.Set set = this.A01;
            if (!C0JA.A00().A04()) {
                i2 = 4;
            }
            Integer valueOf2 = Integer.valueOf(i2);
            String str11 = this.A05;
            Long valueOf3 = Long.valueOf(c125855ma.A00);
            boolean z5 = c125855ma.A07;
            boolean z6 = c125855ma.A06;
            String str12 = this.A06;
            Integer valueOf4 = Integer.valueOf(c125855ma.A01);
            MailboxCallback mailboxCallback = new MailboxCallback() { // from class: X.69L
                @Override // com.facebook.msys.mca.MailboxCallback
                public final /* bridge */ /* synthetic */ void onCompletion(Object obj2) {
                    C125875mc c125875mc;
                    SettableFuture settableFuture;
                    C64K c64k2;
                    Object obj3 = ((MailboxNullable) obj2).value;
                    if (obj3 == null) {
                        C0K8.A0D("AdvancedCryptoTransport", "Login type is not returned");
                    } else {
                        if ("PREVIOUSLY_REGISTERED".equals(obj3)) {
                            c125875mc = C125875mc.this;
                            settableFuture = obj;
                            c64k2 = C64K.A06;
                        } else if ("NEW_REGISTRATION_HAPPENED".equals(obj3)) {
                            c125875mc = C125875mc.this;
                            settableFuture = obj;
                            C125875mc c125875mc2 = C125875mc.$redex_init_class;
                            c125875mc.A00 = new LVP(c125875mc, settableFuture);
                            AccountSession accountSession2 = c125875mc.A08;
                            if (accountSession2 == null) {
                                C0K8.A0C("AdvancedCryptoTransport", "Failed to get msys account session");
                                c64k2 = C64K.A08;
                            } else {
                                SessionedNotificationCenter sessionedNotificationCenter = accountSession2.getSessionedNotificationCenter();
                                C6Eh c6Eh = c125875mc.A00;
                                c6Eh.getClass();
                                sessionedNotificationCenter.addObserver(c6Eh, "MCAMailboxAdvancedCryptoTransportDidRegistrationNotification", 1, null);
                                return;
                            }
                        } else if ("ALREADY_LOGGED_IN".equals(obj3)) {
                            c125875mc = C125875mc.this;
                            settableFuture = obj;
                            c64k2 = C64K.A05;
                        } else if (MessageAvailabilityResponseId$Companion.NOT_SUPPORTED.equals(obj3)) {
                            c125875mc = C125875mc.this;
                            settableFuture = obj;
                            c64k2 = C64K.A04;
                        } else if ("MAILBOX_INVALID".equals(obj3)) {
                            c125875mc = C125875mc.this;
                            settableFuture = obj;
                            c64k2 = C64K.A03;
                        } else if ("USING_MEM_LOGIN".equals(obj3)) {
                            c125875mc = C125875mc.this;
                            settableFuture = obj;
                            c64k2 = C64K.A0A;
                        }
                        C125875mc.A01(c125875mc, c64k2, settableFuture);
                    }
                    c125875mc = C125875mc.this;
                    settableFuture = obj;
                    c64k2 = C64K.A02;
                    C125875mc.A01(c125875mc, c64k2, settableFuture);
                }
            };
            InterfaceExecutorC135866Co ASj = c125815mW.mMailboxApiHandleMetaProvider.ASj(2);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
            mailboxFutureImpl.Ecq(mailboxCallback);
            if (!ASj.ELJ(new C1340263k(c125815mW, mailboxFutureImpl, 11, 0L, valueOf, valueOf2, valueOf3, valueOf4, str5, str3, str6, str7, str4, country, language, str, str9, str10, A003, str2, str11, str12, list, set, z2, z3, z, z4, isRunningEndToEndTest, z5, z6))) {
                mailboxFutureImpl.cancel(false);
                return obj;
            }
            return obj;
        }
        A01(this, c64k, obj);
        return obj;
    }

    static {
        C9AD.A00();
    }

    public C125875mc(Context context, C125865mb c125865mb, C125855ma c125855ma, C125815mW c125815mW, AccountSession accountSession, NotificationCenter notificationCenter, C6AI c6ai, String str, String str2) {
        this.A08 = accountSession;
        this.A0A = c125865mb;
        this.A0B = c125855ma;
        this.A07 = c125815mW;
        this.A0D = notificationCenter;
        this.A09 = c6ai;
        synchronized (C125885md.class) {
            if (C125885md.A00 == null) {
                C1U5 c1u5 = new C1U5(context);
                c1u5.A00 = 1;
                C125885md.A00 = c1u5.A00().A00("AdvancedCryptoTransportPrefs");
            }
        }
        ACTRegistrationDeviceIdProvider.initialize(context);
        PlatformStorageProvider.initialize(context);
        LockBoxStorageManager.initialize(context);
        this.A02 = context;
        this.A05 = str;
        this.A06 = str2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture A03() {
        A00(this);
        final ?? obj = new Object();
        C125815mW c125815mW = this.A07;
        MailboxCallback mailboxCallback = new MailboxCallback() { // from class: X.8w6
            @Override // com.facebook.msys.mca.MailboxCallback
            public final /* bridge */ /* synthetic */ void onCompletion(Object obj2) {
                obj.set(Boolean.TRUE);
                C125875mc c125875mc = C125875mc.this;
                C125875mc c125875mc2 = C125875mc.$redex_init_class;
                c125875mc.A0E = false;
                c125875mc.A0F = false;
            }
        };
        InterfaceExecutorC135866Co ASj = c125815mW.mMailboxApiHandleMetaProvider.ASj(2);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
        mailboxFutureImpl.Ecq(mailboxCallback);
        if (!ASj.ELJ(new C201778w7(c125815mW, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        return obj;
    }
}
