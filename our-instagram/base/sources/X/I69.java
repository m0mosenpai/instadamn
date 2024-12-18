package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes7.dex */
public abstract class I69 {
    public static final void A00(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, IFE ife, String str, int i) {
        String A0D = AnonymousClass001.A0D(str, '@');
        TextView textView = ife.A00;
        textView.setText(A0D);
        C0fQ.A00(onClickListener, textView);
        Resources resources = textView.getResources();
        String A0r = AbstractC166997dE.A0r(resources, A0D, 2131954439);
        C14360o3.A07(A0r);
        textView.setContentDescription(A0r);
        TextView textView2 = ife.A01;
        String A0q = AbstractC166997dE.A0q(textView2.getResources(), i);
        textView2.setText(i);
        C0fQ.A00(onClickListener2, textView2);
        String A0r2 = AbstractC166997dE.A0r(resources, A0q, 2131954439);
        C14360o3.A07(A0r2);
        textView2.setContentDescription(A0r2);
    }
}
