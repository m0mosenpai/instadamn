package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* loaded from: classes4.dex */
public final class AAI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final TargetViewSizeProvider A02;
    public final InterfaceC09390do A05;
    public final InterfaceC16820sZ A07;
    public final InterfaceC09390do A03 = B8Q.A00(this, 19);
    public final InterfaceC09390do A06 = B8Q.A00(this, 22);
    public final InterfaceC09390do A04 = B8Q.A00(this, 20);

    public AAI(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = userSession;
        this.A02 = targetViewSizeProvider;
        this.A00 = interfaceC11380iw;
        this.A07 = interfaceC16820sZ;
        this.A05 = B8Q.A00(view, 21);
    }
}
