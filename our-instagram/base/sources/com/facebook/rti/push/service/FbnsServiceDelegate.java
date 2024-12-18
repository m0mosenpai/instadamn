package com.facebook.rti.push.service;

import X.AG7;
import X.AbstractC19560xi;
import X.AbstractC58317Pt9;
import X.AbstractC62178S0z;
import X.AbstractC62803SRx;
import X.AbstractC64515THi;
import X.AbstractServiceC19690xx;
import X.AnonymousClass001;
import X.C04750Mt;
import X.C05F;
import X.C0K8;
import X.C14360o3;
import X.C3UY;
import X.C3V1;
import X.C3V2;
import X.C3VA;
import X.C42Y;
import X.C4N7;
import X.C4N8;
import X.C60546R6j;
import X.C60547R6k;
import X.C60560R6z;
import X.C61551RpW;
import X.C62485SDm;
import X.C62711SMz;
import X.C62912SWt;
import X.C63211SfG;
import X.C63302Sh6;
import X.C74123Uq;
import X.C91M;
import X.EnumC74133Ur;
import X.InterfaceC127765q1;
import X.InterfaceC65369Tj1;
import X.InterfaceC65370Tj2;
import X.RhR;
import X.S12;
import X.SJ0;
import X.SNI;
import X.SOA;
import X.SZ0;
import X.Sh7;
import X.T10;
import X.T11;
import X.T1M;
import X.T1U;
import X.T1Y;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.push.fbns.ipc.IFbnsAIDLService;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.rti.mqtt.manager.MqttPushServiceDelegate;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FbnsServiceDelegate extends MqttPushServiceDelegate {
    public static FbnsServiceDelegate A0E;
    public static final List A0F;
    public static final List A0G;
    public static final Map A0H;
    public IFbnsAIDLService.Stub A00;
    public C3VA A01;
    public SOA A02;
    public T11 A03;
    public C63211SfG A04;
    public C62711SMz A05;
    public C61551RpW A06;
    public Sh7 A07;
    public SNI A08;
    public String A09;
    public Map A0A;
    public final InterfaceC65369Tj1 A0B;
    public final C62912SWt A0C;
    public final Object A0D;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x053e A[Catch: JSONException -> 0x0778, TryCatch #4 {JSONException -> 0x0778, blocks: (B:8:0x0018, B:9:0x0023, B:11:0x002b, B:13:0x0037, B:15:0x003f, B:17:0x0067, B:19:0x0071, B:21:0x00b1, B:23:0x00b9, B:25:0x00d8, B:27:0x011e, B:30:0x0137, B:32:0x014d, B:33:0x0160, B:36:0x016a, B:38:0x017c, B:40:0x019a, B:42:0x01a2, B:43:0x01a7, B:45:0x01b9, B:47:0x01dc, B:49:0x01e4, B:52:0x01f9, B:53:0x008b, B:55:0x0093, B:58:0x0208, B:60:0x024d, B:62:0x0253, B:63:0x0263, B:69:0x0287, B:71:0x0297, B:72:0x02a9, B:74:0x02b1, B:75:0x02c3, B:77:0x02cb, B:79:0x02d1, B:80:0x02d5, B:82:0x02db, B:86:0x02f2, B:89:0x030b, B:91:0x0323, B:92:0x032f, B:94:0x0357, B:95:0x0363, B:101:0x037c, B:104:0x035e, B:107:0x032a, B:110:0x038e, B:113:0x0399, B:114:0x03b3, B:117:0x03d7, B:119:0x040e, B:121:0x041b, B:123:0x0434, B:124:0x043f, B:126:0x044e, B:128:0x0456, B:129:0x04b6, B:130:0x0459, B:132:0x0463, B:134:0x0478, B:135:0x04ad, B:141:0x04cf, B:143:0x04e1, B:145:0x04ea, B:146:0x04f1, B:148:0x04f7, B:149:0x04fe, B:151:0x0504, B:152:0x050f, B:154:0x0517, B:155:0x052f, B:156:0x0536, B:158:0x053e, B:159:0x0542, B:161:0x0547, B:162:0x055e, B:178:0x05a6, B:180:0x05aa, B:181:0x05b8, B:183:0x05c2, B:184:0x05e5, B:186:0x05ef, B:187:0x05f2, B:223:0x0604, B:226:0x061c, B:235:0x065a, B:236:0x065b, B:237:0x065f, B:245:0x068a, B:208:0x0721, B:210:0x072f, B:211:0x0734, B:213:0x073a, B:215:0x0747, B:248:0x068e, B:253:0x0692, B:252:0x0691, B:254:0x0610, B:189:0x0696, B:191:0x069b, B:195:0x06b5, B:196:0x06d0, B:205:0x06f6, B:207:0x06fa, B:275:0x0777, B:221:0x06a9, B:256:0x075f, B:258:0x0765, B:261:0x075b, B:262:0x04c9, B:263:0x04c2, B:264:0x03cb, B:267:0x0285, B:268:0x0282, B:274:0x0770), top: B:7:0x0018, inners: #1, #3, #5, #6, #7, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05a6 A[Catch: JSONException -> 0x0778, TryCatch #4 {JSONException -> 0x0778, blocks: (B:8:0x0018, B:9:0x0023, B:11:0x002b, B:13:0x0037, B:15:0x003f, B:17:0x0067, B:19:0x0071, B:21:0x00b1, B:23:0x00b9, B:25:0x00d8, B:27:0x011e, B:30:0x0137, B:32:0x014d, B:33:0x0160, B:36:0x016a, B:38:0x017c, B:40:0x019a, B:42:0x01a2, B:43:0x01a7, B:45:0x01b9, B:47:0x01dc, B:49:0x01e4, B:52:0x01f9, B:53:0x008b, B:55:0x0093, B:58:0x0208, B:60:0x024d, B:62:0x0253, B:63:0x0263, B:69:0x0287, B:71:0x0297, B:72:0x02a9, B:74:0x02b1, B:75:0x02c3, B:77:0x02cb, B:79:0x02d1, B:80:0x02d5, B:82:0x02db, B:86:0x02f2, B:89:0x030b, B:91:0x0323, B:92:0x032f, B:94:0x0357, B:95:0x0363, B:101:0x037c, B:104:0x035e, B:107:0x032a, B:110:0x038e, B:113:0x0399, B:114:0x03b3, B:117:0x03d7, B:119:0x040e, B:121:0x041b, B:123:0x0434, B:124:0x043f, B:126:0x044e, B:128:0x0456, B:129:0x04b6, B:130:0x0459, B:132:0x0463, B:134:0x0478, B:135:0x04ad, B:141:0x04cf, B:143:0x04e1, B:145:0x04ea, B:146:0x04f1, B:148:0x04f7, B:149:0x04fe, B:151:0x0504, B:152:0x050f, B:154:0x0517, B:155:0x052f, B:156:0x0536, B:158:0x053e, B:159:0x0542, B:161:0x0547, B:162:0x055e, B:178:0x05a6, B:180:0x05aa, B:181:0x05b8, B:183:0x05c2, B:184:0x05e5, B:186:0x05ef, B:187:0x05f2, B:223:0x0604, B:226:0x061c, B:235:0x065a, B:236:0x065b, B:237:0x065f, B:245:0x068a, B:208:0x0721, B:210:0x072f, B:211:0x0734, B:213:0x073a, B:215:0x0747, B:248:0x068e, B:253:0x0692, B:252:0x0691, B:254:0x0610, B:189:0x0696, B:191:0x069b, B:195:0x06b5, B:196:0x06d0, B:205:0x06f6, B:207:0x06fa, B:275:0x0777, B:221:0x06a9, B:256:0x075f, B:258:0x0765, B:261:0x075b, B:262:0x04c9, B:263:0x04c2, B:264:0x03cb, B:267:0x0285, B:268:0x0282, B:274:0x0770), top: B:7:0x0018, inners: #1, #3, #5, #6, #7, #10 }] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.42X] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.IllegalStateException] */
    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0R(X.C62830STc r48, java.lang.Long r49, java.lang.String r50, byte[] r51, int r52, long r53) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A0R(X.STc, java.lang.Long, java.lang.String, byte[], int, long):void");
    }

    public final synchronized void A0d(ArrayList arrayList) {
        Iterator it = this.A07.A04().iterator();
        while (it.hasNext()) {
            arrayList.add(((SZ0) it.next()).A02);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A0H = hashMap;
        hashMap.put("com.instagram.android", 30);
        hashMap.put("com.facebook.lite", 100);
        hashMap.put("com.oculus.horizon", 10);
        A0F = new ArrayList<SubscribeTopic>() { // from class: X.3V7
            {
                add(new SubscribeTopic("/fbns_msg", 1));
            }
        };
        A0G = new ArrayList<SubscribeTopic>() { // from class: X.3V9
            {
                add(new SubscribeTopic("/fbns_reg_resp", 1));
                addAll(FbnsServiceDelegate.A0F);
            }
        };
    }

    public static void A01(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3) {
        fbnsServiceDelegate.A05.A00(str);
        Intent intent = new Intent("com.facebook.rti.fbns.intent.RECEIVE");
        intent.setPackage(str);
        intent.addCategory(str);
        intent.putExtra("receive_type", "registered");
        if (str2 != null) {
            intent.putExtra("data", str2);
        }
        intent.putExtra("push_renew_trigger", str3);
        fbnsServiceDelegate.A0X(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.R6h, X.Sh6, java.lang.Object] */
    public static void A02(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3, String str4, Map map) {
        String str5 = str2;
        fbnsServiceDelegate.A08.A01("registrations", new String[]{str, str5}, 1L);
        SOA soa = fbnsServiceDelegate.A02;
        long j = ((MqttPushServiceDelegate) fbnsServiceDelegate).A00;
        boolean A00 = ((MqttPushServiceDelegate) fbnsServiceDelegate).A07.A00();
        long j2 = ((MqttPushServiceDelegate) fbnsServiceDelegate).A07.A03.get();
        C4N8 c4n8 = soa.A02;
        EnumC74133Ur[] enumC74133UrArr = EnumC74133Ur.A02;
        boolean z = ((C4N7) c4n8).getBoolean("is_employee", false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - soa.A00;
        long j4 = elapsedRealtime - j;
        long j5 = elapsedRealtime - soa.A04.A06.get();
        long j6 = elapsedRealtime - j2;
        if (j2 < 0) {
            j6 = 0;
        }
        ?? c63302Sh6 = new C63302Sh6("fbns_push_registration_lifecycle", soa.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        c63302Sh6.A08 = str;
        if (str5 == null) {
            str5 = "";
        }
        c63302Sh6.A07 = str5;
        c63302Sh6.A05 = str4;
        c63302Sh6.A00 = elapsedRealtime;
        c63302Sh6.A04 = j3;
        c63302Sh6.A01 = j4;
        c63302Sh6.A02 = j5;
        c63302Sh6.A03 = j6;
        c63302Sh6.A0A = A00;
        c63302Sh6.A06 = str3;
        c63302Sh6.A09 = z;
        c63302Sh6.A03(map);
        c63302Sh6.toString();
        soa.A01.reportEvent(c63302Sh6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.R6i, X.Sh6, java.lang.Object] */
    public static void A03(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, String str3, String str4, Map map, long j) {
        fbnsServiceDelegate.A08.A01("notifications", new String[]{str, str3}, 1L);
        SOA soa = fbnsServiceDelegate.A02;
        long j2 = ((MqttPushServiceDelegate) fbnsServiceDelegate).A00;
        boolean A00 = ((MqttPushServiceDelegate) fbnsServiceDelegate).A07.A00();
        long j3 = ((MqttPushServiceDelegate) fbnsServiceDelegate).A07.A03.get();
        C4N8 c4n8 = soa.A02;
        EnumC74133Ur[] enumC74133UrArr = EnumC74133Ur.A02;
        boolean z = ((C4N7) c4n8).getBoolean("is_employee", false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - soa.A00;
        long j5 = elapsedRealtime - j2;
        long j6 = elapsedRealtime - soa.A04.A06.get();
        long j7 = elapsedRealtime - j3;
        if (j3 < 0) {
            j7 = 0;
        }
        ?? c63302Sh6 = new C63302Sh6("fbns_push_notification_lifecycle", soa.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        c63302Sh6.A08 = str;
        c63302Sh6.A07 = str3;
        c63302Sh6.A09 = str2;
        c63302Sh6.A01 = elapsedRealtime;
        c63302Sh6.A05 = j4;
        c63302Sh6.A02 = j5;
        c63302Sh6.A03 = j6;
        c63302Sh6.A04 = j7;
        c63302Sh6.A0B = A00;
        c63302Sh6.A06 = str4;
        c63302Sh6.A00 = j;
        c63302Sh6.A0A = z;
        c63302Sh6.A03(map);
        c63302Sh6.toString();
        soa.A01.reportEvent(c63302Sh6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r0.A00() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A04(java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r15 = this;
            X.SNI r4 = r15.A08
            r5 = r16
            r6 = r17
            if (r4 == 0) goto L20
            X.0xx r0 = r15.A01
            android.content.Context r0 = r0.getApplicationContext()
            X.C14360o3.A07(r0)
            java.lang.String r0 = r0.getPackageName()
            java.lang.String[] r3 = new java.lang.String[]{r5, r0, r6}
            java.lang.String r2 = "services"
            r0 = 1
            r4.A01(r2, r3, r0)
        L20:
            X.SOA r4 = r15.A02
            if (r4 == 0) goto L48
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.A0B
            boolean r13 = r0.get()
            long r9 = r15.A00
            X.SZ6 r0 = r15.A07
            if (r0 == 0) goto L37
            boolean r0 = r0.A00()
            r14 = 1
            if (r0 != 0) goto L38
        L37:
            r14 = 0
        L38:
            X.SZ6 r0 = r15.A07
            if (r0 == 0) goto L49
            java.util.concurrent.atomic.AtomicLong r0 = r0.A03
            long r11 = r0.get()
        L42:
            r8 = 0
            r7 = r18
            r4.A01(r5, r6, r7, r8, r9, r11, r13, r14)
        L48:
            return
        L49:
            r11 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A04(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.AbstractC19560xi
    public final IBinder A0B(Intent intent) {
        intent.toString();
        A04("bind", intent.getAction(), intent.getStringExtra("caller"));
        T10 t10 = new T10(intent, this.A01, "fbns_aidl_auth_domain");
        String A00 = C3VA.A00(intent);
        if (!t10.Cfc()) {
            C0K8.A0O("FbnsServiceDelegate", "onBind invalid signature: %s", intent.toString());
            HashMap hashMap = new HashMap();
            Context applicationContext = ((AbstractC19560xi) this).A01.getApplicationContext();
            C14360o3.A07(applicationContext);
            hashMap.put("cntr", applicationContext.getPackageName());
            hashMap.put("clr", A00);
            C3VA c3va = this.A01;
            int i = 0;
            if (A00 != null) {
                try {
                    PackageManager packageManager = c3va.A00.getPackageManager();
                    if (packageManager != null) {
                        i = Integer.parseInt(packageManager.getPackageInfo(A00, 0).versionName.split("\\.", 2)[0]);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    C0K8.A0F("FbnsSecurityContextHelper", "requested package not found on the device", e);
                } catch (NumberFormatException e2) {
                    C0K8.A0L("FbnsSecurityContextHelper", "Failed to parse major version for package: %s", e2, A00);
                }
            }
            hashMap.put("ver", String.valueOf(i));
            SOA soa = this.A02;
            boolean z = super.A0B.get();
            soa.A01("bind", "TRUSTED_APP_AUTH_INVALID", intent.getAction(), hashMap, ((MqttPushServiceDelegate) this).A00, super.A07.A03.get(), z, super.A07.A00());
            this.A08.A01("fbns_ipc_auth", new String[]{"unauthorized", "secure", A00, intent.getAction()}, 1L);
            return null;
        }
        this.A08.A01("fbns_ipc_auth", new String[]{"authorised", "secure", A00, intent.getAction()}, 1L);
        return this.A00;
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate, com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public final void A0J(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            printWriter.println(AnonymousClass001.A0g("[ ", "FbnsServiceDelegate", " ]"));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Context applicationContext = ((AbstractC19560xi) this).A01.getApplicationContext();
            C14360o3.A07(applicationContext);
            C3V2.A01(applicationContext, arrayList, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            A0d(arrayList3);
            StringBuilder sb = new StringBuilder();
            sb.append("validCompatibleApps=");
            sb.append(arrayList);
            printWriter.println(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("enabledCompatibleApps=");
            sb2.append(arrayList2);
            printWriter.println(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("registeredApps=");
            sb3.append(arrayList3);
            printWriter.println(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("notificationCounter=");
            sb4.append(super.A05.A02);
            printWriter.println(sb4.toString());
        } catch (Exception unused) {
        }
        super.A0J(fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public final void A0S(C3V1 c3v1, Integer num) {
        A04("start", S12.A00(num), c3v1.A03);
        super.A0S(c3v1, num);
    }

    public final AG7 A0V(String str) {
        AG7 ag7;
        synchronized (this.A0D) {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str) || !hashMap.containsKey(str)) {
                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            }
            Map map = this.A0A;
            if (map.containsKey(str)) {
                ag7 = (AG7) map.get(str);
            } else {
                ag7 = new AG7();
                map.put(str, ag7);
            }
        }
        return ag7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x014f, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0W(android.content.Intent r16) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.push.service.FbnsServiceDelegate.A0W(android.content.Intent):void");
    }

    public final void A0Y(C62485SDm c62485SDm, SJ0 sj0, String str, String str2) {
        AbstractC64515THi c60547R6k;
        AbstractC64515THi abstractC64515THi = sj0.A01;
        AbstractC64515THi abstractC64515THi2 = sj0.A03;
        String obj = c62485SDm.toString();
        long j = sj0.A00;
        if (abstractC64515THi2 instanceof C60546R6j) {
            c60547R6k = C60546R6j.A00;
        } else {
            Long valueOf = Long.valueOf(System.currentTimeMillis() - ((Number) abstractC64515THi2.A01()).longValue());
            valueOf.getClass();
            c60547R6k = new C60547R6k(valueOf);
        }
        String str3 = sj0.A06;
        this.A03.Chw(AnonymousClass001.A0R("Error: Fail to deliver notifId = ", str));
        if (!(c60547R6k instanceof C60546R6j)) {
            SNI sni = this.A08;
            Context applicationContext = ((AbstractC19560xi) this).A01.getApplicationContext();
            C14360o3.A07(applicationContext);
            sni.A01("fbns_e2e_latency", new String[]{"discard", applicationContext.getPackageName(), str2}, ((Number) c60547R6k.A01()).longValue());
        }
        SNI sni2 = this.A08;
        Context applicationContext2 = ((AbstractC19560xi) this).A01.getApplicationContext();
        C14360o3.A07(applicationContext2);
        sni2.A01("fbns_latency", new String[]{"discard", applicationContext2.getPackageName(), str2}, j);
        HashMap hashMap = new HashMap();
        if (!(abstractC64515THi instanceof C60546R6j)) {
            hashMap.put("l", String.valueOf(abstractC64515THi.A01()));
        }
        hashMap.put("src", str3);
        A03(this, "discard", str, str2, obj, hashMap, j);
    }

    public final void A0a(SJ0 sj0, String str, String str2) {
        AbstractC64515THi abstractC64515THi = sj0.A01;
        AbstractC64515THi abstractC64515THi2 = sj0.A03;
        SNI sni = this.A08;
        AbstractServiceC19690xx abstractServiceC19690xx = ((AbstractC19560xi) this).A01;
        Context applicationContext = abstractServiceC19690xx.getApplicationContext();
        C14360o3.A07(applicationContext);
        String packageName = applicationContext.getPackageName();
        long j = sj0.A00;
        sni.A01("fbns_latency", new String[]{"acknowledge", packageName, str2}, j);
        if (!(abstractC64515THi2 instanceof C60546R6j)) {
            Long valueOf = Long.valueOf(System.currentTimeMillis() - ((Number) abstractC64515THi2.A01()).longValue());
            valueOf.getClass();
            C60547R6k c60547R6k = new C60547R6k(valueOf);
            SNI sni2 = this.A08;
            Context applicationContext2 = abstractServiceC19690xx.getApplicationContext();
            C14360o3.A07(applicationContext2);
            sni2.A01("fbns_e2e_latency", new String[]{"acknowledge", applicationContext2.getPackageName(), str2}, ((Number) c60547R6k.A01()).longValue());
        }
        this.A03.Chw(AnonymousClass001.A12("ACK from ", str2, ": notifId = ", str, "; delay = ", j));
        HashMap hashMap = new HashMap();
        if (!(abstractC64515THi instanceof C60546R6j)) {
            hashMap.put("l", String.valueOf(abstractC64515THi.A01()));
        }
        hashMap.put("src", sj0.A06);
        A03(this, "acknowledge", str, str2, null, hashMap, j);
    }

    public final void A0b(String str, String str2) {
        this.A08.A01("ack_failures", new String[]{str, str2}, 1L);
    }

    public final void A0c(String str, String str2) {
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                C62711SMz c62711SMz = this.A05;
                C4N7 c4n7 = (C4N7) c62711SMz.A04;
                C14360o3.A0B(str, 0);
                long j = c4n7.getLong(str, 120000L);
                String A00 = AbstractC58317Pt9.A00(560);
                Intent intent = new Intent("com.facebook.rti.fbns.intent.REGISTER_RETRY");
                intent.putExtra("pkg_name", str);
                intent.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str2);
                c62711SMz.A02.A02(intent);
                C04750Mt c04750Mt = new C04750Mt();
                Context context = c62711SMz.A01;
                c04750Mt.A0B(intent, context.getClassLoader());
                c04750Mt.A09();
                c04750Mt.A08 = c62711SMz.A09;
                PendingIntent A03 = c04750Mt.A03(context, 0, 134217728);
                c62711SMz.A08.put(str, A03);
                c62711SMz.A06.A04(context, c62711SMz.A00, 2, SystemClock.elapsedRealtime() + j, A03);
                long j2 = j * 2;
                if (j2 > 86400000) {
                    j2 = 86400000;
                }
                C91M ARA = c62711SMz.A04.ARA();
                ARA.E7E(str, j2);
                ARA.AIb(A00, "PreferencesManager failed to store backOffTimeMs");
            } catch (Exception e) {
                C0K8.A0G("FbnsServiceDelegate", "service/register_retry/schedule_failed", e);
                A02(this, "reg_retry_schedule_fail", str, str2, e.getMessage(), hashMap);
            }
            Sh7 sh7 = this.A07;
            AbstractC62803SRx.A00(!TextUtils.isEmpty(str));
            AbstractC62803SRx.A00(!TextUtils.isEmpty(str2));
            SZ0 sz0 = new SZ0();
            sz0.A02 = str;
            sz0.A01 = str2;
            sz0.A00 = Long.valueOf(System.currentTimeMillis());
            Sh7.A02(Sh7.A01(sh7), sz0, str);
            Context applicationContext = ((AbstractC19560xi) this).A01.getApplicationContext();
            C14360o3.A07(applicationContext);
            if (AbstractC62178S0z.A00(applicationContext)) {
                super.A0A.A0T.C9A();
                throw null;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("pkg_name", str);
                jSONObject.putOpt(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str2);
                String obj = jSONObject.toString();
                try {
                    try {
                    } catch (UnsupportedEncodingException unused) {
                        throw new RuntimeException("UTF-8 not supported");
                    }
                } catch (C42Y unused2) {
                }
                if (super.A09.A04(new T1U(this, str, str2, hashMap), C05F.A01, AbstractC58317Pt9.A00(443), obj.getBytes(ReactWebViewManager.HTML_ENCODING)) == -1) {
                    str3 = "reg_fail";
                    str4 = "mqtt not connected";
                } else {
                    return;
                }
            } catch (JSONException e2) {
                C0K8.A0G("FbnsServiceDelegate", "service/register/serialize_exception", e2);
                A02(this, "reg_fail", str, str2, "serialization exception: unknown client", hashMap);
                return;
            }
        } else {
            str3 = "reg_fail";
            str4 = "invalid input";
        }
        A02(this, str3, str, str2, str4, hashMap);
    }

    public FbnsServiceDelegate(AbstractServiceC19690xx abstractServiceC19690xx) {
        super(abstractServiceC19690xx);
        this.A0D = new Object();
        this.A0A = new HashMap();
        C62912SWt c62912SWt = new C62912SWt();
        this.A0C = c62912SWt;
        this.A0B = new T1M(c62912SWt);
    }

    public static String A00(String str) {
        if (C3V2.A02(str)) {
            return ((C74123Uq) C3UY.A00).A03;
        }
        return FbnsService.class.getName();
    }

    @Override // X.AbstractC19560xi
    public final void A0D(Intent intent) {
        A04("rebind", intent.getAction(), intent.getStringExtra("caller"));
        super.A0D(intent);
    }

    @Override // X.AbstractC19560xi
    public final boolean A0E(Intent intent) {
        A04("unbind", intent.getAction(), intent.getStringExtra("caller"));
        return super.A0E(intent);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate, com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public final void A0H() {
        super.A0H();
        if (A0E == this) {
            A0E = null;
        }
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public final C3V1 A0K(Intent intent, int i, int i2) {
        return super.A0K(intent, i, i2);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public final Future A0L(RhR rhR) {
        A04("stop", rhR.toString(), null);
        return super.A0L(rhR);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public final void A0M() {
        super.A0M();
        super.A05.A0I = "S";
    }

    @Override // com.facebook.rti.mqtt.manager.MqttPushServiceDelegate
    public final void A0N() {
        super.A0N();
        C60560R6z c60560R6z = (C60560R6z) super.A0A;
        Sh7 sh7 = c60560R6z.A03;
        SOA soa = c60560R6z.A01;
        C62711SMz c62711SMz = c60560R6z.A02;
        C3VA c3va = c60560R6z.A00;
        C63211SfG c63211SfG = new C63211SfG(c3va, c60560R6z.A05, this, new HashMap());
        Context applicationContext = ((AbstractC19560xi) this).A01.getApplicationContext();
        C14360o3.A07(applicationContext);
        FbnsAIDLService fbnsAIDLService = new FbnsAIDLService(applicationContext, new T1Y(this), this.A03);
        this.A07 = sh7;
        this.A02 = soa;
        this.A05 = c62711SMz;
        this.A01 = c3va;
        this.A04 = c63211SfG;
        this.A00 = fbnsAIDLService;
    }

    public final AbstractC64515THi A0U(String str, String str2) {
        AbstractC64515THi abstractC64515THi;
        AG7 A0V = A0V(str2);
        synchronized (AG7.A02) {
            SJ0 sj0 = (SJ0) A0V.A00.remove(str);
            if (sj0 != null) {
                abstractC64515THi = new C60547R6k(sj0);
            } else {
                abstractC64515THi = C60546R6j.A00;
            }
        }
        return abstractC64515THi;
    }

    public final void A0X(Intent intent) {
        final String str = intent.getPackage();
        if (!TextUtils.isEmpty(str)) {
            C3VA c3va = this.A01;
            C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
            InterfaceC127765q1 A01 = c74123Uq.A01(intent, c3va);
            Context applicationContext = ((AbstractC19560xi) this).A01.getApplicationContext();
            C14360o3.A07(applicationContext);
            if (!str.equals(applicationContext.getPackageName()) && !A01.Cfa()) {
                this.A07.A06(new InterfaceC65370Tj2() { // from class: X.T1a
                    @Override // X.InterfaceC65370Tj2
                    public final void Cwz(String str2) {
                        FbnsServiceDelegate.A02(FbnsServiceDelegate.this, "invalid_receiver", str, str2, null, Collections.emptyMap());
                        C0K8.A0D("FbnsServiceDelegate", "service/sendFBNSBroadcast/invalid_receiver");
                    }
                }, str);
                return;
            }
            c3va.A02(intent);
            intent.setPackage(str);
            if (!c74123Uq.A01(intent, c3va).Cfa()) {
                return;
            }
            c3va.A01.A08(c3va.A00, intent);
        }
    }

    public final void A0Z(AbstractC64515THi abstractC64515THi, String str, String str2, String str3, String str4, String str5) {
        if (!TextUtils.isEmpty(str4)) {
            this.A03.Chw(str4);
        }
        HashMap hashMap = new HashMap();
        if (!(abstractC64515THi instanceof C60546R6j)) {
            hashMap.put("l", String.valueOf(abstractC64515THi.A01()));
        }
        hashMap.put("src", str5);
        A03(this, RealtimeConstants.SEND_FAIL, str3, str, str2, hashMap, 0L);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate, X.AbstractC19560xi
    public final void A0C() {
        super.A0C();
    }
}
