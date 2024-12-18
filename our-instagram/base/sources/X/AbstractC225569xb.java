package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC225569xb {
    public static Map A00(AnonymousClass924 anonymousClass924) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        anonymousClass924.getCanViewerLinkBackToOriginalMediaFromVcr();
        A1I.put(AbstractC111324zv.A00(180), Boolean.valueOf(anonymousClass924.getCanViewerLinkBackToOriginalMediaFromVcr()));
        if (anonymousClass924.Apb() != null) {
            A1I.put(AbstractC111324zv.A00(830), anonymousClass924.Apb().F7o());
        }
        if (anonymousClass924.BZq() != null) {
            A1I.put("original_media", anonymousClass924.BZq().F7o());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
