package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2AU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AU extends C2AV implements InterfaceC12850lX, InterfaceC13000lm {
    public static final C2AW A08 = new Object();
    public Activity A00;
    public String A01;
    public boolean A02;
    public final C46202Ae A03;
    public final C25671My A04;
    public final InterfaceC41501vz A05;
    public final AbstractC12990ll A06;
    public final java.util.Set A07;

    @Override // X.InterfaceC12850lX
    public final void Cuw(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cux(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cuy(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv0(Activity activity) {
        C3DN A00;
        C14360o3.A0B(activity, 0);
        C0K8.A0D("RageShakeSensorHelper", "onActivityPause");
        A05();
        if (super.A01 && (A00 = C3DN.A00.A00(activity)) != null && ((C3DP) A00).A0h) {
            A00.A0B();
        }
        this.A00 = null;
    }

    @Override // X.InterfaceC12850lX
    public final void Cv5(Activity activity) {
        C14360o3.A0B(activity, 0);
        C0K8.A0D("RageShakeSensorHelper", "onActivityResume");
        if (activity instanceof FragmentActivity) {
            this.A00 = activity;
            if (A01(this)) {
                A04();
            }
        }
    }

    @Override // X.InterfaceC12850lX
    public final void Cv6(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv7(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv8(Activity activity, boolean z) {
    }

    public static final void A00(C2AU c2au) {
        C0K8.A0D("RageShakeSensorHelper", "enableOrDisableRageShakeListener start");
        if (A01(c2au)) {
            c2au.A04();
        } else {
            c2au.A05();
        }
    }

    public static final boolean A01(C2AU c2au) {
        String str;
        String str2;
        AbstractC12990ll abstractC12990ll = c2au.A06;
        Activity activity = c2au.A00;
        if ((abstractC12990ll instanceof C07270a1) && C1AD.A06(C06090Tz.A05, 18311713325594269L)) {
            return true;
        }
        if (abstractC12990ll != null && activity != null) {
            if (AbstractC46222Ag.A00()) {
                C0K8.A0P("RageShakeEligibilityHelper", "DeviceExclusion | model=%s | build=%s", Build.MODEL, Build.MANUFACTURER);
                return false;
            }
            if (abstractC12990ll instanceof UserSession) {
                UserSession userSession = (UserSession) abstractC12990ll;
                if (C1C0.A00(userSession)) {
                    str2 = "Enabling rageshake for employee";
                } else if (C3K5.A00(userSession)) {
                    str2 = "Showing public rageshake flow";
                }
                C0K8.A0D("RageShakeEligibilityHelper", str2);
                return true;
            }
            str = "Disabling rageshake.";
        } else {
            str = "User not logged in or null activity or disable shake experiment";
        }
        C0K8.A0D("RageShakeEligibilityHelper", str);
        return false;
    }

    public static final boolean A02(C2AU c2au, boolean z) {
        C0SG c0sg;
        UserSession userSession;
        String A0V;
        C2AU c2au2;
        C38321qM c38321qM;
        String str;
        C0K8.A0D("RageShakeSensorHelper", "displayRageShakeDialog started");
        if (c2au.A00 == null) {
            C0K8.A0D("RageShakeSensorHelper", "displayRageShakeDialog | no activity or context");
            if (c2au.A00 == null) {
                str = "Activity is null. ";
            } else {
                str = "";
            }
            C0w9.A04("RageShakeSensorHelper", AnonymousClass001.A0u("Cannot displayRageShakeDialog. ", str, " for module ", C26771Rh.A00().A00), 1);
            return false;
        }
        C0K8.A0D("RageShakeSensorHelper", "displayRageShakeDialog | bottom sheet will open");
        Activity activity = c2au.A00;
        if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            Window window = activity.getWindow();
            if (window != null) {
                IBinder windowToken = window.getDecorView().getRootView().getWindowToken();
                if (inputMethodManager != null && windowToken != null) {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                }
            }
        }
        c2au.A02 = false;
        for (C147246k9 c147246k9 : c2au.A07) {
            InterfaceC1118853a interfaceC1118853a = c147246k9.A02;
            C41181vS AuU = interfaceC1118853a.AuU();
            InterfaceC143576dw Av7 = interfaceC1118853a.Av7();
            if (AuU != null) {
                if (AuU.A1v(EnumC75383a5.A0w) && (Av7 instanceof C143556du) && ((C143556du) Av7).A1n.A01.getVisibility() == 0) {
                    InterfaceC143576dw Av72 = interfaceC1118853a.Av7();
                    C14360o3.A0C(Av72, "null cannot be cast to non-null type com.instagram.reels.viewer.ReelViewerItemViewHolder");
                    C143556du c143556du = (C143556du) Av72;
                    C2AU c2au3 = (C2AU) c147246k9.A00.A00(C2AU.class);
                    if (c2au3 != null) {
                        c2au3.A02 = true;
                    }
                    interfaceC1118853a.EJE("polaroid_shake_to_reveal");
                    P9D p9d = new P9D(c147246k9);
                    c143556du.A1m.A00(true);
                    C41181vS AuU2 = interfaceC1118853a.AuU();
                    C144506fW c144506fW = c143556du.A1n;
                    if (AuU2 != null) {
                        c38321qM = AuU2.A0b;
                    } else {
                        c38321qM = null;
                    }
                    c144506fW.A00(c38321qM, c147246k9.A01, p9d, false);
                } else if (AuU.CdW() && (A0V = AuU.A0V((userSession = c147246k9.A00))) != null && (c2au2 = (C2AU) userSession.A00(C2AU.class)) != null) {
                    c2au2.A01 = A0V;
                }
            }
            interfaceC1118853a.EJE("rage_shake_dialog");
        }
        if (c2au.A02) {
            c2au.A02 = false;
            return false;
        }
        AbstractC12990ll abstractC12990ll = c2au.A06;
        Activity activity2 = c2au.A00;
        if (activity2 != null) {
            String str2 = c2au.A01;
            PHQ phq = new PHQ(c2au);
            C14360o3.A0B(abstractC12990ll, 0);
            C0K8.A0D("RageShakeDialogProviderImpl", "openBottomSheet start");
            C3DN A00 = C3DN.A00.A00(activity2);
            C189448aO c189448aO = new C189448aO(abstractC12990ll);
            c189448aO.A0T = phq;
            C189478aR A002 = c189448aO.A00();
            boolean z2 = false;
            if (activity2 instanceof FragmentActivity) {
                AbstractC10360h2 abstractC10360h2 = ((FragmentActivity) activity2).mFragments.A00.A03;
                C14360o3.A07(abstractC10360h2);
                List A04 = abstractC10360h2.A0U.A04();
                C14360o3.A07(A04);
                Iterator it = AbstractC001800i.A0Y(A04).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Fragment fragment = (Fragment) it.next();
                    if ((fragment instanceof C0SG) && (c0sg = (C0SG) fragment) != null && c0sg.A07) {
                        c0sg.A07();
                        z2 = true;
                        break;
                    }
                }
            }
            if (A00 != null) {
                C3DP c3dp = (C3DP) A00;
                if (c3dp.A0h) {
                    C7XU c7xu = c3dp.A0H;
                    C52776NXh c52776NXh = null;
                    if (A00.A09() != null && (A00.A09() instanceof BottomSheetFragment)) {
                        Fragment A09 = A00.A09();
                        C14360o3.A0C(A09, "null cannot be cast to non-null type com.instagram.igds.components.bottomsheet.BottomSheetFragment");
                        C189478aR c189478aR = ((BottomSheetFragment) A09).A02;
                        if (c189478aR != null && c189478aR.A03.A0M() != null) {
                            BottomSheetFragment bottomSheetFragment = c189478aR.A03;
                            if (bottomSheetFragment.A0M() instanceof C52776NXh) {
                                c52776NXh = (C52776NXh) bottomSheetFragment.A0M();
                            }
                        }
                    }
                    c3dp.A0H = new GHF(activity2, c52776NXh, abstractC12990ll, A002, c7xu, str2, z);
                    A00.A0B();
                    C0K8.A0D("RageShakeDialogProviderImpl", "openBottomSheet | navigator dismissed");
                    return true;
                }
            }
            C0K8.A0D("RageShakeDialogProviderImpl", "openBottomSheet | open with no previous bottom sheet navigator showing");
            F0E.A00(activity2, abstractC12990ll, A002, str2, C55782hJ.A0S.A01(abstractC12990ll), C1QM.A00.A02.A00, z, z2);
            return true;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C2AV
    public final void A06() {
        boolean z = C1KM.A08;
        if (C1KT.A05) {
            String str = ((C1KP) C1KT.A02).A01;
            long uptimeMillis = SystemClock.uptimeMillis();
            C1KT.A02(new C1KO(str, uptimeMillis, uptimeMillis));
        }
        if (C1KM.A08) {
            String str2 = ((C1KP) C1KM.A00()).A01;
            long uptimeMillis2 = SystemClock.uptimeMillis();
            C1KM.A06(new C1KO(str2, uptimeMillis2, uptimeMillis2));
        }
    }

    public C2AU(Context context, AbstractC12990ll abstractC12990ll) {
        super(context);
        this.A06 = abstractC12990ll;
        this.A04 = AbstractC25651Mw.A00(abstractC12990ll);
        this.A07 = new HashSet();
        this.A03 = new C46202Ae();
        this.A05 = new InterfaceC41501vz() { // from class: X.2Af
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1185966291);
                int A032 = C0f9.A03(563460610);
                C2AU.A00(C2AU.this);
                C0f9.A0A(136091426, A032);
                C0f9.A0A(1877495843, A03);
            }
        };
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A05();
        AbstractC12860lY.A08(this);
        this.A04.A02(this.A05, C46252Al.class);
        this.A00 = null;
    }
}
