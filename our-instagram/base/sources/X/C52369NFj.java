package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.NFj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52369NFj extends IgLinearLayout {
    public Drawable A00;
    public View.OnClickListener A01;
    public View A02;
    public View A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public InterfaceC190658cN A07;
    public IgdsSwitch A08;
    public CharSequence A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public InterfaceC16620sF A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final View A0L;
    public final IgSimpleImageView A0M;

    public C52369NFj(Context context) {
        super(context);
        this.A0D = true;
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), this, R.layout.layout_share_content_row_action_with_switch);
        this.A0L = A0A;
        this.A0M = MSX.A0I(A0A, R.id.icon);
    }

    public final void A03() {
        setShouldShowFeaturedBadge(false);
    }

    public final void A04() {
        setShouldShowNewBadge(false);
    }

    public final void A05() {
        setShouldShowFeaturedBadge(true);
        setShouldShowNewBadge(false);
    }

    public final void A06() {
        setShouldShowNewBadge(true);
    }

    private final void A00() {
        TextView textView = this.A06;
        float f = 0.3f;
        if (textView != null) {
            textView.setAlpha(AbstractC31175DnJ.A00(this.A0K ? 1 : 0));
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            if (!this.A0K) {
                f = 1.0f;
            }
            textView2.setAlpha(f);
        }
    }

    private final void A01(int i) {
        ConstraintLayout constraintLayout;
        View view = this.A0L;
        if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
            C110964z8 c110964z8 = new C110964z8();
            c110964z8.A0I(constraintLayout);
            c110964z8.A0C(i, 3, R.id.title_inline_layout, 3);
            c110964z8.A0G(constraintLayout);
        }
    }

    public static void A02(C52369NFj c52369NFj, Object obj, int i) {
        c52369NFj.setOnToggleListener(new P3T(obj, i));
    }

    private final void setShouldShowFeaturedBadge(boolean z) {
        this.A0I = z;
        View view = this.A02;
        if (view != null) {
            view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }

    private final void setShouldShowNewBadge(boolean z) {
        this.A0J = z;
        View view = this.A03;
        if (view != null) {
            view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
    }

    public final CharSequence getDescription() {
        return this.A09;
    }

    public final boolean getEnableSwitchView() {
        return this.A0D;
    }

    public final boolean getHideSwitchView() {
        return this.A0E;
    }

    public final Drawable getIcon() {
        return this.A00;
    }

    public final View getIconImageView() {
        return this.A0M;
    }

    public final InterfaceC16620sF getOnCheckedChangeListener() {
        return this.A0C;
    }

    public final View.OnClickListener getOnCheckedClickedListener() {
        return this.A01;
    }

    public final InterfaceC190658cN getOnToggleListener() {
        return this.A07;
    }

    public final View getPrimaryTextView() {
        return this.A06;
    }

    public final boolean getShowDisabledState() {
        return this.A0K;
    }

    public final CharSequence getSubtitle() {
        return this.A0A;
    }

    public final View getSwitchView() {
        return this.A08;
    }

    public final CharSequence getTitle() {
        return this.A0B;
    }

    public final void setChecked(boolean z) {
        IgdsSwitch igdsSwitch = this.A08;
        if (igdsSwitch == null) {
            this.A0F = z;
        } else {
            igdsSwitch.setChecked(z);
        }
    }

    public final void setDescription(CharSequence charSequence) {
        this.A09 = charSequence;
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(charSequence);
        }
        if (charSequence != null && !AbstractC001900j.A0T(charSequence)) {
            TextView textView2 = this.A04;
            if (textView2 != null) {
                textView2.setVisibility(0);
                return;
            }
            return;
        }
        AbstractC167007dF.A0x(this.A04);
        A01(R.id.icon);
        A01(R.id.toggle);
    }

    public final void setEnableSwitchView(boolean z) {
        this.A0D = z;
        IgdsSwitch igdsSwitch = this.A08;
        if (igdsSwitch != null) {
            igdsSwitch.setEnabled(z);
        }
    }

    public final void setHideSwitchView(boolean z) {
        this.A0E = z;
        IgdsSwitch igdsSwitch = this.A08;
        if (igdsSwitch != null) {
            igdsSwitch.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
        }
    }

    public final void setIcon(Drawable drawable) {
        int i;
        this.A00 = drawable;
        IgSimpleImageView igSimpleImageView = this.A0M;
        if (igSimpleImageView != null) {
            if (drawable == null) {
                i = 8;
            } else {
                igSimpleImageView.setImageDrawable(drawable);
                i = 0;
            }
            igSimpleImageView.setVisibility(i);
        }
    }

    public final void setInlineDescriptionLinkable(boolean z) {
        TextView textView;
        this.A0G = z;
        if (z && (textView = this.A04) != null) {
            AbstractC25227BEk.A11(textView);
        }
    }

    public final void setInlineSubtitleLinkable(boolean z) {
        TextView textView;
        this.A0H = z;
        if (z && (textView = this.A05) != null) {
            AbstractC25227BEk.A11(textView);
        }
    }

    public final void setOnCheckedChangeListener(InterfaceC16620sF interfaceC16620sF) {
        C55519OlD c55519OlD;
        this.A0C = interfaceC16620sF;
        IgdsSwitch igdsSwitch = this.A08;
        if (igdsSwitch != null) {
            if (interfaceC16620sF != null) {
                c55519OlD = new C55519OlD(interfaceC16620sF, 11);
            } else {
                c55519OlD = null;
            }
            igdsSwitch.setOnCheckedChangeListener(c55519OlD);
        }
    }

    public final void setOnCheckedClickedListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
        IgdsSwitch igdsSwitch = this.A08;
        if (igdsSwitch != null) {
            igdsSwitch.setOnClickListener(onClickListener);
        }
    }

    public final void setOnToggleListener(InterfaceC190658cN interfaceC190658cN) {
        this.A07 = interfaceC190658cN;
        IgdsSwitch igdsSwitch = this.A08;
        if (igdsSwitch != null) {
            igdsSwitch.A07 = interfaceC190658cN;
        }
    }

    public final void setShowDisabledState(boolean z) {
        this.A0K = z;
        A00();
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.A0A = charSequence;
        TextView textView = this.A05;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            int i = 0;
            if (charSequence == null || AbstractC001900j.A0T(charSequence)) {
                i = 8;
            }
            textView2.setVisibility(i);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.A0B = charSequence;
        TextView textView = this.A06;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        int i;
        TextView textView;
        TextView textView2;
        int A06 = C0f9.A06(-199703203);
        super.onAttachedToWindow();
        View view = this.A0L;
        if (view.getParent() == null) {
            this.A06 = AbstractC31180DnO.A06(view);
            this.A05 = AbstractC31176DnK.A0E(view);
            IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.toggle);
            this.A08 = igdsSwitch;
            int i2 = 8;
            if (igdsSwitch != null) {
                igdsSwitch.setVisibility(AbstractC31175DnJ.A01(this.A0E ? 1 : 0));
            }
            IgdsSwitch igdsSwitch2 = this.A08;
            if (igdsSwitch2 != null) {
                igdsSwitch2.setEnabled(this.A0D);
            }
            this.A03 = view.requireViewById(R.id.new_badge_stub);
            this.A02 = view.requireViewById(R.id.featured_badge_stub);
            this.A04 = AbstractC166997dE.A0T(view, R.id.description);
            view.setFocusable(true);
            TextView textView3 = this.A06;
            if (textView3 != null) {
                textView3.setText(this.A0B);
            }
            TextView textView4 = this.A05;
            if (textView4 != null) {
                textView4.setText(this.A0A);
            }
            CharSequence charSequence = this.A0A;
            if (charSequence != null && !AbstractC001900j.A0T(charSequence)) {
                TextView textView5 = this.A05;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                TextView textView6 = this.A05;
                if (textView6 != null) {
                    textView6.setFocusable(true);
                }
                if (this.A0H && (textView2 = this.A05) != null) {
                    AbstractC25227BEk.A11(textView2);
                }
            } else {
                A01(R.id.icon);
                A01(R.id.toggle);
            }
            TextView textView7 = this.A04;
            if (textView7 != null) {
                textView7.setText(this.A09);
            }
            CharSequence charSequence2 = this.A09;
            if (charSequence2 != null && !AbstractC001900j.A0T(charSequence2)) {
                TextView textView8 = this.A04;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                }
                TextView textView9 = this.A04;
                if (textView9 != null) {
                    textView9.setFocusable(true);
                }
                if (this.A0G && (textView = this.A04) != null) {
                    AbstractC25227BEk.A11(textView);
                }
            }
            IgSimpleImageView igSimpleImageView = this.A0M;
            if (igSimpleImageView != null) {
                Drawable drawable = this.A00;
                if (drawable == null) {
                    i = 8;
                } else {
                    igSimpleImageView.setImageDrawable(drawable);
                    i = 0;
                }
                igSimpleImageView.setVisibility(i);
            }
            IgdsSwitch igdsSwitch3 = this.A08;
            if (igdsSwitch3 != null) {
                igdsSwitch3.setChecked(this.A0F);
            }
            IgdsSwitch igdsSwitch4 = this.A08;
            if (igdsSwitch4 != null) {
                InterfaceC16620sF interfaceC16620sF = this.A0C;
                if (interfaceC16620sF != null) {
                    onCheckedChangeListener = new C55519OlD(interfaceC16620sF, 11);
                } else {
                    onCheckedChangeListener = null;
                }
                igdsSwitch4.setOnCheckedChangeListener(onCheckedChangeListener);
            }
            IgdsSwitch igdsSwitch5 = this.A08;
            if (igdsSwitch5 != null) {
                igdsSwitch5.setOnClickListener(this.A01);
            }
            IgdsSwitch igdsSwitch6 = this.A08;
            if (igdsSwitch6 != null) {
                igdsSwitch6.A07 = this.A07;
            }
            A00();
            View view2 = this.A02;
            if (view2 != null) {
                view2.setVisibility(AbstractC167007dF.A05(this.A0I ? 1 : 0));
            }
            View view3 = this.A03;
            if (view3 != null) {
                if (this.A0J && !this.A0I) {
                    i2 = 0;
                }
                view3.setVisibility(i2);
            }
            AbstractC56952jT.A04(view, C05F.A06);
            addView(view);
        }
        C0f9.A0D(-1812577447, A06);
    }
}
