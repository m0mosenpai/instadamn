package X;

import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes7.dex */
public abstract class IB9 {
    public static void A00(IJR ijr, String str, String str2, int i) {
        ImageView imageView = ijr.A01;
        imageView.getClass();
        imageView.setImageResource(i);
        TextView textView = ijr.A03;
        textView.getClass();
        textView.setText(str);
        TextView textView2 = ijr.A02;
        textView2.getClass();
        textView2.setText(str2);
    }
}
