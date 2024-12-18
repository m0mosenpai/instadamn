package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes8.dex */
public final class KEJ extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public KEJ(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 1915311312);
        C14360o3.A0B(obj, 2);
        Context context = this.A00;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.adtools.binder.DrawableSingleTextArrowViewBinder.Holder");
        C47605L0q c47605L0q = (C47605L0q) tag;
        C47524Kyr c47524Kyr = (C47524Kyr) obj;
        AbstractC167017dG.A1N(context, c47605L0q);
        C14360o3.A0B(c47524Kyr, 2);
        c47605L0q.A01.setText(c47524Kyr.A01);
        RoundedCornerImageView roundedCornerImageView = c47605L0q.A02;
        AbstractC166997dE.A19(context, roundedCornerImageView, R.drawable.instagram_add_pano_outline_24);
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        C0fQ.A00(c47524Kyr.A00, c47605L0q.A00);
        C0f9.A0A(887348857, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1853230325);
        View A07 = AbstractC31175DnJ.A07(LayoutInflater.from(this.A00), viewGroup, R.layout.image_single_text_arrow_view, false);
        A07.setTag(new C47605L0q(A07, AbstractC167007dF.A0N(A07, R.id.row_section_title), (RoundedCornerImageView) AbstractC166997dE.A0R(A07, R.id.row_section_thumbnail)));
        C0f9.A0A(-1768419047, A0G);
        return A07;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
