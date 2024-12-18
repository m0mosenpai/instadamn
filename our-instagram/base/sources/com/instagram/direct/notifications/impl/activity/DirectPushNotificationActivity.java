package com.instagram.direct.notifications.impl.activity;

import X.AbstractC09800fd;
import X.AbstractC111324zv;
import X.AbstractC12960li;
import X.AbstractC12990ll;
import X.AbstractC13110lx;
import X.AbstractC13230m9;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC31177DnL;
import X.AbstractC31180DnO;
import X.AbstractC35178FfV;
import X.AbstractC43591JPw;
import X.AbstractC47077KrY;
import X.AnonymousClass001;
import X.B73;
import X.C023409i;
import X.C09Y;
import X.C0K8;
import X.C0YZ;
import X.C0f9;
import X.C14360o3;
import X.C18C;
import X.C1XM;
import X.C2055097z;
import X.C218914p;
import X.C226218q;
import X.C226418s;
import X.C28271Yo;
import X.C2OJ;
import X.C35277FhC;
import X.C36158FxY;
import X.C36881nl;
import X.C55772hI;
import X.C55782hJ;
import X.C6XL;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC83713oG;
import X.MSV;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.proxygen.TraceEventType;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Map;

/* loaded from: classes6.dex */
public final class DirectPushNotificationActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public final InterfaceC09390do A00 = C1XM.A00(B73.A00);
    public final C36158FxY A01 = new C36158FxY(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return TraceEventType.Push;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        AbstractC13110lx.A01(this, configuration);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        Bundle A00;
        int i;
        Intent intent = getIntent();
        C14360o3.A07(intent);
        InterfaceC09390do interfaceC09390do = this.A00;
        ((C2055097z) interfaceC09390do.getValue()).A04.A01(null);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        if (!(A0F instanceof UserSession)) {
            Class<?> cls = A0F.getClass();
            Map map = C0YZ.A03;
            C14360o3.A0B(cls, 1);
            C0K8.A0C("DirectPushNotificationActivity", AnonymousClass001.A0R("Session is not the right instance ", AbstractC13230m9.A01(cls)));
            ((C2055097z) interfaceC09390do.getValue()).A02("thread_activity_user_session_error", true);
            AbstractC35178FfV.A01(this, null, A0F);
            return;
        }
        C28271Yo A002 = C2OJ.A00();
        Context baseContext = getBaseContext();
        C14360o3.A07(baseContext);
        AbstractC47077KrY.A00(intent, A0F, A002.A02(baseContext));
        Fragment A0I = AbstractC31177DnL.A0I(this);
        UserSession userSession = (UserSession) A0F;
        Bundle bundle2 = C35277FhC.A08(intent, userSession).A0P;
        try {
            C36881nl A003 = C35277FhC.A00(this, bundle2, this, userSession, true);
            if (A003 != null) {
                int i2 = 0;
                if (bundle2.getBoolean("action_call_back")) {
                    i2 = 3;
                }
                InterfaceC83713oG interfaceC83713oG = A003.A0B;
                C18C.A07(interfaceC83713oG, "Missing ThreadTarget");
                A00 = C36881nl.A00(A003, interfaceC83713oG, i2, false);
                i = 1954771004;
            } else {
                A00 = null;
                i = -603596992;
            }
            AbstractC09800fd.A00(i);
            if (A00 == null) {
                ((C2055097z) interfaceC09390do.getValue()).A02("thread_activity_fragment_arguments_error", true);
                ((C2055097z) interfaceC09390do.getValue()).A04.A00();
                C35277FhC.A0J(this, C35277FhC.A08(intent, userSession).A0P, userSession, true);
                finish();
                return;
            }
            if (A0I != null) {
                return;
            }
            Fragment A004 = C6XL.A00(A00, this, A0F, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
            boolean booleanExtra = intent.getBooleanExtra(MSV.A00(339), false);
            if (A004 != null) {
                if (!booleanExtra) {
                    AbstractC31177DnL.A0w(A00, A004, this, A0F);
                } else {
                    A00.putBoolean(AbstractC111324zv.A00(1594), ((C2055097z) interfaceC09390do.getValue()).A08.A0Y(null));
                    AbstractC31180DnO.A16(A00, A004, this, A0F, false);
                }
            }
            ((C2055097z) interfaceC09390do.getValue()).A04.A02(null);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1052725155);
            throw th;
        }
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C09Y c09y;
        int A00 = C0f9.A00(1183704305);
        boolean isTaskRoot = isTaskRoot();
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        if (!isTaskRoot) {
            Intent intent = getIntent();
            c09y = C023409i.A0A;
            A01.A0J(this, intent, c09y.A05(this));
        } else {
            c09y = C023409i.A0A;
            A01.A0K(this, c09y.A05(this));
        }
        super.onCreate(bundle);
        AbstractC31175DnJ.A0o(getIntent(), c09y.A05(this));
        View findViewById = findViewById(R.id.layout_container_parent);
        if (findViewById != null) {
            findViewById.setFitsSystemWindows(true);
        }
        boolean isTaskRoot2 = isTaskRoot();
        C55782hJ A002 = C55772hI.A00(c09y.A05(this));
        if (isTaskRoot2) {
            A002.A05();
        } else {
            A002.A09(this, "via_push_notification");
        }
        C218914p.A05(this.A01);
        Intent intent2 = getIntent();
        C14360o3.A07(intent2);
        ((C2055097z) this.A00.getValue()).A02("thread_activity_is_from_direct_push", intent2.getBooleanExtra(AbstractC43591JPw.A00(252), false));
        C0f9.A07(-368317401, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(1124473953);
        C218914p.A06(this.A01);
        super.onDestroy();
        C0f9.A07(377919001, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
