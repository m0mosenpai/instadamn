package X;

import android.content.Context;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.Venue;

/* renamed from: X.WTu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70392WTu implements X90 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ UJZ A02;
    public final /* synthetic */ C67845UzJ A03;
    public final /* synthetic */ C68820Vcb A04;
    public final /* synthetic */ Venue A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C70392WTu(Context context, ImageUrl imageUrl, UJZ ujz, C67845UzJ c67845UzJ, C68820Vcb c68820Vcb, Venue venue, String str, boolean z) {
        this.A00 = context;
        this.A05 = venue;
        this.A02 = ujz;
        this.A07 = z;
        this.A01 = imageUrl;
        this.A06 = str;
        this.A04 = c68820Vcb;
        this.A03 = c67845UzJ;
    }

    @Override // X.X90
    public final void DR2(C70394WTw c70394WTw) {
        c70394WTw.A03();
        int A01 = C1H4.A01(AbstractC13880nE.A04(this.A00, 64));
        Venue venue = this.A05;
        Double A00 = venue.A00();
        C14360o3.A0A(A00);
        double doubleValue = A00.doubleValue();
        Double A012 = venue.A01();
        C14360o3.A0A(A012);
        double doubleValue2 = A012.doubleValue();
        C70109W4g.A00(c70394WTw, new LatLng(doubleValue, doubleValue2), 14.0f);
        UJZ ujz = this.A02;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        float f = (-C1H4.A01(ujz.A01 / 2)) + ujz.A00;
        C70109W4g c70109W4g = new C70109W4g();
        c70109W4g.A01 = 0.0f;
        c70109W4g.A02 = f;
        c70394WTw.A09(c70109W4g, null, 0);
        if (!this.A07) {
            C68820Vcb c68820Vcb = this.A04;
            ImageUrl imageUrl = this.A01;
            WlO wlO = new WlO(imageUrl, this.A03, c68820Vcb, venue);
            String A05 = venue.A05();
            AbstractC13880nE.A04(c70394WTw.A0G, 64);
            c70394WTw.A0A(new KYY(null, null, c70394WTw, imageUrl, wlO, "NO-MEDIA-ID", A05, this.A06, doubleValue, doubleValue2, A01, false, false, false));
        }
        c70394WTw.A06 = new C70382WTk(this.A01, this.A03, this.A04, venue);
    }
}
