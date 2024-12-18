package X;

import com.instagram.avatars.coinflip.ProfileCoinFlipView;

/* loaded from: classes6.dex */
public final class GNQ implements Runnable {
    public final /* synthetic */ C74H A00;
    public final /* synthetic */ ProfileCoinFlipView A01;

    public GNQ(C74H c74h, ProfileCoinFlipView profileCoinFlipView) {
        this.A00 = c74h;
        this.A01 = profileCoinFlipView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C74H c74h = this.A00;
        c74h.A05(false, true);
        ProfileCoinFlipView profileCoinFlipView = this.A01;
        profileCoinFlipView.postDelayed(new RunnableC36803GKc(c74h), 3500L);
        profileCoinFlipView.postDelayed(new RunnableC36804GKd(c74h), 3400L);
    }
}
