package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Ml3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51280Ml3 extends C3OO {
    public final ImageView A00;
    public final TextView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51280Ml3(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC167007dF.A0N(view, R.id.row_simple_text_title);
        this.A00 = AbstractC31176DnK.A0D(view, R.id.row_icon);
        int A01 = AbstractC31177DnL.A01(view, R.id.row_simple_text_description);
        AbstractC31172DnG.A1J(view, R.id.row_address_dot, A01);
        AbstractC31172DnG.A1J(view, R.id.row_simple_text_extra_info, A01);
    }
}
