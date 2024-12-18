package X;

import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BO1 extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final UserSession A02;
    public final InterfaceC31054Dku A03;
    public final float A04;
    public final long A05;
    public final long A06;
    public final AbstractC25398BLp A07;
    public final BLA A08;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        float f = this.A04;
        C2XI A0j = AbstractC25228BEl.A0j(c76223bS, (f + 1.0f) * 1.0f);
        C2XI A0j2 = AbstractC25228BEl.A0j(c76223bS, 1.0f);
        long j = this.A05;
        long A01 = C2Z3.A01(1.0f / 2.0f, C2Z3.A01(f, j));
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A1F;
        C51722Yv A0A = AbstractC25234BEr.A0A(A0j, null, new C9CV(A0j, num));
        Integer num2 = C05F.A00;
        C51722Yv A0X = AbstractC25231BEo.A0X(A0j2, A0A, num2);
        long A012 = C2Z3.A01(1.0f - f, j);
        C51722Yv A00 = C9CU.A00(A0X, num2, 0, A012);
        Integer num3 = C05F.A01;
        C51722Yv A002 = C9CU.A00(A00, num3, 0, A012);
        long j2 = this.A06;
        C51722Yv A14 = AbstractC25232BEp.A14(A002, 0, A01);
        Integer num4 = C05F.A08;
        return new BNU(AbstractC77623dm.A0E(c76223bS, R.drawable.instagram_comment_outline_44), ImageView.ScaleType.FIT_CENTER, C9CV.A00(C9CV.A00(AbstractC25233BEq.A0U(AbstractC25234BEr.A0H(AbstractC25234BEr.A0E(C9CU.A00(A14, num4, 0, A01), AbstractC25227BEk.A0Z(0, A01), 0, j2), AbstractC25231BEo.A0b(c76223bS, 2131956426, 0), num2), AbstractC25225BEi.A0o(num, DRP.A00(this, 36), 4), num3, 0), num4, "comment_button", 4), C05F.A04, DRP.A00(this, 37), 4), false);
    }

    public BO1(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, AbstractC25398BLp abstractC25398BLp, InterfaceC31054Dku interfaceC31054Dku, BLA bla, float f, long j, long j2) {
        AbstractC167027dH.A13(bla, interfaceC31054Dku, c120985dq);
        C14360o3.A0B(c37644Ghd, 5);
        this.A08 = bla;
        this.A03 = interfaceC31054Dku;
        this.A00 = c120985dq;
        this.A02 = userSession;
        this.A01 = c37644Ghd;
        this.A05 = j;
        this.A06 = j2;
        this.A04 = f;
        this.A07 = abstractC25398BLp;
    }
}
