package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class E3U extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;

    public E3U(View view) {
        super(view);
        View A0S = AbstractC166997dE.A0S(view, R.id.popular_pill);
        this.A02 = A0S;
        this.A05 = AbstractC25231BEo.A0d(A0S, R.id.pill_text);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.for_you_pill);
        this.A00 = A0S2;
        this.A03 = AbstractC25231BEo.A0d(A0S2, R.id.pill_text);
        View A0S3 = AbstractC166997dE.A0S(view, R.id.most_active_pill);
        this.A01 = A0S3;
        this.A04 = AbstractC25231BEo.A0d(A0S3, R.id.pill_text);
    }
}
