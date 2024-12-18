package com.instagram.mainactivity;

import X.AbstractC12960li;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC50712Us;
import X.AbstractC52232aO;
import X.AbstractC52802bM;
import X.AnonymousClass001;
import X.C006802i;
import X.C023409i;
import X.C05F;
import X.C06090Tz;
import X.C0L6;
import X.C0f9;
import X.C0fO;
import X.C12260kU;
import X.C14360o3;
import X.C18720vz;
import X.C18U;
import X.C1CH;
import X.C226218q;
import X.C226418s;
import X.C26771Rh;
import X.InterfaceC11380iw;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.systrace.Systrace;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import kotlin.Deprecated;

@Deprecated(message = "")
/* loaded from: classes.dex */
public final class LauncherActivity extends IgFragmentActivity implements InterfaceC11380iw {
    public UserSession A00;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "launcher";
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1322658105);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        UserSession userSession = null;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onCreate");
            try {
                String A0T = AnonymousClass001.A0T(name, "onCreate", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, -1625421243);
                }
                try {
                    C18720vz c18720vz = AbstractC12960li.A00;
                    C226418s A01 = C226218q.A01(c18720vz);
                    A01.A0P(A01.A02, "LAUNCHER_ACTIVITY_ONCREATE_START");
                    Application application = getApplication();
                    C14360o3.A07(application);
                    AbstractC52232aO.A00(application);
                    Intent intent = getIntent();
                    AbstractC52802bM.A00(this);
                    super.onCreate(bundle);
                    AbstractC18680vv A05 = C023409i.A0A.A05(this);
                    boolean z = A05 instanceof UserSession;
                    if (z) {
                        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
                        userSession = (UserSession) A05;
                    }
                    this.A00 = userSession;
                    if (userSession != null) {
                        C226218q.A01(c18720vz).A0K(this, userSession);
                    }
                    C14360o3.A0A(intent);
                    if (intent.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent.getAction())) {
                        C226218q.A01(c18720vz).A0L(intent, C05F.A00);
                    }
                    if (z && intent.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent.getAction())) {
                        UserSession userSession2 = this.A00;
                        if (userSession2 != null) {
                            C1CH.A00(userSession2).A03(this, intent, C26771Rh.A00().A00);
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException("logged in user should have non-null userSession");
                            C0f9.A07(-1237890940, A00);
                            throw illegalStateException;
                        }
                    }
                    Intent intent2 = new Intent();
                    intent2.setClassName(this, "com.instagram.mainactivity.InstagramMainActivity");
                    intent2.setData(intent.getData());
                    if (userSession != null && C18U.A06(C06090Tz.A05, userSession, 36319841182883528L)) {
                        intent2.setAction(intent.getAction());
                        if (intent.getCategories() != null) {
                            Iterator<String> it = intent.getCategories().iterator();
                            while (it.hasNext()) {
                                intent2.addCategory(it.next());
                            }
                        }
                    }
                    intent2.setFlags(67108864);
                    intent2.putExtras(intent);
                    C12260kU.A0C(this, intent2);
                    finish();
                    C226418s A012 = C226218q.A01(c18720vz);
                    A012.A0P(A012.A02, "LAUNCHER_ACTIVITY_ONCREATE_END");
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-2006022605);
                    }
                    c006802i.markerEnd(694558626, A03, (short) 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(761573647);
                    }
                    C0f9.A07(1418450711, A00);
                    throw th;
                }
            } finally {
            }
        } else {
            C18720vz c18720vz2 = AbstractC12960li.A00;
            C226418s A013 = C226218q.A01(c18720vz2);
            A013.A0P(A013.A02, "LAUNCHER_ACTIVITY_ONCREATE_START");
            Application application2 = getApplication();
            C14360o3.A07(application2);
            AbstractC52232aO.A00(application2);
            Intent intent3 = getIntent();
            AbstractC52802bM.A00(this);
            super.onCreate(bundle);
            AbstractC18680vv A052 = C023409i.A0A.A05(this);
            boolean z2 = A052 instanceof UserSession;
            if (z2) {
                C14360o3.A0C(A052, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
                userSession = (UserSession) A052;
            }
            this.A00 = userSession;
            if (userSession != null) {
                C226218q.A01(c18720vz2).A0K(this, userSession);
            }
            C14360o3.A0A(intent3);
            if (intent3.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent3.getAction())) {
                C226218q.A01(c18720vz2).A0L(intent3, C05F.A00);
            }
            if (z2 && intent3.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent3.getAction())) {
                UserSession userSession3 = this.A00;
                if (userSession3 != null) {
                    C1CH.A00(userSession3).A03(this, intent3, C26771Rh.A00().A00);
                } else {
                    IllegalStateException illegalStateException2 = new IllegalStateException("logged in user should have non-null userSession");
                    C0f9.A07(1966527, A00);
                    throw illegalStateException2;
                }
            }
            Intent intent4 = new Intent();
            intent4.setClassName(this, "com.instagram.mainactivity.InstagramMainActivity");
            intent4.setData(intent3.getData());
            if (userSession != null && C18U.A06(C06090Tz.A05, userSession, 36319841182883528L)) {
                intent4.setAction(intent3.getAction());
                if (intent3.getCategories() != null) {
                    Iterator<String> it2 = intent3.getCategories().iterator();
                    while (it2.hasNext()) {
                        intent4.addCategory(it2.next());
                    }
                }
            }
            intent4.setFlags(67108864);
            intent4.putExtras(intent3);
            C12260kU.A0C(this, intent4);
            finish();
            C226418s A014 = C226218q.A01(c18720vz2);
            A014.A0P(A014.A02, "LAUNCHER_ACTIVITY_ONCREATE_END");
        }
        C0f9.A07(-1719067750, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(-1876735282);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onDestroy");
            try {
                String A0T = AnonymousClass001.A0T(name, "onDestroy", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, 732454628);
                }
                try {
                    super.onDestroy();
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1701405567);
                    }
                    c006802i.markerEnd(694558626, A03, (short) 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1970703793);
                    }
                    C0f9.A07(-946479769, A00);
                    throw th;
                }
            } finally {
            }
        } else {
            super.onDestroy();
        }
        C0f9.A07(-153619446, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(344739701);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onPause");
            try {
                String A0T = AnonymousClass001.A0T(name, "onPause", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, -1846502590);
                }
                try {
                    super.onPause();
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1513010512);
                    }
                    c006802i.markerEnd(694558626, A03, (short) 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1260554298);
                    }
                    C0f9.A07(-1387555491, A00);
                    throw th;
                }
            } finally {
            }
        } else {
            super.onPause();
        }
        C0f9.A07(2138217123, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(855508426);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onResume");
            try {
                String A0T = AnonymousClass001.A0T(name, "onResume", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, 754887417);
                }
                try {
                    super.onResume();
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(782967465);
                    }
                    c006802i.markerEnd(694558626, A03, (short) 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1388067897);
                    }
                    C0f9.A07(1376602510, A00);
                    throw th;
                }
            } finally {
            }
        } else {
            super.onResume();
        }
        C0f9.A07(1255184758, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        int A00 = C0f9.A00(1032292674);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onStart");
            try {
                String A0T = AnonymousClass001.A0T(name, "onStart", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, 635222064);
                }
                try {
                    super.onStart();
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(422772866);
                    }
                    c006802i.markerEnd(694558626, A03, (short) 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1558794980);
                    }
                    C0f9.A07(-818755541, A00);
                    throw th;
                }
            } finally {
            }
        } else {
            super.onStart();
        }
        C0f9.A07(194109596, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int A00 = C0f9.A00(1093853103);
        String name = getClass().getName();
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A03 = AbstractC50712Us.A01.A03();
            c006802i.markerStart(694558626, A03);
            c006802i.markerAnnotate(694558626, A03, "endpoint", C0L6.A00());
            c006802i.markerAnnotate(694558626, A03, "asl_session_id", C0L6.A01());
            c006802i.markerAnnotate(694558626, A03, "activityClass", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "method_class", AnonymousClass001.A0g("<cls>", name, "</cls>"));
            c006802i.markerAnnotate(694558626, A03, "operation_name", "onStop");
            try {
                String A0T = AnonymousClass001.A0T(name, "onStop", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, 320101188);
                }
                try {
                    super.onStop();
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1323888650);
                    }
                    c006802i.markerEnd(694558626, A03, (short) 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(924960718);
                    }
                    C0f9.A07(-345384765, A00);
                    throw th;
                }
            } finally {
            }
        } else {
            super.onStop();
        }
        C0f9.A07(621266321, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}
