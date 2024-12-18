package X;

import android.graphics.SurfaceTexture;

/* renamed from: X.Azx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24898Azx implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C180177z7 A05;
    public final /* synthetic */ C176507t8 A06;
    public final /* synthetic */ boolean A07;

    public RunnableC24898Azx(C180177z7 c180177z7, C176507t8 c176507t8, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A05 = c180177z7;
        this.A06 = c176507t8;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = i5;
        this.A07 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
        C180177z7 c180177z7 = this.A05;
        C176507t8 c176507t8 = this.A06;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A04;
        int i5 = this.A00;
        boolean z = this.A07;
        c180177z7.A03 = i;
        c180177z7.A01 = i2;
        c180177z7.A02 = i3;
        c180177z7.A04 = i4;
        c180177z7.A00 = i5;
        c180177z7.A06 = z;
        if (c180177z7.A0K == null) {
            c180177z7.A0K = new WIL(c180177z7.A0F);
            C180177z7.A00(c180177z7);
        }
        C176507t8 c176507t82 = c180177z7.A0L;
        if (c176507t82 != null && c176507t82 != c176507t8) {
            WIL wil = c180177z7.A0K;
            if (wil != null) {
                wil.A00();
            }
            c176507t82.A01();
        }
        c180177z7.A0L = c176507t8;
        WIL wil2 = c180177z7.A0K;
        InterfaceC175597rZ interfaceC175597rZ = c180177z7.A0J;
        if (wil2 != null) {
            if (interfaceC175597rZ != null) {
                onFrameAvailableListener = c180177z7.A0C;
            } else {
                onFrameAvailableListener = wil2;
            }
            synchronized (wil2) {
                if (!wil2.A02.A03()) {
                    wil2.A03.A02(onFrameAvailableListener, c176507t8);
                }
            }
        }
        C180177z7.A01(c180177z7);
    }
}
