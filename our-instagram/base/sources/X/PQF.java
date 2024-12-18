package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.fragment.AlbumEditFragment;

/* loaded from: classes9.dex */
public final class PQF implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AlbumEditFragment A01;

    public PQF(View view, AlbumEditFragment albumEditFragment) {
        this.A01 = albumEditFragment;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlbumEditFragment albumEditFragment = this.A01;
        FragmentActivity activity = albumEditFragment.getActivity();
        if (activity != null) {
            C5SU A0f = AbstractC167017dG.A0f(activity, albumEditFragment.requireContext().getString(2131962414));
            A0f.A02();
            A0f.A03(this.A00);
            KYR.A00(A0f, albumEditFragment, 4).A07(AbstractC166987dD.A0r(albumEditFragment.A0d));
        }
    }
}
