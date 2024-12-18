package X;

import androidx.fragment.app.Fragment;
import com.instagram.discovery.mediamap.fragment.LocationListFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.model.reels.Reel;

/* renamed from: X.Wm6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70990Wm6 implements InterfaceC63982vJ {
    public final /* synthetic */ LocationListFragment A00;
    public final /* synthetic */ boolean A01;

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    public C70990Wm6(LocationListFragment locationListFragment, boolean z) {
        this.A00 = locationListFragment;
        this.A01 = z;
    }

    @Override // X.InterfaceC63982vJ
    public final void DHC(Reel reel, C6X4 c6x4) {
        LocationListFragment locationListFragment = this.A00;
        locationListFragment.mAdapter.notifyDataSetChanged();
        Fragment fragment = locationListFragment.mParentFragment;
        fragment.getClass();
        ((MediaMapFragment) fragment).mMapChromeController.A03();
        if (this.A01 && LocationListFragment.A05(locationListFragment)) {
            LocationListFragment.A04(locationListFragment, LocationListFragment.A01(locationListFragment));
        }
    }
}
