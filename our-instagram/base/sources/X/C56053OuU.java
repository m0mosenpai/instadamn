package X;

import android.os.SystemClock;

/* renamed from: X.OuU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56053OuU implements InterfaceC12870lZ {
    public final /* synthetic */ OWf A00;

    public C56053OuU(OWf oWf) {
        this.A00 = oWf;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1420330826);
        OWf oWf = this.A00;
        oWf.A08.onAppBackgrounded();
        if (oWf.A0J.A07.isDeviceLocked()) {
            oWf.A06 = true;
        }
        C55213OeY c55213OeY = oWf.A03;
        if (c55213OeY != null) {
            C55213OeY.A02(EnumC53328Ni7.A1S, c55213OeY, C57683PiY.A00);
            c55213OeY.A0D = SystemClock.elapsedRealtime();
            C55213OeY.A07(c55213OeY, C05F.A0C);
        }
        C0f9.A0A(1922897503, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C55213OeY c55213OeY;
        int A03 = C0f9.A03(-1777226981);
        OWf oWf = this.A00;
        C55213OeY c55213OeY2 = oWf.A03;
        if (c55213OeY2 != null) {
            C55213OeY.A02(EnumC53328Ni7.A1T, c55213OeY2, new C57753Pjg(c55213OeY2, 1));
        }
        if (oWf.A06 && (c55213OeY = oWf.A03) != null) {
            C55213OeY.A02(EnumC53328Ni7.A0h, c55213OeY, C57685Pia.A00);
            C55213OeY.A07(c55213OeY, C05F.A01);
        }
        C0f9.A0A(1944936013, A03);
    }
}
