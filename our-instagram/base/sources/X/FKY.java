package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes6.dex */
public final class FKY {
    public DirectShareTarget A00;
    public final C66362zD A01;
    public final C34499FIl A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.2zJ, java.lang.Object] */
    public FKY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, FG8 fg8) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        C34499FIl c34499FIl = new C34499FIl(fg8, this);
        this.A02 = c34499FIl;
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new Object());
        C66362zD A0R = AbstractC31173DnH.A0R(A00, new EXR(interfaceC11380iw, userSession, c34499FIl));
        A0R.setHasStableIds(A1V);
        this.A01 = A0R;
    }
}
