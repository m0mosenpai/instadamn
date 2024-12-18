package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HCP extends AbstractC59962oe implements InterfaceC60442pS, AnonymousClass652, InterfaceC60122ou, JGX {
    public static final String __redex_internal_original_name = "FeaturedProductCarouselPickerFragment";
    public ReboundHorizontalScrollView A00;
    public C38321qM A01;
    public C38321qM A02;
    public TextView A04;
    public String A05;
    public final InterfaceC09390do A07 = C43209J8g.A01(this, 28);
    public EnumC39541HdD A03 = EnumC39541HdD.A02;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.AnonymousClass652
    public final void D38(MotionEvent motionEvent, View view) {
    }

    @Override // X.AnonymousClass652
    public final void Dio(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
    }

    @Override // X.AnonymousClass652
    public final void Dj2(EnumC131525wo enumC131525wo, EnumC131525wo enumC131525wo2, ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    @Override // X.AnonymousClass652
    public final void Du6(ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    @Override // X.AnonymousClass652
    public final void DuG(ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131962368);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_featured_product_carousel_picker";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (ReboundHorizontalScrollView) view.findViewById(R.id.media_scroll_view);
        this.A04 = AbstractC166987dD.A0e(view, R.id.caption);
        ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00;
        if (reboundHorizontalScrollView == null) {
            C14360o3.A0F("mediaScrollView");
            throw C00O.createAndThrow();
        }
        reboundHorizontalScrollView.A0A(this);
        A02(this);
    }

    private final void A00() {
        InterfaceC09390do interfaceC09390do = this.A07;
        ((INQ) interfaceC09390do.getValue()).A03("scroll");
        this.A03 = EnumC39541HdD.A02;
        C38321qM c38321qM = this.A01;
        if (c38321qM != null) {
            ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00;
            if (reboundHorizontalScrollView == null) {
                C14360o3.A0F("mediaScrollView");
                throw C00O.createAndThrow();
            }
            Integer A0c = AbstractC37301Gc2.A0c(AbstractC166987dD.A0r(this.A06), c38321qM);
            I63.A00(reboundHorizontalScrollView, (INQ) interfaceC09390do.getValue(), this.A03, A0c, null);
        }
        this.A01 = null;
    }

    private final void A01(int i) {
        C38321qM c38321qM;
        C38321qM c38321qM2 = this.A02;
        if (c38321qM2 != null) {
            C38321qM A1e = c38321qM2.A1e(i);
            C14360o3.A0A(A1e);
            if (A1e.Cff()) {
                Integer num = null;
                if (!C14360o3.A0K(this.A01, A1e) && (c38321qM = this.A01) != null) {
                    num = AbstractC37301Gc2.A0c(AbstractC166987dD.A0r(this.A06), c38321qM);
                }
                this.A01 = A1e;
                this.A03 = EnumC39541HdD.A04;
                InterfaceC09390do interfaceC09390do = this.A07;
                ((INQ) interfaceC09390do.getValue()).A03("scroll");
                ((INQ) interfaceC09390do.getValue()).A00(A1e);
                ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00;
                if (reboundHorizontalScrollView == null) {
                    C14360o3.A0F("mediaScrollView");
                    throw C00O.createAndThrow();
                }
                C38321qM c38321qM3 = this.A01;
                C14360o3.A0A(c38321qM3);
                I63.A00(reboundHorizontalScrollView, (INQ) interfaceC09390do.getValue(), this.A03, num, AbstractC37301Gc2.A0c(AbstractC166987dD.A0r(this.A06), c38321qM3));
                return;
            }
            A00();
        }
    }

    public static final void A02(HCP hcp) {
        int i;
        C38321qM c38321qM = hcp.A02;
        if (c38321qM != null) {
            ReboundHorizontalScrollView reboundHorizontalScrollView = hcp.A00;
            if (reboundHorizontalScrollView != null) {
                C14360o3.A0A(c38321qM);
                UserSession A0r = AbstractC166987dD.A0r(hcp.A06);
                boolean A1V = AbstractC167007dF.A1V(A0r);
                Context context = reboundHorizontalScrollView.getContext();
                C14360o3.A0A(context);
                int A0A = AbstractC13880nE.A0A(context);
                reboundHorizontalScrollView.A0A = A1V;
                float A0m = c38321qM.A0m();
                int i2 = (int) (A0A * 0.8f);
                float f = i2;
                if (A0m < 1.0f) {
                    i = (int) (f * A0m);
                } else {
                    i = i2;
                    i2 = (int) (f / A0m);
                }
                reboundHorizontalScrollView.removeAllViews();
                int A0p = c38321qM.A0p();
                for (int i3 = 0; i3 < A0p; i3++) {
                    C38321qM A1e = c38321qM.A1e(i3);
                    if (A1e != null) {
                        View A0A2 = AbstractC31176DnK.A0A(LayoutInflater.from(context), reboundHorizontalScrollView, R.layout.carousel_picker_item_media_view);
                        IFC ifc = new IFC(A0A2);
                        A0A2.setTag(ifc);
                        reboundHorizontalScrollView.addView(A0A2);
                        MediaFrameLayout mediaFrameLayout = ifc.A01;
                        AbstractC13880nE.A0h(mediaFrameLayout, i, i2);
                        mediaFrameLayout.A00 = A1e.A0m();
                        AbstractC80683ix.A00(hcp, new C80113i0(A0r).A00(context, A1e), ifc.A00);
                        if (i3 == 0) {
                            AbstractC13880nE.A0e(A0A2, context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material));
                        }
                        AbstractC13880nE.A0V(A0A2, AbstractC167017dG.A06(context));
                    }
                }
                ReboundHorizontalScrollView reboundHorizontalScrollView2 = hcp.A00;
                if (reboundHorizontalScrollView2 != null) {
                    hcp.A01(reboundHorizontalScrollView2.getCurrentChildIndex());
                    return;
                }
            }
            C14360o3.A0F("mediaScrollView");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AnonymousClass652
    public final void DsC(View view, int i) {
        ArrayList arrayList;
        List C3r;
        A00();
        ((INQ) this.A07.getValue()).A03("tapped");
        C38321qM c38321qM = this.A02;
        C14360o3.A0A(c38321qM);
        C38321qM A1e = c38321qM.A1e(i);
        C14360o3.A0A(A1e);
        this.A05 = A1e.getId();
        C1XJ c1xj = C1XJ.A00;
        UserSession A0r = AbstractC166987dD.A0r(this.A06);
        Integer num = C05F.A0j;
        EnumC39584Hdu enumC39584Hdu = EnumC39584Hdu.A05;
        C38321qM c38321qM2 = this.A02;
        C14360o3.A0A(c38321qM2);
        JLW B5Q = c38321qM2.A0C.B5Q();
        if (B5Q != null && (C3r = B5Q.C3r()) != null) {
            arrayList = AbstractC167017dG.A0q(C3r);
            Iterator it = C3r.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(AbstractC166987dD.A0N(it.next())));
            }
        } else {
            arrayList = null;
        }
        c1xj.A0l(this, A0r, new ProductPickerArguments(enumC39584Hdu, num, "instagram_shopping_featured_product_carousel_picker", null, null, null, null, null, null, arrayList, false, false, true, true));
    }

    @Override // X.JGX
    public final void E04(C38321qM c38321qM, C105824pt c105824pt) {
        this.A03 = EnumC39541HdD.A03;
        C38321qM c38321qM2 = this.A01;
        if (c38321qM2 != null) {
            ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00;
            if (reboundHorizontalScrollView == null) {
                C14360o3.A0F("mediaScrollView");
                throw C00O.createAndThrow();
            }
            Integer A0c = AbstractC37301Gc2.A0c(AbstractC166987dD.A0r(this.A06), c38321qM2);
            I63.A00(reboundHorizontalScrollView, (INQ) this.A07.getValue(), this.A03, null, A0c);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1 && i == 3) {
            Parcelable parcelableExtra = intent.getParcelableExtra("selected_product");
            if (parcelableExtra != null && this.A05 != null) {
                Intent intent2 = new Intent();
                intent2.putExtra("selected_product", parcelableExtra);
                intent2.putExtra("media_id", this.A05);
                requireActivity().setResult(-1, intent2);
            }
            AbstractC25227BEk.A1B(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2101166086);
        super.onCreate(bundle);
        String A01 = AbstractC153636vY.A01(requireArguments(), "media_id");
        InterfaceC09390do interfaceC09390do = this.A06;
        C38321qM A0F = AbstractC37304Gc5.A0F(A01, interfaceC09390do);
        this.A02 = A0F;
        if (A0F == null) {
            C1ON A04 = AbstractC2044893h.A04(AbstractC166987dD.A0r(interfaceC09390do), A01);
            C39030HGg.A00(A04, this, 25);
            schedule(A04);
        }
        C0f9.A09(-1193410012, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(36255109);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_featured_product_carousel_picker, false);
        C0f9.A09(1622285913, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-2102693147);
        super.onPause();
        A00();
        ((INQ) this.A07.getValue()).A02("fragment_paused");
        C0f9.A09(1159285414, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1057819033);
        super.onResume();
        ReboundHorizontalScrollView reboundHorizontalScrollView = this.A00;
        if (reboundHorizontalScrollView == null) {
            C14360o3.A0F("mediaScrollView");
            throw C00O.createAndThrow();
        }
        A01(reboundHorizontalScrollView.getCurrentChildIndex());
        C0f9.A09(-954483389, A02);
    }

    @Override // X.AnonymousClass652
    public final void DLs(ReboundHorizontalScrollView reboundHorizontalScrollView, int i, int i2) {
        A01(i);
    }
}
