package X;

import android.widget.ImageView;

/* renamed from: X.Iad, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41590Iad {
    public final ImageView A00;
    public final C07X A01;
    public final C6b8 A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public static final void A00(C41590Iad c41590Iad) {
        AbstractC167007dF.A0w(AbstractC166987dD.A0d(c41590Iad.A02.A06));
        InterfaceC09390do interfaceC09390do = c41590Iad.A03;
        if (((AnonymousClass693) interfaceC09390do.getValue()).isPlaying()) {
            ((AnonymousClass693) interfaceC09390do.getValue()).stop();
            ((AnonymousClass693) interfaceC09390do.getValue()).EMk(0.0f);
        }
    }

    public C41590Iad(ImageView imageView, C07X c07x, InterfaceC018407e interfaceC018407e, C6b8 c6b8) {
        AbstractC167017dG.A1Q(interfaceC018407e, c6b8);
        this.A01 = c07x;
        this.A02 = c6b8;
        this.A00 = imageView;
        this.A04 = Ny8.A00(new C55567Om1(), interfaceC018407e, AbstractC25225BEi.A1D(C38317GtC.class));
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8V(this, 45));
        C43172J6r.A03(this, C07Y.A00(c07x), 49);
    }
}
