package X;

import android.content.Context;
import android.graphics.Color;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bmh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26460Bmh extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final InterfaceC30966DjN A02;
    public final InterfaceC30988Djn A03;
    public final UserSession A04;
    public final boolean A05;

    public C26460Bmh(InterfaceC30988Djn interfaceC30988Djn, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC30966DjN interfaceC30966DjN) {
        AbstractC167007dF.A1F(c37644Ghd, 2, interfaceC30966DjN);
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A03 = interfaceC30988Djn;
        this.A02 = interfaceC30966DjN;
        this.A04 = userSession;
        this.A05 = true;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int A0D;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A00;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM == null) {
            return new C2WH(null, null, null, null, null, null, false);
        }
        Context A0A = AbstractC25227BEk.A0A(c76223bS);
        String dominantColor = c38321qM.A0C.getDominantColor();
        if (dominantColor != null) {
            A0D = Color.parseColor(dominantColor);
        } else {
            A0D = AbstractC53242c7.A0D(A0A);
        }
        C37644Ghd c37644Ghd = this.A01;
        C29902DGq A01 = C29902DGq.A01(this, 43);
        return AbstractC28341CeT.A00(null, c76223bS, this.A03, c120985dq, c37644Ghd, this.A04, AbstractC77623dm.A0F(c76223bS, 2131969672), A01, 4.0f, A0D, false, false, this.A05);
    }
}
