package X;

import android.view.View;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.fragment.AlbumEditFragment;

/* loaded from: classes9.dex */
public final class PSS implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ MediaEditActionBar A01;
    public final /* synthetic */ AlbumEditFragment A02;

    public PSS(View view, MediaEditActionBar mediaEditActionBar, AlbumEditFragment albumEditFragment) {
        this.A02 = albumEditFragment;
        this.A01 = mediaEditActionBar;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlbumEditFragment albumEditFragment = this.A02;
        MediaEditActionBar mediaEditActionBar = this.A01;
        InterfaceC58203Pr9 interfaceC58203Pr9 = albumEditFragment.A0E;
        if (interfaceC58203Pr9 == null) {
            C14360o3.A0F("reboundHorizontalScrollView");
            throw C00O.createAndThrow();
        }
        AlbumEditFragment.A06(this.A00, interfaceC58203Pr9, mediaEditActionBar, albumEditFragment);
    }
}
