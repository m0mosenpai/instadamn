package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class KD8 extends AbstractC59962oe implements InterfaceC189488aT, InterfaceC50436MOq, MQw {
    public static final String __redex_internal_original_name = "DirectPollMessageCreationFragment";
    public View A00;
    public LinearLayout A01;
    public NestedScrollView A02;
    public C48787Lhu A03;
    public C47359Kw8 A04;
    public IgdsBottomButtonLayout A05;
    public IgFormField A06;
    public DirectShareTarget A07;
    public View A08;
    public ViewGroup A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public IgImageView A0C;
    public C7IK A0D;
    public final long A0E = 200;
    public final AnonymousClass987 A0H = new AnonymousClass987();
    public final String A0F = "direct_poll_message";
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);
    public final boolean A0I = true;

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.8f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
        View view = this.A00;
        if (view != null) {
            AbstractC43593JPy.A1C(view, 0);
        }
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        int i3 = i + i2;
        View view = this.A00;
        if (view != null) {
            AbstractC43593JPy.A1C(view, i3);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A09 = AbstractC31173DnH.A0F(view, R.id.poll_message_root_container);
        this.A08 = view.requireViewById(R.id.drag_handle);
        this.A0B = AbstractC31172DnG.A0X(view, R.id.poll_message_title);
        IgImageView A0Z = AbstractC31172DnG.A0Z(view, R.id.poll_message_back_button);
        this.A0C = A0Z;
        if (A0Z != null) {
            ViewOnClickListenerC48072LPx.A01(A0Z, 38, this);
        }
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.poll_message_cancel);
        this.A0A = A0X;
        if (A0X != null) {
            ViewOnClickListenerC48072LPx.A01(A0X, 39, this);
        }
        this.A02 = (NestedScrollView) view.requireViewById(R.id.poll_message_scroll_view);
        IgFormField igFormField = (IgFormField) view.requireViewById(R.id.poll_message_question);
        this.A06 = igFormField;
        if (igFormField != null) {
            igFormField.A0H(new LO2(this, 7));
        }
        LinearLayout A0B = AbstractC31172DnG.A0B(view, R.id.poll_message_options_layout);
        this.A01 = A0B;
        this.A03 = new C48787Lhu(new C47357Kw6(this));
        if (A0B != null) {
            A0B.setLayoutTransition(new LayoutTransition());
        }
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.poll_message_create_button);
        this.A05 = A0j;
        int i = 0;
        if (A0j != null) {
            A0j.setPrimaryButtonEnabled(false);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A05;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(ViewOnClickListenerC48072LPx.A00(this, 40));
        }
        this.A00 = view.requireViewById(R.id.poll_message_spacing_view);
        A00();
        C48787Lhu c48787Lhu = this.A03;
        if (c48787Lhu != null) {
            if (c48787Lhu.A02.isEmpty()) {
                C48787Lhu c48787Lhu2 = this.A03;
                if (c48787Lhu2 != null) {
                    c48787Lhu2.A03();
                }
            }
            Bundle requireArguments = requireArguments();
            if (requireArguments.containsKey("bottom_sheet_top_y") && requireArguments.containsKey("bottom_sheet_bottom_y")) {
                onBottomSheetPositionChanged(requireArguments.getInt("bottom_sheet_top_y", 0), requireArguments.getInt("bottom_sheet_bottom_y", 0));
            }
            IgImageView igImageView = this.A0C;
            if (igImageView != null) {
                igImageView.setVisibility(AbstractC167007dF.A05(requireArguments.getBoolean("should_show_back_button", true) ? 1 : 0));
            }
            View view2 = this.A08;
            if (view2 != null) {
                if (!requireArguments.getBoolean("should_show_drag_handle", false)) {
                    i = 8;
                }
                view2.setVisibility(i);
                return;
            }
            return;
        }
        C14360o3.A0F("controller");
        throw C00O.createAndThrow();
    }

    private final void A00() {
        C7IK c7ik = this.A0D;
        if (c7ik != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), c7ik.A0E);
            IgTextView igTextView = this.A0B;
            if (igTextView != null) {
                igTextView.setTextColor(AbstractC53242c7.A0F(contextThemeWrapper, R.attr.textColorPrimary));
            }
            IgImageView igImageView = this.A0C;
            if (igImageView != null) {
                igImageView.setColorFilter(AbstractC53242c7.A01(contextThemeWrapper));
            }
            IgTextView igTextView2 = this.A0A;
            if (igTextView2 != null) {
                igTextView2.setTextColor(AbstractC53242c7.A0F(contextThemeWrapper, R.attr.textColorPrimary));
            }
        }
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
        this.A0D = c7ik;
        A00();
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A0I;
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
        View view = this.A00;
        if (view != null) {
            AbstractC43593JPy.A1C(view, i);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0F;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        NestedScrollView nestedScrollView = this.A02;
        if (nestedScrollView == null || nestedScrollView.getScrollY() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.8f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(298187806);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable(AbstractC111324zv.A00(771));
        C14360o3.A0C(parcelable, "null cannot be cast to non-null type com.instagram.model.direct.DirectShareTarget");
        this.A07 = (DirectShareTarget) parcelable;
        InterfaceC09390do interfaceC09390do = this.A0G;
        this.A04 = new C47359Kw8(this, AbstractC166987dD.A0r(interfaceC09390do));
        DirectShareTarget directShareTarget = this.A07;
        String str2 = "shareTarget";
        if (directShareTarget != null) {
            if (!(directShareTarget.A02() instanceof MsysThreadId)) {
                C47359Kw8 c47359Kw8 = this.A04;
                if (c47359Kw8 == null) {
                    str2 = "logger";
                } else {
                    DirectShareTarget directShareTarget2 = this.A07;
                    if (directShareTarget2 != null) {
                        InterfaceC83713oG A01 = directShareTarget2.A01();
                        DirectShareTarget directShareTarget3 = this.A07;
                        if (directShareTarget3 != null) {
                            boolean A0Y = directShareTarget3.A0Y(AbstractC31173DnH.A0t(interfaceC09390do));
                            C83693oE A00 = AbstractC140956Yx.A00(AbstractC140946Yw.A01(A01));
                            if (A00 != null && (str = A00.A00) != null) {
                                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c47359Kw8.A00, "start_new_poll");
                                C0Zx c0Zx = new C0Zx();
                                AbstractC43594JPz.A1F(c0Zx, str, A0Y);
                                AbstractC43592JPx.A1L(A0f, c0Zx);
                            } else {
                                AbstractC166987dD.A1T(C18950wb.A01, "threadId is null while reporting start poll event", 20134884);
                            }
                        }
                    }
                }
            }
            C0f9.A09(1752382451, A02);
            return;
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1083200530);
        C14360o3.A0B(layoutInflater, 0);
        this.A0H.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_poll_message_creation, viewGroup, false);
        C0f9.A09(771150532, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(721763993);
        super.onDestroyView();
        this.A09 = null;
        this.A0B = null;
        this.A0C = null;
        this.A0A = null;
        this.A02 = null;
        this.A06 = null;
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.A01 = null;
        this.A05 = null;
        this.A00 = null;
        C0f9.A09(-632684216, A02);
    }
}
