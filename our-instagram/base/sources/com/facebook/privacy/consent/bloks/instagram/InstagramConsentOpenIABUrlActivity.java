package com.facebook.privacy.consent.bloks.instagram;

import X.AbstractC12990ll;
import X.AbstractC13580mk;
import X.AbstractC18680vv;
import X.AbstractC54359O0r;
import X.C00O;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C131845xK;
import X.C14360o3;
import X.C2Fb;
import X.C63397SjR;
import X.C6FW;
import X.InterfaceC103384lE;
import X.O78;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public final class InstagramConsentOpenIABUrlActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;
    public boolean A01;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("already_opened", this.A01);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A00;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String stringExtra;
        int A00 = C0f9.A00(429384915);
        C09Y c09y = C023409i.A0A;
        Intent intent = getIntent();
        C14360o3.A07(intent);
        AbstractC18680vv A04 = c09y.A04(AbstractC13580mk.A00(intent));
        C14360o3.A0B(A04, 0);
        this.A00 = A04;
        super.onCreate(bundle);
        if (bundle != null) {
            this.A01 = bundle.getBoolean("already_opened");
        }
        if (this.A01) {
            i = -753294861;
        } else {
            Intent intent2 = getIntent();
            if (intent2 != null && (stringExtra = intent2.getStringExtra("redirect_url")) != null && stringExtra.length() != 0) {
                AbstractC18680vv session = getSession();
                if (session instanceof UserSession) {
                    C63397SjR c63397SjR = new C63397SjR(this, (UserSession) session, C2Fb.A0V, stringExtra, false);
                    c63397SjR.A0S = "instagram_consent_open_iab_url_activity";
                    c63397SjR.A0A();
                } else {
                    SimpleWebViewActivity.A02.A02(this, session, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, true, true, false, false, true, false, false, false, (String) null, stringExtra));
                }
                i = 2100497717;
            } else {
                setResult(0);
                finish();
                i = 1331769361;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(-1183122572);
        super.onPause();
        this.A01 = true;
        C0f9.A07(1231191861, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-843153825);
        super.onResume();
        if (this.A01) {
            String stringExtra = getIntent().getStringExtra("callback_key");
            if (stringExtra != null) {
                ReentrantLock reentrantLock = AbstractC54359O0r.A01;
                reentrantLock.lock();
                try {
                    O78 o78 = (O78) AbstractC54359O0r.A00.remove(stringExtra);
                    if (o78 != null) {
                        InterfaceC103384lE interfaceC103384lE = o78.A01;
                        C131845xK.A00(o78.A00, C6FW.A01, interfaceC103384lE);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            finish();
        }
        C0f9.A07(-924416587, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
