package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.JrD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44730JrD extends C3OO {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final InterfaceC56392iX A03;
    public final GradientSpinnerAvatarView A04;

    public C44730JrD(View view) {
        super(view);
        this.A04 = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(view, R.id.avatar);
        this.A00 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.balance_area);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.balance);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.title);
        this.A03 = AbstractC166997dE.A0X(view, R.id.banner_stub);
    }
}
