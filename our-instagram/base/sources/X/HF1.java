package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;

/* loaded from: classes7.dex */
public final class HF1 extends AbstractC65632xz {
    public final UserSession A00;
    public final InterfaceC60442pS A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1697701446);
        AbstractC167027dH.A13(view, obj, obj2);
        C41129IIu c41129IIu = (C41129IIu) obj2;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.featuredproducts.mediafeed.MediaGridCellWithFeaturedProductOverlayBinderGroup.Holder");
        IFD ifd = (IFD) tag;
        UserSession userSession = this.A00;
        IgMultiImageButton igMultiImageButton = ifd.A01;
        int i2 = c41129IIu.A02;
        int i3 = c41129IIu.A03;
        int i4 = c41129IIu.A01;
        int i5 = c41129IIu.A00;
        AbstractC153416vB.A02(this.A01, userSession, (C38321qM) obj, null, null, null, igMultiImageButton, null, null, -1.0f, i2, i3, i4, i5, false, false, false);
        AbstractC153416vB.A01(AbstractC166997dE.A0L(view), igMultiImageButton, c41129IIu.A04);
        AbstractC13880nE.A0V(ifd.A00, AbstractC31177DnL.A0G(igMultiImageButton).getMarginEnd());
        C0f9.A0A(2005471338, A03);
    }

    public HF1(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1717618962);
        View inflate = AbstractC31177DnL.A0E(viewGroup, 1).inflate(R.layout.media_grid_cell_with_overlay, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(1));
        FrameLayout frameLayout = (FrameLayout) inflate;
        IgMultiImageButton A00 = AbstractC153416vB.A00(AbstractC166997dE.A0L(frameLayout));
        frameLayout.addView(A00, 0);
        frameLayout.setTag(new IFD(frameLayout, A00));
        C0f9.A0A(-1726397440, A03);
        return frameLayout;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
