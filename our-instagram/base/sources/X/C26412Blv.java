package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Blv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26412Blv extends AbstractC51572Yf {
    public final float A00;
    public final float A01;
    public final InterfaceC11380iw A02;
    public final ImageUrl A03;

    public C26412Blv(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A02 = interfaceC11380iw;
        this.A03 = imageUrl;
        this.A01 = 100.0f;
        this.A00 = 100.0f;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        return new C25622BUk(ImageView.ScaleType.CENTER_CROP, AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(AbstractC25232BEp.A17(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), C05F.A00, this.A01, A1Z ? 1 : 0), C05F.A01, this.A00, A1Z ? 1 : 0), this.A02, this.A03, null, null, AbstractC27808CNx.A01, null, 3, A1Z, A1Z);
    }
}
