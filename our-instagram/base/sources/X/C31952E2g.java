package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.E2g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31952E2g extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31952E2g(Context context, View view, UserSession userSession) {
        super(view);
        C14360o3.A0B(view, 1);
        CircularImageView A0T = AbstractC31173DnH.A0T(view, R.id.avatar_pic);
        this.A02 = A0T;
        this.A01 = AbstractC31172DnG.A0X(view, R.id.visibility_header);
        this.A00 = AbstractC31172DnG.A0X(view, R.id.visibility_body);
        if (userSession != null && C18U.A06(C06090Tz.A05, userSession, 36322409573263579L)) {
            if (context != null) {
                AbstractC166997dE.A19(context, A0T, R.drawable.instagram_avatars_pano_outline_24);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
