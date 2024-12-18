package X;

import android.widget.FrameLayout;

/* renamed from: X.J5s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43155J5s implements Runnable {
    public final /* synthetic */ C126545np A00;
    public final /* synthetic */ C6T7 A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ C141906b9 A03;
    public final /* synthetic */ C84823qW A04;

    public RunnableC43155J5s(C126545np c126545np, C6T7 c6t7, C41181vS c41181vS, C141906b9 c141906b9, C84823qW c84823qW) {
        this.A01 = c6t7;
        this.A00 = c126545np;
        this.A04 = c84823qW;
        this.A03 = c141906b9;
        this.A02 = c41181vS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6T7 c6t7 = this.A01;
        C126545np c126545np = this.A00;
        c6t7.A07(c126545np);
        C84823qW c84823qW = this.A04;
        FrameLayout frameLayout = this.A03.A00;
        int width = frameLayout.getWidth();
        int height = frameLayout.getHeight();
        float A00 = this.A02.A00();
        C138436Oz c138436Oz = C138436Oz.A00;
        C14360o3.A0B(c126545np, 0);
        C138436Oz.A04(c126545np, c84823qW, A00, width, height, false);
    }
}
