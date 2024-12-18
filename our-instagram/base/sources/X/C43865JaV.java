package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JaV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43865JaV extends AbstractC66422zJ {
    public final UserSession A00;
    public final C43835JZy A01;
    public final boolean A02;

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZH.class;
    }

    public C43865JaV(UserSession userSession, C43835JZy c43835JZy, boolean z) {
        this.A00 = userSession;
        this.A01 = c43835JZy;
        this.A02 = z;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        boolean A1Y = AbstractC43592JPx.A1Y(viewGroup);
        UserSession userSession = this.A00;
        if (this.A02) {
            i = this.A01.A0H;
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        C14360o3.A0B(userSession, 1);
        Context context = viewGroup.getContext();
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.gallery_info_panel, A1Y);
        C14360o3.A07(context);
        C14360o3.A0B(A0C, 1);
        C3OO c3oo = new C3OO(A0C);
        TextView A0N = AbstractC167007dF.A0N(A0C, R.id.text);
        AbstractC010103p.A07(A0N);
        AbstractC25227BEk.A11(A0N);
        String A01 = AbstractC47184KtJ.A00.A01(context, userSession);
        CharSequence A00 = LFH.A00(context, userSession, A01, AbstractC166997dE.A0p(context, 2131963088), C18U.A04(C06090Tz.A05, userSession, 36882653697278411L));
        if (A00 == null) {
            A00 = A01;
        }
        A0N.setText(A00);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(A0C);
            ViewGroup.LayoutParams layoutParams = A0C.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            int i4 = 0;
            if (marginLayoutParams != null) {
                i2 = marginLayoutParams.leftMargin;
            } else {
                i2 = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = A0C.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i3 = marginLayoutParams3.topMargin;
            } else {
                i3 = 0;
            }
            ViewGroup.LayoutParams layoutParams3 = A0C.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i4 = marginLayoutParams2.rightMargin;
            }
            A0G.setMargins(i2, i3, i4, intValue);
            A0C.setLayoutParams(A0G);
        }
        return c3oo;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
