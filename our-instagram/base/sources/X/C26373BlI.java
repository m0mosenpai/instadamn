package X;

import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BlI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26373BlI extends AbstractC51572Yf {
    public final C120985dq A00;
    public final InterfaceC11380iw A01;
    public final boolean A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C38321qM c38321qM = this.A00.A02;
        if (c38321qM != null) {
            C75933ay c75933ay = C51722Yv.A02;
            Integer num = C05F.A00;
            C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 100.0f, 0));
            Integer num2 = C05F.A01;
            C51722Yv A0d = AbstractC25230BEn.A0d(A0h, num2, 100.0f, 0);
            C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
            EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
            Integer num3 = C05F.A0Y;
            C51722Yv A0N = AbstractC25234BEr.A0N(C9CV.A00(null, num3, enumC77933eL, 3), num, num2, 100.0f, 0);
            ImageUrl A1S = c38321qM.A1S();
            if (A1S != null) {
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                A12.A00(new C25622BUk(scaleType, A0N, this.A01, A1S, null, null, null, null, 3, this.A02, false));
                return AbstractC25227BEk.A0V(new C26631BpS(AbstractC77623dm.A0E(A12, R.drawable.video_indeterminate_progress), scaleType, C9CV.A00(AbstractC25234BEr.A0N(null, num2, num, 100.0f, 0), num3, enumC77933eL, 3), A12.BoZ().A02(R.color.fds_transparent)), A12, c76223bS, A0d);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public C26373BlI(C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, boolean z) {
        AbstractC167017dG.A1P(interfaceC11380iw, c120985dq);
        this.A01 = interfaceC11380iw;
        this.A00 = c120985dq;
        this.A02 = z;
    }
}
