package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class KEK extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C05F.A00(2).length;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        L3D l3d = (L3D) obj;
        AbstractC167017dG.A1N(anonymousClass306, l3d);
        anonymousClass306.A7a(l3d.A03.intValue());
    }

    public KEK(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        L3D l3d;
        ViewGroup viewGroup;
        int A03 = C0f9.A03(-910713603);
        int A04 = JQ0.A04(AbstractC167007dF.A06(1, view, obj), i);
        if (A04 != 0) {
            if (A04 == 1) {
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTextWithChevronViewBinder.Holder");
                C44601Jp7 c44601Jp7 = (C44601Jp7) tag;
                l3d = (L3D) obj;
                C14360o3.A0B(c44601Jp7, 0);
                C14360o3.A0B(l3d, 1);
                viewGroup = c44601Jp7.A00;
            } else {
                B4Z A00 = B4Z.A00();
                C0f9.A0A(1981164836, A03);
                throw A00;
            }
        } else {
            Object tag2 = view.getTag();
            C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteAdPreviewViewBinder.Holder");
            Jp6 jp6 = (Jp6) tag2;
            l3d = (L3D) obj;
            C14360o3.A0B(jp6, 0);
            C14360o3.A0B(l3d, 1);
            viewGroup = jp6.A00;
            IgImageView A0a = AbstractC31172DnG.A0a(viewGroup, R.id.image_thumbnail);
            if (A0a != null) {
                A0a.setVisibility(0);
                ImageUrl imageUrl = l3d.A02;
                if (imageUrl != null) {
                    A0a.setUrl(imageUrl, l3d.A01);
                }
            }
        }
        TextView A0e = AbstractC166987dD.A0e(viewGroup, R.id.primary_text);
        if (A0e != null) {
            A0e.setVisibility(8);
            String str = l3d.A04;
            if (str != null) {
                A0e.setText(str);
                A0e.setVisibility(0);
            }
        }
        View findViewById = viewGroup.findViewById(R.id.secondary_text);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        C0fQ.A00(l3d.A00, viewGroup);
        C0f9.A0A(-1510669950, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        Object jp6;
        int A03 = C0f9.A03(-1618884395);
        C14360o3.A0B(viewGroup, 1);
        int A04 = JQ0.A04(2, i);
        if (A04 != 0) {
            if (A04 == 1) {
                viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.boost_text_with_chevron_row, false);
                jp6 = new C44601Jp7(viewGroup2);
            } else {
                B4Z A00 = B4Z.A00();
                C0f9.A0A(-1732583883, A03);
                throw A00;
            }
        } else {
            viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.boost_ad_preview_row, false);
            jp6 = new Jp6(viewGroup2);
        }
        viewGroup2.setTag(jp6);
        C0f9.A0A(1140060582, A03);
        return viewGroup2;
    }
}
