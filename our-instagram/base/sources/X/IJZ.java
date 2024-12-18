package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IJZ {
    public ColorDrawable A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC43586JPr A03;
    public final InterfaceC09390do A04;
    public final boolean A05;

    public IJZ(Context context, UserSession userSession, InterfaceC43586JPr interfaceC43586JPr, boolean z) {
        AbstractC25233BEq.A0w(1, context, userSession, interfaceC43586JPr);
        this.A01 = context;
        this.A05 = z;
        this.A02 = userSession;
        this.A03 = interfaceC43586JPr;
        this.A04 = AbstractC09440dt.A01(new J7S(this, 44));
    }
}
