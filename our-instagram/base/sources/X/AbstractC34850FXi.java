package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.FXi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34850FXi {
    public static void A01(C34969Fat c34969Fat, C34957Fah c34957Fah, E13 e13) {
        View view = e13.itemView;
        C0fQ.A00(c34969Fat.A05, view);
        AbstractC56952jT.A01(view);
        view.setClickable(true);
        CharSequence charSequence = c34969Fat.A06;
        if (charSequence != null) {
            view.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = c34969Fat.A07;
        TextView textView = e13.A00;
        if (charSequence2 != null) {
            textView.setText(charSequence2);
        } else {
            textView.setText(c34969Fat.A02);
        }
        int i = c34969Fat.A03;
        if (i != -1) {
            textView.setTextColor(i);
        }
        view.setBackgroundResource(FC0.A00(view.getContext(), c34957Fah));
        int i2 = 8388627;
        if (c34957Fah.A04) {
            i2 = 17;
        }
        textView.setGravity(i2);
        textView.setAlpha(c34969Fat.A00);
        e13.A02.setVisibility(8);
        if (c34969Fat.A04 != null) {
            ColorFilterAlphaImageView colorFilterAlphaImageView = e13.A01;
            colorFilterAlphaImageView.setVisibility(0);
            colorFilterAlphaImageView.setImageDrawable(c34969Fat.A04);
            int i3 = c34969Fat.A01;
            if (i3 != -1) {
                colorFilterAlphaImageView.setNormalColor(i3);
                return;
            }
            return;
        }
        e13.A01.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, java.lang.Object, X.E13] */
    public static E13 A00(Context context, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_menu_link_item);
        ?? c3oo = new C3OO(A0A);
        c3oo.A00 = AbstractC166997dE.A0T(A0A, R.id.row_simple_link_textview);
        c3oo.A02 = (ColorFilterAlphaImageView) A0A.requireViewById(R.id.row_simple_link_image_start);
        c3oo.A01 = (ColorFilterAlphaImageView) A0A.requireViewById(R.id.row_simple_link_image_end);
        A0A.setTag(c3oo);
        return c3oo;
    }
}
