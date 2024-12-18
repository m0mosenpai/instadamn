package X;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class E29 extends C3OO {
    public final Button A00;
    public final TextView A01;

    public E29(View view) {
        super(view);
        this.A00 = (Button) view.requireViewById(R.id.button_item);
        this.A01 = AbstractC166997dE.A0T(view, R.id.row_simple_text_description);
    }
}
