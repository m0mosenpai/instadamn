package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.EQt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32441EQt extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32441EQt(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1716059973);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.menu.threadrowitem.ThreadRowItemViewBinder.Holder");
        C31930E1k c31930E1k = (C31930E1k) tag;
        FND fnd = (FND) obj;
        AbstractC167007dF.A1K(c31930E1k, fnd);
        IgdsPeopleCell igdsPeopleCell = c31930E1k.A00;
        igdsPeopleCell.A01();
        ImageUrl imageUrl = fnd.A01;
        if (imageUrl != null) {
            igdsPeopleCell.A04(imageUrl, null);
        }
        Context context = igdsPeopleCell.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = igdsPeopleCell.A0A;
        gradientSpinnerAvatarView.A0B(dimensionPixelSize, 0);
        gradientSpinnerAvatarView.A05();
        View.OnClickListener onClickListener = fnd.A00;
        if (onClickListener != null) {
            C0fQ.A00(onClickListener, igdsPeopleCell);
        }
        if (fnd.A04) {
            igdsPeopleCell.A05(new EZM(context, onClickListener, C05F.A0C, C05F.A01, AbstractC53242c7.A0B(context)), null);
        }
        igdsPeopleCell.A08(fnd.A03, false);
        String str = fnd.A02;
        if (str != null) {
            igdsPeopleCell.A07(str);
        }
        TextView textView = igdsPeopleCell.A06;
        AbstractC31177DnL.A0x(textView, textView.getPaddingLeft(), context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin));
        C0f9.A0A(1227916678, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 854768542);
        Context context = this.A00;
        C14360o3.A0B(context, 0);
        IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(context, null, 0, false);
        C31930E1k c31930E1k = new C31930E1k(igdsPeopleCell);
        Drawable drawable = context.getDrawable(R.drawable.facebook_user_badge_15);
        if (drawable != null) {
            c31930E1k.A00.A0A.setBottomBadgeDrawable(drawable);
        }
        IgdsPeopleCell igdsPeopleCell2 = c31930E1k.A00;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = igdsPeopleCell2.A0A;
        gradientSpinnerAvatarView.A00 = context.getResources().getDimension(R.dimen.abc_control_corner_material);
        gradientSpinnerAvatarView.A01 = AbstractC31173DnH.A00(context, R.dimen.abc_control_corner_material);
        igdsPeopleCell.setTag(c31930E1k);
        C0f9.A0A(-1608824966, A0G);
        return igdsPeopleCell2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
