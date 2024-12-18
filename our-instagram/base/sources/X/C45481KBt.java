package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.igds.components.button.IgdsButton;
import java.util.concurrent.TimeUnit;

/* renamed from: X.KBt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45481KBt extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CustomThemePreviewFragment";
    public int A00;
    public TextView A01;
    public ComposeView A02;
    public ConstraintLayout A03;
    public IgLinearLayout A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgView A0B;
    public IgView A0C;
    public InterfaceC50459MPn A0D;
    public C7IM A0E;
    public DirectThreadThemeInfo A0F;
    public IgdsButton A0G;
    public IgdsButton A0H;
    public C3o9 A0I;
    public C6WQ A0J;
    public String A0L;
    public boolean A0M;
    public Integer A0K = C05F.A00;
    public final InterfaceC09390do A0N = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int intValue = this.A0K.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                interfaceC56362iU.EkF(false);
                return;
            }
            interfaceC56362iU.Efu(2131957378);
            interfaceC56362iU.EkS(false);
            C7IM c7im = this.A0E;
            if (c7im != null) {
                interfaceC56362iU.EPD(new ColorDrawable(c7im.A04.A00));
                interfaceC56362iU.EgR(AbstractC56402iY.A01(getActivity()));
                C110964z8 c110964z8 = new C110964z8();
                c110964z8.A0I(this.A03);
                c110964z8.A0E(R.id.preview_message_1, 3, R.id.preview_thread, 3, interfaceC56362iU.AYS());
                c110964z8.A0G(this.A03);
                return;
            }
        } else {
            interfaceC56362iU.EkS(true);
            interfaceC56362iU.Efu(2131957378);
            C7IM c7im2 = this.A0E;
            if (c7im2 != null) {
                interfaceC56362iU.EPD(new ColorDrawable(c7im2.A04.A00));
                return;
            }
        }
        C14360o3.A0F("themeToUse");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        IgTextView igTextView;
        CharSequence charSequence;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CharSequence charSequence2 = null;
        C6WQ c6wq = new C6WQ(requireContext(), true);
        this.A0J = c6wq;
        AbstractC31176DnK.A13(requireContext(), c6wq);
        this.A0C = (IgView) view.requireViewById(R.id.top_gradient);
        this.A0B = (IgView) view.requireViewById(R.id.bottom_gradient);
        this.A04 = (IgLinearLayout) view.requireViewById(R.id.title_bar);
        this.A0A = AbstractC31172DnG.A0X(view, R.id.title_text);
        this.A09 = AbstractC31172DnG.A0X(view, R.id.subtitle_text);
        this.A0G = AbstractC31173DnH.A0W(view, R.id.cancel_button);
        this.A0H = AbstractC31173DnH.A0W(view, R.id.set_button);
        this.A03 = (ConstraintLayout) view.requireViewById(R.id.preview_thread);
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.preview_message_1);
        this.A05 = A0X;
        Integer num = this.A0K;
        Integer num2 = C05F.A01;
        if (num == num2 && A0X != null) {
            Resources resources = A0X.getResources();
            if (resources != null) {
                charSequence = resources.getText(2131957372);
            } else {
                charSequence = null;
            }
            A0X.setText(charSequence);
        }
        this.A06 = AbstractC31172DnG.A0X(view, R.id.preview_message_2);
        this.A07 = AbstractC31172DnG.A0X(view, R.id.preview_message_3);
        IgTextView A0X2 = AbstractC31172DnG.A0X(view, R.id.preview_message_4);
        this.A08 = A0X2;
        if (this.A0K == num2 && A0X2 != null) {
            Resources resources2 = A0X2.getResources();
            if (resources2 != null) {
                charSequence2 = resources2.getText(2131957377);
            }
            A0X2.setText(charSequence2);
        }
        this.A01 = AbstractC166997dE.A0T(view, R.id.preview_timestamp);
        Integer num3 = this.A0K;
        Integer num4 = C05F.A0C;
        if (num3 == num4) {
            this.A02 = (ComposeView) view.requireViewById(R.id.create_button);
        }
        AnonymousClass988 A0a = AbstractC43594JPz.A0a(AbstractC166987dD.A0r(this.A0N), AnonymousClass988.A1Z);
        boolean A00 = AbstractC72723Nt.A00(requireActivity());
        this.A0M = A00;
        Context requireContext = requireContext();
        Integer num5 = num2;
        if (A00) {
            num5 = num4;
        }
        DirectThreadThemeInfo directThreadThemeInfo = this.A0F;
        if (directThreadThemeInfo == null) {
            C14360o3.A0F("themeInfo");
            throw C00O.createAndThrow();
        }
        C7IM A01 = C7ID.A00.A01(requireContext, A0a, directThreadThemeInfo, num5);
        this.A0E = A01;
        IgTextView igTextView2 = this.A05;
        if (igTextView2 != null) {
            igTextView2.setBackground(A01.A03.A04());
            IgTextView igTextView3 = this.A06;
            if (igTextView3 != null) {
                C7IM c7im = this.A0E;
                if (c7im != null) {
                    igTextView3.setBackground(c7im.A03.A04());
                    IgTextView igTextView4 = this.A07;
                    if (igTextView4 != null) {
                        C7IM c7im2 = this.A0E;
                        if (c7im2 != null) {
                            igTextView4.setBackground(c7im2.A03.A04());
                            IgTextView igTextView5 = this.A08;
                            if (igTextView5 != null) {
                                C7IM c7im3 = this.A0E;
                                if (c7im3 != null) {
                                    igTextView5.setBackground(c7im3.A03.A04());
                                    IgdsButton igdsButton = this.A0G;
                                    if (igdsButton != null) {
                                        ViewOnClickListenerC48072LPx.A01(igdsButton, 36, this);
                                        if (this.A0K != num4) {
                                            IgdsButton igdsButton2 = this.A0H;
                                            if (igdsButton2 != null) {
                                                ViewOnClickListenerC48072LPx.A01(igdsButton2, 37, this);
                                            } else {
                                                throw AbstractC166987dD.A14("Required value was null.");
                                            }
                                        }
                                        if (this.A0K == num4) {
                                            ConstraintLayout constraintLayout = this.A03;
                                            if (constraintLayout != null) {
                                                C7IM c7im4 = this.A0E;
                                                if (c7im4 != null) {
                                                    constraintLayout.setBackgroundColor(c7im4.A04.A00);
                                                }
                                            }
                                            AbstractC167007dF.A0x(this.A0H);
                                            ComposeView composeView = this.A02;
                                            if (composeView != null) {
                                                composeView.setVisibility(0);
                                            }
                                            ComposeView composeView2 = this.A02;
                                            if (composeView2 != null) {
                                                composeView2.setContent(C5UA.A04(new C30190DRv(this, 36), 107826460, true));
                                            }
                                            IgTextView igTextView6 = this.A08;
                                            if (igTextView6 != null) {
                                                AbstractC166987dD.A1P(requireContext(), igTextView6, 2131957376);
                                            }
                                            C110964z8 c110964z8 = new C110964z8();
                                            c110964z8.A0I(this.A03);
                                            c110964z8.A0E(R.id.cancel_button, 4, R.id.preview_thread, 4, C30D.A00);
                                            c110964z8.A0E(R.id.create_button, 4, R.id.preview_thread, 4, C30D.A00);
                                            c110964z8.A0G(this.A03);
                                        }
                                        C14120nc.A00().ATO(new KLQ(this));
                                        FragmentActivity requireActivity = requireActivity();
                                        C7IM c7im5 = this.A0E;
                                        if (c7im5 != null) {
                                            AbstractC56402iY.A02(requireActivity, c7im5.A04.A00);
                                            C7IM c7im6 = this.A0E;
                                            if (c7im6 != null) {
                                                C30D.A04(requireActivity, c7im6.A04.A05);
                                                Integer num6 = this.A0K;
                                                Integer num7 = C05F.A00;
                                                if (num6 == num7) {
                                                    C7IM c7im7 = this.A0E;
                                                    if (c7im7 != null) {
                                                        C7IH c7ih = c7im7.A04;
                                                        IgView igView = this.A0C;
                                                        if (igView != null) {
                                                            IgView igView2 = this.A0B;
                                                            if (igView2 != null) {
                                                                igView.setVisibility(0);
                                                                igView2.setVisibility(0);
                                                                int i = c7ih.A00;
                                                                int i2 = c7ih.A05;
                                                                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                                                GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i, 0});
                                                                GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{0, i2});
                                                                igView.setBackground(gradientDrawable);
                                                                igView2.setBackground(gradientDrawable2);
                                                            } else {
                                                                throw AbstractC166987dD.A14("Required value was null.");
                                                            }
                                                        } else {
                                                            throw AbstractC166987dD.A14("Required value was null.");
                                                        }
                                                    }
                                                } else if (num6 == num2) {
                                                    IgView igView3 = this.A0C;
                                                    IgView igView4 = this.A0B;
                                                    if (igView3 != null && igView4 != null) {
                                                        DirectThreadThemeInfo directThreadThemeInfo2 = this.A0F;
                                                        String str2 = "themeInfo";
                                                        if (directThreadThemeInfo2 != null) {
                                                            if (this.A0M) {
                                                                str = directThreadThemeInfo2.A0h;
                                                            } else {
                                                                str = directThreadThemeInfo2.A0m;
                                                            }
                                                            if (str != null) {
                                                                ViewGroup.LayoutParams layoutParams = igView3.getLayoutParams();
                                                                if (layoutParams != null) {
                                                                    layoutParams.height = AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.abc_dialog_padding_material);
                                                                }
                                                                ViewGroup.LayoutParams layoutParams2 = igView4.getLayoutParams();
                                                                if (layoutParams2 != null) {
                                                                    layoutParams2.height = AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.abc_dialog_padding_material);
                                                                }
                                                                C110964z8 c110964z82 = new C110964z8();
                                                                c110964z82.A0I(this.A03);
                                                                c110964z82.A09(igView3.getId(), 4);
                                                                c110964z82.A09(igView4.getId(), 3);
                                                                c110964z82.A0G(this.A03);
                                                                C7IM c7im8 = this.A0E;
                                                                if (c7im8 == null) {
                                                                    str2 = "themeToUse";
                                                                } else {
                                                                    int i3 = c7im8.A04.A00;
                                                                    DirectThreadThemeInfo directThreadThemeInfo3 = this.A0F;
                                                                    if (directThreadThemeInfo3 != null) {
                                                                        int A002 = C7IG.A00(directThreadThemeInfo3, this.A0M);
                                                                        int A06 = AbstractC56842jH.A06(i3, 204);
                                                                        int A062 = AbstractC56842jH.A06(A002, 204);
                                                                        GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
                                                                        GradientDrawable gradientDrawable3 = new GradientDrawable(orientation2, new int[]{i3, A06, 0});
                                                                        GradientDrawable gradientDrawable4 = new GradientDrawable(orientation2, new int[]{0, A062, A002});
                                                                        igView3.setBackground(gradientDrawable3);
                                                                        igView4.setBackground(gradientDrawable4);
                                                                        igView3.setVisibility(0);
                                                                        igView4.setVisibility(0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        C14360o3.A0F(str2);
                                                        throw C00O.createAndThrow();
                                                    }
                                                }
                                                C7IM c7im9 = this.A0E;
                                                if (c7im9 != null) {
                                                    if (this.A0K == num2) {
                                                        IgTextView igTextView7 = this.A0A;
                                                        String str3 = "themeInfo";
                                                        if (igTextView7 != null) {
                                                            Context requireContext2 = requireContext();
                                                            DirectThreadThemeInfo directThreadThemeInfo4 = this.A0F;
                                                            if (directThreadThemeInfo4 != null) {
                                                                AbstractC31177DnL.A0r(requireContext2, igTextView7, directThreadThemeInfo4.A0f, 2131960714);
                                                            }
                                                            C14360o3.A0F(str3);
                                                            throw C00O.createAndThrow();
                                                        }
                                                        IgTextView igTextView8 = this.A0A;
                                                        if (igTextView8 != null) {
                                                            igTextView8.setVisibility(0);
                                                        }
                                                        DirectThreadThemeInfo directThreadThemeInfo5 = this.A0F;
                                                        if (directThreadThemeInfo5 != null) {
                                                            String str4 = directThreadThemeInfo5.A0k;
                                                            if (str4 != null) {
                                                                C7IM c7im10 = this.A0E;
                                                                str3 = "themeToUse";
                                                                if (c7im10 != null) {
                                                                    int i4 = c7im10.A04.A03;
                                                                    if (i4 != 0 && (igTextView = this.A09) != null) {
                                                                        igTextView.setTextColor(i4);
                                                                    }
                                                                    IgTextView igTextView9 = this.A09;
                                                                    if (igTextView9 != null) {
                                                                        igTextView9.setText(str4);
                                                                    }
                                                                    IgTextView igTextView10 = this.A09;
                                                                    if (igTextView10 != null) {
                                                                        igTextView10.setVisibility(0);
                                                                    }
                                                                }
                                                            }
                                                            IgLinearLayout igLinearLayout = this.A04;
                                                            if (igLinearLayout != null) {
                                                                igLinearLayout.setVisibility(0);
                                                            }
                                                        }
                                                        C14360o3.A0F(str3);
                                                        throw C00O.createAndThrow();
                                                    }
                                                    int i5 = c7im9.A05.A04;
                                                    IgTextView igTextView11 = this.A05;
                                                    if (igTextView11 != null) {
                                                        igTextView11.setTextColor(i5);
                                                    }
                                                    IgTextView igTextView12 = this.A05;
                                                    if (igTextView12 != null) {
                                                        Drawable background = igTextView12.getBackground();
                                                        A00(background, C7R2.A03, c7im9, true);
                                                        igTextView12.setBackground(background);
                                                    }
                                                    IgTextView igTextView13 = this.A05;
                                                    if (igTextView13 != null) {
                                                        igTextView13.post(new RunnableC49865M0k(igTextView13));
                                                    }
                                                    IgTextView igTextView14 = this.A06;
                                                    if (igTextView14 != null) {
                                                        igTextView14.setTextColor(i5);
                                                    }
                                                    IgTextView igTextView15 = this.A06;
                                                    if (igTextView15 != null) {
                                                        Drawable background2 = igTextView15.getBackground();
                                                        A00(background2, C7R2.A02, c7im9, true);
                                                        igTextView15.setBackground(background2);
                                                    }
                                                    IgTextView igTextView16 = this.A06;
                                                    if (igTextView16 != null) {
                                                        igTextView16.post(new RunnableC49865M0k(igTextView16));
                                                    }
                                                    IgTextView igTextView17 = this.A07;
                                                    if (igTextView17 != null) {
                                                        igTextView17.setTextColor(c7im9.A06.A04);
                                                    }
                                                    IgTextView igTextView18 = this.A07;
                                                    if (igTextView18 != null) {
                                                        Drawable background3 = igTextView18.getBackground();
                                                        A00(background3, C7R2.A05, c7im9, false);
                                                        igTextView18.setBackground(background3);
                                                    }
                                                    IgTextView igTextView19 = this.A08;
                                                    if (igTextView19 != null) {
                                                        igTextView19.setTextColor(i5);
                                                    }
                                                    IgTextView igTextView20 = this.A08;
                                                    if (igTextView20 != null) {
                                                        Drawable background4 = igTextView20.getBackground();
                                                        A00(background4, C7R2.A05, c7im9, true);
                                                        igTextView20.setBackground(background4);
                                                    }
                                                    IgTextView igTextView21 = this.A08;
                                                    if (igTextView21 != null) {
                                                        igTextView21.post(new RunnableC49865M0k(igTextView21));
                                                    }
                                                    TextView textView = this.A01;
                                                    if (textView != null) {
                                                        textView.setText(AbstractC162607Px.A00(requireContext(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis())));
                                                    }
                                                    if (this.A0K == num7) {
                                                        TextView textView2 = this.A01;
                                                        if (textView2 != null) {
                                                            AnonymousClass775.A00(textView2, true);
                                                            return;
                                                        }
                                                        throw AbstractC166987dD.A14("Required value was null.");
                                                    }
                                                    TextView textView3 = this.A01;
                                                    if (textView3 == null) {
                                                        return;
                                                    }
                                                    textView3.setTextColor(c7im9.A00);
                                                    return;
                                                }
                                            }
                                        }
                                        C14360o3.A0F("themeToUse");
                                        throw C00O.createAndThrow();
                                    }
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                C14360o3.A0F("themeToUse");
                throw C00O.createAndThrow();
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A00(Drawable drawable, C7R2 c7r2, C7IM c7im, boolean z) {
        c7im.A05.A00(drawable, null, c7r2, z, false, false, false, false);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0N);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1447331178);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0L = AbstractC153636vY.A01(requireArguments, "ARGUMENT_UPLOAD_ID");
        this.A0I = (C3o9) requireArguments.getParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_KEY");
        this.A0F = (DirectThreadThemeInfo) AbstractC153636vY.A00(requireArguments, DirectThreadThemeInfo.class, "ARGUEMENT_THEME");
        this.A00 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_AUDIENCE_TYPE", 0);
        this.A0K = C05F.A00(3)[requireArguments.getInt("ARGUMENT_PREVIEW_TYPE")];
        requireArguments.getBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_IN_ACCOUNT_THEME_PICKER_MODE", false);
        C0f9.A09(343305935, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1702803658);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_custom_theme_fragment, viewGroup, false);
        C0f9.A09(-523516044, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1122415197);
        super.onDestroyView();
        this.A0C = null;
        this.A0B = null;
        this.A0G = null;
        this.A0H = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = null;
        this.A06 = null;
        this.A01 = null;
        this.A07 = null;
        this.A08 = null;
        this.A04 = null;
        this.A0A = null;
        this.A09 = null;
        C0f9.A09(984378194, A02);
    }
}
