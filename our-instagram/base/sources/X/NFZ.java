package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class NFZ extends IgFrameLayout {
    public final JMH A00;
    public final JWE A01;
    public final boolean A02;

    public static final void A00(Context context, JWE jwe, NFZ nfz) {
        ViewGroup viewGroup;
        TextView textView;
        Drawable drawable;
        Drawable drawable2;
        View childAt = jwe.getChildAt(0);
        if ((childAt instanceof IgFrameLayout) && (viewGroup = (ViewGroup) childAt) != null) {
            View childAt2 = viewGroup.getChildAt(0);
            if ((childAt2 instanceof IgTextView) && (textView = (TextView) childAt2) != null) {
                boolean z = nfz.A02;
                JMH jmh = nfz.A00;
                if (z) {
                    String emoji = jmh.getEmoji();
                    if (emoji != null) {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.autocomplete_dropdown_header_text_size);
                        C6RB c6rb = new C6RB(context, MSX.A01(context));
                        c6rb.A0M(emoji);
                        c6rb.A0A(dimensionPixelSize);
                        drawable = c6rb;
                    }
                    drawable = null;
                } else {
                    String BEk = jmh.BEk();
                    if (BEk != null) {
                        drawable = AbstractC65877Tvg.A01(context, BSV.SIZE_12, BSU.OUTLINE, BEk);
                    }
                    drawable = null;
                }
                String BEj = jmh.BEj();
                if (BEj != null) {
                    drawable2 = AbstractC65877Tvg.A01(context, BSV.SIZE_12, BSU.FILLED, BEj);
                } else {
                    drawable2 = null;
                }
                if (drawable != null && drawable2 != null) {
                    Drawable drawable3 = drawable;
                    if (jwe.isSelected()) {
                        drawable3 = drawable2;
                    }
                    ColorStateList A02 = C02G.A02(context, R.color.igds_pill_label_color);
                    if (A02 != null) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        if (jwe.isSelected()) {
                            AbstractC166997dE.A1W(A1E, android.R.attr.state_selected);
                        }
                        if (jwe.isPressed()) {
                            AbstractC166997dE.A1W(A1E, android.R.attr.state_pressed);
                        }
                        AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, drawable3, A02.getColorForState(AbstractC001800i.A0x(A1E), A02.getDefaultColor()));
                        textView.setCompoundDrawablesWithIntrinsicBounds(drawable3, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
                    }
                }
            }
        }
    }

    public final JMH getInterest() {
        return this.A00;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.A01.isSelected();
    }

    public NFZ(Context context, JMH jmh, boolean z, boolean z2) {
        super(context);
        GradientDrawable gradientDrawable;
        ViewGroup viewGroup;
        TextView textView;
        this.A00 = jmh;
        this.A02 = z2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, C14640oc.A07() ? R.style.afi_interest_pill_prism : R.style.afi_interest_pill);
        String displayName = jmh.getDisplayName();
        if (displayName != null) {
            JWE jwe = new JWE(contextThemeWrapper);
            jwe.setLabel(displayName);
            jwe.setSelected(z);
            View childAt = jwe.getChildAt(0);
            if (childAt != null) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                AbstractC13880nE.A0k(childAt, 0, 0, 0, AbstractC166997dE.A04(contextThemeWrapper, R.dimen.abc_action_bar_elevation_material));
                AbstractC13880nE.A0V(childAt, dimensionPixelSize);
            }
            View childAt2 = jwe.getChildAt(0);
            if ((childAt2 instanceof IgFrameLayout) && (viewGroup = (ViewGroup) childAt2) != null) {
                View childAt3 = viewGroup.getChildAt(0);
                if ((childAt3 instanceof IgTextView) && (textView = (TextView) childAt3) != null) {
                    textView.setTextAppearance(R.style.afi_interest_pill_text);
                    textView.setGravity(16);
                }
            }
            if (!C14640oc.A07()) {
                View childAt4 = jwe.getChildAt(0);
                Drawable background = childAt4 != null ? childAt4.getBackground() : null;
                if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                    ColorStateList A02 = C02G.A02(contextThemeWrapper, R.color.igds_pill_border_color);
                    int dimensionPixelSize2 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top);
                    gradientDrawable.mutate();
                    gradientDrawable.setStroke(dimensionPixelSize2, A02);
                }
            }
            A00(contextThemeWrapper, jwe, this);
            this.A01 = jwe;
            addView(jwe);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
