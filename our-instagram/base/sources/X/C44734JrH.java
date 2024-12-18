package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.JrH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44734JrH extends C3OO {
    public final View A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final C7RB A03;
    public final C7ZX A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44734JrH(View view, C7RB c7rb, C7ZX c7zx) {
        super(view);
        AbstractC167017dG.A1Q(view, c7rb);
        this.A00 = view;
        this.A04 = c7zx;
        this.A03 = c7rb;
        this.A01 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.message_overflow_reactions_pill_container);
        this.A02 = AbstractC167007dF.A0N(view, R.id.overflow_text);
    }
}
