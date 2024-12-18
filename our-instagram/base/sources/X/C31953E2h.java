package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.E2h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31953E2h extends C3OO {
    public C57012jc A00;
    public C57012jc A01;
    public FNF A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31953E2h(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = new FNF(view);
        C57012jc A0V = AbstractC31177DnL.A0V(view, R.id.selectable_user_row_checkbox_view_stub);
        this.A01 = A0V;
        A0V.A02 = G0U.A00;
        this.A00 = AbstractC31177DnL.A0V(view, R.id.selectable_user_row_action_button_view_stub);
    }
}
