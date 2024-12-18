package X;

import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.venue.LocationDict;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.WTv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70393WTv implements X90 {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ MediaMapPin A06;
    public final /* synthetic */ ENX A07;
    public final /* synthetic */ SavedCollection A08;

    public C70393WTv(UserSession userSession, MediaMapPin mediaMapPin, ENX enx, SavedCollection savedCollection, double d, double d2, int i, int i2, int i3) {
        this.A00 = d;
        this.A01 = d2;
        this.A03 = i;
        this.A06 = mediaMapPin;
        this.A05 = userSession;
        this.A07 = enx;
        this.A08 = savedCollection;
        this.A04 = i2;
        this.A02 = i3;
    }

    @Override // X.X90
    public final void DR2(C70394WTw c70394WTw) {
        C14360o3.A0B(c70394WTw, 0);
        c70394WTw.A03();
        double d = this.A00;
        double d2 = this.A01;
        C70109W4g.A00(c70394WTw, new LatLng(d, d2), 14.0f);
        int i = this.A03;
        C70109W4g c70109W4g = new C70109W4g();
        c70109W4g.A01 = 0.0f;
        c70109W4g.A02 = i / (-2.0f);
        c70394WTw.A09(c70109W4g, null, 0);
        MediaMapPin mediaMapPin = this.A06;
        ImageUrl A00 = mediaMapPin.A00();
        String A01 = AbstractC69973Vyo.A01(mediaMapPin);
        AbstractC13880nE.A04(c70394WTw.A0G, 64);
        LocationDict locationDict = mediaMapPin.A09;
        C14360o3.A0B(locationDict, 0);
        c70394WTw.A0A(new KYY(null, null, c70394WTw, A00, null, "NO-MEDIA-ID", A01, locationDict.getName(), d, d2, i, false, false, false));
        c70394WTw.A06 = new C70383WTl(this.A07, this.A08, this.A04, this.A02);
    }
}
