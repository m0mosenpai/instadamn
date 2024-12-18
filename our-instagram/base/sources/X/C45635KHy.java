package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KHy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45635KHy extends AbstractC66412zI {
    public C7VT A00;
    public final AnonymousClass988 A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44696Jqf(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_shhmode_thread_title, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ViewOnClickListenerC48062LPn viewOnClickListenerC48062LPn;
        C161417Lc c161417Lc = (C161417Lc) interfaceC66482zP;
        C44696Jqf c44696Jqf = (C44696Jqf) c3oo;
        AbstractC167017dG.A1N(c161417Lc, c44696Jqf);
        AbstractC13880nE.A0d(AbstractC31171DnF.A06(c44696Jqf), AbstractC166987dD.A0C(AbstractC37301Gc2.A03(c44696Jqf), 12));
        c44696Jqf.A01.setText(c161417Lc.A05);
        TextView textView = c44696Jqf.A00;
        textView.setText(c161417Lc.A04);
        textView.setTextColor(c161417Lc.A01);
        View A06 = AbstractC31171DnF.A06(c44696Jqf);
        int i = c161417Lc.A00;
        AbstractC13880nE.A0i(A06, i, i);
        if (c161417Lc.A06) {
            viewOnClickListenerC48062LPn = new ViewOnClickListenerC48062LPn(this, 44);
        } else {
            viewOnClickListenerC48062LPn = null;
        }
        C0fQ.A00(viewOnClickListenerC48062LPn, textView);
        c44696Jqf.A02.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C161417Lc.class;
    }

    public C45635KHy(C7VT c7vt, AnonymousClass988 anonymousClass988) {
        this.A00 = c7vt;
        this.A01 = anonymousClass988;
    }
}
