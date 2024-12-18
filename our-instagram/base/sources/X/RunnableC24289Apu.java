package X;

import java.io.File;

/* renamed from: X.Apu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24289Apu implements Runnable {
    public final /* synthetic */ C459529d A00;

    public RunnableC24289Apu(C459529d c459529d) {
        this.A00 = c459529d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C459529d c459529d = this.A00;
        c459529d.A07();
        if (!c459529d.A0C) {
            C41961wm c41961wm = c459529d.A0H.A0y;
            if (c41961wm.A0G) {
                String str = c41961wm.A0E;
                String str2 = c41961wm.A0F;
                if (!str.equalsIgnoreCase(str2)) {
                    c459529d.A0C = true;
                    File A11 = AbstractC166987dD.A11(AnonymousClass001.A0R(str2, "/ExoPlayerCacheDir/videocache"));
                    if (A11.exists()) {
                        C459529d.A05(A11);
                    }
                }
            }
        }
    }
}
