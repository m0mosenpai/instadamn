package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AdT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23634AdT implements InterfaceC66482zP {
    public final GalleryGridFormat A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    public C23634AdT(GalleryGridFormat galleryGridFormat, Integer num, List list) {
        C14360o3.A0B(num, 3);
        this.A03 = list;
        this.A00 = galleryGridFormat;
        this.A01 = num;
        StringBuilder sb = new StringBuilder("ids:");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(AbstractC166987dD.A0l(it).A05);
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        sb.append(this.A00.name());
        this.A02 = AbstractC166987dD.A19(sb);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C23634AdT c23634AdT = (C23634AdT) obj;
        C14360o3.A0B(c23634AdT, 0);
        if (C14360o3.A0K(this.A03, c23634AdT.A03) && this.A00 == c23634AdT.A00 && this.A01 == c23634AdT.A01) {
            return true;
        }
        return false;
    }
}
