package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BmM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26439BmM extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final InterfaceC30967DjO A02;
    public final InterfaceC30988Djn A03;
    public final UserSession A04;

    public C26439BmM(InterfaceC30988Djn interfaceC30988Djn, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC30967DjO interfaceC30967DjO) {
        AbstractC167007dF.A1G(interfaceC30967DjO, 3, userSession);
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = interfaceC30967DjO;
        this.A03 = interfaceC30988Djn;
        this.A04 = userSession;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int A0D;
        String str;
        String ctaSubtitle;
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
        C29902DGq A01 = C29902DGq.A01(this, 48);
        InterfaceC30988Djn interfaceC30988Djn = this.A03;
        JLT BZV = c38321qM.A0C.BZV();
        C51682Yq c51682Yq = null;
        if (BZV != null) {
            str = BZV.getCtaTitle();
        } else {
            str = null;
        }
        JLT BZV2 = c38321qM.A0C.BZV();
        if (BZV2 != null && (ctaSubtitle = BZV2.getCtaSubtitle()) != null) {
            C75933ay c75933ay = C51722Yv.A02;
            EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
            Integer num = C05F.A00;
            C51722Yv A15 = AbstractC25232BEp.A15(null, num, enumC77683ds);
            Integer num2 = C05F.A0C;
            C51722Yv A00 = C9CV.A00(AbstractC25230BEn.A0d(A15, num2, 0.0f, 1), C05F.A0N, ctaSubtitle, 0);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(' ');
            A1C.append(AbstractC77623dm.A0F(c76223bS, 2131961131));
            A1C.append(' ');
            String A0x = AbstractC166997dE.A0x(ctaSubtitle, A1C);
            C2XE ArD = c76223bS.ArD();
            int A03 = AbstractC25232BEp.A03(ArD.A0C, c76223bS, R.attr.igds_color_secondary_text_on_media);
            long A05 = AbstractC77623dm.A05(c76223bS);
            Typeface typeface = Typeface.DEFAULT;
            long A0D2 = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(ArD, null, A0x, 0);
            AbstractC25233BEq.A19(c76223bS, A0a, A03, A05);
            A0a.A0S(0);
            AbstractC25234BEr.A0n(typeface, c76223bS, A0a, A0D2);
            A0a.A0X(num2);
            AbstractC25234BEr.A1E(A0a, num, 0, true);
            AbstractC25234BEr.A17(A00, A0a, false);
            c51682Yq = A0a.A0A();
        }
        return AbstractC28341CeT.A00(c51682Yq, c76223bS, interfaceC30988Djn, c120985dq, c37644Ghd, this.A04, str, A01, 4.0f, A0D, false, false, false);
    }
}
