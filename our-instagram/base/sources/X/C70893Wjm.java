package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;

/* renamed from: X.Wjm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70893Wjm implements InterfaceC71953XCf {
    public MediaMapPin A00;
    public final LocationDetailFragment A01;
    public final MediaMapFragment A02;
    public final MediaMapFragment A03;
    public final Context A04;
    public final UserSession A05;
    public final C69791VvW A06;

    public C70893Wjm(ViewGroup viewGroup, UserSession userSession, LocationDetailFragment locationDetailFragment, MediaMapFragment mediaMapFragment, MediaMapFragment mediaMapFragment2, MediaMapPin mediaMapPin) {
        AbstractC25234BEr.A0j(2, userSession, mediaMapPin, viewGroup, mediaMapFragment);
        C14360o3.A0B(mediaMapFragment2, 6);
        this.A01 = locationDetailFragment;
        this.A00 = mediaMapPin;
        this.A03 = mediaMapFragment;
        this.A04 = locationDetailFragment.requireContext();
        this.A06 = new C69791VvW(viewGroup, userSession);
        this.A02 = mediaMapFragment2;
        this.A05 = userSession;
    }

    @Override // X.InterfaceC71953XCf
    public final void ADa() {
        Venue A00 = AbstractC69973Vyo.A00(this.A00.A09);
        C69619VsM c69619VsM = this.A03.A05;
        String A05 = A00.A05();
        C14360o3.A07(A05);
        Reel reel = (Reel) c69619VsM.A03.get(A05);
        LocationPageInformation locationPageInformation = this.A00.A06;
        if (locationPageInformation != null && locationPageInformation.A00() != null) {
            C18U.A06(C06090Tz.A05, this.A05, 36315017934539728L);
        }
        C69791VvW c69791VvW = this.A06;
        c69791VvW.A00(null, new WNU(this, 1), A00.A00.getName());
        if (reel != null) {
            c69791VvW.A01(this.A01, new C70891Wjk(this), reel, A00);
        } else {
            c69791VvW.A03(false);
        }
        WNU wnu = new WNU(this, 2);
        ImageView imageView = c69791VvW.A02;
        C0fQ.A00(wnu, imageView);
        imageView.setVisibility(0);
        Drawable drawable = this.A04.getDrawable(R.drawable.instagram_more_vertical_pano_outline_24);
        C14360o3.A0A(drawable);
        WNU wnu2 = new WNU(this, 3);
        ImageView imageView2 = c69791VvW.A01;
        imageView2.setImageDrawable(drawable);
        C0fQ.A00(wnu2, imageView2);
        imageView2.setVisibility(0);
    }

    @Override // X.InterfaceC71953XCf
    public final void EYu(MediaMapPin mediaMapPin) {
        this.A00 = mediaMapPin;
    }
}
