package X;

import com.instagram.model.reels.Reel;
import kotlin.Deprecated;

@Deprecated(message = "\n      This class is Deprecated since its creation as it's not meant to be used and new \n      functionality that's not related to keeping compatibility with functionality not yet migrated \n      to MVVM should not be added here.\n      ")
/* renamed from: X.6WU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WU extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final OCK A02;
    public final C54569O8v A03;
    public final InterfaceC06180Ui A04;
    public final OB0 A05;
    public final C54568O8u A06;
    public final OKW A07;
    public final C54475O5d A08;
    public final InterfaceC19390xP A09;
    public final InterfaceC19390xP A0A;
    public final InterfaceC19390xP A0B;

    public C6WU(OB0 ob0, C54568O8u c54568O8u, OCK ock, OKW okw, C54569O8v c54569O8v, C54475O5d c54475O5d) {
        C14360o3.A0B(c54475O5d, 4);
        C14360o3.A0B(okw, 5);
        C14360o3.A0B(c54569O8v, 6);
        this.A05 = ob0;
        this.A02 = ock;
        this.A06 = c54568O8u;
        this.A08 = c54475O5d;
        this.A07 = okw;
        this.A03 = c54569O8v;
        PV7 pv7 = new PV7(okw.A01);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, pv7);
        PV8 pv8 = new PV8(ock.A02);
        this.A0B = pv8;
        PV9 pv9 = new PV9(c54568O8u.A01);
        this.A0A = pv9;
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A04 = A00;
        C013404z A04 = AnonymousClass111.A04(pv8, pv9, A00);
        this.A09 = A04;
        this.A00 = AbstractC58232lf.A00(anonymousClass191, A04);
    }

    public final void A01(C41181vS c41181vS, C41551w4 c41551w4, float f, int i) {
        int i2;
        C14360o3.A0B(c41551w4, 0);
        C14360o3.A0B(c41181vS, 1);
        OB0 ob0 = this.A05;
        Reel reel = c41551w4.A0H;
        int i3 = c41551w4.A0E;
        if (c41551w4.A0L) {
            i2 = 0;
        } else {
            i2 = c41551w4.A00;
        }
        int i4 = c41551w4.A01;
        boolean z = !this.A08.A00.A00.Cbf(reel, c41181vS);
        java.util.Set set = ob0.A00;
        String id = reel.getId();
        C14360o3.A07(id);
        set.add(id);
        ob0.A01.Egh(new C51932MxF(reel, c41181vS, new C51625MrI(f, i3, i, i2, i4, set.size(), z)));
    }

    public final void A00() {
        C05A c05a = this.A07.A00;
        C50525MSe c50525MSe = (C50525MSe) c05a.getValue();
        c05a.Egh(new C50525MSe(c50525MSe.A01, 5, c50525MSe.A02, true, c50525MSe.A00));
    }
}
