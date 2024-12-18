package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.ui.widget.volume.VolumeIndicator;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.LxG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49685LxG implements C6C3 {
    public float A00 = -1.0f;
    public int A01 = -1;
    public long A02;
    public long A03;
    public C46091Kap A04;
    public C5TA A05;
    public boolean A06;
    public boolean A07;
    public final UserSession A08;
    public final C46087Kal A09;
    public final String A0A;
    public final WeakReference A0B;
    public final DirectVisualMessageViewerController A0C;

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onCues(List list) {
    }

    @Override // X.C6C3
    public final void onLoop(int i) {
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    public final void A00(float f) {
        C5TA c5ta;
        int i = this.A01;
        if (i > 0 && (c5ta = this.A05) != null && this.A04 != null) {
            c5ta.A04(Math.max(0, (int) (f * i)), true);
        } else {
            this.A00 = f;
        }
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
        C5TA c5ta;
        if (this.A04 != null && (c5ta = this.A05) != null) {
            this.A01 = c5ta.A06.Azm();
            float f = this.A00;
            if (f >= 0.0f) {
                A00(f);
                this.A00 = -1.0f;
            }
        }
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
        C5TA c5ta;
        C45093JxN c45093JxN;
        InterfaceC1119053c interfaceC1119053c;
        if (this.A04 != null && (c5ta = this.A05) != null) {
            this.A01 = c5ta.A06.Azm();
            C46091Kap c46091Kap = this.A04;
            Object obj = c46091Kap.A03;
            if (obj != null) {
                c45093JxN = ((C48648LfZ) obj).A00;
            } else {
                c45093JxN = null;
            }
            DirectVisualMessageViewerController directVisualMessageViewerController = this.A0C;
            DirectVisualMessageViewerController.A07(c45093JxN, directVisualMessageViewerController.A0G, directVisualMessageViewerController, c46091Kap.A00);
            DirectVisualMessageViewerController.A08(c45093JxN, directVisualMessageViewerController);
            if (c45093JxN != null && (interfaceC1119053c = directVisualMessageViewerController.A0P) != null) {
                interfaceC1119053c.Dbu(c45093JxN);
            }
        }
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
        C45093JxN c45093JxN;
        C46091Kap c46091Kap = this.A04;
        if (c46091Kap != null) {
            Object obj = c46091Kap.A03;
            if (obj != null) {
                c45093JxN = ((C48648LfZ) obj).A00;
            } else {
                c45093JxN = null;
            }
            DirectVisualMessageViewerController directVisualMessageViewerController = this.A0C;
            VolumeIndicator volumeIndicator = directVisualMessageViewerController.volumeIndicator;
            if (volumeIndicator != null) {
                volumeIndicator.A00(i, i2);
            }
            DirectVisualMessageViewerController.A08(c45093JxN, directVisualMessageViewerController);
        }
    }

    @Override // X.C6C3
    public final void onCompletion() {
        C45093JxN c45093JxN;
        C46091Kap c46091Kap = this.A04;
        if (c46091Kap != null) {
            Object obj = c46091Kap.A03;
            if (obj != null) {
                c45093JxN = ((C48648LfZ) obj).A00;
            } else {
                c45093JxN = null;
            }
            this.A0C.Dbs(c45093JxN);
        }
    }

    @Override // X.C6C3
    public final void onProgressStateChanged(boolean z) {
        C46091Kap c46091Kap = this.A04;
        if (c46091Kap != null) {
            L5Y l5y = c46091Kap.A01;
            int i = 0;
            if (!z) {
                i = 8;
                l5y.A0J.setVisibility(8);
                l5y = c46091Kap.A01;
            }
            l5y.A04.setVisibility(i);
        }
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        C45093JxN c45093JxN;
        C46091Kap c46091Kap = this.A04;
        if (c46091Kap != null) {
            Object obj = c46091Kap.A03;
            if (obj != null) {
                c45093JxN = ((C48648LfZ) obj).A00;
            } else {
                c45093JxN = null;
            }
            this.A0C.Dbz(c45093JxN, i / i2);
        }
    }

    public C49685LxG(Context context, UserSession userSession, C46087Kal c46087Kal, DirectVisualMessageViewerController directVisualMessageViewerController, String str) {
        this.A0B = AbstractC25225BEi.A16(context);
        this.A0C = directVisualMessageViewerController;
        this.A08 = userSession;
        this.A0A = str;
        this.A09 = c46087Kal;
    }

    @Override // X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }
}
