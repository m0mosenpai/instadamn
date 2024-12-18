package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* loaded from: classes8.dex */
public final class KIH extends AbstractC66412zI {
    public final int A00;
    public final int A01 = 6;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C7OC A05;
    public final boolean A06;

    public KIH(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7OC c7oc, int i, boolean z) {
        this.A04 = userSession;
        this.A02 = context;
        this.A03 = interfaceC11380iw;
        this.A00 = i;
        this.A05 = c7oc;
        this.A06 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Object obj;
        C48302LZb c48302LZb = (C48302LZb) interfaceC66482zP;
        C44636Jpg c44636Jpg = (C44636Jpg) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c48302LZb, c44636Jpg);
        UserSession userSession = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        C153126ug c153126ug = c48302LZb.A01;
        float f = c48302LZb.A00;
        C7OC c7oc = this.A05;
        boolean z = this.A06;
        AbstractC25233BEq.A0v(A1a ? 1 : 0, userSession, interfaceC11380iw, c153126ug);
        C14360o3.A0B(c7oc, 5);
        View[] viewArr = c44636Jpg.A00;
        int length = viewArr.length;
        for (int i = 0; i < length; i++) {
            View view = viewArr[i];
            if (view != null) {
                obj = view.getTag();
            } else {
                obj = null;
            }
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.widget.emojigrid.EmojiGridRowItemViewBinder.Holder");
            C168757g9 c168757g9 = (C168757g9) obj;
            if (i < c153126ug.A01()) {
                AbstractC168777gB.A03(interfaceC11380iw, userSession, (C148336m3) c153126ug.A02(i), c7oc, c168757g9, f, !z);
            } else {
                AbstractC168777gB.A04(c168757g9);
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context context = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        C14360o3.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        AbstractC43592JPx.A1H(linearLayout, i, -2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, AbstractC167017dG.A0A(context));
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.container_height);
        C44636Jpg c44636Jpg = new C44636Jpg(linearLayout, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            IgFrameLayout A01 = AbstractC168777gB.A01(context, dimensionPixelSize2, AbstractC167007dF.A1Q(i3, i2 - 1));
            c44636Jpg.A00[i3] = A01;
            linearLayout.addView(A01);
        }
        return c44636Jpg;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48302LZb.class;
    }
}
