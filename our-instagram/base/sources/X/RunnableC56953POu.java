package X;

import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;

/* renamed from: X.POu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56953POu implements Runnable {
    public final /* synthetic */ C53020Ncs A00;

    public RunnableC56953POu(C53020Ncs c53020Ncs) {
        this.A00 = c53020Ncs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        IgLiveWithGuestFragment igLiveWithGuestFragment = this.A00.A0L;
        OMc oMc = igLiveWithGuestFragment.A07;
        if (oMc == null) {
            str = "reactionsPresenter";
        } else {
            String str2 = igLiveWithGuestFragment.A09;
            if (str2 == null) {
                str = "broadcastId";
            } else {
                igLiveWithGuestFragment.requireArguments().getString("args.media_id");
                oMc.A03(str2);
                C11T.A02(new RunnableC56940POh(igLiveWithGuestFragment));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
