package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public abstract class UJ4 extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;

    public UJ4(View view) {
        super(view);
        this.A00 = view;
        this.A02 = AbstractC167007dF.A0N(view, R.id.collection_name);
        View findViewById = view.findViewById(R.id.collection_description);
        if (findViewById != null) {
            this.A01 = (TextView) findViewById;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
