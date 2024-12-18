package com.instagram.rtc.activity;

import X.AbstractC111324zv;
import X.AbstractC12960li;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC50522MSa;
import X.AnonymousClass001;
import X.C006802i;
import X.C023409i;
import X.C06090Tz;
import X.C09Y;
import X.C0f9;
import X.C0fO;
import X.C14360o3;
import X.C18950wb;
import X.C18U;
import X.C226218q;
import X.C56715PFh;
import X.C57670PiL;
import X.C57750Pjd;
import X.C57754Pjh;
import X.C63002SaQ;
import X.InterfaceC11380iw;
import X.InterfaceC16660sJ;
import X.InterfaceC58177Pqh;
import X.MSW;
import X.MSX;
import X.MSY;
import X.OLI;
import X.OWS;
import X.OXE;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.systrace.Systrace;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class RtcCallIntentHandlerActivity extends IgFragmentActivity implements InterfaceC11380iw {
    public InterfaceC58177Pqh A00;
    public C63002SaQ A01;
    public final Handler A02 = AbstractC167007dF.A0J();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0Jk, java.lang.Object] */
    private final void A00(InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        String A00 = AbstractC111324zv.A00(6);
        try {
            C09Y c09y = C023409i.A0A;
            Bundle A0A = AbstractC31173DnH.A0A(this);
            if (A0A != null) {
                UserSession A06 = c09y.A06(A0A);
                if (!C18U.A06(C06090Tz.A05, A06, 36323603574566298L)) {
                    Object session = getSession();
                    if (session == null) {
                        if (!z) {
                            OXE.A00.A04("RtcCallIntentHandlerActivity", AbstractC166997dE.A0v(getIntent(), AbstractC166997dE.A11("No active user session while processing intent: ")), null);
                            finish();
                        }
                        session = c09y.A05(this);
                        C14360o3.A0C(session, A00);
                    }
                    interfaceC16660sJ.invoke(session);
                    return;
                }
                c09y.A0A(new Object(), null, new C56715PFh(interfaceC16660sJ, 1), A06.userId);
                return;
            }
            throw AbstractC166997dE.A0g();
        } catch (IllegalStateException e) {
            OXE.A00.A04("RtcCallIntentHandlerActivity", AbstractC166997dE.A0v(getIntent(), AbstractC166997dE.A11("No active user session while processing intent: ")), e);
            if (getSession() != null) {
                C14360o3.A0C(getSession(), A00);
                OWS ows = new OWS(new OLI(C18950wb.A01).A00, "RtcCallIntentHandlerActivity: No active user session while processing intent", 659044095);
                ows.A00 = e;
                ows.A01.ERI(e);
                ows.A02("intent_action", String.valueOf(MSX.A0c(this)));
                ows.A01();
            }
            finish();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "rtc_call_launcher";
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        OXE.A00.A00("RtcCallIntentHandlerActivity", "onNewIntent");
        super.onNewIntent(intent);
        A00(new C57750Pjd(17, this, intent), true);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            return c09y.A07(A0A);
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(boolean r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r4 = "permissionsPresenter"
            X.SaQ r1 = r5.A01
            if (r6 == 0) goto L27
            if (r1 == 0) goto L50
            r3 = 1
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            java.lang.String[] r2 = new java.lang.String[]{r0}
            X.SM4 r0 = r1.A04
            android.app.Activity r1 = r0.A01
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String[] r0 = (java.lang.String[]) r0
            boolean r0 = X.AbstractC23451Ch.A08(r1, r0)
            if (r0 != 0) goto L48
            X.SaQ r0 = r5.A01
            if (r0 == 0) goto L50
            r0.A01()
        L26:
            return
        L27:
            if (r1 == 0) goto L50
            X.SM4 r1 = r1.A04
            java.lang.String[] r2 = X.O0S.A00
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            android.app.Activity r1 = r1.A01
            r0 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            boolean r0 = X.AbstractC23451Ch.A08(r1, r0)
            if (r0 != 0) goto L48
            X.SaQ r0 = r5.A01
            if (r0 == 0) goto L50
            r0.A02(r7)
            return
        L48:
            X.Pqh r0 = r5.A00
            if (r0 == 0) goto L26
            X.AbstractC54146Nwi.A00(r0)
            return
        L50:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.activity.RtcCallIntentHandlerActivity.A02(boolean, boolean):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1035399313);
        String A0h = MSY.A0h(this);
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A01 = MSW.A01();
            AbstractC50522MSa.A1N(c006802i, A0h, A01);
            c006802i.markerAnnotate(694558626, A01, "operation_name", "onCreate");
            try {
                String A0T = AnonymousClass001.A0T(A0h, "onCreate", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, 1502399360);
                }
                try {
                    OXE.A00.A00("RtcCallIntentHandlerActivity", "onCreate");
                    super.onCreate(bundle);
                    Intent intent = getIntent();
                    C14360o3.A07(intent);
                    A00(new C57750Pjd(17, this, intent), true);
                    C226218q.A01(AbstractC12960li.A00).A0K(this, getSession());
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(773341169);
                    }
                    c006802i.markerEnd(694558626, A01, (short) 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-814517184);
                    }
                    C0f9.A07(1935861560, A00);
                    throw th;
                }
            } finally {
            }
        } else {
            OXE.A00.A00("RtcCallIntentHandlerActivity", "onCreate");
            super.onCreate(bundle);
            Intent intent2 = getIntent();
            C14360o3.A07(intent2);
            A00(new C57750Pjd(17, this, intent2), true);
            C226218q.A01(AbstractC12960li.A00).A0K(this, getSession());
        }
        C0f9.A07(520900295, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(-643572130);
        String A0h = MSY.A0h(this);
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A01 = MSW.A01();
            AbstractC50522MSa.A1N(c006802i, A0h, A01);
            c006802i.markerAnnotate(694558626, A01, "operation_name", "onDestroy");
            try {
                String A0T = AnonymousClass001.A0T(A0h, "onDestroy", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, 2060061117);
                }
                try {
                    OXE.A00.A00("RtcCallIntentHandlerActivity", "onDestroy");
                    super.onDestroy();
                    this.A02.removeCallbacksAndMessages(null);
                    InterfaceC58177Pqh interfaceC58177Pqh = this.A00;
                    if (interfaceC58177Pqh != null) {
                        interfaceC58177Pqh.AIk();
                    }
                    this.A00 = null;
                    A00(C57670PiL.A00, false);
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-74571412);
                    }
                    c006802i.markerEnd(694558626, A01, (short) 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1649305239);
                    }
                    C0f9.A07(-224810952, A00);
                    throw th;
                }
            } finally {
            }
        } else {
            OXE.A00.A00("RtcCallIntentHandlerActivity", "onDestroy");
            super.onDestroy();
            this.A02.removeCallbacksAndMessages(null);
            InterfaceC58177Pqh interfaceC58177Pqh2 = this.A00;
            if (interfaceC58177Pqh2 != null) {
                interfaceC58177Pqh2.AIk();
            }
            this.A00 = null;
            A00(C57670PiL.A00, false);
        }
        C0f9.A07(-53041088, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        int A00 = C0f9.A00(797759280);
        String A0h = MSY.A0h(this);
        C006802i c006802i = C006802i.A0p;
        if (c006802i != null) {
            int A01 = MSW.A01();
            AbstractC50522MSa.A1N(c006802i, A0h, A01);
            c006802i.markerAnnotate(694558626, A01, "operation_name", "onStart");
            try {
                String A0T = AnonymousClass001.A0T(A0h, "onStart", '.');
                if (Systrace.A0E(1L)) {
                    C0fO.A01(A0T, -1481123511);
                }
                try {
                    OXE.A00.A00("RtcCallIntentHandlerActivity", "onStart");
                    super.onStart();
                    A00(new C57754Pjh(this, 11), false);
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1542725300);
                    }
                    c006802i.markerEnd(694558626, A01, (short) 2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-406415973);
                    }
                    C0f9.A07(351316025, A00);
                    throw th;
                }
            } finally {
            }
        } else {
            OXE.A00.A00("RtcCallIntentHandlerActivity", "onStart");
            super.onStart();
            A00(new C57754Pjh(this, 11), false);
        }
        C0f9.A07(843925702, A00);
    }
}
