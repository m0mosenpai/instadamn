package X;

import android.graphics.RectF;
import java.util.List;

/* renamed from: X.G2b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36349G2b implements GXW {
    public final C7Y7 A00;
    public final InterfaceC165397aS A01;

    @Override // X.GXW
    public final boolean CoA(android.net.Uri uri, C32051E6d c32051E6d) {
        boolean A1R = AbstractC167007dF.A1R(0, uri, c32051E6d);
        List<String> pathSegments = uri.getPathSegments();
        RectF rectF = c32051E6d.A01;
        if (rectF == null || pathSegments.size() < 2 || !"ar".equalsIgnoreCase(AbstractC25226BEj.A1I(pathSegments, 0))) {
            return false;
        }
        if ("reels".equalsIgnoreCase(AbstractC25226BEj.A1I(pathSegments, A1R ? 1 : 0))) {
            this.A00.A00(AbstractC166987dD.A19(uri), "link_preview", c32051E6d.A09, null);
            return A1R;
        }
        this.A01.CqU(rectF, c32051E6d.A05, AbstractC31175DnJ.A0c(pathSegments, A1R ? 1 : 0));
        return A1R;
    }

    public C36349G2b(C7Y7 c7y7, InterfaceC165397aS interfaceC165397aS) {
        AbstractC167017dG.A1P(interfaceC165397aS, c7y7);
        this.A01 = interfaceC165397aS;
        this.A00 = c7y7;
    }
}
