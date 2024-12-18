package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.V2v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67931V2v extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C67931V2v(Context context, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 2023900255);
        C14360o3.A0B(obj, 2);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.adtools.binder.ImageTextArrowViewBinder.Holder");
        C69288Vkw c69288Vkw = (C69288Vkw) tag;
        C69340Vlm c69340Vlm = (C69340Vlm) obj;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Context context = this.A00;
        AbstractC167007dF.A1K(c69288Vkw, c69340Vlm);
        C14360o3.A0B(interfaceC11380iw, 2);
        c69288Vkw.A03.setText(c69340Vlm.A05);
        String str = c69340Vlm.A04;
        TextView textView = c69288Vkw.A02;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        ImageUrl imageUrl = c69340Vlm.A01;
        View view2 = c69288Vkw.A00;
        View A0S = AbstractC166997dE.A0S(view2, R.id.double_image_view);
        if (imageUrl != null) {
            ImageUrl imageUrl2 = c69340Vlm.A02;
            if (imageUrl2 != null) {
                ((IgImageView) view2.requireViewById(R.id.front_thumbnail)).setUrl(imageUrl2, interfaceC11380iw);
            }
            ((IgImageView) view2.requireViewById(R.id.back_thumbnail)).setUrl(imageUrl, interfaceC11380iw);
            A0S.setVisibility(0);
            c69288Vkw.A04.setVisibility(8);
        } else {
            A0S.setVisibility(8);
            ImageUrl imageUrl3 = c69340Vlm.A02;
            if (imageUrl3 != null) {
                c69288Vkw.A04.setUrl(imageUrl3, interfaceC11380iw);
            }
        }
        Integer num = c69340Vlm.A03;
        if (num != null && context != null) {
            RoundedCornerImageView roundedCornerImageView = c69288Vkw.A04;
            roundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER);
            AbstractC166997dE.A19(context, roundedCornerImageView, num.intValue());
        }
        C0fQ.A00(c69340Vlm.A00, c69288Vkw.A01);
        C0f9.A0A(551197128, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1984161568);
        View A07 = AbstractC31175DnJ.A07(LayoutInflater.from(this.A00), viewGroup, R.layout.image_text_arrow_view, false);
        TextView A0H = AbstractC65702TsY.A0H(A07, R.id.row_section_title);
        TextView A0H2 = AbstractC65702TsY.A0H(A07, R.id.row_section_subtitle);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0S(A07, R.id.row_section_thumbnail);
        View A0U = AbstractC167017dG.A0U(A07, R.id.double_thumbnail_view_stub);
        C14360o3.A0A(A0U);
        A07.setTag(new C69288Vkw(A07, A0U, A0H, A0H2, roundedCornerImageView));
        C0f9.A0A(274041976, A0G);
        return A07;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
