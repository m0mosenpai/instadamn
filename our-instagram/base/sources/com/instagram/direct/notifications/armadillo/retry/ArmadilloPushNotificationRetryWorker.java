package com.instagram.direct.notifications.armadillo.retry;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC1114350h;
import X.AbstractC12290kX;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AnonymousClass001;
import X.C023409i;
import X.C06090Tz;
import X.C09Y;
import X.C0K8;
import X.C1114250g;
import X.C116155Nu;
import X.C132515ya;
import X.C14360o3;
import X.C18U;
import X.C2DG;
import X.C3J1;
import X.C45122Jxr;
import X.C47280Kur;
import X.C48285LYj;
import X.C48532Kv;
import X.C49586Lvf;
import X.C50367MLu;
import X.C51A;
import X.C60J;
import X.JVC;
import X.JVL;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.msys.mca.MailboxFeature;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ArmadilloPushNotificationRetryWorker extends Worker {
    public final int A00;
    public final WorkerParameters A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArmadilloPushNotificationRetryWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        int A06 = AbstractC167007dF.A06(1, context, workerParameters);
        this.A01 = workerParameters;
        this.A00 = workerParameters.A02.A02("max_attempts_count", A06);
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, X.50B] */
    public static final C51A A00(UserSession userSession, ArmadilloPushNotificationRetryWorker armadilloPushNotificationRetryWorker) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        String formatStrLocaleSafe;
        Boolean A0A;
        Boolean A0A2;
        Boolean A0A3;
        if (C18U.A06(C06090Tz.A05, userSession, 36327627958860526L)) {
            Map unmodifiableMap = Collections.unmodifiableMap(armadilloPushNotificationRetryWorker.A01.A02.A00);
            C14360o3.A07(unmodifiableMap);
            HashMap A1G = AbstractC166987dD.A1G();
            Iterator A15 = AbstractC166997dE.A15(unmodifiableMap);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A1G.put(A1K.getKey(), A1K.getValue().toString());
            }
            C14360o3.A0B(AbstractC12290kX.A00, 1);
            Context applicationContext = AbstractC12290kX.A00.getApplicationContext();
            String A0h = AbstractC31171DnF.A0h("su", A1G);
            String str2 = "";
            if (A0h == null) {
                A0h = "";
            }
            SimpleImageUrl A0t = AbstractC25225BEi.A0t(A0h);
            String A0h2 = AbstractC31171DnF.A0h("sn", A1G);
            if (A0h2 == null) {
                A0h2 = "";
            }
            String A0h3 = AbstractC31171DnF.A0h("f", A1G);
            if (A0h3 == null || (str = (String) AbstractC001800i.A0O(AbstractC001900j.A0Q(A0h3, new char[]{'@'}, 0), 0)) == null) {
                str = "0";
            }
            A1G.get("account");
            String A0h4 = AbstractC31171DnF.A0h("thread_igid", A1G);
            if (A0h4 == null) {
                A0h4 = "";
            }
            String A0h5 = AbstractC31171DnF.A0h("armadillo_is_thread_hidden", A1G);
            if (A0h5 != null && (A0A3 = AbstractC001900j.A0A(A0h5)) != null) {
                z = A0A3.booleanValue();
            } else {
                z = false;
            }
            String A0h6 = AbstractC31171DnF.A0h("armadillo_is_thread_muted", A1G);
            if (A0h6 != null && (A0A2 = AbstractC001900j.A0A(A0h6)) != null) {
                z2 = A0A2.booleanValue();
            } else {
                z2 = false;
            }
            String A0h7 = AbstractC31171DnF.A0h("is_silent", A1G);
            if (A0h7 != null && (A0A = AbstractC001900j.A0A(A0h7)) != null) {
                z3 = A0A.booleanValue();
            } else {
                z3 = false;
            }
            C14360o3.A0A(applicationContext);
            String A0u = AbstractC25227BEk.A0u(applicationContext, 2131964154);
            if (A0h4.length() == 0) {
                formatStrLocaleSafe = "direct_inbox_account_switch";
            } else {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("direct_v2?%s=%s", PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0h4);
            }
            String A0h8 = AbstractC31171DnF.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A1G);
            if (A0h8 != null) {
                str2 = A0h8;
            }
            String str3 = userSession.userId;
            C116155Nu c116155Nu = new C116155Nu(new Object(), A0t, Boolean.valueOf(z2), Boolean.valueOf(z), false, "Instagram", A0u, formatStrLocaleSafe, "direct_v2_message", AnonymousClass001.A0R(str2, str3), "direct_v2_generic_new_message", str3, null, str, null, null);
            c116155Nu.A1M = z3;
            if (C14360o3.A0K(A1G.get("is_instamadillo"), RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                c116155Nu.A1S = true;
                c116155Nu.A0i = AbstractC31171DnF.A0h("itt", A1G);
                c116155Nu.A0U = AbstractC31171DnF.A0h("wa_push_id", A1G);
            }
            if (C14360o3.A0K(A1G.get("feature_tags"), "15")) {
                c116155Nu.A05 = new C45122Jxr((Boolean) null, (Boolean) null, (Integer) null, (Long) Long.MAX_VALUE, 0, 30);
            }
            c116155Nu.A1A = str;
            c116155Nu.A19 = A0h2;
            c116155Nu.A0b = A0h2;
            C47280Kur c47280Kur = new C47280Kur();
            c47280Kur.A00 = false;
            c116155Nu.A09 = new C48285LYj(c47280Kur);
            c116155Nu.A0c = String.valueOf(1);
            if (!c116155Nu.A1M && !c116155Nu.A1Q && !c116155Nu.A1P && !C14360o3.A0K(new HashMap(A1G).get("notify"), "0")) {
                C60J.A00(userSession).A08(null, C50367MLu.A01(userSession, 44), true);
                C3J1.A00().A07(c116155Nu, PushChannelType.A0B, userSession, null);
            } else {
                C60J.A00(userSession).A08("generic notification silenced", C50367MLu.A01(userSession, 45), false);
            }
        } else {
            C0K8.A0D("ArmadilloPushNotificationRetryWorker", "skipped showing generic notification");
        }
        return new C51A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.50h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0Jk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.5tM, com.facebook.msys.mca.MailboxFeature] */
    @Override // androidx.work.Worker
    public final AbstractC1114350h doWork() {
        WorkerParameters workerParameters = this.A01;
        C48532Kv c48532Kv = workerParameters.A02;
        String A03 = c48532Kv.A03("recipient_id");
        if (A03 == null) {
            C0K8.A0C("ArmadilloPushNotificationRetryWorker", "Recipient key is required");
        } else {
            C09Y c09y = C023409i.A0A;
            AbstractC18680vv A05 = c09y.A05(this);
            if (A05 instanceof UserSession) {
                UserSession userSession = (UserSession) A05;
                if (AbstractC31171DnF.A1V(userSession, A03)) {
                    int i = this.mWorkerParams.A01;
                    int i2 = this.A00;
                    if (i == i2) {
                        return A00(userSession, this);
                    }
                    C132515ya A00 = C60J.A00(userSession);
                    A00.A02(i2 - this.mWorkerParams.A01, C50367MLu.A01(A05, 42));
                    C2DG.A00(userSession).A0B(true, "NOTIFICATION_RETRY");
                    new MailboxFeature(JVC.A00.A00(userSession)).A00(new JVL(A00, 21), Collections.unmodifiableMap(c48532Kv.A00));
                } else if (c09y.A0A(new Object(), null, new C49586Lvf(this, 1), A03)) {
                    return new C51A();
                }
            }
            int A02 = workerParameters.A02.A02("max_attempts_count", 2);
            int i3 = this.mWorkerParams.A01;
            if (i3 <= A02) {
                C0K8.A0D("ArmadilloPushNotificationRetryWorker", AnonymousClass001.A0X("push notification retrying... (", " of ", ')', i3, A02));
                return new Object();
            }
            C0K8.A0D("ArmadilloPushNotificationRetryWorker", "push notification retry job failed");
        }
        return new C1114250g();
    }
}
