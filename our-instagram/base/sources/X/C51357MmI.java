package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.MmI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51357MmI extends C3OO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Activity A05;
    public final ViewGroup A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final IgImageView A0A;
    public final C57012jc A0B;
    public final C56247Oxu A0C;

    public C51357MmI(Activity activity, View view, C56247Oxu c56247Oxu) {
        super(view);
        this.A05 = activity;
        Resources resources = activity.getResources();
        this.A06 = AbstractC31173DnH.A0F(view, R.id.row_search_user_container);
        this.A09 = AbstractC166997dE.A0T(view, R.id.row_search_user_username);
        this.A08 = AbstractC166997dE.A0T(view, R.id.row_search_user_fullname);
        this.A07 = AbstractC166997dE.A0T(view, R.id.row_search_user_secondary_subtitle);
        this.A0A = AbstractC31172DnG.A0Z(view, R.id.row_search_user_imageview);
        this.A0B = AbstractC31177DnL.A0V(view, R.id.overflow_button_stub);
        this.A04 = AbstractC166997dE.A01(activity);
        this.A02 = AbstractC167007dF.A09(activity, R.attr.avatarInnerStroke);
        this.A00 = activity.getColor(AbstractC53242c7.A04(activity));
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A03 = resources.getDimensionPixelSize(R.dimen.circular_avatar_stroke_width);
        this.A0C = c56247Oxu;
    }
}
