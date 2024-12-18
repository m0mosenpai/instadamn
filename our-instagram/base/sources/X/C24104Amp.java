package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Amp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24104Amp implements InterfaceC1119153d {
    public final /* synthetic */ C8BP A00;

    public C24104Amp(C8BP c8bp) {
        this.A00 = c8bp;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C8BP c8bp = this.A00;
        c8bp.A0K.A05 = C05F.A0C;
        C8BF c8bf = c8bp.A0J;
        if (c8bf.A02) {
            c8bp.A0H.DlU();
            c8bf.A02 = false;
        }
        c8bp.A0H.DUa();
        C8BJ c8bj = c8bp.A00;
        if (c8bj != null) {
            c8bj.A00();
        }
        c8bp.A01 = null;
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        Fragment fragment;
        C8BP c8bp = this.A00;
        C189478aR c189478aR = c8bp.A01;
        if (c189478aR != null) {
            fragment = c189478aR.A03.A0M();
        } else {
            fragment = null;
        }
        if (fragment instanceof N6W) {
            C22C A01 = AnonymousClass229.A01(c8bp.A0D);
            A01.A1R(((C22F) A01).A04.A0C, "AUDIO_ENHANCE_BACK_TO_POSTCAP");
        }
        c8bp.A0H.DUZ();
    }
}
