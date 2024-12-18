package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OBp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54640OBp {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final C55096Ob7 A03;

    public C54640OBp(View view, UserSession userSession) {
        this.A00 = view;
        this.A01 = AbstractC31173DnH.A0I(view, R.id.add_to_fb_dating_story_icon);
        this.A02 = AbstractC166997dE.A0T(view, R.id.add_to_fb_dating_story_label);
        MSY.A0y(view, R.id.one_tap_button_view_stub);
        this.A03 = new C55096Ob7(view, userSession, C05F.A01);
    }
}
