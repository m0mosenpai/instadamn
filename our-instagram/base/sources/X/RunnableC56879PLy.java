package X;

/* renamed from: X.PLy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56879PLy implements Runnable {
    public final /* synthetic */ NI5 A00;

    public RunnableC56879PLy(NI5 ni5) {
        this.A00 = ni5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NI5 ni5 = this.A00;
        C3OO A0V = ni5.A0A.A0V(ni5.A00);
        if (A0V != null) {
            if (!ni5.A03) {
                AbstractC12120kG.A07("ClipsStackedTimelineVideoTrackController", "view not attached during reorder drag", null);
            } else {
                if (A0V.itemView == null) {
                    return;
                }
                ni5.A09.A07(A0V);
            }
        }
    }
}
