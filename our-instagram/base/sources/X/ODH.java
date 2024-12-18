package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* loaded from: classes9.dex */
public final class ODH {
    public Context A00;
    public TextView A01;
    public TextView A02;
    public GradientSpinnerAvatarView[] A03;
    public final InterfaceC56392iX A04;

    public ODH(Context context, ViewStub viewStub) {
        C14360o3.A0B(context, 2);
        this.A00 = context;
        this.A03 = new GradientSpinnerAvatarView[9];
        InterfaceC56392iX A00 = AbstractC56372iV.A00(viewStub);
        this.A04 = A00;
        A00.EZv(new C56189Oww(this, 2));
    }
}
