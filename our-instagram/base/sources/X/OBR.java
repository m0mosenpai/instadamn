package X;

import com.facebook.cdl.p001native.ContentDeliveryLibrary;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: classes9.dex */
public final class OBR {
    public final ContentDeliveryLibrary A00;
    public final C55001OVe A01;
    public final TigonServiceHolder A02;
    public final TigonServiceHolder A03;

    public OBR(C55001OVe c55001OVe, TigonServiceHolder tigonServiceHolder, TigonServiceHolder tigonServiceHolder2, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2) {
        this.A02 = tigonServiceHolder;
        this.A03 = tigonServiceHolder2;
        this.A01 = c55001OVe;
        this.A00 = new ContentDeliveryLibrary(str, tigonServiceHolder, tigonServiceHolder2, str2, str3, z, str4, i, i2, z2);
    }
}
