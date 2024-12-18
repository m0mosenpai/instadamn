package com.instagram.process.instagram;

import X.AbstractC09470dw;
import X.AbstractC09490dy;
import X.AbstractC58327PtK;
import X.C0JA;
import X.C14360o3;
import X.C58325PtI;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.mainactivity.LauncherActivity;
import com.instagram.process.asyncinit.IgAppInitReplayBroadcastReceiver;
import com.instagram.process.asyncinit.IgSplashScreenActivity;

/* loaded from: classes.dex */
public final class Ig4aAppComponentFactory extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        Class cls;
        C14360o3.A0B(classLoader, 0);
        C14360o3.A0B(str, 1);
        if (AbstractC58327PtK.A09() && !AbstractC58327PtK.A08()) {
            cls = IgSplashScreenActivity.class;
        } else {
            if (AbstractC58327PtK.A07() && str.equals(LauncherActivity.class.getName())) {
                cls = InstagramMainActivity.class;
            }
            C14360o3.A0A(str);
            C14360o3.A0B(str, 0);
            AbstractC09470dw.A00(str, true);
            C58325PtI.A07.A05(intent, str);
            Activity instantiateActivity = super.instantiateActivity(classLoader, str, intent);
            C14360o3.A07(instantiateActivity);
            return instantiateActivity;
        }
        str = cls.getName();
        C14360o3.A0A(str);
        C14360o3.A0B(str, 0);
        AbstractC09470dw.A00(str, true);
        C58325PtI.A07.A05(intent, str);
        Activity instantiateActivity2 = super.instantiateActivity(classLoader, str, intent);
        C14360o3.A07(instantiateActivity2);
        return instantiateActivity2;
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        C14360o3.A0B(classLoader, 0);
        C14360o3.A0B(str, 1);
        AbstractC09490dy.A03.A00 = 25105845;
        AbstractC09470dw.A00(str, false);
        Application instantiateApplication = super.instantiateApplication(classLoader, str);
        C14360o3.A07(instantiateApplication);
        return instantiateApplication;
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        C14360o3.A0B(classLoader, 0);
        C14360o3.A0B(str, 1);
        AbstractC09470dw.A00(str, false);
        ContentProvider instantiateProvider = super.instantiateProvider(classLoader, str);
        C14360o3.A07(instantiateProvider);
        return instantiateProvider;
    }

    @Override // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        C14360o3.A0B(classLoader, 0);
        C14360o3.A0B(str, 1);
        boolean A02 = C0JA.A02();
        if (AbstractC58327PtK.A09()) {
            if (A02 || !AbstractC58327PtK.A08() || !IgAppInitReplayBroadcastReceiver.originalIntents.isEmpty()) {
                str = IgAppInitReplayBroadcastReceiver.class.getCanonicalName();
            }
            C14360o3.A0A(str);
        }
        C14360o3.A0B(str, 0);
        AbstractC09470dw.A00(str, false);
        if (!A02) {
            C58325PtI.A07.A06(intent, str);
        }
        BroadcastReceiver instantiateReceiver = super.instantiateReceiver(classLoader, str, intent);
        C14360o3.A07(instantiateReceiver);
        return instantiateReceiver;
    }

    @Override // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        C14360o3.A0B(classLoader, 0);
        C14360o3.A0B(str, 1);
        AbstractC09470dw.A00(str, false);
        if (!C0JA.A02()) {
            C58325PtI.A07.A07(intent, str);
            if (AbstractC58327PtK.A09()) {
                AbstractC58327PtK.A03();
            }
        }
        Service instantiateService = super.instantiateService(classLoader, str, intent);
        C14360o3.A07(instantiateService);
        return instantiateService;
    }
}
