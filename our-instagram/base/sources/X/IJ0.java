package X;

import android.os.Parcelable;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class IJ0 {
    public Parcelable A00;
    public final int A01;
    public final InterfaceC99144cb A02;
    public final Map A03 = AbstractC166987dD.A1G();
    public final Map A04 = AbstractC166987dD.A1G();

    /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Parcelable, java.lang.Object] */
    public IJ0(InterfaceC99144cb interfaceC99144cb, int i) {
        this.A02 = interfaceC99144cb;
        this.A01 = i;
        List unmodifiableList = Collections.unmodifiableList(interfaceC99144cb.Bgy().A03);
        for (int i2 = 0; i2 < unmodifiableList.size(); i2++) {
            String id = ((ProductFeedItem) unmodifiableList.get(i2)).getId();
            AbstractC37301Gc2.A1T(id, this.A04, i2);
            this.A03.put(id, new Object());
        }
        this.A00 = new Object();
    }
}
