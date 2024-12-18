package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Bwk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27061Bwk extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final C38383GuK A01;
    public final UserSession A02;
    public final JPm A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        Context A0L = AbstractC166997dE.A0L(viewGroup);
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        JPm jPm = this.A03;
        AbstractC25233BEq.A0w(2, userSession, interfaceC11380iw, jPm);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C25941Bdi(AbstractC25226BEj.A0R(LayoutInflater.from(A0L), viewGroup, R.layout.layout_product_pivots, false), interfaceC11380iw, userSession, jPm);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int dimensionPixelSize;
        C29160CtR c29160CtR = (C29160CtR) interfaceC66482zP;
        C25941Bdi c25941Bdi = (C25941Bdi) c3oo;
        AbstractC167017dG.A1N(c29160CtR, c25941Bdi);
        C38383GuK c38383GuK = this.A01;
        boolean A1U = AbstractC167007dF.A1U(c38383GuK);
        View view = c25941Bdi.itemView;
        C14360o3.A06(view);
        C32072E6y c32072E6y = c29160CtR.A00;
        if (c32072E6y.A07) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        }
        view.setPadding(A1U ? 1 : 0, A1U ? 1 : 0, A1U ? 1 : 0, dimensionPixelSize);
        InterfaceC16660sJ interfaceC16660sJ = c29160CtR.A01.A01;
        View view2 = c25941Bdi.itemView;
        C14360o3.A06(view2);
        interfaceC16660sJ.invoke(view2);
        c38383GuK.A00(c25941Bdi.A03, c29160CtR.A02);
        TextView textView = c25941Bdi.A02;
        Resources resources = textView.getResources();
        boolean z = c32072E6y.A08;
        int i = R.dimen.abc_text_size_menu_header_material;
        if (z) {
            i = R.dimen.account_group_management_row_text_size;
        }
        textView.setTextSize(A1U ? 1 : 0, resources.getDimensionPixelSize(i));
        C69749Vuj c69749Vuj = (C69749Vuj) c32072E6y.A04;
        if (c69749Vuj != null) {
            textView.setText(VSL.A00(resources, c69749Vuj));
        }
        String str = c32072E6y.A06;
        if (str != null) {
            textView.setText(str);
        }
        if (c69749Vuj == null && str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(A1U ? 1 : 0);
        }
        C69749Vuj c69749Vuj2 = (C69749Vuj) c32072E6y.A02;
        TextView textView2 = c25941Bdi.A01;
        if (c69749Vuj2 != null) {
            Resources resources2 = textView2.getResources();
            int i2 = R.dimen.abc_text_size_menu_header_material;
            if (z) {
                i2 = R.dimen.account_group_management_row_text_size;
            }
            textView2.setTextSize(A1U ? 1 : 0, resources2.getDimensionPixelSize(i2));
            String str2 = c32072E6y.A05;
            if (str2 == null) {
                str2 = VSL.A00(resources2, c69749Vuj2);
            }
            textView2.setText(str2);
            ViewOnClickListenerC28666ClE.A01(textView2, 41, c29160CtR);
            textView2.setVisibility(A1U ? 1 : 0);
        } else {
            textView2.setVisibility(8);
        }
        Number number = (Number) c32072E6y.A01;
        if (number != null) {
            int intValue = number.intValue();
            View view3 = c25941Bdi.A00;
            view3.setBackgroundResource(AbstractC53242c7.A0H(view3.getContext(), intValue));
        }
        C66362zD c66362zD = c25941Bdi.A04;
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01((List) c32072E6y.A03);
        c66362zD.A05(viewModelListUpdate);
        c66362zD.notifyDataSetChanged();
    }

    public C27061Bwk(InterfaceC11380iw interfaceC11380iw, C38383GuK c38383GuK, UserSession userSession, JPm jPm) {
        AbstractC167017dG.A1Q(userSession, jPm);
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = jPm;
        this.A01 = c38383GuK;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C29160CtR.class;
    }
}
