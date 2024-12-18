package X;

import android.opengl.GLES20;

/* renamed from: X.Wss, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71383Wss implements Runnable {
    public final int[] A00;

    @Override // java.lang.Runnable
    public final void run() {
        GLES20.glDeleteBuffers(1, this.A00, 0);
    }

    public RunnableC71383Wss(int i) {
        this.A00 = new int[]{i};
    }
}
