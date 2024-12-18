package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GpP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38096GpP extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final C37835Gkp A01;
    public final JPS A02;
    public final InterfaceC43406JFw A03;
    public final boolean A04;
    public final AbstractC42425IqS A05;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C38490GwB(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_grid_item_transition_images, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        HKW hkw = (HKW) interfaceC66482zP;
        C38490GwB c38490GwB = (C38490GwB) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, hkw, c38490GwB);
        C127915qK c127915qK = hkw.A02;
        C5qT BAM = this.A02.BAM(hkw);
        InterfaceC43406JFw interfaceC43406JFw = this.A03;
        View view = c38490GwB.A00;
        interfaceC43406JFw.EE0(view, BAM, c127915qK, hkw, false);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        Context A0L = AbstractC166997dE.A0L(view);
        C132795z2 c132795z2 = hkw.A01;
        C37835Gkp c37835Gkp = this.A01;
        boolean z = this.A04;
        AbstractC167007dF.A1G(interfaceC11380iw, A1R ? 1 : 0, c37835Gkp);
        TransitionCarouselImageView transitionCarouselImageView = c38490GwB.A05;
        List list = c132795z2.A03;
        C14360o3.A07(list);
        transitionCarouselImageView.setSource(interfaceC11380iw.getModuleName());
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExtendedImageUrl A1q = AbstractC31172DnG.A0i(it).A1q(A0L);
            if (A1q != null) {
                A1E.add(A1q);
            }
        }
        transitionCarouselImageView.A04(A1E, z);
        c37835Gkp.A00.add(AbstractC25225BEi.A16(null));
        String str = c132795z2.A01;
        if (str == null) {
            str = c132795z2.A00.A0A;
        }
        TextView textView = c38490GwB.A04;
        textView.setText(str);
        if (c132795z2.A04) {
            ImageView imageView = c38490GwB.A02;
            imageView.setImageResource(R.drawable.instagram_shopping_bag_pano_filled_24);
            AbstractC31173DnH.A11(A0L, imageView, R.color.design_dark_default_color_on_background);
        }
        View view2 = c38490GwB.A01;
        ImageView imageView2 = c38490GwB.A03;
        ImageView imageView3 = c38490GwB.A02;
        C14360o3.A0B(imageView2, 2);
        view2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC23281ATq(view2, view, imageView3, imageView2, textView, str));
        ViewOnClickListenerC42029Ijy.A00(view, BAM, hkw, this, 9);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKW.class;
    }

    public C38096GpP(InterfaceC11380iw interfaceC11380iw, C37835Gkp c37835Gkp, AbstractC42425IqS abstractC42425IqS, JPS jps, InterfaceC43406JFw interfaceC43406JFw, boolean z) {
        this.A00 = interfaceC11380iw;
        this.A05 = abstractC42425IqS;
        this.A03 = interfaceC43406JFw;
        this.A01 = c37835Gkp;
        this.A02 = jps;
        this.A04 = z;
    }
}
