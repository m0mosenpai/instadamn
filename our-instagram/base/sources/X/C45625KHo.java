package X;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.KHo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45625KHo extends AbstractC66412zI {
    public final InterfaceC58285Psd A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44702Jql(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_no_gallery_permission, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String A0p;
        CharSequence A0p2;
        String A0p3;
        int i;
        C52513NLg c52513NLg = (C52513NLg) interfaceC66482zP;
        C44702Jql c44702Jql = (C44702Jql) c3oo;
        if (c52513NLg != null && !c52513NLg.A00) {
            if (c44702Jql != null) {
                A0p = AbstractC166997dE.A0p(AbstractC31172DnG.A05(c44702Jql), 2131963055);
                A0p2 = Html.fromHtml(AbstractC25228BEl.A0M(c44702Jql.itemView).getString(2131963052));
                C14360o3.A07(A0p2);
                A0p3 = AbstractC166997dE.A0p(AbstractC31172DnG.A05(c44702Jql), 2131956794);
                i = 48;
            } else {
                return;
            }
        } else {
            if (c44702Jql == null) {
                return;
            }
            A0p = AbstractC166997dE.A0p(AbstractC31172DnG.A05(c44702Jql), 2131963054);
            A0p2 = AbstractC166997dE.A0p(AbstractC31172DnG.A05(c44702Jql), 2131963053);
            A0p3 = AbstractC166997dE.A0p(AbstractC31172DnG.A05(c44702Jql), 2131963062);
            i = 49;
        }
        C50261MHq c50261MHq = new C50261MHq(this, i);
        c44702Jql.A01.setText(A0p);
        c44702Jql.A00.setText(A0p2);
        IgdsButton igdsButton = c44702Jql.A02;
        igdsButton.setText(A0p3);
        ViewOnClickListenerC48074LPz.A01(igdsButton, 46, c50261MHq);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52513NLg.class;
    }

    public C45625KHo(InterfaceC58285Psd interfaceC58285Psd) {
        this.A00 = interfaceC58285Psd;
    }
}
