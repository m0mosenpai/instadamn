package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UIY extends C3OO {
    public final TextView A00;
    public final XA9 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIY(View view, XA9 xa9) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = (TextView) view.findViewById(R.id.interest_typeahead_name);
        this.A01 = xa9;
    }
}
