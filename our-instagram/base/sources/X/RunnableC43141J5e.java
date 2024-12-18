package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.J5e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43141J5e implements Runnable {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C41551w4 A01;
    public final /* synthetic */ C145176gc A02;

    public RunnableC43141J5e(AbstractC59962oe abstractC59962oe, C41551w4 c41551w4, C145176gc c145176gc) {
        this.A00 = abstractC59962oe;
        this.A02 = c145176gc;
        this.A01 = c41551w4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.isVisible()) {
            InterfaceC1118853a interfaceC1118853a = this.A02.A18;
            final C41551w4 c41551w4 = this.A01;
            if (c41551w4 != null) {
                final ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC1118853a;
                final int CNR = reelViewerFragment.A1C.CNR(c41551w4);
                C41551w4 c41551w42 = reelViewerFragment.A0a;
                if (c41551w42 != null) {
                    if (c41551w42.equals(c41551w4)) {
                        if (reelViewerFragment.A2R) {
                            reelViewerFragment.CqT();
                        } else {
                            ((C147256kA) reelViewerFragment.mViewPager).A04.A0L(CNR + 1, 0.0f);
                        }
                    }
                    Runnable runnable = new Runnable() { // from class: X.J5c
                        @Override // java.lang.Runnable
                        public final void run() {
                            ReelViewerFragment reelViewerFragment2 = reelViewerFragment;
                            C41551w4 c41551w43 = c41551w4;
                            int i = CNR;
                            ((C146226iL) reelViewerFragment2.A1C).A0C.A02(c41551w43);
                            reelViewerFragment2.A1C.notifyDataSetChanged();
                            InterfaceC147266kB interfaceC147266kB = reelViewerFragment2.mViewPager;
                            if (interfaceC147266kB != null) {
                                ((C147256kA) interfaceC147266kB).A04.A0H(Math.min(r1.A08, i));
                            }
                        }
                    };
                    InterfaceC147266kB interfaceC147266kB = reelViewerFragment.mViewPager;
                    if (interfaceC147266kB != null && interfaceC147266kB.isIdle()) {
                        ((C147256kA) interfaceC147266kB).A02.post(runnable);
                        return;
                    } else {
                        reelViewerFragment.A1o = runnable;
                        return;
                    }
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
