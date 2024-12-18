package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Wl8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70961Wl8 implements XDP {
    public final /* synthetic */ V1B A00;

    public C70961Wl8(V1B v1b) {
        this.A00 = v1b;
    }

    @Override // X.XDP
    public final void Ddh(Reel reel) {
        V1B v1b = this.A00;
        C69139ViU c69139ViU = v1b.A0F;
        if (c69139ViU != null) {
            c69139ViU.A01 = reel;
        }
        AbstractC31178DnM.A0v(v1b);
        if (v1b.A03 == null) {
            v1b.A03 = reel.A07();
            v1b.A0K = false;
        }
        v1b.A07.A09(V1B.A00(v1b));
    }

    @Override // X.XDP
    public final void Ddj(C38321qM c38321qM) {
        V1B v1b = this.A00;
        C69139ViU c69139ViU = v1b.A0F;
        if (c69139ViU != null) {
            c69139ViU.A00 = c38321qM;
            AbstractC31178DnM.A0v(v1b);
        }
        if (v1b.A03 == null) {
            v1b.A03 = c38321qM.A1S();
            v1b.A0K = false;
            v1b.A07.A09(V1B.A00(v1b));
        }
    }

    @Override // X.XDP
    public final void Ddz() {
        V1B v1b = this.A00;
        v1b.A0K = false;
        v1b.A07.A09(V1B.A00(v1b));
        if (v1b.A03 != null) {
            v1b.A03 = null;
            v1b.A0K = false;
            v1b.A07.A09(V1B.A00(v1b));
        }
    }
}
