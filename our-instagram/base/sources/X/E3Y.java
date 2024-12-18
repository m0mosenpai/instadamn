package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class E3Y extends C3OO {
    public final IgSimpleImageView A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final InterfaceC56392iX A04;
    public final ViewGroup A05;

    public E3Y(View view) {
        super(view);
        this.A05 = AbstractC31176DnK.A0C(view, R.id.hall_pass_member_row_container);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.profile_picture);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.member_name);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.member_username);
        this.A00 = AbstractC31176DnK.A0T(view, R.id.more_button);
        this.A04 = AbstractC166997dE.A0X(view, R.id.follow_button_stub);
    }
}
