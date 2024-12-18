package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.push.FbnsInitBroadcastReceiver;

/* renamed from: X.3UO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UO implements C3UN {
    public C1WZ A00;
    public FbnsInitBroadcastReceiver A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final C3US A06;
    public final C3UN A08;
    public final InterfaceC12870lZ A07 = new C3UP(this);
    public final String A09 = "567067343352427";

    public C3UO(Context context, C3UN c3un) {
        this.A05 = context;
        this.A08 = c3un;
        this.A06 = new C3US(context, new C3UR(this));
        this.A04 = C3UT.A00(context);
    }

    @Override // X.C3UN
    public final PushChannelType B4M() {
        C3UN c3un;
        if (this.A04 && (c3un = this.A08) != null) {
            return c3un.BjD();
        }
        return PushChannelType.A0D;
    }

    @Override // X.C3UN
    public final PushChannelType BjD() {
        if (this.A04) {
            return PushChannelType.A05;
        }
        C3UN c3un = this.A08;
        if (c3un != null) {
            return c3un.BjD();
        }
        return PushChannelType.A0D;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.instagram.push.FbnsInitBroadcastReceiver, android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.3V1, java.lang.Object] */
    @Override // X.C3UN
    public final void CNt(C1WZ c1wz, String str, boolean z) {
        this.A02 = str;
        this.A03 = z;
        this.A00 = c1wz;
        if (!this.A04) {
            DQQ();
            return;
        }
        synchronized (this) {
            C218914p.A08.A0A(this.A07);
            if (this.A01 == null) {
                Context context = this.A05;
                if (context.getApplicationInfo().targetSdkVersion >= 24) {
                    this.A01 = new BroadcastReceiver();
                    IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                    if (context.getApplicationInfo().targetSdkVersion >= 26) {
                        intentFilter.addAction("android.intent.action.USER_PRESENT");
                    }
                    C0DJ.A00(this.A01, context, intentFilter);
                }
            }
        }
        Context context2 = this.A05;
        ComponentName componentName = new ComponentName(context2, (Class<?>) FbnsInitBroadcastReceiver.class);
        PackageManager packageManager = context2.getPackageManager();
        packageManager.getClass();
        FbnsInitBroadcastReceiver.class.getCanonicalName();
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        if (str != null) {
            String A05 = C16030qx.A02.A05(context2);
            int i = 30;
            if (z || !(!C3UV.A00(context2).A02)) {
                i = 10000;
            }
            Integer valueOf = Integer.valueOf(i);
            Bundle bundle = new Bundle();
            if (z) {
                EnumC74133Ur.A03.A00(bundle, str);
            } else {
                EnumC74133Ur.A03.A00(bundle, "");
            }
            EnumC74133Ur.A05.A00(bundle, A05);
            EnumC74133Ur.A04.A00(bundle, Boolean.valueOf(z));
            EnumC74133Ur.A06.A00(bundle, -1);
            EnumC74133Ur.A0A.A00(bundle, valueOf);
            C74183Ux c74183Ux = new C74183Ux(context2);
            int i2 = EnumC74203Uz.SET_ANALYTICS_CONFIG.A00;
            ?? fbnsAIDLResult = new FbnsAIDLResult(bundle);
            fbnsAIDLResult.A00 = i2;
            c74183Ux.A05.submit(new C3V0(new FbnsAIDLRequest[]{fbnsAIDLResult}[0], c74183Ux));
        }
        Boolean bool = null;
        if (AbstractC14490oL.A0C(context2) && (!C1AD.A06(C06090Tz.A05, 18296431832006988L))) {
            bool = true;
        }
        ?? obj = new Object();
        obj.A03 = null;
        obj.A00 = 0L;
        obj.A01 = bool;
        obj.A02 = null;
        C3US c3us = this.A06;
        String A00 = c3us.A01.A00();
        if (A00 != null) {
            if (C3V2.A02(A00)) {
                C3VC.A00(c3us.A00);
            }
            C3VC.A01(c3us.A00, obj, FbnsServiceDelegate.A00(A00), "init", A00, "Orca.START");
        } else {
            C3VC.A00(c3us.A00);
        }
        C3UN c3un = this.A08;
        if (c3un == null) {
            return;
        }
        c3un.CNt(c1wz, str, z);
    }

    @Override // X.C3UN
    public final void Ctp(C62450SCd c62450SCd, Integer num) {
        C3UN c3un = this.A08;
        if (c3un != null) {
            c3un.Ctp(c62450SCd, num);
        } else {
            c62450SCd.A00.DO6(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
    @Override // X.C3UN
    public final void DQQ() {
        Context context = this.A05;
        ComponentName componentName = new ComponentName(context, (Class<?>) FbnsInitBroadcastReceiver.class);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        FbnsInitBroadcastReceiver.class.getCanonicalName();
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        synchronized (this) {
            C218914p c218914p = C218914p.A08;
            C218914p.A06(this.A07);
            FbnsInitBroadcastReceiver fbnsInitBroadcastReceiver = this.A01;
            if (fbnsInitBroadcastReceiver != null) {
                try {
                    context.unregisterReceiver(fbnsInitBroadcastReceiver);
                } catch (IllegalArgumentException unused) {
                } catch (Throwable th) {
                    this.A01 = null;
                    throw th;
                }
                this.A01 = null;
            }
        }
        C3US c3us = this.A06;
        String A00 = c3us.A01.A00();
        if (A00 != null) {
            Context context2 = c3us.A00;
            String A002 = FbnsServiceDelegate.A00(A00);
            if (A002 == null) {
                A002 = FbnsServiceDelegate.A00(A00);
            }
            Intent intent = new Intent("com.facebook.rti.fbns.intent.UNREGISTER");
            intent.setComponent(new ComponentName(A00, A002));
            intent.putExtra("pkg_name", context2.getPackageName());
            C3VA c3va = new C3VA(context2, null);
            ComponentName component = intent.getComponent();
            if (component != null) {
                String packageName = component.getPackageName();
                Context context3 = c3va.A00;
                C3UW c3uw = c3va.A01;
                if (C3V3.A01(context3, c3uw, packageName)) {
                    c3va.A02(intent);
                    c3uw.A05(context3, intent);
                }
            }
        }
        Context context4 = c3us.A00;
        C3VC.A00(context4);
        C91M ARA = ((C74123Uq) C3UY.A00).A02().A00(context4, AnonymousClass001.A0R("rti.mqtt.", "token_store")).ARA();
        ARA.AHU();
        ARA.AIb("FbnsCallbackHandlerBase", "PreferencesManager failed to clear token store");
        Bundle bundle = new Bundle();
        EnumC74133Ur.A03.A00(bundle, null);
        EnumC74133Ur.A04.A00(bundle, false);
        C74183Ux c74183Ux = new C74183Ux(context);
        int i = EnumC74203Uz.SET_ANALYTICS_CONFIG.A00;
        ?? fbnsAIDLResult = new FbnsAIDLResult(bundle);
        fbnsAIDLResult.A00 = i;
        c74183Ux.A05.submit(new C3V0(new FbnsAIDLRequest[]{fbnsAIDLResult}[0], c74183Ux));
    }

    @Override // X.C3UN
    public final void ED2(Integer num) {
        C1WZ c1wz = this.A00;
        if (c1wz != null) {
            c1wz.A02(this.A05, PushChannelType.A05, num, 1);
        } else {
            C0w9.A03("FbnsPushRegistrar register", AbstractC111324zv.A00(698));
        }
        boolean A00 = C3UT.A00(this.A05);
        if (this.A04 != A00) {
            this.A04 = A00;
            CNt(this.A00, this.A02, this.A03);
        }
        if (this.A04) {
            C3US c3us = this.A06;
            String str = this.A09;
            String A002 = F13.A00(num);
            String A003 = c3us.A01.A00();
            if (A003 != null) {
                Context context = c3us.A00;
                String A004 = FbnsServiceDelegate.A00(A003);
                context.getClass();
                C3VA c3va = new C3VA(context, null);
                if (!TextUtils.isEmpty(str)) {
                    if (context.getPackageName().equals(A003)) {
                        ComponentName componentName = new ComponentName(context, A004);
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        componentName.getShortClassName();
                    }
                    Intent intent = new Intent(AbstractC58317Pt9.A00(252));
                    intent.setComponent(new ComponentName(A003, A004));
                    intent.putExtra("pkg_name", context.getPackageName());
                    intent.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str);
                    intent.putExtra("push_renew_trigger", A002);
                    ComponentName component = intent.getComponent();
                    if (component != null) {
                        String packageName = component.getPackageName();
                        Context context2 = c3va.A00;
                        C3UW c3uw = c3va.A01;
                        if (C3V3.A01(context2, c3uw, packageName)) {
                            c3va.A02(intent);
                            c3uw.A05(context2, intent);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Missing appId");
                }
            }
        }
        C3UN c3un = this.A08;
        if (c3un != null) {
            c3un.ED2(num);
        }
    }
}
