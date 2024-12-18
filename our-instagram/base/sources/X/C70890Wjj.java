package X;

import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.Wjj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70890Wjj implements InterfaceC71923XAh {
    public final /* synthetic */ MediaMapFragment A00;
    public final /* synthetic */ String A01;

    public C70890Wjj(MediaMapFragment mediaMapFragment, String str) {
        this.A00 = mediaMapFragment;
        this.A01 = str;
    }

    @Override // X.InterfaceC71923XAh
    public final void DYk(MediaMapPin mediaMapPin) {
        Double d;
        MediaMapFragment mediaMapFragment = this.A00;
        java.util.Set set = (java.util.Set) mediaMapFragment.A09.A01.get(this.A01);
        if (set != null) {
            set.remove(this);
        }
        mediaMapFragment.A08 = null;
        C69800Vvm c69800Vvm = mediaMapFragment.mMapViewController;
        HashSet A02 = AbstractC103614ld.A02(1);
        Collections.addAll(A02, mediaMapPin);
        c69800Vvm.A0F(A02);
        mediaMapFragment.mMapViewController.A08();
        Double d2 = mediaMapPin.A0A;
        if (d2 != null && (d = mediaMapPin.A0B) != null) {
            mediaMapFragment.mMapViewController.A0A(d2.doubleValue(), d.doubleValue(), 16.0f);
            mediaMapFragment.mMapViewController.A0C((r5.mContainer.getHeight() / 2.0f) - (r5.A00 + mediaMapFragment.A0A.A03));
        }
        mediaMapFragment.A0H = mediaMapPin;
        mediaMapFragment.A0L = false;
        MediaMapFragment.A06(mediaMapFragment);
    }
}
