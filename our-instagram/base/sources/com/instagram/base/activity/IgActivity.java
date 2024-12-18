package com.instagram.base.activity;

import X.AbstractC12860lY;
import X.AbstractC215613i;
import X.AbstractC25061Kk;
import X.AbstractC74033Tu;
import X.C00O;
import X.C0f9;
import X.C0fM;
import X.C11X;
import X.C14360o3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes9.dex */
public abstract class IgActivity extends Activity {
    public AbstractC215613i A00;

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        C14360o3.A0B(context, 0);
        super.attachBaseContext(context);
        C11X A00 = C11X.A00();
        C14360o3.A07(A00);
        this.A00 = A00.A02(context);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        AbstractC215613i abstractC215613i = this.A00;
        if (abstractC215613i == null) {
            C14360o3.A0F("igResources");
            throw C00O.createAndThrow();
        }
        abstractC215613i.A01(configuration);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        AbstractC215613i abstractC215613i = this.A00;
        if (abstractC215613i == null) {
            C14360o3.A0F("igResources");
            throw C00O.createAndThrow();
        }
        return abstractC215613i;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1215114548);
        C0fM.A00(this);
        AbstractC12860lY.A00(this);
        super.onCreate(bundle);
        AbstractC12860lY.A01(this);
        C0f9.A07(600314632, A00);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        int A00 = C0f9.A00(-1544405360);
        super.onDestroy();
        AbstractC12860lY.A02(this);
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC74033Tu.A00(this);
        }
        C0f9.A07(1886719446, A00);
    }

    @Override // android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(-1267059465);
        super.onPause();
        AbstractC12860lY.A03(this);
        C0f9.A07(625802624, A00);
    }

    @Override // android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(1098597612);
        super.onResume();
        AbstractC12860lY.A04(this);
        C0f9.A07(-1000650145, A00);
    }

    @Override // android.app.Activity
    public final void onStart() {
        int A00 = C0f9.A00(-215996483);
        super.onStart();
        AbstractC12860lY.A05(this);
        C0f9.A07(-1947377669, A00);
    }

    @Override // android.app.Activity
    public final void onStop() {
        int A00 = C0f9.A00(-1097854692);
        super.onStop();
        AbstractC12860lY.A06(this);
        C0f9.A07(-40401239, A00);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        AbstractC25061Kk.A00().A07(i);
    }
}
