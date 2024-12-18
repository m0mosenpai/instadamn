package X;

import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.Size;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Bmy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26477Bmy extends AbstractC51572Yf {
    public final ScaleGestureDetectorOnScaleGestureListenerC65851TvC A00;
    public final C120985dq A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC30978DjZ A04;
    public final boolean A05;
    public final boolean A06;

    public C26477Bmy(C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC30978DjZ interfaceC30978DjZ, ScaleGestureDetectorOnScaleGestureListenerC65851TvC scaleGestureDetectorOnScaleGestureListenerC65851TvC, boolean z, boolean z2) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC65851TvC, 3);
        this.A03 = userSession;
        this.A01 = c120985dq;
        this.A00 = scaleGestureDetectorOnScaleGestureListenerC65851TvC;
        this.A04 = interfaceC30978DjZ;
        this.A05 = z;
        this.A02 = interfaceC11380iw;
        this.A06 = z2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C09530e4 c09530e4;
        String str;
        String str2;
        GradientDrawable gradientDrawable;
        ExtendedImageUrl A1q;
        InterfaceC102714k8 AhS;
        InterfaceC102714k8 C9R;
        float f;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A01;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            float A0m = c38321qM.A0m();
            InterfaceC30978DjZ interfaceC30978DjZ = this.A04;
            float f2 = 0.0f;
            Float valueOf = Float.valueOf(0.0f);
            if (interfaceC30978DjZ != null) {
                Size BK8 = interfaceC30978DjZ.BK8();
                float width = BK8.getWidth();
                float height = BK8.getHeight();
                float f3 = width / height;
                if (A0m > f3) {
                    f = AbstractC25227BEk.A00(height, width / A0m);
                } else {
                    if (A0m < f3) {
                        f2 = AbstractC25227BEk.A00(width, height * A0m);
                    }
                    f = 0.0f;
                }
                c09530e4 = AbstractC25233BEq.A0t(f2, f);
            } else {
                c09530e4 = new C09530e4(valueOf, valueOf);
            }
            float A09 = AbstractC166987dD.A09(c09530e4.A00);
            float A092 = AbstractC166987dD.A09(c09530e4.A01);
            if (c120985dq.CdW()) {
                C46j c46j = c120985dq.A06().A0H;
                if (c46j != null && (C9R = c46j.C9R()) != null) {
                    str = C9R.getBackgroundColor();
                } else {
                    str = null;
                }
                C46j c46j2 = c120985dq.A06().A0H;
                if (c46j2 != null && (AhS = c46j2.AhS()) != null) {
                    str2 = AhS.getBackgroundColor();
                } else {
                    str2 = null;
                }
                if (str != null && str2 != null) {
                    RectF rectF = AbstractC13880nE.A01;
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(str), Color.parseColor(str2)});
                } else {
                    gradientDrawable = null;
                }
                C75933ay c75933ay = C51722Yv.A02;
                EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
                Integer num = C05F.A0Y;
                C51722Yv A0d = AbstractC25230BEn.A0d(C9CV.A00(null, num, enumC77933eL, 3), C05F.A01, 100.0f, 0);
                Integer num2 = C05F.A00;
                C51722Yv A00 = C9CV.A00(AbstractC25230BEn.A0d(A0d, num2, 100.0f, 0), num2, gradientDrawable, 4);
                C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
                BN7 bn7 = BN7.A00;
                C51722Yv A002 = C9CV.A00(null, num, enumC77933eL, 3);
                UserSession userSession = this.A03;
                C51722Yv A003 = C9CV.A00(BV0.A00(AbstractC77363dM.A00(A12), bn7.A00(AbstractC77363dM.A00(A12), bn7.A01(AbstractC77363dM.A00(A12), A002, userSession, interfaceC30978DjZ), userSession), interfaceC30978DjZ, A0m, 0.0f, 0.0f, 0, this.A05, true, false, true), C05F.A04, new DHL(this, A09, A092), 4);
                C2Z0 A13 = AbstractC25232BEp.A13(A12);
                C38321qM c38321qM2 = c120985dq.A02;
                if (c38321qM2 != null && (A1q = c38321qM2.A1q(AbstractC77363dM.A00(A13))) != null) {
                    A13.A00(new C25622BUk(ImageView.ScaleType.FIT_CENTER, null, this.A02, A1q, null, null, null, null, 3, this.A06, false));
                }
                AbstractC25227BEk.A1H(A13, A12, A003);
                return AbstractC76963ci.A04(A12, c76223bS, A00);
            }
        }
        return null;
    }
}
