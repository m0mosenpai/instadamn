package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jrj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44762Jrj extends C3OO {
    public final TextView A00;
    public final IgLinearLayout A01;
    public final IgImageView A02;
    public final IgImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44762Jrj(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC167007dF.A0N(view, R.id.twinbox_filter_text);
        this.A02 = AbstractC167007dF.A0T(view, R.id.twinbox_left_icon);
        this.A03 = AbstractC167007dF.A0T(view, R.id.twinbox_right_icon);
        this.A01 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.twinbox_right_icon_tappable_area);
    }

    public static final C199928sw A00(View view, Integer num, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        Drawable drawable;
        Context context = view.getContext();
        String A0p = AbstractC166997dE.A0p(C02G.A01(context), i);
        if (num != null) {
            drawable = context.getDrawable(num.intValue());
        } else {
            drawable = null;
        }
        return new C199928sw(null, drawable, null, new C49479Lts(interfaceC16820sZ, 1), null, A0p, 0, 0, 0, false, false, z, true, false, false, false);
    }
}
