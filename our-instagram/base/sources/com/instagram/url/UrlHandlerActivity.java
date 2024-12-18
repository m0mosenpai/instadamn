package com.instagram.url;

import X.AbstractC10360h2;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC54852fj;
import X.C06090Tz;
import X.C06P;
import X.C0f9;
import X.C14240no;
import X.C172077lc;
import X.C18U;
import X.C1AD;
import X.C1QF;
import X.C2M3;
import X.C31374Dqe;
import X.C3K8;
import X.C55772hI;
import X.C69613Av;
import X.C71313Hs;
import X.InterfaceC08100bW;
import X.InterfaceC11380iw;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes3.dex */
public class UrlHandlerActivity extends BaseFragmentActivity implements InterfaceC11380iw, CallerContextable {
    public static final InterfaceC08100bW A05 = new C1QF("IgSecureUriParser").A00;
    public C69613Av A00;
    public AbstractC18680vv A01;
    public C2M3 A02;
    public C31374Dqe A03;
    public boolean A04;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "url_handler";
    }

    private void A00(Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra("EXTRA_LAUNCH_INSTAGRAM_SOURCE_INTENT");
        if (C1AD.A06(C06090Tz.A05, 2324142842659867124L) && intent2 != null) {
            A01(intent2);
        } else {
            A01(intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.url.UrlHandlerActivity.A01(android.content.Intent):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity
    public final C172077lc getGnvGestureHandler() {
        AbstractC18680vv abstractC18680vv = this.A01;
        if (abstractC18680vv != null && C18U.A06(C06090Tz.A05, abstractC18680vv, 36311633503453868L) && C3K8.A02(this.A01)) {
            C172077lc A00 = C172077lc.A00(abstractC18680vv);
            C71313Hs A002 = C71313Hs.A00(abstractC18680vv);
            A00.A03(A002);
            A00.A02(A002);
            return C172077lc.A00(abstractC18680vv);
        }
        return null;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Object A00;
        Fragment A0O;
        boolean z = true;
        if (getSupportFragmentManager().A0L() < 1 && this.A04) {
            z = false;
        }
        if (Boolean.valueOf(C18U.A06(C06090Tz.A05, this.A01, 36322980804897587L)).booleanValue() && (A00 = AbstractC54852fj.A00()) != null && (A0O = ((FragmentActivity) A00).getSupportFragmentManager().A0O(R.id.layout_container_main)) != null) {
            AbstractC10360h2 childFragmentManager = A0O.getChildFragmentManager();
            if (C06P.A01(childFragmentManager) && childFragmentManager.A0L() > 0) {
                childFragmentManager.A0c(((C14240no) childFragmentManager.A0S(0)).A00);
            }
        }
        if (z) {
            super.onBackPressed();
        } else {
            C55772hI.A00(this.A01).A09(this, "up");
            finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
    
        if (r1 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r0.getString("autologin") == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (r0.getString("fresh_sign_in") == null) goto L27;
     */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.url.UrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        A00(intent);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(2014607849);
        super.onPause();
        C0f9.A07(1720025843, A00);
    }

    @Override // android.app.Activity
    public final void onRestart() {
        int A00 = C0f9.A00(-980644910);
        super.onRestart();
        C0f9.A07(-431990365, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-674887196);
        super.onResume();
        C0f9.A07(-704226386, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A01;
    }
}
