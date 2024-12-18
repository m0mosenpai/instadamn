package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AA4 {
    public final Context A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final A7J A04;
    public final ViewStub A05;
    public final UserSession A06;

    public AA4(Context context, ViewStub viewStub, UserSession userSession) {
        C14360o3.A0B(viewStub, 2);
        this.A00 = context;
        this.A05 = viewStub;
        this.A06 = userSession;
        View inflate = viewStub.inflate();
        C14360o3.A07(inflate);
        this.A01 = inflate;
        this.A03 = AbstractC167007dF.A0N(inflate, R.id.feature_limited_composer_header_title);
        this.A02 = AbstractC167007dF.A0N(inflate, R.id.feature_limited_composer_header_subtitle);
        this.A04 = new A7J(userSession);
    }
}
