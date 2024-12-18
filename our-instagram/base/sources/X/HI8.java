package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes7.dex */
public final class HI8 extends AbstractC66412zI {
    public final C41741IeF A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C38442GvP(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.product_feed_see_more_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C25531Mh c25531Mh;
        InterfaceC02530Ab interfaceC02530Ab;
        String str;
        EnumC39650Hif enumC39650Hif;
        H7A h7a = (H7A) interfaceC66482zP;
        C38442GvP c38442GvP = (C38442GvP) c3oo;
        AbstractC167017dG.A1N(h7a, c38442GvP);
        IgTextView igTextView = c38442GvP.A01;
        Resources resources = igTextView.getResources();
        C14360o3.A07(resources);
        igTextView.setText(VSL.A00(resources, h7a.A00));
        ViewOnClickListenerC42033Ik2.A00(c38442GvP.A00, 22, h7a);
        C41741IeF c41741IeF = this.A00;
        if (c41741IeF != null) {
            String str2 = h7a.A01;
            C14360o3.A0B(str2, 0);
            String str3 = c41741IeF.A02;
            if (C14360o3.A0K(str3, "instagram_shopping_mini_shop_storefront")) {
                c25531Mh = new C25531Mh(AbstractC166987dD.A0f(c41741IeF.A00, "commerce_storefront_impression"), 130);
                if (AbstractC25226BEj.A1Z(c25531Mh)) {
                    c25531Mh.A0M(EnumC39644HiZ.STOREFRONT, "referral_surface");
                    c25531Mh.A0R("shopping_session_id", c41741IeF.A03);
                    if (AbstractC001900j.A0a(str2, AbstractC37303Gc4.A0X("WISH_LIST"), false)) {
                        enumC39650Hif = EnumC39650Hif.A0B;
                    } else {
                        enumC39650Hif = EnumC39650Hif.A03;
                    }
                    c25531Mh.A0M(enumC39650Hif, "analytics_module");
                    c25531Mh.A0M(EnumC39649Hie.A03, "analytics_page");
                    interfaceC02530Ab = EnumC39651Hig.A0E;
                    str = "analytics_component";
                } else {
                    return;
                }
            } else {
                if (!C14360o3.A0K(str3, "instagram_shopping_home")) {
                    return;
                }
                c25531Mh = new C25531Mh(AbstractC166987dD.A0f(c41741IeF.A00, "commerce_tab_feed_impression"), 133);
                if (!AbstractC25226BEj.A1Z(c25531Mh)) {
                    return;
                }
                c25531Mh.A0M(EnumC39651Hig.A0E, "analytics_component");
                c25531Mh.A0M(EnumC39649Hie.A03, "analytics_page");
                c25531Mh.A0M(EnumC39644HiZ.TAB_FEED, "referral_surface");
                c25531Mh.A0R("shopping_session_id", c41741IeF.A03);
                if (AbstractC001900j.A0a(str2, AbstractC37303Gc4.A0X("WISH_LIST"), false)) {
                    interfaceC02530Ab = EnumC39650Hif.A0B;
                } else {
                    interfaceC02530Ab = EnumC39650Hif.A03;
                }
                str = "analytics_module";
            }
            c25531Mh.A0M(interfaceC02530Ab, str);
            c25531Mh.A0R("navigation_chain", AbstractC25225BEi.A14());
            c25531Mh.Cht();
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return H7A.class;
    }

    public HI8(C41741IeF c41741IeF) {
        this.A00 = c41741IeF;
    }
}
