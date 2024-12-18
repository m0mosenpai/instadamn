package X;

import com.instagram.maps.raster.IgRasterMapView;

/* renamed from: X.WTq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C70388WTq implements X90 {
    public final /* synthetic */ X9E A00;
    public final /* synthetic */ IgRasterMapView A01;

    public /* synthetic */ C70388WTq(X9E x9e, IgRasterMapView igRasterMapView) {
        this.A01 = igRasterMapView;
        this.A00 = x9e;
    }

    @Override // X.X90
    public final void DR2(C70394WTw c70394WTw) {
        IgRasterMapView igRasterMapView = this.A01;
        X9E x9e = this.A00;
        C69271Vkf c69271Vkf = igRasterMapView.A02;
        if (c69271Vkf == null) {
            c69271Vkf = new C69271Vkf(c70394WTw);
            igRasterMapView.A02 = c69271Vkf;
        }
        x9e.DR3(c69271Vkf);
    }
}
