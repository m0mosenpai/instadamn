package X;

import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;

/* renamed from: X.POg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56939POg implements Runnable {
    public final /* synthetic */ IgLiveWithGuestFragment A00;

    public RunnableC56939POg(IgLiveWithGuestFragment igLiveWithGuestFragment) {
        this.A00 = igLiveWithGuestFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(128);
        }
    }
}
