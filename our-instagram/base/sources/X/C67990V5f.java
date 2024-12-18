package X;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.V5f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67990V5f extends AbstractC66422zJ {
    public final InterfaceC71920XAe A00;
    public final InterfaceC71920XAe A01;
    public final XAq A02;

    public C67990V5f(InterfaceC71920XAe interfaceC71920XAe, XAq xAq) {
        C14360o3.A0B(interfaceC71920XAe, 1);
        this.A01 = interfaceC71920XAe;
        this.A02 = xAq;
        this.A00 = new C70884Wjd(this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        NUS nus = (NUS) interfaceC66482zP;
        boolean A1a = AbstractC167017dG.A1a(nus, c3oo);
        View view = c3oo.itemView;
        C14360o3.A06(view);
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.discovery.inform.ui.InformMessageBodylessFooterViewBinder.Holder");
        C68975VfD c68975VfD = (C68975VfD) tag;
        C38657Gyy c38657Gyy = nus.A00;
        InterfaceC71920XAe interfaceC71920XAe = this.A00;
        XAq xAq = this.A02;
        AbstractC167007dF.A1E(c68975VfD, A1a ? 1 : 0, interfaceC71920XAe);
        Em0 em0 = new Em0(c38657Gyy, interfaceC71920XAe, AbstractC167007dF.A09(view.getContext(), R.attr.igds_color_link));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(c38657Gyy.A04);
        String str = c38657Gyy.A03;
        if (str != null) {
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append((CharSequence) str);
            AnonymousClass773.A05(spannableStringBuilder, em0, str);
        }
        AbstractC31176DnK.A1G(c68975VfD.A00, spannableStringBuilder);
        if (xAq != null) {
            xAq.ECz(view, c38657Gyy);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUS.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.inform_footer, false);
        A0C.setTag(new C68975VfD(viewGroup, A0C));
        C3OO c3oo = new C3OO(A0C);
        if (A0C.getTag() instanceof C68975VfD) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }
}
