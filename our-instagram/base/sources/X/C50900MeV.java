package X;

import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.MeV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50900MeV extends AbstractC52922bZ {
    public final C62592SHv A00;
    public final C0UO A01;
    public final C0UO A02;
    public final KZ6 A03;

    public C50900MeV(KZ6 kz6, C62592SHv c62592SHv, String str) {
        C14360o3.A0B(str, 2);
        this.A03 = kz6;
        this.A00 = c62592SHv;
        C16360rh c16360rh = new C16360rh(new C57179Pa8(null), new C16400rl(new GSR(null), new C31199Dni(4, new AnonymousClass058(new MC9(kz6, str, (InterfaceC23621Ds) null, 39)), this)));
        AnonymousClass059 A01 = AbstractC208910l.A01(new C51761Mtk(3, (Integer) null), AbstractC141776au.A00(this), c16360rh, C10I.A01);
        this.A02 = A01;
        M9S m9s = new M9S(A01, 4);
        this.A01 = AbstractC208910l.A01(AbstractC166997dE.A0a(), AbstractC141776au.A00(this), m9s, new C15020pI(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT));
    }
}
