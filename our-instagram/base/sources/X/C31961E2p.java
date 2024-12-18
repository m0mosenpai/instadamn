package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E2p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31961E2p extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final C57012jc A02;
    public final GradientSpinnerAvatarView A03;

    public C31961E2p(View view) {
        super(view);
        ViewStub viewStub;
        this.A03 = AbstractC31176DnK.A0f(view, R.id.avatar_container);
        this.A01 = AbstractC31178DnM.A0C(view);
        this.A00 = AbstractC167007dF.A0N(view, R.id.subtitle);
        View findViewById = view.findViewById(R.id.unread_badge_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A02 = new C57012jc(viewStub);
    }
}
