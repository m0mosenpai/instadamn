package X;

import android.view.View;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gw2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38481Gw2 extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final List A03;
    public final List A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38481Gw2(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = view;
        View A0S = AbstractC166997dE.A0S(view, R.id.left_product);
        this.A00 = A0S;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A03 = A1E;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        this.A04 = A1E2;
        A1E.add(AbstractC166997dE.A0S(A0S, R.id.product_name_placeholder));
        A1E.add(AbstractC166997dE.A0S(A0S, R.id.product_subtitle_placeholder));
        A1E.add(AbstractC166997dE.A0S(A0S, R.id.product_price_placeholder));
        View requireViewById = view.requireViewById(R.id.right_product);
        this.A01 = requireViewById;
        A1E2.add(AbstractC166997dE.A0S(requireViewById, R.id.product_name_placeholder));
        A1E2.add(AbstractC166997dE.A0S(requireViewById, R.id.product_subtitle_placeholder));
        A1E2.add(AbstractC166997dE.A0S(requireViewById, R.id.product_price_placeholder));
    }
}
