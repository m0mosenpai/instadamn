package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.BkJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26312BkJ extends AbstractC51572Yf {
    public final C51739MtM A00;
    public final C51722Yv A01;

    public C26312BkJ(C51739MtM c51739MtM, C51722Yv c51722Yv) {
        C14360o3.A0B(c51739MtM, 1);
        this.A00 = c51739MtM;
        this.A01 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C77123cy A00 = AbstractC77063cs.A00(c76223bS, DCT.A00);
        ImageUrl imageUrl = (ImageUrl) this.A00.A04;
        if (imageUrl == null) {
            return new C75723ad();
        }
        return AbstractC25234BEr.A0O(new BYO(imageUrl), c76223bS.A05, this.A01.A00(AbstractC77853eD.A00(A00, C51722Yv.A02, "potato_media_shape", new DRQ(this, 37))));
    }
}
