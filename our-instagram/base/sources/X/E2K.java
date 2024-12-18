package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class E2K extends C3OO {
    public FFR A00;
    public E8V A01;
    public final IgTextView A02;

    public E2K(View view) {
        super(view);
        IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.prompt_suggestion_text);
        this.A02 = A0Y;
        C14360o3.A05(A0Y);
        C3P9 c3p9 = new C3P9(A0Y);
        c3p9.A04 = new EZQ(this, 3);
        c3p9.A00();
    }
}
