package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.1yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43291yw implements InterfaceC13000lm {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;

    public C43291yw(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = AbstractC229319v.A00();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC43471zH interfaceC43471zH = InterfaceC43471zH.A01;
        C14360o3.A0B(interfaceC43471zH, 0);
        IgImageView.A0d = interfaceC43471zH;
        IgImageView.A0g = false;
    }
}
