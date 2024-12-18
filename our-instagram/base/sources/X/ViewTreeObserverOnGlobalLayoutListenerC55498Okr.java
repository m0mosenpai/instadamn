package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.Okr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC55498Okr implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AlbumEditFragment A02;

    public ViewTreeObserverOnGlobalLayoutListenerC55498Okr(ViewGroup viewGroup, AlbumEditFragment albumEditFragment) {
        this.A02 = albumEditFragment;
        this.A01 = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.A01;
        AlbumEditFragment albumEditFragment = this.A02;
        C57982lB.A0B.A04(albumEditFragment.requireActivity(), new PIQ(viewGroup, this, albumEditFragment), false);
    }
}
