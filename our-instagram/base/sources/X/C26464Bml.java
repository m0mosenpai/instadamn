package X;

import android.widget.ImageView;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Bml, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26464Bml extends AbstractC51572Yf {
    public final C120985dq A00;
    public final InterfaceC11380iw A01;
    public final ClipsViewerSource A02;
    public final C37644Ghd A03;
    public final UserSession A04;
    public final InterfaceC31137Dmc A05;

    public C26464Bml(ClipsViewerSource clipsViewerSource, C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc) {
        C14360o3.A0B(userSession, 2);
        AbstractC167017dG.A1T(interfaceC31137Dmc, interfaceC11380iw);
        this.A00 = c120985dq;
        this.A04 = userSession;
        this.A03 = c37644Ghd;
        this.A02 = clipsViewerSource;
        this.A05 = interfaceC31137Dmc;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C120985dq c120985dq;
        AbstractC50812Vc c26339Bkk;
        C14360o3.A0B(c76223bS, 0);
        C37644Ghd c37644Ghd = this.A03;
        C14360o3.A0B(c37644Ghd, 0);
        if (AbstractC25229BEm.A1a(c37644Ghd.A0D, EnumC75193Zm.A0F)) {
            c120985dq = this.A00;
            c26339Bkk = new C26380BlP(c120985dq, c37644Ghd, this.A05);
        } else {
            UserSession userSession = this.A04;
            c120985dq = this.A00;
            ClipsViewerSource clipsViewerSource = this.A02;
            boolean A1R = AbstractC167007dF.A1R(0, userSession, c120985dq);
            if (AbstractC37677GiE.A00(c120985dq, c37644Ghd, userSession) && clipsViewerSource != ClipsViewerSource.A05) {
                c26339Bkk = new C26379BlO(c120985dq, c37644Ghd, this.A05);
            } else {
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM == null || c38321qM.A5n() != A1R) {
                    return null;
                }
                InterfaceC11380iw interfaceC11380iw = this.A01;
                C38321qM c38321qM2 = c120985dq.A02;
                if (c38321qM2 != null) {
                    AbstractC41647Ibf.A02(c38321qM2, interfaceC11380iw, userSession, C05F.A0Y);
                    c26339Bkk = new C26339Bkk(c120985dq, this.A05);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
        Integer num2 = C05F.A01;
        C51722Yv A0d2 = AbstractC25230BEn.A0d(A0d, num2, 100.0f, 0);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C38321qM c38321qM3 = c120985dq.A02;
        if (c38321qM3 != null) {
            ExtendedImageUrl A1q = c38321qM3.A1q(AbstractC77363dM.A00(c76223bS));
            if (A1q == null) {
                A1q = c38321qM3.A1n();
            }
            C51722Yv A0N = AbstractC25234BEr.A0N(C9CV.A00(null, C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), num, num2, 100.0f, 0);
            if (A1q != null) {
                A12.A00(new C25622BUk(ImageView.ScaleType.CENTER_CROP, A0N, this.A01, A1q, null, null, AbstractC27808CNx.A00, c38321qM3.BU6(), 3, false, false));
                return AbstractC25226BEj.A0k(c26339Bkk, A12, c76223bS, A0d2);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
