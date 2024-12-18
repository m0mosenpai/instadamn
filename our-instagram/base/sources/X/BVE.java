package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class BVE extends AbstractC51572Yf {
    public final float A00;
    public final float A01;
    public final C51722Yv A02;
    public final InterfaceC11380iw A03;
    public final ImageUrl A04;

    public BVE(C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl) {
        AbstractC167017dG.A1P(interfaceC11380iw, imageUrl);
        this.A03 = interfaceC11380iw;
        this.A04 = imageUrl;
        this.A01 = 100.0f;
        this.A00 = 100.0f;
        this.A02 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        return new C25622BUk(ImageView.ScaleType.CENTER_CROP, AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(AbstractC25232BEp.A17(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), C05F.A00, this.A01, A1Z ? 1 : 0), C05F.A01, this.A00, A1Z ? 1 : 0).A00(this.A02), this.A03, this.A04, null, null, AbstractC27808CNx.A01, null, 3, A1Z, A1Z);
    }
}
