package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.NFi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52368NFi extends IgLinearLayout {
    public View.OnClickListener A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public InterfaceC190658cN A05;
    public IgdsSwitch A06;
    public CharSequence A07;
    public CharSequence A08;
    public InterfaceC16620sF A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final View A0F;
    public final GradientSpinnerAvatarView A0G;

    public C52368NFi(Context context) {
        super(context);
        this.A0A = true;
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), this, R.layout.layout_share_content_row_action_with_profile_Image_and_switch);
        this.A0F = A0A;
        this.A0G = (GradientSpinnerAvatarView) A0A.requireViewById(R.id.profile_picture);
    }

    private final void A00() {
        TextView textView = this.A04;
        float f = 0.3f;
        if (textView != null) {
            textView.setAlpha(AbstractC31175DnJ.A00(this.A0E ? 1 : 0));
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            if (!this.A0E) {
                f = 1.0f;
            }
            textView2.setAlpha(f);
        }
    }

    private final void setShouldShowFeaturedBadge(boolean z) {
        View view = this.A01;
        if (view != null) {
            view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }

    private final void setShouldShowNewBadge(boolean z) {
        this.A0D = z;
        View view = this.A02;
        if (view != null) {
            view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }

    public final boolean getEnableSwitchView() {
        return this.A0A;
    }

    public final boolean getHideSwitchView() {
        return this.A0B;
    }

    public final InterfaceC16620sF getOnCheckedChangeListener() {
        return this.A09;
    }

    public final View.OnClickListener getOnCheckedClickedListener() {
        return this.A00;
    }

    public final InterfaceC190658cN getOnToggleListener() {
        return this.A05;
    }

    public final View getPrimaryTextView() {
        return this.A04;
    }

    public final GradientSpinnerAvatarView getProfileImageView() {
        return this.A0G;
    }

    public final boolean getShowDisabledState() {
        return this.A0E;
    }

    public final CharSequence getSubtitle() {
        return this.A07;
    }

    public final View getSwitchView() {
        return this.A06;
    }

    public final CharSequence getTitle() {
        return this.A08;
    }

    public final void setChecked(boolean z) {
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch == null) {
            this.A0C = z;
        } else {
            igdsSwitch.setChecked(z);
        }
    }

    public final void setEnableSwitchView(boolean z) {
        this.A0A = z;
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch != null) {
            igdsSwitch.setEnabled(z);
        }
    }

    public final void setHideSwitchView(boolean z) {
        this.A0B = z;
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch != null) {
            igdsSwitch.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
        }
    }

    public final void setInlineSubtitleLinkable(boolean z) {
        TextView textView;
        if (z && (textView = this.A03) != null) {
            AbstractC25227BEk.A11(textView);
        }
    }

    public final void setOnCheckedChangeListener(InterfaceC16620sF interfaceC16620sF) {
        C55519OlD c55519OlD;
        this.A09 = interfaceC16620sF;
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch != null) {
            if (interfaceC16620sF != null) {
                c55519OlD = new C55519OlD(interfaceC16620sF, 10);
            } else {
                c55519OlD = null;
            }
            igdsSwitch.setOnCheckedChangeListener(c55519OlD);
        }
    }

    public final void setOnCheckedClickedListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch != null) {
            igdsSwitch.setOnClickListener(onClickListener);
        }
    }

    public final void setOnToggleListener(InterfaceC190658cN interfaceC190658cN) {
        this.A05 = interfaceC190658cN;
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch != null) {
            igdsSwitch.A07 = interfaceC190658cN;
        }
    }

    public final void setShowDisabledState(boolean z) {
        this.A0E = z;
        A00();
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.A07 = charSequence;
        TextView textView = this.A03;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            int i = 0;
            if (charSequence == null || AbstractC001900j.A0T(charSequence)) {
                i = 8;
            }
            textView2.setVisibility(i);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        int A06 = C0f9.A06(-470734323);
        super.onAttachedToWindow();
        View view = this.A0F;
        if (view.getParent() == null) {
            this.A04 = AbstractC31180DnO.A06(view);
            this.A03 = AbstractC31176DnK.A0E(view);
            IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.toggle);
            this.A06 = igdsSwitch;
            int i = 8;
            if (igdsSwitch != null) {
                igdsSwitch.setVisibility(AbstractC31175DnJ.A01(this.A0B ? 1 : 0));
            }
            IgdsSwitch igdsSwitch2 = this.A06;
            if (igdsSwitch2 != null) {
                igdsSwitch2.setEnabled(this.A0A);
            }
            this.A02 = view.requireViewById(R.id.new_badge_stub);
            this.A01 = view.requireViewById(R.id.featured_badge_stub);
            view.setFocusable(true);
            TextView textView = this.A04;
            if (textView != null) {
                textView.setText(this.A08);
            }
            TextView textView2 = this.A03;
            if (textView2 != null) {
                textView2.setText(this.A07);
            }
            CharSequence charSequence = this.A07;
            if (charSequence != null && !AbstractC001900j.A0T(charSequence)) {
                TextView textView3 = this.A03;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                TextView textView4 = this.A03;
                if (textView4 != null) {
                    textView4.setFocusable(true);
                }
            }
            IgdsSwitch igdsSwitch3 = this.A06;
            if (igdsSwitch3 != null) {
                igdsSwitch3.setChecked(this.A0C);
            }
            IgdsSwitch igdsSwitch4 = this.A06;
            if (igdsSwitch4 != null) {
                InterfaceC16620sF interfaceC16620sF = this.A09;
                if (interfaceC16620sF != null) {
                    onCheckedChangeListener = new C55519OlD(interfaceC16620sF, 10);
                } else {
                    onCheckedChangeListener = null;
                }
                igdsSwitch4.setOnCheckedChangeListener(onCheckedChangeListener);
            }
            IgdsSwitch igdsSwitch5 = this.A06;
            if (igdsSwitch5 != null) {
                igdsSwitch5.setOnClickListener(this.A00);
            }
            IgdsSwitch igdsSwitch6 = this.A06;
            if (igdsSwitch6 != null) {
                igdsSwitch6.A07 = this.A05;
            }
            A00();
            View view2 = this.A02;
            if (view2 != null) {
                if (this.A0D) {
                    i = 0;
                }
                view2.setVisibility(i);
            }
            AbstractC56952jT.A04(view, C05F.A06);
            addView(view);
        }
        C0f9.A0D(105911006, A06);
    }

    public final void setProfileImage(InterfaceC11380iw interfaceC11380iw, String str, Drawable drawable) {
        AbstractC167017dG.A1N(interfaceC11380iw, str);
        C14360o3.A0B(drawable, 2);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0G;
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.setBottomBadgeDrawable(drawable);
            gradientSpinnerAvatarView.A0F(null, interfaceC11380iw, AbstractC25225BEi.A0t(str));
            gradientSpinnerAvatarView.A00 = AbstractC13880nE.A04(AbstractC166997dE.A0L(getRootView()), 2);
            gradientSpinnerAvatarView.A01 = AbstractC13880nE.A04(AbstractC166997dE.A0L(getRootView()), 2);
            gradientSpinnerAvatarView.A05();
        }
    }

    public final void setProfileImage(Drawable drawable) {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0G;
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.setBottomBadgeDrawable(null);
            gradientSpinnerAvatarView.A0D(drawable);
            gradientSpinnerAvatarView.A05();
        }
    }
}
