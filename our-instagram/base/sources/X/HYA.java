package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes7.dex */
public final class HYA extends AbstractC138926Qy {
    public CharSequence A00;
    public final int A01;
    public final int A02;
    public final UserSession A03;
    public final IgTextView A04;
    public final C57482kN A05;
    public final C138886Qu A06;
    public final C138866Qr A07;
    public final C138896Qv A08;
    public final InterfaceC56392iX A09;
    public final C41181vS A0A;
    public final C6QX A0B;
    public final C138876Qt A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HYA(UserSession userSession, InterfaceC56392iX interfaceC56392iX, C41181vS c41181vS, C138886Qu c138886Qu, C138876Qt c138876Qt, C138866Qr c138866Qr, C138896Qv c138896Qv) {
        super(c138866Qr, EnumC138936Qz.A03);
        int A00;
        int A06 = AbstractC167007dF.A06(1, interfaceC56392iX, c138866Qr);
        this.A09 = interfaceC56392iX;
        this.A07 = c138866Qr;
        this.A0C = c138876Qt;
        this.A0A = c41181vS;
        this.A03 = userSession;
        this.A06 = c138886Qu;
        this.A08 = c138896Qv;
        IgTextView igTextView = (IgTextView) interfaceC56392iX.getView();
        this.A04 = igTextView;
        C6QX A0H = c41181vS.A0H();
        if (A0H != null) {
            this.A0B = A0H;
            String str = A0H.A06;
            if (str != null) {
                this.A00 = str;
                C1P8.A02(userSession);
                int A0C = AbstractC13950nL.A0C(A0H.A07, -16777216);
                this.A02 = A0C;
                if (C1P8.A02(userSession)) {
                    A00 = AbstractC41735Ie7.A00(A0H);
                } else {
                    A00 = C6RX.A00(A0H);
                }
                this.A01 = A00;
                C14360o3.A0B(igTextView, 0);
                igTextView.setMovementMethod(C6R6.A00);
                igTextView.setClickable(false);
                igTextView.setLongClickable(false);
                igTextView.setMaxLines(A06);
                igTextView.setTextAlignment(c138876Qt.A03);
                C6RY.A07(igTextView, c138876Qt.A01);
                C6RY.A06(igTextView, 26.0f);
                igTextView.setTextColor(A0C);
                C57482kN A05 = C6RY.A05(AbstractC130925vf.A05(c41181vS), igTextView, C6RY.A00(igTextView, A06()));
                this.A05 = A05;
                super.A01 = C6RY.A02(A05, this.A00, igTextView.getMaxLines());
                return;
            }
            throw AbstractC31175DnJ.A0V("StoryAdHeadline text should not be null for ad ", c41181vS.A0V(userSession));
        }
        throw AbstractC31175DnJ.A0V("StoryAdHeadline model should not be null for ad ", c41181vS.A0V(userSession));
    }

    @Override // X.AbstractC138926Qy
    public final void A07(C6R2 c6r2) {
        SpannableStringBuilder A01;
        boolean z = c6r2.A04;
        InterfaceC56392iX interfaceC56392iX = this.A09;
        if (z) {
            interfaceC56392iX.setVisibility(8);
            return;
        }
        interfaceC56392iX.setVisibility(0);
        IgTextView igTextView = this.A04;
        igTextView.setTranslationY(c6r2.A03);
        C57482kN c57482kN = this.A05;
        if (c57482kN.A00(this.A00).getLineCount() > igTextView.getMaxLines()) {
            this.A00 = C6RY.A04(new SpannableString(this.A07.A0L), c57482kN, this.A00, igTextView.getMaxLines());
        }
        UserSession userSession = this.A03;
        boolean A02 = C1P8.A02(userSession);
        CharSequence charSequence = this.A00;
        int i = this.A02;
        C138886Qu c138886Qu = this.A06;
        if (A02) {
            A01 = AbstractC41735Ie7.A01(userSession, c138886Qu, charSequence, i);
        } else {
            A01 = C6RX.A01(userSession, c138886Qu, charSequence, i);
            C14360o3.A07(A01);
        }
        this.A00 = A01;
        C6RY.A08(igTextView, c57482kN, A01, this.A01);
        this.A08.A01(AbstractC111324zv.A00(4565), this.A00.toString());
    }
}
