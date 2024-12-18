package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.2iT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56352iT implements InterfaceC56362iU {
    public static final C56342iS A0t = new Object();
    public int A00;
    public int A01;
    public Context A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public FrameLayout A06;
    public ImageView A07;
    public LinearLayout A08;
    public C114795Gm A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public View A0E;
    public View A0F;
    public C72103Li A0G;
    public SpinnerImageView A0H;
    public WeakReference A0I;
    public final int A0J;
    public final View.OnClickListener A0K;
    public final View A0L;
    public final View A0M;
    public final View A0N;
    public final ViewGroup A0O;
    public final ViewGroup A0P;
    public final ViewGroup A0Q;
    public final ViewStub A0R;
    public final FrameLayout A0S;
    public final InterfaceC56392iX A0T;
    public final InterfaceC56392iX A0U;
    public final List A0V;
    public final WeakHashMap A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d;
    public final InterfaceC09390do A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final boolean A0i;
    public final View A0j;
    public final ViewStub A0k;
    public final ViewStub A0l;
    public final ViewStub A0m;
    public final ViewStub A0n;
    public final ViewStub A0o;
    public final C006802i A0p = C006802i.A0p;
    public final InterfaceC09390do A0q;
    public final InterfaceC09390do A0r;
    public final InterfaceC09390do A0s;

    public static final void A0D(View view, C3LY c3ly, C56352iT c56352iT) {
        int i;
        boolean z = true;
        if (!c56352iT.A0D) {
            z = false;
        }
        c56352iT.A0D = z;
        if (z) {
            LinearLayout linearLayout = c56352iT.A08;
            if (linearLayout == null) {
                Context context = view.getContext();
                linearLayout = new LinearLayout(context);
                linearLayout.setId(R.id.action_bar_right_side_buttons);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.action_bar_right_side_buttons_wrapper);
                frameLayout.addView(linearLayout);
                ViewGroup viewGroup = c56352iT.A0O;
                viewGroup.addView(frameLayout, viewGroup.indexOfChild(c56352iT.A0Q) + 2);
                c56352iT.A08 = linearLayout;
                c56352iT.A06 = frameLayout;
            }
            linearLayout.addView(view, 0, c56352iT.A03(view, c3ly, false));
            return;
        }
        ViewGroup viewGroup2 = c56352iT.A0O;
        int indexOfChild = viewGroup2.indexOfChild(c56352iT.A0Q) + 2;
        LinearLayout.LayoutParams A03 = c56352iT.A03(view, c3ly, false);
        if (c56352iT.A0C) {
            if (C57992lC.A03()) {
                i = C57992lC.A01();
            } else {
                i = 0;
            }
            AbstractC13880nE.A0d(view, i);
        }
        viewGroup2.addView(view, indexOfChild, A03);
        C114795Gm c114795Gm = c56352iT.A09;
        if (c114795Gm == null) {
            return;
        }
        c56352iT.Ehg(c114795Gm);
    }

    public final void A0T() {
        A0L(this, true);
    }

    @Override // X.InterfaceC56362iU
    public final View A7x(View view) {
        C14360o3.A0B(view, 0);
        this.A04 = view;
        A0A();
        this.A0P.addView(this.A04, 0);
        return view;
    }

    @Override // X.InterfaceC56362iU
    public final View AA9(C3LY c3ly) {
        C14360o3.A0B(c3ly, 0);
        View A02 = A02(c3ly);
        A0D(A02, c3ly, this);
        return A02;
    }

    @Override // X.InterfaceC56362iU
    public final void AAD(String str) {
        C14360o3.A0B(str, 0);
        View A01 = A01(null, str);
        C14360o3.A0C(A01, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) A01;
        textView.setTextColor(A00(this).getColor(AbstractC53242c7.A0H(A00(this), R.attr.igds_color_secondary_text)));
        A0C(textView, this.A0O.indexOfChild(this.A0Q) + 2);
        textView.setEnabled(false);
    }

    @Override // X.InterfaceC56362iU
    public final void AAE(String str, View.OnClickListener onClickListener) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(onClickListener, 1);
        A0C(A01(onClickListener, str), this.A0O.indexOfChild(this.A0Q) + 2);
    }

    @Override // X.InterfaceC56362iU
    public final void AHh() {
        this.A0F = null;
        this.A0G = null;
        ViewGroup viewGroup = this.A0Q;
        viewGroup.removeAllViews();
        viewGroup.setVisibility(8);
    }

    @Override // X.InterfaceC56362iU
    public final View ESn(View view) {
        C14360o3.A0B(view, 0);
        ViewGroup viewGroup = this.A0Q;
        viewGroup.addView(view);
        viewGroup.setVisibility(0);
        A07();
        A09();
        return view;
    }

    @Override // X.InterfaceC56362iU
    public final View ESo(View view, int i, int i2, boolean z) {
        C14360o3.A0B(view, 0);
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        ViewGroup viewGroup = this.A0Q;
        viewGroup.addView(view);
        viewGroup.setVisibility(0);
        AbstractC13880nE.A0a(viewGroup, i);
        AbstractC13880nE.A0c(viewGroup, i2);
        A07();
        A09();
        A08();
        return view;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3Li, java.lang.Object] */
    @Override // X.InterfaceC56362iU
    public final View ESp(UserSession userSession, final int i, final int i2, int i3) {
        if (userSession != null && C18U.A06(C06090Tz.A05, userSession, 36312385119585379L)) {
            ?? r1 = new C0T6(i, i2) { // from class: X.3Li
                public final int A00;
                public final int A01;

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof C72103Li) {
                            C72103Li c72103Li = (C72103Li) obj;
                            if (this.A00 != c72103Li.A00 || this.A01 != c72103Li.A01) {
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    return ((this.A00 * 31) + this.A01) * 31;
                }

                {
                    this.A00 = i;
                    this.A01 = i2;
                }
            };
            if (!C14360o3.A0K(this.A0G, r1)) {
                this.A0G = r1;
                this.A0F = ESm(i, i2, 0, true);
                A08();
            }
            View view = this.A0F;
            view.getClass();
            return view;
        }
        return ESm(i, i2, 0, true);
    }

    @Override // X.InterfaceC56362iU
    public final void EaW(CharSequence charSequence, CharSequence charSequence2) {
        View view;
        A0J(this, charSequence, false);
        int i = 0;
        if (charSequence2 != null && charSequence2.length() != 0) {
            InterfaceC09390do interfaceC09390do = this.A0g;
            Object value = interfaceC09390do.getValue();
            C14360o3.A07(value);
            ((TextView) value).setText(charSequence2);
            Object value2 = interfaceC09390do.getValue();
            C14360o3.A07(value2);
            view = (View) value2;
        } else {
            InterfaceC09390do interfaceC09390do2 = this.A0g;
            Object value3 = interfaceC09390do2.getValue();
            C14360o3.A07(value3);
            ((TextView) value3).setText((CharSequence) null);
            Object value4 = interfaceC09390do2.getValue();
            C14360o3.A07(value4);
            view = (View) value4;
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // X.InterfaceC56362iU
    public final void Ect(String str, View.OnClickListener onClickListener) {
        C14360o3.A0B(onClickListener, 1);
        A0G(this);
        if (str != null && str.length() != 0) {
            AAE(str, onClickListener);
        }
    }

    @Override // X.InterfaceC56362iU
    public final void Efv(SpannableStringBuilder spannableStringBuilder) {
        A0K(this, spannableStringBuilder, false, false);
        Efw(null);
    }

    @Override // X.InterfaceC56362iU
    public final SearchEditText Ehl() {
        EditText editText = A0S(false).getEditText();
        C14360o3.A0C(editText, "null cannot be cast to non-null type com.instagram.ui.widget.searchedittext.SearchEditText");
        return (SearchEditText) editText;
    }

    @Override // X.InterfaceC56362iU
    public final void EkS(boolean z) {
        EkT(null, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x022e, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0244, code lost:
    
        if (r3 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x021e, code lost:
    
        if (r6 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f3, code lost:
    
        if (r9 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01dd, code lost:
    
        if (r10 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01be, code lost:
    
        if (r11 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C56352iT(android.view.View.OnClickListener r22, android.view.ViewGroup r23) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56352iT.<init>(android.view.View$OnClickListener, android.view.ViewGroup):void");
    }

    public static final Context A00(C56352iT c56352iT) {
        Context context = c56352iT.A02;
        if (context == null) {
            Context context2 = c56352iT.A0O.getContext();
            C14360o3.A07(context2);
            return context2;
        }
        return context;
    }

    private final View A02(C3LY c3ly) {
        Drawable drawable;
        Integer num;
        int intValue;
        int i;
        Context A00;
        CharSequence charSequence = c3ly.A0K;
        if (charSequence == null && c3ly.A0C == -1) {
            Drawable drawable2 = c3ly.A0F;
            ImageView imageView = new ImageView(A00(this));
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            if (drawable2 != null) {
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(A06(c3ly));
            } else {
                imageView.setScaleType(scaleType);
                imageView.setImageResource(c3ly.A06);
                imageView.setContentDescription(A06(c3ly));
                imageView.setColorFilter(C3DY.A00(this.A01));
            }
            A0E(imageView, c3ly, this);
            int i2 = c3ly.A02;
            if (i2 == 0) {
                if (c3ly.A0N) {
                    i2 = this.A01;
                    if (i2 == 0) {
                        A00 = this.A0O.getContext();
                        i = AbstractC53242c7.A08(A00);
                    }
                } else {
                    i = c3ly.A03;
                    if (i != -1) {
                        A00 = A00(this);
                    }
                    return imageView;
                }
                i2 = A00.getColor(i);
            }
            imageView.setColorFilter(C3DY.A00(i2));
            return imageView;
        }
        Context A002 = A00(this);
        int i3 = c3ly.A0D;
        View inflate = LayoutInflater.from(new ContextThemeWrapper(A002, i3)).inflate(R.layout.action_bar_left_button_text, (ViewGroup) null, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
        TextView textView = (TextView) inflate;
        C1QI.A0I(textView, A00(this).getColor(AbstractC53242c7.A0H(A00(this), R.attr.igds_color_primary_button)));
        if (i3 != 0) {
            textView.setTextAppearance(i3);
        }
        int i4 = c3ly.A06;
        if (i4 == -1 ? (drawable = c3ly.A0F) != null : (drawable = A00(this).getDrawable(i4)) != null) {
            if (c3ly.A0N) {
                C114795Gm c114795Gm = this.A09;
                if (c114795Gm != null) {
                    num = Integer.valueOf(c114795Gm.A04);
                } else {
                    num = null;
                }
                int i5 = c3ly.A02;
                if (i5 != -1) {
                    drawable.mutate().setColorFilter(C3DY.A00(i5));
                } else {
                    int i6 = c3ly.A03;
                    if (i6 != -1) {
                        drawable.mutate().setColorFilter(C3DY.A00(A00(this).getColor(i6)));
                    } else if (num != null && (intValue = num.intValue()) != -2) {
                        drawable.mutate().setColorFilter(C3DY.A00(intValue));
                    }
                }
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        Object[] objArr = c3ly.A0Q;
        if (charSequence == null) {
            charSequence = textView.getContext().getString(c3ly.A0C, Arrays.copyOf(objArr, 0));
        }
        textView.setText(charSequence);
        A0E(textView, c3ly, this);
        return textView;
    }

    private final LinearLayout.LayoutParams A03(View view, C3LY c3ly, boolean z) {
        LinearLayout.LayoutParams layoutParams = c3ly.A0J;
        layoutParams.gravity = c3ly.A09;
        if (c3ly.A0O) {
            int dimensionPixelSize = A00(this).getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            int dimensionPixelSize2 = A00(this).getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            int i = c3ly.A0B;
            if (i == -1) {
                i = dimensionPixelSize;
            }
            int i2 = c3ly.A0E;
            if (i2 == -1) {
                i2 = dimensionPixelSize2;
            }
            if (c3ly.A07 != -1 || z) {
                dimensionPixelSize = 0;
            }
            if (c3ly.A00 != -1) {
                dimensionPixelSize2 = 0;
            }
            view.setPaddingRelative(i, i2, dimensionPixelSize, dimensionPixelSize2);
        }
        return layoutParams;
    }

    public static final IgTextView A04(C56352iT c56352iT) {
        Object value = c56352iT.A0r.getValue();
        C14360o3.A07(value);
        return (IgTextView) value;
    }

    public static final IgTextView A05(C56352iT c56352iT) {
        Object value = c56352iT.A0s.getValue();
        C14360o3.A07(value);
        return (IgTextView) value;
    }

    private final String A06(C3LY c3ly) {
        String str = c3ly.A0M;
        if (str == null || str.length() == 0) {
            return this.A0O.getResources().getString(c3ly.A05);
        }
        return str;
    }

    private final void A07() {
        if (this.A0U.CWW()) {
            A04(this).setVisibility(8);
            Object value = this.A0Z.getValue();
            C14360o3.A07(value);
            ((View) value).setVisibility(8);
            A05(this).setVisibility(8);
            Object value2 = this.A0a.getValue();
            C14360o3.A07(value2);
            ((View) value2).setVisibility(8);
            Object value3 = this.A0g.getValue();
            C14360o3.A07(value3);
            ((View) value3).setVisibility(8);
            Object value4 = this.A0f.getValue();
            C14360o3.A07(value4);
            ((View) value4).setVisibility(8);
        }
    }

    private final void A08() {
        if (((Boolean) this.A0e.getValue()).booleanValue()) {
            AbstractC56932jR.A05(this.A0O, 500L);
        }
    }

    private final void A09() {
        InterfaceC56392iX interfaceC56392iX = this.A0U;
        if (interfaceC56392iX.CWW()) {
            ViewGroup.LayoutParams layoutParams = interfaceC56392iX.getView().getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            ((ViewGroup.LayoutParams) layoutParams2).width = -2;
            layoutParams2.weight = 0.0f;
            interfaceC56392iX.getView().setLayoutParams(layoutParams2);
        }
    }

    private final void A0A() {
        View view = this.A04;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, Math.max(AbstractC53242c7.A0G(A00(this), R.attr.actionBarButtonWidth), this.A0O.getLayoutParams().height), 0, 0);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    private final void A0B(int i) {
        this.A0O.getLayoutParams().height = i;
        View view = this.A0L;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
        if (this.A04 != null) {
            A0A();
        }
    }

    public static final void A0E(View view, C3LY c3ly, C56352iT c56352iT) {
        String str;
        view.setVisibility(c3ly.A08);
        View.OnClickListener onClickListener = c3ly.A0G;
        if (onClickListener != null) {
            C0fQ.A00(onClickListener, view);
        }
        View.OnLongClickListener onLongClickListener = c3ly.A0H;
        if (onLongClickListener != null) {
            view.setOnLongClickListener(onLongClickListener);
        }
        if (c3ly.A0P) {
            Resources.Theme theme = A00(c56352iT).getTheme();
            C14360o3.A07(theme);
            view.setBackgroundDrawable(new C3DW(theme, C05F.A00));
        }
        view.setId(c3ly.A04);
        if (c3ly.A05 != 0 || ((str = c3ly.A0M) != null && str.length() != 0)) {
            view.setContentDescription(c56352iT.A06(c3ly));
        }
        if (onClickListener != null || onLongClickListener != null) {
            Integer num = c3ly.A0L;
            if (num == C05F.A00) {
                num = C05F.A01;
            }
            AbstractC56952jT.A04(view, num);
        }
        view.setBackgroundResource(AbstractC53242c7.A0H(A00(c56352iT), R.attr.directIconBackgroundResource));
    }

    public static final void A0F(C56352iT c56352iT) {
        InterfaceC56392iX interfaceC56392iX = c56352iT.A0U;
        if (!interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView();
            AbstractC56932jR.A03(A05(c56352iT));
            AbstractC56932jR.A03(A04(c56352iT));
            Resources resources = A00(c56352iT).getResources();
            Object value = c56352iT.A0Z.getValue();
            C14360o3.A07(value);
            ((TextView) value).setAutoSizeTextTypeUniformWithConfiguration(resources.getDimensionPixelSize(R.dimen.auth_credential_title_text_size), resources.getDimensionPixelSize(R.dimen.avatar_search_sticker_tray_text_size), resources.getDimensionPixelSize(R.dimen.group_mention_sticker_title_text_size_step), 0);
            A0I(c56352iT, A00(c56352iT).getColor(AbstractC53242c7.A0H(A00(c56352iT), R.attr.igds_color_primary_text)));
            A05(c56352iT).setFontFeatureSettings("lnum 1");
        }
    }

    public static final void A0G(C56352iT c56352iT) {
        ViewGroup viewGroup = c56352iT.A0O;
        int childCount = viewGroup.getChildCount();
        int indexOfChild = viewGroup.indexOfChild(c56352iT.A0Q) + 2;
        int i = childCount - 1;
        for (int i2 = indexOfChild; i2 < i; i2++) {
            if (viewGroup.getChildAt(indexOfChild).getId() != R.id.action_bar_right_side_buttons_wrapper) {
                viewGroup.removeViewAt(indexOfChild);
            }
        }
        FrameLayout frameLayout = c56352iT.A06;
        if (frameLayout != null) {
            int childCount2 = frameLayout.getChildCount();
            while (true) {
                childCount2--;
                if (-1 >= childCount2) {
                    break;
                } else if (frameLayout.getChildAt(childCount2).getId() != R.id.action_bar_right_side_buttons) {
                    frameLayout.removeViewAt(childCount2);
                }
            }
        }
        LinearLayout linearLayout = c56352iT.A08;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
    }

    public static final void A0I(C56352iT c56352iT, int i) {
        c56352iT.A01 = i;
        A05(c56352iT).setTextColor(c56352iT.A01);
        A04(c56352iT).setTextColor(c56352iT.A01);
        Object value = c56352iT.A0Z.getValue();
        C14360o3.A07(value);
        ((TextView) value).setTextColor(c56352iT.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:5:0x0010, B:7:0x0017, B:8:0x001a, B:10:0x001f, B:11:0x0024, B:13:0x0029, B:14:0x0033, B:16:0x0037, B:17:0x003d, B:19:0x0041, B:22:0x004d, B:23:0x0056, B:25:0x005d, B:27:0x0062, B:28:0x0067, B:30:0x006b), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:5:0x0010, B:7:0x0017, B:8:0x001a, B:10:0x001f, B:11:0x0024, B:13:0x0029, B:14:0x0033, B:16:0x0037, B:17:0x003d, B:19:0x0041, B:22:0x004d, B:23:0x0056, B:25:0x005d, B:27:0x0062, B:28:0x0067, B:30:0x006b), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #0 {all -> 0x007c, blocks: (B:5:0x0010, B:7:0x0017, B:8:0x001a, B:10:0x001f, B:11:0x0024, B:13:0x0029, B:14:0x0033, B:16:0x0037, B:17:0x003d, B:19:0x0041, B:22:0x004d, B:23:0x0056, B:25:0x005d, B:27:0x0062, B:28:0x0067, B:30:0x006b), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0L(X.C56352iT r8, boolean r9) {
        /*
            r6 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L10
            r1 = 319282380(0x1307dccc, float:1.7148257E-27)
            java.lang.String r0 = "ActionBarService.configureActionBar"
            X.C0fO.A01(r0, r1)
        L10:
            X.02i r4 = r8.A0p     // Catch: java.lang.Throwable -> L7c
            r3 = 568731129(0x21e625f9, float:1.5595458E-18)
            if (r4 == 0) goto L1a
            r4.markerStart(r3)     // Catch: java.lang.Throwable -> L7c
        L1a:
            r5 = 0
            r8.A02 = r5     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L24
            java.lang.String r0 = "reset_start"
            r4.markerPoint(r3, r0)     // Catch: java.lang.Throwable -> L7c
        L24:
            A0H(r8)     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L33
            java.lang.String r0 = "reset_end"
            r4.markerPoint(r3, r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "configure_start"
            r4.markerPoint(r3, r0)     // Catch: java.lang.Throwable -> L7c
        L33:
            java.lang.ref.WeakReference r0 = r8.A0I     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L45
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> L7c
            X.2ou r2 = (X.InterfaceC60122ou) r2     // Catch: java.lang.Throwable -> L7c
        L3d:
            boolean r0 = r2 instanceof X.InterfaceC11380iw     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L4a
            r0 = r2
            X.0iw r0 = (X.InterfaceC11380iw) r0     // Catch: java.lang.Throwable -> L7c
            goto L47
        L45:
            r2 = r5
            goto L3d
        L47:
            if (r4 == 0) goto L5b
            goto L4d
        L4a:
            if (r4 == 0) goto L5b
            goto L56
        L4d:
            java.lang.String r1 = "action_bar_delegate"
            java.lang.String r0 = r0.getModuleName()     // Catch: java.lang.Throwable -> L7c
            r4.markerAnnotate(r3, r1, r0)     // Catch: java.lang.Throwable -> L7c
        L56:
            java.lang.String r0 = "from_force_update"
            r4.markerAnnotate(r3, r0, r9)     // Catch: java.lang.Throwable -> L7c
        L5b:
            if (r2 == 0) goto L60
            r2.configureActionBar(r8)     // Catch: java.lang.Throwable -> L7c
        L60:
            if (r4 == 0) goto L67
            java.lang.String r0 = "configure_end"
            r4.markerPoint(r3, r0)     // Catch: java.lang.Throwable -> L7c
        L67:
            r8.A02 = r5     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L6f
            r0 = 2
            r4.markerEnd(r3, r0)     // Catch: java.lang.Throwable -> L7c
        L6f:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L7b
            r0 = -220884697(0xfffffffff2d59127, float:-8.4602605E30)
            X.C0fO.A00(r0)
        L7b:
            return
        L7c:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r6)
            if (r0 == 0) goto L89
            r0 = 23966827(0x16db46b, float:4.365947E-38)
            X.C0fO.A00(r0)
        L89:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56352iT.A0L(X.2iT, boolean):void");
    }

    private final void A0M(CharSequence charSequence, boolean z) {
        TextView A04;
        if (z) {
            Object value = this.A0Z.getValue();
            C14360o3.A07(value);
            A04 = (TextView) value;
        } else {
            A04 = A04(this);
        }
        A04.setText(charSequence);
        if (charSequence != null && charSequence.length() != 0) {
            A04.setImportantForAccessibility(1);
            A04.setContentDescription(charSequence);
        } else {
            A04.setImportantForAccessibility(2);
        }
        A0O(z);
    }

    private final boolean A0P() {
        Object value = this.A0f.getValue();
        C14360o3.A07(value);
        CharSequence text = ((TextView) value).getText();
        if (text == null || text.length() == 0) {
            Object value2 = this.A0g.getValue();
            C14360o3.A07(value2);
            CharSequence text2 = ((TextView) value2).getText();
            if (text2 == null || text2.length() == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final ImageView A0Q() {
        Object value = this.A0q.getValue();
        C14360o3.A07(value);
        return (ImageView) value;
    }

    public final ActionButton A0R(View.OnClickListener onClickListener, int i, int i2) {
        ActionButton actionButton = (ActionButton) this.A0T.getView();
        actionButton.setVisibility(0);
        actionButton.setButtonResource(i);
        if (onClickListener != null) {
            C0fQ.A00(onClickListener, actionButton);
        }
        actionButton.setBackgroundResource(AbstractC53242c7.A0H(A00(this), R.attr.actionBarBackground));
        actionButton.setColorFilter(C3DY.A00(A00(this).getColor(i2)));
        setIsLoading(false);
        return actionButton;
    }

    public final void A0W(int i, int i2, boolean z) {
        ViewGroup viewGroup = this.A0O;
        View childAt = viewGroup.getChildAt(viewGroup.indexOfChild(this.A0Q) + 2);
        if (childAt != null) {
            childAt.setEnabled(z);
            if (childAt instanceof ImageView) {
                Context A00 = A00(this);
                ImageView imageView = (ImageView) childAt;
                if (!z) {
                    i = i2;
                }
                AbstractC85953sP.A03(A00, imageView, i);
                return;
            }
            if (!(childAt instanceof TextView)) {
                return;
            }
            TextView textView = (TextView) childAt;
            Context A002 = A00(this);
            if (!z) {
                i = i2;
            }
            textView.setTextColor(A002.getColor(i));
        }
    }

    public final void A0X(InterfaceC60122ou interfaceC60122ou) {
        WeakReference weakReference = this.A0I;
        if (weakReference != null && weakReference.get() != interfaceC60122ou) {
            this.A0O.setOnClickListener(null);
        }
        this.A0I = new WeakReference(interfaceC60122ou);
        boolean z = false;
        if (interfaceC60122ou != null) {
            z = true;
        }
        EkF(z);
        if (interfaceC60122ou != null) {
            this.A0P.setVisibility(0);
            if (!this.A0B) {
                if (!this.A0W.containsKey(interfaceC60122ou)) {
                    A0L(this, false);
                    return;
                }
                return;
            }
            this.A0B = false;
        }
    }

    public final void A0Y(boolean z) {
        View view = this.A0L;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final void A0Z(boolean z) {
        View view = this.A0M;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
        Context A00 = A00(this);
        int i2 = R.attr.igds_color_primary_text;
        if (z) {
            i2 = R.attr.igds_color_primary_text_on_media;
        }
        int A0H = AbstractC53242c7.A0H(A00, i2);
        A0V(A00(this).getColor(A0H));
        ColorFilter A002 = C3DY.A00(A00(this).getColor(A0H));
        ViewGroup viewGroup = this.A0O;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (childAt instanceof ImageView) {
                ((ImageView) childAt).setColorFilter(A002);
            }
        }
    }

    @Override // X.InterfaceC56362iU
    public final View A7w(int i) {
        ViewGroup viewGroup = this.A0P;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C14360o3.A0A(inflate);
        A7x(inflate);
        return inflate;
    }

    @Override // X.InterfaceC56362iU
    public final View AAA(C3LY c3ly) {
        View view = c3ly.A0I;
        if (view != null) {
            A0E(view, c3ly, this);
            A0D(view, c3ly, this);
            return view;
        }
        throw new IllegalStateException("Must have set custom view in config");
    }

    @Override // X.InterfaceC56362iU
    public final View AAB(C3LY c3ly) {
        int i = c3ly.A0A;
        if (i != -1) {
            View inflate = LayoutInflater.from(A00(this)).inflate(i, this.A0O, false);
            C14360o3.A0A(inflate);
            A0E(inflate, c3ly, this);
            A0D(inflate, c3ly, this);
            return inflate;
        }
        throw new IllegalStateException("Should only use this method for a set layoutResId");
    }

    @Override // X.InterfaceC56362iU
    public final void AAC(int i) {
        String string = this.A0O.getResources().getString(i);
        C14360o3.A07(string);
        AAD(string);
    }

    @Override // X.InterfaceC56362iU
    public final View AAF(View.OnClickListener onClickListener, int i) {
        ViewGroup viewGroup = this.A0O;
        String string = viewGroup.getResources().getString(i);
        C14360o3.A07(string);
        View A01 = A01(onClickListener, string);
        A0C(A01, viewGroup.indexOfChild(this.A0Q) + 2);
        return A01;
    }

    @Override // X.InterfaceC56362iU
    public final void ARS(boolean z) {
        InterfaceC56392iX interfaceC56392iX = this.A0T;
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setEnabled(z);
        }
    }

    @Override // X.InterfaceC56362iU
    public final void ARb(int i, boolean z) {
        int i2;
        ViewGroup viewGroup = this.A0O;
        InterfaceC56392iX interfaceC56392iX = this.A0U;
        if (interfaceC56392iX.CWW()) {
            i2 = ((ViewGroup) interfaceC56392iX.getView()).indexOfChild(A0Q());
        } else {
            i2 = -1;
        }
        View childAt = viewGroup.getChildAt(i2 + i);
        if (childAt != null && childAt.isEnabled() != z) {
            childAt.setEnabled(z);
            if (childAt instanceof ImageView) {
                Context A00 = A00(this);
                ImageView imageView = (ImageView) childAt;
                Context A002 = A00(this);
                int i3 = R.attr.igds_color_secondary_icon;
                if (z) {
                    i3 = R.attr.igds_color_primary_icon;
                }
                AbstractC85953sP.A03(A00, imageView, AbstractC53242c7.A0H(A002, i3));
            }
        }
    }

    @Override // X.InterfaceC56362iU
    public final void ARc(boolean z) {
        if (this.A0H == null) {
            SpinnerImageView spinnerImageView = new SpinnerImageView(A00(this));
            this.A0H = spinnerImageView;
            spinnerImageView.setImageResource(R.drawable.nav_spinner_with_outline);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 16);
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AbstractC69815Vw1.A00(A00(this), 15.0f);
            this.A0O.addView(this.A0H, layoutParams);
        }
    }

    @Override // X.InterfaceC56362iU
    public final void ARk(int i, boolean z) {
        ViewGroup viewGroup = this.A0O;
        View childAt = viewGroup.getChildAt(viewGroup.indexOfChild(this.A0Q) + 2 + i);
        if (childAt != null) {
            childAt.setEnabled(z);
            if (childAt instanceof ImageView) {
                int A0H = AbstractC53242c7.A0H(A00(this), R.attr.igds_color_primary_icon);
                int A0H2 = AbstractC53242c7.A0H(A00(this), R.attr.igds_color_secondary_icon);
                Context A00 = A00(this);
                ImageView imageView = (ImageView) childAt;
                if (!z) {
                    A0H = A0H2;
                }
                AbstractC85953sP.A03(A00, imageView, A0H);
                return;
            }
            if (!(childAt instanceof TextView)) {
                return;
            }
            int A002 = C1QI.A00(AbstractC53242c7.A0H(A00(this), R.attr.igds_color_primary_button));
            int A0H3 = AbstractC53242c7.A0H(A00(this), R.attr.igds_color_secondary_icon);
            TextView textView = (TextView) childAt;
            Context A003 = A00(this);
            if (!z) {
                A002 = A0H3;
            }
            textView.setTextColor(A003.getColor(A002));
        }
    }

    @Override // X.InterfaceC56362iU
    public final int AYS() {
        ViewGroup viewGroup = this.A0P;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(AbstractC13880nE.A0A(A00(this)), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
        return viewGroup.getMeasuredHeight();
    }

    @Override // X.InterfaceC56362iU
    public final ViewGroup C95() {
        ViewGroup viewGroup = this.A0Q;
        if (viewGroup.getVisibility() == 8) {
            return (ViewGroup) this.A0U.getView();
        }
        return viewGroup;
    }

    @Override // X.InterfaceC56362iU
    public final void EPD(Drawable drawable) {
        this.A0O.setBackground(drawable);
    }

    @Override // X.InterfaceC56362iU
    public final void Ef5(CharSequence charSequence) {
        InterfaceC09390do interfaceC09390do = this.A0f;
        if (charSequence != null) {
            Object value = interfaceC09390do.getValue();
            C14360o3.A07(value);
            ((TextView) value).setText(charSequence);
            Object value2 = interfaceC09390do.getValue();
            C14360o3.A07(value2);
            ((View) value2).setVisibility(0);
            Object value3 = interfaceC09390do.getValue();
            C14360o3.A07(value3);
            ((TextView) value3).setHighlightColor(0);
            AbstractC13880nE.A0W(this.A0O, A00(this).getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height));
            return;
        }
        Object value4 = interfaceC09390do.getValue();
        C14360o3.A07(value4);
        ((View) value4).setVisibility(8);
    }

    @Override // X.InterfaceC56362iU
    public final void Efw(View.OnClickListener onClickListener) {
        if (this.A0U.CWW()) {
            C0fQ.A00(onClickListener, A04(this));
            Object value = this.A0Z.getValue();
            C14360o3.A07(value);
            C0fQ.A00(onClickListener, (View) value);
            C0fQ.A00(onClickListener, A05(this));
            Object value2 = this.A0g.getValue();
            C14360o3.A07(value2);
            C0fQ.A00(onClickListener, (View) value2);
            Object value3 = this.A0f.getValue();
            C14360o3.A07(value3);
            C0fQ.A00(onClickListener, (View) value3);
            Object value4 = this.A0X.getValue();
            C14360o3.A07(value4);
            C0fQ.A00(onClickListener, (View) value4);
            Object value5 = this.A0d.getValue();
            C14360o3.A07(value5);
            C0fQ.A00(onClickListener, (View) value5);
            Object value6 = this.A0b.getValue();
            C14360o3.A07(value6);
            C0fQ.A00(onClickListener, (View) value6);
            Object value7 = this.A0Y.getValue();
            C14360o3.A07(value7);
            C0fQ.A00(onClickListener, (View) value7);
            Object value8 = this.A0h.getValue();
            C14360o3.A07(value8);
            C0fQ.A00(onClickListener, (View) value8);
            if (onClickListener == null) {
                View[] viewArr = {A05(this), A04(this)};
                C02V c02v = new C02V() { // from class: X.3DZ
                    @Override // X.C02V
                    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        C14360o3.A0B(view, 0);
                        C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                        super.A0Y(view, accessibilityNodeInfoCompat);
                        accessibilityNodeInfoCompat.mInfo.setHeading(true);
                        accessibilityNodeInfoCompat.setClickable(false);
                        accessibilityNodeInfoCompat.removeAction(C012804r.A08);
                    }
                };
                int i = 0;
                do {
                    AbstractC010103p.A0B(viewArr[i], c02v);
                    i++;
                } while (i < 2);
            } else {
                AbstractC56932jR.A01(A05(this));
                AbstractC56932jR.A01(A04(this));
                AbstractC56932jR.A03(A05(this));
                AbstractC56932jR.A03(A04(this));
            }
            C0fQ.A00(onClickListener, C95());
        }
    }

    @Override // X.InterfaceC56362iU
    public final void EgU() {
        C0fQ.A00(this.A0K, this.A03);
    }

    @Override // X.InterfaceC56362iU
    public final void Ehb(View.OnClickListener onClickListener, Integer num, Integer num2, int i) {
        this.A0T.setVisibility(8);
        ViewStub viewStub = this.A0n;
        if (viewStub != null && viewStub.getParent() != null) {
            this.A0E = viewStub.inflate();
        }
        View view = this.A0E;
        C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        textView.setText(i);
        Context A00 = A00(this);
        if (num != null) {
            textView.setTextColor(A00.getColor(num.intValue()));
        } else {
            C1QI.A0I(textView, A00.getColor(AbstractC53242c7.A0C(A00(this))));
        }
        if (num2 != null) {
            textView.setTypeface(null, num2.intValue());
        }
        C0fQ.A00(onClickListener, textView);
        textView.setVisibility(0);
    }

    @Override // X.InterfaceC56362iU
    public final void Ehd(C3LY c3ly) {
        int i = c3ly.A01;
        if (i == -1 && c3ly.A0F == null) {
            throw new IllegalStateException("Should only use this method for a set buttonResource");
        }
        Drawable drawable = c3ly.A0F;
        EkT(null, true);
        ImageView A0Q = A0Q();
        if (drawable != null) {
            A0Q.setImageDrawable(drawable);
        } else {
            A0Q.setImageResource(i);
        }
        View.OnClickListener onClickListener = c3ly.A0G;
        if (onClickListener != null) {
            C0fQ.A00(onClickListener, A0Q());
        }
        int i2 = c3ly.A05;
        if (i2 != 0) {
            A0Q().setContentDescription(A0Q().getResources().getString(i2));
        }
        int i3 = c3ly.A02;
        if (i3 != 0) {
            A0Q().setColorFilter(C3DY.A00(i3));
        }
    }

    @Override // X.InterfaceC56362iU
    public final void Ehg(C114795Gm c114795Gm) {
        String str;
        Activity activity;
        Activity activity2;
        ActionButton actionButton = (ActionButton) this.A0T.getView();
        this.A09 = c114795Gm;
        View.OnClickListener onClickListener = c114795Gm.A0C;
        ImageView A0Q = A0Q();
        if (onClickListener == null) {
            onClickListener = this.A0K;
        }
        C0fQ.A00(onClickListener, A0Q);
        Drawable drawable = c114795Gm.A0A;
        if (drawable != null) {
            A0Q().setImageDrawable(drawable);
        } else {
            int i = c114795Gm.A03;
            ImageView A0Q2 = A0Q();
            if (i == -2) {
                i = this.A0J;
            }
            A0Q2.setImageResource(i);
        }
        int i2 = c114795Gm.A02;
        if (i2 != -2) {
            A0Q().setContentDescription(this.A0O.getResources().getString(i2));
        }
        int i3 = c114795Gm.A01;
        if (i3 != -2) {
            actionButton.setButtonResource(i3);
        }
        int i4 = c114795Gm.A00;
        if (i4 != -2) {
            str = this.A0O.getResources().getString(i4);
        } else {
            str = null;
        }
        actionButton.setContentDescription(str);
        int i5 = c114795Gm.A04;
        if (i5 != -2) {
            A0V(i5);
        }
        ColorFilter A00 = C3DY.A00(i5);
        ViewGroup viewGroup = this.A0O;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if (i5 != -2) {
                if (childAt instanceof ImageView) {
                    ((ImageView) childAt).setColorFilter(A00);
                } else if (childAt instanceof ActionButton) {
                    ((ActionButton) childAt).setColorFilter(A00);
                } else if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i5);
                }
            }
            C14360o3.A0A(childAt);
            Resources.Theme theme = A00(this).getTheme();
            C14360o3.A07(theme);
            C56342iS.A02(theme, childAt, c114795Gm);
        }
        ColorFilter colorFilter = c114795Gm.A08;
        if (colorFilter != null) {
            actionButton.setColorFilter(colorFilter);
        }
        ColorFilter colorFilter2 = c114795Gm.A09;
        if (colorFilter2 != null && A0Q().getDrawable() != null) {
            A0Q().getDrawable().mutate().setColorFilter(colorFilter2);
        }
        ImageView A0Q3 = A0Q();
        Resources.Theme theme2 = A00(this).getTheme();
        C14360o3.A07(theme2);
        C56342iS.A02(theme2, A0Q3, c114795Gm);
        Drawable drawable2 = c114795Gm.A0B;
        if (drawable2 != null) {
            EPD(drawable2);
        }
        int i7 = c114795Gm.A06;
        if (i7 != -2) {
            boolean z = this.A0i;
            if (!z && (activity2 = (Activity) AbstractC13320mI.A00(A00(this), Activity.class)) != null) {
                AbstractC56402iY.A02(activity2, i7);
            }
            boolean z2 = c114795Gm.A0E;
            if (!z && (activity = (Activity) AbstractC13320mI.A00(A00(this), Activity.class)) != null) {
                AbstractC56402iY.A06(activity, z2);
            }
        }
    }

    @Override // X.InterfaceC56362iU
    public final AnimatedHintsTextLayout Ehm(int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        int i3;
        AnimatedHintsTextLayout A0S = A0S(z);
        EditText editText = A0S.getEditText();
        C14360o3.A0C(editText, "null cannot be cast to non-null type com.instagram.ui.widget.searchedittext.SearchEditText");
        SearchEditText searchEditText = (SearchEditText) editText;
        if (z4) {
            searchEditText.A07(i, i2, z3, j);
        } else {
            searchEditText.A08(z3);
        }
        searchEditText.A09(z6);
        if (z5) {
            searchEditText.setMultiLineSearchBarEnabled(true);
            ViewGroup viewGroup = this.A0O;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                viewGroup.setLayoutParams(layoutParams);
                ViewGroup viewGroup2 = this.A0Q;
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = -2;
                    viewGroup2.setLayoutParams(layoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = A0S.getLayoutParams();
                    if (layoutParams3 != null) {
                        layoutParams3.height = -2;
                        A0S.setLayoutParams(layoutParams3);
                        Resources resources = searchEditText.getResources();
                        AbstractC13880nE.A0j(searchEditText, resources.getDimensionPixelSize(R.dimen.accent_edge_thickness), resources.getDimensionPixelSize(R.dimen.accent_edge_thickness));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        if (z2) {
            Context context = this.A0O.getContext();
            if (z5) {
                i3 = R.drawable.elevated_rounded_multiline_meta_ai_searchbar_background;
            } else {
                AbstractC13880nE.A0W(A0S, AbstractC53242c7.A0G(context, R.attr.inlineMetaAISearchBarHeight));
                i3 = R.drawable.elevated_rounded_meta_ai_searchbar_background;
            }
            A0S.setBackground(context.getDrawable(i3));
            A0S.setTranslationY(A0S.getY() + ((int) AbstractC13880nE.A04(A00(this), 5)));
            if (z7) {
                searchEditText.setHintTextColor(A00(this).getColor(R.color.ig_search_meta_ai_searchbar_hint_color));
            }
            ViewGroup.LayoutParams layoutParams4 = searchEditText.getLayoutParams();
            if (layoutParams4 != null) {
                searchEditText.getLayoutParams().height = -1;
                searchEditText.setLayoutParams(layoutParams4);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        return A0S;
    }

    @Override // X.InterfaceC56362iU
    public final void Ehq(InterfaceC60092or interfaceC60092or) {
        if (interfaceC60092or != null) {
            final WeakReference weakReference = new WeakReference(interfaceC60092or);
            C0fQ.A00(new View.OnClickListener(this) { // from class: X.3LE
                public final /* synthetic */ C56352iT A00;

                {
                    this.A00 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A05 = C0f9.A05(-423020299);
                    InterfaceC60092or interfaceC60092or2 = (InterfaceC60092or) weakReference.get();
                    if (interfaceC60092or2 != null) {
                        interfaceC60092or2.EMT();
                    } else {
                        this.A00.A0O.setOnClickListener(null);
                    }
                    C0f9.A0C(-254968727, A05);
                }
            }, this.A0O);
        } else {
            ViewGroup viewGroup = this.A0O;
            viewGroup.setOnClickListener(null);
            viewGroup.setClickable(false);
        }
    }

    @Override // X.InterfaceC56362iU
    public final void EkF(boolean z) {
        this.A0A = z;
        ViewGroup viewGroup = this.A0P;
        int i = 8;
        if (z) {
            i = 0;
        }
        viewGroup.setVisibility(i);
    }

    @Override // X.InterfaceC56362iU
    public final void EkG(boolean z) {
        InterfaceC56392iX interfaceC56392iX = this.A0T;
        int i = 8;
        if (z) {
            i = 0;
        }
        interfaceC56392iX.setVisibility(i);
    }

    @Override // X.InterfaceC56362iU
    public final void EkH(View.OnClickListener onClickListener, boolean z) {
        InterfaceC56392iX interfaceC56392iX = this.A0T;
        int i = 8;
        if (z) {
            i = 0;
        }
        interfaceC56392iX.setVisibility(i);
        if (interfaceC56392iX.CWW()) {
            C0fQ.A00(onClickListener, interfaceC56392iX.getView());
        }
    }

    @Override // X.InterfaceC56362iU
    public final void setIsLoading(boolean z) {
        ((ViewAnimator) this.A0T.getView()).setDisplayedChild(z ? 1 : 0);
        SpinnerImageView spinnerImageView = this.A0H;
        if (spinnerImageView != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            spinnerImageView.setVisibility(i);
        }
    }

    private final View A01(View.OnClickListener onClickListener, String str) {
        View inflate = LayoutInflater.from(A00(this)).inflate(R.layout.action_bar_button_text, this.A0O, false);
        View requireViewById = inflate.requireViewById(R.id.action_bar_button_text);
        C14360o3.A07(requireViewById);
        TextView textView = (TextView) requireViewById;
        textView.setText(str);
        C0fQ.A00(onClickListener, inflate);
        inflate.setContentDescription(str);
        if (C1QI.A0E().A00) {
            textView.setTextColor(C02G.A02(textView.getContext(), C1QI.A00(R.color.igds_primary_button)));
        }
        return inflate;
    }

    private final void A0C(View view, int i) {
        Resources.Theme theme = A00(this).getTheme();
        C14360o3.A07(theme);
        view.setBackgroundDrawable(new C3DW(theme, C05F.A00));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        int A04 = (int) AbstractC13880nE.A04(A00(this), 12);
        view.setPadding(A04, A04, A04, (int) AbstractC13880nE.A04(A00(this), 16));
        this.A0O.addView(view, i, layoutParams);
        C114795Gm c114795Gm = this.A09;
        if (c114795Gm != null) {
            Ehg(c114795Gm);
        }
    }

    public static final void A0H(C56352iT c56352iT) {
        ViewGroup viewGroup;
        c56352iT.EPD(A00(c56352iT).getDrawable(AbstractC53242c7.A0H(A00(c56352iT), R.attr.actionBarBackgroundColor)));
        c56352iT.A0L.setVisibility(8);
        c56352iT.A0M.setVisibility(8);
        ViewGroup viewGroup2 = c56352iT.A0O;
        viewGroup2.setOnClickListener(null);
        View view = c56352iT.A0j;
        if ((view instanceof LinearLayout) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.removeAllViews();
        }
        view.setVisibility(8);
        c56352iT.A03.setOnClickListener(null);
        InterfaceC56392iX interfaceC56392iX = c56352iT.A0T;
        interfaceC56392iX.setVisibility(8);
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setEnabled(true);
            Resources.Theme theme = A00(c56352iT).getTheme();
            C14360o3.A07(theme);
            interfaceC56392iX.getView().setBackgroundDrawable(new C3DW(theme, C05F.A00));
            interfaceC56392iX.getView().setOnClickListener(null);
            ViewGroup.LayoutParams layoutParams = interfaceC56392iX.getView().getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(0);
        }
        c56352iT.A0E.setVisibility(8);
        c56352iT.AHh();
        c56352iT.A09 = null;
        InterfaceC56392iX interfaceC56392iX2 = c56352iT.A0U;
        if (interfaceC56392iX2.CWW()) {
            c56352iT.A0Q().setVisibility(8);
            c56352iT.A0Q().setImageResource(c56352iT.A0J);
            C0fQ.A00(c56352iT.A0K, c56352iT.A0Q());
            c56352iT.A0Q().setContentDescription(viewGroup2.getResources().getString(2131953583));
            c56352iT.A0Q().setColorFilter(C3DY.A00(A00(c56352iT).getColor(AbstractC53242c7.A0H(A00(c56352iT), R.attr.igds_color_primary_icon))));
            ViewGroup.LayoutParams layoutParams2 = c56352iT.A0Q().getLayoutParams();
            C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(0);
            AbstractC13880nE.A0Y(c56352iT.A0Q(), A00(c56352iT).getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
            if (c56352iT.A0Q().getDrawable() != null) {
                c56352iT.A0Q().getDrawable().mutate().setAlpha(255);
            }
            c56352iT.Efw(null);
            c56352iT.A09();
            InterfaceC09390do interfaceC09390do = c56352iT.A0h;
            Object value = interfaceC09390do.getValue();
            C14360o3.A07(value);
            ((ViewGroup) value).removeAllViews();
            Object value2 = interfaceC09390do.getValue();
            C14360o3.A07(value2);
            ((View) value2).setVisibility(8);
            Object value3 = c56352iT.A0X.getValue();
            C14360o3.A07(value3);
            ((View) value3).setVisibility(8);
            Object value4 = c56352iT.A0Y.getValue();
            C14360o3.A07(value4);
            ((View) value4).setVisibility(8);
            Object value5 = c56352iT.A0b.getValue();
            C14360o3.A07(value5);
            ((View) value5).setVisibility(8);
            c56352iT.A0B(AbstractC53242c7.A0G(A00(c56352iT), R.attr.actionBarButtonWidth));
            AbstractC13880nE.A0d(interfaceC56392iX2.getView(), 0);
            c56352iT.A0D = false;
            A0I(c56352iT, A00(c56352iT).getColor(AbstractC53242c7.A0H(A00(c56352iT), R.attr.igds_color_primary_text)));
        }
        List<View> list = c56352iT.A0V;
        for (View view2 : list) {
            if (viewGroup2.indexOfChild(view2) != -1) {
                viewGroup2.removeView(view2);
            }
        }
        list.clear();
        A0G(c56352iT);
        c56352iT.A0C = false;
        ViewGroup viewGroup3 = c56352iT.A0Q;
        C14360o3.A0C(viewGroup3, "null cannot be cast to non-null type android.view.View");
        AbstractC13880nE.A0d(viewGroup3, 0);
        View view3 = c56352iT.A04;
        if (view3 != null) {
            c56352iT.A0P.removeView(view3);
            c56352iT.A04 = null;
        }
        FrameLayout frameLayout = c56352iT.A0S;
        frameLayout.setForeground(null);
        frameLayout.setWillNotDraw(false);
        c56352iT.A0H = null;
    }

    public static final void A0J(C56352iT c56352iT, CharSequence charSequence, boolean z) {
        IgTextView A05 = A05(c56352iT);
        A05.setText(charSequence);
        if (charSequence != null && charSequence.length() != 0) {
            A05.setImportantForAccessibility(1);
            A05.setContentDescription(charSequence);
        } else {
            A05.setImportantForAccessibility(2);
        }
        c56352iT.A0N(z);
        InterfaceC09390do interfaceC09390do = c56352iT.A0g;
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        ((TextView) value).setText((CharSequence) null);
        Object value2 = interfaceC09390do.getValue();
        C14360o3.A07(value2);
        ((View) value2).setVisibility(8);
    }

    public static final void A0K(C56352iT c56352iT, CharSequence charSequence, boolean z, boolean z2) {
        A0F(c56352iT);
        A0F(c56352iT);
        if ((c56352iT.A0Q().getVisibility() != 0 || z) && !c56352iT.A0P()) {
            A0J(c56352iT, charSequence, z2);
            c56352iT.A0M(charSequence, z);
        } else {
            c56352iT.A0M(charSequence, z);
            A0J(c56352iT, charSequence, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (r1 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0N(boolean r6) {
        /*
            r5 = this;
            A0F(r5)
            X.2iX r4 = r5.A0U
            boolean r0 = r4.CWW()
            if (r0 == 0) goto L28
            android.view.View r0 = r4.getView()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            X.C14360o3.A0C(r1, r0)
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 0
            r1.width = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.weight = r0
            android.view.View r0 = r4.getView()
            r0.setLayoutParams(r1)
        L28:
            boolean r0 = X.AbstractC14710oj.A08()
            com.instagram.common.ui.base.IgTextView r3 = A05(r5)
            if (r0 == 0) goto Ld7
            java.lang.Integer r2 = X.C05F.A0C
            com.instagram.common.ui.base.IgTextView r0 = A05(r5)
            android.content.Context r1 = r0.getContext()
            r0 = 0
            X.AbstractC14710oj.A07(r1, r0, r3, r2)
        L40:
            com.instagram.common.ui.base.IgTextView r1 = A05(r5)
            int r0 = r5.A01
            r1.setTextColor(r0)
            if (r6 == 0) goto L55
            com.instagram.common.ui.base.IgTextView r1 = A05(r5)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.setMaxLines(r0)
        L55:
            com.instagram.common.ui.base.IgTextView r0 = A05(r5)
            r3 = 0
            r0.setVisibility(r3)
            r4.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r0 = A04(r5)
            r4 = 8
            r0.setVisibility(r4)
            X.0do r0 = r5.A0Z
            java.lang.Object r0 = r0.getValue()
            X.C14360o3.A07(r0)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            X.0do r0 = r5.A0g
            java.lang.Object r2 = r0.getValue()
            X.C14360o3.A07(r2)
            android.view.View r2 = (android.view.View) r2
            if (r6 != 0) goto L9a
            java.lang.Object r0 = r0.getValue()
            X.C14360o3.A07(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L9a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L9c
        L9a:
            r0 = 8
        L9c:
            r2.setVisibility(r0)
            X.0do r0 = r5.A0f
            java.lang.Object r1 = r0.getValue()
            X.C14360o3.A07(r1)
            android.view.View r1 = (android.view.View) r1
            if (r6 != 0) goto Lc2
            java.lang.Object r0 = r0.getValue()
            X.C14360o3.A07(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto Lc2
            int r0 = r0.length()
            if (r0 == 0) goto Lc2
            r4 = 0
        Lc2:
            r1.setVisibility(r4)
            X.0do r0 = r5.A0a
            java.lang.Object r0 = r0.getValue()
            X.C14360o3.A07(r0)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
            r5.A08()
            return
        Ld7:
            android.content.Context r1 = A00(r5)
            r0 = 2132018636(0x7f1405cc, float:1.9675584E38)
            r3.setTextAppearance(r1, r0)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56352iT.A0N(boolean):void");
    }

    private final void A0O(boolean z) {
        A0F(this);
        IgTextView A04 = A04(this);
        int i = 0;
        if (z) {
            i = 8;
        }
        A04.setVisibility(i);
        Object value = this.A0Z.getValue();
        C14360o3.A07(value);
        View view = (View) value;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        view.setVisibility(i2);
        this.A0U.setVisibility(0);
        A05(this).setVisibility(8);
        Object value2 = this.A0a.getValue();
        C14360o3.A07(value2);
        ((View) value2).setVisibility(0);
        A08();
    }

    public final AnimatedHintsTextLayout A0S(boolean z) {
        A0F(this);
        ViewGroup viewGroup = this.A0O;
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        int i = dimensionPixelSize;
        if (A0Q().getVisibility() == 0) {
            i = 0;
        }
        int indexOfChild = viewGroup.indexOfChild(this.A0Q) + 2;
        if (viewGroup.getChildAt(indexOfChild) != null && viewGroup.getChildAt(indexOfChild).getVisibility() == 0) {
            dimensionPixelSize = 0;
        }
        View ESm = ESm(R.layout.action_bar_title_search, i, dimensionPixelSize, true);
        C14360o3.A0C(ESm, "null cannot be cast to non-null type android.view.ViewGroup");
        View requireViewById = ESm.requireViewById(R.id.action_bar_search_hints_text_layout);
        C14360o3.A07(requireViewById);
        AnimatedHintsTextLayout animatedHintsTextLayout = (AnimatedHintsTextLayout) requireViewById;
        View requireViewById2 = animatedHintsTextLayout.requireViewById(R.id.action_bar_search_edit_text);
        C14360o3.A07(requireViewById2);
        TextView textView = (TextView) requireViewById2;
        animatedHintsTextLayout.A0B = new U01(this);
        animatedHintsTextLayout.A02 = this.A00;
        ViewGroup.LayoutParams layoutParams = ESm.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) AbstractC13880nE.A04(A00(this), 10);
        ((ViewGroup.LayoutParams) layoutParams2).height = -2;
        layoutParams2.gravity = 80;
        ESm.setLayoutParams(layoutParams2);
        Context A00 = A00(this);
        Context A002 = A00(this);
        int i2 = R.attr.igds_color_primary_icon;
        if (z) {
            i2 = R.attr.igds_color_secondary_icon;
        }
        ColorFilter A003 = C3DY.A00(A00.getColor(AbstractC53242c7.A0H(A002, i2)));
        Drawable drawable = textView.getCompoundDrawablesRelative()[0];
        if (drawable != null) {
            drawable.mutate();
            drawable.setAlpha(51);
            drawable.setColorFilter(A003);
        }
        return animatedHintsTextLayout;
    }

    public final void A0U(int i) {
        A0Q().setColorFilter(C3DY.A00(AbstractC53242c7.A0F(A00(this), i)));
    }

    public final void A0V(int i) {
        ImageView imageView;
        A0F(this);
        A0I(this, i);
        ColorFilter A00 = C3DY.A00(i);
        if (A0Q().getVisibility() == 0) {
            A0Q().setColorFilter(A00);
        }
        ImageView imageView2 = this.A07;
        if (imageView2 != null && imageView2.getVisibility() == 0 && (imageView = this.A07) != null) {
            imageView.setColorFilter(A00);
        }
    }

    @Override // X.InterfaceC56362iU
    public final View A8u(C3LY c3ly) {
        int i;
        int i2;
        View A02 = A02(c3ly);
        boolean z = true;
        if (!this.A0D) {
            z = false;
        }
        this.A0D = z;
        this.A0V.add(A02);
        InterfaceC56392iX interfaceC56392iX = this.A0U;
        if (interfaceC56392iX.CWW()) {
            i = ((ViewGroup) interfaceC56392iX.getView()).indexOfChild(A0Q());
        } else {
            i = -1;
        }
        int i3 = i + 1;
        LinearLayout.LayoutParams A03 = A03(A02, c3ly, true);
        if (this.A0C) {
            if (C57992lC.A03()) {
                i2 = C57992lC.A01();
            } else {
                i2 = 0;
            }
            AbstractC13880nE.A0d(A02, i2);
        }
        this.A0O.addView(A02, i3, A03);
        C114795Gm c114795Gm = this.A09;
        if (c114795Gm != null) {
            Ehg(c114795Gm);
        }
        return A02;
    }

    @Override // X.InterfaceC56362iU
    public final IgTextView C94() {
        A0F(this);
        if (A04(this).getVisibility() != 8) {
            return A04(this);
        }
        InterfaceC09390do interfaceC09390do = this.A0Z;
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        if (((View) value).getVisibility() != 8) {
            Object value2 = interfaceC09390do.getValue();
            C14360o3.A07(value2);
            return (IgTextView) value2;
        }
        return A05(this);
    }

    @Override // X.InterfaceC56362iU
    public final void ESl(int i) {
        A0B(Math.max(AbstractC53242c7.A0G(A00(this), R.attr.actionBarButtonWidth), i));
    }

    @Override // X.InterfaceC56362iU
    public final View ESm(int i, int i2, int i3, boolean z) {
        LayoutInflater from = LayoutInflater.from(A00(this));
        ViewGroup viewGroup = this.A0Q;
        View inflate = from.inflate(i, viewGroup, false);
        viewGroup.addView(inflate);
        viewGroup.setVisibility(0);
        AbstractC13880nE.A0a(viewGroup, i2);
        AbstractC13880nE.A0c(viewGroup, i3);
        if (z) {
            A07();
        }
        A09();
        A08();
        C14360o3.A0A(inflate);
        return inflate;
    }

    @Override // X.InterfaceC56362iU
    public final void ETp(boolean z) {
        A0Q().setEnabled(z);
    }

    @Override // X.InterfaceC56362iU
    public final void EaX(SpannableStringBuilder spannableStringBuilder, View view, CharSequence charSequence) {
        Efv(spannableStringBuilder);
        Ef5(charSequence);
        A0F(this);
        InterfaceC09390do interfaceC09390do = this.A0h;
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        ((ViewGroup) value).removeView(view);
        Object value2 = interfaceC09390do.getValue();
        C14360o3.A07(value2);
        ((ViewGroup) value2).addView(view);
        Object value3 = interfaceC09390do.getValue();
        C14360o3.A07(value3);
        ((View) value3).setVisibility(0);
        A05(this).setTextAppearance(A00(this), R.style.igds_emphasized_body_1_panorama);
    }

    @Override // X.InterfaceC56362iU
    public final IgTextView Eft(int i, int i2) {
        Efu(i);
        A0I(this, A00(this).getColor(i2));
        return C94();
    }

    @Override // X.InterfaceC56362iU
    public final void Efu(int i) {
        setTitle(A00(this).getString(i));
    }

    @Override // X.InterfaceC56362iU
    public final void EgR(int i) {
        A0F(this);
        this.A0C = true;
        AbstractC13880nE.A0d(this.A0Q, i);
        AbstractC13880nE.A0d(this.A0U.getView(), i);
        ESl(AbstractC53242c7.A0G(A00(this), R.attr.actionBarButtonWidth) + i);
    }

    @Override // X.InterfaceC56362iU
    public final ActionButton Eha(View.OnClickListener onClickListener, int i) {
        return A0R(onClickListener, i, C1QI.A00(AbstractC53242c7.A0H(A00(this), R.attr.igds_color_primary_button)));
    }

    @Override // X.InterfaceC56362iU
    public final ActionButton Ehi(View.OnClickListener onClickListener, int i) {
        EPD(A00(this).getDrawable(AbstractC53242c7.A0H(A00(this), R.attr.modalActionBarBackground)));
        Resources resources = this.A0O.getResources();
        setTitle(resources.getString(i));
        A0Q().setVisibility(0);
        A0Q().setImageResource(this.A0J);
        ActionButton actionButton = (ActionButton) this.A0T.getView();
        actionButton.setVisibility(0);
        actionButton.setButtonResource(R.drawable.instagram_arrow_right_pano_outline_24);
        actionButton.setContentDescription(resources.getString(2131968535));
        C0fQ.A00(onClickListener, actionButton);
        actionButton.setBackgroundResource(AbstractC53242c7.A0H(A00(this), R.attr.actionBarBackground));
        actionButton.setColorFilter(C3DY.A00(A00(this).getColor(AbstractC53242c7.A0C(A00(this)))));
        setIsLoading(false);
        return actionButton;
    }

    @Override // X.InterfaceC56362iU
    public final ActionButton Ehj(C31722DwR c31722DwR) {
        EPD(A00(this).getDrawable(AbstractC53242c7.A0H(A00(this), R.attr.modalActionBarBackground)));
        String str = c31722DwR.A02;
        if (str != null) {
            setTitle(str);
            int i = c31722DwR.A00;
            if (i == 0) {
                i = R.drawable.instagram_x_pano_outline_24;
            }
            EkT(null, true);
            A0Q().setImageResource(i);
        }
        ActionButton Eha = Eha(c31722DwR.A01, R.drawable.instagram_check_pano_outline_24);
        Eha.setContentDescription(this.A0O.getResources().getString(2131961124));
        return Eha;
    }

    @Override // X.InterfaceC56362iU
    public final void Ehk(String str) {
        EPD(A00(this).getDrawable(AbstractC53242c7.A0H(A00(this), R.attr.modalActionBarBackground)));
        setTitle(str);
        EkT(null, true);
        A0Q().setImageResource(R.drawable.instagram_x_pano_outline_24);
    }

    @Override // X.InterfaceC56362iU
    public final void EkT(View.OnClickListener onClickListener, boolean z) {
        A0F(this);
        if (onClickListener != null) {
            C0fQ.A00(onClickListener, A0Q());
        }
        ImageView A0Q = A0Q();
        int i = 8;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        A0Q.setVisibility(i2);
        InterfaceC56392iX interfaceC56392iX = this.A0U;
        if (z) {
            i = 0;
        }
        interfaceC56392iX.setVisibility(i);
        A0Q().setColorFilter(this.A01);
        if (this.A0Q.getChildCount() > 0) {
            A07();
            return;
        }
        A0F(this);
        boolean z2 = false;
        if (A0Q().getVisibility() == 0) {
            z2 = true;
        }
        if (!z2 && !A0P()) {
            A0O(false);
        } else {
            A0N(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r2 != (-2)) goto L10;
     */
    @Override // X.InterfaceC56362iU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Eka(boolean r5) {
        /*
            r4 = this;
            A0F(r4)
            X.0do r3 = r4.A0X
            java.lang.Object r1 = r3.getValue()
            X.C14360o3.A07(r1)
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setVisibility(r0)
            java.lang.Object r0 = r3.getValue()
            X.C14360o3.A07(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L48
            X.5Gm r0 = r4.A09
            if (r0 == 0) goto L49
            int r2 = r0.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L49
            r0 = -2
            if (r2 == r0) goto L49
        L30:
            java.lang.Object r0 = r3.getValue()
            X.C14360o3.A07(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.Drawable r1 = r0.mutate()
            android.graphics.ColorFilter r0 = X.C3DY.A00(r2)
            r1.setColorFilter(r0)
        L48:
            return
        L49:
            android.content.Context r2 = A00(r4)
            android.content.Context r1 = A00(r4)
            r0 = 2130970276(0x7f0406a4, float:1.7549258E38)
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            int r2 = r2.getColor(r0)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56352iT.Eka(boolean):void");
    }

    @Override // X.InterfaceC56362iU
    public final void setTitle(String str) {
        AHh();
        A0K(this, str, false, false);
    }
}
