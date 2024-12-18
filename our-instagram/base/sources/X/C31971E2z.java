package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.E2z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31971E2z extends C3OO {
    public final IgSimpleImageView A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C31971E2z(View view) {
        super(view);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.campfire_member_profile_picture);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.campfire_member_name);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.campfire_member_username);
        this.A00 = AbstractC31176DnK.A0T(view, R.id.campfire_member_more_button);
    }
}
