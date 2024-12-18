package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LxF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49684LxF implements C6C3 {
    public L27 A00;
    public C5TA A01;
    public final Context A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C30P A05;

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
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
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
        this.A00 = null;
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C6C3
    public final void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    public final void A00(boolean z) {
        String str;
        C5TA c5ta = this.A01;
        if (c5ta != null) {
            if (z) {
                str = "tapped";
            } else {
                str = "fragment_paused";
            }
            c5ta.A09(str);
        }
        L27 l27 = this.A00;
        if (l27 != null) {
            InterfaceC74953Yl interfaceC74953Yl = l27.A00.A00.A02;
            if (interfaceC74953Yl.getValue() != EnumC27391C6u.A06) {
                interfaceC74953Yl.Egh(EnumC27391C6u.A04);
            }
        }
    }

    @Override // X.C6C3
    public final void onCompletion() {
        C5TA c5ta = this.A01;
        if (c5ta != null) {
            c5ta.A0C("finished", true);
        }
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        float f;
        L27 l27 = this.A00;
        if (l27 != null) {
            L82 l82 = l27.A00.A00;
            InterfaceC74953Yl interfaceC74953Yl = l82.A02;
            if (interfaceC74953Yl.getValue() != EnumC27391C6u.A06) {
                interfaceC74953Yl.Egh(EnumC27391C6u.A05);
                if (i2 - i <= 100) {
                    float f2 = i2;
                    l82.A03.Egh(new C66625UPn(1.0f, f2, f2, 0));
                    AbstractC23641Du.A05(C12L.A00.A04, new MBq(l82, null, 35), l82.A07);
                    return;
                }
                if (i2 == 0) {
                    f = 0.0f;
                } else {
                    f = i / i2;
                }
                l82.A03.Egh(new C66625UPn(f, i, i2, 0));
            }
        }
    }

    public C49684LxF(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C30P c30p) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A05 = c30p;
    }
}
