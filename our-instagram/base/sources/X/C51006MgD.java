package X;

import com.instagram.video.live.mvvm.viewmodel.layoutmanager.IgLiveLayoutManagerViewModel$2;

/* renamed from: X.MgD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51006MgD extends AbstractC52922bZ {
    public final float A00;
    public final int A01;
    public final EnumC142806cg A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C0UO A06;
    public final boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final OLC A0B;
    public final MTU A0C;

    public static final int A00(C51006MgD c51006MgD) {
        int i;
        if (MSZ.A1a(c51006MgD.A0B.A0i)) {
            i = c51006MgD.A08 * 2;
        } else {
            i = 0;
        }
        int i2 = (int) ((c51006MgD.A0A - i) / 0.5625f);
        int i3 = c51006MgD.A09;
        if (i2 > i3) {
            i2 = i3;
        }
        return i3 - i2;
    }

    public C51006MgD(EnumC142806cg enumC142806cg, OLC olc, MTU mtu, float f, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        AbstractC167017dG.A1P(olc, mtu);
        this.A0B = olc;
        this.A0C = mtu;
        this.A02 = enumC142806cg;
        this.A09 = i;
        this.A0A = i2;
        this.A00 = f;
        this.A01 = i3;
        this.A08 = i4;
        this.A07 = z2;
        C008002u A00 = C10E.A00(null);
        this.A03 = A00;
        this.A06 = AbstractC208910l.A02(A00);
        Float A0l = AbstractC25227BEk.A0l();
        C008002u A1H = AbstractC25225BEi.A1H(A0l);
        this.A05 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(A0l);
        this.A04 = A1H2;
        MSZ.A17(this, C57167PZl.A01(this, null, 48), mtu.A00);
        if (z) {
            MSZ.A19(this, new IgLiveLayoutManagerViewModel$2(this, null), olc.A0n, A1H, A1H2);
        }
    }
}
