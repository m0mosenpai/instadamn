package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;

/* renamed from: X.Uzr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67860Uzr extends AbstractC72463Mt {
    public static final String __redex_internal_original_name = "InstagramConsentFlowDialogFragment";
    public C69059VhA A00;
    public C62862tP A01;
    public C6T7 A02;
    public final InterfaceC09390do A04 = AbstractC60492pY.A01(this);
    public final C57112jm A03 = C57112jm.A00();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "InstagramConsentFlowDialog";
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [X.1Lf, java.lang.Object] */
    @Override // X.C0SG
    public final Dialog A0F(Bundle bundle) {
        String str;
        float f;
        String str2;
        String str3;
        String str4;
        Drawable drawable;
        InterfaceC103384lE interfaceC103384lE;
        Context requireContext = requireContext();
        if (this.A00 != null) {
            A0D(false);
            C6T7 c6t7 = this.A02;
            if (c6t7 != null) {
                C69059VhA c69059VhA = this.A00;
                if (c69059VhA != null) {
                    C102884kP c102884kP = c69059VhA.A02;
                    DisplayMetrics displayMetrics = AbstractC166997dE.A0N(this).getDisplayMetrics();
                    C14360o3.A07(displayMetrics);
                    int i = displayMetrics.widthPixels;
                    if (c102884kP == null || (str = c102884kP.A0I()) == null) {
                        str = "10%";
                    }
                    try {
                        if (str.endsWith("%")) {
                            f = (C6BE.A00(str) / 100.0f) * displayMetrics.widthPixels;
                        } else {
                            f = C6BE.A01(str);
                        }
                    } catch (C41M e) {
                        C0K8.A0J("ConsentFlowDialogUtil", AnonymousClass001.A0R("Cannot parse borderWidth: ", str), e);
                        f = displayMetrics.widthPixels * 0.1f;
                    }
                    int i2 = i - (((int) f) * 2);
                    C57238PbM c57238PbM = new C57238PbM(c6t7, 42);
                    C69059VhA c69059VhA2 = this.A00;
                    if (c69059VhA2 != null) {
                        C1338462s c1338462s = c69059VhA2.A01;
                        String str5 = null;
                        C126545np c126545np = new C126545np(requireContext);
                        c6t7.A07(c126545np);
                        AbstractC37301Gc2.A0v(c126545np, this.A03, this);
                        boolean A00 = AbstractC72723Nt.A00(requireContext);
                        ConstraintLayout constraintLayout = new ConstraintLayout(requireContext);
                        if (c102884kP != null) {
                            str2 = c102884kP.A0F();
                        } else {
                            str2 = null;
                        }
                        constraintLayout.setMaxHeight(AbstractC68321VMh.A00(str2, Integer.MAX_VALUE));
                        if (c102884kP != null) {
                            str3 = c102884kP.A0J();
                        } else {
                            str3 = null;
                        }
                        constraintLayout.setMinHeight(AbstractC68321VMh.A00(str3, 0));
                        C56302iJ c56302iJ = new C56302iJ(-1, 0);
                        c56302iJ.A0c = constraintLayout.A03;
                        c56302iJ.A0e = constraintLayout.A05;
                        if (c102884kP != null) {
                            str5 = c102884kP.A0K();
                        }
                        if (C14360o3.A0K(str5, "cds")) {
                            float f2 = 8.0f;
                            if (c102884kP != null) {
                                f2 = c102884kP.A02(35, 8.0f);
                            }
                            EnumC191908em C73 = new Object().C73();
                            int A03 = AbstractC25291Lj.A03(EnumC72394Xcg.A2M, A00);
                            StringBuilder sb = new StringBuilder();
                            sb.append(f2);
                            C66213U4j A002 = AbstractC68319VMf.A00(requireContext, C73, AbstractC166997dE.A0x("dp", sb), A00);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(A03);
                            gradientDrawable.setCornerRadius(VSI.A00(requireContext, f2));
                            constraintLayout.addView(A002, c56302iJ);
                            drawable = gradientDrawable;
                        } else {
                            int color = requireContext.getColor(R.color.direct_widget_primary_background);
                            C102884kP c102884kP2 = null;
                            if (c102884kP != null) {
                                str4 = c102884kP.A0K();
                            } else {
                                str4 = null;
                            }
                            if (C14360o3.A0K(str4, "cds")) {
                                drawable = new ColorDrawable(0);
                            } else {
                                GradientDrawable gradientDrawable2 = new GradientDrawable();
                                if (c102884kP != null) {
                                    c102884kP2 = c102884kP.A08(140);
                                }
                                if (c102884kP2 != null) {
                                    int i3 = 36;
                                    if (A00) {
                                        i3 = 35;
                                    }
                                    String A0L = c102884kP2.A0L(i3);
                                    if (A0L != null) {
                                        color = C6BE.A03(A0L);
                                    }
                                }
                                gradientDrawable2.setColor(color);
                                float f3 = 8.0f;
                                if (c102884kP != null) {
                                    f3 = c102884kP.A02(35, 8.0f);
                                }
                                gradientDrawable2.setCornerRadius(VSI.A00(requireContext, f3));
                                drawable = gradientDrawable2;
                            }
                        }
                        constraintLayout.setBackground(drawable);
                        constraintLayout.addView(c126545np, c56302iJ);
                        C68686VaM c68686VaM = new C68686VaM(this);
                        if (c102884kP != null) {
                            interfaceC103384lE = c102884kP.A09();
                        } else {
                            interfaceC103384lE = null;
                        }
                        U8A u8a = new U8A(requireContext, c68686VaM, c1338462s, interfaceC103384lE, c57238PbM);
                        u8a.setCanceledOnTouchOutside(false);
                        u8a.setContentView(constraintLayout);
                        Window window = u8a.getWindow();
                        if (window != null) {
                            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                            layoutParams.copyFrom(window.getAttributes());
                            ((ViewGroup.LayoutParams) layoutParams).width = i2;
                            ((ViewGroup.LayoutParams) layoutParams).height = -2;
                            window.setAttributes(layoutParams);
                            window.setBackgroundDrawableResource(android.R.color.transparent);
                            return u8a;
                        }
                        return u8a;
                    }
                }
                C14360o3.A0F("promptDisplayParameter");
                throw C00O.createAndThrow();
            }
            C0K8.A0C(__redex_internal_original_name, "Got a null BloksParseResult");
        }
        return new Dialog(requireContext);
    }

    @Override // X.AbstractC72463Mt
    public final AbstractC12990ll A0M() {
        return (AbstractC12990ll) this.A04.getValue();
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1185091852);
        super.onCreate(bundle);
        this.A01 = C62862tP.A03(this, (AbstractC12990ll) this.A04.getValue(), this.A03);
        String string = requireArguments().getString("prompt_id");
        if (string != null) {
            C69059VhA c69059VhA = (C69059VhA) AbstractC47895LDp.A01.get(string);
            if (c69059VhA == null) {
                AbstractC53724NpD.A00(this, string);
            } else {
                this.A00 = c69059VhA;
                C1338462s c1338462s = c69059VhA.A01;
                if (c1338462s != null) {
                    Context requireContext = requireContext();
                    C62862tP c62862tP = this.A01;
                    if (c62862tP == null) {
                        C14360o3.A0F("bloksHost");
                        throw C00O.createAndThrow();
                    }
                    this.A02 = C6T7.A00(requireContext, c1338462s, c62862tP).A00();
                }
            }
            C0f9.A09(-656931485, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(483051589, A02);
        throw A0g;
    }
}
