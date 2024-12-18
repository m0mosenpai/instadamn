package X;

import android.content.Context;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.AhI, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23866AhI implements InterfaceC58267PsB {
    public final C95334Qt A00;

    @Override // X.InterfaceC58267PsB
    public final void ESu(C54671OCx c54671OCx, int i) {
        try {
            android.net.Uri A0I = AbstractC167007dF.A0I(c54671OCx.A04);
            C95334Qt c95334Qt = this.A00;
            c95334Qt.ESy(A0I, null, null, C50643MXf.__redex_internal_original_name, true, false);
            c95334Qt.E5Q(null, null);
            c95334Qt.seekTo(i);
        } catch (IOException e) {
            AbstractC12120kG.A07("ClipsReviewPlayer", AbstractC167017dG.A0n(e, "failed to prepare video for playback: ", AbstractC166987dD.A1C()), null);
        }
    }

    @Override // X.InterfaceC58267PsB
    public final void EYI(final BDN bdn) {
        this.A00.A0M = new C4QU() { // from class: X.9qm
            @Override // X.C4QU, X.C4QV
            public final void D6i(InterfaceC95344Qu interfaceC95344Qu) {
                BDN.this.onCompletion();
            }

            @Override // X.C4QU, X.C4QV
            public final void DEE(InterfaceC95344Qu interfaceC95344Qu, String str, String str2, String str3) {
                BDN.this.DE2();
            }

            @Override // X.C4QU, X.C4QV
            public final void DaX(InterfaceC95344Qu interfaceC95344Qu, long j) {
                BDN.this.DaT();
            }
        };
    }

    @Override // X.InterfaceC58267PsB
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // X.InterfaceC58267PsB
    public final boolean isPlaying() {
        return this.A00.A09.A0I.A0J();
    }

    @Override // X.InterfaceC58267PsB
    public final void pause() {
        this.A00.pause();
    }

    @Override // X.InterfaceC58267PsB
    public final void release() {
        this.A00.EE5(false);
    }

    @Override // X.InterfaceC58267PsB
    public final void reset() {
        this.A00.reset();
    }

    @Override // X.InterfaceC58267PsB
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // X.InterfaceC58267PsB
    public final void setSurface(Surface surface) {
        this.A00.setSurface(surface);
    }

    @Override // X.InterfaceC58267PsB
    public final void start() {
        this.A00.start();
    }

    public C23866AhI(Context context, UserSession userSession) {
        C95334Qt c95334Qt = new C95334Qt(context, userSession, "clips_review");
        c95334Qt.EhH(1.0f);
        this.A00 = c95334Qt;
    }
}
