package X;

/* loaded from: classes6.dex */
public final class G09 implements C11R {
    public final /* synthetic */ C35017Fbq A00;

    @Override // X.C11R
    public final String getName() {
        return "handleFacebookPictureAvailable";
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 249;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    @Override // X.C11R
    public final void run() {
        if (!VPW.A00(null)) {
            throw AbstractC166987dD.A15("getFbAccessToken");
        }
    }

    public G09(C35017Fbq c35017Fbq) {
        this.A00 = c35017Fbq;
    }

    @Override // X.C11R
    public final void onFinish() {
        synchronized (this.A00) {
        }
    }
}
