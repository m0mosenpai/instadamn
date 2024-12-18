package com.instagram.rtc.activity;

import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AbstractC12960li;
import X.AbstractC12990ll;
import X.AbstractC13230m9;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31178DnM;
import X.AbstractC54155Nwr;
import X.AbstractC54158Nwu;
import X.C00O;
import X.C06090Tz;
import X.C07X;
import X.C0QM;
import X.C0YZ;
import X.C0f9;
import X.C0k4;
import X.C14360o3;
import X.C18720vz;
import X.C226218q;
import X.C226618u;
import X.C2DL;
import X.C2DM;
import X.C2OG;
import X.C2d4;
import X.C3DN;
import X.C49678Lx9;
import X.C50623MWk;
import X.C54610OAl;
import X.C55177Odh;
import X.C55756OpP;
import X.C55772hI;
import X.C55817OqS;
import X.C56352iT;
import X.C56651PCv;
import X.C56653PCx;
import X.C57406Pe4;
import X.C57407Pe5;
import X.C57548PgM;
import X.C65705Tsd;
import X.EnumC09460dv;
import X.InterfaceC03960Jm;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC60122ou;
import X.MWJ;
import X.OGQ;
import X.OMR;
import X.PB3;
import X.PDX;
import X.ViewOnAttachStateChangeListenerC56972jY;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.Window;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Map;

/* loaded from: classes9.dex */
public final class RtcCallActivity extends IgFragmentActivity implements InterfaceC11380iw, C07X, C2d4 {
    public static final OGQ A0C = new Object();
    public C56352iT A00;
    public UserSession A01;
    public OMR A02;
    public InterfaceC03960Jm A03;
    public ViewOnAttachStateChangeListenerC56972jY A04;
    public final C55756OpP A09;
    public final C0QM A0B;
    public final InterfaceC09390do A08 = AbstractC09440dt.A00(EnumC09460dv.A02, C57407Pe5.A00);
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(C57406Pe4.A00);
    public final InterfaceC09390do A07 = C57548PgM.A00(this, 5);
    public final InterfaceC60122ou A05 = C55817OqS.A00;
    public final C50623MWk A0A = new C50623MWk(this, 5);

    @Override // com.instagram.base.activity.IgFragmentActivity
    public final void configureWindowInsetsAndroid15() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(3031);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        OMR omr = this.A02;
        if (omr == null) {
            C14360o3.A0F("presenterBridge");
            throw C00O.createAndThrow();
        }
        omr.A04.A05(new C56651PCv(configuration));
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 1);
        OMR omr = this.A02;
        if (omr == null) {
            C14360o3.A0F("presenterBridge");
            throw C00O.createAndThrow();
        }
        omr.A04.A05(new C56653PCx(i));
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.C2d4
    public final C56352iT AYT() {
        C56352iT c56352iT = this.A00;
        if (c56352iT == null) {
            C14360o3.A0F("_actionBarService");
            throw C00O.createAndThrow();
        }
        return c56352iT;
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC166987dD.A0o(this.A07);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.PlN, java.lang.Object] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C3DN c3dn = this.mBottomSheetNavigator;
        if (c3dn != null && c3dn.A0Y()) {
            return;
        }
        OMR omr = this.A02;
        if (omr == null) {
            C14360o3.A0F("presenterBridge");
            throw C00O.createAndThrow();
        }
        if (omr.A04.A07(new Object())) {
            return;
        }
        super.onBackPressed();
    }

    public RtcCallActivity() {
        C55756OpP c55756OpP = new C55756OpP(this, 2);
        this.A09 = c55756OpP;
        this.A0B = new C0QM(c55756OpP);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        OMR omr = this.A02;
        if (omr == null) {
            C14360o3.A0F("presenterBridge");
            throw C00O.createAndThrow();
        }
        PDX pdx = new PDX(i, i2, intent);
        C55177Odh c55177Odh = omr.A04;
        if (c55177Odh.A01 == null) {
            omr.A00 = pdx;
        } else {
            c55177Odh.A05(pdx);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02f1, code lost:
    
        if (X.C18U.A06(r8, r9, 36320713061573450L) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02f6, code lost:
    
        r12.A05 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02f8, code lost:
    
        r1 = new X.PCR(r10, r11, r15, r0);
        r15 = new X.PCA(r10, r11);
        r0 = r12.A0F;
        r6.A00(new X.NTS(r7, r9, r0, r13, r5, r1, r15, r0));
        r6.A00(new X.NTV(r17, r9, r13, r5, r0));
        r6.A00(new X.NTJ(r10, r9, r13, r5, r2.A09));
        r6.A00(new X.NTE(r7, r10, r11, r9, r5));
        r1 = new X.OUZ(r17, r10, r11, r9, r0);
        r6.A00(new X.NTD(r9, r13, r5, r1));
        r6.A00(new X.NTI(r7, r9, r0, r13, r1));
        r6.A00(new X.NT6(r7, r10, r11, r9, r5, new X.PC1(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x039f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r9, 2342157425852811817L) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x03a1, code lost:
    
        r6.A00(new X.NTN(r7, r10, r9, r13, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03b8, code lost:
    
        if (X.C18U.A06(r8, r9, 2342172466828296532L) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x03ba, code lost:
    
        r6.A00(new X.NT5(r10, r7, r9, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x03c2, code lost:
    
        X.C14360o3.A07(r7.getApplicationContext());
        r1 = X.AbstractC166987dD.A1G();
        r1.put(X.AbstractC25225BEi.A1D(X.PCV.class), X.AbstractC16960so.A1Q(X.AbstractC25225BEi.A1D(X.NTL.class), X.AbstractC25225BEi.A1D(X.NTY.class), X.AbstractC25225BEi.A1D(X.NTU.class)));
        r1.put(X.AbstractC25225BEi.A1D(X.PCW.class), X.AbstractC16960so.A1Q(X.AbstractC25225BEi.A1D(X.NTL.class), X.AbstractC25225BEi.A1D(X.NTU.class)));
        r1.put(X.AbstractC25225BEi.A1D(X.PCY.class), X.AbstractC16960so.A1Q(X.AbstractC25225BEi.A1D(X.NTR.class), X.AbstractC25225BEi.A1D(X.NTY.class), X.AbstractC25225BEi.A1D(X.C52692NTd.class), X.AbstractC25225BEi.A1D(X.C52689NTa.class), X.AbstractC25225BEi.A1D(X.NTW.class), X.AbstractC25225BEi.A1D(X.NTZ.class)));
        r1.put(X.AbstractC25225BEi.A1D(X.PCX.class), X.AbstractC166987dD.A1J(X.AbstractC25225BEi.A1D(X.NTU.class)));
        r6.A01 = r1;
        r1 = new X.OMR(r13, r2.A0C.A00, r5, r6, r12);
        r31.A02 = r1;
        new X.C55557Olr(r31, X.MSW.A1E(r1, 38));
        X.C65705Tsd.A08.A05.A09(r31.A0A);
        r1 = new android.content.IntentFilter(X.AbstractC58317Pt9.A00(78));
        r1.addAction("android.intent.action.SCREEN_ON");
        X.C0DJ.A00(r31.A0B, r31, r1);
        r2 = r3.findViewById(com.facebook.R.id.action_bar_container);
        X.AbstractC43592JPx.A1T(r2);
        r1 = X.C56342iS.A01(new X.Ok3(r31, 12), (android.view.ViewGroup) r2);
        r31.A00 = r1;
        r1.A0X(r31.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x04ac, code lost:
    
        if (isInPictureInPictureMode() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x04ae, code lost:
    
        r0 = r31.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x04b0, code lost:
    
        if (r0 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x04b2, code lost:
    
        X.C14360o3.A0F("presenterBridge");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x04f2, code lost:
    
        r0.A02(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04f5, code lost:
    
        X.C0f9.A07(-689233622, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04fd, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02f4, code lost:
    
        if (r15 == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02e7  */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Jk, java.lang.Object] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.activity.RtcCallActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(-1259745508);
        super.onDestroy();
        InterfaceC03960Jm interfaceC03960Jm = this.A03;
        if (interfaceC03960Jm != null) {
            interfaceC03960Jm.AIn(null);
        }
        C65705Tsd.A08.A05.A0A(this.A0A);
        unregisterReceiver(this.A0B);
        UserSession userSession = this.A01;
        if (userSession == null) {
            C14360o3.A0F("inCallUserSession");
            throw C00O.createAndThrow();
        }
        C2DM A002 = C2DL.A00(userSession);
        Object value = this.A06.getValue();
        C14360o3.A0B(value, 0);
        A002.A00.remove(value);
        C0f9.A07(1912147577, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(1684719822);
        super.onPause();
        UserSession userSession = this.A01;
        if (userSession != null) {
            if (AbstractC31178DnM.A1X(C06090Tz.A05, userSession, 36314485358594687L)) {
                C2OG.A01().A08.remove(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_REELS_TOGETHER);
            }
            UserSession userSession2 = this.A01;
            if (userSession2 != null) {
                MWJ.A00(this, userSession2).A09.A0H.A00(false);
                ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY = this.A04;
                if (viewOnAttachStateChangeListenerC56972jY != null) {
                    viewOnAttachStateChangeListenerC56972jY.A02();
                }
                C0f9.A07(876800186, A00);
                return;
            }
        }
        C14360o3.A0F("inCallUserSession");
        throw C00O.createAndThrow();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        String str;
        super.onPictureInPictureModeChanged(z);
        OMR omr = this.A02;
        if (omr == null) {
            str = "presenterBridge";
        } else {
            omr.A02(z);
            if (z) {
                UserSession userSession = this.A01;
                if (userSession == null) {
                    str = "inCallUserSession";
                } else {
                    C55772hI.A00(userSession).A09(this, "enter_pip_mode");
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        C18720vz c18720vz = AbstractC12960li.A00;
        C226218q.A01(c18720vz).A0G();
        C49678Lx9 c49678Lx9 = (C49678Lx9) this.A08.getValue();
        C0k4 c0k4 = c49678Lx9.A00;
        if (c0k4 != null) {
            C226218q.A01(c18720vz).A0M(c0k4, C226618u.A03, null);
        }
        c49678Lx9.A00 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.PlO, java.lang.Object] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        String str;
        int A00 = C0f9.A00(-818108545);
        super.onResume();
        long longExtra = getIntent().getLongExtra("rtc_call_activity_arguments_key_notification_trace_id", 0L);
        UserSession userSession = this.A01;
        if (userSession == null) {
            str = "inCallUserSession";
        } else {
            C54610OAl A002 = AbstractC54155Nwr.A00(userSession);
            A002.A01.BXS(Long.valueOf(longExtra)).AIo("call_activity_on_resume");
            Class<?> cls = getClass();
            Map map = C0YZ.A03;
            C14360o3.A0B(cls, 1);
            AbstractC13230m9.A00(cls);
            OMR omr = this.A02;
            str = "presenterBridge";
            if (omr != null) {
                omr.A03(true);
                C56352iT c56352iT = this.A00;
                String str2 = "_actionBarService";
                if (c56352iT != null) {
                    c56352iT.A0X(this.A05);
                    C56352iT c56352iT2 = this.A00;
                    if (c56352iT2 != null) {
                        c56352iT2.A0T();
                        UserSession userSession2 = this.A01;
                        str2 = "inCallUserSession";
                        if (userSession2 != null) {
                            if (AbstractC31178DnM.A1X(C06090Tz.A05, userSession2, 36314485358594687L)) {
                                C2OG.A01().A08.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_REELS_TOGETHER, null);
                            }
                            UserSession userSession3 = this.A01;
                            if (userSession3 != null) {
                                MWJ.A00(this, userSession3).A09.A0H.A00(true);
                                ViewOnAttachStateChangeListenerC56972jY viewOnAttachStateChangeListenerC56972jY = this.A04;
                                if (viewOnAttachStateChangeListenerC56972jY != null) {
                                    viewOnAttachStateChangeListenerC56972jY.A01();
                                }
                                OMR omr2 = this.A02;
                                if (omr2 != null) {
                                    omr2.A04.A05(new Object());
                                    C0f9.A07(-2065037130, A00);
                                    return;
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        int A00 = C0f9.A00(-721187148);
        super.onStart();
        OMR omr = this.A02;
        String str = "presenterBridge";
        if (omr != null) {
            omr.A00();
            OMR omr2 = this.A02;
            if (omr2 != null) {
                omr2.A03(true);
                UserSession userSession = this.A01;
                if (userSession == null) {
                    str = "inCallUserSession";
                } else {
                    C55772hI.A00(userSession).A0D("ig_activity", this);
                    C226218q.A01(AbstractC12960li.A00).A0S((C49678Lx9) this.A08.getValue());
                    C0f9.A07(-203850566, A00);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        int A00 = C0f9.A00(1087097273);
        super.onStop();
        OMR omr = this.A02;
        if (omr != null) {
            omr.A03(false);
            OMR omr2 = this.A02;
            if (omr2 != null) {
                omr2.A01();
                C0f9.A07(-1178881364, A00);
                return;
            }
        }
        C14360o3.A0F("presenterBridge");
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        OMR omr = this.A02;
        if (omr == null) {
            C14360o3.A0F("presenterBridge");
            throw C00O.createAndThrow();
        }
        omr.A02.A00(new PB3(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.PlN, java.lang.Object] */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        OMR omr = this.A02;
        if (omr == null) {
            C14360o3.A0F("presenterBridge");
            throw C00O.createAndThrow();
        }
        omr.A04.A07(new Object());
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            Window window = getWindow();
            C14360o3.A07(window);
            AbstractC54158Nwu.A00(this, window);
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        C14360o3.A0B(configuration, 1);
        super.onPictureInPictureModeChanged(z, configuration);
        if (z) {
            setTheme(R.style.CallTheme);
        }
    }
}
