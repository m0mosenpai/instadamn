package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class HHK extends AbstractC60592pi implements InterfaceC53832dN, InterfaceC684236f {
    public IgImageView A00;
    public InterfaceC53832dN A01;
    public View A02;
    public View A03;
    public C58812me A04;
    public final Context A05;
    public final Fragment A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final C684336g A09;
    public final InterfaceC09390do A0A;

    public final void A01(View view, ViewGroup viewGroup, Product product) {
        ExtendedImageUrl A01;
        ViewGroup viewGroup2;
        if (!(!this.A09.A03.A0C())) {
            this.A02 = view;
            View view2 = this.A03;
            if (view2 == null) {
                view2 = LayoutInflater.from(this.A06.requireContext()).inflate(R.layout.product_thumbnail_popout_image, viewGroup, false);
                this.A00 = (IgImageView) view2.findViewById(R.id.save_popout_imageview);
                InterfaceC09390do interfaceC09390do = this.A0A;
                AbstractC13880nE.A0g(view2, AbstractC167027dH.A01(interfaceC09390do));
                AbstractC13880nE.A0W(view2, AbstractC167027dH.A01(interfaceC09390do));
            }
            this.A03 = view2;
            ViewParent parent = view2.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                viewGroup2.removeView(view2);
            }
            viewGroup.addView(view2);
            ImageInfo imageInfo = product.A07;
            if (imageInfo != null && (A01 = AbstractC40161tk.A01(this.A05, imageInfo)) != null) {
                A00(view2);
                IgImageView igImageView = this.A00;
                if (igImageView != null) {
                    igImageView.A0E = new C42355IpH(this, 1);
                    igImageView.setUrl(A01, this.A07);
                }
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A02 = null;
        this.A00 = null;
    }

    public /* synthetic */ HHK(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C684336g c684336g = new C684336g();
        C14360o3.A0B(userSession, 4);
        this.A06 = fragment;
        this.A05 = context;
        this.A07 = interfaceC11380iw;
        this.A08 = userSession;
        this.A09 = c684336g;
        this.A0A = J8X.A00(this, 32);
    }

    private final void A00(View view) {
        View view2 = this.A02;
        if (view2 != null) {
            view.setX(view2.getX() + ((view2.getWidth() - AbstractC167027dH.A01(this.A0A)) / 2.0f));
            view.setY(0.0f);
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
    }

    @Override // X.InterfaceC684236f
    public final void Cwl(boolean z, float f) {
        if (z) {
            View view = this.A03;
            if (view != null) {
                view.setScaleX(f);
            }
            View view2 = this.A03;
            if (view2 != null) {
                view2.setScaleY(f);
                return;
            }
            return;
        }
        float f2 = (f / 2.0f) + 0.5f;
        View view3 = this.A03;
        if (view3 != null) {
            view3.setScaleX(f2);
        }
        View view4 = this.A03;
        if (view4 != null) {
            view4.setScaleY(f2);
        }
        View view5 = this.A03;
        if (view5 == null) {
            return;
        }
        view5.setY(view5.getY() - ((1.0f - f) * view5.getHeight()));
    }

    @Override // X.InterfaceC53832dN
    public final void DZb(int i) {
        View view = this.A02;
        if (view != null) {
            C58812me c58812me = new C58812me(view);
            c58812me.A02();
            c58812me.A00();
            this.A04 = c58812me;
        }
        InterfaceC53832dN interfaceC53832dN = this.A01;
        if (interfaceC53832dN != null) {
            interfaceC53832dN.DZb(i);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C684336g c684336g = this.A09;
        c684336g.A03(null);
        c684336g.A04.clear();
        C58812me c58812me = this.A04;
        if (c58812me != null) {
            c58812me.A01();
        }
        View view = this.A03;
        if (view != null) {
            A00(view);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C684336g c684336g = this.A09;
        c684336g.A03(this);
        c684336g.A02(this);
        C58812me c58812me = this.A04;
        if (c58812me != null) {
            c58812me.A02();
        }
    }
}
