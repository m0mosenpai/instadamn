package X;

import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Blw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26413Blw extends AbstractC51572Yf {
    public final C120985dq A00;
    public final UserSession A01;
    public final InterfaceC11380iw A02;
    public final boolean A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        ExtendedImageUrl A1q;
        C14360o3.A0B(c76223bS, 0);
        C38321qM c38321qM = this.A00.A02;
        if (c38321qM != null && (A1q = c38321qM.A1q(AbstractC77363dM.A00(c76223bS))) != null) {
            return new C25622BUk(ImageView.ScaleType.FIT_CENTER, null, this.A02, A1q, null, new BVN(this, 1), null, null, 3, this.A03, false);
        }
        return null;
    }

    public C26413Blw(C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        AbstractC167027dH.A13(userSession, c120985dq, interfaceC11380iw);
        this.A01 = userSession;
        this.A00 = c120985dq;
        this.A02 = interfaceC11380iw;
        this.A03 = z;
    }
}
