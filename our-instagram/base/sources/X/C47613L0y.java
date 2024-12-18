package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.L0y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47613L0y {
    public C66362zD A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2zJ, java.lang.Object] */
    public C47613L0y(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new KJS(this.A01, this.A02));
        this.A00 = AbstractC31173DnH.A0R(A00, new Object());
    }
}
