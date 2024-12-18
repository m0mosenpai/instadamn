package X;

import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.Bm0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26417Bm0 extends AbstractC51572Yf {
    public final C38321qM A00;
    public final C75113Zb A01;
    public final InterfaceC31021DkK A02;
    public final long A03;

    public C26417Bm0(C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC31021DkK interfaceC31021DkK, long j) {
        C14360o3.A0B(interfaceC31021DkK, 4);
        this.A03 = j;
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
        this.A02 = interfaceC31021DkK;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        long A0J = AbstractC25230BEn.A0J();
        Integer num = C05F.A00;
        C51722Yv A00 = C9CU.A00(null, num, A1Z ? 1 : 0, A0J);
        Integer num2 = C05F.A01;
        C51722Yv A0e = AbstractC25230BEn.A0e(C9CV.A00(AbstractC25233BEq.A0d(AbstractC25234BEr.A0H(C9CU.A00(C9CU.A00(A00, num2, A1Z ? 1 : 0, A0J), C05F.A0A, A1Z ? 1 : 0, this.A03), AbstractC25231BEo.A0b(c76223bS, 2131976920, A1Z ? 1 : 0), num), DRX.A00(this, 2)), num2, "android.widget.Button", A1Z ? 1 : 0), C05F.A0u, new CV2(A1Z ? 1 : 0), null);
        return new C78133ef(AbstractC77623dm.A0E(c76223bS, R.drawable.instagram_visual_search_pano_outline_24), ImageView.ScaleType.FIT_CENTER, null, A0e, AbstractC25232BEp.A02(c76223bS.A05.A0C, c76223bS), A1Z ? 1 : 0);
    }
}
