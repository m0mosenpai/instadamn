package X;

import android.view.View;
import com.instagram.api.schemas.ProductTileBannerMetadataDecoration;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.Iov, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42333Iov implements InterfaceC66482zP {
    public final UPZ A00;
    public final C69450VnZ A01;
    public final String A02;

    public C42333Iov(View.OnLongClickListener onLongClickListener, ProductTileBannerMetadataDecoration productTileBannerMetadataDecoration, InterfaceC11380iw interfaceC11380iw, C69749Vuj c69749Vuj, C5QE c5qe, ImageUrl imageUrl, ImageInfo imageInfo, C41219IMi c41219IMi, EnumC39541HdD enumC39541HdD, Integer num, Integer num2, String str, String str2, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, InterfaceC16660sJ interfaceC16660sJ5, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16620sF interfaceC16620sF3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        AbstractC167017dG.A1Q(str, c5qe);
        C14360o3.A0B(list, 18);
        UPZ upz = new UPZ(productTileBannerMetadataDecoration, interfaceC11380iw, c69749Vuj, c5qe, imageUrl, imageInfo, enumC39541HdD, num, num2, str2, list, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12);
        C69450VnZ c69450VnZ = new C69450VnZ(onLongClickListener, interfaceC11380iw, c41219IMi, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16660sJ4, interfaceC16660sJ5, interfaceC16620sF, interfaceC16620sF2, interfaceC16620sF3);
        this.A02 = str;
        this.A00 = upz;
        this.A01 = c69450VnZ;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C42333Iov) {
            C42333Iov c42333Iov = (C42333Iov) obj;
            if (C14360o3.A0K(this.A02, c42333Iov.A02) && C14360o3.A0K(this.A00, c42333Iov.A00)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        UPZ upz;
        C42333Iov c42333Iov = (C42333Iov) obj;
        UPZ upz2 = this.A00;
        if (c42333Iov != null) {
            upz = c42333Iov.A00;
        } else {
            upz = null;
        }
        return C14360o3.A0K(upz2, upz);
    }
}
