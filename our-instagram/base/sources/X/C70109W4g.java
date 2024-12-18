package X;

import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;

/* renamed from: X.W4g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70109W4g {
    public int A07;
    public LatLng A08;
    public LatLngBounds A09;
    public float A03 = -2.1474836E9f;
    public float A04 = -2.1474836E9f;
    public float A05 = -2.1474836E9f;
    public float A06 = -2.1474836E9f;
    public float A01 = -2.1474836E9f;
    public float A02 = -2.1474836E9f;
    public float A00 = -2.1474836E9f;

    public static void A00(C70394WTw c70394WTw, LatLng latLng, float f) {
        C70109W4g c70109W4g = new C70109W4g();
        c70109W4g.A08 = latLng;
        c70109W4g.A03 = f;
        c70394WTw.A09(c70109W4g, null, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC31173DnH.A0q(this));
        sb.append("{mLatLng=");
        sb.append(this.A08);
        sb.append(", mZoom=");
        sb.append(this.A03);
        sb.append(", mZoomBy=");
        sb.append(this.A04);
        sb.append(", mZoomX=");
        sb.append(this.A05);
        sb.append(", mZoomY=");
        sb.append(this.A06);
        sb.append(", mXPixel=");
        sb.append(this.A01);
        sb.append(", mYPixel=");
        sb.append(this.A02);
        sb.append(", mRotation = ");
        sb.append(this.A00);
        sb.append(", mRendererBounds=");
        sb.append(this.A09);
        sb.append(", mWidth=");
        sb.append(0);
        sb.append(", mHeight=");
        sb.append(0);
        sb.append(", mPadding=");
        sb.append(this.A07);
        return AbstractC166997dE.A0x("}", sb);
    }
}
