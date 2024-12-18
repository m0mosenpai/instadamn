package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.OFc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54725OFc {
    public final Context A00;
    public final View A01;
    public final EnumC53368NjJ A02;
    public final UserSession A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C54725OFc(Context context, View view, EnumC53368NjJ enumC53368NjJ, UserSession userSession, String str, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1P(view, userSession);
        C14360o3.A0B(str, 5);
        this.A01 = view;
        this.A03 = userSession;
        this.A00 = context;
        this.A0A = z;
        this.A08 = str;
        this.A09 = z2;
        this.A02 = enumC53368NjJ;
        this.A0B = z3;
        this.A07 = AbstractC25231BEo.A0d(view, R.id.sell_product_title_label);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.sell_product_input_summary);
        this.A04 = AbstractC31176DnK.A0T(view, R.id.chevron_icon);
        this.A05 = AbstractC31176DnK.A0T(view, R.id.remove_icon);
        this.A0C = C18U.A06(C06090Tz.A05, userSession, 36317332922438738L);
    }
}
