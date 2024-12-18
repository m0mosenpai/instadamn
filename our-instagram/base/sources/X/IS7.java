package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class IS7 {
    public static final void A01(C38457Gve c38457Gve, H7F h7f) {
        AbstractC167007dF.A1K(c38457Gve, h7f);
        c38457Gve.A02.setText(h7f.A06);
        c38457Gve.A01.setVisibility(8);
        String str = h7f.A04;
        TextView textView = c38457Gve.A00;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
            C0fQ.A00(h7f.A00, textView);
            String str2 = h7f.A03;
            if (str2 != null) {
                textView.setContentDescription(str2);
            }
        }
        Integer num = h7f.A01;
        if (num != null) {
            c38457Gve.itemView.setBackgroundResource(num.intValue());
        }
        Integer num2 = h7f.A02;
        if (num2 != null) {
            int dimensionPixelSize = c38457Gve.itemView.getResources().getDimensionPixelSize(num2.intValue());
            AbstractC13880nE.A0j(AbstractC31171DnF.A06(c38457Gve), dimensionPixelSize, dimensionPixelSize);
        }
    }

    public static final View A00(ViewGroup viewGroup) {
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.section_header_row, false);
        A0D.setTag(new C38457Gve(A0D));
        return A0D;
    }
}
