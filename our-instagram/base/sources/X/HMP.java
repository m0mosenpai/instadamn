package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class HMP extends AbstractC38513GwY {
    public final TextView A00;
    public final JGK A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMP(View view, JGK jgk) {
        super(view);
        C14360o3.A0B(jgk, 2);
        this.A01 = jgk;
        this.A00 = AbstractC167007dF.A0N(view, R.id.search_row_typeahead_text);
    }
}
