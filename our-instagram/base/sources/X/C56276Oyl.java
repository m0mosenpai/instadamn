package X;

import android.media.MediaPlayer;

/* renamed from: X.Oyl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56276Oyl implements InterfaceC58112Ppb {
    public final Integer A00 = C05F.A00;
    public final String A01;
    public final /* synthetic */ C55041OZn A02;

    public C56276Oyl(C55041OZn c55041OZn) {
        this.A02 = c55041OZn;
        this.A01 = AbstractC166997dE.A0p(c55041OZn.A06.requireContext(), 2131975405);
    }

    @Override // X.InterfaceC58112Ppb
    public final Integer BWJ() {
        return this.A00;
    }

    @Override // X.InterfaceC58112Ppb
    public final void D01() {
        C55041OZn c55041OZn = this.A02;
        C190398bx c190398bx = c55041OZn.A0A.A00;
        c190398bx.A04 = null;
        c190398bx.A1X.F8v(false);
        MediaPlayer mediaPlayer = c55041OZn.A00;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        c55041OZn.A00 = null;
        c55041OZn.A04 = null;
        c55041OZn.A03 = null;
    }

    @Override // X.InterfaceC58112Ppb
    public final String getTitle() {
        return this.A01;
    }
}
