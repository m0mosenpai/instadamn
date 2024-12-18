package X;

import android.media.MediaRecorder;
import android.util.Pair;

/* renamed from: X.AaF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23442AaF implements InterfaceC175197qt {
    public final /* synthetic */ C208789Lm A00;

    @Override // X.InterfaceC175197qt
    public final void Do3(MediaRecorder mediaRecorder, boolean z) {
    }

    public C23442AaF(C208789Lm c208789Lm) {
        this.A00 = c208789Lm;
    }

    @Override // X.InterfaceC175197qt
    public final void DSC(MediaRecorder mediaRecorder, int i, int i2, boolean z) {
        Pair pair;
        int i3;
        int i4 = AbstractC175037qd.A00;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        if (z) {
            pair = new Pair(valueOf, valueOf2);
            i3 = 28;
        } else {
            pair = new Pair(valueOf, valueOf2);
            i3 = 29;
        }
        AbstractC175037qd.A00(i3, 0, pair);
    }

    @Override // X.InterfaceC175197qt
    public final void Dl8(MediaRecorder mediaRecorder) {
        String str;
        try {
            this.A00.A0C(mediaRecorder);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                str = e.getMessage();
            } else {
                str = "";
            }
            AbstractC175037qd.A02("Camera1Device.setVideoRecordingSource", str);
        }
    }
}
