package X;

import com.facebook.android.maps.model.LatLng;
import java.util.Iterator;

/* renamed from: X.WTi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70380WTi implements InterfaceC71890X8x {
    public final /* synthetic */ C69271Vkf A00;

    public C70380WTi(C69271Vkf c69271Vkf) {
        this.A00 = c69271Vkf;
    }

    @Override // X.InterfaceC71890X8x
    public final void DQz(LatLng latLng) {
        Iterator it = this.A00.A02.iterator();
        while (it.hasNext()) {
            ((X9D) it.next()).DQz(latLng);
        }
    }
}
