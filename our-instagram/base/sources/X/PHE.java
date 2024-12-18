package X;

import com.instagram.model.shopping.video.ShoppingCreationConfig;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;

/* loaded from: classes9.dex */
public final class PHE implements InterfaceC58083Pp8 {
    public final /* synthetic */ C56363P0y A00;

    public PHE(C56363P0y c56363P0y) {
        this.A00 = c56363P0y;
    }

    @Override // X.InterfaceC58083Pp8
    public final void D3O(MediaSuggestedProductTag mediaSuggestedProductTag, int i) {
        ShoppingCreationConfig shoppingCreationConfig;
        C56363P0y c56363P0y = this.A00;
        InterfaceC58310Pt2 interfaceC58310Pt2 = c56363P0y.A02;
        AbstractC59962oe abstractC59962oe = c56363P0y.A01;
        C52094N2u c52094N2u = c56363P0y.A05.A00;
        if (c52094N2u != null) {
            shoppingCreationConfig = c52094N2u.A01;
        } else {
            shoppingCreationConfig = null;
        }
        interfaceC58310Pt2.Dqg(abstractC59962oe, shoppingCreationConfig, mediaSuggestedProductTag, i);
    }

    @Override // X.InterfaceC58083Pp8
    public final void Dlv(boolean z, int i) {
        this.A00.A02.Dqh(z, i);
    }
}
