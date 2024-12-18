package X;

/* renamed from: X.5ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC123695ii implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4B6 A01;
    public final /* synthetic */ C4U7 A02;

    public RunnableC123695ii(C4B6 c4b6, C4U7 c4u7, int i) {
        this.A02 = c4u7;
        this.A00 = i;
        this.A01 = c4b6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4TY c4ty = this.A02.A01;
        int i = this.A00;
        C4B6 c4b6 = this.A01;
        C95794Sn c95794Sn = ((C4TV) c4ty).A05;
        Integer valueOf = Integer.valueOf(i);
        int i2 = c4b6.A05;
        Integer valueOf2 = Integer.valueOf(i2);
        int i3 = c4b6.A0L;
        Integer valueOf3 = Integer.valueOf(i3);
        int i4 = c4b6.A0A;
        C2QC.A02(c95794Sn, "onDecoderPerfReport avgDecodeTimeMsPerFrame:%d, bitrate:%d, width:%d, height:%d", valueOf, valueOf2, valueOf3, Integer.valueOf(i4));
        c95794Sn.A0v.D9T(i, i3, i4, i2);
    }
}
