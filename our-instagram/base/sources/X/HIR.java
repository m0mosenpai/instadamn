package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HIR extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final InterfaceC43453JHr A01;
    public final Integer A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42313Iob c42313Iob = (C42313Iob) interfaceC66482zP;
        C38469Gvq c38469Gvq = (C38469Gvq) c3oo;
        AbstractC167017dG.A1N(c42313Iob, c38469Gvq);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        InterfaceC43453JHr interfaceC43453JHr = this.A01;
        AbstractC167017dG.A1R(interfaceC11380iw, interfaceC43453JHr);
        User user = c42313Iob.A00;
        if (user.A03.Bhu() == null) {
            c38469Gvq.A03.A0B();
        } else {
            ImageUrl Bhu = user.A03.Bhu();
            if (Bhu != null) {
                c38469Gvq.A03.setUrl(Bhu, interfaceC11380iw);
            }
        }
        TextView textView = c38469Gvq.A01;
        textView.setText(AbstractC37300Gc1.A0U(user));
        TextView textView2 = c38469Gvq.A02;
        String str = c42313Iob.A01;
        textView2.setText(str);
        ImageView imageView = c38469Gvq.A00;
        boolean z = c42313Iob.A02;
        imageView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        View view = c38469Gvq.itemView;
        if (z) {
            ViewOnClickListenerC42034Ik3.A00(view, 51, interfaceC43453JHr, c42313Iob);
        } else {
            view.setClickable(false);
        }
        ViewOnClickListenerC42034Ik3.A00(c38469Gvq.A03, 52, interfaceC43453JHr, c42313Iob);
        ViewOnClickListenerC42034Ik3.A00(textView, 53, interfaceC43453JHr, c42313Iob);
        ViewOnClickListenerC42034Ik3.A00(textView2, 54, interfaceC43453JHr, c42313Iob);
        c38469Gvq.itemView.setContentDescription(AnonymousClass001.A0T(AbstractC37300Gc1.A0U(user), str, ' '));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42313Iob.class;
    }

    public HIR(InterfaceC11380iw interfaceC11380iw, InterfaceC43453JHr interfaceC43453JHr, Integer num) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC43453JHr;
        this.A02 = num;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        Integer num = this.A02;
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.shopping_cart_merchant_row, AbstractC167007dF.A1U(num));
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(viewGroup2, new C38469Gvq(viewGroup2, num)), "null cannot be cast to non-null type com.instagram.shopping.adapter.cart.common.MerchantRowViewBinder.Holder");
    }
}
