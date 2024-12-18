package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;

/* renamed from: X.JrG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44733JrG extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final C7RB A03;
    public final C7ZX A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44733JrG(View view, C7RB c7rb, C7ZX c7zx) {
        super(view);
        AbstractC167017dG.A1Q(view, c7rb);
        this.A00 = view;
        this.A04 = c7zx;
        this.A03 = c7rb;
        this.A02 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.message_add_custom_reactions_pill_container);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.add_reaction);
    }
}
