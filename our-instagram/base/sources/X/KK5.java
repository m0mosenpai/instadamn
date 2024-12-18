package X;

import android.graphics.Rect;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.creation.base.CropInfo;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KK5 extends C2AG {
    public final /* synthetic */ android.net.Uri A00;
    public final /* synthetic */ GalleryItem A01;
    public final /* synthetic */ C43871Jab A02;
    public final /* synthetic */ CallableC209819Pr A03;
    public final /* synthetic */ C47Z A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    @Override // X.C11R
    public final int getRunnableId() {
        return 541;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        AbstractC12120kG.A0I("GalleryPickerView_AlbumImport", exc, AbstractC06930Yk.A0E());
        C43871Jab.A02(this.A02);
    }

    public KK5(android.net.Uri uri, GalleryItem galleryItem, C43871Jab c43871Jab, CallableC209819Pr callableC209819Pr, C47Z c47z, List list, boolean z) {
        this.A03 = callableC209819Pr;
        this.A02 = c43871Jab;
        this.A01 = galleryItem;
        this.A06 = z;
        this.A00 = uri;
        this.A04 = c47z;
        this.A05 = list;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.A03.call();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.instagram.creation.capture.gallery.GalleryPreviewInfo, java.lang.Object] */
    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C44262Jh8 c44262Jh8 = (C44262Jh8) obj;
        C14360o3.A0B(c44262Jh8, 0);
        C43871Jab c43871Jab = this.A02;
        Map map = c43871Jab.A02;
        GalleryItem galleryItem = this.A01;
        String str = galleryItem.A0A;
        if (!map.containsKey(str) || this.A06) {
            Integer num = null;
            ?? obj2 = new Object();
            obj2.A03 = null;
            obj2.A02 = null;
            obj2.A00 = null;
            obj2.A01 = null;
            obj2.A02 = this.A00.getPath();
            obj2.A01 = c44262Jh8.A01;
            InterfaceC197178nn interfaceC197178nn = c44262Jh8.A02;
            if (interfaceC197178nn != null) {
                num = Integer.valueOf(interfaceC197178nn.getWidth());
            }
            if (num != null) {
                int intValue = num.intValue();
                if (interfaceC197178nn != null) {
                    int height = interfaceC197178nn.getHeight();
                    if (Integer.valueOf(height) != null) {
                        obj2.A00 = new CropInfo(MX2.A01(new Rect(0, 0, interfaceC197178nn.getWidth(), interfaceC197178nn.getHeight())), intValue, height);
                        c43871Jab.A02.put(str, obj2);
                    }
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        C43871Jab.A01(galleryItem, c43871Jab, this.A04, this.A00.getPath(), this.A05);
    }
}
