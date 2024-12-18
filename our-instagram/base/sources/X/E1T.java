package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class E1T extends C3OO {
    public final C73M A00;

    public E1T(View view, UserSession userSession) {
        super(view);
        ViewGroup viewGroup = (ViewGroup) view;
        View A02 = C73L.A02(viewGroup, userSession);
        viewGroup.addView(A02);
        this.A00 = (C73M) AbstractC31172DnG.A0x(A02);
    }
}
