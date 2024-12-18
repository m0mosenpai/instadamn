package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public abstract class FB3 {
    public static final void A00(FOR r4) {
        IgImageView igImageView = r4.A08;
        igImageView.setAlpha(1.0f);
        TextView textView = r4.A03;
        textView.setAlpha(1.0f);
        IgImageView igImageView2 = r4.A09;
        igImageView2.setAlpha(1.0f);
        View.OnClickListener onClickListener = r4.A00;
        if (onClickListener != null) {
            C0fQ.A00(onClickListener, igImageView2);
            C0fQ.A00(r4.A00, igImageView);
            C0fQ.A00(r4.A00, textView);
        }
    }
}
