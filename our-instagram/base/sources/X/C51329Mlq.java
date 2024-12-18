package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mlq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51329Mlq extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgLinearLayout A03;
    public final IgImageView A04;

    public C51329Mlq(View view) {
        super(view);
        this.A00 = view;
        this.A03 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.icon_container);
        this.A04 = AbstractC167007dF.A0T(view, R.id.icon);
        this.A02 = AbstractC167007dF.A0N(view, R.id.title);
        this.A01 = AbstractC167007dF.A0N(view, R.id.subtitle);
    }
}
