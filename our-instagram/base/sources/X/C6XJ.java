package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import java.util.Arrays;

/* renamed from: X.6XJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XJ {
    public static final int[] A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public C53S A01;
    public InterfaceC11380iw A02;
    public KFC A03;
    public Integer A04;
    public boolean A08;
    public boolean A09;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0G;
    public boolean A0I;
    public int[] A0J;
    public Integer A0K;
    public final Activity A0L;
    public final Bundle A0M;
    public final AbstractC12990ll A0N;
    public final String A0O;
    public final Class A0P;
    public boolean A07 = true;
    public boolean A0A = false;
    public String A06 = null;
    public boolean A0H = true;
    public boolean A0F = false;
    public int A00 = 0;
    public String A05 = "button";

    public final void A0B(Activity activity, Fragment fragment, C3AY[] c3ayArr, int i) {
        Intent A00 = A00(fragment.getContext());
        if (AbstractC13320mI.A00(fragment.getContext(), FragmentActivity.class) != null) {
            A04();
            KFC kfc = this.A03;
            if (kfc != null) {
                KFC.A00(kfc);
            }
            C12260kU.A00.A07().A0A(activity, A00, fragment, c3ayArr, i);
            return;
        }
        throw new IllegalStateException("Trying to start an activity from a fragment not hosted in a FragmentActivity");
    }

    static {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean z = C2U7.A00;
        if (z) {
            iArr = new int[]{R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit};
        } else {
            iArr = ModalActivity.A08;
        }
        A0S = iArr;
        if (z) {
            iArr2 = new int[]{R.anim.modal_slide_up_enter, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit};
        } else {
            iArr2 = ModalActivity.A08;
        }
        A0R = iArr2;
        if (z) {
            iArr3 = new int[]{R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out};
        } else {
            iArr3 = ModalActivity.A08;
        }
        A0Q = iArr3;
    }

    private Intent A00(Context context) {
        Intent putExtra = new Intent(context, (Class<?>) this.A0P).putExtra("fragment_name", this.A0O).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, this.A0M).putExtra("source_activity_arguments", this.A0L.getIntent().getExtras());
        String str = this.A06;
        if (str != null) {
            putExtra.putExtra("initial_fragment_backstack_name", str);
        }
        int[] iArr = this.A0J;
        if (iArr != null) {
            putExtra.putExtra("fragment_animation", iArr);
            if (Arrays.equals(iArr, ModalActivity.A08)) {
                putExtra.addFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
            }
        }
        putExtra.putExtra("translucent_navigation_bar", this.A0G);
        putExtra.putExtra("will_hide_system_ui", this.A0I);
        if (this.A0A) {
            putExtra.putExtra("do_not_inflate_action_bar", true);
        }
        if (this.A0D) {
            putExtra.addFlags(805306368);
        }
        if (this.A0E) {
            putExtra.addFlags(536870912);
        }
        if (!this.A07) {
            putExtra.addFlags(AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
        }
        if (this.A08) {
            putExtra.addFlags(335544320);
        }
        if (this.A09) {
            putExtra.addFlags(67108864);
        }
        putExtra.putExtra("will_fit_system_windows", this.A0H);
        putExtra.putExtra("will_hide_navigation_bar", this.A0B);
        putExtra.putExtra("display_cutout_mode", this.A00);
        Integer num = this.A0K;
        if (num != null) {
            putExtra.putExtra("status_bar_color", num);
        }
        Integer num2 = this.A04;
        if (num2 != null) {
            putExtra.putExtra("navigation_bar_color", num2);
        }
        putExtra.putExtra("lock_to_portrait", this.A0F);
        return putExtra;
    }

    public static C6XJ A01(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll) {
        C6XJ c6xj = new C6XJ(activity, bundle, abstractC12990ll, TransparentModalActivity.class, "reel_viewer");
        c6xj.A0J = ModalActivity.A08;
        if (!(abstractC12990ll instanceof UserSession)) {
            StringBuilder sb = new StringBuilder();
            sb.append("session is not instance of UserSession ");
            sb.append(abstractC12990ll);
            C0w9.A03("ModalActivityLauncher", sb.toString());
            return c6xj;
        }
        c6xj.A04 = -16777216;
        return c6xj;
    }

    public static C6XJ A02(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        C6XJ c6xj = new C6XJ(activity, bundle, abstractC12990ll, cls, str);
        if (!(abstractC12990ll instanceof UserSession)) {
            StringBuilder sb = new StringBuilder();
            sb.append("session is not instance of UserSession ");
            sb.append(abstractC12990ll);
            C0w9.A03("ModalActivityLauncher", sb.toString());
            return c6xj;
        }
        c6xj.A0C = true;
        c6xj.A0H = false;
        c6xj.A0B = true;
        c6xj.A09(0);
        c6xj.A04 = Integer.valueOf(activity.getColor(R.color.igds_transparent_navigation_bar));
        c6xj.A0F = true;
        return c6xj;
    }

    public static C6XJ A03(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        return new C6XJ(activity, bundle, abstractC12990ll, cls, str);
    }

    private void A04() {
        InterfaceC11380iw interfaceC11380iw = this.A02;
        AbstractC12990ll abstractC12990ll = this.A0N;
        if (interfaceC11380iw != null) {
            C55782hJ A00 = C55772hI.A00(abstractC12990ll);
            int backStackEntryCount = this.A0L.getFragmentManager().getBackStackEntryCount();
            A00.A0A(this.A01, interfaceC11380iw, this.A05, backStackEntryCount);
            return;
        }
        C55782hJ A002 = C55772hI.A00(abstractC12990ll);
        Activity activity = this.A0L;
        String str = this.A05;
        C53S c53s = this.A01;
        C14360o3.A0B(activity, 0);
        InterfaceC11380iw A01 = C150856qj.A01(activity);
        if (A01 == null) {
            return;
        }
        AbstractC10360h2 supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        C14360o3.A07(supportFragmentManager);
        A002.A0A(c53s, A01, str, supportFragmentManager.A0L());
    }

    public static void A05(Activity activity, Bundle bundle, Class cls, String str, int i) {
        C12260kU.A08(activity, new Intent(activity, (Class<?>) cls).putExtra("fragment_name", str).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, bundle), i);
    }

    public static void A06(Context context, Bundle bundle, Class cls, String str) {
        Intent putExtra = new Intent(context, (Class<?>) cls).putExtra("fragment_name", str).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, bundle);
        putExtra.setFlags(268435456);
        C12260kU.A0C(context, putExtra);
    }

    public final void A07() {
        this.A0J = A0R;
    }

    public final void A08() {
        this.A0J = A0S;
    }

    public final void A0E(InterfaceC1119353f interfaceC1119353f) {
        KFC kfc;
        if (interfaceC1119353f == null) {
            kfc = null;
        } else {
            kfc = new KFC(interfaceC1119353f);
        }
        this.A03 = kfc;
    }

    public C6XJ(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll, Class cls, String str) {
        this.A0N = abstractC12990ll;
        this.A0P = cls;
        this.A0O = str;
        this.A0M = bundle;
        this.A0L = activity;
        AbstractC03240Dh.A00(bundle, abstractC12990ll);
    }

    public final void A09(int i) {
        this.A0K = Integer.valueOf(i);
    }

    public final void A0A(Activity activity, int i) {
        Intent A00 = A00(activity);
        A04();
        KFC kfc = this.A03;
        if (kfc != null) {
            KFC.A00(kfc);
        }
        C12260kU.A08(activity, A00, i);
    }

    public final void A0C(Context context) {
        final Intent A00 = A00(context);
        if (AbstractC13320mI.A00(context, Activity.class) == null) {
            A00.addFlags(268435456);
        } else {
            Activity activity = (Activity) AbstractC13320mI.A00(context, Activity.class);
            if (activity.getParent() != null) {
                context = activity.getParent();
            }
        }
        A04();
        Bundle bundle = this.A0M;
        CameraConfiguration cameraConfiguration = (CameraConfiguration) bundle.getParcelable("camera_configuration");
        C22P c22p = (C22P) bundle.getSerializable("camera_entry_point");
        if (c22p == null) {
            c22p = (C22P) bundle.getSerializable("cameraEntryPoint");
        }
        if (cameraConfiguration != null && (cameraConfiguration.A03 instanceof C128535rM)) {
            MX1.A01((UserSession) this.A0N).A04(c22p);
        }
        KFC kfc = this.A03;
        if (kfc != null) {
            KFC.A00(kfc);
        }
        if (this.A0C) {
            C57982lB.A0B.A05(this.A0L, new Runnable() { // from class: X.WvK
                @Override // java.lang.Runnable
                public final void run() {
                    C6XJ c6xj = this;
                    Intent intent = A00;
                    if (C57992lC.A01() == 0) {
                        C0w9.A03(AbstractC111324zv.A00(3680), String.format("Status bar height is zero: %s: %s", AbstractC31173DnH.A0q(c6xj.A0L), c6xj.A0O));
                    }
                    C12260kU.A0C(c6xj.A0L, intent);
                }
            });
            return;
        }
        C12260kU.A0C(context, A00);
    }

    public final void A0D(Fragment fragment, int i) {
        Intent A00 = A00(fragment.getContext());
        if (AbstractC13320mI.A00(fragment.getContext(), FragmentActivity.class) != null) {
            A04();
            KFC kfc = this.A03;
            if (kfc != null) {
                KFC.A00(kfc);
            }
            C12260kU.A06(fragment, A00, i);
            return;
        }
        throw new IllegalStateException("Trying to start an activity from a fragment not hosted in a FragmentActivity");
    }
}
