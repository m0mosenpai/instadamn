package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.ObT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55110ObT {
    public static final void A02(IgFormField igFormField, MP8 mp8) {
        C14360o3.A0B(igFormField, 0);
        if (igFormField.A0J) {
            C0fQ.A00(new LQ1(67, igFormField, mp8), igFormField.getStateView());
        } else {
            igFormField.setEditTextOnTouchListener(new ViewOnTouchListenerC48075LQa(5, igFormField, mp8));
        }
    }

    public static final void A00(IgFormField igFormField) {
        C56302iJ c56302iJ;
        if (igFormField.A0J) {
            ViewGroup.LayoutParams layoutParams = igFormField.getMEditText().getLayoutParams();
            layoutParams.height = igFormField.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
            igFormField.getMEditText().setLayoutParams(layoutParams);
            igFormField.getMEditText().setInputType(igFormField.getMEditText().getInputType() | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            igFormField.getMEditText().setGravity(48);
            igFormField.getMEditText().setPadding(igFormField.getMEditText().getPaddingLeft(), igFormField.A01, igFormField.getMEditText().getPaddingRight(), igFormField.getMEditText().getPaddingBottom());
            ViewGroup.LayoutParams layoutParams2 = igFormField.getInlineLabel().getLayoutParams();
            if ((layoutParams2 instanceof C56302iJ) && (c56302iJ = (C56302iJ) layoutParams2) != null) {
                c56302iJ.A09 = 0.15f;
            }
        }
    }

    public static final void A01(IgFormField igFormField) {
        boolean z = igFormField.A0J;
        TextView topLabel = igFormField.getTopLabel();
        if (z) {
            topLabel.setTextColor(C02G.A02(igFormField.getContext(), R.color.prism_form_field_top_label_color));
        } else {
            AbstractC31177DnL.A0y(topLabel, igFormField.getContext());
        }
    }

    public static final void A03(IgFormField igFormField, boolean z, boolean z2) {
        Integer num;
        int i;
        Drawable drawable = null;
        if (igFormField.A0J) {
            if (z) {
                i = R.drawable.prism_form_field_error_background;
                if (z2) {
                    i = R.drawable.prism_form_field_picker_error_background;
                }
            } else {
                i = R.drawable.prism_form_field_background;
                if (z2) {
                    i = R.drawable.prism_form_field_picker_background;
                }
            }
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        View prismFormFieldContainer = igFormField.getPrismFormFieldContainer();
        if (num != null) {
            drawable = MSX.A07(igFormField.getContext(), num);
        }
        prismFormFieldContainer.setBackground(drawable);
    }
}
