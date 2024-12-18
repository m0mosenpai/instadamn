package X;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* loaded from: classes11.dex */
public final class V0A extends AbstractC59962oe {
    public static final Interpolator A09 = new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f);
    public static final String __redex_internal_original_name = "InstagramConsentFlowScreenFragment";
    public ViewGroup A00;
    public ViewGroup A01;
    public C69059VhA A02;
    public String A03;
    public Dialog A04;
    public String A05;
    public String A06;
    public final InterfaceC09390do A08 = AbstractC60492pY.A01(this);
    public final C57112jm A07 = C57112jm.A00();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "InstagramConsentFlowScreen";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A08.getValue();
    }

    public static final void A00(Window window, int i, boolean z) {
        if (window.getStatusBarColor() != i) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
        new C011904h(window.getDecorView(), window).A00.A05(!z);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(114450725);
        super.onCreate(bundle);
        String string = requireArguments().getString("prompt_id");
        if (string != null) {
            this.A05 = string;
            C69059VhA c69059VhA = (C69059VhA) AbstractC47895LDp.A01.get(string);
            if (c69059VhA == null) {
                String str = this.A05;
                if (str == null) {
                    C14360o3.A0F("promptId");
                    throw C00O.createAndThrow();
                }
                AbstractC53724NpD.A00(this, str);
            } else {
                this.A02 = c69059VhA;
            }
            C0f9.A09(178778179, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1217080254, A02);
        throw A0g;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [X.1Lf, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        View onCreateView;
        int i2;
        int A02 = C0f9.A02(-1562849136);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A02 == null) {
            onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            i2 = 625188659;
        } else {
            Context requireContext = requireContext();
            C69059VhA c69059VhA = this.A02;
            String str = "promptDisplayParameter";
            if (c69059VhA != null) {
                C1338462s c1338462s = c69059VhA.A01;
                if (c1338462s != null) {
                    C102884kP c102884kP = c69059VhA.A02;
                    if (c102884kP != null) {
                        String A0G = c102884kP.A0G();
                        if (A0G != null) {
                            this.A06 = A0G;
                            String A0F = c102884kP.A0F();
                            if (A0F == null) {
                                A0F = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                            }
                            this.A03 = A0F;
                            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A08.getValue();
                            C57112jm c57112jm = this.A07;
                            C6T7 A00 = C6T7.A00(requireContext, c1338462s, C62862tP.A03(this, abstractC12990ll, c57112jm)).A00();
                            C126545np c126545np = new C126545np(requireContext);
                            A00.A07(c126545np);
                            this.A00 = c126545np;
                            C71163Hc A002 = C71163Hc.A00(this);
                            ViewGroup viewGroup2 = this.A00;
                            str = "contentView";
                            if (viewGroup2 != null) {
                                c57112jm.A08(viewGroup2, A002, new InterfaceC57142jp[0]);
                                boolean A003 = AbstractC72723Nt.A00(requireContext);
                                ConstraintLayout constraintLayout = new ConstraintLayout(requireContext);
                                String str2 = this.A03;
                                if (str2 != null) {
                                    if (str2.equals("cds")) {
                                        EnumC191908em C73 = new Object().C73();
                                        int A03 = AbstractC25291Lj.A03(EnumC72394Xcg.A2M, A003);
                                        C66213U4j A004 = AbstractC68319VMf.A00(requireContext, C73, "0dp", A003);
                                        AbstractC31174DnI.A1C(constraintLayout, A03);
                                        constraintLayout.addView(A004);
                                    } else {
                                        C102884kP A08 = c102884kP.A08(140);
                                        int color = requireContext.getColor(R.color.direct_widget_primary_background);
                                        if (A08 != null) {
                                            int i3 = 36;
                                            if (A003) {
                                                i3 = 35;
                                            }
                                            String A0L = A08.A0L(i3);
                                            if (A0L != null) {
                                                color = C6BE.A03(A0L);
                                            }
                                        }
                                        AbstractC31174DnI.A1C(constraintLayout, color);
                                    }
                                    ViewGroup viewGroup3 = this.A00;
                                    if (viewGroup3 != null) {
                                        constraintLayout.addView(viewGroup3, new ViewGroup.LayoutParams(-1, -1));
                                        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                        this.A01 = constraintLayout;
                                        C57533Pg7 c57533Pg7 = new C57533Pg7(16, A00, this);
                                        getSession();
                                        U8B u8b = new U8B(requireContext, c1338462s, c102884kP.A0A(), c57533Pg7, new C50361MLn("InstagramConsentFlowScreen", 5));
                                        u8b.setCancelable(false);
                                        u8b.setContentView(constraintLayout, new ViewGroup.LayoutParams(-1, -1));
                                        this.A04 = u8b;
                                        Window window = u8b.getWindow();
                                        if (window != null) {
                                            View decorView = window.getDecorView();
                                            decorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                            decorView.setPadding(0, 0, 0, 0);
                                            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                                            layoutParams.copyFrom(window.getAttributes());
                                            ((ViewGroup.LayoutParams) layoutParams).width = -1;
                                            ((ViewGroup.LayoutParams) layoutParams).height = -1;
                                            window.setAttributes(layoutParams);
                                            window.setDimAmount(0.0f);
                                            boolean A005 = AbstractC72723Nt.A00(requireContext);
                                            int color2 = requireContext.getColor(R.color.direct_widget_primary_background);
                                            new C011904h(window.getDecorView(), window).A00.A04(!A005);
                                            if (window.getNavigationBarColor() != color2) {
                                                window.addFlags(Integer.MIN_VALUE);
                                                window.setNavigationBarColor(color2);
                                            }
                                            String str3 = this.A03;
                                            if (str3 != null) {
                                                if (str3.equals("cds")) {
                                                    ViewGroup viewGroup4 = this.A00;
                                                    if (viewGroup4 != null) {
                                                        AbstractC68320VMg.A00(viewGroup4, window);
                                                        A00(window, 0, A005);
                                                    }
                                                } else {
                                                    A00(window, color2, A005);
                                                }
                                            }
                                        }
                                        onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
                                        i2 = -1074684064;
                                    }
                                }
                                str = "containerTheme";
                            }
                        } else {
                            illegalStateException = new IllegalStateException("Required value was null.");
                            i = -1003718606;
                        }
                    } else {
                        illegalStateException = new IllegalStateException("Required value was null.");
                        i = -1110033837;
                    }
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i = -1601662244;
                }
                C0f9.A09(i, A02);
                throw illegalStateException;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C0f9.A09(i2, A02);
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        float[] fArr;
        String str;
        String str2;
        int A02 = C0f9.A02(937460073);
        super.onStart();
        if (this.A02 != null) {
            Context requireContext = requireContext();
            Dialog dialog = this.A04;
            if (dialog == null) {
                str2 = "fullScreenDialog";
            } else {
                ViewGroup viewGroup = this.A01;
                if (viewGroup == null) {
                    str2 = "screenView";
                } else {
                    String str3 = this.A06;
                    if (str3 == null) {
                        str2 = "screenType";
                    } else {
                        Interpolator interpolator = A09;
                        C14360o3.A0B(interpolator, 5);
                        if (!dialog.isShowing()) {
                            C0fJ.A00(dialog);
                            if (str3.equals("screen")) {
                                fArr = new float[]{AbstractC167007dF.A0K(requireContext).widthPixels, 0.0f};
                                str = "translationX";
                            } else if (str3.equals("modal")) {
                                fArr = new float[]{AbstractC167007dF.A0K(requireContext).heightPixels, 0.0f};
                                str = "translationY";
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, str, fArr);
                            ofFloat.setDuration(280L);
                            ofFloat.setInterpolator(interpolator);
                            ofFloat.start();
                        }
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        C0f9.A09(-1855840596, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        FragmentActivity activity;
        float[] fArr;
        String str;
        String str2;
        int A02 = C0f9.A02(-2027926198);
        if (this.A02 != null && this.mRemoving && (activity = getActivity()) != null && !activity.isDestroyed()) {
            Context requireContext = requireContext();
            FragmentActivity activity2 = getActivity();
            Dialog dialog = this.A04;
            if (dialog == null) {
                str2 = "fullScreenDialog";
            } else {
                ViewGroup viewGroup = this.A01;
                if (viewGroup == null) {
                    str2 = "screenView";
                } else {
                    String str3 = this.A06;
                    if (str3 == null) {
                        str2 = "screenType";
                    } else {
                        Interpolator interpolator = A09;
                        C14360o3.A0B(interpolator, 6);
                        ANB anb = new ANB(0, dialog, activity2);
                        if (str3.equals("screen")) {
                            fArr = new float[]{0.0f, AbstractC167007dF.A0K(requireContext).widthPixels};
                            str = "translationX";
                        } else if (str3.equals("modal")) {
                            fArr = new float[]{0.0f, AbstractC167007dF.A0K(requireContext).heightPixels};
                            str = "translationY";
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, str, fArr);
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(interpolator);
                        ofFloat.addListener(anb);
                        ofFloat.start();
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        super.onStop();
        C0f9.A09(-1866191922, A02);
    }
}
