package X;

import android.view.ViewGroup;
import com.instagram.creation.fragment.AlbumEditFragment;

/* loaded from: classes9.dex */
public final class PIQ implements InterfaceC59892oW {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC55498Okr A01;
    public final /* synthetic */ AlbumEditFragment A02;

    public PIQ(ViewGroup viewGroup, ViewTreeObserverOnGlobalLayoutListenerC55498Okr viewTreeObserverOnGlobalLayoutListenerC55498Okr, AlbumEditFragment albumEditFragment) {
        this.A01 = viewTreeObserverOnGlobalLayoutListenerC55498Okr;
        this.A00 = viewGroup;
        this.A02 = albumEditFragment;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        ViewTreeObserverOnGlobalLayoutListenerC55498Okr viewTreeObserverOnGlobalLayoutListenerC55498Okr = this.A01;
        if (!viewTreeObserverOnGlobalLayoutListenerC55498Okr.A00) {
            ViewGroup viewGroup = this.A00;
            AlbumEditFragment albumEditFragment = this.A02;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                viewTreeObserverOnGlobalLayoutListenerC55498Okr.A00 = true;
                layoutParams.height = (int) ((viewGroup.getHeight() - i2) * (1.0d - C18U.A00(C06090Tz.A05, AbstractC166987dD.A0r(albumEditFragment.A0d), 37172143083225659L)));
                viewGroup.setLayoutParams(layoutParams);
                return;
            }
            throw AbstractC166987dD.A15("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
