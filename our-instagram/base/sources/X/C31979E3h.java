package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

/* renamed from: X.E3h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31979E3h extends C3OO {
    public final View A00;
    public final IgSimpleImageView A01;
    public final List A02;
    public final View A03;
    public final ViewGroup A04;
    public final ViewGroup A05;
    public final ViewGroup A06;

    public C31979E3h(View view) {
        super(view);
        this.A03 = view;
        this.A01 = AbstractC31176DnK.A0T(view, R.id.follow_chaining_unit_dismiss_button);
        this.A00 = AbstractC166997dE.A0S(view, R.id.follow_chaining_unit_see_all_row);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.follow_chaining_unit_user_row_1);
        this.A04 = A0C;
        ViewGroup A0C2 = AbstractC31176DnK.A0C(view, R.id.follow_chaining_unit_user_row_2);
        this.A05 = A0C2;
        ViewGroup A0C3 = AbstractC31176DnK.A0C(view, R.id.follow_chaining_unit_user_row_3);
        this.A06 = A0C3;
        this.A02 = AbstractC16960so.A1Q(A0C, A0C2, A0C3);
    }
}
