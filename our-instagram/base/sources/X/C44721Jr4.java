package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Jr4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44721Jr4 extends C3OO {
    public final LinearLayout A00;
    public final TextView A01;
    public final C7RB A02;
    public final C7ZX A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44721Jr4(View view, C7RB c7rb, C7ZX c7zx) {
        super(view);
        AbstractC167017dG.A1Q(view, c7rb);
        this.A03 = c7zx;
        this.A02 = c7rb;
        this.A00 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.message_overflow_reactions_pill_container);
        this.A01 = AbstractC167007dF.A0N(view, R.id.overflow_text);
    }
}
