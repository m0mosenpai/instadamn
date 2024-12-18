package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.JqQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44681JqQ extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgdsListCell A02;

    public C44681JqQ(View view) {
        super(view);
        this.A00 = AbstractC167007dF.A0N(view, R.id.earnings_section_title);
        this.A01 = AbstractC167007dF.A0N(view, R.id.earnings_section_period);
        this.A02 = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.earnings_amount_text);
    }
}
