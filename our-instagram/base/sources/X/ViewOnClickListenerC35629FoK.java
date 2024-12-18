package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.FoK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35629FoK implements View.OnClickListener {
    public final /* synthetic */ Reel A00;
    public final /* synthetic */ C32640EYo A01;
    public final /* synthetic */ C38E A02;
    public final /* synthetic */ GradientSpinnerAvatarView A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public ViewOnClickListenerC35629FoK(Reel reel, C32640EYo c32640EYo, C38E c38e, GradientSpinnerAvatarView gradientSpinnerAvatarView, String str, List list) {
        this.A02 = c38e;
        this.A04 = str;
        this.A01 = c32640EYo;
        this.A03 = gradientSpinnerAvatarView;
        this.A00 = reel;
        this.A05 = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1683878866);
        C38E c38e = this.A02;
        c38e.A0C = this.A04;
        C32640EYo c32640EYo = this.A01;
        FragmentActivity activity = c32640EYo.A01.getActivity();
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A03;
        C31559Dtj.A00(activity, gradientSpinnerAvatarView.getAvatarBounds(), c38e, c32640EYo, 9);
        Reel reel = this.A00;
        List list = this.A05;
        c38e.A0A(reel, C3G2.A23, gradientSpinnerAvatarView, list, list, list);
        C0f9.A0C(2119143467, A05);
    }
}
