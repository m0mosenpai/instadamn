package X;

import android.graphics.Bitmap;
import com.instagram.video.live.mvvm.viewmodel.stickers.IgLiveOverlayBurnInViewModel$1;

/* renamed from: X.MfK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50951MfK extends AbstractC52922bZ {
    public final double A00;
    public final long A01;
    public final Bitmap.Config A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final C0UO A06;
    public final boolean A07;
    public final boolean A08;

    public C50951MfK(Bitmap.Config config, OLC olc, double d, long j, boolean z, boolean z2) {
        C14360o3.A0B(olc, 1);
        this.A07 = z;
        this.A08 = z2;
        this.A01 = j;
        this.A02 = config;
        this.A00 = d;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A03 = A12;
        this.A04 = AbstractC07080Za.A03(A12);
        C008002u A00 = C10E.A00(null);
        this.A05 = A00;
        this.A06 = AbstractC208910l.A02(A00);
        C15370ps A1F = AbstractC25225BEi.A1F();
        AbstractC18560vj.A03(AbstractC141776au.A00(this), C10Q.A02(new IgLiveOverlayBurnInViewModel$1(this, null, A1F), olc.A0X, olc.A0o, olc.A0e, olc.A0Y, olc.A0i));
    }
}
