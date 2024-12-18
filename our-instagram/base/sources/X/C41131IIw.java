package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.IIw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41131IIw {
    public final InterfaceC74623Ww A00;
    public final C5TA A01;
    public final Context A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.6C3] */
    public C41131IIw(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A00 = new MediaFrameLayout(context, null, 0);
        C5TA c5ta = new C5TA(context, userSession, new C30O(userSession, interfaceC60442pS, null, false), new Object(), "genericsurvey");
        this.A01 = c5ta;
        c5ta.A01();
    }
}
