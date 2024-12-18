package com.instagram.settings.activity;

import X.AbstractC09440dt;
import X.AbstractC12960li;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31178DnM;
import X.AbstractC35091Fd2;
import X.AbstractC35178FfV;
import X.AbstractC58317Pt9;
import X.C023409i;
import X.C05F;
import X.C0f9;
import X.C106904rr;
import X.C140966Yy;
import X.C14360o3;
import X.C226218q;
import X.C33233ElS;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.X2z;
import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class NotificationSettingsHandlerActivity extends IgFragmentActivity implements InterfaceC11380iw {
    public final InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2z(this, 31));

    @Override // com.instagram.base.activity.IgFragmentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        C106904rr.A01(C106904rr.A00(getSession()), C05F.A01, System.currentTimeMillis());
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "notification_settings_handler";
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1897045012);
        super.onCreate(bundle);
        setTheme(R.style.IgPanorama);
        setContentView(R.layout.activity_single_container);
        if (AbstractC31172DnG.A1Y(this)) {
            UserSession A08 = C023409i.A0A.A08(this);
            if (AbstractC58317Pt9.A00(8).equals(getIntent().getAction()) && getIntent().hasCategory("android.intent.category.NOTIFICATION_PREFERENCES")) {
                C226218q.A01(AbstractC12960li.A00).A0L(getIntent(), C05F.A0Y);
                Bundle A05 = AbstractC31178DnM.A05(A08);
                A05.putBoolean("only_show_push", true);
                AbstractC35091Fd2.A01(null, A08, "settings", "notifications_entered", null);
                C140966Yy A0P = AbstractC31173DnH.A0P(this, A08);
                A0P.A0B(A05, new C33233ElS());
                A0P.A04();
            }
        } else {
            AbstractC35178FfV.A00().A00(this, AbstractC31173DnH.A0A(this), getSession());
        }
        C0f9.A07(31092000, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
