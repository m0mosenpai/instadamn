package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.JrC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44729JrC extends C3OO {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final InterfaceC56392iX A03;
    public final SpinnerImageView A04;

    public C44729JrC(View view) {
        super(view);
        this.A00 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.pack_item);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.title);
        this.A03 = AbstractC166997dE.A0X(view, R.id.bonus_free_stars_stub);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.price);
        this.A04 = (SpinnerImageView) AbstractC166997dE.A0R(view, R.id.loading);
    }
}
