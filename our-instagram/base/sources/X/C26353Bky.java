package X;

import com.facebook.R;

/* renamed from: X.Bky, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26353Bky extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final C80333iN A01;
    public final String A02;

    public C26353Bky(C51722Yv c51722Yv, C80333iN c80333iN, String str) {
        C14360o3.A0B(c80333iN, 2);
        this.A02 = str;
        this.A01 = c80333iN;
        this.A00 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51722Yv c51722Yv = this.A00;
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        String str = this.A02;
        long A05 = AbstractC77623dm.A05(A0P);
        int A03 = AbstractC77623dm.A03(A0P, R.color.design_dark_default_color_on_background);
        C75933ay c75933ay = C51722Yv.A02;
        C80333iN c80333iN = this.A01;
        C51722Yv A00 = C9CV.A00(null, C05F.A00, new C77843eC(C28959CqA.A00, c80333iN), 2);
        long A07 = AbstractC77623dm.A07(A0P);
        C51722Yv A0R = AbstractC25233BEq.A0R(A00, AbstractC25227BEk.A0Y(0, A07), 0, AbstractC77623dm.A0D(A0P, R.dimen.accent_edge_thickness));
        Integer valueOf = Integer.valueOf(A03);
        C2Z3 A0p = AbstractC25225BEi.A0p(A05);
        Integer valueOf2 = Integer.valueOf(R.drawable.caption_background);
        return AbstractC25227BEk.A0W(new C78003eS(null, null, A0R, A0p, C78003eS.A0C, AbstractC166997dE.A0b(), str, null, valueOf, null, valueOf2, 17), A0P, c76223bS, c51722Yv);
    }
}
