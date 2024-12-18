package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class CQR {
    public final C66362zD A00;
    public final List A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.2zJ, java.lang.Object] */
    public CQR(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC30941Div interfaceC30941Div) {
        AbstractC167007dF.A1F(interfaceC30941Div, 3, userSession);
        this.A01 = AbstractC166987dD.A1E();
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new C27060Bwj(interfaceC11380iw, userSession, interfaceC30941Div));
        A00.A01(new Object());
        this.A00 = A00.A00();
    }
}
