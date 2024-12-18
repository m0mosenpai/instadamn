package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.YHl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73521YHl implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ AbstractC55102ObF A01;

    public RunnableC73521YHl(SurfaceTexture surfaceTexture, AbstractC55102ObF abstractC55102ObF) {
        this.A01 = abstractC55102ObF;
        this.A00 = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC55102ObF abstractC55102ObF = this.A01;
        if (abstractC55102ObF != null) {
            abstractC55102ObF.A0H(this.A00);
        }
    }
}
