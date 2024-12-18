package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* renamed from: X.Sum, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63854Sum implements InterfaceC65561Tmh {
    public final C63779StZ A00;
    public final C63361SiK A01;
    public final List A02;

    @Override // X.InterfaceC65561Tmh
    public final Bitmap ANq(BitmapFactory.Options options) {
        C61005RdY c61005RdY = this.A00.A00;
        c61005RdY.reset();
        return BitmapFactory.decodeStream(c61005RdY, null, options);
    }

    @Override // X.InterfaceC65561Tmh
    public final int BGk() {
        List list = this.A02;
        C61005RdY c61005RdY = this.A00.A00;
        c61005RdY.reset();
        return AbstractC63044SbN.A00(this.A01, c61005RdY, list);
    }

    @Override // X.InterfaceC65561Tmh
    public final ImageHeaderParser$ImageType BGr() {
        List list = this.A02;
        C61005RdY c61005RdY = this.A00.A00;
        c61005RdY.reset();
        return AbstractC63044SbN.A01(this.A01, c61005RdY, list);
    }

    @Override // X.InterfaceC65561Tmh
    public final void EoZ() {
        C61005RdY c61005RdY = this.A00.A00;
        synchronized (c61005RdY) {
            c61005RdY.A00 = c61005RdY.A05.length;
        }
    }

    public C63854Sum(C63361SiK c63361SiK, InputStream inputStream, List list) {
        Rs8.A00(c63361SiK);
        this.A01 = c63361SiK;
        Rs8.A00(list);
        this.A02 = list;
        this.A00 = new C63779StZ(c63361SiK, inputStream);
    }
}
