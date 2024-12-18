package com.instagram.inappbrowser.fragments;

import X.ACQ;
import X.AbstractC09440dt;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25228BEl;
import X.AbstractC31171DnF;
import X.AbstractC58321PtD;
import X.AbstractC61533RpD;
import X.AbstractC61712RsT;
import X.AbstractC63254SgB;
import X.BBM;
import X.C0f9;
import X.C2d5;
import X.C3KD;
import X.C3O0;
import X.C41451vu;
import X.C57551PgP;
import X.C62656SKq;
import X.C62720SNk;
import X.C63153Se1;
import X.C63305ShB;
import X.C64473TFj;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC41501vz;
import X.QF6;
import X.SUV;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import com.instagram.base.activity.IgFragmentActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class BrowserLiteInMainProcessIGActivity extends IgFragmentActivity implements InterfaceC11380iw, C2d5, BBM {
    public final C63153Se1 A01 = new C63153Se1(this, new C62656SKq(this));
    public final InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57551PgP(this, 32));
    public final InterfaceC41501vz A02 = new C64473TFj(this, 4);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "BrowserLiteInMainProcessIGActivity";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r14.getBooleanExtra("BrowserLiteIntent.EXTRA_SKIP_SAME_INTENT_DATA_CHECK", false) == false) goto L11;
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // X.C2d5
    public final C3O0 By1() {
        return (C3O0) this.A00.getValue();
    }

    @Override // X.BBM
    public final void D0U(int i, String str, Bundle bundle) {
        C63153Se1.A01(bundle, this.A01, str, i);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C63153Se1 c63153Se1 = this.A01;
        BrowserLiteFragment browserLiteFragment = c63153Se1.A02;
        if (browserLiteFragment == null) {
            C63153Se1.A01(AbstractC166987dD.A0b(), c63153Se1, null, 2);
        } else {
            if (browserLiteFragment.DJx(true)) {
                return;
            }
            c63153Se1.A02.AIE(2, null);
        }
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        BrowserLiteFragment browserLiteFragment;
        List list;
        super.onActionModeFinished(actionMode);
        if (actionMode != null && (browserLiteFragment = this.A01.A02) != null && (list = browserLiteFragment.A0o) != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            ACQ A0Q = AbstractC58321PtD.A0Q(browserLiteFragment, "onActionModeFinished", A1C);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            A0Q.A00(AbstractC166997dE.A0x(".End", A1C));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        BrowserLiteFragment browserLiteFragment;
        List list;
        super.onActionModeStarted(actionMode);
        if (actionMode != null && (browserLiteFragment = this.A01.A02) != null && (list = browserLiteFragment.A0o) != null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            ACQ A0Q = AbstractC58321PtD.A0Q(browserLiteFragment, "onActionModeStarted", A1C);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            A0Q.A00(AbstractC166997dE.A0x(".End", A1C));
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BrowserLiteFragment browserLiteFragment = this.A01.A02;
        if (browserLiteFragment != null) {
            browserLiteFragment.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        if (r11.isEmpty() == false) goto L41;
     */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, X.RsJ] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, X.VJL] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(101347216);
        super.onDestroy();
        this.A01.A01.isFinishing();
        C0f9.A07(1492326365, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        Fragment A0Q;
        int A00 = C0f9.A00(1014129688);
        super.onPause();
        C63153Se1 c63153Se1 = this.A01;
        if (c63153Se1.A03 != null && (A0Q = c63153Se1.A01.getSupportFragmentManager().A0Q("rageshake_listener_fragment")) != null) {
            A0Q.onPause();
        }
        C41451vu.A01.A03(this.A02, C3KD.class);
        C0f9.A07(96352270, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        QF6 C9a;
        BrowserLiteWebChromeClient A03;
        AbstractC167017dG.A1P(strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        BrowserLiteFragment browserLiteFragment = this.A01.A02;
        if (browserLiteFragment != null && (C9a = browserLiteFragment.C9a()) != null && (A03 = C9a.A03()) != null) {
            A03.A06(i, iArr);
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        Window window;
        Fragment A0Q;
        int A00 = C0f9.A00(1355415194);
        super.onResume();
        C63153Se1 c63153Se1 = this.A01;
        if (c63153Se1.A03 != null && (A0Q = c63153Se1.A01.getSupportFragmentManager().A0Q("rageshake_listener_fragment")) != null) {
            A0Q.onResume();
        }
        if (c63153Se1.A07 && (window = c63153Se1.A01.getWindow()) != null) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4);
            window.setFlags(1024, 1024);
        }
        C41451vu.A01.A02(this.A02, C3KD.class);
        C0f9.A07(39338813, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int A00 = C0f9.A00(-563401530);
        super.onStop();
        C63153Se1 c63153Se1 = this.A01;
        int i = AbstractC61533RpD.A00 - 1;
        AbstractC61533RpD.A00 = i;
        if (i < 0) {
            AbstractC63254SgB.A02("ActivityCounter", "sCounter = %d < 0! This should not happen!", AbstractC25228BEl.A1Y(i));
        }
        FragmentActivity fragmentActivity = c63153Se1.A01;
        boolean booleanExtra = fragmentActivity.getIntent().getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_SHOULD_FORCE_SOFT_KEYBOARD_CLOSE_ON_BROWSER_EXIT", false);
        boolean booleanExtra2 = fragmentActivity.getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_DISMISS_SOFT_KEYBOARD_ON_FINISH", false);
        if (booleanExtra || booleanExtra2) {
            InputMethodManager inputMethodManager = (InputMethodManager) fragmentActivity.getSystemService("input_method");
            View currentFocus = fragmentActivity.getCurrentFocus();
            if (inputMethodManager != null && currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        if (AbstractC61533RpD.A00 == 0 && !c63153Se1.A08) {
            try {
                Pattern pattern = SUV.A01;
                AbstractC61712RsT.A00().EEu(null);
            } catch (PackageManager.NameNotFoundException | Exception unused) {
            }
        }
        int[] intArrayExtra = fragmentActivity.getIntent().getIntArrayExtra("BrowserLiteIntent.EXTRA_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            fragmentActivity.overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
        C0f9.A07(2127024133, A00);
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        Bundle bundle;
        C63305ShB c63305ShB;
        super.onUserInteraction();
        C63153Se1 c63153Se1 = this.A01;
        if (c63153Se1.A02 != null && (c63305ShB = c63153Se1.A04) != null) {
            c63305ShB.A07(c63153Se1.A02.A09, Collections.singletonMap("action", "ig_browser_touch_interaction"));
        }
        C62720SNk c62720SNk = c63153Se1.A05;
        if (c62720SNk != null) {
            BrowserLiteFragment browserLiteFragment = c63153Se1.A02;
            if (browserLiteFragment == null) {
                bundle = null;
            } else {
                bundle = browserLiteFragment.A09;
            }
            c62720SNk.A00(bundle);
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
