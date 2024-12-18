package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.AfK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23747AfK implements InterfaceC25206BDe {
    public final /* synthetic */ C8ZA A00;
    public final /* synthetic */ C191478dz A01;
    public final /* synthetic */ AudioOverlayTrack A02;
    public final /* synthetic */ boolean A03;

    @Override // X.InterfaceC25206BDe
    public final void Doo() {
    }

    @Override // X.InterfaceC25206BDe
    public final void Dop() {
    }

    public C23747AfK(C8ZA c8za, C191478dz c191478dz, AudioOverlayTrack audioOverlayTrack, boolean z) {
        this.A01 = c191478dz;
        this.A03 = z;
        this.A02 = audioOverlayTrack;
        this.A00 = c8za;
    }

    @Override // X.InterfaceC25206BDe
    public final void Doq() {
        C191478dz c191478dz = this.A01;
        c191478dz.A0M = true;
        if (this.A00 == C8ZA.A03) {
            c191478dz.A0o.A00();
        }
    }

    @Override // X.InterfaceC25206BDe
    public final void Dor() {
        C191478dz c191478dz = this.A01;
        if (c191478dz.A0B != null) {
            if (this.A03) {
                AudioOverlayTrack audioOverlayTrack = this.A02;
                if (audioOverlayTrack != null) {
                    new OJI(c191478dz.A0S, c191478dz.A0b, new C23869AhM(c191478dz, audioOverlayTrack), audioOverlayTrack).A00();
                }
            } else {
                boolean A1X = AbstractC167007dF.A1X(this.A00, C8ZA.A03);
                AnonymousClass229.A01(c191478dz.A0b).A03.A07("clips_post_cap_audio_pill");
                c191478dz.A0m.A03(C8BN.POST_CAPTURE_AUDIO_PILL, this.A02, null, null, false, false, false, A1X);
            }
            C8Z9 c8z9 = c191478dz.A0B;
            if (c8z9 != null) {
                c8z9.A04(false);
            }
        }
    }
}
