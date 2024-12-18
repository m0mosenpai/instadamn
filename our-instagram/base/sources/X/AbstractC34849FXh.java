package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.FXh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34849FXh {
    public static void A01(C34965Fap c34965Fap, C31906E0m c31906E0m) {
        TextView textView = c31906E0m.A00;
        CharSequence charSequence = c34965Fap.A07;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(c34965Fap.A06);
        }
        int i = c34965Fap.A03;
        if (i != 0) {
            textView.setTextAppearance(textView.getContext(), i);
        }
        textView.setGravity(c34965Fap.A01);
        C34626FNj c34626FNj = c34965Fap.A05;
        if (c34626FNj != null) {
            textView.setPadding(c34626FNj.A02, c34626FNj.A05, c34626FNj.A03, c34626FNj.A00);
            AbstractC13880nE.A0a(textView, c34965Fap.A05.A04);
            AbstractC13880nE.A0c(textView, c34965Fap.A05.A01);
        }
        textView.setLineSpacing(0.0f, c34965Fap.A00);
        textView.setBackground(c34965Fap.A04);
        textView.setTextAlignment(c34965Fap.A02);
        textView.setClickable(false);
        textView.setLongClickable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, X.E0m, java.lang.Object] */
    public static C31906E0m A00(Context context, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_custom_text);
        ?? c3oo = new C3OO(A0A);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.row_custom_text_textview);
        c3oo.A00 = A0T;
        AbstractC25227BEk.A11(A0T);
        AbstractC010103p.A07(c3oo.A00);
        A0A.setTag(c3oo);
        return c3oo;
    }
}
