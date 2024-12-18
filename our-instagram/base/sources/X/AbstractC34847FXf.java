package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.FXf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34847FXf {
    public static void A01(C34957Fah c34957Fah, GHX ghx, C31918E0y c31918E0y) {
        Integer num;
        View view = c31918E0y.itemView;
        View.OnClickListener onClickListener = ghx.A04;
        int i = 0;
        if (onClickListener != null) {
            C0fQ.A00(onClickListener, view);
            num = C05F.A01;
        } else {
            view.setClickable(false);
            num = C05F.A00;
        }
        AbstractC56952jT.A04(view, num);
        TextView textView = c31918E0y.A02;
        textView.setText(ghx.A07);
        Typeface typeface = ghx.A01;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = c31918E0y.A01;
        textView2.setText(ghx.A05);
        C18C.A0F(AbstractC167007dF.A1P(textView.getPaddingStart(), textView.getPaddingEnd()));
        Context context = view.getContext();
        textView.setCompoundDrawablePadding(AbstractC166987dD.A0C(context, 8));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(ghx.A02, (Drawable) null, (Drawable) null, (Drawable) null);
        if (ghx.A06) {
            i = 8;
        }
        textView2.setVisibility(i);
        int i2 = ghx.A00;
        if (i2 != -1) {
            textView2.setTextColor(i2);
        }
        C0fQ.A00(ghx.A03, textView2);
        view.setBackgroundResource(FC0.A00(context, c34957Fah));
        c31918E0y.A00.setVisibility(8);
        int i3 = 19;
        if (c34957Fah.A04) {
            i3 = 17;
        }
        textView.setGravity(i3);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, X.E0y] */
    public static C31918E0y A00(Context context, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_menu_item_with_action_text);
        ?? c3oo = new C3OO(A0A);
        c3oo.A02 = AbstractC166997dE.A0T(A0A, R.id.row_simple_text_textview);
        c3oo.A01 = AbstractC166997dE.A0T(A0A, R.id.row_action_button_text);
        c3oo.A00 = A0A.requireViewById(R.id.row_divider);
        return c3oo;
    }
}
