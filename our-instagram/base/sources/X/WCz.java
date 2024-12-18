package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes11.dex */
public final class WCz {
    public static final WCz A00 = new Object();

    public static final void A00(Context context, AnimatedHintsTextLayout animatedHintsTextLayout) {
        C14360o3.A0B(context, 0);
        int A0E = AbstractC167017dG.A0E(context);
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(animatedHintsTextLayout);
        A0G.leftMargin = A0E;
        A0G.rightMargin = A0E;
        animatedHintsTextLayout.setLayoutParams(A0G);
        TextView A0N = AbstractC167007dF.A0N(animatedHintsTextLayout, R.id.action_bar_search_edit_text);
        ColorFilter A002 = C3DY.A00(context.getColor(AbstractC53242c7.A08(context)));
        Drawable drawable = A0N.getCompoundDrawablesRelative()[0];
        if (drawable != null) {
            drawable.mutate();
            drawable.setAlpha(51);
            drawable.setColorFilter(A002);
        }
    }

    public final void A01(AnimatedHintsTextLayout animatedHintsTextLayout, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Context context = animatedHintsTextLayout.getContext();
        C14360o3.A0A(context);
        A00(context, animatedHintsTextLayout);
        EditText editText = animatedHintsTextLayout.getEditText();
        C14360o3.A0C(editText, "null cannot be cast to non-null type com.instagram.ui.widget.searchedittext.SearchEditText");
        SearchEditText searchEditText = (SearchEditText) editText;
        if (z3) {
            searchEditText.A07(i, i2, z2, j);
        } else {
            searchEditText.A08(z2);
        }
        searchEditText.A09(z5);
        if (z4) {
            searchEditText.setMultiLineSearchBarEnabled(true);
            ViewGroup.LayoutParams layoutParams = animatedHintsTextLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                animatedHintsTextLayout.setLayoutParams(layoutParams);
                int dimensionPixelSize = searchEditText.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
                AbstractC13880nE.A0j(searchEditText, dimensionPixelSize, dimensionPixelSize);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        if (z) {
            if (!z4) {
                AbstractC13880nE.A0W(animatedHintsTextLayout, AbstractC53242c7.A0G(context, R.attr.inlineMetaAISearchBarHeight));
            }
            AbstractC31173DnH.A0z(context, animatedHintsTextLayout, R.drawable.elevated_rounded_meta_ai_searchbar_background);
            if (z6) {
                searchEditText.setHintTextColor(context.getColor(R.color.ig_search_meta_ai_searchbar_hint_color));
            }
            ViewGroup.LayoutParams layoutParams2 = searchEditText.getLayoutParams();
            if (layoutParams2 != null) {
                searchEditText.getLayoutParams().height = -1;
                searchEditText.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException(MSV.A00(524));
        }
    }
}
