package X;

import android.view.View;
import com.facebook.R;
import com.instagram.creation.fragment.AlbumEditFragment;

/* loaded from: classes8.dex */
public final class M0C implements Runnable {
    public final /* synthetic */ AlbumEditFragment A00;

    public M0C(AlbumEditFragment albumEditFragment) {
        this.A00 = albumEditFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlbumEditFragment albumEditFragment = this.A00;
        if (albumEditFragment.getActivity() != null && albumEditFragment.isVisible()) {
            InterfaceC58286Pse interfaceC58286Pse = albumEditFragment.A0N;
            if (interfaceC58286Pse == null) {
                C14360o3.A0F("provider");
                throw C00O.createAndThrow();
            }
            View findViewById = interfaceC58286Pse.BQj().findViewById(R.id.feed_creation_filter_button);
            if (findViewById != null) {
                findViewById.post(new M3X(findViewById, albumEditFragment));
            }
        }
    }
}
