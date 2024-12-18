package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;

/* loaded from: classes6.dex */
public final class E21 extends C3OO {
    public final TextView A00;
    public final HorizontalFlowLayout A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E21(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC167007dF.A0N(view, R.id.interest_title);
        this.A01 = (HorizontalFlowLayout) AbstractC166997dE.A0R(view, R.id.sub_interests_pill_container);
    }
}
