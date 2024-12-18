package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.FXg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34848FXg {
    public static void A01(C35200Ffs c35200Ffs, E1B e1b) {
        TextView textView;
        C33182EkT c33182EkT;
        C5SU c5su;
        View view = e1b.itemView;
        int i = c35200Ffs.A06;
        if (i != 0) {
            e1b.A04.setText(i);
            AbstractC166997dE.A18(view.getContext(), view, i);
        }
        CharSequence charSequence = c35200Ffs.A09;
        if (charSequence != null) {
            e1b.A04.setText(charSequence);
            view.setContentDescription(charSequence);
        }
        int i2 = c35200Ffs.A04;
        if (i2 != 0) {
            textView = e1b.A02;
            textView.setText(i2);
        } else {
            CharSequence charSequence2 = c35200Ffs.A08;
            textView = e1b.A02;
            if (charSequence2 != null) {
                textView.setText(charSequence2);
            } else {
                textView.setVisibility(8);
            }
        }
        e1b.A01.setVisibility(AbstractC167007dF.A05(c35200Ffs.A0B ? 1 : 0));
        String str = c35200Ffs.A0E;
        TextView textView2 = e1b.A03;
        if (str != null) {
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            textView2.setVisibility(8);
        }
        C0fQ.A00(c35200Ffs.A0D, view);
        e1b.A00.setAlpha(1.0f);
        AbstractC56952jT.A01(view);
        TextView textView3 = e1b.A04;
        textView3.setEnabled(true);
        textView2.setEnabled(true);
        int i3 = c35200Ffs.A01;
        if (i3 != 0) {
            view.setBackgroundColor(i3);
        }
        if (c35200Ffs.A07 != 0 || c35200Ffs.A02 != 0) {
            view.setPadding(view.getPaddingLeft(), c35200Ffs.A07, view.getPaddingRight(), c35200Ffs.A02);
        }
        int i4 = c35200Ffs.A03;
        if (i4 > 0) {
            textView.setMaxLines(i4);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        if ((c35200Ffs instanceof C33182EkT) && (c5su = (c33182EkT = (C33182EkT) c35200Ffs).A02) != null) {
            c5su.A03(textView3);
            textView3.postDelayed(new RunnableC36867GMo(c33182EkT), c33182EkT.A00);
        }
        if (c35200Ffs.A0C) {
            AbstractC31173DnH.A0I(view, R.id.row_menu_item_arrow).setImageResource(R.drawable.instagram_more_vertical_pano_outline_24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, java.lang.Object, X.E1B] */
    public static E1B A00(Context context, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_arrow_item);
        ?? c3oo = new C3OO(A0A);
        c3oo.A00 = A0A;
        c3oo.A04 = AbstractC166997dE.A0T(A0A, R.id.row_simple_text_title);
        c3oo.A02 = AbstractC166997dE.A0T(A0A, R.id.row_simple_text_description);
        c3oo.A01 = AbstractC31173DnH.A0I(A0A, R.id.row_address_dot);
        c3oo.A03 = AbstractC166997dE.A0T(A0A, R.id.row_simple_text_extra_info);
        A0A.setTag(c3oo);
        return c3oo;
    }
}
