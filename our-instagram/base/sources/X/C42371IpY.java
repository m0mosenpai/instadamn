package X;

import android.graphics.Rect;
import com.instagram.shopping.fragment.pdp.AdsProductPageFragment;

/* renamed from: X.IpY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42371IpY implements InterfaceC57142jp {
    public final /* synthetic */ AdsProductPageFragment A00;

    public C42371IpY(AdsProductPageFragment adsProductPageFragment) {
        this.A00 = adsProductPageFragment;
    }

    @Override // X.InterfaceC57142jp
    public final void Ao7(Rect rect) {
        C56352iT.A0t.A03(this.A00.getActivity()).A0P.getGlobalVisibleRect(rect);
    }
}
