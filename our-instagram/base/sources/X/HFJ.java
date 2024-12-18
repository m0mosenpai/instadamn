package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class HFJ extends AbstractC65632xz {
    public final UserSession A00;
    public final C38321qM A01;
    public final InterfaceC60442pS A02;
    public final ProductCollectionFragment A03;
    public final HH9 A04;
    public final boolean A05;
    public final Context A06;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 6;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        ProductCollectionHeader productCollectionHeader = (ProductCollectionHeader) obj;
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, productCollectionHeader);
        ProductCollectionCoverImpl productCollectionCoverImpl = productCollectionHeader.A00;
        C38321qM c38321qM = this.A01;
        C26080Bg9 c26080Bg9 = new C26080Bg9(c38321qM, productCollectionCoverImpl, productCollectionHeader.A04, productCollectionHeader.A03, productCollectionHeader.A05, this.A05);
        IK8 ik8 = new IK8(new C43205J8c(this, 37), new JEZ(this, 36), new JEZ(this, 37), new JEZ(this, 38), new JEZ(this, 39), new JEZ(this, 40), new C30482DbR(this, 11));
        InterfaceC60442pS interfaceC60442pS = this.A02;
        anonymousClass306.A7b(A1R ? 1 : 0, new C42334Iow(c26080Bg9, interfaceC60442pS, ik8), null);
        ProductCollectionCoverImpl productCollectionCoverImpl2 = productCollectionHeader.A00;
        if (productCollectionCoverImpl2.A01 != null && c38321qM != null) {
            anonymousClass306.A7b(2, new II8(this.A00, c38321qM, interfaceC60442pS, productCollectionCoverImpl2), null);
        }
        String str = productCollectionHeader.A02;
        if (str != null && str.length() != 0) {
            C85383rT c85383rT = new C85383rT(AbstractC25225BEi.A0H(AbstractC25228BEl.A1A(str)), this.A00);
            c85383rT.A03(new C42668IuP(this, 1));
            c85383rT.A02(new C42667IuO(this, 0));
            anonymousClass306.A7b(3, new C42295IoJ(new BQO(c85383rT.A00()), this.A04), null);
        }
    }

    public HFJ(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, ProductCollectionFragment productCollectionFragment, HH9 hh9, boolean z) {
        this.A06 = context;
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
        this.A05 = z;
        this.A01 = c38321qM;
        this.A03 = productCollectionFragment;
        this.A04 = hh9;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        CharSequence charSequence;
        ProductImageContainer BGV;
        ImageInfo A1t;
        C37416Gdw c37416Gdw;
        int A03 = C0f9.A03(-939872722);
        int A06 = AbstractC167007dF.A06(1, view, obj);
        if (i != 0) {
            if (i != 1) {
                if (i != A06) {
                    if (i == 3) {
                        Object tag = view.getTag();
                        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionDescriptionViewBinder.ViewHolder");
                        C38458Gvf c38458Gvf = (C38458Gvf) tag;
                        C42295IoJ c42295IoJ = (C42295IoJ) obj;
                        AbstractC25230BEn.A15(1, c38458Gvf, c42295IoJ);
                        CharSequence A00 = BHX.A00(c38458Gvf.A00, c42295IoJ.A00);
                        if (A00 == null) {
                            A00 = "";
                        }
                        TextView textView = c38458Gvf.A01;
                        int i2 = 8;
                        if (AbstractC25225BEi.A1Y(A00)) {
                            i2 = 0;
                        }
                        textView.setVisibility(i2);
                        textView.setText(A00);
                        TextView textView2 = c38458Gvf.A02;
                        textView2.setVisibility(8);
                        textView2.setText((CharSequence) null);
                    } else {
                        IllegalStateException A0U = AbstractC31175DnJ.A0U("Unsupported view type: ", i);
                        C0f9.A0A(453633630, A03);
                        throw A0U;
                    }
                } else {
                    Object tag2 = view.getTag();
                    C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionCoverShowreelViewBinder.ViewHolder");
                    IFB ifb = (IFB) tag2;
                    II8 ii8 = (II8) obj;
                    boolean A1T = AbstractC31175DnJ.A1T(1, ifb, ii8);
                    IDV idv = ifb.A01;
                    UserSession userSession = ii8.A00;
                    C38321qM c38321qM = ii8.A01;
                    C139366Sr c139366Sr = new C139366Sr(AbstractC41071vF.A07(userSession, c38321qM), c38321qM.A33());
                    IgShowreelNativeAnimationIntf Bx7 = ii8.A03.Bx7();
                    if (Bx7 != null) {
                        c37416Gdw = AbstractC37415Gdv.A00(Bx7);
                    } else {
                        c37416Gdw = null;
                    }
                    InterfaceC60442pS interfaceC60442pS = ii8.A02;
                    C14360o3.A0B(idv, A1T ? 1 : 0);
                    if (c37416Gdw != null) {
                        ShowreelNativeMediaView showreelNativeMediaView = (ShowreelNativeMediaView) idv.A00.getView();
                        showreelNativeMediaView.setVisibility(A1T ? 1 : 0);
                        showreelNativeMediaView.A06(c139366Sr, c37416Gdw, userSession, interfaceC60442pS.getModuleName(), A1T);
                    }
                    idv.A00.getView().setMinimumHeight(AbstractC13880nE.A0A(ifb.A00));
                }
            } else {
                Object tag3 = view.getTag();
                C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionCoverContentTileViewBinder.ViewHolder");
                C38504GwP c38504GwP = (C38504GwP) tag3;
                C42334Iow c42334Iow = (C42334Iow) obj;
                boolean A1T2 = AbstractC31175DnJ.A1T(1, c38504GwP, c42334Iow);
                IgImageView igImageView = c38504GwP.A05;
                if (!igImageView.A0G()) {
                    C26080Bg9 c26080Bg9 = c42334Iow.A00;
                    C38321qM c38321qM2 = (C38321qM) c26080Bg9.A02;
                    if (c38321qM2 != null && (A1t = c38321qM2.A1t()) != null) {
                        BGV = new ProductImageContainerImpl(A1t.F5B(), null);
                    } else {
                        BGV = ((ProductCollectionCover) c26080Bg9.A01).BGV();
                    }
                    I98.A00(igImageView, c42334Iow.A01, BGV, Integer.valueOf(AbstractC13880nE.A0A(c38504GwP.A00)), A1T2);
                }
                igImageView.setVisibility(A1T2 ? 1 : 0);
                IK8 ik8 = c42334Iow.A02;
                ik8.A01.invoke(igImageView);
                C26080Bg9 c26080Bg92 = c42334Iow.A00;
                C38321qM c38321qM3 = (C38321qM) c26080Bg92.A02;
                if (c38321qM3 != null && c38321qM3.Cff()) {
                    igImageView.setVisibility(8);
                    MediaFrameLayout mediaFrameLayout = c38504GwP.A08;
                    mediaFrameLayout.setVisibility(A1T2 ? 1 : 0);
                    ik8.A06.invoke(mediaFrameLayout, c38321qM3);
                } else {
                    igImageView.setVisibility(A1T2 ? 1 : 0);
                    c38504GwP.A08.setVisibility(8);
                }
                c38504GwP.A04.setText((CharSequence) c26080Bg92.A05);
                ik8.A05.invoke(igImageView);
                TextView textView3 = c38504GwP.A03;
                CharSequence charSequence2 = (CharSequence) c26080Bg92.A04;
                int i3 = 0;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    i3 = 8;
                }
                textView3.setVisibility(i3);
                textView3.setText(charSequence2);
                ik8.A04.invoke(igImageView);
                TextView textView4 = c38504GwP.A02;
                List list = (List) c26080Bg92.A03;
                User user = (User) AbstractC001800i.A0O(list, A1T2 ? 1 : 0);
                if (user != null) {
                    charSequence = user.getUsername();
                } else {
                    charSequence = null;
                }
                textView4.setText(charSequence);
                I62.A00(c38504GwP.A06, c42334Iow, (User) AbstractC001800i.A0O(list, A1T2 ? 1 : 0));
                I62.A00(c38504GwP.A07, c42334Iow, (User) AbstractC001800i.A0O(list, 1));
                User user2 = (User) AbstractC001800i.A0O(list, A1T2 ? 1 : 0);
                if (user2 != null) {
                    textView4.setText(AbstractC37300Gc1.A0U(user2));
                    ViewOnClickListenerC42034Ik3.A00(textView4, 65, user2, c42334Iow);
                }
                ImageView imageView = c38504GwP.A01;
                if (c26080Bg92.A06) {
                    imageView.setVisibility(A1T2 ? 1 : 0);
                    ViewOnClickListenerC42033Ik2.A00(imageView, 21, c42334Iow);
                } else {
                    imageView.setVisibility(8);
                }
            }
            C0f9.A0A(1638840438, A03);
            return;
        }
        Object tag4 = view.getTag();
        C14360o3.A0C(tag4, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionCoverImageViewBinder.ViewHolder");
        AbstractC25230BEn.A15(1, tag4, null);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A0C;
        Object c41142IJh;
        int A03 = C0f9.A03(-1690830919);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        A0C = AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.product_collection_description, false);
                        c41142IJh = new C38458Gvf(A0C);
                    } else {
                        IllegalStateException A0U = AbstractC31175DnJ.A0U("Unsupported view type: ", i);
                        C0f9.A0A(1937847957, A03);
                        throw A0U;
                    }
                } else {
                    A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.product_collection_cover_showreel, false);
                    c41142IJh = new IFB(A0C);
                }
            } else {
                A0C = AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.product_collection_cover_content_tile, false);
                c41142IJh = new C38504GwP(A0C);
            }
        } else {
            A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.product_collection_cover_image, false);
            c41142IJh = new C41142IJh(A0C);
        }
        A0C.setTag(c41142IJh);
        C0f9.A0A(706981171, A03);
        return A0C;
    }
}
