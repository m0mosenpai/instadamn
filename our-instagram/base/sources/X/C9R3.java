package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9R3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9R3 {
    public final UserSession A00;
    public final TargetViewSizeProvider A01;
    public final InterfaceC09390do A03;
    public final InterfaceC16820sZ A05;
    public final InterfaceC09390do A04 = B8Q.A01(this, 16);
    public final InterfaceC09390do A02 = B8Q.A01(this, 14);

    public C9R3(ViewGroup viewGroup, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = userSession;
        this.A01 = targetViewSizeProvider;
        this.A05 = interfaceC16820sZ;
        this.A03 = B8Q.A01(viewGroup, 15);
    }
}
