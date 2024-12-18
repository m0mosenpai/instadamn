package X;

import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public final class PJ8 implements InterfaceC43429JGt {
    public final /* synthetic */ C3KX A00;
    public final /* synthetic */ String A01;

    public PJ8(C3KX c3kx, String str) {
        this.A01 = str;
        this.A00 = c3kx;
    }

    @Override // X.InterfaceC43429JGt
    public final void D0R(Reel reel) {
        C105824pt c105824pt = reel.A0H;
        if (c105824pt != null) {
            c105824pt.A0f = this.A01;
        }
        C3KX.A01(reel, C3G2.A03, this.A00, null, null);
    }
}
