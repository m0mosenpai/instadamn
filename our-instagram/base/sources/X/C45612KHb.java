package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.KHb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45612KHb extends AbstractC66412zI {
    public final C45517KDi A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44674JqJ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.thread_capability_item, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Context context;
        int i;
        C45210Jzq c45210Jzq = (C45210Jzq) interfaceC66482zP;
        C44674JqJ c44674JqJ = (C44674JqJ) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c45210Jzq, c44674JqJ);
        IgTextView igTextView = c44674JqJ.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(c45210Jzq.A03);
        A1C.append(" - ");
        igTextView.setText(AbstractC166997dE.A0x(c45210Jzq.A02, A1C));
        Boolean bool = c45210Jzq.A01;
        if (AbstractC166997dE.A1Z(bool, A1R)) {
            context = igTextView.getContext();
            i = R.attr.igds_color_success;
        } else {
            boolean A1Z = AbstractC166997dE.A1Z(bool, false);
            context = igTextView.getContext();
            i = R.attr.igds_color_primary_background;
            if (A1Z) {
                i = R.attr.igds_color_error_or_destructive;
            }
        }
        AbstractC31172DnG.A1B(context, igTextView, AbstractC53242c7.A0H(context, i));
        LQ1.A00(igTextView, 38, c44674JqJ, c45210Jzq);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45210Jzq.class;
    }

    public C45612KHb(C45517KDi c45517KDi) {
        this.A00 = c45517KDi;
    }
}
