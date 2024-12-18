package X;

import android.view.View;
import com.instagram.creation.fragment.AlbumEditFragment;

/* loaded from: classes8.dex */
public final class M3X implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AlbumEditFragment A01;

    public M3X(View view, AlbumEditFragment albumEditFragment) {
        this.A01 = albumEditFragment;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlbumEditFragment albumEditFragment = this.A01;
        C5SU A0f = AbstractC167017dG.A0f(albumEditFragment.requireActivity(), albumEditFragment.requireContext().getString(2131962416));
        A0f.A01();
        A0f.A03(this.A00);
        KYR.A00(A0f, albumEditFragment, 5).A07(albumEditFragment.A0L());
    }
}
