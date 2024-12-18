package X;

import com.facebook.ffmpeg.FFMpegBadDataException;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class OKf {
    public final UserSession A00;
    public final C53514Nlg A01;
    public final C7FH A02;

    public final AbstractC53477Nl4 A00(Medium medium, InterfaceC58204PrA interfaceC58204PrA, String str) {
        Object nrx;
        String str2;
        C14360o3.A0B(medium, 1);
        UserSession userSession = this.A00;
        C27971Xb c27971Xb = C27971Xb.A00;
        C14360o3.A0A(c27971Xb);
        C53514Nlg c53514Nlg = this.A01;
        ShareType shareType = ShareType.A0J;
        C7FH c7fh = this.A02;
        AbstractC167017dG.A1R(c27971Xb, c53514Nlg);
        C14360o3.A0B(c7fh, 7);
        C44059Jdk A0W = MSY.A0W(medium, 0);
        if (!AbstractC23048AEe.A00(A0W, c7fh, 0L, 900500L, true)) {
            long j = A0W.A03;
            if (j == -1) {
                str2 = "Illegal argument";
            } else if (j == -2) {
                str2 = "Runtime exception";
            } else if (j == -3) {
                str2 = AnonymousClass001.A0R("Unsupported video file mime type: ", A0W.A06);
            } else if (0 <= j && j <= Long.MAX_VALUE) {
                str2 = AnonymousClass001.A0Q("Duration is ", j);
            } else {
                str2 = "Unknown Error";
            }
            nrx = new NRW(str2);
        } else {
            try {
                medium.A07 = MY3.A01(AbstractC166987dD.A11(MSY.A0W(medium, 0).A07));
            } catch (FFMpegBadDataException | IOException | RuntimeException unused) {
            }
            float f = 0.5625f;
            if (AbstractC54109Nw7.A00(medium)) {
                f = 1.7778f;
            }
            C47Z A00 = AbstractC44068Jdt.A00(str, 0);
            AbstractC44068Jdt.A03(userSession, A00, A0W, f, A0W.A03);
            A00.A3J = medium.A0O;
            A00.A1k = shareType;
            A00.A5x = AbstractC54109Nw7.A00(medium);
            nrx = new NRX(A00);
        }
        if (nrx instanceof NRX) {
            return new NNE(medium, interfaceC58204PrA, ((NRX) nrx).A00, false);
        }
        if (nrx instanceof NRW) {
            return new NNC(((NRW) nrx).A00);
        }
        throw B4Z.A00();
    }

    public final AbstractC53477Nl4 A01(Medium medium, InterfaceC58204PrA interfaceC58204PrA, boolean z) {
        float A00;
        Object obj;
        String str;
        UserSession userSession = this.A00;
        C27971Xb c27971Xb = C27971Xb.A00;
        C14360o3.A0A(c27971Xb);
        C53514Nlg c53514Nlg = this.A01;
        ShareType shareType = ShareType.A0J;
        C7FH c7fh = this.A02;
        boolean A1U = AbstractC167007dF.A1U(c27971Xb);
        AbstractC167007dF.A1H(c53514Nlg, 3, c7fh);
        C44059Jdk A0W = MSY.A0W(medium, A1U ? 1 : 0);
        if (!AbstractC23048AEe.A00(A0W, c7fh, 0L, 900500L, true)) {
            long j = A0W.A03;
            if (j == -1) {
                str = "Illegal argument";
            } else if (j == -2) {
                str = "Runtime exception";
            } else if (j == -3) {
                str = AnonymousClass001.A0R("Unsupported video file mime type: ", A0W.A06);
            } else if (0 <= j && j <= Long.MAX_VALUE) {
                str = AnonymousClass001.A0Q("Duration is ", j);
            } else {
                str = "Unknown Error";
            }
            obj = new NRW(str);
        } else {
            try {
                medium.A07 = MY3.A01(AbstractC166987dD.A11(MSY.A0W(medium, A1U ? 1 : 0).A07));
            } catch (FFMpegBadDataException | IOException | RuntimeException unused) {
            }
            if (z) {
                A00 = 1.0f;
            } else {
                int i = medium.A07;
                if (i != 3 && i != 1) {
                    A00 = medium.A00();
                } else {
                    A00 = 1.0f / medium.A00();
                }
            }
            C17s.A02(A00, 0.5625f, 1.91f);
            C47Z A002 = AbstractC44068Jdt.A00(null, A1U ? 1 : 0);
            AbstractC44068Jdt.A03(userSession, A002, A0W, A00, A0W.A03);
            A002.A3J = medium.A0O;
            A002.A1k = shareType;
            A002.A5x = AbstractC54109Nw7.A00(medium);
            obj = new NRX(A002);
        }
        if (obj instanceof NRX) {
            return new NNE(medium, interfaceC58204PrA, ((NRX) obj).A00, A1U);
        }
        if (obj instanceof NRW) {
            return new NNC(((NRW) obj).A00);
        }
        throw B4Z.A00();
    }

    public OKf(UserSession userSession, C53514Nlg c53514Nlg, C7FH c7fh) {
        this.A00 = userSession;
        this.A01 = c53514Nlg;
        this.A02 = c7fh;
    }
}
