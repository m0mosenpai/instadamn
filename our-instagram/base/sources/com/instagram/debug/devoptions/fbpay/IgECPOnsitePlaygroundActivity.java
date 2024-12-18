package com.instagram.debug.devoptions.fbpay;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.C0f9;
import X.C14360o3;
import X.C69642Vsj;
import X.MSW;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class IgECPOnsitePlaygroundActivity extends IgFragmentActivity {
    public static final Companion Companion = new Object();
    public C69642Vsj ecpLauncher;

    public static final Intent getActivityIntent(Context context) {
        return Companion.getActivityIntent(context);
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public final Intent getActivityIntent(Context context) {
            C14360o3.A0B(context, 0);
            return MSW.A08(context, IgECPPlaygroundActivity.class);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC12980lk
    public /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return MSW.A0Q(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(2113669700);
        super.onCreate(bundle);
        this.ecpLauncher = new C69642Vsj(this);
        setContentView(R.layout.ig_ecp_onsite_playground_activity);
        C0f9.A07(-1940336513, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return MSW.A0Q(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public UserSession getSession() {
        return MSW.A0Q(this);
    }
}
