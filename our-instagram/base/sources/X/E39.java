package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class E39 extends C3OO {
    public final Button A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;

    public E39(View view) {
        super(view);
        this.A03 = AbstractC166997dE.A0T(view, R.id.search_error_title_textview);
        this.A02 = AbstractC166997dE.A0T(view, R.id.search_error_sub_textview);
        this.A01 = AbstractC31173DnH.A0I(view, R.id.search_error_imageview);
        this.A00 = (Button) view.requireViewById(R.id.search_error_tryagain_button);
    }
}
