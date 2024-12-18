package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes8.dex */
public final class L86 {
    public final InterfaceC74953Yl A00;
    public final InterfaceC74953Yl A01;
    public final UserSession A02;
    public final MediaFrameLayout A03;
    public final C5TA A04;
    public final String A05;
    public final C6C3 A06;
    public InterfaceC60022ok volumeKeyListener;

    public L86(Context context, InterfaceC74953Yl interfaceC74953Yl, UserSession userSession, InterfaceC60442pS interfaceC60442pS, MediaFrameLayout mediaFrameLayout, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        JQ0.A1O(mediaFrameLayout, context, userSession, interfaceC60442pS, interfaceC74953Yl);
        this.A03 = mediaFrameLayout;
        this.A02 = userSession;
        this.A00 = interfaceC74953Yl;
        this.A01 = AbstractC25230BEn.A0U(Float.valueOf(0.0f));
        String moduleName = interfaceC60442pS.getModuleName();
        this.A05 = moduleName;
        C46093Kar c46093Kar = new C46093Kar(this, interfaceC16820sZ, interfaceC16820sZ2);
        this.A06 = c46093Kar;
        C5TA c5ta = new C5TA(context, userSession, new C30O(userSession, interfaceC60442pS, null, false), c46093Kar, moduleName);
        c5ta.A01();
        this.A04 = c5ta;
    }

    public final void A00() {
        InterfaceC74953Yl interfaceC74953Yl = this.A00;
        AbstractC25227BEk.A1A(interfaceC74953Yl, !AbstractC25230BEn.A1X(interfaceC74953Yl));
        C5TA c5ta = this.A04;
        boolean A1X = AbstractC25230BEn.A1X(interfaceC74953Yl);
        float f = 1.0f;
        if (A1X) {
            f = 0.0f;
        }
        c5ta.A02(f, 0);
    }
}
